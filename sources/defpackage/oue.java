package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: oue reason: default package */
public class oue {
    final CompositeDisposable a = new CompositeDisposable();
    final otx b;
    final String c;
    final CompletableSubject d = CompletableSubject.f();
    oui e;
    Boolean f;
    vlc g;
    private oyl h;
    private final ouc i;
    private final vjv j;
    private final tmu k;
    private final ool l;
    private final opw m;
    private final oml n;
    private final Scheduler o;
    private final Optional<oub> p;
    private final BehaviorSubject<oqg> q = BehaviorSubject.a();
    private final CompositeDisposable r = new CompositeDisposable();
    private final a s = new a() {
        public final void a(String str, boolean z) {
        }

        public final void a(boolean z) {
            oue.a(oue.this, z);
        }
    };

    public oue(opw opw, ouc ouc, otx otx, vjv vjv, tmu tmu, oml oml, String str, Scheduler scheduler, ool ool, Optional<oub> optional) {
        this.i = ouc;
        this.b = otx;
        this.j = vjv;
        this.k = tmu;
        this.c = str;
        this.l = ool;
        this.p = optional;
        this.m = opw;
        this.n = oml;
        this.o = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.e.a(this.n.a(bVar));
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [android.text.Spanned] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.oqg r12) {
        /*
            r11 = this;
            vlc r0 = r12.a()
            r11.g = r0
            com.google.common.collect.ImmutableMap r1 = r0.q()
            java.lang.String r2 = "primary_color"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            java.lang.String r2 = "#FFFFFF"
        L_0x0017:
            int r2 = android.graphics.Color.parseColor(r2)
            java.lang.String r3 = "image_url"
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = defpackage.fbo.a(r4)
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x003d
            oui r6 = r11.e
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            com.spotify.playlist.models.Covers$Size r3 = com.spotify.playlist.models.Covers.Size.LARGE
            java.lang.String r3 = r0.getImageUri(r3)
            r6.a(r1, r3, r2)
            goto L_0x0054
        L_0x003d:
            com.spotify.playlist.models.Covers$Size r1 = com.spotify.playlist.models.Covers.Size.NORMAL
            java.lang.String r1 = r0.getImageUri(r1)
            boolean r3 = defpackage.fbo.a(r1)
            if (r3 != 0) goto L_0x0054
            oui r3 = r11.e
            com.spotify.playlist.models.Covers$Size r6 = com.spotify.playlist.models.Covers.Size.LARGE
            java.lang.String r6 = r0.getImageUri(r6)
            r3.a(r1, r6)
        L_0x0054:
            oui r1 = r11.e
            r1.b(r2)
            boolean r1 = r12.o()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x007a
            boolean r3 = r12.m()
            if (r3 != 0) goto L_0x007a
            oui r3 = r11.e
            r3.a(r2)
            if (r4 == 0) goto L_0x0074
            oui r3 = r11.e
            r3.c(r2)
            goto L_0x0090
        L_0x0074:
            oui r3 = r11.e
            r3.b(r2)
            goto L_0x0090
        L_0x007a:
            java.lang.String r3 = r0.a()
            oui r6 = r11.e
            r6.a(r3)
            if (r4 == 0) goto L_0x008b
            oui r4 = r11.e
            r4.c(r3)
            goto L_0x0090
        L_0x008b:
            oui r4 = r11.e
            r4.b(r3)
        L_0x0090:
            oui r3 = r11.e
            r1 = r1 ^ r5
            r3.f(r1)
            com.google.common.base.Optional<oub> r1 = r11.p
            boolean r1 = r1.b()
            r3 = 0
            if (r1 == 0) goto L_0x00ae
            oui r1 = r11.e
            com.google.common.base.Optional<oub> r4 = r11.p
            java.lang.Object r4 = r4.c()
            oub r4 = (defpackage.oub) r4
            r1.a(r12, r4)
            goto L_0x0197
        L_0x00ae:
            ouc r1 = r11.i
            ool r4 = r11.l
            boolean r4 = r4.f()
            vlc r6 = r12.a()
            com.google.common.base.Optional r7 = com.google.common.base.Optional.e()
            vlg r8 = r6.d()
            if (r8 == 0) goto L_0x00d2
            boolean r9 = r8.d()
            if (r9 == 0) goto L_0x00d2
            java.lang.String r7 = r8.c()
            com.google.common.base.Optional r7 = com.google.common.base.Optional.c(r7)
        L_0x00d2:
            com.google.common.base.Optional r8 = com.google.common.base.Optional.e()
            vlg r6 = r6.w()
            if (r6 == 0) goto L_0x00ea
            boolean r9 = r6.d()
            if (r9 == 0) goto L_0x00ea
            java.lang.String r6 = r6.c()
            com.google.common.base.Optional r8 = com.google.common.base.Optional.c(r6)
        L_0x00ea:
            java.util.ArrayList r6 = com.google.common.collect.Lists.a()
            boolean r9 = r8.b()
            if (r9 == 0) goto L_0x010b
            java.lang.Object r7 = r8.c()
            java.lang.String r7 = (java.lang.String) r7
            android.content.Context r8 = r1.a
            r9 = 2131953167(0x7f13060f, float:1.9542797E38)
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r3] = r7
            java.lang.String r7 = r8.getString(r9, r10)
            r6.add(r7)
            goto L_0x0127
        L_0x010b:
            boolean r8 = r7.b()
            if (r8 == 0) goto L_0x0127
            java.lang.Object r7 = r7.c()
            java.lang.String r7 = (java.lang.String) r7
            android.content.Context r8 = r1.a
            r9 = 2131953469(0x7f13073d, float:1.954341E38)
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r3] = r7
            java.lang.String r7 = r8.getString(r9, r10)
            r6.add(r7)
        L_0x0127:
            int r12 = r12.c()
            if (r12 <= 0) goto L_0x016f
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0138
            java.lang.String r7 = " • "
            r6.add(r7)
        L_0x0138:
            if (r4 == 0) goto L_0x0157
            android.content.Context r4 = r1.a
            android.content.res.Resources r4 = r4.getResources()
            r7 = 2131820579(0x7f110023, float:1.9273877E38)
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r9 = defpackage.jun.a(r12, r9)
            r8[r3] = r9
            java.lang.String r12 = r4.getQuantityString(r7, r12, r8)
            r6.add(r12)
            goto L_0x016f
        L_0x0157:
            android.content.Context r4 = r1.a
            android.content.res.Resources r4 = r4.getResources()
            r7 = 2131820578(0x7f110022, float:1.9273875E38)
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r8[r3] = r9
            java.lang.String r12 = r4.getQuantityString(r7, r12, r8)
            r6.add(r12)
        L_0x016f:
            android.content.Context r12 = r1.a
            boolean r12 = defpackage.vgi.a(r12)
            if (r12 == 0) goto L_0x017a
            java.util.Collections.reverse(r6)
        L_0x017a:
            fbl r12 = defpackage.fbl.a(r2)
            java.lang.String r12 = r12.a(r6)
            oui r1 = r11.e
            boolean r4 = defpackage.fbo.a(r12)
            r4 = r4 ^ r5
            r1.a(r4)
            oui r1 = r11.e
            ool r4 = r11.l
            boolean r4 = r4.d()
            r1.a(r12, r4)
        L_0x0197:
            java.lang.String r12 = r0.b()
            oui r1 = r11.e
            if (r12 != 0) goto L_0x01a0
            goto L_0x01a4
        L_0x01a0:
            android.text.Spanned r2 = defpackage.jug.a(r12)
        L_0x01a4:
            r1.a(r2)
            oui r12 = r11.e
            ool r1 = r11.l
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x01b8
            boolean r1 = r0.k()
            if (r1 != 0) goto L_0x01b8
            r3 = 1
        L_0x01b8:
            r12.g(r3)
            oui r12 = r11.e
            boolean r0 = r0.h()
            r12.d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oue.a(oqg):void");
    }

    static /* synthetic */ void a(oue oue, boolean z) {
        boolean a2 = oue.l.c().a();
        if (oue.l.c().d() || !z) {
            oue.e.b(a2);
        } else {
            oue.e.c(a2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(oqg oqg) {
        this.q.onNext(oqg);
        this.d.onComplete();
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
        boolean b2 = this.l.c().b();
        boolean d2 = this.h.d();
        if (!d2 && this.l.e()) {
            this.k.a();
        }
        if (this.l.c().d()) {
            this.b.a(this.c);
            this.a.a((b2 ? this.h.c() : this.h.b()).a((Action) $$Lambda$oue$qnQUm9vv5KYs8NDy3LPOSV0K0.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oue$9HEQsjUStwBeHdlpP_exlIm2gSw.INSTANCE));
            return;
        }
        if (d2) {
            this.b.b(this.c);
        } else {
            this.b.a(this.c);
        }
        this.a.a(this.h.a(b2).a((Action) $$Lambda$oue$JIvgTA8evwjCrGo_qY9l0GstDa0.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oue$ir6tVLt256s4PDWh8SIU09Fgfsc.INSTANCE));
    }

    public final void a(a aVar) {
        this.h = aVar.a();
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        opw opw = this.m;
        opw.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$NOnjttzPKmBGTL4ar_lrEjmVub8<Object,Object>(opw)).a(this.o);
        $$Lambda$oue$sqE2AuovCKPV4TTJtuT4E1nQRXk r1 = new $$Lambda$oue$sqE2AuovCKPV4TTJtuT4E1nQRXk(this);
        CompletableSubject completableSubject = this.d;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    public final void a(oui oui) {
        this.e = oui;
        if (oui != null) {
            Boolean bool = this.f;
            if (bool != null) {
                this.e.e(bool.booleanValue());
                this.f = null;
            }
            this.r.a(this.q.d((Consumer<? super T>) new $$Lambda$oue$hBzSLXzgEqN7ydCpF64YkhrBcwI<Object>(this)));
            this.r.a(this.n.a.a(this.o).a((Consumer<? super T>) new $$Lambda$oue$jzLXQDztys9KlWEZA5SZ3Kc4pQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$oue$yFs6oTomoGZDLpTQ58ar2Onw2iM.INSTANCE));
            if (this.l.b()) {
                this.h.a(this.s);
            }
        } else {
            this.r.c();
            this.h.b(this.s);
        }
    }

    public final void b() {
        boolean h2 = this.g.h();
        this.b.a(this.c, h2);
        this.a.a((!h2 ? this.j.a(this.c) : this.j.b(this.c)).a((Action) $$Lambda$oue$vItPpQwB1LtZI4hT_B6d2Zo9w.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oue$JdkDIqneW2cCGLqan9NcOvrYHk.INSTANCE));
    }
}
