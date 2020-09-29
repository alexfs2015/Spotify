package defpackage;

import com.spotify.mobile.android.spotlets.ads.rules.AdRules;

/* renamed from: hym reason: default package */
public final class hym implements wig<hyl> {
    private final wzi<AdRules> a;

    private hym(wzi<AdRules> wzi) {
        this.a = wzi;
    }

    public static hym a(wzi<AdRules> wzi) {
        return new hym(wzi);
    }

    public final /* synthetic */ Object get() {
        return new hyl(this.a);
    }
}
