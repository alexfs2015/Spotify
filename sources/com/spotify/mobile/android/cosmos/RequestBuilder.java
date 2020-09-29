package com.spotify.mobile.android.cosmos;

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.spotify.cosmos.router.Request;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

public final class RequestBuilder {
    static final String HERMES_CACHE_IDENTIFIER_KEY = "cache-identifier";
    private final Request mRequest;

    @Retention(RetentionPolicy.SOURCE)
    public @interface RequestMethodType {
    }

    private RequestBuilder(String str, String str2) {
        fay.a(!TextUtils.isEmpty(str), (Object) "Request method cannot not be null");
        fay.a(!TextUtils.isEmpty(str2), (Object) "Request URI cannot be null");
        this.mRequest = new Request(str, str2, new HashMap(), Request.EMPTY_BODY);
    }

    private RequestBuilder(String str, String str2, byte[] bArr) {
        fay.a(!TextUtils.isEmpty(str), (Object) "Request method cannot not be null");
        fay.a(!TextUtils.isEmpty(str2), (Object) "Request URI cannot be null");
        this.mRequest = new Request(str, str2, new HashMap(), bArr);
    }

    public static RequestBuilder get(String str) {
        return new RequestBuilder(Request.GET, str);
    }

    public static RequestBuilder post(String str) {
        return new RequestBuilder(Request.POST, str);
    }

    public static RequestBuilder put(String str) {
        return new RequestBuilder(Request.PUT, str);
    }

    public static RequestBuilder delete(String str) {
        return new RequestBuilder(Request.DELETE, str);
    }

    public static RequestBuilder subscribe(String str) {
        return new RequestBuilder(Request.SUB, str);
    }

    public static RequestBuilder postBytes(String str, byte[] bArr) {
        return new RequestBuilder(Request.POST, str, bArr);
    }

    public static <T extends JacksonModel> RequestBuilder post(String str, T t) {
        return post(str, t, null);
    }

    public static <T extends JacksonModel> RequestBuilder post(String str, T t, ObjectMapper objectMapper) {
        fay.a(t);
        return new RequestBuilder(Request.POST, str, JacksonSerializer.toBytes(t, objectMapper));
    }

    public static RequestBuilder postObjectNode(String str, ObjectNode objectNode, ObjectMapper objectMapper) {
        try {
            return postBytes(str, objectMapper.writeValueAsBytes(objectNode));
        } catch (JsonProcessingException e) {
            throw new ParserException(e);
        }
    }

    public static RequestBuilder subscribeBytes(String str, byte[] bArr) {
        return new RequestBuilder(Request.SUB, str, bArr);
    }

    public static <T extends JacksonModel> RequestBuilder subscribe(String str, T t) {
        return subscribe(str, t, null);
    }

    public static <T extends JacksonModel> RequestBuilder subscribe(String str, T t, ObjectMapper objectMapper) {
        fay.a(t);
        return new RequestBuilder(Request.SUB, str, JacksonSerializer.toBytes(t, objectMapper));
    }

    public static RequestBuilder putBytes(String str, byte[] bArr) {
        return new RequestBuilder(Request.PUT, str, bArr);
    }

    public static <T extends JacksonModel> RequestBuilder put(String str, T t) {
        return put(str, t, null);
    }

    public static <T extends JacksonModel> RequestBuilder put(String str, T t, ObjectMapper objectMapper) {
        fay.a(t);
        return new RequestBuilder(Request.PUT, str, JacksonSerializer.toBytes(t, objectMapper));
    }

    public static <T extends JacksonModel> RequestBuilder delete(String str, T t) {
        return new RequestBuilder(Request.DELETE, str, JacksonSerializer.toBytes(t));
    }

    public final RequestBuilder with(String str, String str2) {
        fay.a(!TextUtils.isEmpty(str), (Object) "Header key cannot be empty");
        fay.a(str2);
        this.mRequest.getHeaders().put(str, str2);
        return this;
    }

    public final RequestBuilder setHermesCacheIdentifier(String str) {
        fay.a(!TextUtils.isEmpty(str), (Object) "Cache identifier cannot be empty");
        this.mRequest.getHeaders().put(HERMES_CACHE_IDENTIFIER_KEY, str);
        return this;
    }

    public final Request build() {
        return this.mRequest;
    }
}
