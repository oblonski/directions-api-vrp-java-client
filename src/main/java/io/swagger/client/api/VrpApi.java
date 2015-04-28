package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.JobId;
import io.swagger.client.model.Request;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class VrpApi {
  private String basePath = "https://graphhopper.com/api/1/vrp";
  private ApiInvoker apiInvoker;

  public VrpApi(ApiInvoker apiInvoker) {
      this.apiInvoker = apiInvoker;
  }  

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Solves large routing problems
   * This endpoint solves large problems, i.e. traveling salesman or vehicle routing problems, and returns the solution.\n
   * @param key your API key
   * @param body Request object that contains the problem to be solved
   * @return JobId
   */
  public JobId postVrp (String key, Request body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/optimize".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (key != null)
      queryParams.put("key", ApiInvoker.parameterToString(key));
    
    
    String[] contentTypes = {
      "application/json",
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (JobId) ApiInvoker.deserialize(response, "", JobId.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
