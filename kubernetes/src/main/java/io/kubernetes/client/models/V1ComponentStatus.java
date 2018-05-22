/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.10.4
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
import io.kubernetes.client.models.V1ComponentCondition;
import io.kubernetes.client.models.V1ObjectMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ComponentStatus (and ComponentStatusList) holds the cluster validation info.
 */
@ApiModel(description = "ComponentStatus (and ComponentStatusList) holds the cluster validation info.")

public class V1ComponentStatus {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("conditions")
  private List<V1ComponentCondition> conditions = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  public V1ComponentStatus apiVersion(String apiVersion) {
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

  public V1ComponentStatus conditions(List<V1ComponentCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1ComponentStatus addConditionsItem(V1ComponentCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1ComponentCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * List of component conditions observed
   * @return conditions
  **/
  @ApiModelProperty(value = "List of component conditions observed")
  public List<V1ComponentCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1ComponentCondition> conditions) {
    this.conditions = conditions;
  }

  public V1ComponentStatus kind(String kind) {
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

  public V1ComponentStatus metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
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
    V1ComponentStatus v1ComponentStatus = (V1ComponentStatus) o;
    return Objects.equals(this.apiVersion, v1ComponentStatus.apiVersion) &&
        Objects.equals(this.conditions, v1ComponentStatus.conditions) &&
        Objects.equals(this.kind, v1ComponentStatus.kind) &&
        Objects.equals(this.metadata, v1ComponentStatus.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, conditions, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ComponentStatus {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

