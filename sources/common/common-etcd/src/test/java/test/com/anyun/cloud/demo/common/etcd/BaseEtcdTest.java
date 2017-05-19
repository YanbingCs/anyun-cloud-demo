package test.com.anyun.cloud.demo.common.etcd;

import com.anyun.cloud.demo.common.etcd.client.ClientConfig;
import com.anyun.cloud.demo.common.etcd.client.HttpRestfullyApiClient;
import com.anyun.cloud.demo.common.etcd.client.HttpRestfullyApiClientBuilder;
import com.anyun.common.lang.NetworkUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @auth TwitchGG <twitchgg@yahoo.com>
 * @since 1.0.0 on 2017/5/19
 */
public class BaseEtcdTest extends Assert {
    private static final String BASE_URL="http://etcd.dev.hohhot.ga.gov:2379/v2";
    private HttpRestfullyApiClientBuilder clientBuilder;
    private HttpRestfullyApiClient client;

    @Before
    public void befor() throws Exception {
        ClientConfig config = new ClientConfig();
        config.setEtcdBaseUrl(BASE_URL);
        clientBuilder = new HttpRestfullyApiClientBuilder(config);
        client = clientBuilder.build();
    }

    @Test
    public void test1() throws Exception{
        System.out.println(NetworkUtils.isAddressAvailable("etcd1.dev.hohhot.ga.gov"));
        String method = "keys";
        System.out.println(client.get(method));
    }
}