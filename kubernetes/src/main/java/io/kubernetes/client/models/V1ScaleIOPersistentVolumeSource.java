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
import io.kubernetes.client.models.V1SecretReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume
 */
@ApiModel(description = "ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume")

public class V1ScaleIOPersistentVolumeSource {
  @SerializedName("fsType")
  private String fsType = null;

  @SerializedName("gateway")
  private String gateway = null;

  @SerializedName("protectionDomain")
  private String protectionDomain = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("secretRef")
  private V1SecretReference secretRef = null;

  @SerializedName("sslEnabled")
  private Boolean sslEnabled = null;

  @SerializedName("storageMode")
  private String storageMode = null;

  @SerializedName("storagePool")
  private String storagePool = null;

  @SerializedName("system")
  private String system = null;

  @SerializedName("volumeName")
  private String volumeName = null;

  public V1ScaleIOPersistentVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Default is \&quot;xfs\&quot;
   * @return fsType
  **/
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Default is \"xfs\"")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1ScaleIOPersistentVolumeSource gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

   /**
   * The host address of the ScaleIO API Gateway.
   * @return gateway
  **/
  @ApiModelProperty(required = true, value = "The host address of the ScaleIO API Gateway.")
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  public V1ScaleIOPersistentVolumeSource protectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
    return this;
  }

   /**
   * The name of the ScaleIO Protection Domain for the configured storage.
   * @return protectionDomain
  **/
  @ApiModelProperty(value = "The name of the ScaleIO Protection Domain for the configured storage.")
  public String getProtectionDomain() {
    return protectionDomain;
  }

  public void setProtectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
  }

  public V1ScaleIOPersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @ApiModelProperty(value = "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1ScaleIOPersistentVolumeSource secretRef(V1SecretReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

   /**
   * SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
   * @return secretRef
  **/
  @ApiModelProperty(required = true, value = "SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.")
  public V1SecretReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1SecretReference secretRef) {
    this.secretRef = secretRef;
  }

  public V1ScaleIOPersistentVolumeSource sslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
    return this;
  }

   /**
   * Flag to enable/disable SSL communication with Gateway, default false
   * @return sslEnabled
  **/
  @ApiModelProperty(value = "Flag to enable/disable SSL communication with Gateway, default false")
  public Boolean isSslEnabled() {
    return sslEnabled;
  }

  public void setSslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
  }

  public V1ScaleIOPersistentVolumeSource storageMode(String storageMode) {
    this.storageMode = storageMode;
    return this;
  }

   /**
   * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
   * @return storageMode
  **/
  @ApiModelProperty(value = "Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.")
  public String getStorageMode() {
    return storageMode;
  }

  public void setStorageMode(String storageMode) {
    this.storageMode = storageMode;
  }

  public V1ScaleIOPersistentVolumeSource storagePool(String storagePool) {
    this.storagePool = storagePool;
    return this;
  }

   /**
   * The ScaleIO Storage Pool associated with the protection domain.
   * @return storagePool
  **/
  @ApiModelProperty(value = "The ScaleIO Storage Pool associated with the protection domain.")
  public String getStoragePool() {
    return storagePool;
  }

  public void setStoragePool(String storagePool) {
    this.storagePool = storagePool;
  }

  public V1ScaleIOPersistentVolumeSource system(String system) {
    this.system = system;
    return this;
  }

   /**
   * The name of the storage system as configured in ScaleIO.
   * @return system
  **/
  @ApiModelProperty(required = true, value = "The name of the storage system as configured in ScaleIO.")
  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public V1ScaleIOPersistentVolumeSource volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

   /**
   * The name of a volume already created in the ScaleIO system that is associated with this volume source.
   * @return volumeName
  **/
  @ApiModelProperty(value = "The name of a volume already created in the ScaleIO system that is associated with this volume source.")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ScaleIOPersistentVolumeSource v1ScaleIOPersistentVolumeSource = (V1ScaleIOPersistentVolumeSource) o;
    return Objects.equals(this.fsType, v1ScaleIOPersistentVolumeSource.fsType) &&
        Objects.equals(this.gateway, v1ScaleIOPersistentVolumeSource.gateway) &&
        Objects.equals(this.protectionDomain, v1ScaleIOPersistentVolumeSource.protectionDomain) &&
        Objects.equals(this.readOnly, v1ScaleIOPersistentVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, v1ScaleIOPersistentVolumeSource.secretRef) &&
        Objects.equals(this.sslEnabled, v1ScaleIOPersistentVolumeSource.sslEnabled) &&
        Objects.equals(this.storageMode, v1ScaleIOPersistentVolumeSource.storageMode) &&
        Objects.equals(this.storagePool, v1ScaleIOPersistentVolumeSource.storagePool) &&
        Objects.equals(this.system, v1ScaleIOPersistentVolumeSource.system) &&
        Objects.equals(this.volumeName, v1ScaleIOPersistentVolumeSource.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, gateway, protectionDomain, readOnly, secretRef, sslEnabled, storageMode, storagePool, system, volumeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScaleIOPersistentVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    protectionDomain: ").append(toIndentedString(protectionDomain)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    sslEnabled: ").append(toIndentedString(sslEnabled)).append("\n");
    sb.append("    storageMode: ").append(toIndentedString(storageMode)).append("\n");
    sb.append("    storagePool: ").append(toIndentedString(storagePool)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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

