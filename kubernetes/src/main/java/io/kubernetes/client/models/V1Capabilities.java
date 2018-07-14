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
import java.util.ArrayList;
import java.util.List;

/**
 * Adds and removes POSIX capabilities from running containers.
 */
@ApiModel(description = "Adds and removes POSIX capabilities from running containers.")

public class V1Capabilities {
  @SerializedName("add")
  private List<String> add = null;

  @SerializedName("drop")
  private List<String> drop = null;

  public V1Capabilities add(List<String> add) {
    this.add = add;
    return this;
  }

  public V1Capabilities addAddItem(String addItem) {
    if (this.add == null) {
      this.add = new ArrayList<String>();
    }
    this.add.add(addItem);
    return this;
  }

   /**
   * Added capabilities
   * @return add
  **/
  @ApiModelProperty(value = "Added capabilities")
  public List<String> getAdd() {
    return add;
  }

  public void setAdd(List<String> add) {
    this.add = add;
  }

  public V1Capabilities drop(List<String> drop) {
    this.drop = drop;
    return this;
  }

  public V1Capabilities addDropItem(String dropItem) {
    if (this.drop == null) {
      this.drop = new ArrayList<String>();
    }
    this.drop.add(dropItem);
    return this;
  }

   /**
   * Removed capabilities
   * @return drop
  **/
  @ApiModelProperty(value = "Removed capabilities")
  public List<String> getDrop() {
    return drop;
  }

  public void setDrop(List<String> drop) {
    this.drop = drop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Capabilities v1Capabilities = (V1Capabilities) o;
    return Objects.equals(this.add, v1Capabilities.add) &&
        Objects.equals(this.drop, v1Capabilities.drop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, drop);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Capabilities {\n");
    
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    drop: ").append(toIndentedString(drop)).append("\n");
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

