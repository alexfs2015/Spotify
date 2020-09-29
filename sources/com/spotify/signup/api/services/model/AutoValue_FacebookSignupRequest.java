package com.spotify.signup.api.services.model;

final class AutoValue_FacebookSignupRequest extends FacebookSignupRequest {
    private final String creationPoint;
    private final String facebookAccessToken;
    private final String facebookUserId;

    static final class Builder extends com.spotify.signup.api.services.model.FacebookSignupRequest.Builder {
        private String creationPoint;
        private String facebookAccessToken;
        private String facebookUserId;

        Builder() {
        }

        private Builder(FacebookSignupRequest facebookSignupRequest) {
            this.facebookUserId = facebookSignupRequest.facebookUserId();
            this.facebookAccessToken = facebookSignupRequest.facebookAccessToken();
            this.creationPoint = facebookSignupRequest.creationPoint();
        }

        public final com.spotify.signup.api.services.model.FacebookSignupRequest.Builder facebookUserId(String str) {
            if (str != null) {
                this.facebookUserId = str;
                return this;
            }
            throw new NullPointerException("Null facebookUserId");
        }

        public final com.spotify.signup.api.services.model.FacebookSignupRequest.Builder facebookAccessToken(String str) {
            if (str != null) {
                this.facebookAccessToken = str;
                return this;
            }
            throw new NullPointerException("Null facebookAccessToken");
        }

        public final com.spotify.signup.api.services.model.FacebookSignupRequest.Builder creationPoint(String str) {
            this.creationPoint = str;
            return this;
        }

        public final FacebookSignupRequest build() {
            String str = "";
            if (this.facebookUserId == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" facebookUserId");
                str = sb.toString();
            }
            if (this.facebookAccessToken == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" facebookAccessToken");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_FacebookSignupRequest(this.facebookUserId, this.facebookAccessToken, this.creationPoint);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private AutoValue_FacebookSignupRequest(String str, String str2, String str3) {
        this.facebookUserId = str;
        this.facebookAccessToken = str2;
        this.creationPoint = str3;
    }

    public final String facebookUserId() {
        return this.facebookUserId;
    }

    public final String facebookAccessToken() {
        return this.facebookAccessToken;
    }

    public final String creationPoint() {
        return this.creationPoint;
    }

    public final com.spotify.signup.api.services.model.FacebookSignupRequest.Builder toBuilder() {
        return new Builder(this);
    }
}
