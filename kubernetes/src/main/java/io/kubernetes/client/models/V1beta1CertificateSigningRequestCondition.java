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
import org.joda.time.DateTime;

/**
 * V1beta1CertificateSigningRequestCondition
 */

public class V1beta1CertificateSigningRequestCondition {
  @SerializedName("lastUpdateTime")
  private DateTime lastUpdateTime = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("type")
  private String type = null;

  public V1beta1CertificateSigningRequestCondition lastUpdateTime(DateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * timestamp for the last update to this condition
   * @return lastUpdateTime
  **/
  @ApiModelProperty(example = "null", value = "timestamp for the last update to this condition")
  public DateTime getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(DateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public V1beta1CertificateSigningRequestCondition message(String message) {
    this.message = message;
    return this;
  }

   /**
   * human readable message with details about the request state
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "human readable message with details about the request state")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1beta1CertificateSigningRequestCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * brief reason for the request state
   * @return reason
  **/
  @ApiModelProperty(example = "null", value = "brief reason for the request state")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1beta1CertificateSigningRequestCondition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * request approval state, currently Approved or Denied.
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "request approval state, currently Approved or Denied.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CertificateSigningRequestCondition v1beta1CertificateSigningRequestCondition = (V1beta1CertificateSigningRequestCondition) o;
    return Objects.equals(this.lastUpdateTime, v1beta1CertificateSigningRequestCondition.lastUpdateTime) &&
        Objects.equals(this.message, v1beta1CertificateSigningRequestCondition.message) &&
        Objects.equals(this.reason, v1beta1CertificateSigningRequestCondition.reason) &&
        Objects.equals(this.type, v1beta1CertificateSigningRequestCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdateTime, message, reason, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateSigningRequestCondition {\n");
    
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

