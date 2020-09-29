package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import io.reactivex.functions.Consumer;

/* renamed from: igo reason: default package */
public final class igo implements Consumer<AdSlotEvent> {
    private final ihc a;

    igo(ihc ihc) {
        this.a = ihc;
    }

    public final /* synthetic */ void accept(Object obj) {
        this.a.accept((AdSlotEvent) obj);
    }
}
