package com.spotify.music.features.homemix.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import java.util.List;
import java.util.Map;

final class AutoValue_HomeMix extends C$AutoValue_HomeMix {
    private volatile transient Map<String, HomeMixUser> homeMixUsersMap;

    AutoValue_HomeMix(HomeMixPlanType homeMixPlanType, List<HomeMixUser> list, Style style, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, String str4) {
        super(homeMixPlanType, list, style, str, str2, z, z2, z3, z4, z5, z6, z7, str3, str4);
    }

    @JsonIgnore
    public final Map<String, HomeMixUser> homeMixUsersMap() {
        if (this.homeMixUsersMap == null) {
            synchronized (this) {
                if (this.homeMixUsersMap == null) {
                    this.homeMixUsersMap = super.homeMixUsersMap();
                    if (this.homeMixUsersMap == null) {
                        throw new NullPointerException("homeMixUsersMap() cannot return null");
                    }
                }
            }
        }
        return this.homeMixUsersMap;
    }
}
