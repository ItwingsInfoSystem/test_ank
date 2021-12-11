package com.outh2.integration.github_integration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

@Service
public class RestService<T> {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<String> getRequest() {

        String url = "https://github.com/login/oauth/authorize";
        Map<String, String> var = new HashMap<>();
        var.put("client_id","2fa252967c6bac357490");
        var.put("redirect_uri","http://localhost:8080/git/v1/callback");
        var.put("response_type","code");
        var.put("client_secret","7e43544880878ff3a1e5e1711f7838ba0b13caec");

        URI uri = restTemplate.getUriTemplateHandler().expand(url,var);


        HttpHeaders headers = new HttpHeaders();
        Charset charset = Charset.forName("UTF-8");
        MediaType mediaType = new MediaType("text","html",charset);
        headers.setContentType(mediaType);

        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(uri,HttpMethod.GET,entity,String.class);
        return responseEntity;

    }
}
