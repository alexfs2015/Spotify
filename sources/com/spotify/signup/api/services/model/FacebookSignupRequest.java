package com.spotify.signup.api.services.model;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import java.util.Map;

public abstract class FacebookSignupRequest extends fca<String, Object> {

    public static abstract class Builder {
        public abstract FacebookSignupRequest build();

        public abstract Builder creationPoint(String str);

        public abstract Builder facebookAccessToken(String str);

        public abstract Builder facebookUserId(String str);
    }

    public abstract String creationPoint();

    public abstract String facebookAccessToken();

    public abstract String facebookUserId();

    public abstract Builder toBuilder();

    public Map<String, Object> delegate() {
        String str = "key";
        String str2 = "facebook_user_id";
        String str3 = "facebook_token";
        a b = ImmutableMap.g().b("fb", Integer.valueOf(1)).b(str, vjv.a).b("platform", "Android-ARM").b("facebook_name", "throwaway").b(str2, facebookUserId()).b(str3, facebookAccessToken());
        String creationPoint = creationPoint();
        if (creationPoint != null) {
            b.b("creation_point", creationPoint);
        }
        return b.b();
    }

    public static FacebookSignupRequest create(String str, String str2) {
        return builder().facebookUserId(str).facebookAccessToken(str2).build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public FacebookSignupRequest withCreationPoint(String str) {
        return toBuilder().creationPoint(str).build();
    }
}
