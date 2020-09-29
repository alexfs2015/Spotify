package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.music.features.premiumdestination.debug.PremiumPageLocale;

/* renamed from: pnr reason: default package */
public final class pnr extends hmm {
    public static final fqu a = hmh.b("premium_legal_test", Overridable.INTERNAL);
    public static final fql<RolloutFlag> b = hmh.f("journey_premium_hubs_page_android", Overridable.INTERNAL);
    public static final fql<RolloutFlag> c = hmh.f("journey_premium_hubs_page_backend_android", Overridable.INTERNAL);
    public static final fql<RolloutFlag> d = hmh.f("conversion_india_premium_page_cta_override_android", Overridable.INTERNAL);
    public static final fql<RolloutFlag> e = hmh.f("conversion_vietnam_premium_page_cta_override_android", Overridable.INTERNAL);
    public static final fqu f = hmh.b("local_premium_destination_eligibility_override", Overridable.INTERNAL);
    public static final fql<PremiumPageLocale> g = hmh.a("local_premium_destination_locale_override", PremiumPageLocale.class, PremiumPageLocale.DEFAULT_LOCALE, Overridable.INTERNAL);
}
