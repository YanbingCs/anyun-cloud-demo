package com.anyun.cloud.demo.common.etcd.client;

import okhttp3.*;

import java.io.IOException;

/**
 * @auth TwitchGG <twitchgg@yahoo.com>
 * @since 1.0.0 on 2017/5/18
 */
public class HttpRestfullyApiClient {
    public static final MediaType JSON
            = MediaType.parse("html/text; charset=utf-8");
    private ClientConfig config;
    private OkHttpClient client;

    public HttpRestfullyApiClient(ClientConfig config) {
        this.config = config;
        client = new OkHttpClient();
    }

    public String get(String url) throws IOException {
        url = config.getEtcdBaseUrl() + "/" + url;
        Request request = new Request.Builder()
                .get()
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    String post(String url, String json) throws IOException {
        url = config.getEtcdBaseUrl() + "/" + url;
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
