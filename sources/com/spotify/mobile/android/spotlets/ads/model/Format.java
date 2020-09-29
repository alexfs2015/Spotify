package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonValue;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public enum Format implements JacksonModel, igl {
    AUDIO("audio"),
    BANNER("banner"),
    VIDEO("video");
    
    private static final Map<String, Format> sNameMap = null;
    private final String mName;

    static {
        sNameMap = new HashMap();
        Iterator it = EnumSet.allOf(Format.class).iterator();
        while (it.hasNext()) {
            Format format = (Format) it.next();
            sNameMap.put(format.getName(), format);
        }
    }

    private Format(String str) {
        this.mName = str;
    }

    public static Format getByName(String str) {
        return (Format) sNameMap.get(str);
    }

    public final String getCosmosEndpoint() {
        String str = "smsd/psa1/s:vf/stra/o%";
        return String.format("sp://ads/v1/formats/%s", new Object[]{getName()});
    }

    @JsonValue
    public final String getName() {
        return this.mName;
    }
}
