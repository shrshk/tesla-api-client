/*
 * Tesla Model S JSON API
 * TODO: Add a description
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.jonahwh.tesla_api_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SetValetRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-17T13:53:36.587-08:00")
public class SetValetRequest {
  @SerializedName("on")
  private Boolean on = null;

  @SerializedName("password")
  private String password = null;

  public SetValetRequest on(Boolean on) {
    this.on = on;
    return this;
  }

   /**
   * Whether to enable or disable valet mode.
   * @return on
  **/
  @ApiModelProperty(value = "Whether to enable or disable valet mode.")
  public Boolean isOn() {
    return on;
  }

  public void setOn(Boolean on) {
    this.on = on;
  }

  public SetValetRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * (optional) A 4 digit PIN code to unlock the car.
   * @return password
  **/
  @ApiModelProperty(value = "(optional) A 4 digit PIN code to unlock the car.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetValetRequest setValetRequest = (SetValetRequest) o;
    return Objects.equals(this.on, setValetRequest.on) &&
        Objects.equals(this.password, setValetRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(on, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetValetRequest {\n");
    
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

