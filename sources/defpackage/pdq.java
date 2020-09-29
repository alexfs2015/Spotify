package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.List;

/* renamed from: pdq reason: default package */
public final class pdq {
    public final pdo a;
    final ozl b;
    public final pds c;
    final oma d;
    final SerialDisposable e = new SerialDisposable();
    public Context f;
    public ViewGroup g;
    public boolean h;

    public pdq(final ozt ozt, pdo pdo, pds pds, ozl ozl, oma oma, final a aVar, final ozr ozr) {
        this.a = pdo;
        this.b = ozl;
        this.c = pds;
        this.d = oma;
        aVar.a(new c() {
            /* access modifiers changed from: private */
            public /* synthetic */ void d() {
                pds pds = pdq.this.c;
                LayoutInflater from = LayoutInflater.from(pdq.this.f);
                ViewGroup viewGroup = pdq.this.g;
                fqn flags = pdq.this.b.getFlags();
                pds.m.a(pds.k.b());
                List a2 = pds.t.a(from, viewGroup, pds.m);
                pds.n = pds.t.i();
                pds.k.a(pds.n);
                pds.k.a((ozo) pds.t, a2);
                vhx a3 = pds.k.a();
                if (pds.v != null) {
                    pds.v.a(a3);
                }
                if (pds.y != null) {
                    pds.y.a(a3);
                    pds.y.a(true);
                }
                if (pds.u != null) {
                    pds.u.a(a3);
                }
                if (pds.s != null) {
                    pds.d.a(pds.s.e());
                    pds.k.a(pds.s.a(from, viewGroup));
                }
                if (pds.w != null) {
                    pds.w.a(a3, flags);
                }
                if (pds.x != null) {
                    pds.x.a(a3);
                }
                if (pds.l != null) {
                    pds.k.a(pds.l.a(viewGroup, a3));
                }
                if (pds.o != null) {
                    pds.o.a(from, viewGroup, a3);
                }
                if (pds.p != null) {
                    pds.p.a(pds.t.i(), a3);
                }
                if (pds.q != null) {
                    pds.q.a(from, viewGroup, a3);
                }
                if (pds.r != null) {
                    pds.r.a(pds.t.i(), a3);
                }
                pdq.this.c.b();
                pdq.this.d.b.onComplete();
            }

            public final void a() {
                pdo pdo = pdq.this.a;
                List<omg> list = pdq.this.c.e;
                pdo.b = false;
                for (omg d2 : list) {
                    d2.d();
                }
                ozr.b.a(Disposables.a());
                pdq.this.e.a(Disposables.a());
                ozt.a.a(Disposables.a());
            }

            public final void a(Bundle bundle) {
                pdo pdo = pdq.this.a;
                List<omg> list = pdq.this.c.e;
                pdo.c = false;
                for (omg b2 : list) {
                    b2.b(bundle);
                }
                ozr ozr = ozr;
                if (ozr.c.b()) {
                    bundle.putSerializable(ozr.a, (Serializable) ozr.c.c());
                }
                bundle.putBoolean(ozt.class.getName(), ozt.b);
            }

            public final void aN_() {
                pdo pdo = pdq.this.a;
                pdo.a = false;
                pdo.b = false;
                pdo.c = false;
                aVar.b(this);
            }

            public final void b(Bundle bundle) {
                pdq.this.a.a(pdq.this.c.e, bundle);
                ozr ozr = ozr;
                if (bundle != null) {
                    ozr.c = Optional.c((LicenseLayout) bundle.getSerializable(ozr.a));
                }
                ozt ozt = ozt;
                if (bundle != null) {
                    ozt.b = bundle.getBoolean(ozt.class.getName(), false);
                }
            }

            public final void c() {
                pdq.this.a.a(pdq.this.c.e, pdq.this.c.A);
                ozr.a();
                SerialDisposable serialDisposable = pdq.this.e;
                Completable a2 = pdq.this.c.a();
                $$Lambda$pdq$1$u83mbaYBTN2DGX00Z5mjnb6KOAQ r2 = new $$Lambda$pdq$1$u83mbaYBTN2DGX00Z5mjnb6KOAQ(this);
                oma oma = pdq.this.d;
                oma.getClass();
                serialDisposable.a(a2.a((Action) r2, (Consumer<? super Throwable>) new $$Lambda$NCFWeymoei7ymm4tg90Ko9Ne6K8<Object>(oma)));
            }

            public final void e() {
                if (pdq.this.h) {
                    pdq.this.c.b();
                    pdq.this.h = false;
                }
            }

            public final void f() {
                pds pds = pdq.this.c;
                boolean z = false;
                if (pds.z) {
                    for (omg c2 : pds.e) {
                        c2.c();
                    }
                    pds.z = false;
                    z = true;
                }
                if (z) {
                    pdq.this.h = true;
                }
            }
        });
    }
}
