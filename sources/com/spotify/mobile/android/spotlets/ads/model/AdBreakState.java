package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum AdBreakState implements JacksonModel {
    IDLE("idle"),
    IN_PROGRESS("in_progress"),
    PENDING("pending");
    
    private static final Map<String, AdBreakState> sNameMap = null;
    private final String mName;

    static {
        sNameMap = new HashMap();
        Iterator it = EnumSet.allOf(AdBreakState.class).iterator();
        while (it.hasNext()) {
            AdBreakState adBreakState = (AdBreakState) it.next();
            sNameMap.put(adBreakState.getName(), adBreakState);
        }
    }

    private AdBreakState(String str) {
        this.mName = str;
    }

    @JsonValue
    public final String getName() {
        return this.mName;
    }

    public static AdBreakState getByName(String str) {
        return (AdBreakState) sNameMap.get(str);
    }
}
