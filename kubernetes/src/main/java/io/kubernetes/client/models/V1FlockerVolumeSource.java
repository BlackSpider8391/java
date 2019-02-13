/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.13.5
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

/**
 * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
 */
@ApiModel(description = "Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.")

public class V1FlockerVolumeSource {
  @SerializedName("datasetName")
  private String datasetName = null;

  @SerializedName("datasetUUID")
  private String datasetUUID = null;

  public V1FlockerVolumeSource datasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

   /**
   * Name of the dataset stored as metadata -&gt; name on the dataset for Flocker should be considered as deprecated
   * @return datasetName
  **/
  @ApiModelProperty(value = "Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated")
  public String getDatasetName() {
    return datasetName;
  }

  public void setDatasetName(String datasetName) {
    this.datasetName = datasetName;
  }

  public V1FlockerVolumeSource datasetUUID(String datasetUUID) {
    this.datasetUUID = datasetUUID;
    return this;
  }

   /**
   * UUID of the dataset. This is unique identifier of a Flocker dataset
   * @return datasetUUID
  **/
  @ApiModelProperty(value = "UUID of the dataset. This is unique identifier of a Flocker dataset")
  public String getDatasetUUID() {
    return datasetUUID;
  }

  public void setDatasetUUID(String datasetUUID) {
    this.datasetUUID = datasetUUID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1FlockerVolumeSource v1FlockerVolumeSource = (V1FlockerVolumeSource) o;
    return Objects.equals(this.datasetName, v1FlockerVolumeSource.datasetName) &&
        Objects.equals(this.datasetUUID, v1FlockerVolumeSource.datasetUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetName, datasetUUID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FlockerVolumeSource {\n");
    
    sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
    sb.append("    datasetUUID: ").append(toIndentedString(datasetUUID)).append("\n");
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

