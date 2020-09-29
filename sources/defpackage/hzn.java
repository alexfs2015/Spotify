package defpackage;

import com.spotify.mobile.android.spotlets.ads.rules.AdRules;

/* renamed from: hzn reason: default package */
public final class hzn implements wig<hzm> {
    private final wzi<AdRules> a;
    private final wzi<ihr> b;

    private hzn(wzi<AdRules> wzi, wzi<ihr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hzn a(wzi<AdRules> wzi, wzi<ihr> wzi2) {
        return new hzn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hzm((AdRules) this.a.get(), (ihr) this.b.get());
    }
}
