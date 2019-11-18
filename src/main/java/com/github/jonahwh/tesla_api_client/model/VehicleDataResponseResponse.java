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
import com.github.jonahwh.tesla_api_client.model.ChargeState;
import com.github.jonahwh.tesla_api_client.model.ClimateState;
import com.github.jonahwh.tesla_api_client.model.DriveState;
import com.github.jonahwh.tesla_api_client.model.GuiState;
import com.github.jonahwh.tesla_api_client.model.VehicleConfig;
import com.github.jonahwh.tesla_api_client.model.VehicleState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * VehicleDataResponseResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-17T18:43:57.272-08:00")
public class VehicleDataResponseResponse {
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

  @SerializedName("user_id")
  private BigDecimal userId = null;

  @SerializedName("tokens")
  private List<String> tokens = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("in_service")
  private Boolean inService = null;

  @SerializedName("id_s")
  private String idS = null;

  @SerializedName("calendar_enabled")
  private Boolean calendarEnabled = null;

  @SerializedName("backseat_token")
  private String backseatToken = null;

  @SerializedName("backseat_token_updated_at")
  private BigDecimal backseatTokenUpdatedAt = null;

  @SerializedName("gui_settings")
  private GuiState guiSettings = null;

  @SerializedName("climate_state")
  private ClimateState climateState = null;

  @SerializedName("drive_state")
  private DriveState driveState = null;

  @SerializedName("vehicle_state")
  private VehicleState vehicleState = null;

  @SerializedName("charge_state")
  private ChargeState chargeState = null;

  @SerializedName("vehicle_config")
  private VehicleConfig vehicleConfig = null;

