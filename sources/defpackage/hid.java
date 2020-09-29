package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.session.impl.SessionClientImpl;
import com.spotify.cosmos.session.model.LoginCredentials;
import com.spotify.cosmos.session.model.LoginOptions;
import com.spotify.cosmos.session.model.LoginRequest;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: hid reason: default package */
final class hid {
    private final Cosmonaut a;
    private final wzi<LoginOptions> b;

    hid(Cosmonaut cosmonaut, wzi<LoginOptions> wzi) {
        this.a = cosmonaut;
        this.b = wzi;
    }

    /* access modifiers changed from: 0000 */
    public final Disposable a(RxRouter rxRouter) {
        return new SessionClientImpl(this.a, rxRouter).login(LoginRequest.create(LoginCredentials.autologin(), (LoginOptions) this.b.get())).a((Consumer<? super T>) $$Lambda$hid$_etMp1EK9N_QR_6Fk6XF7NuF7mk.INSTANCE, (Consumer<? super Throwable>) $$Lambda$hid$ZNvU4PG6X7wG5pA1_4j2VyxuII.INSTANCE);
    }
}
