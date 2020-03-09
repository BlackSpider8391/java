package io.kubernetes.client.spring.extended.controller;

import static org.junit.Assert.assertNotNull;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.controller.reconciler.Result;
import io.kubernetes.client.informer.SharedInformer;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.spring.extended.controller.annotation.*;
import java.util.function.Supplier;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(KubernetesInformerCreatorTest.TestConfig.class)
public class KubernetesReconcilerCreatorTest {

  @Rule public WireMockRule wireMockRule = new WireMockRule(8189);

  @TestConfiguration
  static class TestConfig {

    @Bean
    public TestReconciler podReconciler() {
      return new TestReconciler();
    }
  }

  @KubernetesReconciler(
      value = "test-reconcile",
      watches =
          @KubernetesReconcilerWatches({@KubernetesReconcilerWatch(apiTypeClass = V1Pod.class)}))
  @KubernetesReconcilerReadyFuncs(TestReconciler.PodCacheReadyFunc.class)
  @KubernetesReconcilerWorkerCount(4)
  static class TestReconciler implements Reconciler {

    private int observedPodCount;

    @Autowired private SharedInformer<V1Pod> podInformer;

    @Autowired private Lister<V1Pod> podLister;

    @Override
    public Result reconcile(Request request) {
      observedPodCount = podLister.list().size();
      return new Result(false);
    }

    class PodCacheReadyFunc implements Supplier<Boolean> {
      @Override
      public Boolean get() {
        return podInformer.hasSynced();
      }
    }
  }

  @Autowired private Controller testController;

  @Test
  public void testSimplePodController() {
    assertNotNull(testController);
  }
}
