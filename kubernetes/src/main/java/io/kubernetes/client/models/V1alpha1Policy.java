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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Policy defines the configuration of how audit events are logged
 */
@ApiModel(description = "Policy defines the configuration of how audit events are logged")

public class V1alpha1Policy {
  @SerializedName("level")
  private String level = null;

  @SerializedName("stages")
  private List<String> stages = null;

  public V1alpha1Policy level(String level) {
    this.level = level;
    return this;
  }

   /**
   * The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
   * @return level
  **/
  @ApiModelProperty(required = true, value = "The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public V1alpha1Policy stages(List<String> stages) {
    this.stages = stages;
    return this;
  }

  public V1alpha1Policy addStagesItem(String stagesItem) {
    if (this.stages == null) {
      this.stages = new ArrayList<String>();
    }
    this.stages.add(stagesItem);
    return this;
  }

   /**
   * Stages is a list of stages for which events are created.
   * @return stages
  **/
  @ApiModelProperty(value = "Stages is a list of stages for which events are created.")
  public List<String> getStages() {
    return stages;
  }

  public void setStages(List<String> stages) {
    this.stages = stages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1Policy v1alpha1Policy = (V1alpha1Policy) o;
    return Objects.equals(this.level, v1alpha1Policy.level) &&
        Objects.equals(this.stages, v1alpha1Policy.stages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, stages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Policy {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
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

