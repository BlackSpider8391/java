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
import io.kubernetes.client.models.V1ObjectFieldSelector;
import io.kubernetes.client.models.V1ResourceFieldSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DownwardAPIVolumeFile represents information to create the file containing the pod field
 */
@ApiModel(description = "DownwardAPIVolumeFile represents information to create the file containing the pod field")

public class V1DownwardAPIVolumeFile {
  @SerializedName("fieldRef")
  private V1ObjectFieldSelector fieldRef = null;

  @SerializedName("mode")
  private Integer mode = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("resourceFieldRef")
  private V1ResourceFieldSelector resourceFieldRef = null;

  public V1DownwardAPIVolumeFile fieldRef(V1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
   * @return fieldRef
  **/
  @ApiModelProperty(value = "Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.")
  public V1ObjectFieldSelector getFieldRef() {
    return fieldRef;
  }

  public void setFieldRef(V1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
  }

  public V1DownwardAPIVolumeFile mode(Integer mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return mode
  **/
  @ApiModelProperty(value = "Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  public V1DownwardAPIVolumeFile path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must not start with &#39;..&#39;
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1DownwardAPIVolumeFile resourceFieldRef(V1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

   /**
   * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
   * @return resourceFieldRef
  **/
  @ApiModelProperty(value = "Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.")
  public V1ResourceFieldSelector getResourceFieldRef() {
    return resourceFieldRef;
  }

  public void setResourceFieldRef(V1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DownwardAPIVolumeFile v1DownwardAPIVolumeFile = (V1DownwardAPIVolumeFile) o;
    return Objects.equals(this.fieldRef, v1DownwardAPIVolumeFile.fieldRef) &&
        Objects.equals(this.mode, v1DownwardAPIVolumeFile.mode) &&
        Objects.equals(this.path, v1DownwardAPIVolumeFile.path) &&
        Objects.equals(this.resourceFieldRef, v1DownwardAPIVolumeFile.resourceFieldRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef, mode, path, resourceFieldRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DownwardAPIVolumeFile {\n");
    
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
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

