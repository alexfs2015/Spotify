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
import com.spotify.mobile.android.service.feature.FeatureService.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.view.MainLayout;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar.SnackAnimation;
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

public class MainActivity extends kyd implements fxv, a, kyi, uiz {
    public rlj A;
    public ToastieManager B;
    public slr C;
    public fou D;
    public kmd E;
    public kll F;
    public kln G;
    public jqo H;
    public NavigationManager I;
    public soy J;
    public spg K;
    public CompletableSubject L;
    public snh M;
    public gjw<Intent> N;
    public int O;
    public boolean P;
    public ConnectAccessViewModel Q;
    public smb R;
    public nzz S;
    private Uri Y;
    private final List<Intent> Z = Lists.a();
    /* access modifiers changed from: private */
    public final Handler aa = new Handler();
    private final CompositeDisposable ab = new CompositeDisposable();
    private final BehaviorSubject<smm> ac = BehaviorSubject.a();
    private kyf ad;
    private Fragment ae;
    /* access modifiers changed from: private */
    public fpt af;
    private SessionState ag;
    private b<smo, smm> ah;
    private rdh ai;
    private rlu aj;
    /* access modifiers changed from: private */
    public kli ak;
    /* access modifiers changed from: private */
    public klh al;
    private oae am;
    /* access modifiers changed from: private */
    public klw an;
    private hxx ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private kyh as;
    private final kyh at = new kyh() {
        public final void onCurrentFragmentChanged(Fragment fragment, String str) {
            MainActivity.this.an.a(MainActivity.this.J.b());
            boolean z = true;
            boolean z2 = MainActivity.this.K.e() && !rju.w.equals(a.a((Bundle) fay.a(fragment.i))) && !((fragment instanceof spl) && ((spl) fragment).ai());
            boolean z3 = (fragment instanceof jkl) && MainActivity.this.af != null && !MainActivity.this.q.a(MainActivity.this.af);
            klw a2 = MainActivity.this.an;
            if (!z2 && !z3) {
                z = false;
            }
            a2.a.b(z);
            MainActivity.this.ap_();
            MainActivity mainActivity = MainActivity.this;
            ((InputMethodManager) mainActivity.getSystemService("input_method")).hideSoftInputFromWindow(mainActivity.getWindow().getDecorView().getWindowToken(), 0);
            MainActivity.this.al;
            MainActivity.this.aa.post(MainActivity.this.ak);
            MainActivity.a(MainActivity.this, fragment);
            DebugFlag debugFlag = DebugFlag.SHOW_PAGE_INFO;
        }
    };
    public pnt g;
    public pnk h;
    public hwu i;
    public rks j;
    public joh k;
    public uiv l;
    public ups m;
    public jqm n;
    public pni o;
    public twu p;
    public rgz q;
    public oaf r;
    public ocy s;
    public qgq t;
    public smd u;
    public glm v;
    public rmr w;
    public ueb x;
    public rmb y;
    public rlh z;

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void a(fpt fpt) {
        Logger.b("MainActivityLifecycle onFlagsChanged", new Object[0]);
        this.af = fpt;
        ConnectAccessViewModel connectAccessViewModel = this.Q;
        fpt fpt2 = this.af;
        rpm rpm = connectAccessViewModel.b;
        rpk rpk = rpm.b;
        rpm.c = new rpj((Context) rpk.a(rpk.a.get(), 1), (a) rpk.a(rpk.b.get(), 2), (fpt) rpk.a(fpt2, 3));
        kli kli = this.ak;
        kli.a = fpt;
        this.aa.post(kli);
        if (this.q.a(fpt) || twu.a(fpt)) {
            setRequestedOrientation(5);
        }
        this.an.c();
        ief ief = this.u.b;
        ief.d = (fpt) fay.a(fpt);
        ief.a.a(ief.b, ief.d);
        Fragment fragment = this.ae;
        if (fragment != null && (fragment instanceof c)) {
            ((c) fragment).onFlagsChanged(fpt);
        }
        this.i.a(this.aq, fpt, this);
    }

