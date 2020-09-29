package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Status;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: ike reason: default package */
public final class ike extends ikf {
    private final Context c;
    private Status d;
    private Disposable e;
    private final Scheduler f;

    public ike(Context context, hne hne, a aVar, Scheduler scheduler) {
        super(hne, aVar);
        this.c = (Context) fay.a(context);
        this.f = scheduler;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.e = this.b.g().a.c((Function<? super T, ? extends R>) new $$Lambda$ike$3KhmgWOlLUFIgQjh5pJ2sCZfs4<Object,Object>(this)).a(this.f).j().a((Action) new $$Lambda$ike$ZWmG7KgwJa3tJPllBhH5aZFJy6A(this)).a((Consumer<? super T>) new $$Lambda$ike$ukuKuXxcdSd9F0535q_MBwEjV6Q<Object>(this), (Consumer<? super Throwable>) $$Lambda$ike$Kd9h7MAvVasXvq7B83H4OeLOYoY.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Status a(SessionState sessionState) {
        Context context = this.c;
        if (sessionState.loggedIn()) {
            return Status.OK;
        }
        return Status.createNotLoggedIn(context);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.d = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Status status) {
        Status status2 = this.d;
        if (status2 == null || !status2.equals(status)) {
            a((Object) status);
        }
        this.d = status;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Disposable disposable = this.e;
        if (disposable != null && !disposable.b()) {
            this.e.bf_();
        }
    }

    public final void a(ija ija, int i) {
        Status status = this.d;
        if (status != null) {
            a((Object) status);
        }
    }
}
