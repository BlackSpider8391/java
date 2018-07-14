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
import io.kubernetes.client.models.V1beta1VolumeError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * VolumeAttachmentStatus is the status of a VolumeAttachment request.
 */
@ApiModel(description = "VolumeAttachmentStatus is the status of a VolumeAttachment request.")

public class V1beta1VolumeAttachmentStatus {
  @SerializedName("attachError")
  private V1beta1VolumeError attachError = null;

  @SerializedName("attached")
  private Boolean attached = null;

  @SerializedName("attachmentMetadata")
  private Map<String, String> attachmentMetadata = null;

  @SerializedName("detachError")
  private V1beta1VolumeError detachError = null;

  public V1beta1VolumeAttachmentStatus attachError(V1beta1VolumeError attachError) {
    this.attachError = attachError;
    return this;
  }

   /**
   * The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
   * @return attachError
  **/
  @ApiModelProperty(value = "The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.")
  public V1beta1VolumeError getAttachError() {
    return attachError;
  }

  public void setAttachError(V1beta1VolumeError attachError) {
    this.attachError = attachError;
  }

  public V1beta1VolumeAttachmentStatus attached(Boolean attached) {
    this.attached = attached;
    return this;
  }

   /**
   * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
   * @return attached
  **/
  @ApiModelProperty(required = true, value = "Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.")
  public Boolean isAttached() {
    return attached;
  }

  public void setAttached(Boolean attached) {
    this.attached = attached;
  }

  public V1beta1VolumeAttachmentStatus attachmentMetadata(Map<String, String> attachmentMetadata) {
    this.attachmentMetadata = attachmentMetadata;
    return this;
  }

  public V1beta1VolumeAttachmentStatus putAttachmentMetadataItem(String key, String attachmentMetadataItem) {
    if (this.attachmentMetadata == null) {
      this.attachmentMetadata = new HashMap<String, String>();
    }
    this.attachmentMetadata.put(key, attachmentMetadataItem);
    return this;
  }

   /**
   * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
   * @return attachmentMetadata
  **/
  @ApiModelProperty(value = "Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.")
  public Map<String, String> getAttachmentMetadata() {
    return attachmentMetadata;
  }

  public void setAttachmentMetadata(Map<String, String> attachmentMetadata) {
    this.attachmentMetadata = attachmentMetadata;
  }

  public V1beta1VolumeAttachmentStatus detachError(V1beta1VolumeError detachError) {
    this.detachError = detachError;
    return this;
  }

   /**
   * The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
   * @return detachError
  **/
  @ApiModelProperty(value = "The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.")
  public V1beta1VolumeError getDetachError() {
    return detachError;
  }

  public void setDetachError(V1beta1VolumeError detachError) {
    this.detachError = detachError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1VolumeAttachmentStatus v1beta1VolumeAttachmentStatus = (V1beta1VolumeAttachmentStatus) o;
    return Objects.equals(this.attachError, v1beta1VolumeAttachmentStatus.attachError) &&
        Objects.equals(this.attached, v1beta1VolumeAttachmentStatus.attached) &&
        Objects.equals(this.attachmentMetadata, v1beta1VolumeAttachmentStatus.attachmentMetadata) &&
        Objects.equals(this.detachError, v1beta1VolumeAttachmentStatus.detachError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachError, attached, attachmentMetadata, detachError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1VolumeAttachmentStatus {\n");
    
    sb.append("    attachError: ").append(toIndentedString(attachError)).append("\n");
    sb.append("    attached: ").append(toIndentedString(attached)).append("\n");
    sb.append("    attachmentMetadata: ").append(toIndentedString(attachmentMetadata)).append("\n");
    sb.append("    detachError: ").append(toIndentedString(detachError)).append("\n");
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

