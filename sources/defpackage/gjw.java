package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.http.wg.TokenResponse;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: gjw reason: default package */
public final class gjw implements wig<b> {
    private final wzi<RxResolver> a;
    private final wzi<Scheduler> b;
    private final wzi<ObservableTransformer<Response, TokenResponse>> c;

    private gjw(wzi<RxResolver> wzi, wzi<Scheduler> wzi2, wzi<ObservableTransformer<Response, TokenResponse>> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static gjw a(wzi<RxResolver> wzi, wzi<Scheduler> wzi2, wzi<ObservableTransformer<Response, TokenResponse>> wzi3) {
        return new gjw(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new b((RxResolver) this.a.get(), (Scheduler) this.b.get(), (ObservableTransformer) this.c.get());
    }
}
