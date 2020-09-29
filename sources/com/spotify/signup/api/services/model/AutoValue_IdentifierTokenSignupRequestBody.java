package com.spotify.signup.api.services.model;

import com.spotify.signup.api.services.model.EmailSignupRequestBody.Gender;

final class AutoValue_IdentifierTokenSignupRequestBody extends IdentifierTokenSignupRequestBody {
    private final String appVersion;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String creationPoint;
    private final Gender gender;
    private final boolean iAgree;
    private final String identifierToken;

    static final class Builder extends com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder {
        private String appVersion;
        private Integer birthDay;
        private Integer birthMonth;
        private Integer birthYear;
        private String creationPoint;
        private Gender gender;
        private Boolean iAgree;
        private String identifierToken;

        Builder() {
        }

        private Builder(IdentifierTokenSignupRequestBody identifierTokenSignupRequestBody) {
            this.identifierToken = identifierTokenSignupRequestBody.identifierToken();
            this.gender = identifierTokenSignupRequestBody.gender();
            this.birthDay = Integer.valueOf(identifierTokenSignupRequestBody.birthDay());
            this.birthMonth = Integer.valueOf(identifierTokenSignupRequestBody.birthMonth());
            this.birthYear = Integer.valueOf(identifierTokenSignupRequestBody.birthYear());
            this.iAgree = Boolean.valueOf(identifierTokenSignupRequestBody.iAgree());
            this.creationPoint = identifierTokenSignupRequestBody.creationPoint();
            this.appVersion = identifierTokenSignupRequestBody.appVersion();
        }

        public final com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public final com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder birthDay(int i) {
            this.birthDay = Integer.valueOf(i);
            return this;
        }

        public final com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder birthMonth(int i) {
            this.birthMonth = Integer.valueOf(i);
            return this;
        }

        public final com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder birthYear(int i) {
            this.birthYear = Integer.valueOf(i);
            return this;
        }

        public final IdentifierTokenSignupRequestBody build() {
            String str = "";
            if (this.identifierToken == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" identifierToken");
                str = sb.toString();
            }
            if (this.gender == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" gender");
                str = sb2.toString();
            }
            if (this.birthDay == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" birthDay");
                str = sb3.toString();
            }
            if (this.birthMonth == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" birthMonth");
                str = sb4.toString();
            }
            if (this.birthYear == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" birthYear");
                str = sb5.toString();
            }
            if (this.iAgree == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" iAgree");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                AutoValue_IdentifierTokenSignupRequestBody autoValue_IdentifierTokenSignupRequestBody = new AutoValue_IdentifierTokenSignupRequestBody(this.identifierToken, this.gender, this.birthDay.intValue(), this.birthMonth.intValue(), this.birthYear.intValue(), this.iAgree.booleanValue(), this.creationPoint, this.appVersion);
                return autoValue_IdentifierTokenSignupRequestBody;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }

        public final com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder creationPoint(String str) {
            this.creationPoint = str;
            return this;
        }

        public final com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder gender(Gender gender2) {
            if (gender2 != null) {
                this.gender = gender2;
                return this;
            }
            throw new NullPointerException("Null gender");
        }

        public final com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder iAgree(boolean z) {
            this.iAgree = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder identifierToken(String str) {
            if (str != null) {
                this.identifierToken = str;
                return this;
            }
            throw new NullPointerException("Null identifierToken");
        }
    }

    private AutoValue_IdentifierTokenSignupRequestBody(String str, Gender gender2, int i, int i2, int i3, boolean z, String str2, String str3) {
        this.identifierToken = str;
        this.gender = gender2;
        this.birthDay = i;
        this.birthMonth = i2;
        this.birthYear = i3;
        this.iAgree = z;
        this.creationPoint = str2;
        this.appVersion = str3;
    }

    public final String appVersion() {
        return this.appVersion;
    }

    public final int birthDay() {
        return this.birthDay;
    }

    public final int birthMonth() {
        return this.birthMonth;
    }

    public final int birthYear() {
        return this.birthYear;
    }

    public final String creationPoint() {
        return this.creationPoint;
    }

    public final Gender gender() {
        return this.gender;
    }

    public final boolean iAgree() {
        return this.iAgree;
    }

    public final String identifierToken() {
        return this.identifierToken;
    }

    public final com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder toBuilder() {
        return new Builder(this);
    }
}
