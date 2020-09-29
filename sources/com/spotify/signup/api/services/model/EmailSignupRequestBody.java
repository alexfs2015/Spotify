package com.spotify.signup.api.services.model;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import java.util.Locale;
import java.util.Map;

public abstract class EmailSignupRequestBody extends fca<String, Object> {

    public static abstract class Builder {
        public abstract Builder appVersion(String str);

        public abstract Builder birthDay(int i);

        public abstract Builder birthMonth(int i);

        public abstract Builder birthYear(int i);

        public abstract EmailSignupRequestBody build();

        public abstract Builder creationPoint(String str);

        public abstract Builder email(String str);

        public abstract Builder gender(Gender gender);

        public abstract Builder iAgree(boolean z);

        public abstract Builder name(String str);

        public abstract Builder password(String str);

        public abstract Builder passwordRepeat(String str);
    }

    public enum Gender {
        MALE,
        FEMALE,
        NEUTRAL
    }

    public abstract String appVersion();

    public abstract int birthDay();

    public abstract int birthMonth();

    public abstract int birthYear();

    public abstract String creationPoint();

    public abstract String email();

    public abstract Gender gender();

    public abstract boolean iAgree();

    public abstract String name();

    public abstract String password();

    public abstract String passwordRepeat();

    public abstract Builder toBuilder();

    public Map<String, Object> delegate() {
        String str = "email";
        String str2 = "birth_day";
        String str3 = "birth_month";
        String str4 = "birth_year";
        String str5 = "password";
        String str6 = "password_repeat";
        String str7 = "iagree";
        a b = ImmutableMap.g().b("key", vjv.a).b("platform", "Android-ARM").b(str, email()).b("gender", gender().toString().toLowerCase(Locale.ENGLISH)).b(str2, Integer.valueOf(birthDay())).b(str3, Integer.valueOf(birthMonth())).b(str4, Integer.valueOf(birthYear())).b(str5, password()).b(str6, passwordRepeat()).b(str7, Boolean.valueOf(iAgree()));
        String creationPoint = creationPoint();
        if (creationPoint != null) {
            b.b("creation_point", creationPoint);
        }
        String appVersion = appVersion();
        if (appVersion != null) {
            b.b("app_version", appVersion);
        }
        String name = name();
        if (name != null) {
            b.b("name", name);
        }
        return vjx.a((Map<String, Object>) b.b());
    }

    public static Builder builder() {
        return new Builder();
    }

    public EmailSignupRequestBody withCreationPoint(String str) {
        return toBuilder().creationPoint(str).build();
    }
}
