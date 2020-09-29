package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: owf reason: default package */
public final class owf {
    public oft A;
    public ovn B;
    public oql C;
    public onq<?> D;
    public opm E;
    a F;
    public final List<ofc> G = Lists.a();
    public final owd H;
    public Context I;
    public ViewGroup J;
    public boolean K;
    public boolean L;
    orm M = orm.a;
    private final a N;
    private final a O;
    private final a P;
    private final a Q;
    private final a R;
    private final a S;
    private final a T;
    private final a U;
    private final a V;
    private final a W;
    private final String X;
    private final c Y;
    private final Scheduler Z;
    final SerialDisposable a = new SerialDisposable();
    private okw aa;
    private RecyclerView ab;
    private a ac = $$Lambda$owf$Se2NBiO5Sy8o7DloHJbC5GLjxhY.INSTANCE;
    public final SerialDisposable b = new SerialDisposable();
    public final a c;
    final osf d;
    final ofd e;
    final b f;
    final e g;
    final a h;
    final d i;
    final oeu j;
    public final kyi k;
    final a l;
    final a m;
    public oru n;
    public osa o;
    public orw p;
    public orr q;
    public orq r;
    public ova s;
    public olm<?> t;
    public osu u;
    public oko v;
    public otd w;
    public ojy x;
    public okc y;
    public olh z;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(String str) {
    }

