package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Status;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: imr reason: default package */
public final class imr extends ims {
    private final Context c;
    private Status d;
    private Disposable e;
    private final Scheduler f;

    public imr(Context context, hpt hpt, a aVar, Scheduler scheduler) {
        super(hpt, aVar);
        this.c = (Context) fbp.a(context);
        this.f = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Status a(SessionState sessionState) {
        return sessionState.loggedIn() ? Status.OK : Status.createNotLoggedIn(this.c);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Status status) {
        Status status2 = this.d;
        if (status2 == null || !status2.equals(status)) {
            a((Object) status);
        }
        this.d = status;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.d = null;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.e = this.b.g().a.c((Function<? super T, ? extends R>) new $$Lambda$imr$49RZzQhOdGEzcpgjVLLQUI1nVAI<Object,Object>(this)).a(this.f).j().a((Action) new $$Lambda$imr$61sVDivIsTPkzY8Fcvc8zRFQY(this)).a((Consumer<? super T>) new $$Lambda$imr$6WGgHNbap2lkMgrlLaffjX1UU8c<Object>(this), (Consumer<? super Throwable>) $$Lambda$imr$nmPGAHaSkxqMhPeslSp6uzls5Gk.INSTANCE);
    }

    public final void a(iln iln, int i) {
        Status status = this.d;
        if (status != null) {
            a((Object) status);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Disposable disposable = this.e;
        if (disposable != null && !disposable.b()) {
            this.e.bd_();
        }
    }
}
