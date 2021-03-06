package com.spotify.core.http;

public class HttpResponse {
    private final String mHeaders;
    private final int mStatus;
    private final String mUrl;

    public HttpResponse(int i, String str, String str2) {
        this.mStatus = i;
        this.mUrl = str;
        this.mHeaders = str2;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public String getHeaders() {
        return this.mHeaders;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse{status=");
        sb.append(this.mStatus);
        sb.append(", url='");
        sb.append(this.mUrl);
        sb.append('\'');
        sb.append(", headers='");
        sb.append(this.mHeaders);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (this.mStatus != httpResponse.mStatus) {
            return false;
        }
        String str = this.mUrl;
        if (str == null ? httpResponse.mUrl != null : !str.equals(httpResponse.mUrl)) {
            return false;
        }
        String str2 = this.mHeaders;
        String str3 = httpResponse.mHeaders;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public int hashCode() {
        int i = this.mStatus * 31;
        String str = this.mUrl;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.mHeaders;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }
}
