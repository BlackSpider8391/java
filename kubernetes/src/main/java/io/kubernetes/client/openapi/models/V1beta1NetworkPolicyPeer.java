/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: release-1.16
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
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1beta1IPBlock;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DEPRECATED 1.9 - This group version of NetworkPolicyPeer is deprecated by networking/v1/NetworkPolicyPeer.
 */
@ApiModel(description = "DEPRECATED 1.9 - This group version of NetworkPolicyPeer is deprecated by networking/v1/NetworkPolicyPeer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class V1beta1NetworkPolicyPeer {
  public static final String SERIALIZED_NAME_IP_BLOCK = "ipBlock";
  @SerializedName(SERIALIZED_NAME_IP_BLOCK)
  private V1beta1IPBlock ipBlock;

  public static final String SERIALIZED_NAME_NAMESPACE_SELECTOR = "namespaceSelector";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_SELECTOR)
  private V1LabelSelector namespaceSelector;

  public static final String SERIALIZED_NAME_POD_SELECTOR = "podSelector";
  @SerializedName(SERIALIZED_NAME_POD_SELECTOR)
  private V1LabelSelector podSelector;


  public V1beta1NetworkPolicyPeer ipBlock(V1beta1IPBlock ipBlock) {
    
    this.ipBlock = ipBlock;
    return this;
  }

   /**
   * Get ipBlock
   * @return ipBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1IPBlock getIpBlock() {
    return ipBlock;
  }


  public void setIpBlock(V1beta1IPBlock ipBlock) {
    this.ipBlock = ipBlock;
  }


  public V1beta1NetworkPolicyPeer namespaceSelector(V1LabelSelector namespaceSelector) {
    
    this.namespaceSelector = namespaceSelector;
    return this;
  }

   /**
   * Get namespaceSelector
   * @return namespaceSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }


  public void setNamespaceSelector(V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }


  public V1beta1NetworkPolicyPeer podSelector(V1LabelSelector podSelector) {
    
    this.podSelector = podSelector;
    return this;
  }

   /**
   * Get podSelector
   * @return podSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1LabelSelector getPodSelector() {
    return podSelector;
  }


  public void setPodSelector(V1LabelSelector podSelector) {
    this.podSelector = podSelector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1NetworkPolicyPeer v1beta1NetworkPolicyPeer = (V1beta1NetworkPolicyPeer) o;
    return Objects.equals(this.ipBlock, v1beta1NetworkPolicyPeer.ipBlock) &&
        Objects.equals(this.namespaceSelector, v1beta1NetworkPolicyPeer.namespaceSelector) &&
        Objects.equals(this.podSelector, v1beta1NetworkPolicyPeer.podSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipBlock, namespaceSelector, podSelector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1NetworkPolicyPeer {\n");
    sb.append("    ipBlock: ").append(toIndentedString(ipBlock)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    podSelector: ").append(toIndentedString(podSelector)).append("\n");
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

