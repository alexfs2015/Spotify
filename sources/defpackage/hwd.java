package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.flags.RolloutFlag;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;

/* renamed from: hwd reason: default package */
public final class hwd implements vua<jwc<Response>> {
    private final wlc<Observable<RolloutFlag>> a;

    private hwd(wlc<Observable<RolloutFlag>> wlc) {
        this.a = wlc;
    }

    public static hwd a(wlc<Observable<RolloutFlag>> wlc) {
        return new hwd(wlc);
    }

    public final /* synthetic */ Object get() {
        return (jwc) vuf.a(new jwc(vun.a((ObservableSource<T>) ((Observable) this.a.get()).c(1), BackpressureStrategy.BUFFER).f(RolloutFlag.c)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
