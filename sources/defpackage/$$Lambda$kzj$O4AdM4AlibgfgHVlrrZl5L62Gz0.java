package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kzj$O4AdM4AlibgfgHVlrrZl5L62Gz0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kzj$O4AdM4AlibgfgHVlrrZl5L62Gz0 implements Function {
    public static final /* synthetic */ $$Lambda$kzj$O4AdM4AlibgfgHVlrrZl5L62Gz0 INSTANCE = new $$Lambda$kzj$O4AdM4AlibgfgHVlrrZl5L62Gz0();

    private /* synthetic */ $$Lambda$kzj$O4AdM4AlibgfgHVlrrZl5L62Gz0() {
    }

    public final Object apply(Object obj) {
        return ((PlayerTrack) fbp.a(((PlayerState) obj).track())).uri();
    }
}
