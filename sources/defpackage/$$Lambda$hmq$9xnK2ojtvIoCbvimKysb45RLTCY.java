package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hmq$9xnK2ojtvIoCbvimKysb45RLTCY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hmq$9xnK2ojtvIoCbvimKysb45RLTCY implements Consumer {
    public static final /* synthetic */ $$Lambda$hmq$9xnK2ojtvIoCbvimKysb45RLTCY INSTANCE = new $$Lambda$hmq$9xnK2ojtvIoCbvimKysb45RLTCY();

    private /* synthetic */ $$Lambda$hmq$9xnK2ojtvIoCbvimKysb45RLTCY() {
    }

    public final void accept(Object obj) {
        Logger.c("subscribed to %s", AdSlot.MOBILE_SCREENSAVER.getCosmosEndpoint());
    }
}
