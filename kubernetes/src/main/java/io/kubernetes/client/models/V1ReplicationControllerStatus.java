/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V1ReplicationControllerCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ReplicationControllerStatus represents the current status of a replication controller.
 */
@ApiModel(description = "ReplicationControllerStatus represents the current status of a replication controller.")

public class V1ReplicationControllerStatus {
  @SerializedName("availableReplicas")
  private Integer availableReplicas = null;

  @SerializedName("conditions")
  private List<V1ReplicationControllerCondition> conditions = new ArrayList<V1ReplicationControllerCondition>();

  @SerializedName("fullyLabeledReplicas")
  private Integer fullyLabeledReplicas = null;

  @SerializedName("observedGeneration")
  private Long observedGeneration = null;

  @SerializedName("readyReplicas")
  private Integer readyReplicas = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  public V1ReplicationControllerStatus availableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * The number of available replicas (ready for at least minReadySeconds) for this replication controller.
   * @return availableReplicas
  **/
  @ApiModelProperty(example = "null", value = "The number of available replicas (ready for at least minReadySeconds) for this replication controller.")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }

  public V1ReplicationControllerStatus conditions(List<V1ReplicationControllerCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1ReplicationControllerStatus addConditionsItem(V1ReplicationControllerCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Represents the latest available observations of a replication controller's current state.
   * @return conditions
  **/
  @ApiModelProperty(example = "null", value = "Represents the latest available observations of a replication controller's current state.")
  public List<V1ReplicationControllerCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1ReplicationControllerCondition> conditions) {
    this.conditions = conditions;
  }

  public V1ReplicationControllerStatus fullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
    return this;
  }

   /**
   * The number of pods that have labels matching the labels of the pod template of the replication controller.
   * @return fullyLabeledReplicas
  **/
  @ApiModelProperty(example = "null", value = "The number of pods that have labels matching the labels of the pod template of the replication controller.")
  public Integer getFullyLabeledReplicas() {
    return fullyLabeledReplicas;
  }

  public void setFullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
  }

  public V1ReplicationControllerStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * ObservedGeneration reflects the generation of the most recently observed replication controller.
   * @return observedGeneration
  **/
  @ApiModelProperty(example = "null", value = "ObservedGeneration reflects the generation of the most recently observed replication controller.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public V1ReplicationControllerStatus readyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

   /**
   * The number of ready replicas for this replication controller.
   * @return readyReplicas
  **/
  @ApiModelProperty(example = "null", value = "The number of ready replicas for this replication controller.")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }

  public V1ReplicationControllerStatus replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the most recently oberved number of replicas. More info: http://kubernetes.io/docs/user-guide/replication-controller#what-is-a-replication-controller
   * @return replicas
  **/
  @ApiModelProperty(example = "null", required = true, value = "Replicas is the most recently oberved number of replicas. More info: http://kubernetes.io/docs/user-guide/replication-controller#what-is-a-replication-controller")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ReplicationControllerStatus v1ReplicationControllerStatus = (V1ReplicationControllerStatus) o;
    return Objects.equals(this.availableReplicas, v1ReplicationControllerStatus.availableReplicas) &&
        Objects.equals(this.conditions, v1ReplicationControllerStatus.conditions) &&
        Objects.equals(this.fullyLabeledReplicas, v1ReplicationControllerStatus.fullyLabeledReplicas) &&
        Objects.equals(this.observedGeneration, v1ReplicationControllerStatus.observedGeneration) &&
        Objects.equals(this.readyReplicas, v1ReplicationControllerStatus.readyReplicas) &&
        Objects.equals(this.replicas, v1ReplicationControllerStatus.replicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, conditions, fullyLabeledReplicas, observedGeneration, readyReplicas, replicas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ReplicationControllerStatus {\n");
    
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    fullyLabeledReplicas: ").append(toIndentedString(fullyLabeledReplicas)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
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

