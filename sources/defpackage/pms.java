package defpackage;

import com.spotify.music.features.premiumdestination.debug.PremiumPageLocale;

/* renamed from: pms reason: default package */
public final class pms implements wig<String> {
    private final wzi<fqn> a;

    private pms(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static pms a(wzi<fqn> wzi) {
        return new pms(wzi);
    }

    public final /* synthetic */ Object get() {
        PremiumPageLocale premiumPageLocale = (PremiumPageLocale) ((fqn) this.a.get()).a(pnr.g);
        if (premiumPageLocale.mCountry.isEmpty()) {
            return null;
        }
        return premiumPageLocale.mCountry;
    }
}
