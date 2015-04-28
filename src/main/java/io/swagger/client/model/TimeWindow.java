package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class TimeWindow  {
  
  private Long earliest = null;
  private Long latest = null;

  
  /**
   * earliest start time of corresponding activity
   **/
  @ApiModelProperty(value = "earliest start time of corresponding activity")
  @JsonProperty("earliest")
  public Long getEarliest() {
    return earliest;
  }
  public void setEarliest(Long earliest) {
    this.earliest = earliest;
  }

  
  /**
   * latest start time of corresponding activity
   **/
  @ApiModelProperty(value = "latest start time of corresponding activity")
  @JsonProperty("latest")
  public Long getLatest() {
    return latest;
  }
  public void setLatest(Long latest) {
    this.latest = latest;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeWindow {\n");
    
    sb.append("  earliest: ").append(earliest).append("\n");
    sb.append("  latest: ").append(latest).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