    public owf(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, a aVar11, osn osn, osl osl, a aVar12, a aVar13, Scheduler scheduler, String str, osf osf, ofd ofd, owd owd, oeu oeu, b bVar, e eVar, c cVar, a aVar14, d dVar, a aVar15, kyi kyi) {
        this.c = aVar;
        this.N = aVar2;
        this.O = aVar3;
        this.P = aVar4;
        this.Q = aVar5;
        this.R = aVar6;
        this.S = aVar7;
        this.T = aVar8;
        this.U = aVar9;
        this.V = aVar10;
        this.W = aVar11;
        this.X = str;
        this.d = osf;
        this.e = ofd;
        this.j = oeu;
        this.H = owd;
        this.f = bVar;
        this.g = eVar;
        this.Y = cVar;
        this.h = aVar14;
        this.i = dVar;
        this.k = kyi;
        this.l = aVar12;
        this.m = aVar13;
        this.Z = scheduler;
        final osn osn2 = osn;
        final osl osl2 = osl;
        final Scheduler scheduler2 = scheduler;
        final a aVar16 = aVar15;
        AnonymousClass1 r4 = new c() {
            public final void c() {
                owf.this.H.a(owf.this.G, owf.this.F);
                osn2.a();
                osl2.a();
                SerialDisposable serialDisposable = owf.this.a;
                Completable a2 = osn2.b.a((CompletableSource) Completable.a((Callable<? extends CompletableSource>) new $$Lambda$owf$1$EiajlB02CTKI1ENYI0S2qXzmSl8<Object>(this))).a(scheduler2);
                $$Lambda$owf$1$BHhIzpL47Pr9UpVT8u3BD2PIYNs r2 = new $$Lambda$owf$1$BHhIzpL47Pr9UpVT8u3BD2PIYNs(this);
                oeu oeu = owf.this.j;
                oeu.getClass();
                serialDisposable.a(a2.a((Action) r2, (Consumer<? super Throwable>) new $$Lambda$kOaJFhaz0NJWXTCkHX1OBPRkiG0<Object>(oeu)));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ CompletableSource g() {
                if (!owf.this.G.isEmpty()) {
                    return Completable.b();
                }
                return Completable.a();
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void d() {
                owf owf = owf.this;
                LicenseLayout a2 = owf.e.a();
                FormatListType b2 = owf.e.b();
                fpt flags = owf.d.getFlags();
                owf.q = owf.h.a(owf.e.b(), flags, a2);
                owf.n = owf.f.a(b2, flags, a2);
                owf.o = owf.g.a(b2, flags, a2);
                owf.r = owf.i.a(b2, flags, a2);
                owf owf2 = owf.this;
                LicenseLayout a3 = owf2.e.a();
                owf2.d.getFlags();
                owf2.M = owf2.q.a(a3);
                oeu oeu = owf2.j;
                gjf i = owf2.M.i();
                oeu.c = i;
                oeu.a.onNext(rde.a(i.a(), oeu.ae_().toString()));
                owf owf3 = owf.this;
                oiw a4 = owf3.l.a(owf3.M.f());
                org a5 = owf3.m.a(a4, owf3.M.c());
                owf3.F = new a(a5, a4) {
                    private /* synthetic */ org a;
                    private /* synthetic */ oiw b;

                    {
                        this.a = r2;
                        this.b = r3;
                    }

                    public final orf a() {
                        return this.a;
                    }

                    public final oix b() {
                        return this.b;
                    }
                };
                owf3.G.add(new ofc(a5, a4) {
                    private /* synthetic */ org a;
                    private /* synthetic */ oiw b;

                    public final void az_() {
                    }

                    public final void c() {
                    }

                    {
                        this.a = r2;
                        this.b = r3;
                    }

                    public final Completable a() {
                        return this.a.e();
                    }

                    public final void a(Bundle bundle) {
                        this.b.a(bundle);
                    }

                    public final void a(a aVar) {
                        this.a.a(this.b);
                        this.b.a();
                    }

                    public final void d() {
                        this.a.f();
                    }

                    public final void b(Bundle bundle) {
                        this.b.b(bundle);
                    }
                });
                owf.a(owf.this);
                owf.this.a();
            }

            public final void e() {
                if (owf.this.L) {
                    for (ofc az_ : owf.this.G) {
                        az_.az_();
                    }
                    owf owf = owf.this;
                    owf.K = true;
                    owf.L = false;
                }
            }

            public final void f() {
                if (owf.this.K) {
                    for (ofc c2 : owf.this.G) {
                        c2.c();
                    }
                    owf owf = owf.this;
                    owf.K = false;
                    owf.L = true;
                }
            }

            public final void a() {
                owd owd = owf.this.H;
                List<ofc> list = owf.this.G;
                owd.b = false;
                for (ofc d2 : list) {
                    d2.d();
                }
                osn2.a.a(Disposables.a());
                osl2.b.a(Disposables.a());
                owf.this.a.a(Disposables.a());
            }

            public final void b(Bundle bundle) {
                owf.this.H.a(owf.this.G, bundle);
                osl osl = osl2;
                if (bundle != null) {
                    osl.c = Optional.c((LicenseLayout) bundle.getSerializable(osl.a));
                }
            }

            public final void a(Bundle bundle) {
                owd owd = owf.this.H;
                List<ofc> list = owf.this.G;
                owd.c = false;
                for (ofc b2 : list) {
                    b2.b(bundle);
                }
                osl osl = osl2;
                if (osl.c.b()) {
                    bundle.putSerializable(osl.a, (Serializable) osl.c.c());
                }
            }

            public final void aP_() {
                owd owd = owf.this.H;
                owd.a = false;
                owd.b = false;
                owd.c = false;
                aVar16.b(this);
            }
        };
        aVar15.a(r4);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(LayoutInflater layoutInflater, fpt fpt) {
        ViewGroup viewGroup = this.J;
        this.s.a(this.u.b());
        List a2 = this.t.a(layoutInflater, viewGroup, this.s);
        this.ab = this.t.i();
        this.u.a(this.ab);
        this.u.a((osi) this.t, a2);
        this.s.a((osi) this.t);
        uwh a3 = this.u.a();
        oft oft = this.A;
        if (oft != null) {
            oft.a(a3);
        }
        ojy ojy = this.x;
        if (ojy != null) {
            ojy.a(a3);
            this.x.a(true);
        }
        okc okc = this.y;
        if (okc != null) {
            okc.a(a3);
        }
        olh olh = this.z;
        if (olh != null) {
            this.k.a(olh.e());
            this.u.a(this.z.a(layoutInflater, viewGroup));
        }
        otd otd = this.w;
        if (otd != null) {
            otd.a(a3, fpt);
        }
        oql oql = this.C;
        if (oql != null) {
            oql.a(a3);
        }
        oko oko = this.v;
        if (oko != null) {
            this.u.a(oko.a(viewGroup, a3));
        }
        onq<?> onq = this.D;
        if (onq != null) {
            onq.a(layoutInflater, viewGroup, a3);
        }
        ovn ovn = this.B;
        if (ovn != null) {
            ovn.a(this.t.i(), a3);
        }
        okw okw = this.aa;
        if (okw != null) {
            okw.a(layoutInflater, viewGroup, a3);
        }
        opm opm = this.E;
        if (opm != null) {
            opm.a(this.t.i(), a3);
        }
        for (ofc az_ : this.G) {
            az_.az_();
        }
        this.K = true;
        this.j.b.onComplete();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        StringBuilder sb = new StringBuilder(170);
        sb.append("\n-- Active plugins --\n");
        sb.append("Configurations: ");
        sb.append(this.q.b());
        sb.append(10);
        sb.append("Toolbar: ");
        sb.append(this.o.b());
        sb.append(10);
        sb.append("Header: ");
        sb.append(this.n.b());
        sb.append(10);
        sb.append("Playlist component: ");
        sb.append(this.r.b());
        sb.append(10);
        sb.append("Item list: ");
        orw orw = this.p;
        sb.append(orw != null ? orw.b() : "<none>");
        sb.append(10);
        sb.append(10);
        sb.append("License layout: ");
        sb.append(this.e.a());
        sb.append(10);
        sb.append("Raw Format list type: ");
        sb.append(this.e.c());
        sb.append(10);
        sb.append("Derived Format list type: ");
        sb.append(this.e.b());
        sb.append(10);
        this.ac.setText(sb.toString());
    }

    static /* synthetic */ void a(owf owf) {
        Completable completable;
        LayoutInflater from = LayoutInflater.from(owf.I);
        fpt flags = owf.d.getFlags();
        owf.t = owf.n.a(flags);
        owf.G.add(owf.t);
        LicenseLayout a2 = owf.e.a();
        if (owf.s == null) {
            owf.s = owf.o.a_(flags);
            owf.G.add(owf.s);
        }
        owf.s.a((osi) owf.t);
        ogz b2 = owf.M.b();
        if (b2.b() && owf.A == null) {
            owf.A = owf.O.a();
            owf.G.add(owf.A);
        }
        if (b2.c() && owf.x == null) {
            owf.x = owf.W.a();
            owf.G.add(owf.x);
        }
        if (b2.d() && owf.y == null) {
            owf.y = owf.T.a();
            owf.G.add(owf.y);
        }
        if (b2.e() && owf.z == null) {
            owf.z = owf.U.a(owf.M.g());
            owf.G.add(owf.z);
        }
        if (owf.w == null) {
            owf.w = owf.R.a();
            owf.G.add(owf.w);
        }
        if (b2.a() && owf.C == null) {
            owf.C = owf.P.a(owf.M.e());
            owf.G.add(owf.C);
        }
        if (owf.v == null) {
            owf.v = owf.N.a(owf.M.a());
            owf.G.add(owf.v);
        }
        if (b2.g() && owf.D == null) {
            owf.p = owf.Y.a(owf.e.b(), flags, a2);
            owf.D = owf.p.b(flags);
            owf.G.add(owf.D);
        }
        if (b2.f() && owf.B == null) {
            owf.B = owf.S.a(owf.M.d());
            owf.G.add(owf.B);
        }
        if (b2.h() && owf.aa == null) {
            owf.aa = owf.V.a(owf.j.c);
            owf.G.add(owf.aa);
        }
        if (b2.i() && owf.E == null) {
            owf.E = owf.Q.a();
            owf.G.add(owf.E);
        }
        owf.G.add(owf.r.c());
        owf.a();
        a aVar = owf.F;
        if (aVar != null) {
            owd owd = owf.H;
            List<ofc> list = owf.G;
            if (!owd.a) {
                owd.a = true;
                if (owd.c) {
                    owd.a(list, owd.d);
                }
                if (owd.b) {
                    owd.a(list, aVar);
                }
            }
        }
        SerialDisposable serialDisposable = owf.b;
        if (owf.G.isEmpty()) {
            completable = Completable.b();
        } else {
            ArrayList a3 = Lists.a();
            for (ofc a4 : owf.G) {
                a3.add(a4.a());
            }
            completable = Completable.b((Iterable<? extends CompletableSource>) a3);
        }
        Completable a5 = completable.a(owf.Z);
        $$Lambda$owf$ER0D4hNgdmrG3lHl0Y8u5qauAU r4 = new $$Lambda$owf$ER0D4hNgdmrG3lHl0Y8u5qauAU(owf, from, flags);
        oeu oeu = owf.j;
        oeu.getClass();
        serialDisposable.a(a5.a((Action) r4, (Consumer<? super Throwable>) new $$Lambda$kOaJFhaz0NJWXTCkHX1OBPRkiG0<Object>(oeu)));
    }
}
