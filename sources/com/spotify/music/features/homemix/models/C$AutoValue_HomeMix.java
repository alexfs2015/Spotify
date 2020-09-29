package com.spotify.music.features.homemix.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import java.util.List;

/* renamed from: com.spotify.music.features.homemix.models.$AutoValue_HomeMix reason: invalid class name */
abstract class C$AutoValue_HomeMix extends HomeMix {
    private final String cohort;
    private final boolean includeExplicit;
    private final boolean isAlone;
    private final boolean isFamilyMember;
    private final boolean isGlobalExplicitFilterOn;
    private final boolean isUserEnabled;
    private final boolean needsTasteOnboarding;
    private final boolean needsWelcome;
    private final HomeMixPlanType planType;
    private final String primaryColor;
    private final String secondaryColor;
    private final String setType;
    private final Style style;
    private final List<HomeMixUser> users;

    C$AutoValue_HomeMix(HomeMixPlanType homeMixPlanType, List<HomeMixUser> list, Style style2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, String str4) {
        if (homeMixPlanType != null) {
            this.planType = homeMixPlanType;
            if (list != null) {
                this.users = list;
                if (style2 != null) {
                    this.style = style2;
                    if (str != null) {
                        this.primaryColor = str;
                        if (str2 != null) {
                            this.secondaryColor = str2;
                            this.isFamilyMember = z;
                            this.needsWelcome = z2;
                            this.isUserEnabled = z3;
                            this.includeExplicit = z4;
                            this.needsTasteOnboarding = z5;
                            this.isAlone = z6;
                            this.isGlobalExplicitFilterOn = z7;
                            this.setType = str3;
                            this.cohort = str4;
                            return;
                        }
                        throw new NullPointerException("Null secondaryColor");
                    }
                    throw new NullPointerException("Null primaryColor");
                }
                throw new NullPointerException("Null style");
            }
            throw new NullPointerException("Null users");
        }
        throw new NullPointerException("Null planType");
    }

    @JsonProperty("plan_type")
    public HomeMixPlanType planType() {
        return this.planType;
    }

    @JsonProperty("users")
    public List<HomeMixUser> users() {
        return this.users;
    }

    @JsonProperty("style")
    public Style style() {
        return this.style;
    }

    @JsonProperty("primary_color")
    public String primaryColor() {
        return this.primaryColor;
    }

    @JsonProperty("secondary_color")
    public String secondaryColor() {
        return this.secondaryColor;
    }

    @JsonProperty("is_family_member")
    public boolean isFamilyMember() {
        return this.isFamilyMember;
    }

    @JsonProperty("needs_welcome")
    public boolean needsWelcome() {
        return this.needsWelcome;
    }

    @JsonProperty("enabled")
    public boolean isUserEnabled() {
        return this.isUserEnabled;
    }

    @JsonProperty("publish_explicit")
    public boolean includeExplicit() {
        return this.includeExplicit;
    }

    @JsonProperty("needs_taste_onboarding")
    public boolean needsTasteOnboarding() {
        return this.needsTasteOnboarding;
    }

    @JsonProperty("alone")
    public boolean isAlone() {
        return this.isAlone;
    }

    @JsonProperty("global_explicit_on")
    public boolean isGlobalExplicitFilterOn() {
        return this.isGlobalExplicitFilterOn;
    }

    @JsonProperty("set_type")
    public String setType() {
        return this.setType;
    }

    @JsonProperty("cohort")
    public String cohort() {
        return this.cohort;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HomeMix{planType=");
        sb.append(this.planType);
        sb.append(", users=");
        sb.append(this.users);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", primaryColor=");
        sb.append(this.primaryColor);
        sb.append(", secondaryColor=");
        sb.append(this.secondaryColor);
        sb.append(", isFamilyMember=");
        sb.append(this.isFamilyMember);
        sb.append(", needsWelcome=");
        sb.append(this.needsWelcome);
        sb.append(", isUserEnabled=");
        sb.append(this.isUserEnabled);
        sb.append(", includeExplicit=");
        sb.append(this.includeExplicit);
        sb.append(", needsTasteOnboarding=");
        sb.append(this.needsTasteOnboarding);
        sb.append(", isAlone=");
        sb.append(this.isAlone);
        sb.append(", isGlobalExplicitFilterOn=");
        sb.append(this.isGlobalExplicitFilterOn);
        sb.append(", setType=");
        sb.append(this.setType);
        sb.append(", cohort=");
        sb.append(this.cohort);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HomeMix) {
            HomeMix homeMix = (HomeMix) obj;
            if (this.planType.equals(homeMix.planType()) && this.users.equals(homeMix.users()) && this.style.equals(homeMix.style()) && this.primaryColor.equals(homeMix.primaryColor()) && this.secondaryColor.equals(homeMix.secondaryColor()) && this.isFamilyMember == homeMix.isFamilyMember() && this.needsWelcome == homeMix.needsWelcome() && this.isUserEnabled == homeMix.isUserEnabled() && this.includeExplicit == homeMix.includeExplicit() && this.needsTasteOnboarding == homeMix.needsTasteOnboarding() && this.isAlone == homeMix.isAlone() && this.isGlobalExplicitFilterOn == homeMix.isGlobalExplicitFilterOn()) {
                String str = this.setType;
                if (str != null ? str.equals(homeMix.setType()) : homeMix.setType() == null) {
                    String str2 = this.cohort;
                    return str2 != null ? str2.equals(homeMix.cohort()) : homeMix.cohort() == null;
                }
            }
        }
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((((((((((((this.planType.hashCode() ^ 1000003) * 1000003) ^ this.users.hashCode()) * 1000003) ^ this.style.hashCode()) * 1000003) ^ this.primaryColor.hashCode()) * 1000003) ^ this.secondaryColor.hashCode()) * 1000003) ^ (this.isFamilyMember ? 1231 : 1237)) * 1000003) ^ (this.needsWelcome ? 1231 : 1237)) * 1000003) ^ (this.isUserEnabled ? 1231 : 1237)) * 1000003) ^ (this.includeExplicit ? 1231 : 1237)) * 1000003) ^ (this.needsTasteOnboarding ? 1231 : 1237)) * 1000003) ^ (this.isAlone ? 1231 : 1237)) * 1000003;
        if (!this.isGlobalExplicitFilterOn) {
            i = 1237;
        }
        int i2 = (hashCode ^ i) * 1000003;
        String str = this.setType;
        int i3 = 0;
        int hashCode2 = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.cohort;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode2 ^ i3;
    }
}
