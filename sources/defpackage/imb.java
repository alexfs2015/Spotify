package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.common.collect.ImmutableMap;
import io.reactivex.Scheduler;
import java.util.concurrent.Executors;

/* renamed from: imb reason: default package */
public final class imb implements defpackage.hjy.a<hpt>, defpackage.iku.a {
    public final String a;
    public final hpy b;
    private final a c;
    private final imd d;
    private final ikm e;
    private final jtz f;
    private final Handler g = new Handler(Looper.getMainLooper());
    private ikn h;
    private final Context i;
    private final wzi<ilk> j;
    private final ils k;
    private final mip l;
    private final Scheduler m;
    private final Scheduler n;
    private final Scheduler o;
    private final jty p;
    private final kwf q;

    /* renamed from: imb$a */
    public interface a {
        void a(imb imb);

        void b(imb imb);
    }

    public imb(Context context, wzi<ilk> wzi, ils ils, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3, kwf kwf, imd imd, mip mip, ikm ikm, jtz jtz, String str, a aVar, hjw hjw, jty jty) {
        this.i = context;
        this.d = imd;
        this.e = (ikm) fbp.a(ikm);
        this.f = jtz;
        this.a = str;
        this.c = aVar;
        this.j = wzi;
        this.k = ils;
        this.l = mip;
        this.b = new hpy(context, getClass().getSimpleName(), hjw);
        this.m = scheduler;
        this.n = scheduler2;
        this.o = scheduler3;
        this.q = kwf;
        this.p = jty;
    }

    private void b() {
        ikn ikn = this.h;
        if (ikn != null && ikn.i != 2) {
            this.h.a("wamp.error.system_shutdown");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.c.b(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.c.b(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.c.a(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.c.b(this);
    }

    public final void a() {
        if (this.b.c()) {
            this.b.b(this);
            this.b.b();
        }
        b();
    }

    public final void a(ikn ikn) {
        this.g.post(new $$Lambda$imb$ahrkKmvXtwST7C7Evy8bcfDD9m4(this));
    }

    public final void a(ikn ikn, boolean z) {
        if (z) {
            this.g.post(new $$Lambda$imb$Kqa380i4wVh2Zn0Vc958TZowGvA(this));
        } else {
            this.g.post(new $$Lambda$imb$K8JNLHbjqm0Io10Z19iwjHdc6aY(this));
        }
    }

    public final /* synthetic */ void a(Object obj) {
        hpt hpt = (hpt) obj;
        ikm ikm = this.e;
        ils ils = this.k;
        ikz ikz = new ikz(new ilr(ils.a), ikm, Executors.newSingleThreadExecutor(), this.n);
        ikv ikv = new ikv(this.i, hpt, iks.a(), (ilk) this.j.get(), null, this.m, this.o, this.q, this.l, this.p);
        String str = "bluetooth";
        String str2 = "inter_app";
        ikz ikz2 = ikz;
        ikv ikv2 = ikv;
        ikn ikn = new ikn(ikz2, ikv2, ImmutableMap.b("wampcra", new ilb(ikz, this.f)), true, str, str2, this.d);
        this.h = ikn;
        ikz.c = new ikp(this.h);
        ikz.b = new iku(this.h, ikz, this.d, this);
        this.e.a();
    }

    public final void e() {
        a();
        this.g.post(new $$Lambda$imb$5tRzk0eopVnqhWkwZ9DzLayOx4(this));
    }
}
