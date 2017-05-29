package com.anyun.cloud.demo.api.management;

import com.anyun.cloud.demo.api.management.module.*;
import com.anyun.common.lang.http.ApiServer;
import com.anyun.cloud.demo.common.registry.service.RegistryBindingModule;
import com.anyun.common.lang.bean.InjectorsBuilder;

/**
 * @auth TwitchGG <twitchgg@yahoo.com>
 * @since 1.0.0 on 22/05/2017
 */
public class Main {
    public static void main(String[] args) throws Exception {
        InjectorsBuilder.getBuilder().build(
                new CommonBindingModule(),
                new EtcdApiClientBindingModule(),
                new RegistryBindingModule(),
                new HttpApiServerBindingModule(),
                new ServiceBindingModule());
        ApiServer server = InjectorsBuilder.getBuilder().getInstanceByType(ApiServer.class);
        server.start();
    }
}