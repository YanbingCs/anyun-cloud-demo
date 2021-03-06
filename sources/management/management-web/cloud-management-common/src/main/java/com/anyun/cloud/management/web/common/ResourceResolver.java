package com.anyun.cloud.management.web.common;

import javax.servlet.http.HttpServletRequest;

/**
 * @auth TwitchGG <twitchgg@yahoo.com>
 * @since 1.0.0 on 22/06/2017
 */
public interface ResourceResolver {

    /**
     *
     * @param request
     * @return
     */
    String resolve(HttpServletRequest request);
}
