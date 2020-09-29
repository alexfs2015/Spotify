package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$ify$7Vw7BqMJ1_VtmWJ0t-wuEsH3YCE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ify$7Vw7BqMJ1_VtmWJ0twuEsH3YCE implements Action {
    private final /* synthetic */ AdSlot f$0;

    public /* synthetic */ $$Lambda$ify$7Vw7BqMJ1_VtmWJ0twuEsH3YCE(AdSlot adSlot) {
        this.f$0 = adSlot;
    }

    public final void run() {
        Logger.b("%s adslot cleared", this.f$0.toString());
    }
}
