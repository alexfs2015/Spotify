package defpackage;

import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.spotlets.ads.model.AdState;
import com.spotify.mobile.android.spotlets.ads.model.State;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: iad reason: default package */
public final class iad implements hzv {
    private final gmm<AdState> a;

    public iad(gmm<AdState> gmm) {
        this.a = gmm;
    }

    public final Observable<State> a() {
        return wit.b(this.a.resolve(new Request(Request.GET, "sp://ads/v1/state"))).c((Function<? super T, ? extends R>) $$Lambda$JlFHb5JpxvEJuTG0AJUbk17K1go.INSTANCE);
    }
}
