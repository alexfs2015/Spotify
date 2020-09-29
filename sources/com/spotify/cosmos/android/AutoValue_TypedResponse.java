package com.spotify.cosmos.android;

import java.util.Map;

final class AutoValue_TypedResponse<T> extends TypedResponse<T> {
    private final T body;
    private final Map<String, String> headers;
    private final int status;
    private final String uri;

    static final class Builder<T> extends com.spotify.cosmos.android.TypedResponse.Builder<T> {
        private T body;
        private Map<String, String> headers;
        private Integer status;
        private String uri;

        Builder() {
        }

        public final com.spotify.cosmos.android.TypedResponse.Builder<T> status(int i) {
            this.status = Integer.valueOf(i);
            return this;
        }

        public final com.spotify.cosmos.android.TypedResponse.Builder<T> uri(String str) {
            if (str != null) {
                this.uri = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final com.spotify.cosmos.android.TypedResponse.Builder<T> headers(Map<String, String> map) {
            if (map != null) {
                this.headers = map;
                return this;
            }
            throw new NullPointerException("Null headers");
        }

        public final com.spotify.cosmos.android.TypedResponse.Builder<T> body(T t) {
            this.body = t;
            return this;
        }

        public final TypedResponse<T> build() {
            String str = "";
            if (this.status == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" status");
                str = sb.toString();
            }
            if (this.uri == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" uri");
                str = sb2.toString();
            }
            if (this.headers == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" headers");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                AutoValue_TypedResponse autoValue_TypedResponse = new AutoValue_TypedResponse(this.status.intValue(), this.uri, this.headers, this.body);
                return autoValue_TypedResponse;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_TypedResponse(int i, String str, Map<String, String> map, T t) {
        this.status = i;
        this.uri = str;
        this.headers = map;
        this.body = t;
    }

    public final int status() {
        return this.status;
    }

    public final String uri() {
        return this.uri;
    }

    public final Map<String, String> headers() {
        return this.headers;
    }

    public final T body() {
        return this.body;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypedResponse{status=");
        sb.append(this.status);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", body=");
        sb.append(this.body);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TypedResponse) {
            TypedResponse typedResponse = (TypedResponse) obj;
            if (this.status == typedResponse.status() && this.uri.equals(typedResponse.uri()) && this.headers.equals(typedResponse.headers())) {
                T t = this.body;
                return t != null ? t.equals(typedResponse.body()) : typedResponse.body() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((((this.status ^ 1000003) * 1000003) ^ this.uri.hashCode()) * 1000003) ^ this.headers.hashCode()) * 1000003;
        T t = this.body;
        return hashCode ^ (t == null ? 0 : t.hashCode());
    }
}
