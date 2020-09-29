package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.stories.v1.header.proto.GetStoryHeaderResponse;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: oty reason: default package */
class oty {
    final CompositeDisposable a = new CompositeDisposable();
    final CompletableSubject b = CompletableSubject.f();
    ouc c;
    Boolean d;
    private final rsj e;
    private orf f;
    private final ott g;
    private final uxt h;
    private final otr i;
    private final otw j;
    private final String k;
    private final ois l;
    private final ofh m;
    private final Scheduler n;
    private final ots o;
    private final BehaviorSubject<ojc> p = BehaviorSubject.a();
    private final CompositeDisposable q = new CompositeDisposable();
    private final fpt r;
    private final a s = new a() {
        public final void a(String str, boolean z) {
        }

        public final void a(boolean z) {
            oty.a(oty.this, z);
        }
    };
    private ojc t;

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    public oty(rsj rsj, ois ois, ott ott, uxt uxt, otw otw, ofh ofh, String str, Scheduler scheduler, ots ots, otr otr, fpt fpt) {
        this.e = (rsj) fay.a(rsj);
        this.g = ott;
        this.h = uxt;
        this.i = otr;
        this.j = otw;
        this.k = str;
        this.l = ois;
        this.m = ofh;
        this.o = ots;
        this.n = scheduler;
        this.r = (fpt) fay.a(fpt);
    }

    public final void a(a aVar) {
        this.f = aVar.a();
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        ois ois = this.l;
        ois.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$PjVYt5Nr9pG_VgyEij6HBWsUiE<Object,Object>(ois)).a(this.n);
        $$Lambda$oty$eff6APdPp5hnCkAIwZGXnCLB8os r1 = new $$Lambda$oty$eff6APdPp5hnCkAIwZGXnCLB8os(this);
        CompletableSubject completableSubject = this.b;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ojc ojc) {
        this.p.onNext(ojc);
        this.b.onComplete();
    }

    public final void a(ouc ouc) {
        this.c = ouc;
        if (ouc != null) {
            Boolean bool = this.d;
            if (bool != null) {
                this.c.b(bool.booleanValue());
                this.d = null;
            }
            this.q.a(this.p.d((Consumer<? super T>) new $$Lambda$oty$xzYpotJdSQEibACPz12npLxVEz0<Object>(this)));
            this.q.a(this.m.a.a(this.n).a((Consumer<? super T>) new $$Lambda$oty$t_7ji36lSy6JdlBLi8SNIyGkJM<Object>(this), (Consumer<? super Throwable>) $$Lambda$oty$o2Um0_AbD4lKAWQ2v5ySMCdHA.INSTANCE));
            this.q.a(this.o.a(this.k).a(this.n).a((Consumer<? super T>) new $$Lambda$oty$VE8PXgwoTsRS_RbG0Mv9SZRjPs8<Object>(this), (Consumer<? super Throwable>) new $$Lambda$oty$wClFa_RuG2_tfvajpipAhVqL5w4<Object>(this)));
            if (this.i.a()) {
                this.f.a(this.s);
            }
        } else {
            this.q.c();
            this.f.b(this.s);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.c.a(this.m.a(bVar));
    }

    public final void a() {
        if (this.f.d()) {
            this.g.a(this.k);
        } else {
            this.g.b(this.k);
        }
        this.a.a(this.f.a(true).a((Action) $$Lambda$oty$LbwmsK61w1vXsI8oOaYPMHUqDHI.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oty$OgtRwVja6z1WliABM9aPaSRNwZE.INSTANCE));
    }

    public final void b() {
        Completable completable;
        boolean h2 = this.t.a().h();
        this.g.a(this.k, h2);
        if (!h2) {
            completable = this.h.a(this.k);
        } else {
            completable = this.h.b(this.k);
        }
        this.a.a(completable.a((Action) $$Lambda$oty$hepj7R7Ns35vyfoI9RVP0EJIA.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oty$QfchBNnEx3VzK0SSunjSsIg8wg.INSTANCE));
    }

    public final void c() {
        this.e.a(jst.f(jst.a(this.k).f()).h(), this.r);
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.text.Spanned] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.ojc r11) {
        /*
            r10 = this;
            r10.t = r11
            uyz r0 = r11.a()
            ouc r1 = r10.c
            boolean r2 = r0.h()
            r1.a(r2)
            otw r1 = r10.j
            otr r2 = r10.i
            boolean r2 = r2.d()
            uyz r3 = r11.a()
            com.google.common.base.Optional r4 = com.google.common.base.Optional.e()
            uzd r3 = r3.d()
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
            r8 = 2131951798(0x7f1300b6, float:1.954002E38)
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
            java.lang.String r8 = defpackage.jsd.a(r4, r8)
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
            boolean r1 = defpackage.uur.a(r1)
            if (r1 == 0) goto L_0x00a2
            java.util.Collections.reverse(r3)
        L_0x00a2:
            java.lang.String r1 = ""
            fau r2 = defpackage.fau.a(r1)
            java.lang.String r2 = r2.a(r3)
            ouc r3 = r10.c
            otr r4 = r10.i
            boolean r4 = r4.b()
            r3.a(r2, r4)
            boolean r11 = r11.o()
            if (r11 == 0) goto L_0x00c3
            ouc r11 = r10.c
            r11.a(r1)
            goto L_0x00cc
        L_0x00c3:
            ouc r11 = r10.c
            java.lang.String r2 = r0.a()
            r11.a(r2)
        L_0x00cc:
            ouc r11 = r10.c
            com.spotify.playlist.models.Covers$Size r2 = com.spotify.playlist.models.Covers.Size.LARGE
            java.lang.String r2 = r0.getImageUri(r2)
            r11.b(r2)
            uzd r11 = r0.d()
            if (r11 == 0) goto L_0x00e6
            java.lang.String r11 = r11.e()
            ouc r2 = r10.c
            r2.c(r11)
        L_0x00e6:
            java.lang.String r11 = r0.b()
            ouc r0 = r10.c
            if (r11 != 0) goto L_0x00ef
            goto L_0x00f3
        L_0x00ef:
            android.text.Spanned r1 = defpackage.jrw.a(r11)
        L_0x00f3:
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oty.a(ojc):void");
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.d(th, "error when fetching story header video", new Object[0]);
    }

    /* access modifiers changed from: private */
    public void a(GetStoryHeaderResponse getStoryHeaderResponse) {
        this.c.d(getStoryHeaderResponse.d);
    }

    static /* synthetic */ void a(oty oty, boolean z) {
        if (z) {
            oty.c.f();
        } else {
            oty.c.e();
        }
    }
}
