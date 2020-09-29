package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$sVGzRPruqHktC587ohyBQjM1_Ds reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$sVGzRPruqHktC587ohyBQjM1_Ds implements Predicate {
    public static final /* synthetic */ $$Lambda$sVGzRPruqHktC587ohyBQjM1_Ds INSTANCE = new $$Lambda$sVGzRPruqHktC587ohyBQjM1_Ds();

    private /* synthetic */ $$Lambda$sVGzRPruqHktC587ohyBQjM1_Ds() {
    }

    public final boolean test(Object obj) {
        return ((Ad) obj).isSkippableAd();
    }
}
