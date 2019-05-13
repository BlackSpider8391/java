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
import io.kubernetes.client.models.V1LabelSelector;
import io.kubernetes.client.models.V1PodTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ReplicaSetSpec is the specification of a ReplicaSet.
 */
@ApiModel(description = "ReplicaSetSpec is the specification of a ReplicaSet.")

public class V1ReplicaSetSpec {
  @SerializedName("minReadySeconds")
  private Integer minReadySeconds = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("selector")
  private V1LabelSelector selector = null;

  @SerializedName("template")
  private V1PodTemplateSpec template = null;

  public V1ReplicaSetSpec minReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

   /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   * @return minReadySeconds
  **/
  @ApiModelProperty(value = "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }

  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }

  public V1ReplicaSetSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
   * @return replicas
  **/
  @ApiModelProperty(value = "Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public V1ReplicaSetSpec selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Selector is a label query over pods that should match the replica count. Label keys and values that must match in order to be controlled by this replica set. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
   * @return selector
  **/
  @ApiModelProperty(required = true, value = "Selector is a label query over pods that should match the replica count. Label keys and values that must match in order to be controlled by this replica set. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public V1ReplicaSetSpec template(V1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

   /**
   * Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
   * @return template
  **/
  @ApiModelProperty(value = "Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ReplicaSetSpec v1ReplicaSetSpec = (V1ReplicaSetSpec) o;
    return Objects.equals(this.minReadySeconds, v1ReplicaSetSpec.minReadySeconds) &&
        Objects.equals(this.replicas, v1ReplicaSetSpec.replicas) &&
        Objects.equals(this.selector, v1ReplicaSetSpec.selector) &&
        Objects.equals(this.template, v1ReplicaSetSpec.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minReadySeconds, replicas, selector, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ReplicaSetSpec {\n");
    
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

