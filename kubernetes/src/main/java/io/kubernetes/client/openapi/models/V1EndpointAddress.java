/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: release-1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EndpointAddress is a tuple that describes single IP address.
 */
@ApiModel(description = "EndpointAddress is a tuple that describes single IP address.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-14T09:13:11.368Z[Etc/UTC]")
public class V1EndpointAddress {
  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_TARGET_REF = "targetRef";
  @SerializedName(SERIALIZED_NAME_TARGET_REF)
  private V1ObjectReference targetRef;


  public V1EndpointAddress hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * The Hostname of this endpoint
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Hostname of this endpoint")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public V1EndpointAddress ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
   * @return ip
  **/
  @ApiModelProperty(required = true, value = "The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public V1EndpointAddress nodeName(String nodeName) {
    
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.
   * @return nodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.")

  public String getNodeName() {
    return nodeName;
  }


  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public V1EndpointAddress targetRef(V1ObjectReference targetRef) {
    
    this.targetRef = targetRef;
    return this;
  }

   /**
   * Get targetRef
   * @return targetRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ObjectReference getTargetRef() {
    return targetRef;
  }


  public void setTargetRef(V1ObjectReference targetRef) {
    this.targetRef = targetRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EndpointAddress v1EndpointAddress = (V1EndpointAddress) o;
    return Objects.equals(this.hostname, v1EndpointAddress.hostname) &&
        Objects.equals(this.ip, v1EndpointAddress.ip) &&
        Objects.equals(this.nodeName, v1EndpointAddress.nodeName) &&
        Objects.equals(this.targetRef, v1EndpointAddress.targetRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ip, nodeName, targetRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EndpointAddress {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
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

