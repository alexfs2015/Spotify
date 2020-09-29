package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$ijg$Jy0j0r0cfYO3n8TTPO4Alvp03Lc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ijg$Jy0j0r0cfYO3n8TTPO4Alvp03Lc implements Predicate {
    public static final /* synthetic */ $$Lambda$ijg$Jy0j0r0cfYO3n8TTPO4Alvp03Lc INSTANCE = new $$Lambda$ijg$Jy0j0r0cfYO3n8TTPO4Alvp03Lc();

    private /* synthetic */ $$Lambda$ijg$Jy0j0r0cfYO3n8TTPO4Alvp03Lc() {
    }

    public final boolean test(Object obj) {
        return Boolean.parseBoolean((String) ((Ad) obj).metadata().get("fireImpressionOnStart"));
    }
}
