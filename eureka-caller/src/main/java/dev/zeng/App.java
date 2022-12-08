package dev.zeng;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

import okhttp3.*;

@SpringBootApplication
@RestController
public class App {
    @Inject
    private EurekaClient discoveryClient;

    private OkHttpClient okHttpClient = new OkHttpClient();

    @RequestMapping("/")
    public String home() throws Exception {
        InstanceInfo instanceInfo = this.discoveryClient.getNextServerFromEureka("CALLEE", false);
        String u = "http://" + instanceInfo.getIPAddr() + ":" + instanceInfo.getPort() + "/";
        Request.Builder builder = new Request.Builder().url(u);
        Request request = builder.get().build();
        try (Response resp = okHttpClient.newCall(request).execute()) {
            return resp.body().string();
        }
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(App.class).web(WebApplicationType.SERVLET).run(args);
    }
}
