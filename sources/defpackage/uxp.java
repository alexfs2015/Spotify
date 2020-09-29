package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/* renamed from: uxp reason: default package */
final class uxp implements uxn {
    private final uxo a;

    public uxp(uxo uxo) {
        this.a = uxo;
    }

    public final Single<uyv> a(Optional<String> optional, a aVar) {
        Single single;
        Optional a2 = aVar.a();
        if (a2.b()) {
            if (optional.b()) {
                single = this.a.a((String) optional.c(), aVar.n(), (RootlistRequestPayload) a2.c());
            } else {
                single = this.a.a(aVar.n(), (RootlistRequestPayload) a2.c());
            }
        } else if (optional.b()) {
            single = this.a.a((String) optional.c(), aVar.n());
        } else {
            single = this.a.a(aVar.n());
        }
        return single.f($$Lambda$WDxDzYCEbnfY4ndRppwgFFjewCk.INSTANCE);
    }

    public final Observable<uyv> b(Optional<String> optional, a aVar) {
        Observable observable;
        Optional a2 = aVar.a();
        if (a2.b()) {
            if (optional.b()) {
                observable = this.a.b((String) optional.c(), aVar.n(), (RootlistRequestPayload) a2.c());
            } else {
                observable = this.a.b(aVar.n(), (RootlistRequestPayload) a2.c());
            }
        } else if (optional.b()) {
            observable = this.a.b((String) optional.c(), aVar.n());
        } else {
            observable = this.a.b(aVar.n());
        }
        return observable.c((Function<? super T, ? extends R>) $$Lambda$WDxDzYCEbnfY4ndRppwgFFjewCk.INSTANCE);
    }
}
