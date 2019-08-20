package com.sda.projects.money;


import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class ConnectionServiceImpl {

    public static String connect(String URL) {

        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(URL);
        try {
            return EntityUtils.toString((client.execute(get)).getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
