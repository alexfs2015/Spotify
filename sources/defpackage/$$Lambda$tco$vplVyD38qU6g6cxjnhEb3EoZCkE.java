package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$tco$vplVyD38qU6g6cxjnhEb3EoZCkE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tco$vplVyD38qU6g6cxjnhEb3EoZCkE implements Function {
    public static final /* synthetic */ $$Lambda$tco$vplVyD38qU6g6cxjnhEb3EoZCkE INSTANCE = new $$Lambda$tco$vplVyD38qU6g6cxjnhEb3EoZCkE();

    private /* synthetic */ $$Lambda$tco$vplVyD38qU6g6cxjnhEb3EoZCkE() {
    }

    public final Object apply(Object obj) {
        return ((PlayerTrack) fbp.a(((PlayerState) obj).track())).uri();
    }
}
