package defpackage;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.Lists;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: pds reason: default package */
public final class pds {
    a A;
    private final pdo B;
    private final String C;
    private final ozu D;
    private final ozl E;
    private final Scheduler F;
    private final a G;
    private final a H;
    private final a I;
    private final a J;
    private final a K;
    private final a L;
    private final a M;
    private final a N;
    private final a O;
    private final a P;
    private final omh Q;
    private final b R;
    private final e S;
    private final a T;
    private final c U;
    private final a V;
    private final d W;
    private final a X;
    private oys Y = oys.a;
    private a Z = $$Lambda$pds$XhHW8yc6KSAmXYvgFJ64UBnN5Ls.INSTANCE;
    final ozt a;
    public final a b;
    final oma c;
    public final lbr d;
    public final List<omg> e = Lists.a();
    public oza f;
    public ozg g;
    public ozc h;
    public oyw i;
    public oyx j;
    public pab k;
    public ors l;
    public pcl m;
    RecyclerView n;
    public ouw<?> o;
    public pcy p;
    osa q;
    public ows r;
    public osl s;
    public osq<?> t;
    public org u;
    public omx v;
    public pak w;
    public oxr x;
    public orc y;
    boolean z;

    public pds(pdo pdo, ozt ozt, ozl ozl, ozu ozu, String str, a aVar, a aVar2, oma oma, a aVar3, a aVar4, a aVar5, lbr lbr, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, omh omh, a aVar11, Scheduler scheduler, b bVar, e eVar, a aVar12, c cVar, a aVar13, d dVar, a aVar14) {
        this.B = pdo;
        this.a = ozt;
        this.D = ozu;
        this.C = str;
        this.E = ozl;
        this.b = aVar;
        this.G = aVar2;
        this.F = scheduler;
        this.c = oma;
        this.H = aVar3;
        this.N = aVar9;
        this.Q = omh;
        this.I = aVar4;
        this.J = aVar5;
        this.d = lbr;
        this.K = aVar6;
        this.L = aVar8;
        this.M = aVar7;
        this.V = aVar13;
        this.O = aVar10;
        this.P = aVar11;
        this.R = bVar;
        this.S = eVar;
        this.T = aVar12;
        this.U = cVar;
        this.W = dVar;
        this.X = aVar14;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(String str) {
    }

    private void c() {
        StringBuilder sb = new StringBuilder("\n-- Active plugins --\nConfigurations: ");
        sb.append(this.j.b());
        sb.append(10);
        sb.append("Toolbar: ");
        sb.append(this.g.b());
        sb.append(10);
        sb.append("Header: ");
        sb.append(this.f.b());
        sb.append(10);
        sb.append("Playlist component: ");
        sb.append(this.i.b());
        sb.append(10);
        sb.append("Item list: ");
        ozc ozc = this.h;
        sb.append(ozc != null ? ozc.b() : "<none>");
        sb.append(10);
        sb.append(10);
        sb.append("License layout: ");
        sb.append(this.Q.a());
        sb.append(10);
        sb.append("Raw Format list type: ");
        sb.append(this.Q.c());
        sb.append(10);
        sb.append("Derived Format list type: ");
        sb.append(this.Q.b());
        sb.append(10);
        this.Z.setText(sb.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource d() {
        return !this.e.isEmpty() ? Completable.b() : Completable.a((Callable<? extends CompletableSource>) new $$Lambda$pds$p9j_Bei4l0ahBMfY6dJhWQdF8<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource e() {
        LicenseLayout a2 = this.Q.a();
        FormatListType b2 = this.Q.b();
        fqn flags = this.E.getFlags();
        this.j = this.X.a(this.Q.b(), flags, a2);
        this.f = this.R.a(b2, flags, a2);
        this.g = this.S.a(b2, flags, a2);
        this.i = this.W.a(b2, flags, a2);
        LicenseLayout a3 = this.Q.a();
        this.E.getFlags();
        this.Y = this.j.a(a3);
        oma oma = this.c;
        gkq i2 = this.Y.i();
        oma.c = i2;
        oma.a.onNext(rmc.a(i2.a(), oma.ae_().toString()));
        final oqa a4 = this.V.a(this.Y.f());
        final oym a5 = this.N.a(a4, this.Y.c());
        this.A = new a() {
            public final oyl a() {
                return a5;
            }

            public final oqb b() {
                return a4;
            }
        };
        this.e.add(new omg() {
            public final Completable a() {
                return a5.e();
            }

            public final void a(Bundle bundle) {
                a4.a(bundle);
            }

            public final void a(a aVar) {
                a5.a(a4);
                a4.a();
            }

            public final void ay_() {
                pds.this.a.a();
            }

            public final void b(Bundle bundle) {
                a4.b(bundle);
            }

            public final void c() {
            }

            public final void d() {
                a5.f();
            }
        });
        fqn flags2 = this.E.getFlags();
        this.t = this.f.a(flags2);
        this.e.add(this.t);
        LicenseLayout a6 = this.Q.a();
        if (this.m == null) {
            this.m = this.g.a_(flags2);
            this.e.add(this.m);
        }
        this.m.a((ozo) this.t);
        ood b3 = this.Y.b();
        if (b3.b() && this.v == null) {
            this.v = this.L.a();
            this.e.add(this.v);
        }
        if (b3.c() && this.y == null) {
            this.y = this.T.a();
            this.e.add(this.y);
        }
        if (b3.d() && this.u == null) {
            this.u = this.M.a();
            this.e.add(this.u);
        }
        if (b3.e() && this.s == null) {
            this.s = this.K.a(this.Y.g());
            this.e.add(this.s);
        }
        if (this.w == null) {
            this.w = this.O.a();
            this.e.add(this.w);
        }
        if (b3.a() && this.x == null) {
            this.x = this.P.a(this.Y.e());
            this.e.add(this.x);
        }
        if (this.l == null) {
            this.l = this.G.a(this.Y.a());
            this.e.add(this.l);
        }
        if (b3.g() && this.o == null) {
            this.h = this.U.a(this.Q.b(), flags2, a6);
            this.o = this.h.b(flags2);
            this.e.add(this.o);
        }
        if (b3.f() && this.p == null) {
            this.p = this.I.a(this.Y.d());
            this.e.add(this.p);
        }
        if (b3.h() && this.q == null) {
            this.q = this.H.a(this.c.c);
            this.e.add(this.q);
        }
        if (b3.i() && this.r == null) {
            this.r = this.J.a();
            this.e.add(this.r);
        }
        this.e.add(this.i.c());
        c();
        a aVar = this.A;
        if (aVar != null) {
            pdo pdo = this.B;
            List<omg> list = this.e;
            if (!pdo.a) {
                pdo.a = true;
                if (pdo.c) {
                    pdo.a(list, pdo.d);
                }
                if (pdo.b) {
                    pdo.a(list, aVar);
                }
            }
        }
        c();
        if (this.e.isEmpty()) {
            return Completable.b();
        }
        ArrayList a7 = Lists.a();
        for (omg a8 : this.e) {
            a7.add(a8.a());
        }
        return Completable.b((Iterable<? extends CompletableSource>) a7);
    }

    public final Completable a() {
        return this.D.a().a(this.F).a((CompletableSource) Completable.a((Callable<? extends CompletableSource>) new $$Lambda$pds$lHw2NtlTXBXmHjaAJtE_7gRVAuo<Object>(this)));
    }

    public final void b() {
        if (!this.z) {
            for (omg ay_ : this.e) {
                ay_.ay_();
            }
        }
        this.z = true;
    }
}
