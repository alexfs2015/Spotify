package com.spotify.core.http;

import java.util.Arrays;

public class HttpRequest {
    private final byte[] mBody;
    private final byte[] mHeaders;
    private final String mMethod;
    private final String mUrl;

    public HttpRequest(String str, String str2, byte[] bArr, byte[] bArr2) {
        this.mUrl = str;
        this.mMethod = str2;
        this.mHeaders = bArr;
        this.mBody = bArr2;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public String getMethod() {
        return this.mMethod;
    }

    public byte[] getHeaders() {
        return this.mHeaders;
    }

    public byte[] getBody() {
        return this.mBody;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        String str = this.mUrl;
        if (str == null ? httpRequest.mUrl != null : !str.equals(httpRequest.mUrl)) {
            return false;
        }
        String str2 = this.mMethod;
        if (str2 == null ? httpRequest.mMethod == null : str2.equals(httpRequest.mMethod)) {
            return Arrays.equals(this.mHeaders, httpRequest.mHeaders) && Arrays.equals(this.mBody, httpRequest.mBody);
        }
        return false;
    }

    public int hashCode() {
        String str = this.mUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mMethod;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode + i) * 31) + Arrays.hashCode(this.mHeaders)) * 31) + Arrays.hashCode(this.mBody);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpRequest{mUrl='");
        sb.append(this.mUrl);
        sb.append('\'');
        sb.append(", mMethod='");
        sb.append(this.mMethod);
        sb.append('\'');
        sb.append(", mHeaders=");
        sb.append(Arrays.toString(this.mHeaders));
        sb.append(", mBody=");
        sb.append(Arrays.toString(this.mBody));
        sb.append('}');
        return sb.toString();
    }
}
