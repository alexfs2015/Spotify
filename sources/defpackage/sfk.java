package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: sfk reason: default package */
public final class sfk implements gnc {
    final gnb a;
    final xom b = new xom();
    private final RxResolver c;

    public sfk(gnb gnb, RxResolver rxResolver) {
        this.a = gnb;
        this.c = rxResolver;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Response response) {
    }

    private void b(String str) {
        this.b.a(wit.a((ObservableSource<T>) this.c.resolve(new Request(Request.POST, String.format("sp://perf-metrics/v1/startup/reached-terminal-state/%s", new Object[]{str}))), BackpressureStrategy.BUFFER).a((xis<? super T>) $$Lambda$sfk$8UVJx3A1KMSakBQO15VjNyJSMTU.INSTANCE, (xis<Throwable>) $$Lambda$sfk$NKw5fL8PEsJnn2xM0GovDPkkhI.INSTANCE));
    }

    public final void a() {
        if (!this.a.a || !this.a.b.b()) {
            this.a.a((gnc) this);
        } else {
            b((String) this.a.b.c());
        }
    }

    public final void a(String str) {
        b(str);
    }
}
