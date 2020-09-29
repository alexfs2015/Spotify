package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import io.reactivex.functions.Consumer;

/* renamed from: ieb reason: default package */
public final class ieb implements Consumer<AdSlotEvent> {
    private final iep a;

    public final /* synthetic */ void accept(Object obj) {
        this.a.accept((AdSlotEvent) obj);
    }

    ieb(iep iep) {
        this.a = iep;
    }
}
