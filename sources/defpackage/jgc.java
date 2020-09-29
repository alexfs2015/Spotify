package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.mobile.android.spotlets.ads.model.Format;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.music.ads.voice.VoiceAdService;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/* renamed from: jgc reason: default package */
public final class jgc extends jht {
    private final Context a;
    private fpt b;
    private hmq c;
    private hxc f;
    private final CompositeDisposable g = new CompositeDisposable();
    private boolean h;
    private Disposable i;
    private Disposable j;
    private final igz k;
    private final iep l;
    private final hxl m;
    private final AdRules n;
    private final hxa o;
    private final ied p;
    private final hvz q;
    private final hmr r;
    private final idq s;
    private final ids t;
    private final Flowable<PlayerState> u;
    private final ife v;
    private final ihe w;
    private final hzb x;
    private final hyv y;
    private final Flowable<fpt> z;

    public jgc(Context context, igz igz, iep iep, hxl hxl, AdRules adRules, hxa hxa, ied ied, hvz hvz, hmr hmr, idq idq, ids ids, Flowable<PlayerState> flowable, ife ife, ihe ihe, hzb hzb, hyv hyv, Flowable<fpt> flowable2) {
        super("AdSessionState");
        this.a = context;
        this.k = igz;
        this.l = iep;
        this.m = hxl;
        this.n = adRules;
        this.o = hxa;
        this.p = ied;
        this.q = hvz;
        this.r = hmr;
        this.s = idq;
        this.t = ids;
        this.u = flowable;
        this.v = ife;
        this.w = ihe;
        this.x = hzb;
        this.y = hyv;
        this.z = flowable2;
    }

    /* access modifiers changed from: private */
    public void a(fpt fpt) {
        if (((Boolean) fpt.a(hwb.a)).booleanValue()) {
            this.b = fpt;
            ag_();
        } else {
            ah_();
        }
        hyv hyv = this.y;
        if (fpt != null && ((Boolean) fpt.a(hwb.i)).booleanValue()) {
            hyv.a();
        }
    }

