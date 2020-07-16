/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object
 * (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside
 * of cluster). Exactly one \&quot;target\&quot; type should be set.
 */
@ApiModel(
    description =
        "ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster). Exactly one \"target\" type should be set.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-06-19T10:47:33.387Z[Etc/UTC]")
public class V2beta1ExternalMetricSource {
  public static final String SERIALIZED_NAME_METRIC_NAME = "metricName";

  @SerializedName(SERIALIZED_NAME_METRIC_NAME)
  private String metricName;

  public static final String SERIALIZED_NAME_METRIC_SELECTOR = "metricSelector";

  @SerializedName(SERIALIZED_NAME_METRIC_SELECTOR)
  private V1LabelSelector metricSelector;

  public static final String SERIALIZED_NAME_TARGET_AVERAGE_VALUE = "targetAverageValue";

  @SerializedName(SERIALIZED_NAME_TARGET_AVERAGE_VALUE)
  private Quantity targetAverageValue;

  public static final String SERIALIZED_NAME_TARGET_VALUE = "targetValue";

  @SerializedName(SERIALIZED_NAME_TARGET_VALUE)
  private Quantity targetValue;

  public V2beta1ExternalMetricSource metricName(String metricName) {

    this.metricName = metricName;
    return this;
  }

  /**
   * metricName is the name of the metric in question.
   *
   * @return metricName
   */
  @ApiModelProperty(required = true, value = "metricName is the name of the metric in question.")
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public V2beta1ExternalMetricSource metricSelector(V1LabelSelector metricSelector) {

    this.metricSelector = metricSelector;
    return this;
  }

