package com.serapel.inertiacloudconfig.util.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name  = "inertia-document-creation-service")
public interface InertiaDocumentCreationClient {



}
