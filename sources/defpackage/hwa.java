package defpackage;

import com.spotify.mobile.android.spotlets.ads.rules.AdRules;

/* renamed from: hwa reason: default package */
public final class hwa implements vua<hvz> {
    private final wlc<AdRules> a;

    private hwa(wlc<AdRules> wlc) {
        this.a = wlc;
    }

    public static hwa a(wlc<AdRules> wlc) {
        return new hwa(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hvz(this.a);
    }
}
