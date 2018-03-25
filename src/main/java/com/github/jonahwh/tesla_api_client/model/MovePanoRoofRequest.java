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
 * MovePanoRoofRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-25T15:58:56.308-07:00")
public class MovePanoRoofRequest {
  /**
   * The desired state of the panoramic roof. The approximate percent open values for each state are &#x60;open&#x60; &#x3D; 100%, &#x60;close&#x60; &#x3D; 0%, &#x60;comfort&#x60; &#x3D; 80%, and &#x60;vent&#x60; &#x3D; ~15%
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    OPEN("open"),
    
    CLOSE("close"),
    
    COMFORT("comfort"),
    
    VENT("vent"),
    
    MOVE("move");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("percent")
  private Double percent = null;

  public MovePanoRoofRequest state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The desired state of the panoramic roof. The approximate percent open values for each state are &#x60;open&#x60; &#x3D; 100%, &#x60;close&#x60; &#x3D; 0%, &#x60;comfort&#x60; &#x3D; 80%, and &#x60;vent&#x60; &#x3D; ~15%
   * @return state
  **/
  @ApiModelProperty(value = "The desired state of the panoramic roof. The approximate percent open values for each state are `open` = 100%, `close` = 0%, `comfort` = 80%, and `vent` = ~15%")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public MovePanoRoofRequest percent(Double percent) {
    this.percent = percent;
    return this;
  }

   /**
   * The percentage to move the roof to.
   * @return percent
  **/
  @ApiModelProperty(value = "The percentage to move the roof to.")
  public Double getPercent() {
    return percent;
  }

  public void setPercent(Double percent) {
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
    MovePanoRoofRequest movePanoRoofRequest = (MovePanoRoofRequest) o;
    return Objects.equals(this.state, movePanoRoofRequest.state) &&
        Objects.equals(this.percent, movePanoRoofRequest.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, percent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovePanoRoofRequest {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