  public VehicleDataResponseResponse color(String color) {
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

  public VehicleDataResponseResponse displayName(String displayName) {
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

  public VehicleDataResponseResponse id(String id) {
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

  public VehicleDataResponseResponse optionCodes(String optionCodes) {
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

  public VehicleDataResponseResponse vehicleId(String vehicleId) {
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

  public VehicleDataResponseResponse vin(String vin) {
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

  public VehicleDataResponseResponse userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public VehicleDataResponseResponse tokens(List<String> tokens) {
    this.tokens = tokens;
    return this;
  }

  public VehicleDataResponseResponse addTokensItem(String tokensItem) {
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

  public VehicleDataResponseResponse state(String state) {
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

  public VehicleDataResponseResponse inService(Boolean inService) {
    this.inService = inService;
    return this;
  }

   /**
   * Get inService
   * @return inService
  **/
  @ApiModelProperty(value = "")
  public Boolean isInService() {
    return inService;
  }

  public void setInService(Boolean inService) {
    this.inService = inService;
  }

  public VehicleDataResponseResponse idS(String idS) {
    this.idS = idS;
    return this;
  }

   /**
   * Get idS
   * @return idS
  **/
  @ApiModelProperty(value = "")
  public String getIdS() {
    return idS;
  }

  public void setIdS(String idS) {
    this.idS = idS;
  }

  public VehicleDataResponseResponse calendarEnabled(Boolean calendarEnabled) {
    this.calendarEnabled = calendarEnabled;
    return this;
  }

   /**
   * Get calendarEnabled
   * @return calendarEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isCalendarEnabled() {
    return calendarEnabled;
  }

  public void setCalendarEnabled(Boolean calendarEnabled) {
    this.calendarEnabled = calendarEnabled;
  }

  public VehicleDataResponseResponse backseatToken(String backseatToken) {
    this.backseatToken = backseatToken;
    return this;
  }

   /**
   * Get backseatToken
   * @return backseatToken
  **/
  @ApiModelProperty(value = "")
  public String getBackseatToken() {
    return backseatToken;
  }

  public void setBackseatToken(String backseatToken) {
    this.backseatToken = backseatToken;
  }

  public VehicleDataResponseResponse backseatTokenUpdatedAt(BigDecimal backseatTokenUpdatedAt) {
    this.backseatTokenUpdatedAt = backseatTokenUpdatedAt;
    return this;
  }

   /**
   * Get backseatTokenUpdatedAt
   * @return backseatTokenUpdatedAt
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getBackseatTokenUpdatedAt() {
    return backseatTokenUpdatedAt;
  }

  public void setBackseatTokenUpdatedAt(BigDecimal backseatTokenUpdatedAt) {
    this.backseatTokenUpdatedAt = backseatTokenUpdatedAt;
  }

  public VehicleDataResponseResponse guiSettings(GuiState guiSettings) {
    this.guiSettings = guiSettings;
    return this;
  }

   /**
   * Get guiSettings
   * @return guiSettings
  **/
  @ApiModelProperty(value = "")
  public GuiState getGuiSettings() {
    return guiSettings;
  }

  public void setGuiSettings(GuiState guiSettings) {
    this.guiSettings = guiSettings;
  }

  public VehicleDataResponseResponse climateState(ClimateState climateState) {
    this.climateState = climateState;
    return this;
  }

   /**
   * Get climateState
   * @return climateState
  **/
  @ApiModelProperty(value = "")
  public ClimateState getClimateState() {
    return climateState;
  }

  public void setClimateState(ClimateState climateState) {
    this.climateState = climateState;
  }

  public VehicleDataResponseResponse driveState(DriveState driveState) {
    this.driveState = driveState;
    return this;
  }

   /**
   * Get driveState
   * @return driveState
  **/
  @ApiModelProperty(value = "")
  public DriveState getDriveState() {
    return driveState;
  }

  public void setDriveState(DriveState driveState) {
    this.driveState = driveState;
  }

  public VehicleDataResponseResponse vehicleState(VehicleState vehicleState) {
    this.vehicleState = vehicleState;
    return this;
  }

   /**
   * Get vehicleState
   * @return vehicleState
  **/
  @ApiModelProperty(value = "")
  public VehicleState getVehicleState() {
    return vehicleState;
  }

  public void setVehicleState(VehicleState vehicleState) {
    this.vehicleState = vehicleState;
  }

  public VehicleDataResponseResponse chargeState(ChargeState chargeState) {
    this.chargeState = chargeState;
    return this;
  }

   /**
   * Get chargeState
   * @return chargeState
  **/
  @ApiModelProperty(value = "")
  public ChargeState getChargeState() {
    return chargeState;
  }

  public void setChargeState(ChargeState chargeState) {
    this.chargeState = chargeState;
  }

  public VehicleDataResponseResponse vehicleConfig(VehicleConfig vehicleConfig) {
    this.vehicleConfig = vehicleConfig;
    return this;
  }

   /**
   * Get vehicleConfig
   * @return vehicleConfig
  **/
  @ApiModelProperty(value = "")
  public VehicleConfig getVehicleConfig() {
    return vehicleConfig;
  }

  public void setVehicleConfig(VehicleConfig vehicleConfig) {
    this.vehicleConfig = vehicleConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleDataResponseResponse vehicleDataResponseResponse = (VehicleDataResponseResponse) o;
    return Objects.equals(this.color, vehicleDataResponseResponse.color) &&
        Objects.equals(this.displayName, vehicleDataResponseResponse.displayName) &&
        Objects.equals(this.id, vehicleDataResponseResponse.id) &&
        Objects.equals(this.optionCodes, vehicleDataResponseResponse.optionCodes) &&
        Objects.equals(this.vehicleId, vehicleDataResponseResponse.vehicleId) &&
        Objects.equals(this.vin, vehicleDataResponseResponse.vin) &&
        Objects.equals(this.userId, vehicleDataResponseResponse.userId) &&
        Objects.equals(this.tokens, vehicleDataResponseResponse.tokens) &&
        Objects.equals(this.state, vehicleDataResponseResponse.state) &&
        Objects.equals(this.inService, vehicleDataResponseResponse.inService) &&
        Objects.equals(this.idS, vehicleDataResponseResponse.idS) &&
        Objects.equals(this.calendarEnabled, vehicleDataResponseResponse.calendarEnabled) &&
        Objects.equals(this.backseatToken, vehicleDataResponseResponse.backseatToken) &&
        Objects.equals(this.backseatTokenUpdatedAt, vehicleDataResponseResponse.backseatTokenUpdatedAt) &&
        Objects.equals(this.guiSettings, vehicleDataResponseResponse.guiSettings) &&
        Objects.equals(this.climateState, vehicleDataResponseResponse.climateState) &&
        Objects.equals(this.driveState, vehicleDataResponseResponse.driveState) &&
        Objects.equals(this.vehicleState, vehicleDataResponseResponse.vehicleState) &&
        Objects.equals(this.chargeState, vehicleDataResponseResponse.chargeState) &&
        Objects.equals(this.vehicleConfig, vehicleDataResponseResponse.vehicleConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, displayName, id, optionCodes, vehicleId, vin, userId, tokens, state, inService, idS, calendarEnabled, backseatToken, backseatTokenUpdatedAt, guiSettings, climateState, driveState, vehicleState, chargeState, vehicleConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleDataResponseResponse {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    optionCodes: ").append(toIndentedString(optionCodes)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    inService: ").append(toIndentedString(inService)).append("\n");
    sb.append("    idS: ").append(toIndentedString(idS)).append("\n");
    sb.append("    calendarEnabled: ").append(toIndentedString(calendarEnabled)).append("\n");
    sb.append("    backseatToken: ").append(toIndentedString(backseatToken)).append("\n");
    sb.append("    backseatTokenUpdatedAt: ").append(toIndentedString(backseatTokenUpdatedAt)).append("\n");
    sb.append("    guiSettings: ").append(toIndentedString(guiSettings)).append("\n");
    sb.append("    climateState: ").append(toIndentedString(climateState)).append("\n");
    sb.append("    driveState: ").append(toIndentedString(driveState)).append("\n");
    sb.append("    vehicleState: ").append(toIndentedString(vehicleState)).append("\n");
    sb.append("    chargeState: ").append(toIndentedString(chargeState)).append("\n");
    sb.append("    vehicleConfig: ").append(toIndentedString(vehicleConfig)).append("\n");
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

