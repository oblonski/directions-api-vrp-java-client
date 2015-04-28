package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class LargeResponse  {
  
  private String jobId = null;
  public enum StatusEnum {
     waiting_in_queue,  processing,  finished, 
  };
  private StatusEnum status = null;
  private Long waitingInQueue = null;
  private Long processingTime = null;

  
  /**
   * unique identify of job - which you get when posting your request to the large problem solver
   **/
  @ApiModelProperty(value = "unique identify of job - which you get when posting your request to the large problem solver")
  @JsonProperty("job_id")
  public String getJobId() {
    return jobId;
  }
  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  
  /**
   * indicates the current status of the job
   **/
  @ApiModelProperty(value = "indicates the current status of the job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * waiting time in ms
   **/
  @ApiModelProperty(value = "waiting time in ms")
  @JsonProperty("waiting_in_queue")
  public Long getWaitingInQueue() {
    return waitingInQueue;
  }
  public void setWaitingInQueue(Long waitingInQueue) {
    this.waitingInQueue = waitingInQueue;
  }

  
  /**
   * processing time in ms. if job is still waiting in queue, processing_time is 0
   **/
  @ApiModelProperty(value = "processing time in ms. if job is still waiting in queue, processing_time is 0")
  @JsonProperty("processing_time")
  public Long getProcessingTime() {
    return processingTime;
  }
  public void setProcessingTime(Long processingTime) {
    this.processingTime = processingTime;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LargeResponse {\n");
    
    sb.append("  jobId: ").append(jobId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  waitingInQueue: ").append(waitingInQueue).append("\n");
    sb.append("  processingTime: ").append(processingTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
