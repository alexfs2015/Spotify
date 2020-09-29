package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: oto reason: default package */
class oto {
    final CompositeDisposable a = new CompositeDisposable();
    final CompletableSubject b = CompletableSubject.f();
    ots c;
    Boolean d;
    private oyl e;
    private final oti f;
    private final vjv g;
    private final oog h;
    private final otm i;
    private final tmu j;
    private final String k;
    private final opw l;
    private final oml m;
    private final Scheduler n;
    private final BehaviorSubject<oqg> o = BehaviorSubject.a();
    private final CompositeDisposable p = new CompositeDisposable();
    private final a q = new a() {
        public final void a(String str, boolean z) {
        }

        public final void a(boolean z) {
            oto.a(oto.this, z);
        }
    };
    private oqg r;

    public oto(opw opw, oti oti, vjv vjv, otm otm, tmu tmu, oml oml, String str, Scheduler scheduler, oog oog) {
        this.f = oti;
        this.g = vjv;
        this.h = oog;
        this.i = otm;
        this.j = tmu;
        this.k = str;
        this.l = opw;
        this.m = oml;
        this.n = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.c.a(this.m.a(bVar));
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.text.Spanned] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.oqg r11) {
        /*
            r10 = this;
            r10.r = r11
            vlc r0 = r11.a()
            ots r1 = r10.c
            boolean r2 = r0.h()
            r1.a(r2)
            otm r1 = r10.i
            oog r2 = r10.h
            boolean r2 = r2.e()
            vlc r3 = r11.a()
            com.google.common.base.Optional r4 = com.google.common.base.Optional.e()
            vlg r3 = r3.w()
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
            r8 = 2131953167(0x7f13060f, float:1.9542797E38)
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
            java.lang.String r8 = defpackage.jun.a(r4, r8)
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
            boolean r1 = defpackage.vgi.a(r1)
            if (r1 == 0) goto L_0x00a8
            java.util.Collections.reverse(r3)
        L_0x00a8:
            java.lang.String r1 = ""
            fbl r2 = defpackage.fbl.a(r1)
            java.lang.String r2 = r2.a(r3)
            ots r3 = r10.c
            oog r4 = r10.h
            boolean r4 = r4.c()
            r3.a(r2, r4)
            boolean r2 = r11.o()
            if (r2 == 0) goto L_0x00c9
            ots r2 = r10.c
            r2.a(r1)
            goto L_0x00d2
        L_0x00c9:
            ots r2 = r10.c
            java.lang.String r3 = r0.a()
            r2.a(r3)
        L_0x00d2:
            vlc r11 = r11.a()
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
            ots r4 = r10.c
            com.spotify.playlist.models.Covers$Size r5 = com.spotify.playlist.models.Covers.Size.LARGE
            java.lang.String r5 = r0.getImageUri(r5)
            r4.a(r2, r3, r5)
            java.lang.String r3 = "subtitle"
            java.lang.Object r11 = r11.get(r3)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = r0.b()
            ots r3 = r10.c
            if (r0 != 0) goto L_0x010f
            goto L_0x0113
        L_0x010f:
            android.text.Spanned r1 = defpackage.jug.a(r0)
        L_0x0113:
            r3.a(r1, r11)
            ots r11 = r10.c
            r11.b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oto.a(oqg):void");
    }

    static /* synthetic */ void a(oto oto, boolean z) {
        boolean a2 = oto.h.b().a();
        if (oto.h.b().d() || !z) {
            oto.c.b(a2);
        } else {
            oto.c.c(a2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(oqg oqg) {
        this.o.onNext(oqg);
        this.b.onComplete();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    public final void a() {
        boolean b2 = this.h.b().b();
        if (!this.e.d() && this.h.f()) {
            this.j.a();
        }
        if (this.h.b().d()) {
            this.f.b(this.k);
            this.a.a((b2 ? this.e.c() : this.e.b()).a((Action) $$Lambda$oto$QERTXqVSGyRlBd8eMh7gun85RE.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oto$RXgMKPDHKzF7sGIigWBq73w87dM.INSTANCE));
            return;
        }
        if (this.e.d()) {
            this.f.a(this.k);
        } else {
            this.f.b(this.k);
        }
        this.a.a(this.e.a(b2).a((Action) $$Lambda$oto$rv8gINvKrh8LXWUJXY1oLfXlK4.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oto$fJqOc9s3ABPeEZuAc4XU6cxa8fY.INSTANCE));
    }

    public final void a(a aVar) {
        this.e = aVar.a();
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        opw opw = this.l;
        opw.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$NOnjttzPKmBGTL4ar_lrEjmVub8<Object,Object>(opw)).a(this.n);
        $$Lambda$oto$cguokGnrYkvaXoPPBdJBcwQBpc r1 = new $$Lambda$oto$cguokGnrYkvaXoPPBdJBcwQBpc(this);
        CompletableSubject completableSubject = this.b;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    public final void a(ots ots) {
        this.c = ots;
        if (ots != null) {
            Boolean bool = this.d;
            if (bool != null) {
                this.c.d(bool.booleanValue());
                this.d = null;
            }
            this.p.a(this.o.d((Consumer<? super T>) new $$Lambda$oto$lSrqNNMMbR9kLifTPLGSNVKq5w<Object>(this)));
            this.p.a(this.m.a.a(this.n).a((Consumer<? super T>) new $$Lambda$oto$ML0HORF_6D7ZLR4jrXv8LrzHY<Object>(this), (Consumer<? super Throwable>) $$Lambda$oto$Q5seDT8RTkCozZDWTY_Uc_4k7EI.INSTANCE));
            if (this.h.a()) {
                this.e.a(this.q);
            }
        } else {
            this.p.c();
            this.e.b(this.q);
        }
    }

    public final void b() {
        boolean h2 = this.r.a().h();
        this.f.a(this.k, h2);
        this.a.a((!h2 ? this.g.a(this.k) : this.g.b(this.k)).a((Action) $$Lambda$oto$2xrp5Wk9ju2XUryFA8SK8jIc160.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oto$yXouXX0zRlzDxdd_escJ0kKHYMw.INSTANCE));
    }
}
