package com.spotify.cosmos.router;

import com.spotify.core.jni.NativeHelpers;
import java.util.HashMap;
import java.util.Map;

public class Request {
    public static final String DELETE = "DELETE";
    public static final byte[] EMPTY_BODY = new byte[0];
    public static final String GET = "GET";
    public static final String POST = "POST";
    public static final String PUT = "PUT";
    public static final String SUB = "SUB";
    private String mAction;
    private byte[] mBody;
    private Map<String, String> mHeaders;
    private String mUri;

    public Request() {
    }

    public Request(String str, String str2) {
        this(str, str2, new HashMap(), EMPTY_BODY);
    }

    public Request(String str, String str2, Map<String, String> map, byte[] bArr) {
        if (str2 == null) {
            throw new IllegalArgumentException("URI cannot be null");
        } else if (str2.length() != 0) {
            this.mHeaders = map;
            this.mAction = str;
            this.mUri = str2;
            this.mBody = bArr;
        } else {
            throw new IllegalArgumentException("URI cannot be empty");
        }
    }

    public String getAction() {
        return this.mAction;
    }

    public void setAction(String str) {
        this.mAction = str;
    }

    public String getUri() {
        return this.mUri;
    }

    public void setUri(String str) {
        this.mUri = str;
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    private byte[] getHeadersArray() {
        return NativeHelpers.mapToByteArray(this.mHeaders);
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public byte[] getBody() {
        return this.mBody;
    }

    public void setBody(byte[] bArr) {
        this.mBody = bArr;
    }

    public String toString() {
        return String.format("Request{mAction='%s', mUri='%s'}", new Object[]{this.mAction, this.mUri});
    }
}
