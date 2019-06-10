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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
 */
@ApiModel(description = "CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition")

public class V1beta1CustomResourceDefinitionNames {
  @SerializedName("categories")
  private List<String> categories = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("listKind")
  private String listKind = null;

  @SerializedName("plural")
  private String plural = null;

  @SerializedName("shortNames")
  private List<String> shortNames = null;

  @SerializedName("singular")
  private String singular = null;

  public V1beta1CustomResourceDefinitionNames categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public V1beta1CustomResourceDefinitionNames addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Categories is a list of grouped resources custom resources belong to (e.g. &#39;all&#39;)
   * @return categories
  **/
  @ApiModelProperty(value = "Categories is a list of grouped resources custom resources belong to (e.g. 'all')")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public V1beta1CustomResourceDefinitionNames kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is the serialized kind of the resource.  It is normally CamelCase and singular.
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "Kind is the serialized kind of the resource.  It is normally CamelCase and singular.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1beta1CustomResourceDefinitionNames listKind(String listKind) {
    this.listKind = listKind;
    return this;
  }

   /**
   * ListKind is the serialized kind of the list for this resource.  Defaults to &lt;kind&gt;List.
   * @return listKind
  **/
  @ApiModelProperty(value = "ListKind is the serialized kind of the list for this resource.  Defaults to <kind>List.")
  public String getListKind() {
    return listKind;
  }

  public void setListKind(String listKind) {
    this.listKind = listKind;
  }

  public V1beta1CustomResourceDefinitionNames plural(String plural) {
    this.plural = plural;
    return this;
  }

   /**
   * Plural is the plural name of the resource to serve.  It must match the name of the CustomResourceDefinition-registration too: plural.group and it must be all lowercase.
   * @return plural
  **/
  @ApiModelProperty(required = true, value = "Plural is the plural name of the resource to serve.  It must match the name of the CustomResourceDefinition-registration too: plural.group and it must be all lowercase.")
  public String getPlural() {
    return plural;
  }

  public void setPlural(String plural) {
    this.plural = plural;
  }

  public V1beta1CustomResourceDefinitionNames shortNames(List<String> shortNames) {
    this.shortNames = shortNames;
    return this;
  }

  public V1beta1CustomResourceDefinitionNames addShortNamesItem(String shortNamesItem) {
    if (this.shortNames == null) {
      this.shortNames = new ArrayList<String>();
    }
    this.shortNames.add(shortNamesItem);
    return this;
  }

   /**
   * ShortNames are short names for the resource.  It must be all lowercase.
   * @return shortNames
  **/
  @ApiModelProperty(value = "ShortNames are short names for the resource.  It must be all lowercase.")
  public List<String> getShortNames() {
    return shortNames;
  }

  public void setShortNames(List<String> shortNames) {
    this.shortNames = shortNames;
  }

  public V1beta1CustomResourceDefinitionNames singular(String singular) {
    this.singular = singular;
    return this;
  }

   /**
   * Singular is the singular name of the resource.  It must be all lowercase  Defaults to lowercased &lt;kind&gt;
   * @return singular
  **/
  @ApiModelProperty(value = "Singular is the singular name of the resource.  It must be all lowercase  Defaults to lowercased <kind>")
  public String getSingular() {
    return singular;
  }

  public void setSingular(String singular) {
    this.singular = singular;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CustomResourceDefinitionNames v1beta1CustomResourceDefinitionNames = (V1beta1CustomResourceDefinitionNames) o;
    return Objects.equals(this.categories, v1beta1CustomResourceDefinitionNames.categories) &&
        Objects.equals(this.kind, v1beta1CustomResourceDefinitionNames.kind) &&
        Objects.equals(this.listKind, v1beta1CustomResourceDefinitionNames.listKind) &&
        Objects.equals(this.plural, v1beta1CustomResourceDefinitionNames.plural) &&
        Objects.equals(this.shortNames, v1beta1CustomResourceDefinitionNames.shortNames) &&
        Objects.equals(this.singular, v1beta1CustomResourceDefinitionNames.singular);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, kind, listKind, plural, shortNames, singular);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CustomResourceDefinitionNames {\n");
    
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    listKind: ").append(toIndentedString(listKind)).append("\n");
    sb.append("    plural: ").append(toIndentedString(plural)).append("\n");
    sb.append("    shortNames: ").append(toIndentedString(shortNames)).append("\n");
    sb.append("    singular: ").append(toIndentedString(singular)).append("\n");
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

