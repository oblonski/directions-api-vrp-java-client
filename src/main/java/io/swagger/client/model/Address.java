package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Address  {
  
  private String locationId = null;
  private Double lon = null;
  private Double lat = null;

  
  /**
   * Unique identifier of location
   **/
  @ApiModelProperty(value = "Unique identifier of location")
  @JsonProperty("location_id")
  public String getLocationId() {
    return locationId;
  }
  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  
  /**
   * longitude
   **/
  @ApiModelProperty(value = "longitude")
  @JsonProperty("lon")
  public Double getLon() {
    return lon;
  }
  public void setLon(Double lon) {
    this.lon = lon;
  }

  
  /**
   * latitude
   **/
  @ApiModelProperty(value = "latitude")
  @JsonProperty("lat")
  public Double getLat() {
    return lat;
  }
  public void setLat(Double lat) {
    this.lat = lat;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("  locationId: ").append(locationId).append("\n");
    sb.append("  lon: ").append(lon).append("\n");
    sb.append("  lat: ").append(lat).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
