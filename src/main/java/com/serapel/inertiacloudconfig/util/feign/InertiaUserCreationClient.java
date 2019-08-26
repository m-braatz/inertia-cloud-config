package com.serapel.inertiacloudconfig.util.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "inertia-user-creation-service")
public interface InertiaUserCreationClient {



}
