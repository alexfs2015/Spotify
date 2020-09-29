package com.spotify.signup.api.services.model;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.signup.api.services.model.EmailSignupRequestBody.Gender;
import java.util.Locale;
import java.util.Map;

public abstract class IdentifierTokenSignupRequestBody extends fcs<String, Object> {

    public static abstract class Builder {
        public abstract Builder appVersion(String str);

        public abstract Builder birthDay(int i);

        public abstract Builder birthMonth(int i);

        public abstract Builder birthYear(int i);

        public abstract IdentifierTokenSignupRequestBody build();

        public abstract Builder creationPoint(String str);

        public abstract Builder gender(Gender gender);

        public abstract Builder iAgree(boolean z);

        public abstract Builder identifierToken(String str);
    }

    public static Builder builder() {
        return new Builder();
    }

    public abstract String appVersion();

    public abstract int birthDay();

    public abstract int birthMonth();

    public abstract int birthYear();

    public abstract String creationPoint();

    public Map<String, Object> delegate() {
        String str = "identifier_token";
        String str2 = "birth_day";
        String str3 = "birth_month";
        String str4 = "birth_year";
        String str5 = "iagree";
        a b = ImmutableMap.g().b("key", vxb.a).b("platform", "Android-ARM").b(str, identifierToken()).b("gender", gender().toString().toLowerCase(Locale.ENGLISH)).b(str2, Integer.valueOf(birthDay())).b(str3, Integer.valueOf(birthMonth())).b(str4, Integer.valueOf(birthYear())).b(str5, Boolean.valueOf(iAgree()));
        String creationPoint = creationPoint();
        if (creationPoint != null) {
            b.b("creation_point", creationPoint);
        }
        String appVersion = appVersion();
        if (appVersion != null) {
            b.b("app_version", appVersion);
        }
        return vxd.a((Map<String, Object>) b.b());
    }

    public abstract Gender gender();

    public abstract boolean iAgree();

    public abstract String identifierToken();

    public abstract Builder toBuilder();

    public IdentifierTokenSignupRequestBody withCreationPoint(String str) {
        return toBuilder().creationPoint(str).build();
    }
}
