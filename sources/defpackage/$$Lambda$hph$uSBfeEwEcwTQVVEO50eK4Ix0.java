package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hph$uSBfeEwE-cwTQVVEO5--0eK4Ix0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hph$uSBfeEwEcwTQVVEO50eK4Ix0 implements Consumer {
    public static final /* synthetic */ $$Lambda$hph$uSBfeEwEcwTQVVEO50eK4Ix0 INSTANCE = new $$Lambda$hph$uSBfeEwEcwTQVVEO50eK4Ix0();

    private /* synthetic */ $$Lambda$hph$uSBfeEwEcwTQVVEO50eK4Ix0() {
    }

    public final void accept(Object obj) {
        Logger.c("subscribed to %s", AdSlot.MOBILE_SCREENSAVER.getCosmosEndpoint());
    }
}
