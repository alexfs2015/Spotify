package defpackage;

import com.spotify.music.features.premiumdestination.debug.PremiumPageLocale;

/* renamed from: pnc reason: default package */
public final class pnc implements wig<String> {
    private final wzi<fqn> a;
    private final wzi<String> b;

    private pnc(wzi<fqn> wzi, wzi<String> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pnc a(wzi<fqn> wzi, wzi<String> wzi2) {
        return new pnc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        String str = (String) this.b.get();
        PremiumPageLocale premiumPageLocale = (PremiumPageLocale) ((fqn) this.a.get()).a(pnr.g);
        if (!premiumPageLocale.mLocale.isEmpty()) {
            str = premiumPageLocale.mLocale;
        }
        return (String) wil.a(str, "Cannot return null from a non-@Nullable @Provides method");
    }
}
