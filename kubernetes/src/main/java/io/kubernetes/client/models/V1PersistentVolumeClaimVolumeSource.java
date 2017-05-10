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
 * PersistentVolumeClaimVolumeSource references the user&#39;s PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
 */
@ApiModel(description = "PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).")

public class V1PersistentVolumeClaimVolumeSource {
  @SerializedName("claimName")
  private String claimName = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  public V1PersistentVolumeClaimVolumeSource claimName(String claimName) {
    this.claimName = claimName;
    return this;
  }

   /**
   * ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#persistentvolumeclaims
   * @return claimName
  **/
  @ApiModelProperty(example = "null", required = true, value = "ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#persistentvolumeclaims")
  public String getClaimName() {
    return claimName;
  }

  public void setClaimName(String claimName) {
    this.claimName = claimName;
  }

  public V1PersistentVolumeClaimVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Will force the ReadOnly setting in VolumeMounts. Default false.
   * @return readOnly
  **/
  @ApiModelProperty(example = "null", value = "Will force the ReadOnly setting in VolumeMounts. Default false.")
  public Boolean getReadOnly() {
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
    V1PersistentVolumeClaimVolumeSource v1PersistentVolumeClaimVolumeSource = (V1PersistentVolumeClaimVolumeSource) o;
    return Objects.equals(this.claimName, v1PersistentVolumeClaimVolumeSource.claimName) &&
        Objects.equals(this.readOnly, v1PersistentVolumeClaimVolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimName, readOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PersistentVolumeClaimVolumeSource {\n");
    
    sb.append("    claimName: ").append(toIndentedString(claimName)).append("\n");
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

