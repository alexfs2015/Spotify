package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.music.features.premiumdestination.debug.PremiumPageLocale;

/* renamed from: pgq reason: default package */
public final class pgq extends hju {
    public static final fqa a = hjp.b("journey_premium_destination_layout_1_android", Overridable.INTERNAL);
    public static final fqa b = hjp.b("premium_legal_test", Overridable.INTERNAL);
    public static final fpr<RolloutFlag> c = hjp.f("journey_premium_hubs_page_android", Overridable.INTERNAL);
    public static final fpr<RolloutFlag> d = hjp.f("journey_premium_hubs_page_backend_android", Overridable.INTERNAL);
    public static final fpr<RolloutFlag> e = hjp.f("conversion_india_premium_page_cta_override_android", Overridable.INTERNAL);
    public static final fpr<RolloutFlag> f = hjp.f("conversion_vietnam_premium_page_cta_override_android", Overridable.INTERNAL);
    public static final fqa g = hjp.b("local_premium_destination_eligibility_override", Overridable.INTERNAL);
    public static final fpr<PremiumPageLocale> h = hjp.a("local_premium_destination_locale_override", PremiumPageLocale.class, PremiumPageLocale.DEFAULT_LOCALE, Overridable.INTERNAL);
}
