/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1JobTemplateSpecBuilder extends V1JobTemplateSpecFluentImpl<V1JobTemplateSpecBuilder>
    implements VisitableBuilder<
        V1JobTemplateSpec, io.kubernetes.client.openapi.models.V1JobTemplateSpecBuilder> {
  public V1JobTemplateSpecBuilder() {
    this(false);
  }

  public V1JobTemplateSpecBuilder(Boolean validationEnabled) {
    this(new V1JobTemplateSpec(), validationEnabled);
  }

  public V1JobTemplateSpecBuilder(V1JobTemplateSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1JobTemplateSpecBuilder(
      io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1JobTemplateSpec(), validationEnabled);
  }

  public V1JobTemplateSpecBuilder(
      io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1JobTemplateSpec instance) {
    this(fluent, instance, false);
  }

  public V1JobTemplateSpecBuilder(
      io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1JobTemplateSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  public V1JobTemplateSpecBuilder(io.kubernetes.client.openapi.models.V1JobTemplateSpec instance) {
    this(instance, false);
  }

  public V1JobTemplateSpecBuilder(
      io.kubernetes.client.openapi.models.V1JobTemplateSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1JobTemplateSpec build() {
    V1JobTemplateSpec buildable = new V1JobTemplateSpec();
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
}
