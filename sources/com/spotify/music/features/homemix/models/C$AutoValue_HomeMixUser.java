package com.spotify.music.features.homemix.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.homemix.models.$AutoValue_HomeMixUser reason: invalid class name */
abstract class C$AutoValue_HomeMixUser extends HomeMixUser {
    private final String getColor;
    private final String getImageUrl;
    private final String getInitials;
    private final String getLargeImageUrl;
    private final String getShortName;
    private final String getUsername;
    private final boolean isEnabled;
    private final boolean isPresent;
    private final boolean needsTasteOnboarding;

    C$AutoValue_HomeMixUser(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, boolean z3) {
        if (str != null) {
            this.getUsername = str;
            this.getShortName = str2;
            this.getImageUrl = str3;
            this.getLargeImageUrl = str4;
            if (str5 != null) {
                this.getInitials = str5;
                this.isEnabled = z;
                this.isPresent = z2;
                if (str6 != null) {
                    this.getColor = str6;
                    this.needsTasteOnboarding = z3;
                    return;
                }
                throw new NullPointerException("Null getColor");
            }
            throw new NullPointerException("Null getInitials");
        }
        throw new NullPointerException("Null getUsername");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HomeMixUser) {
            HomeMixUser homeMixUser = (HomeMixUser) obj;
            if (this.getUsername.equals(homeMixUser.getUsername())) {
                String str = this.getShortName;
                if (str != null ? str.equals(homeMixUser.getShortName()) : homeMixUser.getShortName() == null) {
                    String str2 = this.getImageUrl;
                    if (str2 != null ? str2.equals(homeMixUser.getImageUrl()) : homeMixUser.getImageUrl() == null) {
                        String str3 = this.getLargeImageUrl;
                        if (str3 != null ? str3.equals(homeMixUser.getLargeImageUrl()) : homeMixUser.getLargeImageUrl() == null) {
                            return this.getInitials.equals(homeMixUser.getInitials()) && this.isEnabled == homeMixUser.isEnabled() && this.isPresent == homeMixUser.isPresent() && this.getColor.equals(homeMixUser.getColor()) && this.needsTasteOnboarding == homeMixUser.needsTasteOnboarding();
                        }
                    }
                }
            }
        }
    }

    @JsonProperty("color")
    public String getColor() {
        return this.getColor;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return this.getImageUrl;
    }

    @JsonProperty("initials")
    public String getInitials() {
        return this.getInitials;
    }

    @JsonProperty("large_image_url")
    public String getLargeImageUrl() {
        return this.getLargeImageUrl;
    }

    @JsonProperty("short_name")
    public String getShortName() {
        return this.getShortName;
    }

    @JsonProperty("username")
    public String getUsername() {
        return this.getUsername;
    }

    public int hashCode() {
        int hashCode = (this.getUsername.hashCode() ^ 1000003) * 1000003;
        String str = this.getShortName;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.getImageUrl;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.getLargeImageUrl;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int hashCode4 = (((hashCode3 ^ i) * 1000003) ^ this.getInitials.hashCode()) * 1000003;
        int i2 = 1231;
        int hashCode5 = (((((hashCode4 ^ (this.isEnabled ? 1231 : 1237)) * 1000003) ^ (this.isPresent ? 1231 : 1237)) * 1000003) ^ this.getColor.hashCode()) * 1000003;
        if (!this.needsTasteOnboarding) {
            i2 = 1237;
        }
        return hashCode5 ^ i2;
    }

    @JsonProperty("enabled")
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @JsonProperty("present")
    public boolean isPresent() {
        return this.isPresent;
    }

    @JsonProperty("needs_taste_onboarding")
    public boolean needsTasteOnboarding() {
        return this.needsTasteOnboarding;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HomeMixUser{getUsername=");
        sb.append(this.getUsername);
        sb.append(", getShortName=");
        sb.append(this.getShortName);
        sb.append(", getImageUrl=");
        sb.append(this.getImageUrl);
        sb.append(", getLargeImageUrl=");
        sb.append(this.getLargeImageUrl);
        sb.append(", getInitials=");
        sb.append(this.getInitials);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", isPresent=");
        sb.append(this.isPresent);
        sb.append(", getColor=");
        sb.append(this.getColor);
        sb.append(", needsTasteOnboarding=");
        sb.append(this.needsTasteOnboarding);
        sb.append("}");
        return sb.toString();
    }
}
