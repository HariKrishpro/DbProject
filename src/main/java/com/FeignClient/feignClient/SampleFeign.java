package com.FeignClient.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "ToDo" , url = "https://jsonplaceholder.typicode.com")
public interface SampleFeign {
    @RequestMapping(method = RequestMethod.GET ,consumes = MediaType.APPLICATION_JSON_VALUE , value = "/todo")
    List<TodoModel> getTodo();
}
