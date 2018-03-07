/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V2beta1CrossVersionObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 */
@ApiModel(description = "ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).")

public class V2beta1ObjectMetricSource {
  @SerializedName("metricName")
  private String metricName = null;

  @SerializedName("target")
  private V2beta1CrossVersionObjectReference target = null;

  @SerializedName("targetValue")
  private String targetValue = null;

  public V2beta1ObjectMetricSource metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

   /**
   * metricName is the name of the metric in question.
   * @return metricName
  **/
  @ApiModelProperty(required = true, value = "metricName is the name of the metric in question.")
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public V2beta1ObjectMetricSource target(V2beta1CrossVersionObjectReference target) {
    this.target = target;
    return this;
  }

   /**
   * target is the described Kubernetes object.
   * @return target
  **/
  @ApiModelProperty(required = true, value = "target is the described Kubernetes object.")
  public V2beta1CrossVersionObjectReference getTarget() {
    return target;
  }

  public void setTarget(V2beta1CrossVersionObjectReference target) {
    this.target = target;
  }

  public V2beta1ObjectMetricSource targetValue(String targetValue) {
    this.targetValue = targetValue;
    return this;
  }

   /**
   * targetValue is the target value of the metric (as a quantity).
   * @return targetValue
  **/
  @ApiModelProperty(required = true, value = "targetValue is the target value of the metric (as a quantity).")
  public String getTargetValue() {
    return targetValue;
  }

  public void setTargetValue(String targetValue) {
    this.targetValue = targetValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta1ObjectMetricSource v2beta1ObjectMetricSource = (V2beta1ObjectMetricSource) o;
    return Objects.equals(this.metricName, v2beta1ObjectMetricSource.metricName) &&
        Objects.equals(this.target, v2beta1ObjectMetricSource.target) &&
        Objects.equals(this.targetValue, v2beta1ObjectMetricSource.targetValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricName, target, targetValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1ObjectMetricSource {\n");
    
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
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

