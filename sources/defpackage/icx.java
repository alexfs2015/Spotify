package defpackage;

import com.spotify.mobile.android.spotlets.ads.rules.AdRules;

/* renamed from: icx reason: default package */
public final class icx implements vua<AdRules> {
    private final wlc<idh> a;

    private icx(wlc<idh> wlc) {
        this.a = wlc;
    }

    public static icx a(wlc<idh> wlc) {
        return new icx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new AdRules((idh) this.a.get());
    }
}
