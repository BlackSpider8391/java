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

public class V1beta1EndpointSliceBuilder
    extends V1beta1EndpointSliceFluentImpl<V1beta1EndpointSliceBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1EndpointSlice,
        io.kubernetes.client.openapi.models.V1beta1EndpointSliceBuilder> {
  public V1beta1EndpointSliceBuilder() {
    this(false);
  }

  public V1beta1EndpointSliceBuilder(Boolean validationEnabled) {
    this(new V1beta1EndpointSlice(), validationEnabled);
  }

  public V1beta1EndpointSliceBuilder(V1beta1EndpointSliceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1EndpointSliceBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1EndpointSlice(), validationEnabled);
  }

  public V1beta1EndpointSliceBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1EndpointSlice instance) {
    this(fluent, instance, false);
  }

  public V1beta1EndpointSliceBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1EndpointSlice instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAddressType(instance.getAddressType());

    fluent.withApiVersion(instance.getApiVersion());

    fluent.withEndpoints(instance.getEndpoints());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1EndpointSliceBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointSlice instance) {
    this(instance, false);
  }

  public V1beta1EndpointSliceBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointSlice instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAddressType(instance.getAddressType());

    this.withApiVersion(instance.getApiVersion());

    this.withEndpoints(instance.getEndpoints());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1EndpointSlice build() {
    V1beta1EndpointSlice buildable = new V1beta1EndpointSlice();
    buildable.setAddressType(fluent.getAddressType());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setEndpoints(fluent.getEndpoints());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setPorts(fluent.getPorts());
    return buildable;
  }
}
