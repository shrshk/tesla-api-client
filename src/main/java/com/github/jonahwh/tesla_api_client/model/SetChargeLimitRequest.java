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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SetChargeLimitRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-22T19:58:12.919-07:00")
public class SetChargeLimitRequest {
  @SerializedName("percent")
  private Integer percent = null;

  public SetChargeLimitRequest percent(Integer percent) {
    this.percent = percent;
    return this;
  }

   /**
   * Percentage to set Charge Limit to.
   * @return percent
  **/
  @ApiModelProperty(value = "Percentage to set Charge Limit to.")
  public Integer getPercent() {
    return percent;
  }

  public void setPercent(Integer percent) {
    this.percent = percent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetChargeLimitRequest setChargeLimitRequest = (SetChargeLimitRequest) o;
    return Objects.equals(this.percent, setChargeLimitRequest.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetChargeLimitRequest {\n");
    
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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

