package defpackage;

import com.spotify.music.features.premiumdestination.debug.PremiumPageLocale;

/* renamed from: pfq reason: default package */
public final class pfq implements vua<String> {
    private final wlc<fpt> a;
    private final wlc<String> b;

    private pfq(wlc<fpt> wlc, wlc<String> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pfq a(wlc<fpt> wlc, wlc<String> wlc2) {
        return new pfq(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        String str = (String) this.b.get();
        PremiumPageLocale premiumPageLocale = (PremiumPageLocale) ((fpt) this.a.get()).a(pgq.h);
        if (!premiumPageLocale.mLocale.isEmpty()) {
            str = premiumPageLocale.mLocale;
        }
        return (String) vuf.a(str, "Cannot return null from a non-@Nullable @Provides method");
    }
}
