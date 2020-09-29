package com.spotify.signup.api.services.model;

import com.spotify.signup.api.services.model.EmailSignupRequestBody.Gender;

final class AutoValue_EmailSignupRequestBody extends EmailSignupRequestBody {
    private final String appVersion;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String creationPoint;
    private final String email;
    private final Gender gender;
    private final boolean iAgree;
    private final String name;
    private final String password;
    private final String passwordRepeat;

    static final class Builder extends com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder {
        private String appVersion;
        private Integer birthDay;
        private Integer birthMonth;
        private Integer birthYear;
        private String creationPoint;
        private String email;
        private Gender gender;
        private Boolean iAgree;
        private String name;
        private String password;
        private String passwordRepeat;

        Builder() {
        }

        private Builder(EmailSignupRequestBody emailSignupRequestBody) {
            this.email = emailSignupRequestBody.email();
            this.gender = emailSignupRequestBody.gender();
            this.birthDay = Integer.valueOf(emailSignupRequestBody.birthDay());
            this.birthMonth = Integer.valueOf(emailSignupRequestBody.birthMonth());
            this.birthYear = Integer.valueOf(emailSignupRequestBody.birthYear());
            this.password = emailSignupRequestBody.password();
            this.passwordRepeat = emailSignupRequestBody.passwordRepeat();
            this.iAgree = Boolean.valueOf(emailSignupRequestBody.iAgree());
            this.creationPoint = emailSignupRequestBody.creationPoint();
            this.appVersion = emailSignupRequestBody.appVersion();
            this.name = emailSignupRequestBody.name();
        }

        public final com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public final com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder birthDay(int i) {
            this.birthDay = Integer.valueOf(i);
            return this;
        }

        public final com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder birthMonth(int i) {
            this.birthMonth = Integer.valueOf(i);
            return this;
        }

        public final com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder birthYear(int i) {
            this.birthYear = Integer.valueOf(i);
            return this;
        }

        public final EmailSignupRequestBody build() {
            String str = "";
            if (this.email == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" email");
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
            if (this.password == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" password");
                str = sb6.toString();
            }
            if (this.passwordRepeat == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" passwordRepeat");
                str = sb7.toString();
            }
            if (this.iAgree == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" iAgree");
                str = sb8.toString();
            }
            if (str.isEmpty()) {
                AutoValue_EmailSignupRequestBody autoValue_EmailSignupRequestBody = new AutoValue_EmailSignupRequestBody(this.email, this.gender, this.birthDay.intValue(), this.birthMonth.intValue(), this.birthYear.intValue(), this.password, this.passwordRepeat, this.iAgree.booleanValue(), this.creationPoint, this.appVersion, this.name);
                return autoValue_EmailSignupRequestBody;
            }
            StringBuilder sb9 = new StringBuilder("Missing required properties:");
            sb9.append(str);
            throw new IllegalStateException(sb9.toString());
        }

        public final com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder creationPoint(String str) {
            this.creationPoint = str;
            return this;
        }

        public final com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder email(String str) {
            if (str != null) {
                this.email = str;
                return this;
            }
            throw new NullPointerException("Null email");
        }

        public final com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder gender(Gender gender2) {
            if (gender2 != null) {
                this.gender = gender2;
                return this;
            }
            throw new NullPointerException("Null gender");
        }

        public final com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder iAgree(boolean z) {
            this.iAgree = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder name(String str) {
            this.name = str;
            return this;
        }

        public final com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder password(String str) {
            if (str != null) {
                this.password = str;
                return this;
            }
            throw new NullPointerException("Null password");
        }

        public final com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder passwordRepeat(String str) {
            if (str != null) {
                this.passwordRepeat = str;
                return this;
            }
            throw new NullPointerException("Null passwordRepeat");
        }
    }

    private AutoValue_EmailSignupRequestBody(String str, Gender gender2, int i, int i2, int i3, String str2, String str3, boolean z, String str4, String str5, String str6) {
        this.email = str;
        this.gender = gender2;
        this.birthDay = i;
        this.birthMonth = i2;
        this.birthYear = i3;
        this.password = str2;
        this.passwordRepeat = str3;
        this.iAgree = z;
        this.creationPoint = str4;
        this.appVersion = str5;
        this.name = str6;
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

    public final String email() {
        return this.email;
    }

    public final Gender gender() {
        return this.gender;
    }

    public final boolean iAgree() {
        return this.iAgree;
    }

    public final String name() {
        return this.name;
    }

    public final String password() {
        return this.password;
    }

    public final String passwordRepeat() {
        return this.passwordRepeat;
    }

    public final com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder toBuilder() {
        return new Builder(this);
    }
}
