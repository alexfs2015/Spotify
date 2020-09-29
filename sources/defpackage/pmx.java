package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.ui.activity.upsell.model.Period;

/* renamed from: pmx reason: default package */
public final class pmx implements wig<xii<Offer>> {
    private static final pmx a = new pmx();

    public static pmx a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(xim.a((xim<T>) xly.a(Offer.create(false, Period.create("-", 0, "day"), null, "premium"))), "Cannot return null from a non-@Nullable @Provides method");
    }
}