    /* access modifiers changed from: 0000 */
    public void a(fpt fpt, SessionState sessionState) {
        Logger.b("MainActivityLifecycle onLoggedInSessionStarted", new Object[0]);
        rmr rmr = this.w;
        String currentUser = sessionState.currentUser();
        String b = SpotifyLocale.b(rmr.c);
        SpSharedPreferences b2 = rmr.e.b(rmr.c);
        String a = b2.a(rmr.a, (String) null);
        String a2 = b2.a(rmr.b, (String) null);
        if (!TextUtils.equals(currentUser, a) || !TextUtils.equals(b, a2)) {
            rmr.d.a("preferred-locale", b);
            b2.a().a(rmr.a, currentUser).a(rmr.b, b).b();
        }
        rks rks = this.j;
        jjf jjf = rks.a;
        float f = ((float) rks.c.widthPixels) / rks.c.xdpi;
        float f2 = ((float) rks.c.heightPixels) / rks.c.ydpi;
        jjf jjf2 = jjf;
        f fVar = r4;
        f fVar2 = new f(Build.MODEL, Build.BRAND, Build.MANUFACTURER, Build.DISPLAY, (long) alq.a(), (long) alq.b(), alq.a(rks.b), Math.sqrt((double) ((f * f) + (f2 * f2))), (long) rks.c.widthPixels, (long) rks.c.heightPixels, (long) alr.a(rks.b), CpuFeatures.getCpuFeatures(), (long) CpuFeatures.getCpuFamily());
        jjf2.a(fVar);
        if (!o()) {
            if (!this.ap) {
                Logger.b("tryLoadUiFragments", new Object[0]);
                this.v.a((Runnable) new Runnable(fpt, sessionState) {
                    private final /* synthetic */ fpt f$1;
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

    /* access modifiers changed from: private */
    public /* synthetic */ void d(fpt fpt) {
        this.k.a(fpt);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(fpt fpt) {
        jqo jqo = this.H;
        jop jop = new jop();
        jqo.a.a((Fragment) jop);
        jop.T = jqo.a;
        if (((Boolean) fpt.a(nxw.a)).booleanValue() || ((Boolean) fpt.a(nxw.b)).booleanValue() || ((Boolean) fpt.a(nxw.c)).booleanValue() || ((Boolean) fpt.a(nxw.d)).booleanValue() || fpt.a(nxw.e) == RolloutFlag.ENABLED) {
            nwy a = nwy.a(fpt);
            jqo.b.a((Fragment) a);
            a.U = (jqs) fay.a(jqo.b);
            return;
        }
        iuc a2 = iuc.a(fpt);
        jqo.b.a((Fragment) a2);
        a2.ai = jqo.b;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Intent intent) {
        b((Intent) fay.a(intent));
    }

    public void onCreate(Bundle bundle) {
        klv klv = new klv(this.ab);
        this.ai = rdh.a((a) klv);
        setTheme(2132017719);
        long a = glm.a();
        super.onCreate(bundle);
        this.v.b("dma_onCreateInjection", glm.a() - a);
        Logger.b("onCreate", new Object[0]);
        this.v.a((Runnable) new Runnable(bundle, klv) {
            private final /* synthetic */ Bundle f$1;
            private final /* synthetic */ klv f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                MainActivity.this.a(this.f$1, this.f$2);
            }
        }, "tdma_onCreate");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x() {
        setContentView(this.O);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return this.ac;
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        String b = this.J.b();
        if (!fax.a(b)) {
            this.an.a(b);
        }
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
            i2 = jsf.a(bundle2).length + 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i2 < 262144) {
            for (ho hoVar : navigationManager.c) {
                Bundle bundle4 = new Bundle();
                ho b = ((jja) fay.a(hoVar.a)).b();
                i2 += ((Integer) fay.a(b.b)).intValue();
                if (i2 >= 262144) {
                    break;
                }
                bundle4.putParcelable("fragment_snapshot", (Parcelable) b.a);
                ((a) fay.a(hoVar.b)).a(bundle4);
                arrayList.add(0, bundle4);
            }
        }
        bundle2.putParcelableArray("entries", (Parcelable[]) arrayList.toArray(new Bundle[0]));
        bundle.putBundle("navigation_state", bundle2);
        bundle.putParcelable("state_model", (Parcelable) this.ah.e());
        bundle.putParcelable("last_referrer", this.Y);
        super.onSaveInstanceState(bundle);
    }

    public void onDestroy() {
        b(this.as);
        this.z.b(this.aj);
        this.aa.removeCallbacksAndMessages(null);
        ocy ocy = this.s;
        ocy.b = null;
        ocy.c = null;
        ocy.e = null;
        this.ab.c();
        this.ah.b();
        super.onDestroy();
    }

    public void onStart() {
        this.v.a((Runnable) new Runnable() {
            public final void run() {
                MainActivity.this.w();
            }
        }, "tdma_onStart");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w() {
        super.onStart();
        this.aq = true;
        glm glm = this.v;
        b<smo, smm> bVar = this.ah;
        bVar.getClass();
        glm.a((Runnable) new Runnable() {
            public final void run() {
                b.this.c();
            }
        }, "dma_MoebiusLoop");
        this.v.a((Runnable) new Runnable() {
            public final void run() {
                MainActivity.this.r();
            }
        }, "dma_Monitoring");
        this.aa.post(this.ak);
        this.v.a((Runnable) new Runnable() {
            public final void run() {
                MainActivity.this.q();
            }
        }, "dma_Placebo");
        a(this.o.c);
        qgp qgp = this.n.h;
        qgp.a((a) this.t);
        qgq qgq = this.t;
        qgq.a = qgp;
        qgq.e();
        glm glm2 = this.v;
        smd smd = this.u;
        smd.getClass();
        glm2.a((Runnable) new Runnable() {
            public final void run() {
                smd.this.b();
            }
        }, "dma_ScreensaverAd_onResume");
        a((kyh) this.ao);
    }

    public void onStop() {
        super.onStop();
        this.aq = false;
        this.ac.onNext(new a());
        this.ah.d();
        ief ief = this.u.b;
        ief.e.g = null;
        hzb hzb = ief.f;
        hza hza = ief.c;
        if (hzb.a.b() && ((hza) hzb.a.c()).equals(hza)) {
            hzb.a = Optional.e();
        }
        this.i.a(this);
        qgq qgq = this.t;
        qgq.b.c();
        qgq.c = null;
        qgq.a = null;
        ocy ocy = this.s;
        Logger.b("onStop", new Object[0]);
        ocy.d.c();
        this.s.b((kyi) this);
        b(this.o.c);
        b((kyh) this.ao);
        this.y.a.c();
        this.am.b();
    }

    /* access modifiers changed from: private */
    public void q() {
        ocy ocy = this.s;
        ocy.b = this.n.d;
        ocy.b.a((a) new a() {
            public final void a() {
                BannerConfiguration bannerConfiguration = ocy.this.a;
                if (bannerConfiguration == null || bannerConfiguration.configurationId() == null) {
                    Logger.b("banner cta clicked  but no banner configuration found", new Object[0]);
                    return;
                }
                String configurationId = bannerConfiguration.configurationId();
                if (!TextUtils.isEmpty(configurationId)) {
                    ocy.a(ocy.this, configurationId, Type.a);
                }
                ocy.this.a();
                List placeboBannerViews = bannerConfiguration.placeboBannerViews();
                if (placeboBannerViews != null && !placeboBannerViews.isEmpty()) {
                    List controls = ((PlaceboBannerView) placeboBannerViews.get(0)).controls();
                    if (controls != null && !controls.isEmpty()) {
                        String url = ((PlaceboBannerControl) controls.get(0)).url();
                        if (!TextUtils.isEmpty(url)) {
                            ocy.a(ocy.this, url);
                        }
                        ocy.this.e = null;
                    }
                }
            }

            public final void b() {
                BannerConfiguration bannerConfiguration = ocy.this.a;
                if (bannerConfiguration == null || bannerConfiguration.configurationId() == null) {
                    Logger.b("banner close clicked but no banner configuration found", new Object[0]);
                    return;
                }
                String configurationId = bannerConfiguration.configurationId();
                if (!TextUtils.isEmpty(configurationId)) {
                    ocy.a(ocy.this, configurationId, Type.d);
                }
                ocy.this.a();
                ocy.this.e = null;
            }
        });
        ocy ocy2 = this.s;
        ocy2.c = this.n.e;
        ocy2.c.a((a) new a() {
            public final void a() {
                BannerConfiguration bannerConfiguration = ocy.this.a;
                if (bannerConfiguration == null || bannerConfiguration.configurationId() == null) {
                    Logger.b("banner cta clicked  but no banner configuration found", new Object[0]);
                    return;
                }
                String configurationId = bannerConfiguration.configurationId();
                if (!TextUtils.isEmpty(configurationId)) {
                    ocy.a(ocy.this, configurationId, Type.b);
                }
                ocy.this.a();
                List placeboBannerViews = bannerConfiguration.placeboBannerViews();
                if (placeboBannerViews != null && !placeboBannerViews.isEmpty()) {
                    List controls = ((PlaceboBannerView) placeboBannerViews.get(0)).controls();
                    if (controls != null && !controls.isEmpty()) {
                        String url = ((PlaceboBannerControl) controls.get(0)).url();
                        if (!TextUtils.isEmpty(url)) {
                            ocy.a(ocy.this, url);
                        }
                        ocy.this.e = null;
                    }
                }
            }

            public final void b() {
                BannerConfiguration bannerConfiguration = ocy.this.a;
                if (bannerConfiguration == null || bannerConfiguration.configurationId() == null) {
                    Logger.b("banner cta clicked  but no banner configuration found", new Object[0]);
                    return;
                }
                String configurationId = bannerConfiguration.configurationId();
                if (!TextUtils.isEmpty(configurationId)) {
                    ocy.a(ocy.this, configurationId, Type.c);
                }
                ocy.this.a();
                List placeboBannerViews = bannerConfiguration.placeboBannerViews();
                if (placeboBannerViews != null && !placeboBannerViews.isEmpty()) {
                    List controls = ((PlaceboBannerView) placeboBannerViews.get(0)).controls();
                    if (controls != null && controls.size() >= 2) {
                        String url = ((PlaceboBannerControl) controls.get(1)).url();
                        if (!TextUtils.isEmpty(url)) {
                            ocy.a(ocy.this, url);
                        }
                        ocy.this.e = null;
                    }
                }
            }

            public final void c() {
                BannerConfiguration bannerConfiguration = ocy.this.a;
                if (bannerConfiguration == null || bannerConfiguration.configurationId() == null) {
                    Logger.b("banner close clicked but no banner configuration found", new Object[0]);
                    return;
                }
                String configurationId = bannerConfiguration.configurationId();
                if (!TextUtils.isEmpty(configurationId)) {
                    ocy.a(ocy.this, configurationId, Type.d);
                }
                ocy.this.a();
                ocy.this.e = null;
            }
        });
        this.s.a((kyi) this);
    }

    /* access modifiers changed from: private */
    public void r() {
        this.y.a.b();
        this.am.a();
    }

    public void onPause() {
        super.onPause();
        this.ar = false;
        ief ief = this.u.b;
        ief.a.a();
        ief.a.b();
        ief.a.c();
        this.h.b();
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Fragment a = i().a((int) R.id.player_preview);
        if (a instanceof iuc) {
            iue iue = ((iuc) a).aj;
            iue.n = !iue.m;
            iue.m = false;
        }
    }

    public void onResume() {
        super.onResume();
        this.ar = true;
        this.v.a((Runnable) new Runnable() {
            public final void run() {
                MainActivity.this.s();
            }
        }, "tdma_onResume");
    }

    /* access modifiers changed from: private */
    public void s() {
        glm glm = this.v;
        pnk pnk = this.h;
        pnk.getClass();
        glm.a((Runnable) new Runnable() {
            public final void run() {
                pnk.this.a();
            }
        }, "dma_InAppMessaging_onResume");
        this.v.a((Runnable) new Runnable() {
            public final void run() {
                MainActivity.this.v();
            }
        }, "dma_RegisterToastieManager_onResume");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v() {
        this.B.a((q) this);
    }

    public final void h() {
        super.h();
        this.v.a((Runnable) new Runnable() {
            public final void run() {
                MainActivity.this.t();
            }
        }, "dma_onResumeFragments");
    }

    /* access modifiers changed from: private */
    public void t() {
        if (this.ap) {
            this.L.onComplete();
        }
        b(this.af, this.ag);
    }

    private void b(fpt fpt, SessionState sessionState) {
        if (c(fpt, sessionState)) {
            for (Intent b : this.Z) {
                b(b, (fpt) fay.a(fpt), (SessionState) fay.a(sessionState));
            }
            this.Z.clear();
        }
    }

    private void a(Intent intent) {
        for (uiu uiu : this.l.a) {
            Logger.b("AttributionTracker(%s) is enabled, passing intent through", uiu.a());
            uiu.a(intent);
        }
        for (b a : this.G.a) {
            a.a(intent);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.Y = this.R.a(this);
        b(intent);
    }

    private void b(Intent intent) {
        a(intent);
        a(intent, this.af, this.ag);
    }

    private void a(Intent intent, fpt fpt, SessionState sessionState) {
        if (c(fpt, sessionState)) {
            b(intent, (fpt) fay.a(fpt), (SessionState) fay.a(sessionState));
        } else {
            this.Z.add(intent);
        }
    }

    private boolean c(fpt fpt, SessionState sessionState) {
        boolean z2 = true;
        boolean z3 = this.ar && !o() && fpt != null && sessionState != null;
        if (!z3) {
            Object[] objArr = new Object[4];
            objArr[0] = Boolean.valueOf(this.ar);
            objArr[1] = Boolean.valueOf(o());
            objArr[2] = Boolean.valueOf(fpt != null);
            if (sessionState == null) {
                z2 = false;
            }
            objArr[3] = Boolean.valueOf(z2);
            Logger.b("Can't handle Intent right now, mResumed=%b, isFragmentManipulationForbidden=%b, flags loaded=%b, session loaded=%b.", objArr);
        }
        return z3;
    }

    private void b(Intent intent, fpt fpt, SessionState sessionState) {
        Logger.b("handleIntent: %s", intent);
        intent.setExtrasClassLoader(getClassLoader());
        setIntent(intent);
        if ("com.facebook.application.174829003346".equals(intent.getAction())) {
            intent.setAction("android.intent.action.VIEW");
        }
        c(intent, fpt, sessionState);
        this.n.a(intent);
        for (a a : this.F.a) {
            a.a(intent);
        }
    }

    private void c(Intent intent, fpt fpt, SessionState sessionState) {
        if (!this.N.a(intent)) {
            this.M.a(intent, fpt, sessionState, this.ap);
        }
    }

    public void onBackPressed() {
        klh klh = this.al;
        kyf kyf = this.ad;
        if ((kyf == null || !kyf.onBackPressed()) && this.aq) {
            if (this.K.e()) {
                this.K.a(BackNavigationInteractionType.HW_BACK_BUTTON_PRESSED);
                return;
            }
            finish();
        }
    }

    public boolean onSearchRequested() {
        if (!(this.J.a() instanceof pvj)) {
            startActivity(kmf.a(this, ViewUris.ah.toString()).a);
        }
        return false;
    }

    public final void ap_() {
        klw klw = this.an;
        if (klw != null) {
            klw.a.a();
        }
    }

    public final void ak_() {
        ap_();
    }

    public void invalidateOptionsMenu() {
        ap_();
    }

    public void setTitle(CharSequence charSequence) {
        Assertion.a();
    }

    public final void a(Fragment fragment, String str) {
        this.J.a(fragment, str);
        this.an.a(this.J.b());
    }

    public final void a(kyh kyh) {
        this.I.a(kyh);
    }

    public final void b(kyh kyh) {
        this.I.b(kyh);
    }

    public final void a(a aVar) {
        ((MainLayout) fay.a(findViewById(R.id.content))).g.add(aVar);
    }

    public final void b(a aVar) {
        ((MainLayout) fay.a(findViewById(R.id.content))).g.remove(aVar);
    }

    public final Fragment m() {
        return this.J.a();
    }

    /* access modifiers changed from: 0000 */
    public void a(SessionState sessionState) {
        Logger.b("MainActivityLifecycle onSessionStateChanged", new Object[0]);
        this.ag = sessionState;
    }

    /* access modifiers changed from: private */
    public void a(boolean z2) {
        Object[] objArr = new Object[1];
        objArr[0] = z2 ? "onLoggedInSessionEnded" : "goToLogin";
        Logger.b("MainActivityLifecycle %s", objArr);
        Intent intent = getIntent();
        if (z2) {
            intent = kmf.a(this).a;
        }
        this.A.d = Lifecycle.authentication;
        startActivity(LoginActivity.a((Context) this, intent));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Uri u() {
        Fragment a = this.J.a();
        if (!(a instanceof upu)) {
            return null;
        }
        return ((upu) a).au_();
    }

    public final void a(kyf kyf) {
        this.ad = kyf;
    }

    public final fxn b() {
        klw klw = this.an;
        if (klw != null) {
            return klw.a;
        }
        return null;
    }

    public final ier aq_() {
        return this.u.b.a;
    }

    public final rdh af() {
        return this.ai;
    }

    public final Uri n() {
        return this.Y;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SnackBar snackBar) {
        snackBar.a(SnackAnimation.TOP_TO_BOTTOM);
        jqm jqm = this.n;
        jqm.c = new oal(snackBar);
        snackBar.a((SnackItem) jqm.c);
        jqm.h = new qgp(snackBar);
        snackBar.a((SnackItem) jqm.h);
        jqm.d = new jqq(snackBar);
        snackBar.a((SnackItem) jqm.d);
        jqm.e = new jqr(snackBar);
        snackBar.a((SnackItem) jqm.e);
        jqm.f = new pog(snackBar);
        snackBar.a((SnackItem) jqm.f);
        jqm.g = new hxy(snackBar, jqm.b);
        snackBar.a((SnackItem) jqm.g);
        nwd nwd = jqm.a;
        nwd.b = new kdj(snackBar, "Waze");
        snackBar.a((SnackItem) nwd.b);
        nwd.a = new kmn(snackBar);
        snackBar.a((SnackItem) nwd.a);
        nwd.c = new nwc(snackBar, R.layout.layout_starttrip_banner);
        snackBar.a((SnackItem) nwd.c);
        oaf oaf = this.r;
        oae oae = new oae((Context) oaf.a(oaf.a.get(), 1), (jro) oaf.a(oaf.b.get(), 2), (oag) oaf.a(oaf.c.get(), 3), (hed) oaf.a(oaf.d.get(), 4), (hvl) oaf.a(oaf.e.get(), 5), (oal) oaf.a(this.n.c, 6));
        this.am = oae;
        snackBar.a((SnackBar.c) this.t);
        snackBar.a((SnackBar.c) this.g);
        snackBar.bringToFront();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(SnackBar snackBar) {
        jqo jqo = this.H;
        jqo.a = new jqp(snackBar, R.id.offlineView, jqo.c, "Offline bar");
        snackBar.a((SnackItem) jqo.a);
        jqo.b = new jqp(snackBar, R.id.player_preview, jqo.c, "Player preview bar");
        snackBar.a((SnackItem) jqo.b);
        jqo jqo2 = this.H;
        Fragment a = jqo2.c.a(jqo2.b.e());
        if (a != null) {
            if (a instanceof iuc) {
                ((iuc) a).ai = jqo2.b;
            } else {
                jqo2.b.a(true);
            }
        }
        jop jop = (jop) jqo2.c.a(jqo2.a.e());
        if (jop != null) {
            jop.T = jqo2.a;
        }
        snackBar.bringToFront();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MainLayout mainLayout) {
        klw klw = new klw(this, mainLayout, this.J, this.K, new fbd() {
            public final Object get() {
                return Boolean.valueOf(MainActivity.this.o());
            }
        });
        this.an = klw;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(MainLayout mainLayout) {
        this.al = new klh(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Bundle bundle, Intent intent) {
        intent.setExtrasClassLoader(getClassLoader());
        this.l.a(intent.getData(), ez.c(this));
        gaa.a((Context) this);
        if (bundle == null) {
            if ("android.intent.action.MAIN".equals(intent.getAction())) {
                glm glm = this.v;
                if (glm.c != null) {
                    glm.c.a(glm.f, glm.e.currentTimeMillisMonotonic(), intent);
                    glm.c = null;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x016b, code lost:
        if (r1 != null) goto L_0x0170;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(android.os.Bundle r19, defpackage.klv r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            android.content.Intent r2 = r18.getIntent()
            glm r3 = r0.v
            com.spotify.music.-$$Lambda$MainActivity$4I__FFNTYmY90rtIRPKyalzNsx8 r4 = new com.spotify.music.-$$Lambda$MainActivity$4I__FFNTYmY90rtIRPKyalzNsx8
            r4.<init>(r1, r2)
            java.lang.String r5 = "dma_onCreatePrelude"
            r3.a(r4, r5)
            r3 = 0
            r0.setVisible(r3)
            glm r4 = r0.v
            com.spotify.music.-$$Lambda$MainActivity$79mLd6v6bBX3etqpwVosJw7d9cQ r5 = new com.spotify.music.-$$Lambda$MainActivity$79mLd6v6bBX3etqpwVosJw7d9cQ
            r5.<init>()
            java.lang.String r6 = "dma_layout"
            r4.a(r5, r6)
            r4 = 2131427794(0x7f0b01d2, float:1.8477214E38)
            android.view.View r5 = r0.findViewById(r4)
            java.lang.Object r5 = defpackage.fay.a(r5)
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
            kf r7 = r18.i()
            r6.d = r7
            com.spotify.music.libs.connect.access.ConnectAccessViewModel r6 = r0.Q
            r5.a(r6)
            boolean r6 = r0.P
            if (r6 == 0) goto L_0x005c
            com.spotify.mobile.android.ui.view.MainLayout$a r6 = new com.spotify.mobile.android.ui.view.MainLayout$a
            r6.<init>(r5, r3)
            r5.e = r6
        L_0x005c:
            kmd r6 = r0.E
            java.util.Set<snl$c> r6 = r6.a
            java.util.Iterator r6 = r6.iterator()
        L_0x0064:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0074
            java.lang.Object r7 = r6.next()
            snl$c r7 = (defpackage.snl.c) r7
            r7.a(r5)
            goto L_0x0064
        L_0x0074:
            glm r6 = r0.v
            com.spotify.music.-$$Lambda$MainActivity$A0szmjK7LyJa9lD89iusSjGSDrY r7 = new com.spotify.music.-$$Lambda$MainActivity$A0szmjK7LyJa9lD89iusSjGSDrY
            r7.<init>(r5)
            java.lang.String r8 = "dma_Debugdrawer"
            r6.a(r7, r8)
            fou r6 = r0.D
            r6.a()
            glm r6 = r0.v
            com.spotify.music.-$$Lambda$MainActivity$Fupj416J21L7iIMTorfE5A814Co r7 = new com.spotify.music.-$$Lambda$MainActivity$Fupj416J21L7iIMTorfE5A814Co
            r7.<init>(r5)
            java.lang.String r8 = "dma_Toolbar"
            r6.a(r7, r8)
            com.spotify.mobile.android.ui.view.snackbar.SnackBar r6 = r5.c
            com.spotify.mobile.android.ui.view.snackbar.SnackBar r5 = r5.b
            glm r7 = r0.v
            com.spotify.music.-$$Lambda$MainActivity$WWyz99ggSJV6peQ0v5pD04dNVfE r8 = new com.spotify.music.-$$Lambda$MainActivity$WWyz99ggSJV6peQ0v5pD04dNVfE
            r8.<init>(r6)
            java.lang.String r9 = "dma_BottomSnackbar"
            r7.a(r8, r9)
            glm r7 = r0.v
            com.spotify.music.-$$Lambda$MainActivity$xsSk_wa4F3re-4iLoVZxgvZykl4 r8 = new com.spotify.music.-$$Lambda$MainActivity$xsSk_wa4F3re-4iLoVZxgvZykl4
            r8.<init>(r5)
            java.lang.String r5 = "dma_TopSnackbar"
            r7.a(r8, r5)
            rlu r5 = new rlu
            com.spotify.music.navigation.NavigationManager r7 = r0.I
            r5.<init>(r7)
            r0.aj = r5
            rlh r5 = r0.z
            rlu r7 = r0.aj
            r5.a(r7)
            if (r1 == 0) goto L_0x0161
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r7 = "onCreate, restoring state"
            com.spotify.base.java.logging.Logger.b(r7, r5)
            java.lang.ClassLoader r5 = r18.getClassLoader()
            r1.setClassLoader(r5)
            kf r5 = r18.i()
            java.lang.String r7 = "tag_bottom_tab_nav_fragment"
            androidx.fragment.app.Fragment r5 = r5.a(r7)
            r0.ae = r5
            klh r5 = r0.al
            q r7 = r5.a
            kf r7 = r7.i()
            java.lang.String r8 = "tag_view_debug_toolbar_fragment_stub"
            androidx.fragment.app.Fragment r7 = r7.a(r8)
            jdq r7 = (defpackage.jdq) r7
            r5.b = r7
            com.spotify.music.navigation.NavigationManager r5 = r0.I
            java.lang.String r7 = "navigation_state"
            android.os.Bundle r7 = r1.getBundle(r7)
            java.lang.Object r7 = defpackage.fay.a(r7)
            android.os.Bundle r7 = (android.os.Bundle) r7
            android.content.Context r8 = r5.d
            java.lang.ClassLoader r8 = r8.getClassLoader()
            r5.d()
            java.lang.String r9 = "active"
            android.os.Parcelable r9 = r7.getParcelable(r9)
            if (r9 == 0) goto L_0x0123
            android.os.Bundle r9 = (android.os.Bundle) r9
            kf r10 = r5.a
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
            java.lang.Object r7 = defpackage.fay.a(r7)
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
            jja r12 = defpackage.jja.a(r8, r12)
            com.spotify.music.navigation.NavigationManager$a r11 = com.spotify.music.navigation.NavigationManager.a.b(r11)
            java.util.Deque<ho<jja, com.spotify.music.navigation.NavigationManager$a>> r13 = r5.c
            ho r11 = defpackage.ho.a(r12, r11)
            r13.push(r11)
            int r10 = r10 + 1
            goto L_0x0131
        L_0x0154:
            r5.f()
            java.lang.String r5 = "last_referrer"
            android.os.Parcelable r5 = r1.getParcelable(r5)
            android.net.Uri r5 = (android.net.Uri) r5
            r0.Y = r5
        L_0x0161:
            if (r1 == 0) goto L_0x016e
            java.lang.String r5 = "state_model"
            android.os.Parcelable r1 = r1.getParcelable(r5)
            smo r1 = (defpackage.smo) r1
            if (r1 == 0) goto L_0x016e
            goto L_0x0170
        L_0x016e:
            smo r1 = defpackage.smo.d
        L_0x0170:
            fpt r10 = r1.b()
            r0.af = r10
            com.spotify.mobile.android.service.session.SessionState r5 = r1.a()
            r0.ag = r5
            boolean r5 = r1.c()
            r0.ap = r5
            slr r11 = r0.C
            com.spotify.music.-$$Lambda$ztqQpVdOhz1WOHeExOsUXiPp7sY r12 = new com.spotify.music.-$$Lambda$ztqQpVdOhz1WOHeExOsUXiPp7sY
            r12.<init>()
            com.spotify.music.-$$Lambda$siSXWlZwSoZJh4pXza_8sVPJosI r13 = new com.spotify.music.-$$Lambda$siSXWlZwSoZJh4pXza_8sVPJosI
            r13.<init>()
            com.spotify.music.-$$Lambda$373pbDCo716KcXqRuWe98riFTss r14 = new com.spotify.music.-$$Lambda$373pbDCo716KcXqRuWe98riFTss
            r14.<init>()
            com.spotify.music.-$$Lambda$6ujzAs8EJ5TKcmVSSiA_6iRL2w8 r15 = new com.spotify.music.-$$Lambda$6ujzAs8EJ5TKcmVSSiA_6iRL2w8
            r15.<init>()
            com.spotify.music.-$$Lambda$SEX6KOkzHmaI9Pn2KyRqiQ7T4zU r5 = new com.spotify.music.-$$Lambda$SEX6KOkzHmaI9Pn2KyRqiQ7T4zU
            r5.<init>()
            com.spotify.music.-$$Lambda$MainActivity$BqNtE4InV2dOYa_kXq64NQuwRJM r7 = new com.spotify.music.-$$Lambda$MainActivity$BqNtE4InV2dOYa_kXq64NQuwRJM
            r7.<init>()
            r16 = r5
            r17 = r7
            kju$c r5 = r11.a(r12, r13, r14, r15, r16, r17)
            kju$b r1 = defpackage.kkb.a(r5, r1)
            r0.ah = r1
            kju$b<smo, smm> r1 = r0.ah
            com.spotify.music.-$$Lambda$MainActivity$0qt8EZP6MBN5YvBcKtdnXHK2-Uo r5 = new com.spotify.music.-$$Lambda$MainActivity$0qt8EZP6MBN5YvBcKtdnXHK2-Uo
            r5.<init>()
            kjd r5 = defpackage.kkz.a(r5)
            r1.a(r5)
            kli r1 = new kli
            r1.<init>(r0, r0, r10)
            r0.ak = r1
            ups r1 = r0.m
            com.spotify.music.-$$Lambda$MainActivity$MnTAMhZ9hbjm4oNu2TddEPLpJk4 r5 = new com.spotify.music.-$$Lambda$MainActivity$MnTAMhZ9hbjm4oNu2TddEPLpJk4
            r5.<init>()
            r1.a(r5, r0)
            com.spotify.music.navigation.NavigationManager r1 = r0.I
            klw r5 = r0.an
            java.util.Set<spj> r7 = r1.b
            r7.add(r5)
            r1.a(r5)
            kyh r1 = r0.at
            r0.a(r1)
            klw r1 = r0.an
            r1.c()
            java.lang.String r1 = "just_logged_in"
            boolean r5 = r2.getBooleanExtra(r1, r3)
            if (r5 == 0) goto L_0x01f0
            r2.putExtra(r1, r3)
        L_0x01f0:
            r20.getClass()
            com.spotify.music.-$$Lambda$OFxTImUZ7WD8wHElEKlzJoEw3Ek r1 = new com.spotify.music.-$$Lambda$OFxTImUZ7WD8wHElEKlzJoEw3Ek
            r2 = r20
            r1.<init>()
            r0.as = r1
            kyh r1 = r0.as
            r0.a(r1)
            hye r1 = new hye
            jqm r2 = r0.n
            r1.<init>(r2)
            hxx r2 = new hxx
            r2.<init>(r1)
            r0.ao = r2
            smd r2 = r0.u
            ieg r3 = r2.a
            ief r5 = new ief
            r7 = 1
            java.lang.Object r7 = defpackage.ieg.a(r0, r7)
            r8 = r7
            ka r8 = (defpackage.ka) r8
            r7 = 2
            java.lang.Object r7 = defpackage.ieg.a(r0, r7)
            r9 = r7
            kyi r9 = (defpackage.kyi) r9
            r7 = 4
            java.lang.Object r1 = defpackage.ieg.a(r1, r7)
            r11 = r1
            hyo r11 = (defpackage.hyo) r11
            wlc<iep> r1 = r3.a
            java.lang.Object r1 = r1.get()
            r7 = 5
            java.lang.Object r1 = defpackage.ieg.a(r1, r7)
            r12 = r1
            iep r12 = (defpackage.iep) r12
            wlc<ies> r1 = r3.b
            java.lang.Object r1 = r1.get()
            r7 = 6
            java.lang.Object r1 = defpackage.ieg.a(r1, r7)
            r13 = r1
            ies r13 = (defpackage.ies) r13
            wlc<tcn> r1 = r3.c
            java.lang.Object r1 = r1.get()
            r7 = 7
            java.lang.Object r1 = defpackage.ieg.a(r1, r7)
            r14 = r1
            tcn r14 = (defpackage.tcn) r14
            wlc<hzb> r1 = r3.d
            java.lang.Object r1 = r1.get()
            r3 = 8
            java.lang.Object r1 = defpackage.ieg.a(r1, r3)
            r15 = r1
            hzb r15 = (defpackage.hzb) r15
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r2.b = r5
            ief r1 = r2.b
            ier r1 = r1.a
            r2.c = r1
            pnk r1 = r0.h
            kf r2 = r18.i()
            android.view.View r3 = r0.findViewById(r4)
            r4 = 2131430271(0x7f0b0b7f, float:1.8482238E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            android.content.res.Resources r5 = r18.getResources()
            r7 = 2131165336(0x7f070098, float:1.7944886E38)
            float r5 = r5.getDimension(r7)
            int r5 = (int) r5
            r1.b = r2
            r1.c = r3
            r1.d = r4
            r1.e = r5
            r1.f = r6
            pnk r1 = r0.h
            kf r2 = r18.i()
            r3 = 2131430270(0x7f0b0b7e, float:1.8482236E38)
            android.view.View r3 = r0.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r1.a(r2, r3)
            pnk r1 = r0.h
            jqm r2 = r0.n
            pog r2 = r2.f
            r1.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.MainActivity.a(android.os.Bundle, klv):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(fpt fpt) {
        jok a = jok.a(fpt);
        this.ae = a;
        i().a().b(R.id.navigation_bar, a, "tag_bottom_tab_nav_fragment").b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(fpt fpt, SessionState sessionState) {
        this.v.a((Runnable) new Runnable(fpt) {
            private final /* synthetic */ fpt f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MainActivity.this.d(this.f$1);
            }
        }, "dma_registerDialogs");
        this.v.a((Runnable) new Runnable(fpt) {
            private final /* synthetic */ fpt f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MainActivity.this.c(this.f$1);
            }
        }, "dma_BottomNavFragment");
        this.v.a((Runnable) new Runnable(fpt) {
            private final /* synthetic */ fpt f$1;

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
        b(fpt, sessionState);
        setVisible(true);
        ap_();
        this.ap = true;
    }

    static /* synthetic */ void a(MainActivity mainActivity, Fragment fragment) {
        NavigationGroup navigationGroup = NavigationGroup.NONE;
        if (fragment instanceof NavigationItem) {
            navigationGroup = ((NavigationItem) fragment).ah();
        }
        Logger.b("broadcasting nav group %s", navigationGroup);
        ueb ueb = mainActivity.x;
        Intent intent = new Intent();
        intent.setAction("ACTION_LATEST_NAVIGATION").putExtra("navigation_group", navigationGroup);
        ueb.a(intent);
    }
}
