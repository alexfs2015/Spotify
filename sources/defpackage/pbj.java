package defpackage;

import com.jakewharton.rxrelay2.PublishRelay;
import com.spotify.base.java.logging.Logger;
import com.spotify.stories.v1.header.proto.GetStoryHeaderResponse;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: pbj reason: default package */
class pbj {
    final CompositeDisposable a = new CompositeDisposable();
    final CompletableSubject b = CompletableSubject.f();
    final fou<Boolean> c = PublishRelay.a();
    final int d;
    pbn e;
    Boolean f;
    private Disposable g = Disposables.b();
    private final sbq h;
    private oyl i;
    private final pbe j;
    private final vjv k;
    private final pbc l;
    private final pbh m;
    private final String n;
    private final opw o;
    private final oml p;
    private final Scheduler q;
    private final Scheduler r;
    private final pbd s;
    private final pav t;
    private final BehaviorSubject<oqg> u = BehaviorSubject.a();
    private final CompositeDisposable v = new CompositeDisposable();
    private final fqn w;
    private final a x = new a() {
        public final void a(String str, boolean z) {
        }

        public final void a(boolean z) {
            pbj.a(pbj.this, z);
        }
    };
    private oqg y;

    public pbj(sbq sbq, opw opw, pbe pbe, vjv vjv, pbh pbh, oml oml, String str, Scheduler scheduler, Scheduler scheduler2, pbd pbd, pav pav, int i2, pbc pbc, fqn fqn) {
        this.h = (sbq) fbp.a(sbq);
        this.j = pbe;
        this.k = vjv;
        this.l = pbc;
        this.m = pbh;
        this.n = str;
        this.o = opw;
        this.p = oml;
        this.s = pbd;
        this.q = scheduler;
        this.r = scheduler2;
        this.w = (fqn) fbp.a(fqn);
        this.t = pav;
        this.d = i2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Long l2) {
        return this.c.a(Functions.a()).e(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str, Observable observable, Observable observable2, Boolean bool) {
        this.e.d(str);
        return Observable.a((ObservableSource<? extends T>[]) new ObservableSource[]{observable, observable2});
    }

    /* access modifiers changed from: private */
    public void a(GetStoryHeaderResponse getStoryHeaderResponse) {
        this.e.e(getStoryHeaderResponse.d);
    }

    /* access modifiers changed from: private */
    public void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.e.f();
        } else {
            this.e.g();
        }
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.d(th, "error when fetching story header video", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.e.a(this.p.a(bVar));
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.text.Spanned] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.oqg r11) {
        /*
            r10 = this;
            r10.y = r11
            vlc r0 = r11.a()
            pbn r1 = r10.e
            boolean r2 = r0.h()
            r1.a(r2)
            pbh r1 = r10.m
            pbc r2 = r10.l
            boolean r2 = r2.d()
            vlc r3 = r11.a()
            com.google.common.base.Optional r4 = com.google.common.base.Optional.e()
            vlg r3 = r3.d()
            if (r3 == 0) goto L_0x002d
            java.lang.String r3 = r3.c()
            com.google.common.base.Optional r4 = com.google.common.base.Optional.c(r3)
        L_0x002d:
            java.util.ArrayList r3 = com.google.common.collect.Lists.a()
            boolean r5 = r4.b()
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x004f
            java.lang.Object r4 = r4.c()
            java.lang.String r4 = (java.lang.String) r4
            android.content.Context r5 = r1.a
            r8 = 2131951802(0x7f1300ba, float:1.9540029E38)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r6] = r4
            java.lang.String r4 = r5.getString(r8, r9)
            r3.add(r4)
        L_0x004f:
            int r4 = r11.c()
            if (r4 <= 0) goto L_0x0097
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L_0x0060
            java.lang.String r5 = " • "
            r3.add(r5)
        L_0x0060:
            if (r2 == 0) goto L_0x007f
            android.content.Context r2 = r1.a
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131820567(0x7f110017, float:1.9273853E38)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r8 = defpackage.jun.a(r4, r8)
            r7[r6] = r8
            java.lang.String r2 = r2.getQuantityString(r5, r4, r7)
            r3.add(r2)
            goto L_0x0097
        L_0x007f:
            android.content.Context r2 = r1.a
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131820559(0x7f11000f, float:1.9273836E38)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r7[r6] = r8
            java.lang.String r2 = r2.getQuantityString(r5, r4, r7)
            r3.add(r2)
        L_0x0097:
            android.content.Context r1 = r1.a
            boolean r1 = defpackage.vgi.a(r1)
            if (r1 == 0) goto L_0x00a2
            java.util.Collections.reverse(r3)
        L_0x00a2:
            java.lang.String r1 = ""
            fbl r2 = defpackage.fbl.a(r1)
            java.lang.String r2 = r2.a(r3)
            pbn r3 = r10.e
            pbc r4 = r10.l
            boolean r4 = r4.b()
            r3.a(r2, r4)
            boolean r11 = r11.o()
            if (r11 == 0) goto L_0x00c3
            pbn r11 = r10.e
            r11.a(r1)
            goto L_0x00cc
        L_0x00c3:
            pbn r11 = r10.e
            java.lang.String r2 = r0.a()
            r11.a(r2)
        L_0x00cc:
            pbn r11 = r10.e
            com.spotify.playlist.models.Covers$Size r2 = com.spotify.playlist.models.Covers.Size.LARGE
            java.lang.String r2 = r0.getImageUri(r2)
            r11.b(r2)
            vlg r11 = r0.d()
            if (r11 == 0) goto L_0x0153
            java.lang.String r11 = r11.e()
            pbn r2 = r10.e
            r2.c(r11)
            io.reactivex.disposables.Disposable r2 = r10.g
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x0153
            r2 = 3000(0xbb8, double:1.482E-320)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Scheduler r5 = r10.r
            io.reactivex.Observable r2 = io.reactivex.Observable.a(r2, r4, r5)
            -$$Lambda$pbj$JS17cNove34U5e-OykwFqNf9HLU r3 = new -$$Lambda$pbj$JS17cNove34U5e-OykwFqNf9HLU
            r3.<init>(r10)
            io.reactivex.Observable r2 = r2.h(r3)
            fou<java.lang.Boolean> r3 = r10.c
            io.reactivex.functions.Function r4 = io.reactivex.internal.functions.Functions.a()
            io.reactivex.Observable r3 = r3.a(r4)
            r4 = 1
            io.reactivex.Observable r3 = r3.b(r4)
            pav r4 = r10.t
            r4.getClass()
            -$$Lambda$fOTVnSIz1YIcyRZVb2rtPX6ye0o r5 = new -$$Lambda$fOTVnSIz1YIcyRZVb2rtPX6ye0o
            r5.<init>(r4)
            io.reactivex.Single r4 = io.reactivex.Single.a(r5)
            -$$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE r5 = defpackage.$$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE
            io.reactivex.Maybe r4 = r4.a(r5)
            -$$Lambda$pbj$kUJV2wzalsHXCQ6Vf2EdDtTPjag r5 = new -$$Lambda$pbj$kUJV2wzalsHXCQ6Vf2EdDtTPjag
            r5.<init>(r10, r11, r2, r3)
            java.lang.String r11 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.a(r5, r11)
            io.reactivex.internal.operators.mixed.MaybeFlatMapObservable r11 = new io.reactivex.internal.operators.mixed.MaybeFlatMapObservable
            r11.<init>(r4, r5)
            io.reactivex.Observable r11 = io.reactivex.plugins.RxJavaPlugins.a(r11)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.a()
            io.reactivex.Observable r11 = r11.a(r2)
            io.reactivex.Scheduler r2 = r10.q
            io.reactivex.Observable r11 = r11.a(r2)
            -$$Lambda$pbj$qoFcWg0A1N_f51bqhV6PUX75Ihg r2 = new -$$Lambda$pbj$qoFcWg0A1N_f51bqhV6PUX75Ihg
            r2.<init>(r10)
            -$$Lambda$pbj$Z2XmbB1NDSRRkrBC86FsREUNiUU r3 = defpackage.$$Lambda$pbj$Z2XmbB1NDSRRkrBC86FsREUNiUU.INSTANCE
            io.reactivex.disposables.Disposable r11 = r11.a(r2, r3)
            r10.g = r11
        L_0x0153:
            java.lang.String r11 = r0.b()
            pbn r0 = r10.e
            if (r11 != 0) goto L_0x015c
            goto L_0x0160
        L_0x015c:
            android.text.Spanned r1 = defpackage.jug.a(r11)
        L_0x0160:
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pbj.a(oqg):void");
    }

    static /* synthetic */ void a(pbj pbj, boolean z) {
        boolean z2 = !pbj.l.f();
        if (z) {
            pbj.e.c(z2);
        } else {
            pbj.e.b(z2);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(Throwable th) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(oqg oqg) {
        this.u.onNext(oqg);
        this.b.onComplete();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    public final void a() {
        if (this.i.d()) {
            this.j.a(this.n);
        } else {
            this.j.b(this.n);
        }
        this.a.a(this.i.a(true).a((Action) $$Lambda$pbj$rHc0n2LHoCO8NIH076pT7OO0QdU.INSTANCE, (Consumer<? super Throwable>) $$Lambda$pbj$C2I6eVQR1sG717GiGbL0x_nLbTA.INSTANCE));
    }

    public final void a(a aVar) {
        this.i = aVar.a();
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        opw opw = this.o;
        opw.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$NOnjttzPKmBGTL4ar_lrEjmVub8<Object,Object>(opw)).a(this.q);
        $$Lambda$pbj$ONWE4CdR0w2_7xtotvIqNXBr3gA r1 = new $$Lambda$pbj$ONWE4CdR0w2_7xtotvIqNXBr3gA(this);
        CompletableSubject completableSubject = this.b;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    public final void a(pbn pbn) {
        this.e = pbn;
        if (pbn != null) {
            Boolean bool = this.f;
            if (bool != null) {
                this.e.d(bool.booleanValue());
                this.f = null;
            }
            this.v.a(this.u.d((Consumer<? super T>) new $$Lambda$pbj$suWtATQFdiQhIt8kKNMNOpVKXf4<Object>(this)));
            this.v.a(this.p.a.a(this.q).a((Consumer<? super T>) new $$Lambda$pbj$lb9x2J8zjQX1rOBjBsa0gpbZILY<Object>(this), (Consumer<? super Throwable>) $$Lambda$pbj$fSanfhR3YqGZ_r8XVibM4JRN3yc.INSTANCE));
            this.v.a(this.s.a(this.n).a(this.q).a((Consumer<? super T>) new $$Lambda$pbj$pDmdiPAvHwY9cKqOp0Z7x44llQ4<Object>(this), (Consumer<? super Throwable>) new $$Lambda$pbj$LNZyvwzl9gpDVu5jOfriUbR1uI<Object>(this)));
            if (this.l.a()) {
                this.i.a(this.x);
            }
        } else {
            this.v.c();
            this.g.bd_();
            this.i.b(this.x);
        }
    }

    public final void b() {
        boolean h2 = this.y.a().h();
        this.j.a(this.n, h2);
        this.a.a((!h2 ? this.k.a(this.n) : this.k.b(this.n)).a((Action) $$Lambda$pbj$zFzqHYSU9ieqa83pT6NtdIbVvOg.INSTANCE, (Consumer<? super Throwable>) $$Lambda$pbj$1JAxDnL6WcLz88_23FhpfMOoo.INSTANCE));
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.t.a();
        this.h.a(jva.f(jva.a(this.n).f()).h(), this.w);
        this.e.h();
    }
}
