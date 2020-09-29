package defpackage;

import com.spotify.mobile.android.spotlets.ads.rules.AdRules;

/* renamed from: hxb reason: default package */
public final class hxb implements vua<hxa> {
    private final wlc<AdRules> a;
    private final wlc<ife> b;

    private hxb(wlc<AdRules> wlc, wlc<ife> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hxb a(wlc<AdRules> wlc, wlc<ife> wlc2) {
        return new hxb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hxa((AdRules) this.a.get(), (ife) this.b.get());
    }
}
