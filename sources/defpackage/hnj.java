package defpackage;

import com.spotify.cosmos.session.BootstrapHandler;
import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: hnj reason: default package */
public final class hnj implements BootstrapHandler {
    private final gil a;
    private final rxi b;

    hnj(gil gil, rxi rxi) {
        this.a = gil;
        this.b = rxi;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(Function function, LoginResponse loginResponse) {
        if (!loginResponse.isBootstrapRequired()) {
            return Single.b(loginResponse);
        }
        return this.b.a(new gik((giz) gil.a(this.a.a.get(), 1), (String) gil.a(loginResponse.asBootstrapRequired().accessToken(), 2)).a).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hnj$Eg4SVnBewy4l4hnQdlVlEb_hJA8<Object,Object>(function));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SingleSource a(Function function, rxm rxm) {
        return (Single) function.apply(rxm.a());
    }

    public final Function<LoginResponse, Single<LoginResponse>> continueWith(Function<byte[], Single<LoginResponse>> function) {
        return new $$Lambda$hnj$0GAO70qzY6ByWgwv09zAF0lw8n0(this, function);
    }
}
