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

import io.kubernetes.client.fluent.BaseFluent;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1VolumeMountFluentImpl<A extends V1VolumeMountFluent<A>> extends BaseFluent<A>
    implements V1VolumeMountFluent<A> {
  public V1VolumeMountFluentImpl() {}

  public V1VolumeMountFluentImpl(io.kubernetes.client.openapi.models.V1VolumeMount instance) {
    this.withMountPath(instance.getMountPath());

    this.withMountPropagation(instance.getMountPropagation());

    this.withName(instance.getName());

    this.withReadOnly(instance.getReadOnly());

    this.withSubPath(instance.getSubPath());

    this.withSubPathExpr(instance.getSubPathExpr());
  }

  private String mountPath;
  private java.lang.String mountPropagation;
  private java.lang.String name;
  private Boolean readOnly;
  private java.lang.String subPath;
  private java.lang.String subPathExpr;

  public java.lang.String getMountPath() {
    return this.mountPath;
  }

  public A withMountPath(java.lang.String mountPath) {
    this.mountPath = mountPath;
    return (A) this;
  }

  public java.lang.Boolean hasMountPath() {
    return this.mountPath != null;
  }

  public java.lang.String getMountPropagation() {
    return this.mountPropagation;
  }

  public A withMountPropagation(java.lang.String mountPropagation) {
    this.mountPropagation = mountPropagation;
    return (A) this;
  }

  public java.lang.Boolean hasMountPropagation() {
    return this.mountPropagation != null;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  public java.lang.Boolean getReadOnly() {
    return this.readOnly;
  }

  public A withReadOnly(java.lang.Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }

  public java.lang.Boolean hasReadOnly() {
    return this.readOnly != null;
  }

  public java.lang.String getSubPath() {
    return this.subPath;
  }

  public A withSubPath(java.lang.String subPath) {
    this.subPath = subPath;
    return (A) this;
  }

  public java.lang.Boolean hasSubPath() {
    return this.subPath != null;
  }

  public java.lang.String getSubPathExpr() {
    return this.subPathExpr;
  }

  public A withSubPathExpr(java.lang.String subPathExpr) {
    this.subPathExpr = subPathExpr;
    return (A) this;
  }

  public java.lang.Boolean hasSubPathExpr() {
    return this.subPathExpr != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeMountFluentImpl that = (V1VolumeMountFluentImpl) o;
    if (mountPath != null ? !mountPath.equals(that.mountPath) : that.mountPath != null)
      return false;
    if (mountPropagation != null
        ? !mountPropagation.equals(that.mountPropagation)
        : that.mountPropagation != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (subPath != null ? !subPath.equals(that.subPath) : that.subPath != null) return false;
    if (subPathExpr != null ? !subPathExpr.equals(that.subPathExpr) : that.subPathExpr != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        mountPath, mountPropagation, name, readOnly, subPath, subPathExpr, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (mountPath != null) {
      sb.append("mountPath:");
      sb.append(mountPath + ",");
    }
    if (mountPropagation != null) {
      sb.append("mountPropagation:");
      sb.append(mountPropagation + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (readOnly != null) {
      sb.append("readOnly:");
      sb.append(readOnly + ",");
    }
    if (subPath != null) {
      sb.append("subPath:");
      sb.append(subPath + ",");
    }
    if (subPathExpr != null) {
      sb.append("subPathExpr:");
      sb.append(subPathExpr);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReadOnly() {
    return withReadOnly(true);
  }
}
