package com.anyun.cloud.demo.api.management.raml;

import org.raml.v2.api.model.v10.api.Api;

/**
 * @auth TwitchGG <twitchgg@yahoo.com>
 * @since 1.0.0 on 23/05/2017
 */
public interface RamlApiRamlParser {

    /**
     *
     * @param raml
     * @return
     */
    DefaultApiRamlParser withRamlString(String raml);

    /**
     *
     * @param encoding
     * @return
     */
    DefaultApiRamlParser withEncoding(String encoding);

    /**
     *
     * @return
     * @throws Exception
     */
    Api buildV10Api() throws Exception;

    /**
     *
     * @return
     * @throws Exception
     */
    RamlApiEntity buildApi() throws Exception;
}
