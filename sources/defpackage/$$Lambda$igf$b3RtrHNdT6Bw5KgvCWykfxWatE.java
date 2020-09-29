package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$igf$b3-RtrHNdT6Bw5KgvCWykfxWatE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$igf$b3RtrHNdT6Bw5KgvCWykfxWatE implements Consumer {
    public static final /* synthetic */ $$Lambda$igf$b3RtrHNdT6Bw5KgvCWykfxWatE INSTANCE = new $$Lambda$igf$b3RtrHNdT6Bw5KgvCWykfxWatE();

    private /* synthetic */ $$Lambda$igf$b3RtrHNdT6Bw5KgvCWykfxWatE() {
    }

    public final void accept(Object obj) {
        Logger.c("AdSlotEvent Emitted %s %s %s %s", ((AdSlotEvent) obj).getFormat(), ((AdSlotEvent) obj).getAd().getAdType(), ((AdSlotEvent) obj).getEvent(), (AdSlotEvent) obj);
    }
}