  /**
   * Get metricSelector
   *
   * @return metricSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getMetricSelector() {
    return metricSelector;
  }

  public void setMetricSelector(V1LabelSelector metricSelector) {
    this.metricSelector = metricSelector;
  }

  public V2beta1ExternalMetricSource targetAverageValue(Quantity targetAverageValue) {

    this.targetAverageValue = targetAverageValue;
    return this;
  }

  /**
   * Quantity is a fixed-point representation of a number. It provides convenient
   * marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors. The
   * serialization format is: &lt;quantity&gt; ::&#x3D; &lt;signedNumber&gt;&lt;suffix&gt; (Note
   * that &lt;suffix&gt; may be empty, from the \&quot;\&quot; case in &lt;decimalSI&gt;.)
   * &lt;digit&gt; ::&#x3D; 0 | 1 | ... | 9 &lt;digits&gt; ::&#x3D; &lt;digit&gt; |
   * &lt;digit&gt;&lt;digits&gt; &lt;number&gt; ::&#x3D; &lt;digits&gt; |
   * &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt; &lt;sign&gt; ::&#x3D;
   * \&quot;+\&quot; | \&quot;-\&quot; &lt;signedNumber&gt; ::&#x3D; &lt;number&gt; |
   * &lt;sign&gt;&lt;number&gt; &lt;suffix&gt; ::&#x3D; &lt;binarySI&gt; | &lt;decimalExponent&gt; |
   * &lt;decimalSI&gt; &lt;binarySI&gt; ::&#x3D; Ki | Mi | Gi | Ti | Pi | Ei (International System
   * of units; See: http://physics.nist.gov/cuu/Units/binary.html) &lt;decimalSI&gt; ::&#x3D; m |
   * \&quot;\&quot; | k | M | G | T | P | E (Note that 1024 &#x3D; 1Ki but 1000 &#x3D; 1k; I
   * didn&#39;t choose the capitalization.) &lt;decimalExponent&gt; ::&#x3D; \&quot;e\&quot;
   * &lt;signedNumber&gt; | \&quot;E\&quot; &lt;signedNumber&gt; No matter which of the three
   * exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude,
   * nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or
   * rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we
   * require larger or smaller quantities. When a Quantity is parsed from a string, it will remember
   * the type of suffix it had, and will use the same type again when it is serialized. Before
   * serializing, Quantity will be put in \&quot;canonical form\&quot;. This means that
   * Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in
   * Mantissa) such that: a. No precision is lost b. No fractional digits will be emitted c. The
   * exponent (or suffix) is as large as possible. The sign will be omitted unless the number is
   * negative. Examples: 1.5 will be serialized as \&quot;1500m\&quot; 1.5Gi will be serialized as
   * \&quot;1536Mi\&quot; Note that the quantity will NEVER be internally represented by a floating
   * point number. That is the whole point of this exercise. Non-canonical values will still parse
   * as long as they are well formed, but will be re-emitted in their canonical form. (So always use
   * canonical form, or don&#39;t diff.) This format is intended to make it difficult to use these
   * numbers without writing some sort of special handling code in the hopes that that will cause
   * implementors to also use a fixed point implementation.
   *
   * @return targetAverageValue
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  <quantity>        ::= <signedNumber><suffix>   (Note that <suffix> may be empty, from the \"\" case in <decimalSI>.) <digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= \"+\" | \"-\" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html) <decimalSI>       ::= m | \"\" | k | M | G | T | P | E   (Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.) <decimalExponent> ::= \"e\" <signedNumber> | \"E\" <signedNumber>  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \"canonical form\". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:   a. No precision is lost   b. No fractional digits will be emitted   c. The exponent (or suffix) is as large as possible. The sign will be omitted unless the number is negative.  Examples:   1.5 will be serialized as \"1500m\"   1.5Gi will be serialized as \"1536Mi\"  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.")
  public Quantity getTargetAverageValue() {
    return targetAverageValue;
  }

  public void setTargetAverageValue(Quantity targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
  }

  public V2beta1ExternalMetricSource targetValue(Quantity targetValue) {

    this.targetValue = targetValue;
    return this;
  }

  /**
   * Quantity is a fixed-point representation of a number. It provides convenient
   * marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors. The
   * serialization format is: &lt;quantity&gt; ::&#x3D; &lt;signedNumber&gt;&lt;suffix&gt; (Note
   * that &lt;suffix&gt; may be empty, from the \&quot;\&quot; case in &lt;decimalSI&gt;.)
   * &lt;digit&gt; ::&#x3D; 0 | 1 | ... | 9 &lt;digits&gt; ::&#x3D; &lt;digit&gt; |
   * &lt;digit&gt;&lt;digits&gt; &lt;number&gt; ::&#x3D; &lt;digits&gt; |
   * &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt; &lt;sign&gt; ::&#x3D;
   * \&quot;+\&quot; | \&quot;-\&quot; &lt;signedNumber&gt; ::&#x3D; &lt;number&gt; |
   * &lt;sign&gt;&lt;number&gt; &lt;suffix&gt; ::&#x3D; &lt;binarySI&gt; | &lt;decimalExponent&gt; |
   * &lt;decimalSI&gt; &lt;binarySI&gt; ::&#x3D; Ki | Mi | Gi | Ti | Pi | Ei (International System
   * of units; See: http://physics.nist.gov/cuu/Units/binary.html) &lt;decimalSI&gt; ::&#x3D; m |
   * \&quot;\&quot; | k | M | G | T | P | E (Note that 1024 &#x3D; 1Ki but 1000 &#x3D; 1k; I
   * didn&#39;t choose the capitalization.) &lt;decimalExponent&gt; ::&#x3D; \&quot;e\&quot;
   * &lt;signedNumber&gt; | \&quot;E\&quot; &lt;signedNumber&gt; No matter which of the three
   * exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude,
   * nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or
   * rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we
   * require larger or smaller quantities. When a Quantity is parsed from a string, it will remember
   * the type of suffix it had, and will use the same type again when it is serialized. Before
   * serializing, Quantity will be put in \&quot;canonical form\&quot;. This means that
   * Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in
   * Mantissa) such that: a. No precision is lost b. No fractional digits will be emitted c. The
   * exponent (or suffix) is as large as possible. The sign will be omitted unless the number is
   * negative. Examples: 1.5 will be serialized as \&quot;1500m\&quot; 1.5Gi will be serialized as
   * \&quot;1536Mi\&quot; Note that the quantity will NEVER be internally represented by a floating
   * point number. That is the whole point of this exercise. Non-canonical values will still parse
   * as long as they are well formed, but will be re-emitted in their canonical form. (So always use
   * canonical form, or don&#39;t diff.) This format is intended to make it difficult to use these
   * numbers without writing some sort of special handling code in the hopes that that will cause
   * implementors to also use a fixed point implementation.
   *
   * @return targetValue
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  <quantity>        ::= <signedNumber><suffix>   (Note that <suffix> may be empty, from the \"\" case in <decimalSI>.) <digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= \"+\" | \"-\" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html) <decimalSI>       ::= m | \"\" | k | M | G | T | P | E   (Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.) <decimalExponent> ::= \"e\" <signedNumber> | \"E\" <signedNumber>  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \"canonical form\". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:   a. No precision is lost   b. No fractional digits will be emitted   c. The exponent (or suffix) is as large as possible. The sign will be omitted unless the number is negative.  Examples:   1.5 will be serialized as \"1500m\"   1.5Gi will be serialized as \"1536Mi\"  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.")
  public Quantity getTargetValue() {
    return targetValue;
  }

  public void setTargetValue(Quantity targetValue) {
    this.targetValue = targetValue;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta1ExternalMetricSource v2beta1ExternalMetricSource = (V2beta1ExternalMetricSource) o;
    return Objects.equals(this.metricName, v2beta1ExternalMetricSource.metricName)
        && Objects.equals(this.metricSelector, v2beta1ExternalMetricSource.metricSelector)
        && Objects.equals(this.targetAverageValue, v2beta1ExternalMetricSource.targetAverageValue)
        && Objects.equals(this.targetValue, v2beta1ExternalMetricSource.targetValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricName, metricSelector, targetAverageValue, targetValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1ExternalMetricSource {\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    metricSelector: ").append(toIndentedString(metricSelector)).append("\n");
    sb.append("    targetAverageValue: ").append(toIndentedString(targetAverageValue)).append("\n");
    sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
