package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdProduct;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import io.reactivex.functions.Function;

/* renamed from: igb reason: default package */
public final class igb implements Function<AdSlotEvent, AdProduct> {
    public final /* synthetic */ Object apply(Object obj) {
        String formatString = ((AdSlotEvent) obj).getFormatString();
        return "video".equals(formatString) ? AdProduct.VIDEO_AD : "audio".equals(formatString) ? AdProduct.AUDIO_AD : AdProduct.UNKNOWN;
    }
}
