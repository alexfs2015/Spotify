package com.spotify.music;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.core.os.CpuFeatures;
import com.spotify.localization.SpotifyLocale;
import com.spotify.loginflow.LoginActivity;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.service.feature.FeatureService;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.view.MainLayout;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar.SnackAnimation;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar.c;
import com.spotify.mobile.android.ui.view.snackbar.SnackItem;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.placebobanner.BannerEvent.Type;
import com.spotify.music.features.placebobanner.models.BannerConfiguration;
import com.spotify.music.features.placebobanner.models.PlaceboBannerControl;
import com.spotify.music.features.placebobanner.models.PlaceboBannerView;
import com.spotify.music.internal.crashes.report.CrashReport.Lifecycle;
import com.spotify.music.libs.connect.access.ConnectAccessViewModel;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import com.spotify.music.navigation.NavigationManager;
import com.spotify.music.navigation.NavigationManager.BackNavigationInteractionType;
import com.spotify.music.navigation.NavigationManager.a;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends lbm implements fyp, a, lbr, uuk {
    public rup A;
    public ToastieManager B;
    public svy C;
    public fpo D;
    public kpm E;
    public kou F;
    public kow G;
    public jsz H;
    public NavigationManager I;
    public szf J;
    public szn K;
    public CompletableSubject L;
    public sxo M;
    public glh<Intent> N;
    public int O;
    public boolean P;
    public ConnectAccessViewModel Q;
    public swi R;
    public ogr S;
    private Uri X;
    private final List<Intent> Y = Lists.a();
    /* access modifiers changed from: private */
    public final Handler Z = new Handler();
    private final CompositeDisposable aa = new CompositeDisposable();
    private final BehaviorSubject<swt> ab = BehaviorSubject.a();
    private lbp ac;
    private Fragment ad;
    /* access modifiers changed from: private */
    public fqn ae;
    private SessionState af;
    private b<swv, swt> ag;
    private rmf ah;
    private rva ai;
    /* access modifiers changed from: private */
    public kor aj;
    /* access modifiers changed from: private */
    public koq ak;
    private ogw al;
    /* access modifiers changed from: private */
    public kpf am;
    private iaj an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private lbq ar;
    private final lbq as = new lbq() {
        public final void onCurrentFragmentChanged(Fragment fragment, String str) {
            MainActivity.this.am.a(MainActivity.this.J.b());
            boolean z = true;
            boolean z2 = MainActivity.this.K.e() && !rta.w.equals(a.a((Bundle) fbp.a(fragment.i))) && !((fragment instanceof szs) && ((szs) fragment).ai());
            boolean z3 = (fragment instanceof jmx) && MainActivity.this.ae != null && !MainActivity.this.q.a(MainActivity.this.ae);
            kpf a2 = MainActivity.this.am;
            if (!z2 && !z3) {
                z = false;
            }
            a2.a.b(z);
            MainActivity.this.ao_();
            MainActivity mainActivity = MainActivity.this;
            ((InputMethodManager) mainActivity.getSystemService("input_method")).hideSoftInputFromWindow(mainActivity.getWindow().getDecorView().getWindowToken(), 0);
            MainActivity.this.ak;
            MainActivity.this.Z.post(MainActivity.this.aj);
            MainActivity.a(MainActivity.this, fragment);
            DebugFlag debugFlag = DebugFlag.SHOW_PAGE_INFO;
        }
    };
    public pwp g;
    public pwg h;
    public hzg i;
    public rty j;
    public jqt k;
    public uug l;
    public vax m;
    public jsx n;
    public pwe o;
    public uix p;
    public rqb q;
    public ogx r;
    public oke s;
    public qpe t;
    public swk u;
    public gnb v;
    public rvx w;
    public mip x;
    public rvh y;
    public run z;

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return this.ab;
    }

    private void a(Intent intent) {
        for (uuf uuf : this.l.a) {
            Logger.b("AttributionTracker(%s) is enabled, passing intent through", uuf.a());
            uuf.a(intent);
        }
        for (b a : this.G.a) {
            a.a(intent);
        }
    }

    private void a(Intent intent, fqn fqn, SessionState sessionState) {
        if (c(fqn, sessionState)) {
            b(intent, (fqn) fbp.a(fqn), (SessionState) fbp.a(sessionState));
        } else {
            this.Y.add(intent);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Bundle bundle, Intent intent) {
        intent.setExtrasClassLoader(getClassLoader());
        this.l.a(intent.getData(), ez.c(this));
        gau.a((Context) this);
        if (bundle == null) {
            if ("android.intent.action.MAIN".equals(intent.getAction())) {
                this.v.a(intent);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x016b, code lost:
        if (r1 != null) goto L_0x0170;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(android.os.Bundle r19, defpackage.kpe r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            android.content.Intent r2 = r18.getIntent()
            gnb r3 = r0.v
            com.spotify.music.-$$Lambda$MainActivity$4I__FFNTYmY90rtIRPKyalzNsx8 r4 = new com.spotify.music.-$$Lambda$MainActivity$4I__FFNTYmY90rtIRPKyalzNsx8
            r4.<init>(r1, r2)
            java.lang.String r5 = "dma_onCreatePrelude"
            r3.a(r4, r5)
            r3 = 0
            r0.setVisible(r3)
            gnb r4 = r0.v
            com.spotify.music.-$$Lambda$MainActivity$79mLd6v6bBX3etqpwVosJw7d9cQ r5 = new com.spotify.music.-$$Lambda$MainActivity$79mLd6v6bBX3etqpwVosJw7d9cQ
            r5.<init>()
            java.lang.String r6 = "dma_layout"
            r4.a(r5, r6)
            r4 = 2131427793(0x7f0b01d1, float:1.8477212E38)
            android.view.View r5 = r0.findViewById(r4)
            java.lang.Object r5 = defpackage.fbp.a(r5)
            com.spotify.mobile.android.ui.view.MainLayout r5 = (com.spotify.mobile.android.ui.view.MainLayout) r5
            com.spotify.music.libs.connect.access.ConnectAccessViewModel r6 = r0.Q
            java.lang.Runnable r7 = r6.a(r0)
            boolean r8 = r6.a()
            if (r8 == 0) goto L_0x0041
            r7.run()
            goto L_0x0046
        L_0x0041:
            java.util.Set<java.lang.Runnable> r8 = r6.c
            r8.add(r7)
        L_0x0046:
            kk r7 = r18.i()
            r6.d = r7
            com.spotify.music.libs.connect.access.ConnectAccessViewModel r6 = r0.Q
            r5.a(r6)
            boolean r6 = r0.P
            if (r6 == 0) goto L_0x005c
            com.spotify.mobile.android.ui.view.MainLayout$a r6 = new com.spotify.mobile.android.ui.view.MainLayout$a
            r6.<init>(r5, r3)
            r5.e = r6
        L_0x005c:
            kpm r6 = r0.E
            java.util.Set<sxs$c> r6 = r6.a
            java.util.Iterator r6 = r6.iterator()
        L_0x0064:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0074
            java.lang.Object r7 = r6.next()
            sxs$c r7 = (defpackage.sxs.c) r7
            r7.a(r5)
            goto L_0x0064
        L_0x0074:
            gnb r6 = r0.v
            com.spotify.music.-$$Lambda$MainActivity$A0szmjK7LyJa9lD89iusSjGSDrY r7 = new com.spotify.music.-$$Lambda$MainActivity$A0szmjK7LyJa9lD89iusSjGSDrY
            r7.<init>(r5)
            java.lang.String r8 = "dma_Debugdrawer"
            r6.a(r7, r8)
            fpo r6 = r0.D
            r6.a()
            gnb r6 = r0.v
            com.spotify.music.-$$Lambda$MainActivity$Fupj416J21L7iIMTorfE5A814Co r7 = new com.spotify.music.-$$Lambda$MainActivity$Fupj416J21L7iIMTorfE5A814Co
            r7.<init>(r5)
            java.lang.String r8 = "dma_Toolbar"
            r6.a(r7, r8)
            com.spotify.mobile.android.ui.view.snackbar.SnackBar r6 = r5.c
            com.spotify.mobile.android.ui.view.snackbar.SnackBar r5 = r5.b
            gnb r7 = r0.v
            com.spotify.music.-$$Lambda$MainActivity$WWyz99ggSJV6peQ0v5pD04dNVfE r8 = new com.spotify.music.-$$Lambda$MainActivity$WWyz99ggSJV6peQ0v5pD04dNVfE
            r8.<init>(r6)
            java.lang.String r9 = "dma_BottomSnackbar"
            r7.a(r8, r9)
            gnb r7 = r0.v
            com.spotify.music.-$$Lambda$MainActivity$xsSk_wa4F3re-4iLoVZxgvZykl4 r8 = new com.spotify.music.-$$Lambda$MainActivity$xsSk_wa4F3re-4iLoVZxgvZykl4
            r8.<init>(r5)
            java.lang.String r5 = "dma_TopSnackbar"
            r7.a(r8, r5)
            rva r5 = new rva
            com.spotify.music.navigation.NavigationManager r7 = r0.I
            r5.<init>(r7)
            r0.ai = r5
            run r5 = r0.z
            rva r7 = r0.ai
            r5.a(r7)
            if (r1 == 0) goto L_0x0161
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r7 = "onCreate, restoring state"
            com.spotify.base.java.logging.Logger.b(r7, r5)
            java.lang.ClassLoader r5 = r18.getClassLoader()
            r1.setClassLoader(r5)
            kk r5 = r18.i()
            java.lang.String r7 = "tag_bottom_tab_nav_fragment"
            androidx.fragment.app.Fragment r5 = r5.a(r7)
            r0.ad = r5
            koq r5 = r0.ak
            q r7 = r5.a
            kk r7 = r7.i()
            java.lang.String r8 = "tag_view_debug_toolbar_fragment_stub"
            androidx.fragment.app.Fragment r7 = r7.a(r8)
            jgf r7 = (defpackage.jgf) r7
            r5.b = r7
            com.spotify.music.navigation.NavigationManager r5 = r0.I
            java.lang.String r7 = "navigation_state"
            android.os.Bundle r7 = r1.getBundle(r7)
            java.lang.Object r7 = defpackage.fbp.a(r7)
            android.os.Bundle r7 = (android.os.Bundle) r7
            android.content.Context r8 = r5.d
            java.lang.ClassLoader r8 = r8.getClassLoader()
            r5.d()
            java.lang.String r9 = "active"
            android.os.Parcelable r9 = r7.getParcelable(r9)
            if (r9 == 0) goto L_0x0123
            android.os.Bundle r9 = (android.os.Bundle) r9
            kk r10 = r5.a
            java.lang.String r11 = "fragment"
            androidx.fragment.app.Fragment r10 = r10.a(r9, r11)
            r5.e = r10
            androidx.fragment.app.Fragment r10 = r5.e
            if (r10 == 0) goto L_0x0120
            com.spotify.music.navigation.NavigationManager$a r9 = com.spotify.music.navigation.NavigationManager.a.b(r9)
            r5.f = r9
        L_0x0120:
            r5.c()
        L_0x0123:
            java.lang.String r9 = "entries"
            android.os.Parcelable[] r7 = r7.getParcelableArray(r9)
            java.lang.Object r7 = defpackage.fbp.a(r7)
            android.os.Parcelable[] r7 = (android.os.Parcelable[]) r7
            int r9 = r7.length
            r10 = 0
        L_0x0131:
            if (r10 >= r9) goto L_0x0154
            r11 = r7[r10]
            android.os.Bundle r11 = (android.os.Bundle) r11
            r11.setClassLoader(r8)
            java.lang.String r12 = "fragment_snapshot"
            android.os.Parcelable r12 = r11.getParcelable(r12)
            jlm r12 = defpackage.jlm.a(r8, r12)
            com.spotify.music.navigation.NavigationManager$a r11 = com.spotify.music.navigation.NavigationManager.a.b(r11)
            java.util.Deque<ho<jlm, com.spotify.music.navigation.NavigationManager$a>> r13 = r5.c
            ho r11 = defpackage.ho.a(r12, r11)
            r13.push(r11)
            int r10 = r10 + 1
            goto L_0x0131
        L_0x0154:
            r5.f()
            java.lang.String r5 = "last_referrer"
            android.os.Parcelable r5 = r1.getParcelable(r5)
            android.net.Uri r5 = (android.net.Uri) r5
            r0.X = r5
        L_0x0161:
            if (r1 == 0) goto L_0x016e
            java.lang.String r5 = "state_model"
            android.os.Parcelable r1 = r1.getParcelable(r5)
            swv r1 = (defpackage.swv) r1
            if (r1 == 0) goto L_0x016e
            goto L_0x0170
        L_0x016e:
            swv r1 = defpackage.swv.d
        L_0x0170:
            fqn r10 = r1.b()
            r0.ae = r10
            com.spotify.mobile.android.service.session.SessionState r5 = r1.a()
            r0.af = r5
            boolean r5 = r1.c()
            r0.ao = r5
            svy r11 = r0.C
            com.spotify.music.-$$Lambda$alJKj3ftxriA66fssoEGtNG83Ks r12 = new com.spotify.music.-$$Lambda$alJKj3ftxriA66fssoEGtNG83Ks
            r12.<init>()
            com.spotify.music.-$$Lambda$8Srdtfepl7Zc6uwoi7Ox1nYnDk4 r13 = new com.spotify.music.-$$Lambda$8Srdtfepl7Zc6uwoi7Ox1nYnDk4
            r13.<init>()
            com.spotify.music.-$$Lambda$Zk_1_bk00Sakna6Ukfu-ZSnMV6U r14 = new com.spotify.music.-$$Lambda$Zk_1_bk00Sakna6Ukfu-ZSnMV6U
            r14.<init>()
            com.spotify.music.-$$Lambda$kmyC7WLn_MCIm4kd_GLWehtHzyI r15 = new com.spotify.music.-$$Lambda$kmyC7WLn_MCIm4kd_GLWehtHzyI
            r15.<init>()
            com.spotify.music.-$$Lambda$KY2IfhQLtrj1fySdmUDuJvbPRdA r5 = new com.spotify.music.-$$Lambda$KY2IfhQLtrj1fySdmUDuJvbPRdA
            r5.<init>()
            com.spotify.music.-$$Lambda$MainActivity$ubiDAjlw9evHWti4eUP8oYPKwmY r7 = new com.spotify.music.-$$Lambda$MainActivity$ubiDAjlw9evHWti4eUP8oYPKwmY
            r7.<init>()
            r16 = r5
            r17 = r7
            knd$c r5 = r11.a(r12, r13, r14, r15, r16, r17)
            knd$b r1 = defpackage.knk.a(r5, r1)
            r0.ag = r1
            knd$b<swv, swt> r1 = r0.ag
            com.spotify.music.-$$Lambda$MainActivity$0qt8EZP6MBN5YvBcKtdnXHK2-Uo r5 = new com.spotify.music.-$$Lambda$MainActivity$0qt8EZP6MBN5YvBcKtdnXHK2-Uo
            r5.<init>()
            kmm r5 = defpackage.koi.a(r5)
            r1.a(r5)
            kor r1 = new kor
            r1.<init>(r0, r0, r10)
            r0.aj = r1
            vax r1 = r0.m
            com.spotify.music.-$$Lambda$MainActivity$8YdlvU2fwFMQBY7DJ646tUn2XVc r5 = new com.spotify.music.-$$Lambda$MainActivity$8YdlvU2fwFMQBY7DJ646tUn2XVc
            r5.<init>()
            r1.a(r5, r0)
            com.spotify.music.navigation.NavigationManager r1 = r0.I
            kpf r5 = r0.am
            java.util.Set<szq> r7 = r1.b
            r7.add(r5)
            r1.a(r5)
            lbq r1 = r0.as
            r0.a(r1)
            kpf r1 = r0.am
            r1.c()
            java.lang.String r1 = "just_logged_in"
            boolean r5 = r2.getBooleanExtra(r1, r3)
            if (r5 == 0) goto L_0x01f0
            r2.putExtra(r1, r3)
        L_0x01f0:
            r20.getClass()
            com.spotify.music.-$$Lambda$jVhqzjHppw-b3T5QqV8RN116i3k r1 = new com.spotify.music.-$$Lambda$jVhqzjHppw-b3T5QqV8RN116i3k
            r2 = r20
            r1.<init>()
            r0.ar = r1
            lbq r1 = r0.ar
            r0.a(r1)
            iaq r1 = new iaq
            jsx r2 = r0.n
            r1.<init>(r2)
            iaj r2 = new iaj
            r2.<init>(r1)
            r0.an = r2
            swk r2 = r0.u
            igt r3 = r2.a
            igs r5 = new igs
            r7 = 1
            java.lang.Object r7 = defpackage.igt.a(r0, r7)
            r8 = r7
            kf r8 = (defpackage.kf) r8
            r7 = 2
            java.lang.Object r7 = defpackage.igt.a(r0, r7)
            r9 = r7
            lbr r9 = (defpackage.lbr) r9
            r7 = 4
            java.lang.Object r1 = defpackage.igt.a(r1, r7)
            r11 = r1
            iba r11 = (defpackage.iba) r11
            wzi<ihc> r1 = r3.a
            java.lang.Object r1 = r1.get()
            r7 = 5
            java.lang.Object r1 = defpackage.igt.a(r1, r7)
            r12 = r1
            ihc r12 = (defpackage.ihc) r12
            wzi<ihf> r1 = r3.b
            java.lang.Object r1 = r1.get()
            r7 = 6
            java.lang.Object r1 = defpackage.igt.a(r1, r7)
            r13 = r1
            ihf r13 = (defpackage.ihf) r13
            wzi<tmu> r1 = r3.c
            java.lang.Object r1 = r1.get()
            r7 = 7
            java.lang.Object r1 = defpackage.igt.a(r1, r7)
            r14 = r1
            tmu r14 = (defpackage.tmu) r14
            wzi<ibn> r1 = r3.d
            java.lang.Object r1 = r1.get()
            r3 = 8
            java.lang.Object r1 = defpackage.igt.a(r1, r3)
            r15 = r1
            ibn r15 = (defpackage.ibn) r15
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r2.b = r5
            igs r1 = r2.b
            ihe r1 = r1.a
            r2.c = r1
            pwg r1 = r0.h
            kk r2 = r18.i()
            android.view.View r3 = r0.findViewById(r4)
            r4 = 2131430259(0x7f0b0b73, float:1.8482214E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            android.content.res.Resources r5 = r18.getResources()
            r7 = 2131165347(0x7f0700a3, float:1.7944909E38)
            float r5 = r5.getDimension(r7)
            int r5 = (int) r5
            r1.b = r2
            r1.c = r3
            r1.d = r4
            r1.e = r5
            r1.f = r6
            pwg r1 = r0.h
            kk r2 = r18.i()
            r3 = 2131430258(0x7f0b0b72, float:1.8482212E38)
            android.view.View r3 = r0.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r1.a(r2, r3)
            pwg r1 = r0.h
            jsx r2 = r0.n
            pxc r2 = r2.f
            r1.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.MainActivity.a(android.os.Bundle, kpe):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MainLayout mainLayout) {
        kpf kpf = new kpf(this, mainLayout, this.J, this.K, new fbu() {
            public final Object get() {
                return Boolean.valueOf(MainActivity.this.o());
            }
        });
        this.am = kpf;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SnackBar snackBar) {
        snackBar.a(SnackAnimation.TOP_TO_BOTTOM);
        jsx jsx = this.n;
        jsx.c = new ohd(snackBar);
        snackBar.a((SnackItem) jsx.c);
        jsx.h = new qpd(snackBar);
        snackBar.a((SnackItem) jsx.h);
        jsx.d = new jtb(snackBar);
        snackBar.a((SnackItem) jsx.d);
        jsx.e = new jtc(snackBar);
        snackBar.a((SnackItem) jsx.e);
        jsx.f = new pxc(snackBar);
        snackBar.a((SnackItem) jsx.f);
        jsx.g = new iak(snackBar, jsx.b);
        snackBar.a((SnackItem) jsx.g);
        ocq ocq = jsx.a;
        ocq.b = new kfk(snackBar, "Waze");
        snackBar.a((SnackItem) ocq.b);
        ocq.a = new kpw(snackBar);
        snackBar.a((SnackItem) ocq.a);
        ocq.c = new ocp(snackBar, R.layout.layout_starttrip_banner);
        snackBar.a((SnackItem) ocq.c);
        ogx ogx = this.r;
        ogw ogw = new ogw((Context) ogx.a(ogx.a.get(), 1), (jty) ogx.a(ogx.b.get(), 2), (ogy) ogx.a(ogx.c.get(), 3), (hgz) ogx.a(ogx.d.get(), 4), (hxx) ogx.a(ogx.e.get(), 5), (ohd) ogx.a(this.n.c, 6));
        this.al = ogw;
        snackBar.a((c) this.t);
        snackBar.a((c) this.g);
        snackBar.bringToFront();
    }

    static /* synthetic */ void a(MainActivity mainActivity, Fragment fragment) {
        NavigationGroup navigationGroup = NavigationGroup.NONE;
        if (fragment instanceof NavigationItem) {
            navigationGroup = ((NavigationItem) fragment).ah();
        }
        Logger.b("broadcasting nav group %s", navigationGroup);
        mip mip = mainActivity.x;
        Intent intent = new Intent();
        intent.setAction("ACTION_LATEST_NAVIGATION").putExtra("navigation_group", navigationGroup);
        mip.a(intent);
    }

    /* access modifiers changed from: private */
    public void a(boolean z2) {
        Object[] objArr = new Object[1];
        objArr[0] = z2 ? "onLoggedInSessionEnded" : "goToLogin";
        Logger.b("MainActivityLifecycle %s", objArr);
        Intent intent = getIntent();
        if (z2) {
            intent = kpo.a(this).a;
        }
        this.A.d = Lifecycle.authentication;
        startActivity(LoginActivity.a((Context) this, intent));
    }

    private void b(Intent intent) {
        a(intent);
        a(intent, this.ae, this.af);
    }

    private void b(Intent intent, fqn fqn, SessionState sessionState) {
        Logger.b("handleIntent: %s", intent);
        intent.setExtrasClassLoader(getClassLoader());
        setIntent(intent);
        if ("com.facebook.application.174829003346".equals(intent.getAction())) {
            intent.setAction("android.intent.action.VIEW");
        }
        c(intent, fqn, sessionState);
        this.n.a(intent);
        for (a a : this.F.a) {
            a.a(intent);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(MainLayout mainLayout) {
        this.ak = new koq(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(SnackBar snackBar) {
        jsz jsz = this.H;
        jsz.a = new jta(snackBar, R.id.offlineView, jsz.c, "Offline bar");
        snackBar.a((SnackItem) jsz.a);
        jsz.b = new jta(snackBar, R.id.player_preview, jsz.c, "Player preview bar");
        snackBar.a((SnackItem) jsz.b);
        jsz jsz2 = this.H;
        Fragment a = jsz2.c.a(jsz2.b.e());
        if (a != null) {
            if (a instanceof iwn) {
                ((iwn) a).ai = jsz2.b;
            } else {
                jsz2.b.a(true);
            }
        }
        jrb jrb = (jrb) jsz2.c.a(jsz2.a.e());
        if (jrb != null) {
            jrb.T = jsz2.a;
        }
        snackBar.bringToFront();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(fqn fqn) {
        jsz jsz = this.H;
        jrb jrb = new jrb();
        jsz.a.a((Fragment) jrb);
        jrb.T = jsz.a;
        if (((Boolean) fqn.a(oei.a)).booleanValue() || ((Boolean) fqn.a(oei.b)).booleanValue() || ((Boolean) fqn.a(oei.c)).booleanValue() || ((Boolean) fqn.a(oei.d)).booleanValue() || fqn.a(oei.e) == RolloutFlag.ENABLED) {
            odl a = odl.a(fqn);
            jsz.b.a((Fragment) a);
            a.T = (jtd) fbp.a(jsz.b);
            return;
        }
        iwn a2 = iwn.a(fqn);
        jsz.b.a((Fragment) a2);
        a2.ai = jsz.b;
    }

    private void b(fqn fqn, SessionState sessionState) {
        if (c(fqn, sessionState)) {
            for (Intent b : this.Y) {
                b(b, (fqn) fbp.a(fqn), (SessionState) fbp.a(sessionState));
            }
            this.Y.clear();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Intent intent) {
        b((Intent) fbp.a(intent));
    }

    private void c(Intent intent, fqn fqn, SessionState sessionState) {
        if (!this.N.a(intent)) {
            this.M.a(intent, fqn, sessionState, this.ao);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(fqn fqn) {
        jqw a = jqw.a(fqn);
        this.ad = a;
        i().a().b(R.id.navigation_bar, a, "tag_bottom_tab_nav_fragment").b();
    }

    private boolean c(fqn fqn, SessionState sessionState) {
        boolean z2 = true;
        boolean z3 = this.aq && !o() && fqn != null && sessionState != null;
        if (!z3) {
            Object[] objArr = new Object[4];
            objArr[0] = Boolean.valueOf(this.aq);
            objArr[1] = Boolean.valueOf(o());
            objArr[2] = Boolean.valueOf(fqn != null);
            if (sessionState == null) {
                z2 = false;
            }
            objArr[3] = Boolean.valueOf(z2);
            Logger.b("Can't handle Intent right now, mResumed=%b, isFragmentManipulationForbidden=%b, flags loaded=%b, session loaded=%b.", objArr);
        }
        return z3;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(fqn fqn) {
        this.k.a(fqn);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(fqn fqn, SessionState sessionState) {
        this.v.a((Runnable) new Runnable(fqn) {
            private final /* synthetic */ fqn f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MainActivity.this.d(this.f$1);
            }
        }, "dma_registerDialogs");
        this.v.a((Runnable) new Runnable(fqn) {
            private final /* synthetic */ fqn f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MainActivity.this.c(this.f$1);
            }
        }, "dma_BottomNavFragment");
        this.v.a((Runnable) new Runnable(fqn) {
            private final /* synthetic */ fqn f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MainActivity.this.b(this.f$1);
            }
        }, "dma_BottomSnackBarloadPlayer");
        this.v.a((Runnable) new Runnable(getIntent()) {
            private final /* synthetic */ Intent f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MainActivity.this.c(this.f$1);
            }
        }, "dma_HandleIntent");
        b(fqn, sessionState);
        setVisible(true);
        ao_();
        this.ao = true;
    }

    /* access modifiers changed from: private */
    public void q() {
        oke oke = this.s;
        oke.b = this.n.d;
        oke.b.a((a) new a() {
            public final void a() {
                BannerConfiguration bannerConfiguration = oke.this.a;
                if (bannerConfiguration == null || bannerConfiguration.configurationId() == null) {
                    Logger.b("banner cta clicked  but no banner configuration found", new Object[0]);
                    return;
                }
                String configurationId = bannerConfiguration.configurationId();
                if (!TextUtils.isEmpty(configurationId)) {
                    oke.a(oke.this, configurationId, Type.a);
                }
                oke.this.a();
                List placeboBannerViews = bannerConfiguration.placeboBannerViews();
                if (placeboBannerViews != null && !placeboBannerViews.isEmpty()) {
                    List controls = ((PlaceboBannerView) placeboBannerViews.get(0)).controls();
                    if (controls != null && !controls.isEmpty()) {
                        String url = ((PlaceboBannerControl) controls.get(0)).url();
                        if (!TextUtils.isEmpty(url)) {
                            oke.a(oke.this, url);
                        }
                        oke.this.e = null;
                    }
                }
            }

            public final void b() {
                BannerConfiguration bannerConfiguration = oke.this.a;
                if (bannerConfiguration == null || bannerConfiguration.configurationId() == null) {
                    Logger.b("banner close clicked but no banner configuration found", new Object[0]);
                    return;
                }
                String configurationId = bannerConfiguration.configurationId();
                if (!TextUtils.isEmpty(configurationId)) {
                    oke.a(oke.this, configurationId, Type.d);
                }
                oke.this.a();
                oke.this.e = null;
            }
        });
        oke oke2 = this.s;
        oke2.c = this.n.e;
        oke2.c.a((a) new a() {
            public final void a() {
                BannerConfiguration bannerConfiguration = oke.this.a;
                if (bannerConfiguration == null || bannerConfiguration.configurationId() == null) {
                    Logger.b("banner cta clicked  but no banner configuration found", new Object[0]);
                    return;
                }
                String configurationId = bannerConfiguration.configurationId();
                if (!TextUtils.isEmpty(configurationId)) {
                    oke.a(oke.this, configurationId, Type.b);
                }
                oke.this.a();
                List placeboBannerViews = bannerConfiguration.placeboBannerViews();
                if (placeboBannerViews != null && !placeboBannerViews.isEmpty()) {
                    List controls = ((PlaceboBannerView) placeboBannerViews.get(0)).controls();
                    if (controls != null && !controls.isEmpty()) {
                        String url = ((PlaceboBannerControl) controls.get(0)).url();
                        if (!TextUtils.isEmpty(url)) {
                            oke.a(oke.this, url);
                        }
                        oke.this.e = null;
                    }
                }
            }

            public final void b() {
                BannerConfiguration bannerConfiguration = oke.this.a;
                if (bannerConfiguration == null || bannerConfiguration.configurationId() == null) {
                    Logger.b("banner cta clicked  but no banner configuration found", new Object[0]);
                    return;
                }
                String configurationId = bannerConfiguration.configurationId();
                if (!TextUtils.isEmpty(configurationId)) {
                    oke.a(oke.this, configurationId, Type.c);
                }
                oke.this.a();
                List placeboBannerViews = bannerConfiguration.placeboBannerViews();
                if (placeboBannerViews != null && !placeboBannerViews.isEmpty()) {
                    List controls = ((PlaceboBannerView) placeboBannerViews.get(0)).controls();
                    if (controls != null && controls.size() >= 2) {
                        String url = ((PlaceboBannerControl) controls.get(1)).url();
                        if (!TextUtils.isEmpty(url)) {
                            oke.a(oke.this, url);
                        }
                        oke.this.e = null;
                    }
                }
            }

            public final void c() {
                BannerConfiguration bannerConfiguration = oke.this.a;
                if (bannerConfiguration == null || bannerConfiguration.configurationId() == null) {
                    Logger.b("banner close clicked but no banner configuration found", new Object[0]);
                    return;
                }
                String configurationId = bannerConfiguration.configurationId();
                if (!TextUtils.isEmpty(configurationId)) {
                    oke.a(oke.this, configurationId, Type.d);
                }
                oke.this.a();
                oke.this.e = null;
            }
        });
        this.s.a((lbr) this);
    }

    /* access modifiers changed from: private */
    public void r() {
        this.y.a.b();
        this.al.a();
    }

    /* access modifiers changed from: private */
    public void s() {
        gnb gnb = this.v;
        pwg pwg = this.h;
        pwg.getClass();
        gnb.a((Runnable) new Runnable() {
            public final void run() {
                pwg.this.a();
            }
        }, "dma_InAppMessaging_onResume");
        this.v.a((Runnable) new Runnable() {
            public final void run() {
                MainActivity.this.v();
            }
        }, "dma_RegisterToastieManager_onResume");
    }

    /* access modifiers changed from: private */
    public void t() {
        if (this.ao) {
            this.L.onComplete();
        }
        b(this.ae, this.af);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Uri u() {
        Fragment a = this.J.a();
        if (!(a instanceof vaz)) {
            return null;
        }
        return ((vaz) a).at_();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v() {
        this.B.a((q) this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w() {
        super.onStart();
        this.ap = true;
        gnb gnb = this.v;
        b<swv, swt> bVar = this.ag;
        bVar.getClass();
        gnb.a((Runnable) new Runnable() {
            public final void run() {
                b.this.c();
            }
        }, "dma_MoebiusLoop");
        this.v.a((Runnable) new Runnable() {
            public final void run() {
                MainActivity.this.r();
            }
        }, "dma_Monitoring");
        this.Z.post(this.aj);
        this.v.a((Runnable) new Runnable() {
            public final void run() {
                MainActivity.this.q();
            }
        }, "dma_Placebo");
        a(this.o.c);
        qpd qpd = this.n.h;
        qpd.a((a) this.t);
        qpe qpe = this.t;
        qpe.a = qpd;
        qpe.e();
        gnb gnb2 = this.v;
        swk swk = this.u;
        swk.getClass();
        gnb2.a((Runnable) new Runnable() {
            public final void run() {
                swk.this.b();
            }
        }, "dma_ScreensaverAd_onResume");
        a((lbq) this.an);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x() {
        setContentView(this.O);
    }

    public final void a(Fragment fragment, String str) {
        this.J.a(fragment, str);
        this.am.a(this.J.b());
    }

    /* access modifiers changed from: 0000 */
    public void a(SessionState sessionState) {
        Logger.b("MainActivityLifecycle onSessionStateChanged", new Object[0]);
        this.af = sessionState;
    }

    /* access modifiers changed from: 0000 */
    public void a(fqn fqn) {
        Logger.b("MainActivityLifecycle onFlagsChanged", new Object[0]);
        this.ae = fqn;
        ConnectAccessViewModel connectAccessViewModel = this.Q;
        fqn fqn2 = this.ae;
        ryr ryr = connectAccessViewModel.b;
        ryu ryu = ryr.b;
        ryr.c = new ryt((Context) ryu.a(ryu.a.get(), 1), (a) ryu.a(ryu.b.get(), 2), (fqn) ryu.a(fqn2, 3));
        kor kor = this.aj;
        kor.a = fqn;
        this.Z.post(kor);
        if (this.q.a(fqn) || uix.a(fqn)) {
            setRequestedOrientation(5);
        }
        this.am.c();
        igs igs = this.u.b;
        igs.d = (fqn) fbp.a(fqn);
        igs.a.a(igs.b, igs.d);
        Fragment fragment = this.ad;
        if (fragment != null && (fragment instanceof FeatureService.c)) {
            ((FeatureService.c) fragment).onFlagsChanged(fqn);
        }
        this.i.a(this.ap, fqn, this);
    }

    /* access modifiers changed from: 0000 */
    public void a(fqn fqn, SessionState sessionState) {
        Logger.b("MainActivityLifecycle onLoggedInSessionStarted", new Object[0]);
        rvx rvx = this.w;
        String currentUser = sessionState.currentUser();
        String b = SpotifyLocale.b(rvx.c);
        SpSharedPreferences b2 = rvx.e.b(rvx.c);
        String a = b2.a(rvx.a, (String) null);
        String a2 = b2.a(rvx.b, (String) null);
        if (!TextUtils.equals(currentUser, a) || !TextUtils.equals(b, a2)) {
            rvx.d.a("preferred-locale", b);
            b2.a().a(rvx.a, currentUser).a(rvx.b, b).b();
        }
        rty rty = this.j;
        jlr jlr = rty.a;
        float f = ((float) rty.c.widthPixels) / rty.c.xdpi;
        float f2 = ((float) rty.c.heightPixels) / rty.c.ydpi;
        jlr jlr2 = jlr;
        f fVar = r4;
        f fVar2 = new f(Build.MODEL, Build.BRAND, Build.MANUFACTURER, Build.DISPLAY, (long) ame.a(), (long) ame.b(), ame.a(rty.b), Math.sqrt((double) ((f * f) + (f2 * f2))), (long) rty.c.widthPixels, (long) rty.c.heightPixels, (long) amf.a(rty.b), CpuFeatures.getCpuFeatures(), (long) CpuFeatures.getCpuFamily());
        jlr2.a(fVar);
        if (!o()) {
            if (!this.ao) {
                Logger.b("tryLoadUiFragments", new Object[0]);
                this.v.a((Runnable) new Runnable(fqn, sessionState) {
                    private final /* synthetic */ fqn f$1;
                    private final /* synthetic */ SessionState f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        MainActivity.this.d(this.f$1, this.f$2);
                    }
                }, "tdma_tryLoadUiFragments");
                this.L.onComplete();
            }
        }
    }

    public final void a(lbp lbp) {
        this.ac = lbp;
    }

    public final void a(lbq lbq) {
        this.I.a(lbq);
    }

    public final void a(a aVar) {
        ((MainLayout) fbp.a(findViewById(R.id.content))).g.add(aVar);
    }

    public final rmf af() {
        return this.ah;
    }

    public final void ao_() {
        kpf kpf = this.am;
        if (kpf != null) {
            kpf.a.a();
        }
    }

    public final ihe ap_() {
        return this.u.b.a;
    }

    public final fyh b() {
        kpf kpf = this.am;
        if (kpf != null) {
            return kpf.a;
        }
        return null;
    }

    public final void b(lbq lbq) {
        this.I.b(lbq);
    }

    public final void b(a aVar) {
        ((MainLayout) fbp.a(findViewById(R.id.content))).g.remove(aVar);
    }

    public final void e() {
        ao_();
    }

    public final void h() {
        super.h();
        this.v.a((Runnable) new Runnable() {
            public final void run() {
                MainActivity.this.t();
            }
        }, "dma_onResumeFragments");
    }

    public void invalidateOptionsMenu() {
        ao_();
    }

    /* access modifiers changed from: 0000 */
    public void k() {
        Logger.b("MainActivityLifecycle onUiVisible", new Object[0]);
        for (c a : this.E.a) {
            a.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void l() {
        Logger.b("MainActivityLifecycle onUiHidden", new Object[0]);
        for (c b : this.E.a) {
            b.b();
        }
    }

    public final Fragment m() {
        return this.J.a();
    }

    public final Uri n() {
        return this.X;
    }

    public void onBackPressed() {
        koq koq = this.ak;
        lbp lbp = this.ac;
        if ((lbp == null || !lbp.onBackPressed()) && this.ap) {
            if (this.K.e()) {
                this.K.a(BackNavigationInteractionType.HW_BACK_BUTTON_PRESSED);
                return;
            }
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        kpe kpe = new kpe(this.aa);
        this.ah = rmf.a((a) kpe);
        setTheme(2132017722);
        long a = gnb.a();
        super.onCreate(bundle);
        this.v.b("dma_onCreateInjection", gnb.a() - a);
        Logger.b("onCreate", new Object[0]);
        this.v.a((Runnable) new Runnable(bundle, kpe) {
            private final /* synthetic */ Bundle f$1;
            private final /* synthetic */ kpe f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                MainActivity.this.a(this.f$1, this.f$2);
            }
        }, "tdma_onCreate");
    }

    public void onDestroy() {
        b(this.ar);
        this.z.b(this.ai);
        this.Z.removeCallbacksAndMessages(null);
        oke oke = this.s;
        oke.b = null;
        oke.c = null;
        oke.e = null;
        this.aa.c();
        this.ag.b();
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.X = this.R.a(this);
        b(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        super.onPause();
        this.aq = false;
        igs igs = this.u.b;
        igs.a.a();
        igs.a.b();
        igs.a.c();
        this.h.b();
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        String b = this.J.b();
        if (!fbo.a(b)) {
            this.am.a(b);
        }
    }

    public void onResume() {
        super.onResume();
        this.aq = true;
        this.v.a((Runnable) new Runnable() {
            public final void run() {
                MainActivity.this.s();
            }
        }, "tdma_onResume");
    }

    public void onSaveInstanceState(Bundle bundle) {
        int i2;
        NavigationManager navigationManager = this.I;
        Bundle bundle2 = new Bundle();
        navigationManager.c();
        if (navigationManager.e == null || navigationManager.f == null) {
            i2 = 0;
        } else {
            Bundle bundle3 = new Bundle();
            navigationManager.a.a(bundle3, "fragment", navigationManager.e);
            navigationManager.f.a(bundle3);
            bundle2.putParcelable("active", bundle3);
            i2 = jup.a(bundle2).length + 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i2 < 262144) {
            for (ho hoVar : navigationManager.c) {
                Bundle bundle4 = new Bundle();
                ho b = ((jlm) fbp.a(hoVar.a)).b();
                i2 += ((Integer) fbp.a(b.b)).intValue();
                if (i2 >= 262144) {
                    break;
                }
                bundle4.putParcelable("fragment_snapshot", (Parcelable) b.a);
                ((a) fbp.a(hoVar.b)).a(bundle4);
                arrayList.add(0, bundle4);
            }
        }
        bundle2.putParcelableArray("entries", (Parcelable[]) arrayList.toArray(new Bundle[0]));
        bundle.putBundle("navigation_state", bundle2);
        bundle.putParcelable("state_model", (Parcelable) this.ag.e());
        bundle.putParcelable("last_referrer", this.X);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        if (!(this.J.a() instanceof qef)) {
            startActivity(kpo.a(this, ViewUris.ag.toString()).a);
        }
        return false;
    }

    public void onStart() {
        this.v.a((Runnable) new Runnable() {
            public final void run() {
                MainActivity.this.w();
            }
        }, "tdma_onStart");
    }

    public void onStop() {
        super.onStop();
        this.ap = false;
        this.ab.onNext(new a());
        this.ag.d();
        igs igs = this.u.b;
        igs.e.g = null;
        ibn ibn = igs.f;
        ibm ibm = igs.c;
        if (ibn.a.b() && ((ibm) ibn.a.c()).equals(ibm)) {
            ibn.a = Optional.e();
        }
        this.i.a(this);
        qpe qpe = this.t;
        qpe.b.c();
        qpe.c = null;
        qpe.a = null;
        oke oke = this.s;
        Logger.b("onStop", new Object[0]);
        oke.d.c();
        this.s.b((lbr) this);
        b(this.o.c);
        b((lbq) this.an);
        this.y.a.c();
        this.al.b();
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Fragment a = i().a((int) R.id.player_preview);
        if (a instanceof iwn) {
            iwp iwp = ((iwn) a).aj;
            iwp.p = !iwp.o;
            iwp.o = false;
        }
    }

    public void setTitle(CharSequence charSequence) {
        Assertion.a();
    }
}
