/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.4
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
import io.kubernetes.client.models.V1JobCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * JobStatus represents the current state of a Job.
 */
@ApiModel(description = "JobStatus represents the current state of a Job.")

public class V1JobStatus {
  @SerializedName("active")
  private Integer active = null;

  @SerializedName("completionTime")
  private DateTime completionTime = null;

  @SerializedName("conditions")
  private List<V1JobCondition> conditions = null;

  @SerializedName("failed")
  private Integer failed = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("succeeded")
  private Integer succeeded = null;

  public V1JobStatus active(Integer active) {
    this.active = active;
    return this;
  }

   /**
   * The number of actively running pods.
   * @return active
  **/
  @ApiModelProperty(value = "The number of actively running pods.")
  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }

  public V1JobStatus completionTime(DateTime completionTime) {
    this.completionTime = completionTime;
    return this;
  }

   /**
   * Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
   * @return completionTime
  **/
  @ApiModelProperty(value = "Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
  public DateTime getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(DateTime completionTime) {
    this.completionTime = completionTime;
  }

  public V1JobStatus conditions(List<V1JobCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1JobStatus addConditionsItem(V1JobCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1JobCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The latest available observations of an object&#39;s current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   * @return conditions
  **/
  @ApiModelProperty(value = "The latest available observations of an object's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
  public List<V1JobCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1JobCondition> conditions) {
    this.conditions = conditions;
  }

  public V1JobStatus failed(Integer failed) {
    this.failed = failed;
    return this;
  }

   /**
   * The number of pods which reached phase Failed.
   * @return failed
  **/
  @ApiModelProperty(value = "The number of pods which reached phase Failed.")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public V1JobStatus startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
   * @return startTime
  **/
  @ApiModelProperty(value = "Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public V1JobStatus succeeded(Integer succeeded) {
    this.succeeded = succeeded;
    return this;
  }

   /**
   * The number of pods which reached phase Succeeded.
   * @return succeeded
  **/
  @ApiModelProperty(value = "The number of pods which reached phase Succeeded.")
  public Integer getSucceeded() {
    return succeeded;
  }

  public void setSucceeded(Integer succeeded) {
    this.succeeded = succeeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1JobStatus v1JobStatus = (V1JobStatus) o;
    return Objects.equals(this.active, v1JobStatus.active) &&
        Objects.equals(this.completionTime, v1JobStatus.completionTime) &&
        Objects.equals(this.conditions, v1JobStatus.conditions) &&
        Objects.equals(this.failed, v1JobStatus.failed) &&
        Objects.equals(this.startTime, v1JobStatus.startTime) &&
        Objects.equals(this.succeeded, v1JobStatus.succeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, completionTime, conditions, failed, startTime, succeeded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1JobStatus {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
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

