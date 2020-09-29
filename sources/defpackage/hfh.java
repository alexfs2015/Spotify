package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.session.impl.SessionClientImpl;
import com.spotify.cosmos.session.model.LoginCredentials;
import com.spotify.cosmos.session.model.LoginOptions;
import com.spotify.cosmos.session.model.LoginRequest;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: hfh reason: default package */
final class hfh {
    private final Cosmonaut a;
    private final wlc<LoginOptions> b;

    hfh(Cosmonaut cosmonaut, wlc<LoginOptions> wlc) {
        this.a = cosmonaut;
        this.b = wlc;
    }

    /* access modifiers changed from: 0000 */
    public final Disposable a(RxRouter rxRouter) {
        return new SessionClientImpl(this.a, rxRouter).login(LoginRequest.create(LoginCredentials.autologin(), (LoginOptions) this.b.get())).a((Consumer<? super T>) $$Lambda$hfh$zlJviuO3h2jEW6ei9CuXh1kTT8.INSTANCE, (Consumer<? super Throwable>) $$Lambda$hfh$28DlJc9FL3XoIuZ8wxSZ4uAxIxU.INSTANCE);
    }
}
