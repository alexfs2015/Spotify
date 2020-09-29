package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ssh$KuVgTY1mqIcbScdBPxvCK0DFQi0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ssh$KuVgTY1mqIcbScdBPxvCK0DFQi0 implements Function {
    public static final /* synthetic */ $$Lambda$ssh$KuVgTY1mqIcbScdBPxvCK0DFQi0 INSTANCE = new $$Lambda$ssh$KuVgTY1mqIcbScdBPxvCK0DFQi0();

    private /* synthetic */ $$Lambda$ssh$KuVgTY1mqIcbScdBPxvCK0DFQi0() {
    }

    public final Object apply(Object obj) {
        return ((PlayerTrack) fay.a(((PlayerState) obj).track())).uri();
    }
}
