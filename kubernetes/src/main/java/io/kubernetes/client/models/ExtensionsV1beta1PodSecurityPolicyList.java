/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.14.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.ExtensionsV1beta1PodSecurityPolicy;
import io.kubernetes.client.models.V1ListMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PodSecurityPolicyList is a list of PodSecurityPolicy objects. Deprecated: use PodSecurityPolicyList from policy API Group instead.
 */
@ApiModel(description = "PodSecurityPolicyList is a list of PodSecurityPolicy objects. Deprecated: use PodSecurityPolicyList from policy API Group instead.")

public class ExtensionsV1beta1PodSecurityPolicyList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<ExtensionsV1beta1PodSecurityPolicy> items = new ArrayList<ExtensionsV1beta1PodSecurityPolicy>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ListMeta metadata = null;

  public ExtensionsV1beta1PodSecurityPolicyList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ExtensionsV1beta1PodSecurityPolicyList items(List<ExtensionsV1beta1PodSecurityPolicy> items) {
    this.items = items;
    return this;
  }

  public ExtensionsV1beta1PodSecurityPolicyList addItemsItem(ExtensionsV1beta1PodSecurityPolicy itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * items is a list of schema objects.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "items is a list of schema objects.")
  public List<ExtensionsV1beta1PodSecurityPolicy> getItems() {
    return items;
  }

  public void setItems(List<ExtensionsV1beta1PodSecurityPolicy> items) {
    this.items = items;
  }

  public ExtensionsV1beta1PodSecurityPolicyList kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ExtensionsV1beta1PodSecurityPolicyList metadata(V1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata")
  public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionsV1beta1PodSecurityPolicyList extensionsV1beta1PodSecurityPolicyList = (ExtensionsV1beta1PodSecurityPolicyList) o;
    return Objects.equals(this.apiVersion, extensionsV1beta1PodSecurityPolicyList.apiVersion) &&
        Objects.equals(this.items, extensionsV1beta1PodSecurityPolicyList.items) &&
        Objects.equals(this.kind, extensionsV1beta1PodSecurityPolicyList.kind) &&
        Objects.equals(this.metadata, extensionsV1beta1PodSecurityPolicyList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionsV1beta1PodSecurityPolicyList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

