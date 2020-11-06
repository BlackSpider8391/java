/*
Copyright 2020 The Kubernetes Authors.
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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** V1beta1SelfSubjectRulesReviewSpec */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-11-06T08:58:17.566Z[Etc/UTC]")
public class V1beta1SelfSubjectRulesReviewSpec {
  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";

  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public V1beta1SelfSubjectRulesReviewSpec namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace to evaluate rules for. Required.
   *
   * @return namespace
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Namespace to evaluate rules for. Required.")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1SelfSubjectRulesReviewSpec v1beta1SelfSubjectRulesReviewSpec =
        (V1beta1SelfSubjectRulesReviewSpec) o;
    return Objects.equals(this.namespace, v1beta1SelfSubjectRulesReviewSpec.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1SelfSubjectRulesReviewSpec {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
