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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
public interface V1DownwardAPIVolumeFileFluent<A extends V1DownwardAPIVolumeFileFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildFieldRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectFieldSelector getFieldRef();

  public io.kubernetes.client.openapi.models.V1ObjectFieldSelector buildFieldRef();

  public A withFieldRef(io.kubernetes.client.openapi.models.V1ObjectFieldSelector fieldRef);

  public Boolean hasFieldRef();

  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> withNewFieldRef();

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<A>
      withNewFieldRefLike(io.kubernetes.client.openapi.models.V1ObjectFieldSelector item);

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<A>
      editFieldRef();

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<A>
      editOrNewFieldRef();

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<A>
      editOrNewFieldRefLike(io.kubernetes.client.openapi.models.V1ObjectFieldSelector item);

  public Integer getMode();

  public A withMode(java.lang.Integer mode);

  public java.lang.Boolean hasMode();

  public String getPath();

  public A withPath(java.lang.String path);

  public java.lang.Boolean hasPath();

  /**
   * This method has been deprecated, please use method buildResourceFieldRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ResourceFieldSelector getResourceFieldRef();

  public io.kubernetes.client.openapi.models.V1ResourceFieldSelector buildResourceFieldRef();

  public A withResourceFieldRef(
      io.kubernetes.client.openapi.models.V1ResourceFieldSelector resourceFieldRef);

  public java.lang.Boolean hasResourceFieldRef();

  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> withNewResourceFieldRef();

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A>
      withNewResourceFieldRefLike(io.kubernetes.client.openapi.models.V1ResourceFieldSelector item);

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A>
      editResourceFieldRef();

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A>
      editOrNewResourceFieldRef();

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A>
      editOrNewResourceFieldRefLike(
          io.kubernetes.client.openapi.models.V1ResourceFieldSelector item);

  public interface FieldRefNested<N>
      extends Nested<N>,
          V1ObjectFieldSelectorFluent<V1DownwardAPIVolumeFileFluent.FieldRefNested<N>> {
    public N and();

    public N endFieldRef();
  }

  public interface ResourceFieldRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ResourceFieldSelectorFluent<V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<N>> {
    public N and();

    public N endResourceFieldRef();
  }
}
