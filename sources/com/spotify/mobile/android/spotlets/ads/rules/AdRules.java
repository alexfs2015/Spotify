package com.spotify.mobile.android.spotlets.ads.rules;

import com.spotify.base.java.logging.Logger;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AdRules {
    private static final String c = AdRules.class.getSimpleName();
    public final Set<uqm> a = new HashSet();
    public final Map<Class<? extends ift>, ift> b;

    public enum StateType {
        CAR_CONNECTED,
        DISABLED_NAVIGATION_ITEM,
        MIDROLL_VIDEO_ADS,
        ON_SPONSORED_PAGE,
        PLAYING_FROM_SPONSORED_CONTEXT,
        WATCH_NOW_SLOT,
        STREAMING_AD_IN_PROGRESS,
        WIFI_DISCONNECTED
    }

    public AdRules(ifu ifu) {
        this.b = ifu.a();
    }

    public final void a() {
        for (Entry value : this.b.entrySet()) {
            ((ift) value.getValue()).f();
        }
    }

    public final void a(StateType stateType, boolean z) {
        a(new ifo(stateType, z));
    }

    public void a(ifo ifo) {
        String str = "anseep %tUdts  Staaeto%s:t";
        Logger.b("%s onStateUpdate state: %s", c, ifo);
        for (ift a2 : this.b.values()) {
            a2.a(ifo);
        }
    }
}
