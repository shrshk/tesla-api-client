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
import java.math.BigDecimal;

/**
 * VehicleState
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-25T15:58:56.308-07:00")
public class VehicleState {
  @SerializedName("api_version")
  private Integer apiVersion = null;

  @SerializedName("autopark_state")
  private String autoparkState = null;

  @SerializedName("autopark_state_v2")
  private String autoparkStateV2 = null;

  @SerializedName("autopark_style")
  private String autoparkStyle = null;

  @SerializedName("calendar_supported")
  private Boolean calendarSupported = null;

  @SerializedName("car_version")
  private String carVersion = null;

  @SerializedName("center_display_state")
  private Integer centerDisplayState = null;

  @SerializedName("df")
  private Integer df = null;

  @SerializedName("dr")
  private Integer dr = null;

  @SerializedName("ft")
  private Integer ft = null;

  @SerializedName("homelink_nearby")
  private Boolean homelinkNearby = null;

  @SerializedName("last_autopark_error")
  private String lastAutoparkError = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("notifications_supported")
  private Boolean notificationsSupported = null;

  @SerializedName("odometer")
  private Double odometer = null;

  @SerializedName("parsed_calendar_supported")
  private Boolean parsedCalendarSupported = null;

  @SerializedName("pf")
  private Integer pf = null;

  @SerializedName("pr")
  private Integer pr = null;

  @SerializedName("remote_start")
  private Boolean remoteStart = null;

  @SerializedName("remote_start_supported")
  private Boolean remoteStartSupported = null;

  @SerializedName("rt")
  private Integer rt = null;

  @SerializedName("sun_roof_percent_open")
  private Integer sunRoofPercentOpen = null;

  @SerializedName("sun_roof_state")
  private String sunRoofState = null;

  @SerializedName("timestamp")
  private BigDecimal timestamp = null;

  @SerializedName("valet_mode")
  private Boolean valetMode = null;

  @SerializedName("vehicle_name")
  private String vehicleName = null;

  public VehicleState apiVersion(Integer apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Get apiVersion
   * @return apiVersion
  **/
  @ApiModelProperty(value = "")
  public Integer getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(Integer apiVersion) {
    this.apiVersion = apiVersion;
  }

  public VehicleState autoparkState(String autoparkState) {
    this.autoparkState = autoparkState;
    return this;
  }

   /**
   * Get autoparkState
   * @return autoparkState
  **/
  @ApiModelProperty(value = "")
  public String getAutoparkState() {
    return autoparkState;
  }

  public void setAutoparkState(String autoparkState) {
    this.autoparkState = autoparkState;
  }

  public VehicleState autoparkStateV2(String autoparkStateV2) {
    this.autoparkStateV2 = autoparkStateV2;
    return this;
  }

   /**
   * Get autoparkStateV2
   * @return autoparkStateV2
  **/
  @ApiModelProperty(value = "")
  public String getAutoparkStateV2() {
    return autoparkStateV2;
  }

  public void setAutoparkStateV2(String autoparkStateV2) {
    this.autoparkStateV2 = autoparkStateV2;
  }

  public VehicleState autoparkStyle(String autoparkStyle) {
    this.autoparkStyle = autoparkStyle;
    return this;
  }

   /**
   * Get autoparkStyle
   * @return autoparkStyle
  **/
  @ApiModelProperty(value = "")
  public String getAutoparkStyle() {
    return autoparkStyle;
  }

  public void setAutoparkStyle(String autoparkStyle) {
    this.autoparkStyle = autoparkStyle;
  }

  public VehicleState calendarSupported(Boolean calendarSupported) {
    this.calendarSupported = calendarSupported;
    return this;
  }

   /**
   * Get calendarSupported
   * @return calendarSupported
  **/
  @ApiModelProperty(value = "")
  public Boolean isCalendarSupported() {
    return calendarSupported;
  }

  public void setCalendarSupported(Boolean calendarSupported) {
    this.calendarSupported = calendarSupported;
  }

  public VehicleState carVersion(String carVersion) {
    this.carVersion = carVersion;
    return this;
  }

   /**
   * Get carVersion
   * @return carVersion
  **/
  @ApiModelProperty(value = "")
  public String getCarVersion() {
    return carVersion;
  }

  public void setCarVersion(String carVersion) {
    this.carVersion = carVersion;
  }

  public VehicleState centerDisplayState(Integer centerDisplayState) {
    this.centerDisplayState = centerDisplayState;
    return this;
  }

   /**
   * Get centerDisplayState
   * @return centerDisplayState
  **/
  @ApiModelProperty(value = "")
  public Integer getCenterDisplayState() {
    return centerDisplayState;
  }

  public void setCenterDisplayState(Integer centerDisplayState) {
    this.centerDisplayState = centerDisplayState;
  }

  public VehicleState df(Integer df) {
    this.df = df;
    return this;
  }

   /**
   * Get df
   * @return df
  **/
  @ApiModelProperty(value = "")
  public Integer getDf() {
    return df;
  }

  public void setDf(Integer df) {
    this.df = df;
  }

  public VehicleState dr(Integer dr) {
    this.dr = dr;
    return this;
  }

   /**
   * Get dr
   * @return dr
  **/
  @ApiModelProperty(value = "")
  public Integer getDr() {
    return dr;
  }

  public void setDr(Integer dr) {
    this.dr = dr;
  }

  public VehicleState ft(Integer ft) {
    this.ft = ft;
    return this;
  }

   /**
   * Get ft
   * @return ft
  **/
  @ApiModelProperty(value = "")
  public Integer getFt() {
    return ft;
  }

  public void setFt(Integer ft) {
    this.ft = ft;
  }

  public VehicleState homelinkNearby(Boolean homelinkNearby) {
    this.homelinkNearby = homelinkNearby;
    return this;
  }

   /**
   * Get homelinkNearby
   * @return homelinkNearby
  **/
  @ApiModelProperty(value = "")
  public Boolean isHomelinkNearby() {
    return homelinkNearby;
  }

  public void setHomelinkNearby(Boolean homelinkNearby) {
    this.homelinkNearby = homelinkNearby;
  }

  public VehicleState lastAutoparkError(String lastAutoparkError) {
    this.lastAutoparkError = lastAutoparkError;
    return this;
  }

   /**
   * Get lastAutoparkError
   * @return lastAutoparkError
  **/
  @ApiModelProperty(value = "")
  public String getLastAutoparkError() {
    return lastAutoparkError;
  }

  public void setLastAutoparkError(String lastAutoparkError) {
    this.lastAutoparkError = lastAutoparkError;
  }

  public VehicleState locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @ApiModelProperty(value = "")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public VehicleState notificationsSupported(Boolean notificationsSupported) {
    this.notificationsSupported = notificationsSupported;
    return this;
  }

   /**
   * Get notificationsSupported
   * @return notificationsSupported
  **/
  @ApiModelProperty(value = "")
  public Boolean isNotificationsSupported() {
    return notificationsSupported;
  }

  public void setNotificationsSupported(Boolean notificationsSupported) {
    this.notificationsSupported = notificationsSupported;
  }

  public VehicleState odometer(Double odometer) {
    this.odometer = odometer;
    return this;
  }

   /**
   * Get odometer
   * @return odometer
  **/
  @ApiModelProperty(value = "")
  public Double getOdometer() {
    return odometer;
  }

  public void setOdometer(Double odometer) {
    this.odometer = odometer;
  }

  public VehicleState parsedCalendarSupported(Boolean parsedCalendarSupported) {
    this.parsedCalendarSupported = parsedCalendarSupported;
    return this;
  }

   /**
   * Get parsedCalendarSupported
   * @return parsedCalendarSupported
  **/
  @ApiModelProperty(value = "")
  public Boolean isParsedCalendarSupported() {
    return parsedCalendarSupported;
  }

  public void setParsedCalendarSupported(Boolean parsedCalendarSupported) {
    this.parsedCalendarSupported = parsedCalendarSupported;
  }

  public VehicleState pf(Integer pf) {
    this.pf = pf;
    return this;
  }

   /**
   * Get pf
   * @return pf
  **/
  @ApiModelProperty(value = "")
  public Integer getPf() {
    return pf;
  }

  public void setPf(Integer pf) {
    this.pf = pf;
  }

  public VehicleState pr(Integer pr) {
    this.pr = pr;
    return this;
  }

   /**
   * Get pr
   * @return pr
  **/
  @ApiModelProperty(value = "")
  public Integer getPr() {
    return pr;
  }

  public void setPr(Integer pr) {
    this.pr = pr;
  }

  public VehicleState remoteStart(Boolean remoteStart) {
    this.remoteStart = remoteStart;
    return this;
  }

   /**
   * Get remoteStart
   * @return remoteStart
  **/
  @ApiModelProperty(value = "")
  public Boolean isRemoteStart() {
    return remoteStart;
  }

  public void setRemoteStart(Boolean remoteStart) {
    this.remoteStart = remoteStart;
  }

  public VehicleState remoteStartSupported(Boolean remoteStartSupported) {
    this.remoteStartSupported = remoteStartSupported;
    return this;
  }

   /**
   * Get remoteStartSupported
   * @return remoteStartSupported
  **/
  @ApiModelProperty(value = "")
  public Boolean isRemoteStartSupported() {
    return remoteStartSupported;
  }

  public void setRemoteStartSupported(Boolean remoteStartSupported) {
    this.remoteStartSupported = remoteStartSupported;
  }

  public VehicleState rt(Integer rt) {
    this.rt = rt;
    return this;
  }

   /**
   * Get rt
   * @return rt
  **/
  @ApiModelProperty(value = "")
  public Integer getRt() {
    return rt;
  }

  public void setRt(Integer rt) {
    this.rt = rt;
  }

  public VehicleState sunRoofPercentOpen(Integer sunRoofPercentOpen) {
    this.sunRoofPercentOpen = sunRoofPercentOpen;
    return this;
  }

   /**
   * Get sunRoofPercentOpen
   * @return sunRoofPercentOpen
  **/
  @ApiModelProperty(value = "")
  public Integer getSunRoofPercentOpen() {
    return sunRoofPercentOpen;
  }

  public void setSunRoofPercentOpen(Integer sunRoofPercentOpen) {
    this.sunRoofPercentOpen = sunRoofPercentOpen;
  }

  public VehicleState sunRoofState(String sunRoofState) {
    this.sunRoofState = sunRoofState;
    return this;
  }

   /**
   * Get sunRoofState
   * @return sunRoofState
  **/
  @ApiModelProperty(value = "")
  public String getSunRoofState() {
    return sunRoofState;
  }

  public void setSunRoofState(String sunRoofState) {
    this.sunRoofState = sunRoofState;
  }

  public VehicleState timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  public VehicleState valetMode(Boolean valetMode) {
    this.valetMode = valetMode;
    return this;
  }

   /**
   * Get valetMode
   * @return valetMode
  **/
  @ApiModelProperty(value = "")
  public Boolean isValetMode() {
    return valetMode;
  }

  public void setValetMode(Boolean valetMode) {
    this.valetMode = valetMode;
  }

  public VehicleState vehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
    return this;
  }

   /**
   * Get vehicleName
   * @return vehicleName
  **/
  @ApiModelProperty(value = "")
  public String getVehicleName() {
    return vehicleName;
  }

  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleState vehicleState = (VehicleState) o;
    return Objects.equals(this.apiVersion, vehicleState.apiVersion) &&
        Objects.equals(this.autoparkState, vehicleState.autoparkState) &&
        Objects.equals(this.autoparkStateV2, vehicleState.autoparkStateV2) &&
        Objects.equals(this.autoparkStyle, vehicleState.autoparkStyle) &&
        Objects.equals(this.calendarSupported, vehicleState.calendarSupported) &&
        Objects.equals(this.carVersion, vehicleState.carVersion) &&
        Objects.equals(this.centerDisplayState, vehicleState.centerDisplayState) &&
        Objects.equals(this.df, vehicleState.df) &&
        Objects.equals(this.dr, vehicleState.dr) &&
        Objects.equals(this.ft, vehicleState.ft) &&
        Objects.equals(this.homelinkNearby, vehicleState.homelinkNearby) &&
        Objects.equals(this.lastAutoparkError, vehicleState.lastAutoparkError) &&
        Objects.equals(this.locked, vehicleState.locked) &&
        Objects.equals(this.notificationsSupported, vehicleState.notificationsSupported) &&
        Objects.equals(this.odometer, vehicleState.odometer) &&
        Objects.equals(this.parsedCalendarSupported, vehicleState.parsedCalendarSupported) &&
        Objects.equals(this.pf, vehicleState.pf) &&
        Objects.equals(this.pr, vehicleState.pr) &&
        Objects.equals(this.remoteStart, vehicleState.remoteStart) &&
        Objects.equals(this.remoteStartSupported, vehicleState.remoteStartSupported) &&
        Objects.equals(this.rt, vehicleState.rt) &&
        Objects.equals(this.sunRoofPercentOpen, vehicleState.sunRoofPercentOpen) &&
        Objects.equals(this.sunRoofState, vehicleState.sunRoofState) &&
        Objects.equals(this.timestamp, vehicleState.timestamp) &&
        Objects.equals(this.valetMode, vehicleState.valetMode) &&
        Objects.equals(this.vehicleName, vehicleState.vehicleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, autoparkState, autoparkStateV2, autoparkStyle, calendarSupported, carVersion, centerDisplayState, df, dr, ft, homelinkNearby, lastAutoparkError, locked, notificationsSupported, odometer, parsedCalendarSupported, pf, pr, remoteStart, remoteStartSupported, rt, sunRoofPercentOpen, sunRoofState, timestamp, valetMode, vehicleName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleState {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    autoparkState: ").append(toIndentedString(autoparkState)).append("\n");
    sb.append("    autoparkStateV2: ").append(toIndentedString(autoparkStateV2)).append("\n");
    sb.append("    autoparkStyle: ").append(toIndentedString(autoparkStyle)).append("\n");
    sb.append("    calendarSupported: ").append(toIndentedString(calendarSupported)).append("\n");
    sb.append("    carVersion: ").append(toIndentedString(carVersion)).append("\n");
    sb.append("    centerDisplayState: ").append(toIndentedString(centerDisplayState)).append("\n");
    sb.append("    df: ").append(toIndentedString(df)).append("\n");
    sb.append("    dr: ").append(toIndentedString(dr)).append("\n");
    sb.append("    ft: ").append(toIndentedString(ft)).append("\n");
    sb.append("    homelinkNearby: ").append(toIndentedString(homelinkNearby)).append("\n");
    sb.append("    lastAutoparkError: ").append(toIndentedString(lastAutoparkError)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    notificationsSupported: ").append(toIndentedString(notificationsSupported)).append("\n");
    sb.append("    odometer: ").append(toIndentedString(odometer)).append("\n");
    sb.append("    parsedCalendarSupported: ").append(toIndentedString(parsedCalendarSupported)).append("\n");
    sb.append("    pf: ").append(toIndentedString(pf)).append("\n");
    sb.append("    pr: ").append(toIndentedString(pr)).append("\n");
    sb.append("    remoteStart: ").append(toIndentedString(remoteStart)).append("\n");
    sb.append("    remoteStartSupported: ").append(toIndentedString(remoteStartSupported)).append("\n");
    sb.append("    rt: ").append(toIndentedString(rt)).append("\n");
    sb.append("    sunRoofPercentOpen: ").append(toIndentedString(sunRoofPercentOpen)).append("\n");
    sb.append("    sunRoofState: ").append(toIndentedString(sunRoofState)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    valetMode: ").append(toIndentedString(valetMode)).append("\n");
    sb.append("    vehicleName: ").append(toIndentedString(vehicleName)).append("\n");
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

