package defpackage;

import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.List;
import rx.internal.subscriptions.Unsubscribed;

/* renamed from: tne reason: default package */
public final class tne extends c {
    final gtr a;
    final List<Long> b;
    final jtz c;
    public final gcj d;
    private final xii<ConnectState> e;
    private xip f = Unsubscribed.INSTANCE;
    private final Scheduler g;

    public tne(a aVar, gtr gtr, xii<ConnectState> xii, jtz jtz, Scheduler scheduler) {
        this.a = gtr;
        this.e = xii;
        this.b = new ArrayList(3);
        this.c = jtz;
        this.d = gcj.a(new $$Lambda$tne$mx45Di63l0f1M4FiyIjtvjxEmIg(this, aVar));
        this.g = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        aVar.a(this);
    }

    public final void a() {
        if (!this.f.isUnsubscribed()) {
            this.f.unsubscribe();
        }
    }

    public final void c() {
        this.f = xii.a((xio<? super T>) new xio<ConnectState>() {
            public final void onCompleted() {
            }

            public final void onError(Throwable th) {
                Assertion.b("Connect state observable failed");
            }

            public final /* synthetic */ void onNext(Object obj) {
                ConnectState connectState = (ConnectState) obj;
                tne tne = tne.this;
                int i = 0;
                while (i < tne.b.size() && tne.c.a() - ((Long) tne.b.get(i)).longValue() > 30000) {
                    tne.b.remove(i);
                    i++;
                }
                if (tne.this.b.size() < 3 && ConnectState.ACTIVE == connectState) {
                    tne.this.a.t();
                    tne.this.b.add(Long.valueOf(tne.this.c.a()));
                }
            }
        }, this.e.a(wit.a(this.g)));
    }
}
