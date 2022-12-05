package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta2HorizontalPodAutoscalerFluent<A extends V2beta2HorizontalPodAutoscalerFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public V2beta2HorizontalPodAutoscalerFluent.MetadataNested<A> withNewMetadata();
  public V2beta2HorizontalPodAutoscalerFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V2beta2HorizontalPodAutoscalerFluent.MetadataNested<A> editMetadata();
  public V2beta2HorizontalPodAutoscalerFluent.MetadataNested<A> editOrNewMetadata();
  public V2beta2HorizontalPodAutoscalerFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2HorizontalPodAutoscalerSpec getSpec();
  public V2beta2HorizontalPodAutoscalerSpec buildSpec();
  public A withSpec(V2beta2HorizontalPodAutoscalerSpec spec);
  public Boolean hasSpec();
  public V2beta2HorizontalPodAutoscalerFluent.SpecNested<A> withNewSpec();
  public V2beta2HorizontalPodAutoscalerFluent.SpecNested<A> withNewSpecLike(V2beta2HorizontalPodAutoscalerSpec item);
  public V2beta2HorizontalPodAutoscalerFluent.SpecNested<A> editSpec();
  public V2beta2HorizontalPodAutoscalerFluent.SpecNested<A> editOrNewSpec();
  public V2beta2HorizontalPodAutoscalerFluent.SpecNested<A> editOrNewSpecLike(V2beta2HorizontalPodAutoscalerSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2HorizontalPodAutoscalerStatus getStatus();
  public V2beta2HorizontalPodAutoscalerStatus buildStatus();
  public A withStatus(V2beta2HorizontalPodAutoscalerStatus status);
  public Boolean hasStatus();
  public V2beta2HorizontalPodAutoscalerFluent.StatusNested<A> withNewStatus();
  public V2beta2HorizontalPodAutoscalerFluent.StatusNested<A> withNewStatusLike(V2beta2HorizontalPodAutoscalerStatus item);
  public V2beta2HorizontalPodAutoscalerFluent.StatusNested<A> editStatus();
  public V2beta2HorizontalPodAutoscalerFluent.StatusNested<A> editOrNewStatus();
  public V2beta2HorizontalPodAutoscalerFluent.StatusNested<A> editOrNewStatusLike(V2beta2HorizontalPodAutoscalerStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V2beta2HorizontalPodAutoscalerFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V2beta2HorizontalPodAutoscalerSpecFluent<V2beta2HorizontalPodAutoscalerFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V2beta2HorizontalPodAutoscalerStatusFluent<V2beta2HorizontalPodAutoscalerFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}