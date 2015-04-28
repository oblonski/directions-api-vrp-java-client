package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class JobId  {
  
  private String jobId = null;

  
  /**
   * unique id for your job/request with which you can fetch your solution
   **/
  @ApiModelProperty(value = "unique id for your job/request with which you can fetch your solution")
  @JsonProperty("job_id")
  public String getJobId() {
    return jobId;
  }
  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobId {\n");
    
    sb.append("  jobId: ").append(jobId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
