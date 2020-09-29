package defpackage;

import android.content.Context;
import android.os.Binder;
import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: hoc reason: default package */
public final class hoc implements hob {
    final Context a;
    final hec b;
    final hvl c;
    final jjf d;
    final tjv e;
    final igh f;
    final hni g;
    final hst h;
    final hnn i;
    final hof j;
    final hoo k;
    final htk l;
    final hok m;
    private final a n = new a();
    private wuk o = xaj.b();
    private boolean p;

    /* renamed from: hoc$a */
    public class a extends Binder implements hne {
        public a() {
        }

        public final hop a(rqi rqi) {
            hoq hoq = new hoq(hoc.this.a, hoc.this.j, rqi, hoc.this.f, new hou(hoc.this.d));
            return hoq;
        }

        public final hnf a() {
            return hoc.this.g;
        }

        public final hnl b() {
            return hoc.this.i;
        }

        public final hsr c() {
            return hoc.this.h;
        }

        public final hod d() {
            return hoc.this.j;
        }

        public final hol e() {
            return hoc.this.k;
        }

        public final htk f() {
            return hoc.this.l;
        }

        public final hvl g() {
            return hoc.this.c;
        }

        public final hoi h() {
            return hoc.this.m;
        }

        public final hec i() {
            return hoc.this.b;
        }

        public final tjv j() {
            return hoc.this.e;
        }
    }

    public hoc(Context context, hec hec, hvl hvl, jjf jjf, igh igh, hni hni, hst hst, hnn hnn, hof hof, hoo hoo, htk htk, hok hok, tjv tjv) {
        this.a = context;
        this.b = hec;
        this.c = hvl;
        this.d = jjf;
        this.f = igh;
        this.g = hni;
        this.h = hst;
        this.i = hnn;
        this.j = hof;
        this.k = hoo;
        this.l = htk;
        this.m = hok;
        this.e = tjv;
    }

    public final void a() {
        this.h.a();
        this.k.c();
        this.o = wud.a(vun.a((wrf<T>) this.b.a()).c((wut<? super T, Boolean>) $$Lambda$ePtv_adNAMcR3MMVxmbatAr9CM4.INSTANCE), vun.a((wrf<T>) this.c.a), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$qRvjiDXQliGzYoD09feC3fJ0LpE.INSTANCE).a(vun.a(((heg) ggw.a(heg.class)).c())).a((wun<? super T>) new $$Lambda$hoc$HKvwkCnz_UgYI0BE_aDo66Lp2XE<Object>(this), (wun<Throwable>) $$Lambda$hoc$OXLv_An_gfTkMCy451XRL0w12io.INSTANCE);
    }

    public final void b() {
        if (!this.p) {
            if (!this.o.isUnsubscribed()) {
                this.o.unsubscribe();
            }
            this.g.a();
            this.h.b();
            this.k.d();
            this.j.e();
            this.f.a();
            this.p = true;
        }
    }

    public final hne c() {
        return this.n;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        fpt fpt = (fpt) fay.a(hoVar.a);
        this.j.a(fpt);
        this.g.a(fpt);
        this.i.a(fpt);
        SessionState sessionState = (SessionState) hoVar.b;
        if (sessionState == null || !sessionState.loggedIn()) {
            this.g.a();
            this.j.g();
            this.h.g();
            this.m.g();
            return;
        }
        this.g.a(sessionState, this.l);
        this.j.f();
        this.h.f();
        this.m.f();
    }
}
