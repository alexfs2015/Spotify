package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hph$sscFlhu3hvnon9U7CyQ1aJq-i0c reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hph$sscFlhu3hvnon9U7CyQ1aJqi0c implements Consumer {
    private final /* synthetic */ AdSlot f$0;

    public /* synthetic */ $$Lambda$hph$sscFlhu3hvnon9U7CyQ1aJqi0c(AdSlot adSlot) {
        this.f$0 = adSlot;
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, String.format("error registering %s", new Object[]{this.f$0.slot_id}), new Object[0]);
    }
}
