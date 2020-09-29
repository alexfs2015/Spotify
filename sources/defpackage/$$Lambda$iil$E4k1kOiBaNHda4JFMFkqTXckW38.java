package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$iil$E4k1kOiBaNHda4JFMFkqTXckW38 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$iil$E4k1kOiBaNHda4JFMFkqTXckW38 implements Action {
    private final /* synthetic */ AdSlot f$0;

    public /* synthetic */ $$Lambda$iil$E4k1kOiBaNHda4JFMFkqTXckW38(AdSlot adSlot) {
        this.f$0 = adSlot;
    }

    public final void run() {
        Logger.b("%s adslot cleared", this.f$0.toString());
    }
}
