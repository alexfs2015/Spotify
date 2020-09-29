package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.TimeUnit;

/* renamed from: odz reason: default package */
public class odz {
    public final oeg a;
    public final ods b;
    public final txc c;
    public final odv d;
    public final hbj e;
    public final kxm f;
    public final sih g;
    public fpt h;
    /* access modifiers changed from: private */
    public final odw i;
    /* access modifiers changed from: private */
    public final oej j;
    /* access modifiers changed from: private */
    public final lkn k;
    /* access modifiers changed from: private */
    public final a l;
    private final Scheduler m;
    /* access modifiers changed from: private */
    public final CompositeDisposable n = new CompositeDisposable();
    private Disposable o = Disposables.b();
    /* access modifiers changed from: private */
    public boolean p;
    /* access modifiers changed from: private */
    public boolean q;

    /* renamed from: odz$a */
    public static class a extends rws<ody> {
        public final /* bridge */ /* synthetic */ boolean a(Object obj) {
            return true;
        }

        a(com.spotify.mobile.android.util.ui.Lifecycle.a aVar, rwr rwr, sih sih, rdh rdh) {
            super(aVar, rwr, sih, rdh);
        }
    }

    /* renamed from: odz$b */
    public static abstract class b {

        /* renamed from: odz$b$a */
        public interface a {
            a a(fpt fpt);

            a a(ody ody);

            b a();
        }

        public abstract ody a();

        public abstract fpt b();
    }

