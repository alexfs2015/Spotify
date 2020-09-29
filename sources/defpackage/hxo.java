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

/* renamed from: hxo reason: default package */
public final class hxo implements c {
    private final Context a;
    private final RxResolver b;
    private final ConnectManager c;
    private final jkp d;
    private final mkk e;
    private final Handler f;
    private final xil g;
    private final ryh h;
    private final ryd i;
    private final rzb j;
    private xip k = xon.b();
    private xip l = xon.b();

    hxo(Context context, RxResolver rxResolver, ConnectManager connectManager, jkp jkp, mkk mkk, Handler handler, xil xil, ryh ryh, ryd ryd, rzb rzb) {
        this.a = context;
        this.b = rxResolver;
        this.c = connectManager;
        this.d = jkp;
        this.e = mkk;
        this.f = handler;
        this.g = xil;
        this.h = ryh;
        this.i = ryd;
        this.j = rzb;
    }

    private synchronized void d() {
        this.e.d.remove(this.d.x);
        this.k.unsubscribe();
        this.c.b((b) this.e);
        this.c.a((c) null);
        this.c.a((a) null);
        mkk mkk = this.e;
        if (mkk.m) {
            mkk.m = false;
            mkk.j.unsubscribe();
            mkk.k.unsubscribe();
            mkk.l.bd_();
            mkk.j();
            mkk.i.a();
            mkk.h.a.c();
            fdz R_ = mkk.e.iterator();
            while (R_.hasNext()) {
                ((mjt) R_.next()).e();
            }
        }
    }

    public final void ai_() {
        this.c.k();
        this.i.a();
        this.e.d.add(this.d.x);
        this.k = wit.a((ObservableSource<T>) this.c.g(), BackpressureStrategy.BUFFER).a(this.g).a((xij<? super T>) this.e);
        this.c.a((b) this.e);
        this.c.a((c) this.e);
        this.e.h();
        this.c.a((a) this.e);
        this.e.a();
        hio hio = new hio(this.a, this.c, this.f, this.d);
        xii a2 = wit.a((ObservableSource<T>) this.b.resolve(new Request(Request.SUB, "sp://connect/v1/")), BackpressureStrategy.BUFFER);
        hio.getClass();
        $$Lambda$7Twshdp5iwAqzIfBhtYvEek8ya4 r2 = new $$Lambda$7Twshdp5iwAqzIfBhtYvEek8ya4(hio);
        hio.getClass();
        this.l = a2.a((xis<? super T>) r2, (xis<Throwable>) new $$Lambda$jyhbtmQSyScYHdhmRCdqvDOkkAU<Throwable>(hio));
        this.h.a();
        rzb rzb = this.j;
        rzb.a.a(rzb.c);
    }

    public final void aj_() {
        this.l.unsubscribe();
        d();
        this.c.l();
        ryd ryd = this.i;
        ryd.e.onNext(ryc.a());
        ryd.d.a(Disposables.a());
        ryd.c.b();
        this.h.b();
        rzb rzb = this.j;
        rzb.b.c();
        rzb.a.b(rzb.c);
    }

    public final String c() {
        return "SpotifyConnect";
    }
}
