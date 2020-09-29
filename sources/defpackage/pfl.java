package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.ui.activity.upsell.model.Period;

/* renamed from: pfl reason: default package */
public final class pfl implements vua<wud<Offer>> {
    private static final pfl a = new pfl();

    public static pfl a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(wuh.a((wuh<T>) wxt.a(Offer.create(false, Period.create("-", 0, "day"), null, "premium"))), "Cannot return null from a non-@Nullable @Provides method");
    }
}
