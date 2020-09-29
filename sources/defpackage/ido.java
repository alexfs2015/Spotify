package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdProduct;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import io.reactivex.functions.Function;

/* renamed from: ido reason: default package */
public final class ido implements Function<AdSlotEvent, AdProduct> {
    public final /* synthetic */ Object apply(Object obj) {
        String formatString = ((AdSlotEvent) obj).getFormatString();
        if ("video".equals(formatString)) {
            return AdProduct.VIDEO_AD;
        }
        if ("audio".equals(formatString)) {
            return AdProduct.AUDIO_AD;
        }
        return AdProduct.UNKNOWN;
    }
}
