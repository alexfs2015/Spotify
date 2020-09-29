package com.spotify.cosmos.router;

import com.spotify.core.jni.NativeHelpers;
import java.nio.charset.Charset;
import java.util.Map;

public class Response {
    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private final byte[] mBody;
    private final Map<String, String> mHeaders;
    private final int mStatus;
    private final String mUri;

    public Response(int i, String str, Map<String, String> map, byte[] bArr) {
        this.mStatus = i;
        this.mUri = str;
        this.mHeaders = map;
        this.mBody = bArr;
    }

    private Response(int i, String str, byte[] bArr, byte[] bArr2) {
        this.mStatus = i;
        this.mUri = str;
        this.mHeaders = NativeHelpers.byteArrayToMap(bArr);
        this.mBody = bArr2;
    }

    public byte[] getBody() {
        return this.mBody;
    }

    public String getBodyString() {
        return new String(this.mBody, DEFAULT_CHARSET);
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getUri() {
        return this.mUri;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response{mStatus=");
        sb.append(this.mStatus);
        sb.append(", mUri='");
        sb.append(this.mUri);
        sb.append('\'');
        sb.append(", mHeaders=");
        sb.append(this.mHeaders);
        sb.append(", mBody='");
        sb.append(new String(this.mBody, DEFAULT_CHARSET));
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
