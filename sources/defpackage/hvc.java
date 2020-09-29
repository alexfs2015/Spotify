package defpackage;

import android.content.Context;
import android.os.Handler;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.ConnectManager.a;
import com.spotify.mobile.android.connect.ConnectManager.b;
import com.spotify.mobile.android.connect.ConnectManager.c;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposables;

/* renamed from: hvc reason: default package */
public final class hvc implements c {
    private final Context a;
    private final RxResolver b;
    private final ConnectManager c;
    private final jhz d;
    private final grx e;
    private final Handler f;
    private final wug g;
    private final rpb h;
    private final rox i;
    private final rps j;
    private wuk k = xaj.b();
    private wuk l = xaj.b();

    public final String c() {
        return "SpotifyConnect";
    }

    hvc(Context context, RxResolver rxResolver, ConnectManager connectManager, jhz jhz, grx grx, Handler handler, wug wug, rpb rpb, rox rox, rps rps) {
        this.a = context;
        this.b = rxResolver;
        this.c = connectManager;
        this.d = jhz;
        this.e = grx;
        this.f = handler;
        this.g = wug;
        this.h = rpb;
        this.i = rox;
        this.j = rps;
    }

    public final void ai_() {
        this.c.k();
        this.i.a();
        this.e.d.add(this.d.x);
        this.k = vun.a((ObservableSource<T>) this.c.g(), BackpressureStrategy.BUFFER).a(this.g).a((wue<? super T>) this.e);
        this.c.a((b) this.e);
        this.c.a((c) this.e);
        this.e.h();
        this.c.a((a) this.e);
        this.e.a();
        hfs hfs = new hfs(this.a, this.c, this.f, this.d);
        wud a2 = vun.a((ObservableSource<T>) this.b.resolve(new Request(Request.SUB, "sp://connect/v1/")), BackpressureStrategy.BUFFER);
        hfs.getClass();
        $$Lambda$iPgCfqEATWeTQBMrIam_PVWt1XY r2 = new $$Lambda$iPgCfqEATWeTQBMrIam_PVWt1XY(hfs);
        hfs.getClass();
        this.l = a2.a((wun<? super T>) r2, (wun<Throwable>) new $$Lambda$5xmSZ_zAfKtP6052OVHI2sYwg4<Throwable>(hfs));
        this.h.a();
        rps rps = this.j;
        rps.a.a(rps.b);
    }

    public final void aj_() {
        this.l.unsubscribe();
        d();
        this.c.l();
        rox rox = this.i;
        rox.e.onNext(row.a());
        rox.d.a(Disposables.a());
        rox.c.b();
        this.h.b();
        rps rps = this.j;
        rps.c.c();
        rps.a.b(rps.b);
        rps.a();
    }

    private synchronized void d() {
        this.e.d.remove(this.d.x);
        this.k.unsubscribe();
        this.c.b((b) this.e);
        this.c.a((c) null);
        this.c.a((a) null);
        grx grx = this.e;
        if (grx.m) {
            grx.m = false;
            grx.j.unsubscribe();
            grx.k.unsubscribe();
            grx.l.bf_();
            grx.j();
            grx.i.a();
            grx.h.a.c();
            fdh R_ = grx.e.iterator();
            while (R_.hasNext()) {
                ((mfh) R_.next()).e();
            }
        }
    }
}
