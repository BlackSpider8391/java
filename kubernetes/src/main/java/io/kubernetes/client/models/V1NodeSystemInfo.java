/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.12.2
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
 * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
 */
@ApiModel(description = "NodeSystemInfo is a set of ids/uuids to uniquely identify the node.")

public class V1NodeSystemInfo {
  @SerializedName("architecture")
  private String architecture = null;

  @SerializedName("bootID")
  private String bootID = null;

  @SerializedName("containerRuntimeVersion")
  private String containerRuntimeVersion = null;

  @SerializedName("kernelVersion")
  private String kernelVersion = null;

  @SerializedName("kubeProxyVersion")
  private String kubeProxyVersion = null;

  @SerializedName("kubeletVersion")
  private String kubeletVersion = null;

  @SerializedName("machineID")
  private String machineID = null;

  @SerializedName("operatingSystem")
  private String operatingSystem = null;

  @SerializedName("osImage")
  private String osImage = null;

  @SerializedName("systemUUID")
  private String systemUUID = null;

  public V1NodeSystemInfo architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

   /**
   * The Architecture reported by the node
   * @return architecture
  **/
  @ApiModelProperty(required = true, value = "The Architecture reported by the node")
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public V1NodeSystemInfo bootID(String bootID) {
    this.bootID = bootID;
    return this;
  }

   /**
   * Boot ID reported by the node.
   * @return bootID
  **/
  @ApiModelProperty(required = true, value = "Boot ID reported by the node.")
  public String getBootID() {
    return bootID;
  }

  public void setBootID(String bootID) {
    this.bootID = bootID;
  }

  public V1NodeSystemInfo containerRuntimeVersion(String containerRuntimeVersion) {
    this.containerRuntimeVersion = containerRuntimeVersion;
    return this;
  }

   /**
   * ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).
   * @return containerRuntimeVersion
  **/
  @ApiModelProperty(required = true, value = "ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).")
  public String getContainerRuntimeVersion() {
    return containerRuntimeVersion;
  }

  public void setContainerRuntimeVersion(String containerRuntimeVersion) {
    this.containerRuntimeVersion = containerRuntimeVersion;
  }

  public V1NodeSystemInfo kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

   /**
   * Kernel Version reported by the node from &#39;uname -r&#39; (e.g. 3.16.0-0.bpo.4-amd64).
   * @return kernelVersion
  **/
  @ApiModelProperty(required = true, value = "Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).")
  public String getKernelVersion() {
    return kernelVersion;
  }

  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }

  public V1NodeSystemInfo kubeProxyVersion(String kubeProxyVersion) {
    this.kubeProxyVersion = kubeProxyVersion;
    return this;
  }

   /**
   * KubeProxy Version reported by the node.
   * @return kubeProxyVersion
  **/
  @ApiModelProperty(required = true, value = "KubeProxy Version reported by the node.")
  public String getKubeProxyVersion() {
    return kubeProxyVersion;
  }

  public void setKubeProxyVersion(String kubeProxyVersion) {
    this.kubeProxyVersion = kubeProxyVersion;
  }

  public V1NodeSystemInfo kubeletVersion(String kubeletVersion) {
    this.kubeletVersion = kubeletVersion;
    return this;
  }

   /**
   * Kubelet Version reported by the node.
   * @return kubeletVersion
  **/
  @ApiModelProperty(required = true, value = "Kubelet Version reported by the node.")
  public String getKubeletVersion() {
    return kubeletVersion;
  }

  public void setKubeletVersion(String kubeletVersion) {
    this.kubeletVersion = kubeletVersion;
  }

  public V1NodeSystemInfo machineID(String machineID) {
    this.machineID = machineID;
    return this;
  }

   /**
   * MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
   * @return machineID
  **/
  @ApiModelProperty(required = true, value = "MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html")
  public String getMachineID() {
    return machineID;
  }

  public void setMachineID(String machineID) {
    this.machineID = machineID;
  }

  public V1NodeSystemInfo operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * The Operating System reported by the node
   * @return operatingSystem
  **/
  @ApiModelProperty(required = true, value = "The Operating System reported by the node")
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public V1NodeSystemInfo osImage(String osImage) {
    this.osImage = osImage;
    return this;
  }

   /**
   * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
   * @return osImage
  **/
  @ApiModelProperty(required = true, value = "OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).")
  public String getOsImage() {
    return osImage;
  }

  public void setOsImage(String osImage) {
    this.osImage = osImage;
  }

  public V1NodeSystemInfo systemUUID(String systemUUID) {
    this.systemUUID = systemUUID;
    return this;
  }

   /**
   * SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-US/Red_Hat_Subscription_Management/1/html/RHSM/getting-system-uuid.html
   * @return systemUUID
  **/
  @ApiModelProperty(required = true, value = "SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-US/Red_Hat_Subscription_Management/1/html/RHSM/getting-system-uuid.html")
  public String getSystemUUID() {
    return systemUUID;
  }

  public void setSystemUUID(String systemUUID) {
    this.systemUUID = systemUUID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeSystemInfo v1NodeSystemInfo = (V1NodeSystemInfo) o;
    return Objects.equals(this.architecture, v1NodeSystemInfo.architecture) &&
        Objects.equals(this.bootID, v1NodeSystemInfo.bootID) &&
        Objects.equals(this.containerRuntimeVersion, v1NodeSystemInfo.containerRuntimeVersion) &&
        Objects.equals(this.kernelVersion, v1NodeSystemInfo.kernelVersion) &&
        Objects.equals(this.kubeProxyVersion, v1NodeSystemInfo.kubeProxyVersion) &&
        Objects.equals(this.kubeletVersion, v1NodeSystemInfo.kubeletVersion) &&
        Objects.equals(this.machineID, v1NodeSystemInfo.machineID) &&
        Objects.equals(this.operatingSystem, v1NodeSystemInfo.operatingSystem) &&
        Objects.equals(this.osImage, v1NodeSystemInfo.osImage) &&
        Objects.equals(this.systemUUID, v1NodeSystemInfo.systemUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, bootID, containerRuntimeVersion, kernelVersion, kubeProxyVersion, kubeletVersion, machineID, operatingSystem, osImage, systemUUID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeSystemInfo {\n");
    
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    bootID: ").append(toIndentedString(bootID)).append("\n");
    sb.append("    containerRuntimeVersion: ").append(toIndentedString(containerRuntimeVersion)).append("\n");
    sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
    sb.append("    kubeProxyVersion: ").append(toIndentedString(kubeProxyVersion)).append("\n");
    sb.append("    kubeletVersion: ").append(toIndentedString(kubeletVersion)).append("\n");
    sb.append("    machineID: ").append(toIndentedString(machineID)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    osImage: ").append(toIndentedString(osImage)).append("\n");
    sb.append("    systemUUID: ").append(toIndentedString(systemUUID)).append("\n");
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

