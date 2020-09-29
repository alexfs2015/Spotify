package defpackage;

import com.spotify.cosmos.session.BootstrapHandler;
import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: hkr reason: default package */
public final class hkr implements BootstrapHandler {
    private final gha a;
    private final roc b;

    hkr(gha gha, roc roc) {
        this.a = gha;
        this.b = roc;
    }

    public final Function<LoginResponse, Single<LoginResponse>> continueWith(Function<byte[], Single<LoginResponse>> function) {
        return new $$Lambda$hkr$GlGJZNUrm0We9pdWKvyJnxXmwzo(this, function);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(Function function, LoginResponse loginResponse) {
        if (!loginResponse.isBootstrapRequired()) {
            return Single.b(loginResponse);
        }
        return this.b.a(new ggz((gho) gha.a(this.a.a.get(), 1), (String) gha.a(loginResponse.asBootstrapRequired().accessToken(), 2)).a).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hkr$IFQEF3yTdOIPZuiP5_OxmufQo38<Object,Object>(function));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SingleSource a(Function function, rog rog) {
        return (Single) function.apply(rog.a());
    }
}
