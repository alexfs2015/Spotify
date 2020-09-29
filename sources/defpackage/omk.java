package defpackage;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: omk reason: default package */
class omk {
    final CompositeDisposable a = new CompositeDisposable();
    final CompletableSubject b = CompletableSubject.f();
    omo c;
    Boolean d;
    private orf e;
    private final ome f;
    private final uxt g;
    private final ohc h;
    private final omi i;
    private final tcn j;
    private final String k;
    private final ois l;
    private final ofh m;
    private final Scheduler n;
    private final ofa o;
    private final BehaviorSubject<ojc> p = BehaviorSubject.a();
    private final CompositeDisposable q = new CompositeDisposable();
    private final a r = new a() {
        public final void a(String str, boolean z) {
        }

        public final void a(boolean z) {
            omk.a(omk.this, z);
        }
    };
    private ojc s;

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    public omk(ois ois, ome ome, uxt uxt, ofa ofa, omi omi, tcn tcn, ofh ofh, String str, Scheduler scheduler, ohc ohc) {
        this.f = ome;
        this.g = uxt;
        this.h = ohc;
        this.i = omi;
        this.j = tcn;
        this.k = str;
        this.l = ois;
        this.m = ofh;
        this.n = scheduler;
        this.o = ofa;
    }

    public final void a(a aVar) {
        this.e = aVar.a();
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        ois ois = this.l;
        ois.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$PjVYt5Nr9pG_VgyEij6HBWsUiE<Object,Object>(ois)).a(this.n);
        $$Lambda$omk$tijCb_orIAGw5DTuH0PTliW3dC0 r1 = new $$Lambda$omk$tijCb_orIAGw5DTuH0PTliW3dC0(this);
        CompletableSubject completableSubject = this.b;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ojc ojc) {
        this.p.onNext(ojc);
        this.b.onComplete();
    }

    public final void a(omo omo) {
        this.c = omo;
        if (omo != null) {
            Boolean bool = this.d;
            if (bool != null) {
                this.c.d(bool.booleanValue());
                this.d = null;
            }
            this.q.a(this.p.d((Consumer<? super T>) new $$Lambda$omk$ya8bEm3ssR5htYWS4sVOpZnukU<Object>(this)));
            this.q.a(this.m.a.a(this.n).a((Consumer<? super T>) new $$Lambda$omk$AMT7Ya9ENPMoz_pKADDoK6Uwc0<Object>(this), (Consumer<? super Throwable>) $$Lambda$omk$6F75FMhfjS57jINDSA9IbldhHQ.INSTANCE));
            this.q.a(this.o.a.a(this.n).a((Consumer<? super T>) new $$Lambda$omk$9ZJlbBBZQz7jw34qPgXcoW9Lfc<Object>(this), (Consumer<? super Throwable>) $$Lambda$omk$dQsXVr8u9sIjBJOZnInUHZy1eq4.INSTANCE));
            if (this.h.a()) {
                this.e.a(this.r);
            }
        } else {
            this.q.c();
            this.e.b(this.r);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.c.a(this.m.a(bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.c.e();
        }
    }

    public final void a() {
        Completable completable;
        boolean b2 = this.h.b().b();
        if (!this.e.d() && this.h.f()) {
            this.j.a();
        }
        if (this.h.b().d()) {
            this.f.b(this.k);
            CompositeDisposable compositeDisposable = this.a;
            if (b2) {
                completable = this.e.c();
            } else {
                completable = this.e.b();
            }
            compositeDisposable.a(completable.a((Action) $$Lambda$omk$qz6AJow0jh2eg_9x6MEeX1VBXSA.INSTANCE, (Consumer<? super Throwable>) $$Lambda$omk$XU26KmGCElcHHqtJEcQXio48r0.INSTANCE));
            return;
        }
        if (this.e.d()) {
            this.f.a(this.k);
        } else {
            this.f.b(this.k);
        }
        this.a.a(this.e.a(b2).a((Action) $$Lambda$omk$phGEhTxz7aNpU7kgcA2lhFavDk.INSTANCE, (Consumer<? super Throwable>) $$Lambda$omk$XorQyz9em6zv7S5BEzq7YYxsGe0.INSTANCE));
    }

    public final void b() {
        Completable completable;
        boolean h2 = this.s.a().h();
        this.f.a(this.k, h2);
        if (!h2) {
            completable = this.g.a(this.k);
        } else {
            completable = this.g.b(this.k);
        }
        this.a.a(completable.a((Action) $$Lambda$omk$BRKM7h5oVFzpkEUKTMFgRDbhRM.INSTANCE, (Consumer<? super Throwable>) $$Lambda$omk$G4aHtkrKhh2cNDe7SW4xsaO4Aeo.INSTANCE));
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.text.Spanned] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.ojc r11) {
        /*
            r10 = this;
            r10.s = r11
            uyz r0 = r11.a()
            omo r1 = r10.c
            boolean r2 = r0.h()
            r1.a(r2)
            omi r1 = r10.i
            ohc r2 = r10.h
            boolean r2 = r2.e()
            uyz r3 = r11.a()
            com.google.common.base.Optional r4 = com.google.common.base.Optional.e()
            uzd r3 = r3.w()
            if (r3 == 0) goto L_0x0033
            boolean r5 = r3.d()
            if (r5 == 0) goto L_0x0033
            java.lang.String r3 = r3.c()
            com.google.common.base.Optional r4 = com.google.common.base.Optional.c(r3)
        L_0x0033:
            java.util.ArrayList r3 = com.google.common.collect.Lists.a()
            boolean r5 = r4.b()
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0055
            java.lang.Object r4 = r4.c()
            java.lang.String r4 = (java.lang.String) r4
            android.content.Context r5 = r1.a
            r8 = 2131953173(0x7f130615, float:1.954281E38)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r6] = r4
            java.lang.String r4 = r5.getString(r8, r9)
            r3.add(r4)
        L_0x0055:
            int r4 = r11.c()
            if (r4 <= 0) goto L_0x009d
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L_0x0066
            java.lang.String r5 = " • "
            r3.add(r5)
        L_0x0066:
            if (r2 == 0) goto L_0x0085
            android.content.Context r2 = r1.a
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131820567(0x7f110017, float:1.9273853E38)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r8 = defpackage.jsd.a(r4, r8)
            r7[r6] = r8
            java.lang.String r2 = r2.getQuantityString(r5, r4, r7)
            r3.add(r2)
            goto L_0x009d
        L_0x0085:
            android.content.Context r2 = r1.a
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131820559(0x7f11000f, float:1.9273836E38)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r7[r6] = r8
            java.lang.String r2 = r2.getQuantityString(r5, r4, r7)
            r3.add(r2)
        L_0x009d:
            android.content.Context r1 = r1.a
            boolean r1 = defpackage.uur.a(r1)
            if (r1 == 0) goto L_0x00a8
            java.util.Collections.reverse(r3)
        L_0x00a8:
            java.lang.String r1 = ""
            fau r2 = defpackage.fau.a(r1)
            java.lang.String r2 = r2.a(r3)
            omo r3 = r10.c
            ohc r4 = r10.h
            boolean r4 = r4.c()
            r3.a(r2, r4)
            boolean r2 = r11.o()
            if (r2 == 0) goto L_0x00c9
            omo r2 = r10.c
            r2.a(r1)
            goto L_0x00d2
        L_0x00c9:
            omo r2 = r10.c
            java.lang.String r3 = r0.a()
            r2.a(r3)
        L_0x00d2:
            uyz r11 = r11.a()
            com.google.common.collect.ImmutableMap r11 = r11.q()
            java.lang.String r2 = "primary_color"
            java.lang.Object r2 = r11.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            java.lang.String r2 = "#FFFFFF"
        L_0x00e7:
            int r2 = android.graphics.Color.parseColor(r2)
            java.lang.String r3 = "image_url"
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            omo r4 = r10.c
            com.spotify.playlist.models.Covers$Size r5 = com.spotify.playlist.models.Covers.Size.LARGE
            java.lang.String r5 = r0.getImageUri(r5)
            r4.a(r2, r3, r5)
            java.lang.String r3 = "subtitle"
            java.lang.Object r11 = r11.get(r3)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = r0.b()
            omo r3 = r10.c
            if (r0 != 0) goto L_0x010f
            goto L_0x0113
        L_0x010f:
            android.text.Spanned r1 = defpackage.jrw.a(r0)
        L_0x0113:
            r3.a(r1, r11)
            omo r11 = r10.c
            r11.b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.omk.a(ojc):void");
    }

    static /* synthetic */ void a(omk omk, boolean z) {
        boolean a2 = omk.h.b().a();
        if (omk.h.b().d() || !z) {
            omk.c.b(a2);
        } else {
            omk.c.c(a2);
        }
    }
}
