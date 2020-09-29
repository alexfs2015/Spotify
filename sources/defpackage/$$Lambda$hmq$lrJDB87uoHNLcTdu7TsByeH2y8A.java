package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hmq$lrJDB87uoHNLcTdu7TsByeH2y8A reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hmq$lrJDB87uoHNLcTdu7TsByeH2y8A implements Consumer {
    public static final /* synthetic */ $$Lambda$hmq$lrJDB87uoHNLcTdu7TsByeH2y8A INSTANCE = new $$Lambda$hmq$lrJDB87uoHNLcTdu7TsByeH2y8A();

    private /* synthetic */ $$Lambda$hmq$lrJDB87uoHNLcTdu7TsByeH2y8A() {
    }

    public final void accept(Object obj) {
        Logger.c("subscribed to %s", AdSlot.SPONSORED_PLAYLIST.getCosmosEndpoint());
    }
}
