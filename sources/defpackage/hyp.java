package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.flags.RolloutFlag;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;

/* renamed from: hyp reason: default package */
public final class hyp implements wig<jyk<Response>> {
    private final wzi<Observable<RolloutFlag>> a;

    private hyp(wzi<Observable<RolloutFlag>> wzi) {
        this.a = wzi;
    }

    public static hyp a(wzi<Observable<RolloutFlag>> wzi) {
        return new hyp(wzi);
    }

    public final /* synthetic */ Object get() {
        return (jyk) wil.a(new jyk(wit.a((ObservableSource<T>) ((Observable) this.a.get()).c(1), BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) RolloutFlag.c)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
