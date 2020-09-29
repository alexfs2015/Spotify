package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$jir$HBQ5_P_PxN7H0kyTkws1u21YCjQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jir$HBQ5_P_PxN7H0kyTkws1u21YCjQ implements Function {
    public static final /* synthetic */ $$Lambda$jir$HBQ5_P_PxN7H0kyTkws1u21YCjQ INSTANCE = new $$Lambda$jir$HBQ5_P_PxN7H0kyTkws1u21YCjQ();

    private /* synthetic */ $$Lambda$jir$HBQ5_P_PxN7H0kyTkws1u21YCjQ() {
    }

    public final Object apply(Object obj) {
        return ((PlayerTrack) fbp.a(((PlayerState) obj).track())).uri();
    }
}
