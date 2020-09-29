package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ozn$wCIGtE9YeBVOQPb-p-Bsmdwbwas reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ozn$wCIGtE9YeBVOQPbpBsmdwbwas implements Function {
    private final /* synthetic */ ozn f$0;
    private final /* synthetic */ PlayerTrack f$1;
    private final /* synthetic */ Optional f$2;

    public /* synthetic */ $$Lambda$ozn$wCIGtE9YeBVOQPbpBsmdwbwas(ozn ozn, PlayerTrack playerTrack, Optional optional) {
        this.f$0 = ozn;
        this.f$1 = playerTrack;
        this.f$2 = optional;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, this.f$2, (PlayerQueue) obj);
    }
}
