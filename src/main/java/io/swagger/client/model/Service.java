package io.swagger.client.model;

import io.swagger.client.model.TimeWindow;
import io.swagger.client.model.Address;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Service  {
  
  private String id = null;
  public enum TypeEnum {
     service, 
  };
  private TypeEnum type = null;
  private Address address = null;
  private Long duration = null;
  private List<TimeWindow> timeWindows = new ArrayList<TimeWindow>() ;

  
  /**
   * Unique identifier of service
   **/
  @ApiModelProperty(value = "Unique identifier of service")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * type of service
   **/
  @ApiModelProperty(value = "type of service")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }

  
  /**
   * duration of service, i.e. time in ms the corresponding activity takes
   **/
  @ApiModelProperty(value = "duration of service, i.e. time in ms the corresponding activity takes")
  @JsonProperty("duration")
  public Long getDuration() {
    return duration;
  }
  public void setDuration(Long duration) {
    this.duration = duration;
  }

  
  /**
   * array of time windows. currently, only a single time window is allowed
   **/
  @ApiModelProperty(value = "array of time windows. currently, only a single time window is allowed")
  @JsonProperty("time_windows")
  public List<TimeWindow> getTimeWindows() {
    return timeWindows;
  }
  public void setTimeWindows(List<TimeWindow> timeWindows) {
    this.timeWindows = timeWindows;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  duration: ").append(duration).append("\n");
    sb.append("  timeWindows: ").append(timeWindows).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
