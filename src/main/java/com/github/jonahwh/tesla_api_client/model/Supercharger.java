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
import com.github.jonahwh.tesla_api_client.model.DestinationChargerLocation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Supercharger
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-17T13:53:36.587-08:00")
public class Supercharger {
  @SerializedName("location")
  private DestinationChargerLocation location = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = "supercharger";

  @SerializedName("distance_miles")
  private Double distanceMiles = null;

  @SerializedName("available_stalls")
  private BigDecimal availableStalls = null;

  @SerializedName("total_stalls")
  private BigDecimal totalStalls = null;

  @SerializedName("site_closed")
  private Boolean siteClosed = null;

  public Supercharger location(DestinationChargerLocation location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public DestinationChargerLocation getLocation() {
    return location;
  }

  public void setLocation(DestinationChargerLocation location) {
    this.location = location;
  }

  public Supercharger name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Supercharger type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Supercharger distanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
    return this;
  }

   /**
   * Get distanceMiles
   * @return distanceMiles
  **/
  @ApiModelProperty(value = "")
  public Double getDistanceMiles() {
    return distanceMiles;
  }

  public void setDistanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
  }

  public Supercharger availableStalls(BigDecimal availableStalls) {
    this.availableStalls = availableStalls;
    return this;
  }

   /**
   * Get availableStalls
   * @return availableStalls
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAvailableStalls() {
    return availableStalls;
  }

  public void setAvailableStalls(BigDecimal availableStalls) {
    this.availableStalls = availableStalls;
  }

  public Supercharger totalStalls(BigDecimal totalStalls) {
    this.totalStalls = totalStalls;
    return this;
  }

   /**
   * Get totalStalls
   * @return totalStalls
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalStalls() {
    return totalStalls;
  }

  public void setTotalStalls(BigDecimal totalStalls) {
    this.totalStalls = totalStalls;
  }

  public Supercharger siteClosed(Boolean siteClosed) {
    this.siteClosed = siteClosed;
    return this;
  }

   /**
   * Get siteClosed
   * @return siteClosed
  **/
  @ApiModelProperty(value = "")
  public Boolean isSiteClosed() {
    return siteClosed;
  }

  public void setSiteClosed(Boolean siteClosed) {
    this.siteClosed = siteClosed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Supercharger supercharger = (Supercharger) o;
    return Objects.equals(this.location, supercharger.location) &&
        Objects.equals(this.name, supercharger.name) &&
        Objects.equals(this.type, supercharger.type) &&
        Objects.equals(this.distanceMiles, supercharger.distanceMiles) &&
        Objects.equals(this.availableStalls, supercharger.availableStalls) &&
        Objects.equals(this.totalStalls, supercharger.totalStalls) &&
        Objects.equals(this.siteClosed, supercharger.siteClosed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, name, type, distanceMiles, availableStalls, totalStalls, siteClosed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Supercharger {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    distanceMiles: ").append(toIndentedString(distanceMiles)).append("\n");
    sb.append("    availableStalls: ").append(toIndentedString(availableStalls)).append("\n");
    sb.append("    totalStalls: ").append(toIndentedString(totalStalls)).append("\n");
    sb.append("    siteClosed: ").append(toIndentedString(siteClosed)).append("\n");
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

