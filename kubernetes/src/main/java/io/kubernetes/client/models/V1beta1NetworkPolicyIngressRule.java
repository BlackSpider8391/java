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
import io.kubernetes.client.models.V1beta1NetworkPolicyPeer;
import io.kubernetes.client.models.V1beta1NetworkPolicyPort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DEPRECATED 1.9 - This group version of NetworkPolicyIngressRule is deprecated by networking/v1/NetworkPolicyIngressRule. This NetworkPolicyIngressRule matches traffic if and only if the traffic matches both ports AND from.
 */
@ApiModel(description = "DEPRECATED 1.9 - This group version of NetworkPolicyIngressRule is deprecated by networking/v1/NetworkPolicyIngressRule. This NetworkPolicyIngressRule matches traffic if and only if the traffic matches both ports AND from.")

public class V1beta1NetworkPolicyIngressRule {
  @SerializedName("from")
  private List<V1beta1NetworkPolicyPeer> from = null;

  @SerializedName("ports")
  private List<V1beta1NetworkPolicyPort> ports = null;

  public V1beta1NetworkPolicyIngressRule from(List<V1beta1NetworkPolicyPeer> from) {
    this.from = from;
    return this;
  }

  public V1beta1NetworkPolicyIngressRule addFromItem(V1beta1NetworkPolicyPeer fromItem) {
    if (this.from == null) {
      this.from = new ArrayList<V1beta1NetworkPolicyPeer>();
    }
    this.from.add(fromItem);
    return this;
  }

   /**
   * List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least on item, this rule allows traffic only if the traffic matches at least one item in the from list.
   * @return from
  **/
  @ApiModelProperty(value = "List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least on item, this rule allows traffic only if the traffic matches at least one item in the from list.")
  public List<V1beta1NetworkPolicyPeer> getFrom() {
    return from;
  }

  public void setFrom(List<V1beta1NetworkPolicyPeer> from) {
    this.from = from;
  }

  public V1beta1NetworkPolicyIngressRule ports(List<V1beta1NetworkPolicyPort> ports) {
    this.ports = ports;
    return this;
  }

  public V1beta1NetworkPolicyIngressRule addPortsItem(V1beta1NetworkPolicyPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<V1beta1NetworkPolicyPort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
   * @return ports
  **/
  @ApiModelProperty(value = "List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.")
  public List<V1beta1NetworkPolicyPort> getPorts() {
    return ports;
  }

  public void setPorts(List<V1beta1NetworkPolicyPort> ports) {
    this.ports = ports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1NetworkPolicyIngressRule v1beta1NetworkPolicyIngressRule = (V1beta1NetworkPolicyIngressRule) o;
    return Objects.equals(this.from, v1beta1NetworkPolicyIngressRule.from) &&
        Objects.equals(this.ports, v1beta1NetworkPolicyIngressRule.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, ports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1NetworkPolicyIngressRule {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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

