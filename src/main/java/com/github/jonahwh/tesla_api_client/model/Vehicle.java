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
import java.util.ArrayList;
import java.util.List;

/**
 * Vehicle
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-15T23:06:21.774-07:00")
public class Vehicle {
  @SerializedName("color")
  private String color = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("option_codes")
  private String optionCodes = null;

  @SerializedName("vehicle_id")
  private String vehicleId = null;

  @SerializedName("vin")
  private String vin = null;

  @SerializedName("tokens")
  private List<String> tokens = null;

  @SerializedName("state")
  private String state = null;

  public Vehicle color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Vehicle displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Vehicle id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Vehicle optionCodes(String optionCodes) {
    this.optionCodes = optionCodes;
    return this;
  }

   /**
   * Get optionCodes
   * @return optionCodes
  **/
  @ApiModelProperty(value = "")
  public String getOptionCodes() {
    return optionCodes;
  }

  public void setOptionCodes(String optionCodes) {
    this.optionCodes = optionCodes;
  }

  public Vehicle vehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * Get vehicleId
   * @return vehicleId
  **/
  @ApiModelProperty(value = "")
  public String getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }

  public Vehicle vin(String vin) {
    this.vin = vin;
    return this;
  }

   /**
   * Get vin
   * @return vin
  **/
  @ApiModelProperty(value = "")
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public Vehicle tokens(List<String> tokens) {
    this.tokens = tokens;
    return this;
  }

  public Vehicle addTokensItem(String tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<String>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  @ApiModelProperty(value = "")
  public List<String> getTokens() {
    return tokens;
  }

  public void setTokens(List<String> tokens) {
    this.tokens = tokens;
  }

  public Vehicle state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.color, vehicle.color) &&
        Objects.equals(this.displayName, vehicle.displayName) &&
        Objects.equals(this.id, vehicle.id) &&
        Objects.equals(this.optionCodes, vehicle.optionCodes) &&
        Objects.equals(this.vehicleId, vehicle.vehicleId) &&
        Objects.equals(this.vin, vehicle.vin) &&
        Objects.equals(this.tokens, vehicle.tokens) &&
        Objects.equals(this.state, vehicle.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, displayName, id, optionCodes, vehicleId, vin, tokens, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    optionCodes: ").append(toIndentedString(optionCodes)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

