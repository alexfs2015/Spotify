package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent.Event;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.SponsorshipAdData;
import io.reactivex.functions.Consumer;
import org.json.JSONException;

/* renamed from: ifi reason: default package */
public final class ifi implements Consumer<AdSlotEvent> {
    private final ife a;

    public final /* synthetic */ void accept(Object obj) {
        AdSlotEvent adSlotEvent = (AdSlotEvent) obj;
        Ad ad = adSlotEvent.getAd();
        boolean z = Event.AVAILABLE == adSlotEvent.getEvent();
        boolean isPreview = ad.isPreview();
        Logger.b("SPL isAdSlotEventAvailable: %b", Boolean.valueOf(z));
        Logger.b("SPL isPreview: %b", Boolean.valueOf(isPreview));
        if (z && isPreview) {
            try {
                this.a.c = SponsorshipAdData.fromPreviewAd(ad);
                Logger.c("Sponsorship loaded, go to any playlist to show it", new Object[0]);
            } catch (JSONException unused) {
                Logger.c("Malformed sponsorship ad data", new Object[0]);
            }
        }
    }

    public ifi(ife ife) {
        this.a = ife;
    }
}
