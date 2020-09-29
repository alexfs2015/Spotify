package com.spotify.music.features.homemix.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class HomeMix implements JacksonModel {
    @JsonCreator
    public static HomeMix create(@JsonProperty("plan_type") String str, @JsonProperty("users") List<HomeMixUser> list, @JsonProperty("enabled") boolean z, @JsonProperty("publish_explicit") boolean z2, @JsonProperty("style") Style style, @JsonProperty("primary_color") String str2, @JsonProperty("secondary_color") String str3, @JsonProperty("is_family_member") boolean z3, @JsonProperty("needs_welcome") boolean z4, @JsonProperty("needs_taste_onboarding") boolean z5, @JsonProperty("alone") boolean z6, @JsonProperty("global_explicit_on") boolean z7, @JsonProperty("set_type") String str4, @JsonProperty("cohort") String str5) {
        AutoValue_HomeMix autoValue_HomeMix = new AutoValue_HomeMix(HomeMixPlanType.a(str), list == null ? Lists.a() : list, style, str2, str3, z3, z4, z, z2, z5, z6, z7, str4, str5);
        return autoValue_HomeMix;
    }

    @JsonProperty("cohort")
    public abstract String cohort();

    public List<String> excludedUserIds() {
        ArrayList a = Lists.a();
        for (HomeMixUser homeMixUser : users()) {
            if (homeMixUser.isEnabled() && !homeMixUser.isPresent()) {
                a.add(homeMixUser.getUsername());
            }
        }
        return a;
    }

    public List<String> getExcludedGenres() {
        return Lists.a();
    }

    public Map<String, String> getTestData() {
        if (cohort() == null) {
            return new HashMap(0);
        }
        return Collections.singletonMap("cohort", cohort());
    }

    @JsonIgnore
    public Map<String, HomeMixUser> homeMixUsersMap() {
        HashMap hashMap = new HashMap(users().size());
        for (HomeMixUser homeMixUser : users()) {
            hashMap.put(homeMixUser.getUsername(), homeMixUser);
        }
        return hashMap;
    }

    @JsonProperty("publish_explicit")
    public abstract boolean includeExplicit();

    @JsonProperty("alone")
    public abstract boolean isAlone();

    @JsonProperty("is_family_member")
    public abstract boolean isFamilyMember();

    @JsonProperty("global_explicit_on")
    public abstract boolean isGlobalExplicitFilterOn();

    @JsonProperty("enabled")
    public abstract boolean isUserEnabled();

    @JsonProperty("needs_taste_onboarding")
    public abstract boolean needsTasteOnboarding();

    @JsonProperty("needs_welcome")
    public abstract boolean needsWelcome();

    @JsonProperty("plan_type")
    public abstract HomeMixPlanType planType();

    @JsonProperty("primary_color")
    public abstract String primaryColor();

    @JsonProperty("secondary_color")
    public abstract String secondaryColor();

    @JsonProperty("set_type")
    public abstract String setType();

    @JsonProperty("style")
    public abstract Style style();

    @JsonProperty("users")
    public abstract List<HomeMixUser> users();
}
