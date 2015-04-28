package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class VehicleType  {
  
  private String typeId = null;
  public enum ProfileEnum {
     car,  bike,  foot, 
  };
  private ProfileEnum profile = null;
  private Double distanceDependentCosts = null;
  private Double timeDependentCosts = null;

  
  /**
   * Unique identifier for the vehicle type
   **/
  @ApiModelProperty(value = "Unique identifier for the vehicle type")
  @JsonProperty("type_id")
  public String getTypeId() {
    return typeId;
  }
  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  
  /**
   * Profile of vehicle type
   **/
  @ApiModelProperty(value = "Profile of vehicle type")
  @JsonProperty("profile")
  public ProfileEnum getProfile() {
    return profile;
  }
  public void setProfile(ProfileEnum profile) {
    this.profile = profile;
  }

  
  /**
   * cost factor of distance
   **/
  @ApiModelProperty(value = "cost factor of distance")
  @JsonProperty("distance_dependent_costs")
  public Double getDistanceDependentCosts() {
    return distanceDependentCosts;
  }
  public void setDistanceDependentCosts(Double distanceDependentCosts) {
    this.distanceDependentCosts = distanceDependentCosts;
  }

  
  /**
   * cost factor of time
   **/
  @ApiModelProperty(value = "cost factor of time")
  @JsonProperty("time_dependent_costs")
  public Double getTimeDependentCosts() {
    return timeDependentCosts;
  }
  public void setTimeDependentCosts(Double timeDependentCosts) {
    this.timeDependentCosts = timeDependentCosts;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleType {\n");
    
    sb.append("  typeId: ").append(typeId).append("\n");
    sb.append("  profile: ").append(profile).append("\n");
    sb.append("  distanceDependentCosts: ").append(distanceDependentCosts).append("\n");
    sb.append("  timeDependentCosts: ").append(timeDependentCosts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
