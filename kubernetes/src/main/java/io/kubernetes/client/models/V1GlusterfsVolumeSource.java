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
 * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
 */
@ApiModel(description = "Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.")

public class V1GlusterfsVolumeSource {
  @SerializedName("endpoints")
  private String endpoints = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  public V1GlusterfsVolumeSource endpoints(String endpoints) {
    this.endpoints = endpoints;
    return this;
  }

   /**
   * EndpointsName is the endpoint name that details Glusterfs topology. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod
   * @return endpoints
  **/
  @ApiModelProperty(required = true, value = "EndpointsName is the endpoint name that details Glusterfs topology. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod")
  public String getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(String endpoints) {
    this.endpoints = endpoints;
  }

  public V1GlusterfsVolumeSource path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path is the Glusterfs volume path. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Path is the Glusterfs volume path. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1GlusterfsVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod
   * @return readOnly
  **/
  @ApiModelProperty(value = "ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GlusterfsVolumeSource v1GlusterfsVolumeSource = (V1GlusterfsVolumeSource) o;
    return Objects.equals(this.endpoints, v1GlusterfsVolumeSource.endpoints) &&
        Objects.equals(this.path, v1GlusterfsVolumeSource.path) &&
        Objects.equals(this.readOnly, v1GlusterfsVolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints, path, readOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GlusterfsVolumeSource {\n");
    
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

