package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.common.collect.ImmutableMap;
import io.reactivex.Scheduler;
import java.util.concurrent.Executors;

/* renamed from: ijo reason: default package */
public final class ijo implements defpackage.hhe.a<hne>, defpackage.iih.a {
    public final String a;
    public final hnj b;
    private final a c;
    private final ijq d;
    private final ihz e;
    private final Handler f = new Handler(Looper.getMainLooper());
    private iia g;
    private final Context h;
    private final wlc<iix> i;
    private final ijf j;
    private final ueb k;
    private final Scheduler l;
    private final Scheduler m;
    private final Scheduler n;
    private final ksw o;

    /* renamed from: ijo$a */
    public interface a {
        void a(ijo ijo);

        void b(ijo ijo);
    }

    public final /* synthetic */ void a(Object obj) {
        hne hne = (hne) obj;
        ihz ihz = this.e;
        ijf ijf = this.j;
        iim iim = new iim(new ije(ijf.a), ihz, Executors.newSingleThreadExecutor(), this.m);
        iii iii = new iii(this.h, hne, iif.a(), (iix) this.i.get(), null, this.l, this.n, this.o, this.k);
        String str = "bluetooth";
        String str2 = "inter_app";
        iim iim2 = iim;
        iii iii2 = iii;
        iia iia = new iia(iim2, iii2, ImmutableMap.b("wampcra", new iio(iim)), true, str, str2, this.d);
        this.g = iia;
        iim.c = new iic(this.g);
        iim.b = new iih(this.g, iim, this.d, this);
        this.e.a();
    }

    public ijo(Context context, wlc<iix> wlc, ijf ijf, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3, ksw ksw, ijq ijq, ueb ueb, ihz ihz, String str, a aVar) {
        this.h = context;
        this.d = ijq;
        this.e = (ihz) fay.a(ihz);
        this.a = str;
        this.c = aVar;
        this.i = wlc;
        this.j = ijf;
        this.k = ueb;
        this.b = new hnj(context, getClass().getSimpleName());
        this.l = scheduler;
        this.m = scheduler2;
        this.n = scheduler3;
        this.o = ksw;
    }

    public final void a() {
        if (this.b.d()) {
            this.b.b(this);
            this.b.b();
        }
        b();
    }

    public final void e() {
        a();
        this.f.post(new $$Lambda$ijo$qvmZKbzJqjFLVTHblTsGaoPtOeM(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.c.b(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.c.a(this);
    }

    public final void a(iia iia, boolean z) {
        if (z) {
            this.f.post(new $$Lambda$ijo$geMOraEBLgCa4ZQfuGr4mVsy0c(this));
        } else {
            this.f.post(new $$Lambda$ijo$vc0wy9LvbZjPTyW5hbcoSZOtrAs(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.c.b(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.c.b(this);
    }

    public final void a(iia iia) {
        this.f.post(new $$Lambda$ijo$V9hJROM3q2R5K29MkXjA40mqjM(this));
    }

    private void b() {
        iia iia = this.g;
        if (iia != null && iia.i != 2) {
            this.g.a("wamp.error.system_shutdown");
        }
    }
}
