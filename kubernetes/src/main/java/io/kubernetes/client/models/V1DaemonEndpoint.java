/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.7
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
 * DaemonEndpoint contains information about a single Daemon endpoint.
 */
@ApiModel(description = "DaemonEndpoint contains information about a single Daemon endpoint.")

public class V1DaemonEndpoint {
  @SerializedName("Port")
  private Integer port = null;

  public V1DaemonEndpoint port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port number of the given endpoint.
   * @return port
  **/
  @ApiModelProperty(example = "null", required = true, value = "Port number of the given endpoint.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DaemonEndpoint v1DaemonEndpoint = (V1DaemonEndpoint) o;
    return Objects.equals(this.port, v1DaemonEndpoint.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DaemonEndpoint {\n");
    
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