    public final void a() {
        this.g.a(this.z.c((Consumer<? super T>) new $$Lambda$jgc$aICV6A1hGUbGUqTkTHghB30Xh6U<Object>(this)));
        if (!this.h) {
            CompositeDisposable compositeDisposable = this.g;
            Observable a2 = this.m.a("submodel", Build.MODEL);
            ifp ifp = new ifp();
            a2.subscribe(ifp);
            compositeDisposable.a((Disposable) ifp);
            CompositeDisposable compositeDisposable2 = this.g;
            Observable a3 = this.m.a("make", Build.MANUFACTURER);
            ifp ifp2 = new ifp();
            a3.subscribe(ifp2);
            compositeDisposable2.a((Disposable) ifp2);
            CompositeDisposable compositeDisposable3 = this.g;
            Observable a4 = this.m.a("os_version", Integer.toString(VERSION.SDK_INT));
            ifp ifp3 = new ifp();
            a4.subscribe(ifp3);
            compositeDisposable3.a((Disposable) ifp3);
            this.h = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            fpt r3 = r0.b
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "(comscore) handleFlagsChanged : %s"
            com.spotify.base.java.logging.Logger.b(r3, r2)
            iep r2 = r0.l
            fpt r3 = r0.b
            if (r3 == 0) goto L_0x002d
            fpq r5 = defpackage.hwb.a
            java.io.Serializable r5 = r3.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x002d
            android.content.Context r5 = r2.a
            boolean r5 = defpackage.jtc.c(r5)
            if (r5 != 0) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            r2.c = r5
            if (r3 == 0) goto L_0x003e
            fpr<com.spotify.mobile.android.spotlets.ads.screensaver.ScreensaverProgrammaticAdFlag> r5 = defpackage.hwb.c
            java.io.Serializable r5 = r3.a(r5)
            com.spotify.mobile.android.spotlets.ads.screensaver.ScreensaverProgrammaticAdFlag r6 = com.spotify.mobile.android.spotlets.ads.screensaver.ScreensaverProgrammaticAdFlag.ENABLED
            if (r5 != r6) goto L_0x003e
            r5 = 1
            goto L_0x003f
        L_0x003e:
            r5 = 0
        L_0x003f:
            r2.e = r5
            if (r3 == 0) goto L_0x0054
            fpr<com.spotify.mobile.android.flags.RolloutFlag> r5 = defpackage.hwb.o
            java.io.Serializable r3 = r3.a(r5)
            com.spotify.mobile.android.flags.RolloutFlag r5 = com.spotify.mobile.android.flags.RolloutFlag.ENABLED
            if (r3 != r5) goto L_0x004f
            r3 = 1
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            if (r3 == 0) goto L_0x0054
            r3 = 1
            goto L_0x0055
        L_0x0054:
            r3 = 0
        L_0x0055:
            r2.f = r3
            com.spotify.mobile.android.spotlets.ads.rules.AdRules r2 = r0.n
            fpt r3 = r0.b
            if (r3 == 0) goto L_0x006f
            com.spotify.mobile.android.spotlets.ads.rules.AdRules$StateType r5 = com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.MIDROLL_VIDEO_ADS
            fpq r6 = defpackage.hwb.b
            java.io.Serializable r3 = r3.a(r6)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.a(r5, r3)
            goto L_0x0074
        L_0x006f:
            com.spotify.mobile.android.spotlets.ads.rules.AdRules$StateType r3 = com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.MIDROLL_VIDEO_ADS
            r2.a(r3, r4)
        L_0x0074:
            fpt r2 = r0.b
            if (r2 == 0) goto L_0x007a
            r2 = 1
            goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            ife r3 = r0.v
            r3.a(r2)
            hxa r3 = r0.o
            r3.a = r2
            fpt r2 = r0.b
            if (r2 != 0) goto L_0x0092
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = "[AdSession] - No flags, ads disabled"
            com.spotify.base.java.logging.Logger.a(r3, r2)
            hik r2 = defpackage.hik.a
            goto L_0x00b7
        L_0x0092:
            hik r2 = new hik
            r2.<init>()
            fpt r3 = r0.b
            fpq r5 = defpackage.hwb.f
            java.io.Serializable r3 = r3.a(r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.b = r3
            fpt r3 = r0.b
            fpq r5 = defpackage.hwb.b
            java.io.Serializable r3 = r3.a(r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.c = r3
        L_0x00b7:
            android.content.Context r3 = r0.a
            boolean r3 = defpackage.jtc.c(r3)
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]
            boolean r7 = r2.b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6[r4] = r7
            boolean r7 = r2.c
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6[r1] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            r8 = 2
            r6[r8] = r7
            java.lang.String r7 = "preroll video flag is %s, midroll video flag is %s and isTablet is %s"
            com.spotify.base.java.logging.Logger.a(r7, r6)
            boolean r6 = r2.a()
            if (r6 == 0) goto L_0x00e6
            if (r3 != 0) goto L_0x00e6
            r3 = 1
            goto L_0x00e7
        L_0x00e6:
            r3 = 0
        L_0x00e7:
            fpt r6 = r0.b
            if (r6 == 0) goto L_0x00f3
            iep r6 = r0.l
            boolean r6 = r6.c
            if (r6 == 0) goto L_0x00f3
            r6 = 1
            goto L_0x00f4
        L_0x00f3:
            r6 = 0
        L_0x00f4:
            fpt r7 = r0.b
            if (r7 == 0) goto L_0x00ff
            boolean r7 = defpackage.ife.a(r7)
            if (r7 == 0) goto L_0x00ff
            r4 = 1
        L_0x00ff:
            if (r3 != 0) goto L_0x011f
            if (r6 != 0) goto L_0x011f
            if (r4 == 0) goto L_0x0106
            goto L_0x011f
        L_0x0106:
            hxc r1 = r0.f
            r2 = 0
            if (r1 == 0) goto L_0x010d
            r0.f = r2
        L_0x010d:
            hmq r1 = r0.c
            if (r1 == 0) goto L_0x0116
            r1.a()
            r0.c = r2
        L_0x0116:
            ied r1 = r0.p
            io.reactivex.disposables.CompositeDisposable r1 = r1.a
            r1.c()
            goto L_0x01ad
        L_0x011f:
            hxc r3 = r0.f
            if (r3 != 0) goto L_0x0138
            hvz r3 = r0.q
            hvy r7 = new hvy
            wlc<com.spotify.mobile.android.spotlets.ads.rules.AdRules> r3 = r3.a
            java.lang.Object r3 = r3.get()
            java.lang.Object r3 = defpackage.hvz.a(r3, r1)
            com.spotify.mobile.android.spotlets.ads.rules.AdRules r3 = (com.spotify.mobile.android.spotlets.ads.rules.AdRules) r3
            r7.<init>(r3)
            r0.f = r7
        L_0x0138:
            hmq r3 = r0.c
            if (r3 != 0) goto L_0x01a8
            hxc r3 = r0.f
            hmr r7 = r0.r
            hmq r15 = new hmq
            wlc<idw> r9 = r7.a
            java.lang.Object r9 = r9.get()
            java.lang.Object r1 = defpackage.hmr.a(r9, r1)
            r10 = r1
            idw r10 = (defpackage.idw) r10
            wlc<ifi> r1 = r7.b
            java.lang.Object r1 = r1.get()
            java.lang.Object r1 = defpackage.hmr.a(r1, r8)
            r11 = r1
            ifi r11 = (defpackage.ifi) r11
            wlc<ieb> r1 = r7.c
            java.lang.Object r1 = r1.get()
            java.lang.Object r1 = defpackage.hmr.a(r1, r5)
            r12 = r1
            ieb r12 = (defpackage.ieb) r12
            wlc<idz> r1 = r7.d
            java.lang.Object r1 = r1.get()
            r5 = 4
            java.lang.Object r1 = defpackage.hmr.a(r1, r5)
            r13 = r1
            idz r13 = (defpackage.idz) r13
            wlc<ids> r1 = r7.e
            java.lang.Object r1 = r1.get()
            r5 = 5
            java.lang.Object r1 = defpackage.hmr.a(r1, r5)
            r14 = r1
            ids r14 = (defpackage.ids) r14
            wlc<io.reactivex.Scheduler> r1 = r7.f
            java.lang.Object r1 = r1.get()
            r5 = 6
            java.lang.Object r1 = defpackage.hmr.a(r1, r5)
            io.reactivex.Scheduler r1 = (io.reactivex.Scheduler) r1
            r5 = 7
            java.lang.Object r3 = defpackage.hmr.a(r3, r5)
            r16 = r3
            hxc r16 = (defpackage.hxc) r16
            r9 = r15
            r3 = r15
            r15 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0.c = r3
            hmq r1 = r0.c
            r1.a(r2, r6, r4)
        L_0x01a8:
            ied r1 = r0.p
            r1.a()
        L_0x01ad:
            fpt r1 = r0.b
            if (r1 == 0) goto L_0x01d7
            io.reactivex.disposables.Disposable r1 = r0.i
            if (r1 == 0) goto L_0x01ba
            io.reactivex.disposables.CompositeDisposable r2 = r0.g
            r2.b(r1)
        L_0x01ba:
            ihe r1 = r0.w
            android.content.Context r2 = r0.a
            fpt r3 = r0.b
            io.reactivex.Observable r1 = r1.a(r2, r3)
            ifp r2 = new ifp
            r2.<init>()
            r1.subscribe(r2)
            io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
            r0.i = r2
            io.reactivex.disposables.CompositeDisposable r1 = r0.g
            io.reactivex.disposables.Disposable r2 = r0.i
            r1.a(r2)
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgc.e():void");
    }

    public final synchronized void ag_() {
        super.ag_();
        this.x.a();
        fay.a(this.b);
        igz igz = this.k;
        Observable<AdSlotEvent> observable = this.t.a;
        igw igw = igz.a;
        if (igw.b == null || igw.b.b()) {
            DisposableObserver<AdSlotEvent> disposableObserver = igw.d;
            observable.subscribe(disposableObserver);
            igw.b = disposableObserver;
        }
        this.s.a();
        e();
        if (this.b != null && ihe.a(this.b) && this.j == null) {
            this.j = Observable.a((ObservableSource<? extends T1>) this.s.a.a((Predicate<? super T>) $$Lambda$jgc$miBgrpqwlZFjQXNWG_4IgisAGg.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$y09uTlzqWf9z13tnhMZHRgtj_A.INSTANCE).a(Functions.a()).a((Predicate<? super T>) $$Lambda$bF7rKGt4ChLMOWMUPnfp2UE2lWc.INSTANCE), (ObservableSource<? extends T2>) this.u.j().a((Predicate<? super T>) $$Lambda$jgc$6fJo_uYdEn_vKLsN86DPHAepzQ.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$jgc$w9zUkV7Z5nJug808_APUtye9W_8.INSTANCE).a(Functions.a()), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$CgSLBMnEDdvaqQcFesGYXhtooVs.INSTANCE).b(Schedulers.a()).a((Consumer<? super T>) new $$Lambda$jgc$OrmWbqAxOeW_VKV4bGeErZOTobo<Object>(this), (Consumer<? super Throwable>) $$Lambda$jgc$hjJsBVKNCwAVN_OdeU93p_bKVZo.INSTANCE);
            this.g.a(this.j);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(AdSlotEvent adSlotEvent) {
        return adSlotEvent.getFormat() == Format.AUDIO;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(PlayerState playerState) {
        return playerState.isPlaying() && playerState.track() != null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        if (hoVar.a == null || hoVar.b == null || !((Ad) hoVar.a).uri().equals(hoVar.b)) {
            VoiceAdService.a(this.a);
        } else {
            VoiceAdService.a(this.a, (Ad) hoVar.a);
        }
    }

    public final synchronized void ah_() {
        f();
        super.ah_();
    }

    public final void d() {
        super.d();
        Logger.b("[AdSession] - onDestroy", new Object[0]);
        f();
        this.g.c();
        this.i = null;
        this.j = null;
    }

    private void f() {
        this.b = null;
        e();
        this.x.c.c();
        VoiceAdService.a(this.a);
        this.n.a();
        this.s.b();
        this.k.a();
    }
}
