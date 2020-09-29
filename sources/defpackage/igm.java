package defpackage;

import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.Ad.FeaturedActionType;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent.Event;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: igm reason: default package */
public final class igm implements Consumer<AdSlotEvent> {
    private final SlotApi a;
    private Disposable b;

    public igm(SlotApi slotApi) {
        this.a = slotApi;
    }

    private void a(Ad ad) {
        String dependentSlot = ad.getDependentSlot() != null ? ad.getDependentSlot() : AdSlot.WATCHNOW.getSlotId();
        this.b = this.a.a(dependentSlot, Intent.NEXT_TRACK).a((Action) new $$Lambda$igm$R2nlAXRBRD87wbDVS22HQyNpaI8(dependentSlot), (Consumer<? super Throwable>) new $$Lambda$igm$olUSK5cdkzxmn6ovFqCheO0bFs<Object>(dependentSlot));
    }

    /* renamed from: a */
    public final void accept(AdSlotEvent adSlotEvent) {
        Ad ad = adSlotEvent.getAd();
        Event event = adSlotEvent.getEvent();
        if (FeaturedActionType.OPT_OUT == ad.getFeaturedActionType() && Event.PLAY == event) {
            a(ad);
        }
    }
}
