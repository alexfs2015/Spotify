package defpackage;

import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.List;
import rx.internal.subscriptions.Unsubscribed;

/* renamed from: tcx reason: default package */
public final class tcx extends c {
    final grp a;
    final List<Long> b;
    final jrp c;
    public final gbl d;
    private final wud<ConnectState> e;
    private wuk f = Unsubscribed.INSTANCE;
    private final Scheduler g;

    public tcx(a aVar, grp grp, wud<ConnectState> wud, jrp jrp, Scheduler scheduler) {
        this.a = grp;
        this.e = wud;
        this.b = new ArrayList(3);
        this.c = jrp;
        this.d = gbl.a(new $$Lambda$tcx$yNIod6H5JYVVTeo1DHT7qwJWQyQ(this, aVar));
        this.g = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        aVar.a(this);
    }

    public final void c() {
        this.f = wud.a((wuj<? super T>) new wuj<ConnectState>() {
            public final void onCompleted() {
            }

            public final /* synthetic */ void onNext(Object obj) {
                ConnectState connectState = (ConnectState) obj;
                tcx tcx = tcx.this;
                int i = 0;
                while (i < tcx.b.size() && tcx.c.a() - ((Long) tcx.b.get(i)).longValue() > 30000) {
                    tcx.b.remove(i);
                    i++;
                }
                if (tcx.this.b.size() < 3 && ConnectState.ACTIVE == connectState) {
                    tcx.this.a.t();
                    tcx.this.b.add(Long.valueOf(tcx.this.c.a()));
                }
            }

            public final void onError(Throwable th) {
                Assertion.b("Connect state observable failed");
            }
        }, this.e.a(vun.a(this.g)));
    }

    public final void a() {
        if (!this.f.isUnsubscribed()) {
            this.f.unsubscribe();
        }
    }
}
