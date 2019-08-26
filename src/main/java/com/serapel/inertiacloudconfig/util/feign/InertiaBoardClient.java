package com.serapel.inertiacloudconfig.util.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(name = "inertia-board-service")
public interface InertiaBoardClient {



}
