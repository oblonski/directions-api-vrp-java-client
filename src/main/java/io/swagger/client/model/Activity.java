package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Activity  {
  
  public enum TypeEnum {
     start,  end,  service, 
  };
  private TypeEnum type = null;
  private String id = null;
  private String locationId = null;
  private Long arrTime = null;
  private Long endTime = null;

  
  /**
   * type of activity
   **/
  @ApiModelProperty(value = "type of activity")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * id referring to the underlying service or shipment, i.e. the shipment or service this activity belongs to
   **/
  @ApiModelProperty(value = "id referring to the underlying service or shipment, i.e. the shipment or service this activity belongs to")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * id that refers to address
   **/
  @ApiModelProperty(value = "id that refers to address")
  @JsonProperty("location_id")
  public String getLocationId() {
    return locationId;
  }
  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  
  /**
   * arrival time at this activity in ms
   **/
  @ApiModelProperty(value = "arrival time at this activity in ms")
  @JsonProperty("arr_time")
  public Long getArrTime() {
    return arrTime;
  }
  public void setArrTime(Long arrTime) {
    this.arrTime = arrTime;
  }

  
  /**
   * end time of and thus departure time at this activity
   **/
  @ApiModelProperty(value = "end time of and thus departure time at this activity")
  @JsonProperty("end_time")
  public Long getEndTime() {
    return endTime;
  }
  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  locationId: ").append(locationId).append("\n");
    sb.append("  arrTime: ").append(arrTime).append("\n");
    sb.append("  endTime: ").append(endTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
