package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: rwa reason: default package */
public final class rwa implements gln {
    final glm a;
    final xai b = new xai();
    private final RxResolver c;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Response response) {
    }

    public rwa(glm glm, RxResolver rxResolver) {
        this.a = glm;
        this.c = rxResolver;
    }

    public final void a(String str) {
        b(str);
    }

    public final void a() {
        if (!this.a.a || !this.a.b.b()) {
            this.a.a((gln) this);
        } else {
            b((String) this.a.b.c());
        }
    }

    private void b(String str) {
        this.b.a(vun.a((ObservableSource<T>) this.c.resolve(new Request(Request.POST, String.format("sp://perf-metrics/v1/startup/reached-terminal-state/%s", new Object[]{str}))), BackpressureStrategy.BUFFER).a((wun<? super T>) $$Lambda$rwa$lG82Rd_vbe4HtzX6E7NVvzskaWk.INSTANCE, (wun<Throwable>) $$Lambda$rwa$hJT75695XiaiLYsIVCdlh6QTIM.INSTANCE));
    }
}
