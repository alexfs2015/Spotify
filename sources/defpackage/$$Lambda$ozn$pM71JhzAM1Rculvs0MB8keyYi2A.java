package defpackage;

import com.google.common.base.Function;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: -$$Lambda$ozn$pM71JhzAM1Rculvs0MB8keyYi2A reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ozn$pM71JhzAM1Rculvs0MB8keyYi2A implements Function {
    private final /* synthetic */ PlayerTrack f$0;

    public /* synthetic */ $$Lambda$ozn$pM71JhzAM1Rculvs0MB8keyYi2A(PlayerTrack playerTrack) {
        this.f$0 = playerTrack;
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f$0.uri().equals(((PlayerTrack) obj).uri()));
    }
}
