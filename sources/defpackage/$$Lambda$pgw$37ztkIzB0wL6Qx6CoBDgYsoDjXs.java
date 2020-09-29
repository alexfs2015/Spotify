package defpackage;

import com.google.common.base.Function;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: -$$Lambda$pgw$37ztkIzB0wL6Qx6CoBDgYsoDjXs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pgw$37ztkIzB0wL6Qx6CoBDgYsoDjXs implements Function {
    private final /* synthetic */ PlayerTrack f$0;

    public /* synthetic */ $$Lambda$pgw$37ztkIzB0wL6Qx6CoBDgYsoDjXs(PlayerTrack playerTrack) {
        this.f$0 = playerTrack;
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f$0.uri().equals(((PlayerTrack) obj).uri()));
    }
}
