package com.spotify.music.libs.facebook;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class AutoValue_PermissionsRequest extends PermissionsRequest {
    private final List<String> permissions;

    static final class Builder extends com.spotify.music.libs.facebook.PermissionsRequest.Builder {
        private List<String> permissions;

        Builder() {
        }

        private Builder(PermissionsRequest permissionsRequest) {
            this.permissions = permissionsRequest.permissions();
        }

        public final PermissionsRequest build() {
            String str = "";
            if (this.permissions == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" permissions");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PermissionsRequest(this.permissions);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final com.spotify.music.libs.facebook.PermissionsRequest.Builder permissions(List<String> list) {
            if (list != null) {
                this.permissions = list;
                return this;
            }
            throw new NullPointerException("Null permissions");
        }
    }

    private AutoValue_PermissionsRequest(List<String> list) {
        this.permissions = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PermissionsRequest)) {
            return false;
        }
        return this.permissions.equals(((PermissionsRequest) obj).permissions());
    }

    public final int hashCode() {
        return this.permissions.hashCode() ^ 1000003;
    }

    @JsonProperty("permissions")
    public final List<String> permissions() {
        return this.permissions;
    }

    public final com.spotify.music.libs.facebook.PermissionsRequest.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PermissionsRequest{permissions=");
        sb.append(this.permissions);
        sb.append("}");
        return sb.toString();
    }
}
