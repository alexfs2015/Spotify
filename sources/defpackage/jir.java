package defpackage;

import android.content.Context;
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

/* renamed from: jir reason: default package */
public final class jir extends jkj {
    private final Context a;
    private fqn b;
    private hph c;
    private hzo f;
    private final CompositeDisposable g = new CompositeDisposable();
    private Disposable h;
    private Disposable i;
    private final ijm j;
    private final ihc k;
    private final AdRules l;
    private final hzm m;
    private final igq n;
    private final hyl o;
    private final hpi p;
    private final igd q;
    private final igf r;
    private final Flowable<PlayerState> s;
    private final ihr t;
    private final ijr u;
    private final ibn v;
    private final ibh w;
    private final Flowable<fqn> x;

    public jir(Context context, ijm ijm, ihc ihc, AdRules adRules, hzm hzm, igq igq, hyl hyl, hpi hpi, igd igd, igf igf, Flowable<PlayerState> flowable, ihr ihr, ijr ijr, ibn ibn, ibh ibh, Flowable<fqn> flowable2) {
        super("AdSessionState");
        this.a = context;
        this.j = ijm;
        this.k = ihc;
        this.l = adRules;
        this.m = hzm;
        this.n = igq;
        this.o = hyl;
        this.p = hpi;
        this.q = igd;
        this.r = igf;
        this.s = flowable;
        this.t = ihr;
        this.u = ijr;
        this.v = ibn;
        this.w = ibh;
        this.x = flowable2;
    }

