package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: ikc reason: default package */
public final class ikc extends ikf {
    private final Context c;
    private Disposable d;
    private SessionState e;
    private final Scheduler f;

    public ikc(Context context, hne hne, a aVar, Scheduler scheduler) {
        super(hne, aVar);
        this.c = (Context) fay.a(context);
        this.f = scheduler;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.d = this.b.g().a.j().a(this.f).a((Action) new $$Lambda$ikc$z1jmFg6SNGgdp2g6uxKQHbaEg8(this)).a((Consumer<? super T>) new $$Lambda$ikc$vg4xcO9xieErvIJ70xQJ1N1_hCA<Object>(this), (Consumer<? super Throwable>) $$Lambda$ikc$seFjAt_QVydPKWHrVKRaU4Fi7oo.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.e = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(SessionState sessionState) {
        this.e = sessionState;
        a((Object) a(sessionState));
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Disposable disposable = this.d;
        if (disposable != null && !disposable.b()) {
            this.d.bf_();
        }
    }

    public final void a(ija ija, int i) {
        a((Object) a(this.e));
    }

    private AppProtocol.SessionState a(SessionState sessionState) {
        return new AppProtocol.SessionState(sessionState, jtl.a(this.c));
    }
}
