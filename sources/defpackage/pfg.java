package defpackage;

import com.spotify.music.features.premiumdestination.debug.PremiumPageLocale;

/* renamed from: pfg reason: default package */
public final class pfg implements vua<String> {
    private final wlc<fpt> a;

    private pfg(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static pfg a(wlc<fpt> wlc) {
        return new pfg(wlc);
    }

    public final /* synthetic */ Object get() {
        PremiumPageLocale premiumPageLocale = (PremiumPageLocale) ((fpt) this.a.get()).a(pgq.h);
        if (premiumPageLocale.mCountry.isEmpty()) {
            return null;
        }
        return premiumPageLocale.mCountry;
    }
}
