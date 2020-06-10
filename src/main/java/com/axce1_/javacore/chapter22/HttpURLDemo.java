package com.axce1_.javacore.chapter22;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws IOException {

        URL hp = new URL("https://google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        hpCon.getRequestMethod();
        hpCon.getResponseCode();
        hpCon.getResponseMessage();
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
    }
}
