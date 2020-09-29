package com.spotify.music.libs.facebook;

final class AutoValue_PermissionRequestResponse extends PermissionRequestResponse {
    private final String authSuccessUrl;
    private final String missingPermissions;
    private final String requestPermissionsUrl;

    static final class Builder extends com.spotify.music.libs.facebook.PermissionRequestResponse.Builder {
        private String authSuccessUrl;
        private String missingPermissions;
        private String requestPermissionsUrl;

        Builder() {
        }

        private Builder(PermissionRequestResponse permissionRequestResponse) {
            this.missingPermissions = permissionRequestResponse.missingPermissions();
            this.requestPermissionsUrl = permissionRequestResponse.requestPermissionsUrl();
            this.authSuccessUrl = permissionRequestResponse.authSuccessUrl();
        }

        public final com.spotify.music.libs.facebook.PermissionRequestResponse.Builder authSuccessUrl(String str) {
            if (str != null) {
                this.authSuccessUrl = str;
                return this;
            }
            throw new NullPointerException("Null authSuccessUrl");
        }

        public final PermissionRequestResponse build() {
            String str = "";
            if (this.missingPermissions == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" missingPermissions");
                str = sb.toString();
            }
            if (this.requestPermissionsUrl == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" requestPermissionsUrl");
                str = sb2.toString();
            }
            if (this.authSuccessUrl == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" authSuccessUrl");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PermissionRequestResponse(this.missingPermissions, this.requestPermissionsUrl, this.authSuccessUrl);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final com.spotify.music.libs.facebook.PermissionRequestResponse.Builder missingPermissions(String str) {
            if (str != null) {
                this.missingPermissions = str;
                return this;
            }
            throw new NullPointerException("Null missingPermissions");
        }

        public final com.spotify.music.libs.facebook.PermissionRequestResponse.Builder requestPermissionsUrl(String str) {
            if (str != null) {
                this.requestPermissionsUrl = str;
                return this;
            }
            throw new NullPointerException("Null requestPermissionsUrl");
        }
    }

    private AutoValue_PermissionRequestResponse(String str, String str2, String str3) {
        this.missingPermissions = str;
        this.requestPermissionsUrl = str2;
        this.authSuccessUrl = str3;
    }

    public final String authSuccessUrl() {
        return this.authSuccessUrl;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PermissionRequestResponse) {
            PermissionRequestResponse permissionRequestResponse = (PermissionRequestResponse) obj;
            return this.missingPermissions.equals(permissionRequestResponse.missingPermissions()) && this.requestPermissionsUrl.equals(permissionRequestResponse.requestPermissionsUrl()) && this.authSuccessUrl.equals(permissionRequestResponse.authSuccessUrl());
        }
    }

    public final int hashCode() {
        return ((((this.missingPermissions.hashCode() ^ 1000003) * 1000003) ^ this.requestPermissionsUrl.hashCode()) * 1000003) ^ this.authSuccessUrl.hashCode();
    }

    public final String missingPermissions() {
        return this.missingPermissions;
    }

    public final String requestPermissionsUrl() {
        return this.requestPermissionsUrl;
    }

    public final com.spotify.music.libs.facebook.PermissionRequestResponse.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PermissionRequestResponse{missingPermissions=");
        sb.append(this.missingPermissions);
        sb.append(", requestPermissionsUrl=");
        sb.append(this.requestPermissionsUrl);
        sb.append(", authSuccessUrl=");
        sb.append(this.authSuccessUrl);
        sb.append("}");
        return sb.toString();
    }
}
