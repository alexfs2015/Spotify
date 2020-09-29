package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$rsc$AotZW8rAVMWftz7foCQHsFXD_vU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rsc$AotZW8rAVMWftz7foCQHsFXD_vU implements Consumer {
    private final /* synthetic */ rsc f$0;
    private final /* synthetic */ rsi f$1;

    public /* synthetic */ $$Lambda$rsc$AotZW8rAVMWftz7foCQHsFXD_vU(rsc rsc, rsi rsi) {
        this.f$0 = rsc;
        this.f$1 = rsi;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (PlayerState) obj);
    }
}
