package io.swagger.client.model;

import io.swagger.client.model.Service;
import io.swagger.client.model.VehicleType;
import java.util.*;
import io.swagger.client.model.Vehicle;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Request  {
  
  private List<Vehicle> vehicles = new ArrayList<Vehicle>() ;
  private List<VehicleType> vehicleTypes = new ArrayList<VehicleType>() ;
  private List<Service> services = new ArrayList<Service>() ;

  
  /**
   * An array of vehicles that can be employed
   **/
  @ApiModelProperty(value = "An array of vehicles that can be employed")
  @JsonProperty("vehicles")
  public List<Vehicle> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  
  /**
   * An array of vehicle types
   **/
  @ApiModelProperty(value = "An array of vehicle types")
  @JsonProperty("vehicle_types")
  public List<VehicleType> getVehicleTypes() {
    return vehicleTypes;
  }
  public void setVehicleTypes(List<VehicleType> vehicleTypes) {
    this.vehicleTypes = vehicleTypes;
  }

  
  /**
   * An array of services
   **/
  @ApiModelProperty(value = "An array of services")
  @JsonProperty("services")
  public List<Service> getServices() {
    return services;
  }
  public void setServices(List<Service> services) {
    this.services = services;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Request {\n");
    
    sb.append("  vehicles: ").append(vehicles).append("\n");
    sb.append("  vehicleTypes: ").append(vehicleTypes).append("\n");
    sb.append("  services: ").append(services).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
