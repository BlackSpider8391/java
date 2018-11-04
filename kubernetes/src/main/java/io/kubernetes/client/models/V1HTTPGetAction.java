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
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.models.V1HTTPHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HTTPGetAction describes an action based on HTTP Get requests.
 */
@ApiModel(description = "HTTPGetAction describes an action based on HTTP Get requests.")

public class V1HTTPGetAction {
  @SerializedName("host")
  private String host = null;

  @SerializedName("httpHeaders")
  private List<V1HTTPHeader> httpHeaders = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("port")
  private IntOrString port = null;

  @SerializedName("scheme")
  private String scheme = null;

  public V1HTTPGetAction host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Host name to connect to, defaults to the pod IP. You probably want to set \&quot;Host\&quot; in httpHeaders instead.
   * @return host
  **/
  @ApiModelProperty(value = "Host name to connect to, defaults to the pod IP. You probably want to set \"Host\" in httpHeaders instead.")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public V1HTTPGetAction httpHeaders(List<V1HTTPHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
    return this;
  }

  public V1HTTPGetAction addHttpHeadersItem(V1HTTPHeader httpHeadersItem) {
    if (this.httpHeaders == null) {
      this.httpHeaders = new ArrayList<V1HTTPHeader>();
    }
    this.httpHeaders.add(httpHeadersItem);
    return this;
  }

   /**
   * Custom headers to set in the request. HTTP allows repeated headers.
   * @return httpHeaders
  **/
  @ApiModelProperty(value = "Custom headers to set in the request. HTTP allows repeated headers.")
  public List<V1HTTPHeader> getHttpHeaders() {
    return httpHeaders;
  }

  public void setHttpHeaders(List<V1HTTPHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
  }

  public V1HTTPGetAction path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path to access on the HTTP server.
   * @return path
  **/
  @ApiModelProperty(value = "Path to access on the HTTP server.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1HTTPGetAction port(IntOrString port) {
    this.port = port;
    return this;
  }

   /**
   * Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.")
  public IntOrString getPort() {
    return port;
  }

  public void setPort(IntOrString port) {
    this.port = port;
  }

  public V1HTTPGetAction scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

   /**
   * Scheme to use for connecting to the host. Defaults to HTTP.
   * @return scheme
  **/
  @ApiModelProperty(value = "Scheme to use for connecting to the host. Defaults to HTTP.")
  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HTTPGetAction v1HTTPGetAction = (V1HTTPGetAction) o;
    return Objects.equals(this.host, v1HTTPGetAction.host) &&
        Objects.equals(this.httpHeaders, v1HTTPGetAction.httpHeaders) &&
        Objects.equals(this.path, v1HTTPGetAction.path) &&
        Objects.equals(this.port, v1HTTPGetAction.port) &&
        Objects.equals(this.scheme, v1HTTPGetAction.scheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, httpHeaders, path, port, scheme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HTTPGetAction {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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

