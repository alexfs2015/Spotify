package defpackage;

import android.content.Context;
import android.os.Binder;
import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: hqe reason: default package */
public final class hqe implements hqd {
    final Context a;
    final hgy b;
    final hxx c;
    final jlr d;
    final hqu e;
    final tvn f;
    final iiu g;
    final hpx h;
    final hvh i;
    final hqc j;
    final hqh k;
    final hqq l;
    final hvw m;
    final hqm n;
    private final a o = new a();
    private xip p = xon.b();
    private boolean q;

    /* renamed from: hqe$a */
    public class a extends Binder implements hpt {
        public a() {
        }

        public final hpu a() {
            return hqe.this.h;
        }

        public final hqr a(rzt rzt) {
            hqs hqs = new hqs(hqe.this.a, hqe.this.k, rzt, hqe.this.g, hqe.this.e, new hqy(hqe.this.d));
            return hqs;
        }

        public final hqa b() {
            return hqe.this.j;
        }

        public final hvf c() {
            return hqe.this.i;
        }

        public final hqf d() {
            return hqe.this.k;
        }

        public final hqn e() {
            return hqe.this.l;
        }

        public final hvw f() {
            return hqe.this.m;
        }

        public final hxx g() {
            return hqe.this.c;
        }

        public final hqk h() {
            return hqe.this.n;
        }

        public final hgy i() {
            return hqe.this.b;
        }

        public final tvn j() {
            return hqe.this.f;
        }
    }

    public hqe(Context context, hgy hgy, hxx hxx, jlr jlr, iiu iiu, hpx hpx, hvh hvh, hqc hqc, hqh hqh, hqq hqq, hvw hvw, hqm hqm, hqu hqu, tvn tvn) {
        this.a = context;
        this.b = hgy;
        this.c = hxx;
        this.d = jlr;
        this.g = iiu;
        this.h = hpx;
        this.i = hvh;
        this.j = hqc;
        this.k = hqh;
        this.l = hqq;
        this.m = hvw;
        this.n = hqm;
        this.e = hqu;
        this.f = tvn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        fqn fqn = (fqn) fbp.a(hoVar.a);
        this.k.a(fqn);
        this.j.a(fqn);
        SessionState sessionState = (SessionState) hoVar.b;
        if (sessionState == null || !sessionState.loggedIn()) {
            this.h.b();
            this.k.g();
            this.i.g();
            this.n.g();
            return;
        }
        this.h.a();
        this.k.f();
        this.i.f();
        this.n.f();
    }

    public final void a() {
        this.i.a();
        this.l.c();
        this.p = xii.a(wit.a((xfk<T>) this.b.a()).c((xiy<? super T, Boolean>) $$Lambda$94wd4FkYC1H9eM36vjo8Ri6PAiE.INSTANCE), wit.a((xfk<T>) this.c.a), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$H83EcBbT1O2fhBzQegxm3w9J62g.INSTANCE).a(wit.a(((hhc) gih.a(hhc.class)).c())).a((xis<? super T>) new $$Lambda$hqe$WptuFHjGThiF5SAoqt7IfjfYs<Object>(this), (xis<Throwable>) $$Lambda$hqe$sS8Bkev4xYJn98Kb86TEBXWRg.INSTANCE);
    }

    public final void b() {
        if (!this.q) {
            if (!this.p.isUnsubscribed()) {
                this.p.unsubscribe();
            }
            this.h.b();
            this.i.b();
            this.l.d();
            this.k.e();
            this.g.a();
            this.q = true;
        }
    }

    public final hpt c() {
        return this.o;
    }
}