    /* access modifiers changed from: private */
    public void a(fqn fqn) {
        if (((Boolean) fqn.a(hyn.a)).booleanValue()) {
            this.b = fqn;
            ag_();
        } else {
            ah_();
        }
        ibh ibh = this.w;
        if (fqn != null && ((Boolean) fqn.a(hyn.i)).booleanValue()) {
            ibh.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        if (hoVar.a == null || hoVar.b == null || !((Ad) hoVar.a).uri().equals(hoVar.b)) {
            VoiceAdService.a(this.a);
        } else {
            VoiceAdService.a(this.a, (Ad) hoVar.a);
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
            fqn r3 = r0.b
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "(comscore) handleFlagsChanged : %s"
            com.spotify.base.java.logging.Logger.b(r3, r2)
            ihc r2 = r0.k
            fqn r3 = r0.b
            if (r3 == 0) goto L_0x002d
            fqk r5 = defpackage.hyn.a
            java.io.Serializable r5 = r3.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x002d
            android.content.Context r5 = r2.a
            boolean r5 = defpackage.jvi.c(r5)
            if (r5 != 0) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            r2.c = r5
            if (r3 == 0) goto L_0x003e
            fql<com.spotify.mobile.android.spotlets.ads.screensaver.ScreensaverProgrammaticAdFlag> r5 = defpackage.hyn.c
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
            fql<com.spotify.mobile.android.flags.RolloutFlag> r5 = defpackage.hyn.o
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
            com.spotify.mobile.android.spotlets.ads.rules.AdRules r2 = r0.l
            fqn r3 = r0.b
            if (r3 == 0) goto L_0x006f
            com.spotify.mobile.android.spotlets.ads.rules.AdRules$StateType r5 = com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.MIDROLL_VIDEO_ADS
            fqk r6 = defpackage.hyn.b
            java.io.Serializable r3 = r3.a(r6)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.a(r5, r3)
            goto L_0x0074
        L_0x006f:
            com.spotify.mobile.android.spotlets.ads.rules.AdRules$StateType r3 = com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.MIDROLL_VIDEO_ADS
            r2.a(r3, r4)
        L_0x0074:
            fqn r2 = r0.b
            if (r2 == 0) goto L_0x007a
            r2 = 0
            goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            ihr r3 = r0.t
            r3.a(r2)
            hzm r3 = r0.m
            r3.a = r2
            fqn r2 = r0.b
            if (r2 != 0) goto L_0x0092
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = "[AdSession] - No flags, ads disabled"
            com.spotify.base.java.logging.Logger.a(r3, r2)
            hle r2 = defpackage.hle.a
            goto L_0x00b7
        L_0x0092:
            hle r2 = new hle
            r2.<init>()
            fqn r3 = r0.b
            fqk r5 = defpackage.hyn.f
            java.io.Serializable r3 = r3.a(r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.b = r3
            fqn r3 = r0.b
            fqk r5 = defpackage.hyn.b
            java.io.Serializable r3 = r3.a(r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.c = r3
        L_0x00b7:
            android.content.Context r3 = r0.a
            boolean r3 = defpackage.jvi.c(r3)
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
            fqn r6 = r0.b
            if (r6 == 0) goto L_0x00f3
            ihc r6 = r0.k
            boolean r6 = r6.c
            if (r6 == 0) goto L_0x00f3
            r6 = 1
            goto L_0x00f4
        L_0x00f3:
            r6 = 0
        L_0x00f4:
            fqn r7 = r0.b
            if (r7 == 0) goto L_0x00ff
            boolean r7 = defpackage.ihr.a(r7)
            if (r7 == 0) goto L_0x00ff
            r4 = 1
        L_0x00ff:
            if (r3 != 0) goto L_0x011f
            if (r6 != 0) goto L_0x011f
            if (r4 == 0) goto L_0x0106
            goto L_0x011f
        L_0x0106:
            hzo r1 = r0.f
            r2 = 0
            if (r1 == 0) goto L_0x010d
            r0.f = r2
        L_0x010d:
            hph r1 = r0.c
            if (r1 == 0) goto L_0x0116
            r1.a()
            r0.c = r2
        L_0x0116:
            igq r1 = r0.n
            io.reactivex.disposables.CompositeDisposable r1 = r1.a
            r1.c()
            goto L_0x01ad
        L_0x011f:
            hzo r3 = r0.f
            if (r3 != 0) goto L_0x0138
            hyl r3 = r0.o
            hyk r7 = new hyk
            wzi<com.spotify.mobile.android.spotlets.ads.rules.AdRules> r3 = r3.a
            java.lang.Object r3 = r3.get()
            java.lang.Object r3 = defpackage.hyl.a(r3, r1)
            com.spotify.mobile.android.spotlets.ads.rules.AdRules r3 = (com.spotify.mobile.android.spotlets.ads.rules.AdRules) r3
            r7.<init>(r3)
            r0.f = r7
        L_0x0138:
            hph r3 = r0.c
            if (r3 != 0) goto L_0x01a8
            hzo r3 = r0.f
            hpi r7 = r0.p
            hph r15 = new hph
            wzi<igj> r9 = r7.a
            java.lang.Object r9 = r9.get()
            java.lang.Object r1 = defpackage.hpi.a(r9, r1)
            r10 = r1
            igj r10 = (defpackage.igj) r10
            wzi<ihv> r1 = r7.b
            java.lang.Object r1 = r1.get()
            java.lang.Object r1 = defpackage.hpi.a(r1, r8)
            r11 = r1
            ihv r11 = (defpackage.ihv) r11
            wzi<igo> r1 = r7.c
            java.lang.Object r1 = r1.get()
            java.lang.Object r1 = defpackage.hpi.a(r1, r5)
            r12 = r1
            igo r12 = (defpackage.igo) r12
            wzi<igm> r1 = r7.d
            java.lang.Object r1 = r1.get()
            r5 = 4
            java.lang.Object r1 = defpackage.hpi.a(r1, r5)
            r13 = r1
            igm r13 = (defpackage.igm) r13
            wzi<igf> r1 = r7.e
            java.lang.Object r1 = r1.get()
            r5 = 5
            java.lang.Object r1 = defpackage.hpi.a(r1, r5)
            r14 = r1
            igf r14 = (defpackage.igf) r14
            wzi<io.reactivex.Scheduler> r1 = r7.f
            java.lang.Object r1 = r1.get()
            r5 = 6
            java.lang.Object r1 = defpackage.hpi.a(r1, r5)
            io.reactivex.Scheduler r1 = (io.reactivex.Scheduler) r1
            r5 = 7
            java.lang.Object r3 = defpackage.hpi.a(r3, r5)
            r16 = r3
            hzo r16 = (defpackage.hzo) r16
            r9 = r15
            r3 = r15
            r15 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0.c = r3
            hph r1 = r0.c
            r1.a(r2, r6, r4)
        L_0x01a8:
            igq r1 = r0.n
            r1.a()
        L_0x01ad:
            fqn r1 = r0.b
            if (r1 == 0) goto L_0x01d7
            io.reactivex.disposables.Disposable r1 = r0.h
            if (r1 == 0) goto L_0x01ba
            io.reactivex.disposables.CompositeDisposable r2 = r0.g
            r2.b(r1)
        L_0x01ba:
            ijr r1 = r0.u
            android.content.Context r2 = r0.a
            fqn r3 = r0.b
            io.reactivex.Observable r1 = r1.a(r2, r3)
            iic r2 = new iic
            r2.<init>()
            r1.subscribe(r2)
            io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
            r0.h = r2
            io.reactivex.disposables.CompositeDisposable r1 = r0.g
            io.reactivex.disposables.Disposable r2 = r0.h
            r1.a(r2)
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jir.e():void");
    }

    private void f() {
        this.b = null;
        e();
        this.v.c.c();
        VoiceAdService.a(this.a);
        this.l.a();
        this.q.b();
        this.j.a();
    }

    public final void a() {
        this.g.a(this.x.c((Consumer<? super T>) new $$Lambda$jir$VMC2qeECXdVnnfIl3MBEObMw6xM<Object>(this)));
    }

    public final synchronized void ag_() {
        super.ag_();
        this.v.a();
        fbp.a(this.b);
        ijm ijm = this.j;
        Observable<AdSlotEvent> observable = this.r.a;
        ijj ijj = ijm.a;
        if (ijj.b == null || ijj.b.b()) {
            DisposableObserver<AdSlotEvent> disposableObserver = ijj.d;
            observable.subscribe(disposableObserver);
            ijj.b = disposableObserver;
        }
        this.q.a();
        e();
        if (this.b != null && ijr.a(this.b) && this.i == null) {
            this.i = Observable.a((ObservableSource<? extends T1>) this.q.a.a((Predicate<? super T>) $$Lambda$jir$9B_sYvjXCC2KbK7rrds0VbQYtM.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$y09uTlzqWf9z13tnhMZHRgtj_A.INSTANCE).a(Functions.a()).a((Predicate<? super T>) $$Lambda$bF7rKGt4ChLMOWMUPnfp2UE2lWc.INSTANCE), (ObservableSource<? extends T2>) this.s.j().a((Predicate<? super T>) $$Lambda$jir$9AueDc2Yz15l6FQ_ABzplTxznzw.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$jir$HBQ5_P_PxN7H0kyTkws1u21YCjQ.INSTANCE).a(Functions.a()), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$CgSLBMnEDdvaqQcFesGYXhtooVs.INSTANCE).b(Schedulers.a()).a((Consumer<? super T>) new $$Lambda$jir$nx_q2gfEfzetMbWQf8WQNQDloA<Object>(this), (Consumer<? super Throwable>) $$Lambda$jir$yVDL8lKg5ZPuGyaL6Btjgfnsg.INSTANCE);
            this.g.a(this.i);
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
        this.h = null;
        this.i = null;
    }
}
