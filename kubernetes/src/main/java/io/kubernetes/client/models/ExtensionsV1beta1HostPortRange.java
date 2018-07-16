/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.11.1
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
 * HostPortRange defines a range of host ports that will be enabled by a policy for pods to use.  It requires both the start and end to be defined. Deprecated: use HostPortRange from policy API Group instead.
 */
@ApiModel(description = "HostPortRange defines a range of host ports that will be enabled by a policy for pods to use.  It requires both the start and end to be defined. Deprecated: use HostPortRange from policy API Group instead.")

public class ExtensionsV1beta1HostPortRange {
  @SerializedName("max")
  private Integer max = null;

  @SerializedName("min")
  private Integer min = null;

  public ExtensionsV1beta1HostPortRange max(Integer max) {
    this.max = max;
    return this;
  }

   /**
   * max is the end of the range, inclusive.
   * @return max
  **/
  @ApiModelProperty(required = true, value = "max is the end of the range, inclusive.")
  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }

  public ExtensionsV1beta1HostPortRange min(Integer min) {
    this.min = min;
    return this;
  }

   /**
   * min is the start of the range, inclusive.
   * @return min
  **/
  @ApiModelProperty(required = true, value = "min is the start of the range, inclusive.")
  public Integer getMin() {
    return min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionsV1beta1HostPortRange extensionsV1beta1HostPortRange = (ExtensionsV1beta1HostPortRange) o;
    return Objects.equals(this.max, extensionsV1beta1HostPortRange.max) &&
        Objects.equals(this.min, extensionsV1beta1HostPortRange.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionsV1beta1HostPortRange {\n");
    
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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

