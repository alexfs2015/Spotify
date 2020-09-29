package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hph$I8NZm2ybr9p4mcOrqBHeFteT_pY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hph$I8NZm2ybr9p4mcOrqBHeFteT_pY implements Consumer {
    private final /* synthetic */ hph f$0;
    private final /* synthetic */ AdSlot f$1;

    public /* synthetic */ $$Lambda$hph$I8NZm2ybr9p4mcOrqBHeFteT_pY(hph hph, AdSlot adSlot) {
        this.f$0 = hph;
        this.f$1 = adSlot;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (Response) obj);
    }
}
