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
import io.kubernetes.client.models.ApiextensionsV1beta1WebhookClientConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CustomResourceConversion describes how to convert different versions of a CR.
 */
@ApiModel(description = "CustomResourceConversion describes how to convert different versions of a CR.")

public class V1beta1CustomResourceConversion {
  @SerializedName("conversionReviewVersions")
  private List<String> conversionReviewVersions = null;

  @SerializedName("strategy")
  private String strategy = null;

  @SerializedName("webhookClientConfig")
  private ApiextensionsV1beta1WebhookClientConfig webhookClientConfig = null;

  public V1beta1CustomResourceConversion conversionReviewVersions(List<String> conversionReviewVersions) {
    this.conversionReviewVersions = conversionReviewVersions;
    return this;
  }

  public V1beta1CustomResourceConversion addConversionReviewVersionsItem(String conversionReviewVersionsItem) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new ArrayList<String>();
    }
    this.conversionReviewVersions.add(conversionReviewVersionsItem);
    return this;
  }

   /**
   * ConversionReviewVersions is an ordered list of preferred &#x60;ConversionReview&#x60; versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, conversion will fail for this object. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Default to &#x60;[&#39;v1beta1&#39;]&#x60;.
   * @return conversionReviewVersions
  **/
  @ApiModelProperty(value = "ConversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, conversion will fail for this object. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Default to `['v1beta1']`.")
  public List<String> getConversionReviewVersions() {
    return conversionReviewVersions;
  }

  public void setConversionReviewVersions(List<String> conversionReviewVersions) {
    this.conversionReviewVersions = conversionReviewVersions;
  }

  public V1beta1CustomResourceConversion strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * &#x60;strategy&#x60; specifies the conversion strategy. Allowed values are: - &#x60;None&#x60;: The converter only change the apiVersion and would not touch any other field in the CR. - &#x60;Webhook&#x60;: API Server will call to an external webhook to do the conversion. Additional information is needed for this option.
   * @return strategy
  **/
  @ApiModelProperty(required = true, value = "`strategy` specifies the conversion strategy. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the CR. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information is needed for this option.")
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }

  public V1beta1CustomResourceConversion webhookClientConfig(ApiextensionsV1beta1WebhookClientConfig webhookClientConfig) {
    this.webhookClientConfig = webhookClientConfig;
    return this;
  }

   /**
   * &#x60;webhookClientConfig&#x60; is the instructions for how to call the webhook if strategy is &#x60;Webhook&#x60;. This field is alpha-level and is only honored by servers that enable the CustomResourceWebhookConversion feature.
   * @return webhookClientConfig
  **/
  @ApiModelProperty(value = "`webhookClientConfig` is the instructions for how to call the webhook if strategy is `Webhook`. This field is alpha-level and is only honored by servers that enable the CustomResourceWebhookConversion feature.")
  public ApiextensionsV1beta1WebhookClientConfig getWebhookClientConfig() {
    return webhookClientConfig;
  }

  public void setWebhookClientConfig(ApiextensionsV1beta1WebhookClientConfig webhookClientConfig) {
    this.webhookClientConfig = webhookClientConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CustomResourceConversion v1beta1CustomResourceConversion = (V1beta1CustomResourceConversion) o;
    return Objects.equals(this.conversionReviewVersions, v1beta1CustomResourceConversion.conversionReviewVersions) &&
        Objects.equals(this.strategy, v1beta1CustomResourceConversion.strategy) &&
        Objects.equals(this.webhookClientConfig, v1beta1CustomResourceConversion.webhookClientConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionReviewVersions, strategy, webhookClientConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CustomResourceConversion {\n");
    
    sb.append("    conversionReviewVersions: ").append(toIndentedString(conversionReviewVersions)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    webhookClientConfig: ").append(toIndentedString(webhookClientConfig)).append("\n");
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

