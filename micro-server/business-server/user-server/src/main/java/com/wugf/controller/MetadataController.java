package com.wugf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 获取元数据接口
 */
@RestController
public class MetadataController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "serverInfo", method = RequestMethod.GET)
    public List<ServiceInstance> serverInfo(String serverId) {
        return discoveryClient.getInstances(serverId);
    }
}
