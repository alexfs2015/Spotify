package com.spotify.mobile.android.wrapped2019.stories.endpoint.share;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.wrapped2019.stories.endpoint.share.$AutoValue_QueryParameter reason: invalid class name */
abstract class C$AutoValue_QueryParameter extends QueryParameter {
    private final String key;
    private final String value;

    C$AutoValue_QueryParameter(String str, String str2) {
        if (str != null) {
            this.key = str;
            if (str2 != null) {
                this.value = str2;
                return;
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null key");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QueryParameter) {
            QueryParameter queryParameter = (QueryParameter) obj;
            if (this.key.equals(queryParameter.key()) && this.value.equals(queryParameter.value())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.key.hashCode() ^ 1000003) * 1000003) ^ this.value.hashCode();
    }

    @JsonProperty("key")
    public String key() {
        return this.key;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("QueryParameter{key=");
        sb.append(this.key);
        String str = ",vse a=u";
        sb.append(", value=");
        sb.append(this.value);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("value")
    public String value() {
        return this.value;
    }
}
