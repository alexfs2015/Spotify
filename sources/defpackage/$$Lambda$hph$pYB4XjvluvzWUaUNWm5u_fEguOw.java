package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hph$pYB4XjvluvzWUaUNWm5u_fEguOw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hph$pYB4XjvluvzWUaUNWm5u_fEguOw implements Consumer {
    public static final /* synthetic */ $$Lambda$hph$pYB4XjvluvzWUaUNWm5u_fEguOw INSTANCE = new $$Lambda$hph$pYB4XjvluvzWUaUNWm5u_fEguOw();

    private /* synthetic */ $$Lambda$hph$pYB4XjvluvzWUaUNWm5u_fEguOw() {
    }

    public final void accept(Object obj) {
        Logger.c("subscribed to %s", AdSlot.SPONSORED_PLAYLIST.getCosmosEndpoint());
    }
}
