package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.http.wg.TokenResponse;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: gil reason: default package */
public final class gil implements vua<b> {
    private final wlc<RxResolver> a;
    private final wlc<Scheduler> b;
    private final wlc<ObservableTransformer<Response, TokenResponse>> c;

    private gil(wlc<RxResolver> wlc, wlc<Scheduler> wlc2, wlc<ObservableTransformer<Response, TokenResponse>> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static gil a(wlc<RxResolver> wlc, wlc<Scheduler> wlc2, wlc<ObservableTransformer<Response, TokenResponse>> wlc3) {
        return new gil(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new b((RxResolver) this.a.get(), (Scheduler) this.b.get(), (ObservableTransformer) this.c.get());
    }
}
