package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: imp reason: default package */
public final class imp extends ims {
    private final Context c;
    private Disposable d;
    private SessionState e;
    private final Scheduler f;

    public imp(Context context, hpt hpt, a aVar, Scheduler scheduler) {
        super(hpt, aVar);
        this.c = (Context) fbp.a(context);
        this.f = scheduler;
    }

    private AppProtocol.SessionState a(SessionState sessionState) {
        return new AppProtocol.SessionState(sessionState, jvt.a(this.c));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(SessionState sessionState) {
        this.e = sessionState;
        a((Object) a(sessionState));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.e = null;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.d = this.b.g().a.j().a(this.f).a((Action) new $$Lambda$imp$oiGq6QS9MU2Rbnwn0lb6AaRA_tU(this)).a((Consumer<? super T>) new $$Lambda$imp$qnlYOrnab6ngtKADJZqWfG5G1A<Object>(this), (Consumer<? super Throwable>) $$Lambda$imp$C04z2k2wbAkYfj2ucGjKNE3wzD8.INSTANCE);
    }

    public final void a(iln iln, int i) {
        a((Object) a(this.e));
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Disposable disposable = this.d;
        if (disposable != null && !disposable.b()) {
            this.d.bd_();
        }
    }
}
