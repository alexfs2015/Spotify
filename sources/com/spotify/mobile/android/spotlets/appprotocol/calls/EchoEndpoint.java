package com.spotify.mobile.android.spotlets.appprotocol.calls;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.Observable;
import java.util.concurrent.Callable;

public final class EchoEndpoint implements ilc<EchoRequest, EchoResponse> {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EchoRequest implements JacksonModel {
        public final String request;

        @JsonCreator
        public EchoRequest(@JsonProperty("request") String str) {
            this.request = str;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EchoResponse implements JacksonModel {
        public final String response;

        @JsonCreator
        public EchoResponse(@JsonProperty("response") String str) {
            this.response = str;
        }
    }

    public final /* synthetic */ Observable a(ikn ikn, JacksonModel jacksonModel) {
        final EchoRequest echoRequest = (EchoRequest) jacksonModel;
        return Observable.b((Callable<? extends T>) new Callable<EchoResponse>() {
            public final /* synthetic */ Object call() {
                return new EchoResponse(echoRequest.request);
            }
        });
    }

    public final Class<EchoRequest> a() {
        Class<EchoRequest> cls = EchoRequest.class;
        return EchoRequest.class;
    }

    public final String b() {
        String str = "ofshopo.cimceyts";
        return "com.spotify.echo";
    }

    public final int c() {
        return 1;
    }
}
