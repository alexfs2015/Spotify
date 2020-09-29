package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ids$jEglpenkSZqkNeWvx2QiiSF9_dk reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ids$jEglpenkSZqkNeWvx2QiiSF9_dk implements Consumer {
    public static final /* synthetic */ $$Lambda$ids$jEglpenkSZqkNeWvx2QiiSF9_dk INSTANCE = new $$Lambda$ids$jEglpenkSZqkNeWvx2QiiSF9_dk();

    private /* synthetic */ $$Lambda$ids$jEglpenkSZqkNeWvx2QiiSF9_dk() {
    }

    public final void accept(Object obj) {
        Logger.c("AdSlotEvent Emitted %s %s %s %s", ((AdSlotEvent) obj).getFormat(), ((AdSlotEvent) obj).getAd().getAdType(), ((AdSlotEvent) obj).getEvent(), (AdSlotEvent) obj);
    }
}
