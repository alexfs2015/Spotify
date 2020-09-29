package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ify$Km7brxXn4YFDGNu2etWZrQjzRPM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ify$Km7brxXn4YFDGNu2etWZrQjzRPM implements Consumer {
    private final /* synthetic */ AdSlot f$0;

    public /* synthetic */ $$Lambda$ify$Km7brxXn4YFDGNu2etWZrQjzRPM(AdSlot adSlot) {
        this.f$0 = adSlot;
    }

    public final void accept(Object obj) {
        Logger.b("Request to disable %s ad slot failed", this.f$0.toString());
    }
}
