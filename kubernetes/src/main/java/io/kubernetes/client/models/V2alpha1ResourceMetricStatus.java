/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \&quot;pods\&quot; source.
 */
@ApiModel(description = "ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.")

public class V2alpha1ResourceMetricStatus {
  @SerializedName("currentAverageUtilization")
  private Integer currentAverageUtilization = null;

  @SerializedName("currentAverageValue")
  private String currentAverageValue = null;

  @SerializedName("name")
  private String name = null;

  public V2alpha1ResourceMetricStatus currentAverageUtilization(Integer currentAverageUtilization) {
    this.currentAverageUtilization = currentAverageUtilization;
    return this;
  }

   /**
   * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.  It will only be present if `targetAverageValue` was set in the corresponding metric specification.
   * @return currentAverageUtilization
  **/
  @ApiModelProperty(example = "null", value = "currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.  It will only be present if `targetAverageValue` was set in the corresponding metric specification.")
  public Integer getCurrentAverageUtilization() {
    return currentAverageUtilization;
  }

  public void setCurrentAverageUtilization(Integer currentAverageUtilization) {
    this.currentAverageUtilization = currentAverageUtilization;
  }

  public V2alpha1ResourceMetricStatus currentAverageValue(String currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
    return this;
  }

   /**
   * currentAverageValue is the the current value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the \"pods\" metric source type. It will always be set, regardless of the corresponding metric specification.
   * @return currentAverageValue
  **/
  @ApiModelProperty(example = "null", required = true, value = "currentAverageValue is the the current value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the \"pods\" metric source type. It will always be set, regardless of the corresponding metric specification.")
  public String getCurrentAverageValue() {
    return currentAverageValue;
  }

  public void setCurrentAverageValue(String currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
  }

  public V2alpha1ResourceMetricStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name is the name of the resource in question.
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "name is the name of the resource in question.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2alpha1ResourceMetricStatus v2alpha1ResourceMetricStatus = (V2alpha1ResourceMetricStatus) o;
    return Objects.equals(this.currentAverageUtilization, v2alpha1ResourceMetricStatus.currentAverageUtilization) &&
        Objects.equals(this.currentAverageValue, v2alpha1ResourceMetricStatus.currentAverageValue) &&
        Objects.equals(this.name, v2alpha1ResourceMetricStatus.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAverageUtilization, currentAverageValue, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2alpha1ResourceMetricStatus {\n");
    
    sb.append("    currentAverageUtilization: ").append(toIndentedString(currentAverageUtilization)).append("\n");
    sb.append("    currentAverageValue: ").append(toIndentedString(currentAverageValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