    public odz(oeg oeg, odw odw, oej oej, ods ods, Scheduler scheduler, hec hec, txc txc, odv odv, lkn lkn, kxm kxm, a aVar, oec oec, hbj hbj, sih sih, com.spotify.mobile.android.util.ui.Lifecycle.a aVar2) {
        final oeg oeg2 = oeg;
        this.a = oeg2;
        this.i = odw;
        this.j = oej;
        this.b = ods;
        final Scheduler scheduler2 = scheduler;
        this.m = scheduler2;
        this.c = txc;
        this.d = odv;
        this.k = lkn;
        this.f = kxm;
        this.e = hbj;
        this.g = sih;
        this.l = aVar;
        final oec oec2 = oec;
        final hec hec2 = hec;
        AnonymousClass1 r0 = new c() {
            public final void c() {
                odz.this.j.d(true);
                odz.this.n.a(Observable.a((ObservableSource<? extends T1>) oec2.a().a(vun.a((c<T, R>) odz.this.l, BackpressureStrategy.BUFFER)), (ObservableSource<? extends T2>) hec2.a().j(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$odz$1$LUOeh_gNYPDXSLFPNUx6eneQpHg.INSTANCE).a(scheduler2).a((Consumer<? super T>) new $$Lambda$odz$1$kLS86BFPEw3jlvOXe8UzWS4NQbs<Object>(this, oeg2), (Consumer<? super Throwable>) $$Lambda$odz$1$bzqdsqUQCsWkPy0SXqSzPC2kYI.INSTANCE));
                odz.this.n.a(vun.b(odz.this.k.a()).a(Functions.a()).a(scheduler2).a((Consumer<? super T>) new $$Lambda$odz$1$M4sIGrSYqH2oHibFkTPxt5d7mRc<Object>(this), (Consumer<? super Throwable>) $$Lambda$odz$1$Or8vEeEp_Bp5Y1WRUEhaeBLLXkw.INSTANCE));
                odz.this.n.a(oec2.b().a(scheduler2).a((Consumer<? super T>) new $$Lambda$odz$1$RTgAH_Fdw48dL1ir80AtaTi4NFw<Object>(this), (Consumer<? super Throwable>) $$Lambda$odz$1$HJ6BJVThZmRqDGi29Zeoic_W5o.INSTANCE));
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d1, code lost:
                if (defpackage.odz.g(r7.e).b.a(defpackage.odz.f(r7.e)) == false) goto L_0x00d3;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ void a(defpackage.oeg r8, defpackage.odz.b r9) {
                /*
                    r7 = this;
                    ody r0 = r9.a()
                    odz r1 = defpackage.odz.this
                    fpt r9 = r9.b()
                    r1.h = r9
                    uyz r9 = r0.a()
                    boolean r1 = r9.g()
                    r2 = 0
                    r3 = 1
                    if (r1 != 0) goto L_0x0022
                    boolean r1 = r9.k()
                    if (r1 == 0) goto L_0x0020
                    goto L_0x0022
                L_0x0020:
                    r1 = 0
                    goto L_0x0023
                L_0x0022:
                    r1 = 1
                L_0x0023:
                    java.util.List r4 = r0.b()
                    java.util.List r0 = r0.c()
                    boolean r5 = r9.k()
                    if (r5 == 0) goto L_0x004e
                    odz r5 = defpackage.odz.this
                    oej r5 = r5.j
                    boolean r6 = r4.isEmpty()
                    r6 = r6 ^ r3
                    r5.a(r6)
                    odz r5 = defpackage.odz.this
                    oej r5 = r5.j
                    boolean r6 = r0.isEmpty()
                    r6 = r6 ^ r3
                    r5.c(r6)
                    goto L_0x0067
                L_0x004e:
                    odz r5 = defpackage.odz.this
                    oej r5 = r5.j
                    boolean r6 = r4.isEmpty()
                    if (r6 == 0) goto L_0x0063
                    boolean r6 = r0.isEmpty()
                    if (r6 != 0) goto L_0x0061
                    goto L_0x0063
                L_0x0061:
                    r6 = 0
                    goto L_0x0064
                L_0x0063:
                    r6 = 1
                L_0x0064:
                    r5.b(r6)
                L_0x0067:
                    odz r5 = defpackage.odz.this
                    oej r5 = r5.j
                    r5.a(r4)
                    odz r5 = defpackage.odz.this
                    oej r5 = r5.j
                    r5.b(r0)
                    odz r5 = defpackage.odz.this
                    oej r5 = r5.j
                    r5.d(r2)
                    odz r5 = defpackage.odz.this
                    oej r5 = r5.j
                    boolean r4 = r4.isEmpty()
                    if (r4 == 0) goto L_0x0096
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L_0x0096
                    r0 = 1
                    goto L_0x0097
                L_0x0096:
                    r0 = 0
                L_0x0097:
                    r5.e(r0)
                    odz r0 = defpackage.odz.this
                    oej r0 = r0.j
                    r0.f(r1)
                    odz r0 = defpackage.odz.this
                    oej r0 = r0.j
                    r4 = r1 ^ 1
                    r0.g(r4)
                    odz r0 = defpackage.odz.this
                    oej r0 = r0.j
                    r0.j(r1)
                    odz r0 = defpackage.odz.this
                    oej r0 = r0.j
                    if (r1 == 0) goto L_0x00d3
                    odz r1 = defpackage.odz.this
                    odw r1 = r1.i
                    odz r4 = defpackage.odz.this
                    fpt r4 = r4.h
                    kxg r1 = r1.b
                    boolean r1 = r1.a(r4)
                    if (r1 != 0) goto L_0x00d4
                L_0x00d3:
                    r2 = 1
                L_0x00d4:
                    r0.k(r2)
                    odz r0 = defpackage.odz.this
                    oej r0 = r0.j
                    odz r1 = defpackage.odz.this
                    odw r1 = r1.i
                    odz r2 = defpackage.odz.this
                    fpt r2 = r2.h
                    kxg r1 = r1.b
                    boolean r1 = r1.a(r2)
                    r0.h(r1)
                    odz r0 = defpackage.odz.this
                    oej r0 = r0.j
                    boolean r1 = r9.g()
                    r0.m(r1)
                    odz r0 = defpackage.odz.this
                    oej r0 = r0.j
                    com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration r8 = r8.n()
                    boolean r8 = r8.b()
                    r0.l(r8)
                    odz r8 = defpackage.odz.this
                    oej r8 = r8.j
                    java.lang.String r0 = r9.a()
                    r8.a(r0)
                    odz r8 = defpackage.odz.this
                    oej r8 = r8.j
                    com.spotify.playlist.models.Covers$Size r0 = com.spotify.playlist.models.Covers.Size.NORMAL
                    java.lang.String r9 = r9.getImageUri(r0)
                    r8.b(r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.odz.AnonymousClass1.a(oeg, odz$b):void");
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void b(Boolean bool) {
                odz.this.j.i(bool.booleanValue());
                odz.this.p = bool.booleanValue();
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(Boolean bool) {
                odz.this.q = bool.booleanValue();
            }

            public final void a() {
                odz.this.n.c();
            }

            public final void b(Bundle bundle) {
                if (bundle != null) {
                    odz.this.q = bundle.getBoolean(odz.class.getName(), false);
                }
            }

            public final void a(Bundle bundle) {
                bundle.putBoolean(odz.class.getName(), odz.this.q);
            }
        };
        aVar2.a(r0);
    }

    public void a(uzb uzb) {
        uzc b2 = uzb.b();
        uys a2 = uzb.a();
        boolean z = (b2 != null && b2.isExplicit()) || (a2 != null && a2.i());
        if (this.p && z) {
            this.k.a(uzb.getUri(), this.a.m());
        } else if (b2 == null || !b2.isBanned()) {
            String c2 = c(uzb);
            if (!fax.a(c2)) {
                if (a2 != null) {
                    this.c.a(c2, b(uzb));
                } else {
                    this.c.b(c2, b(uzb));
                }
            }
        }
    }

    private static String c(uzb uzb) {
        uzc b2 = uzb.b();
        if (b2 != null) {
            return b2.previewId();
        }
        uys a2 = uzb.a();
        if (a2 != null) {
            return a2.g();
        }
        return null;
    }

    public static String b(uzb uzb) {
        StringBuilder sb = new StringBuilder();
        sb.append(c(uzb));
        sb.append(uzb.getUri());
        return sb.toString();
    }

    public void a() {
        if (!this.q) {
            this.j.k();
        } else if (this.o.b()) {
            this.b.d();
            this.j.l();
            Worker a2 = this.m.a();
            oej oej = this.j;
            oej.getClass();
            this.o = a2.a(new $$Lambda$0vUFPHiUjxyyfnv2EkpiI_HPxCE(oej), 1500, TimeUnit.MILLISECONDS);
        }
    }
}
