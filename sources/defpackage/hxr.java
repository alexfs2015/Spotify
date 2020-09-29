package defpackage;

import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.spotlets.ads.model.AdState;
import com.spotify.mobile.android.spotlets.ads.model.State;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: hxr reason: default package */
public final class hxr implements hxj {
    private final gky<AdState> a;

    public hxr(gky<AdState> gky) {
        this.a = gky;
    }

    public final Observable<State> a() {
        return vun.b(this.a.resolve(new Request(Request.GET, "sp://ads/v1/state"))).c((Function<? super T, ? extends R>) $$Lambda$JlFHb5JpxvEJuTG0AJUbk17K1go.INSTANCE);
    }
}
