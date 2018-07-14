/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.11.1
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
import io.kubernetes.client.models.V1LabelSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
 */
@ApiModel(description = "ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.")

public class V2beta1ExternalMetricStatus {
  @SerializedName("currentAverageValue")
  private String currentAverageValue = null;

  @SerializedName("currentValue")
  private String currentValue = null;

  @SerializedName("metricName")
  private String metricName = null;

  @SerializedName("metricSelector")
  private V1LabelSelector metricSelector = null;

  public V2beta1ExternalMetricStatus currentAverageValue(String currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
    return this;
  }

   /**
   * currentAverageValue is the current value of metric averaged over autoscaled pods.
   * @return currentAverageValue
  **/
  @ApiModelProperty(value = "currentAverageValue is the current value of metric averaged over autoscaled pods.")
  public String getCurrentAverageValue() {
    return currentAverageValue;
  }

  public void setCurrentAverageValue(String currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
  }

  public V2beta1ExternalMetricStatus currentValue(String currentValue) {
    this.currentValue = currentValue;
    return this;
  }

   /**
   * currentValue is the current value of the metric (as a quantity)
   * @return currentValue
  **/
  @ApiModelProperty(required = true, value = "currentValue is the current value of the metric (as a quantity)")
  public String getCurrentValue() {
    return currentValue;
  }

  public void setCurrentValue(String currentValue) {
    this.currentValue = currentValue;
  }

  public V2beta1ExternalMetricStatus metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

   /**
   * metricName is the name of a metric used for autoscaling in metric system.
   * @return metricName
  **/
  @ApiModelProperty(required = true, value = "metricName is the name of a metric used for autoscaling in metric system.")
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public V2beta1ExternalMetricStatus metricSelector(V1LabelSelector metricSelector) {
    this.metricSelector = metricSelector;
    return this;
  }

   /**
   * metricSelector is used to identify a specific time series within a given metric.
   * @return metricSelector
  **/
  @ApiModelProperty(value = "metricSelector is used to identify a specific time series within a given metric.")
  public V1LabelSelector getMetricSelector() {
    return metricSelector;
  }

  public void setMetricSelector(V1LabelSelector metricSelector) {
    this.metricSelector = metricSelector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta1ExternalMetricStatus v2beta1ExternalMetricStatus = (V2beta1ExternalMetricStatus) o;
    return Objects.equals(this.currentAverageValue, v2beta1ExternalMetricStatus.currentAverageValue) &&
        Objects.equals(this.currentValue, v2beta1ExternalMetricStatus.currentValue) &&
        Objects.equals(this.metricName, v2beta1ExternalMetricStatus.metricName) &&
        Objects.equals(this.metricSelector, v2beta1ExternalMetricStatus.metricSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAverageValue, currentValue, metricName, metricSelector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1ExternalMetricStatus {\n");
    
    sb.append("    currentAverageValue: ").append(toIndentedString(currentAverageValue)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    metricSelector: ").append(toIndentedString(metricSelector)).append("\n");
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

