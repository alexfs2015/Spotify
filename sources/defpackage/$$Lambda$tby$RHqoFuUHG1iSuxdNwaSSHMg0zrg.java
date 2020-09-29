package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$tby$RHqoFuUHG1iSuxdNwaSSHMg0zrg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$tby$RHqoFuUHG1iSuxdNwaSSHMg0zrg implements Function {
    public static final /* synthetic */ $$Lambda$tby$RHqoFuUHG1iSuxdNwaSSHMg0zrg INSTANCE = new $$Lambda$tby$RHqoFuUHG1iSuxdNwaSSHMg0zrg();

    private /* synthetic */ $$Lambda$tby$RHqoFuUHG1iSuxdNwaSSHMg0zrg() {
    }

    public final Object apply(Object obj) {
        return ((PlayerTrack) fay.a(((PlayerState) obj).track())).uri();
    }
}
