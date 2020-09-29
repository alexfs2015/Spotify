package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzhu.zza.zzb;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: bif reason: default package */
public abstract class bif extends dqv implements bgi, bgk, bhz, cdu, cfr, cmb, dpj {
    protected dtt a;
    protected dtr b;
    protected boolean c = false;
    protected final bjs d;
    protected final bkd e;
    protected transient dpp f;
    protected final dkw g;
    protected cbi h;
    protected final bkz i;
    private dtr j;
    private final Bundle k = new Bundle();
    private boolean l = false;

    bif(bkd bkd, bkz bkz) {
        this.e = bkd;
        this.d = new bjs(this);
        this.i = bkz;
        cmu e2 = bkc.e();
        Context context = this.e.c;
        if (!e2.b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new cmz(e2, 0), intentFilter);
            e2.b = true;
        }
        bkc.e().b(this.e.c);
        cmi.a(this.e.c);
        bkc.C().a(this.e.c);
        bkc.i().a(this.e.c, this.e.e);
        bkc.k().a(this.e.c);
        this.g = bkc.i().b;
        dml h2 = bkc.h();
        Context context2 = this.e.c;
        synchronized (h2.a) {
            if (!h2.c) {
                if (((Boolean) dqe.f().a(dtg.aE)).booleanValue()) {
                    Application application = null;
                    Context applicationContext = context2.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context2;
                    }
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    }
                    if (application == null) {
                        cpn.a(5);
                    } else {
                        if (h2.b == null) {
                            h2.b = new dmm();
                        }
                        dmm dmm = h2.b;
                        if (!dmm.c) {
                            application.registerActivityLifecycleCallbacks(dmm);
                            if (context2 instanceof Activity) {
                                dmm.a((Activity) context2);
                            }
                            dmm.b = application;
                            dmm.d = ((Long) dqe.f().a(dtg.aF)).longValue();
                            dmm.c = true;
                        }
                        h2.c = true;
                    }
                }
            }
        }
        bkc.E().a(this.e.c);
        if (((Boolean) dqe.f().a(dtg.cl)).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(new bjg(this, new CountDownLatch(((Integer) dqe.f().a(dtg.cn)).intValue()), timer), 0, ((Long) dqe.f().a(dtg.cm)).longValue());
        }
    }

    protected static boolean a(dpp dpp) {
        Bundle bundle = dpp.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    private static long b(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException | NumberFormatException e2) {
            cpn.a("", e2);
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    public final void A() {
        if (this.e.C != null) {
            try {
                this.e.C.c();
            } catch (RemoteException e2) {
                cml.b("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void B() {
        if (this.e.C != null) {
            try {
                this.e.C.f();
            } catch (RemoteException e2) {
                cml.b("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void C() {
        clq clq = this.e.j;
        if (clq != null && !TextUtils.isEmpty(clq.B) && !clq.I && bkc.o().b()) {
            cpn.a(3);
            bkc.o().a(this.e.c, this.e.e.a, clq.B, this.e.b);
            clq.I = true;
        }
    }

    public String D() {
        return this.e.b;
    }

    public final drd E() {
        return this.e.o;
    }

    public final dqj F() {
        return this.e.n;
    }

    /* access modifiers changed from: protected */
    public final void G() {
        if (this.h != null) {
            ccx u = bkc.u();
            cbi cbi = this.h;
            synchronized (ccx.a) {
                if (((Boolean) dqe.f().a(dtg.de)).booleanValue()) {
                    if (ccx.b) {
                        try {
                            u.c.c(cbi);
                        } catch (RemoteException | NullPointerException e2) {
                            cpn.b("#007 Could not call remote method.", e2);
                        }
                    }
                }
            }
            this.h = null;
        }
    }

    /* access modifiers changed from: protected */
    public final String H() {
        clr clr = this.e.k;
        String str = "javascript";
        if (clr == null || clr.b == null) {
            return str;
        }
        String str2 = clr.b.T;
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            if (new JSONObject(str2).optInt("media_type", -1) == 0) {
                return null;
            }
            return str;
        } catch (JSONException unused) {
            cpn.a(5);
            return str;
        }
    }

    /* access modifiers changed from: protected */
    public final List<String> a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            Context context = this.e.c;
            if (bkc.B().a(context) && !TextUtils.isEmpty(str)) {
                String i2 = bkc.B().i(context);
                if (i2 != null && bkc.e().e(str)) {
                    if (((Boolean) dqe.f().a(dtg.ar)).booleanValue()) {
                        String str2 = (String) dqe.f().a(dtg.as);
                        if (str.contains(str2)) {
                            str = str.replace(str2, i2);
                        }
                    } else {
                        String str3 = "fbs_aeid";
                        if (!str.contains(str3)) {
                            str = clk.a(str, str3, i2).toString();
                        }
                    }
                }
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public void a(int i2) {
        a(i2, false);
    }

    /* access modifiers changed from: protected */
    public void a(int i2, boolean z) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Failed to load ad: ");
        sb.append(i2);
        sb.toString();
        cpn.a(5);
        this.c = z;
        String str = "#007 Could not call remote method.";
        if (this.e.n != null) {
            try {
                this.e.n.a(i2);
            } catch (RemoteException e2) {
                cml.b(str, e2);
            }
        }
        if (this.e.C != null) {
            try {
                this.e.C.a(i2);
            } catch (RemoteException e3) {
                cml.b(str, e3);
            }
        }
    }

    public final void a(Bundle bundle) {
        this.k.putAll(bundle);
        if (this.l && this.e.p != null) {
            try {
                this.e.p.a();
            } catch (RemoteException e2) {
                cml.b("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(View view) {
        bke bke = this.e.f;
        if (bke != null) {
            bke.addView(view, bkc.g().d());
        }
    }

    public void a(cdg cdg) {
        cpn.a(5);
    }

    public final void a(cdm cdm, String str) {
        cpn.a(5);
    }

    public final void a(cjf cjf) {
        bxo.b("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.e.D = cjf;
    }

    public final void a(cjn cjn) {
        bxo.b("#008 Must be called on the main UI thread.: setRewardedVideoAdListener");
        this.e.C = cjn;
    }

    public final void a(clr clr) {
        if (clr.b.m != -1 && !TextUtils.isEmpty(clr.b.w)) {
            long b2 = b(clr.b.w);
            if (b2 != -1) {
                dtr a2 = this.a.a(clr.b.m + b2);
                this.a.a(a2, "stc");
            }
        }
        dtt dtt = this.a;
        String str = clr.b.w;
        if (dtt.a) {
            synchronized (dtt.b) {
                dtt.c = str;
            }
        }
        this.a.a(this.b, "arf");
        this.j = this.a.a();
        this.a.a("gqi", clr.b.x);
        bkd bkd = this.e;
        bkd.g = null;
        bkd.k = clr;
        clr.i.a((dnz) new bkf(clr));
        clr.i.a(zzb.AD_LOADED);
        a(clr, this.a);
    }

    /* access modifiers changed from: protected */
    public abstract void a(clr clr, dtt dtt);

    public final void a(dpt dpt) {
        bxo.b("#008 Must be called on the main UI thread.: setAdSize");
        bkd bkd = this.e;
        bkd.i = dpt;
        if (!(bkd.j == null || this.e.j.b == null || this.e.I != 0)) {
            this.e.j.b.a(cuv.a(dpt));
        }
        if (this.e.f != null) {
            if (this.e.f.getChildCount() > 1) {
                this.e.f.removeView(this.e.f.getNextView());
            }
            this.e.f.setMinimumWidth(dpt.f);
            this.e.f.setMinimumHeight(dpt.c);
            this.e.f.requestLayout();
        }
    }

    public final void a(dqg dqg) {
        bxo.b("#008 Must be called on the main UI thread.: setAdClickListener");
        this.e.m = dqg;
    }

    public final void a(dqj dqj) {
        bxo.b("#008 Must be called on the main UI thread.: setAdListener");
        this.e.n = dqj;
    }

    public final void a(dqz dqz) {
        this.e.p = dqz;
    }

    public final void a(drd drd) {
        bxo.b("#008 Must be called on the main UI thread.: setAppEventListener");
        this.e.o = drd;
    }

    public final void a(drj drj) {
        bxo.b("#008 Must be called on the main UI thread.: setCorrelationIdProvider");
        this.e.q = drj;
    }

    public final void a(drw drw) {
        bxo.b("#008 Must be called on the main UI thread.: setIconAdOptions");
        this.e.y = drw;
    }

    public final void a(dsp dsp) {
        bxo.b("#008 Must be called on the main UI thread.: setVideoOptions");
        this.e.x = dsp;
    }

    public final void a(dtr dtr) {
        String str = "load_ad";
        this.a = new dtt(((Boolean) dqe.f().a(dtg.N)).booleanValue(), str, this.e.i.a);
        this.j = new dtr(-1, null, null);
        if (dtr == null) {
            this.b = new dtr(-1, null, null);
        } else {
            this.b = new dtr(dtr.a, dtr.b, dtr.c);
        }
    }

    public void a(dty dty) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    public final void a(String str) {
        bxo.b("#008 Must be called on the main UI thread.: setUserId");
        this.e.E = str;
    }

    public final void a(String str, String str2) {
        if (this.e.o != null) {
            try {
                this.e.o.a(str, str2);
            } catch (RemoteException e2) {
                cml.b("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void a(HashSet<cls> hashSet) {
        this.e.K = hashSet;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(clq clq) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(clq clq, clq clq2);

    /* access modifiers changed from: protected */
    public abstract boolean a(dpp dpp, dtt dtt);

    /* access modifiers changed from: protected */
    public final List<String> b(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String a2 : list) {
            arrayList.add(clk.a(a2, this.e.c));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final void b(cko cko) {
        if (this.e.C != null) {
            String str = "";
            int i2 = 1;
            if (cko != null) {
                try {
                    str = cko.a;
                    i2 = cko.b;
                } catch (RemoteException e2) {
                    cml.b("#007 Could not call remote method.", e2);
                    return;
                }
            }
            cix cix = new cix(str, i2);
            this.e.C.a((cjc) cix);
            if (this.e.D != null) {
                this.e.D.a(cix, this.e.k.a.v);
            }
        }
    }

    public void b(clq clq) {
        zzb zzb;
        dny dny;
        this.a.a(this.j, "awr");
        this.e.h = null;
        if (!(clq.d == -2 || clq.d == 3 || this.e.K == null)) {
            cme j2 = bkc.j();
            HashSet<cls> hashSet = this.e.K;
            synchronized (j2.a) {
                j2.b.addAll(hashSet);
            }
        }
        if (clq.d == -1) {
            this.c = false;
            return;
        }
        if (a(clq)) {
            cpn.a(3);
        }
        if (clq.d != -2) {
            if (clq.d == 3) {
                dny = clq.K;
                zzb = zzb.AD_FAILED_TO_LOAD_NO_FILL;
            } else {
                dny = clq.K;
                zzb = zzb.AD_FAILED_TO_LOAD;
            }
            dny.a(zzb);
            a(clq.d);
            return;
        }
        if (this.e.G == null) {
            bkd bkd = this.e;
            bkd.G = new cmd(bkd.b);
        }
        if (this.e.f != null) {
            this.e.f.a.e = clq.B;
        }
        this.g.a(this.e.j);
        if (a(this.e.j, clq)) {
            bkd bkd2 = this.e;
            bkd2.j = clq;
            if (bkd2.l != null) {
                if (bkd2.j != null) {
                    cls cls = bkd2.l;
                    long j3 = bkd2.j.y;
                    synchronized (cls.c) {
                        cls.j = j3;
                        if (cls.j != -1) {
                            cls.a.a(cls);
                        }
                    }
                    cls cls2 = bkd2.l;
                    long j4 = bkd2.j.z;
                    synchronized (cls2.c) {
                        if (cls2.j != -1) {
                            cls2.d = j4;
                            cls2.a.a(cls2);
                        }
                    }
                    cls cls3 = bkd2.l;
                    boolean z = bkd2.j.n;
                    synchronized (cls3.c) {
                        if (cls3.j != -1) {
                            cls3.f = z;
                            cls3.a.a(cls3);
                        }
                    }
                }
                cls cls4 = bkd2.l;
                boolean z2 = bkd2.i.d;
                synchronized (cls4.c) {
                    if (cls4.j != -1) {
                        cls4.g = SystemClock.elapsedRealtime();
                        if (!z2) {
                            cls4.e = cls4.g;
                            cls4.a.a(cls4);
                        }
                    }
                }
            }
            this.a.a("is_mraid", this.e.j.a() ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
            this.a.a("is_mediation", this.e.j.n ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
            if (!(this.e.j.b == null || this.e.j.b.x() == null)) {
                this.a.a("is_delay_pl", this.e.j.b.x().f() ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
            }
            this.a.a(this.b, "ttc");
            if (bkc.i().a() != null) {
                bkc.i().a().a(this.a);
            }
            C();
            if (this.e.c()) {
                x();
            }
        }
        if (clq.J != null) {
            bkc.e().a(this.e.c, clq.J);
        }
    }

    public void b(boolean z) {
        cpn.a(5);
    }

    public boolean b(dpp dpp) {
        dpp dpp2;
        bxo.b("#008 Must be called on the main UI thread.: loadAd");
        dnj k2 = bkc.k();
        if (((Boolean) dqe.f().a(dtg.cD)).booleanValue()) {
            synchronized (k2.b) {
                k2.a();
                bkc.e();
                cmu.a.removeCallbacks(k2.a);
                bkc.e();
                cmu.a.postDelayed(k2.a, ((Long) dqe.f().a(dtg.cE)).longValue());
            }
        }
        this.k.clear();
        this.l = false;
        if (((Boolean) dqe.f().a(dtg.aL)).booleanValue()) {
            dpp2 = dpp.a();
            if (((Boolean) dqe.f().a(dtg.aM)).booleanValue()) {
                dpp2.c.putBoolean(AdMobAdapter.NEW_BUNDLE, true);
            }
        } else {
            dpp2 = dpp;
        }
        if (cab.c(this.e.c) && dpp2.k != null) {
            dpq dpq = new dpq(dpp2);
            dpq.j = null;
            dpp2 = new dpp(7, dpq.a, dpq.b, dpq.c, dpq.d, dpq.e, dpq.f, dpq.g, dpq.h, dpq.i, dpq.j, dpq.k, dpq.l, dpq.m, dpq.n, dpq.o, dpq.p, false);
        }
        if (this.e.g == null && this.e.h == null) {
            cpn.a(4);
            a((dtr) null);
            this.b = this.a.a();
            if (dpp2.f) {
                cpn.a(4);
            } else {
                dqe.a();
                String a2 = cpc.a(this.e.c);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 71);
                sb.append("Use AdRequest.Builder.addTestDevice(\"");
                sb.append(a2);
                sb.append("\") to get test ads on this device.");
                sb.toString();
                cpn.a(4);
            }
            this.d.a = dpp2;
            this.c = a(dpp2, this.a);
            return this.c;
        }
        if (this.f != null) {
            cpn.a(5);
        } else {
            cpn.a(5);
        }
        this.f = dpp2;
        return false;
    }

    public void c(boolean z) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    /* access modifiers changed from: protected */
    public boolean c(dpp dpp) {
        if (this.e.f == null) {
            return false;
        }
        ViewParent parent = this.e.f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return bkc.e().a(view, view.getContext());
    }

    /* access modifiers changed from: protected */
    public void d(boolean z) {
        cml.a();
        this.c = z;
        this.l = true;
        String str = "#007 Could not call remote method.";
        if (this.e.n != null) {
            try {
                this.e.n.c();
            } catch (RemoteException e2) {
                cml.b(str, e2);
            }
        }
        if (this.e.C != null) {
            try {
                this.e.C.a();
            } catch (RemoteException e3) {
                cml.b(str, e3);
            }
        }
        if (this.e.p != null) {
            try {
                this.e.p.a();
            } catch (RemoteException e4) {
                cml.b(str, e4);
            }
        }
    }

    public void e() {
        if (this.e.j == null) {
            cpn.a(5);
            return;
        }
        cpn.a(3);
        if (this.e.l != null) {
            cls cls = this.e.l;
            synchronized (cls.c) {
                if (cls.j != -1) {
                    clt clt = new clt();
                    clt.a = SystemClock.elapsedRealtime();
                    cls.b.add(clt);
                    cls.h++;
                    cls.a.a();
                    cls.a.a(cls);
                }
            }
        }
        if (this.e.j.c != null) {
            bkc.e();
            cmu.a(this.e.c, this.e.e.a, b(this.e.j.c));
        }
        if (this.e.m != null) {
            try {
                this.e.m.a();
            } catch (RemoteException e2) {
                cml.b("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void h() {
        v();
    }

    public final bkz i() {
        return this.i;
    }

    public void j() {
        bxo.b("#008 Must be called on the main UI thread.: destroy");
        this.d.a();
        dkw dkw = this.g;
        clq clq = this.e.j;
        synchronized (dkw.a) {
            dkx dkx = (dkx) dkw.b.get(clq);
            if (dkx != null) {
                dkx.e();
            }
        }
        bkd bkd = this.e;
        if (bkd.f != null) {
            bke bke = bkd.f;
            cml.a();
            bke.b.b();
        }
        bkd.n = null;
        bkd.p = null;
        bkd.o = null;
        bkd.B = null;
        bkd.q = null;
        bkd.a(false);
        if (bkd.f != null) {
            bkd.f.removeAllViews();
        }
        bkd.a();
        bkd.b();
        bkd.j = null;
    }

    public final cbi k() {
        bxo.b("#008 Must be called on the main UI thread.: getAdFrame");
        return cbj.a(this.e.f);
    }

    public final dpt l() {
        bxo.b("#008 Must be called on the main UI thread.: getAdSize");
        if (this.e.i == null) {
            return null;
        }
        return new dsn(this.e.i);
    }

    public final boolean m() {
        bxo.b("#008 Must be called on the main UI thread.: isLoaded");
        return this.e.g == null && this.e.h == null && this.e.j != null;
    }

    public final void n() {
        bxo.b("#008 Must be called on the main UI thread.: recordManualImpression");
        if (this.e.j == null) {
            cpn.a(5);
            return;
        }
        cpn.a(3);
        if (!this.e.j.H) {
            ArrayList arrayList = new ArrayList();
            if (this.e.j.g != null) {
                arrayList.addAll(this.e.j.g);
            }
            if (!(this.e.j.o == null || this.e.j.o.i == null)) {
                arrayList.addAll(this.e.j.o.i);
            }
            if (!arrayList.isEmpty()) {
                bkc.e();
                cmu.a(this.e.c, this.e.e.a, (List<String>) arrayList);
                this.e.j.H = true;
            }
        }
    }

    public void o() {
        bxo.b("#008 Must be called on the main UI thread.: pause");
    }

    public void p() {
        bxo.b("#008 Must be called on the main UI thread.: resume");
    }

    public final Bundle q() {
        return this.l ? this.k : new Bundle();
    }

    public final void r() {
        bxo.b("#008 Must be called on the main UI thread.: stopLoading");
        this.c = false;
        this.e.a(true);
    }

    public final boolean s() {
        return this.c;
    }

    public drq t() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void u() {
        cml.a();
        String str = "#007 Could not call remote method.";
        if (this.e.n != null) {
            try {
                this.e.n.a();
            } catch (RemoteException e2) {
                cml.b(str, e2);
            }
        }
        if (this.e.C != null) {
            try {
                this.e.C.d();
            } catch (RemoteException e3) {
                cml.b(str, e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void v() {
        cml.a();
        String str = "#007 Could not call remote method.";
        if (this.e.n != null) {
            try {
                this.e.n.b();
            } catch (RemoteException e2) {
                cml.b(str, e2);
            }
        }
        if (this.e.C != null) {
            try {
                this.e.C.e();
            } catch (RemoteException e3) {
                cml.b(str, e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void w() {
        cml.a();
        String str = "#007 Could not call remote method.";
        if (this.e.n != null) {
            try {
                this.e.n.d();
            } catch (RemoteException e2) {
                cml.b(str, e2);
            }
        }
        if (this.e.C != null) {
            try {
                this.e.C.b();
            } catch (RemoteException e3) {
                cml.b(str, e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
        d(false);
    }

    public final void y() {
        cpn.a(4);
        if (this.e.n != null) {
            try {
                this.e.n.f();
            } catch (RemoteException e2) {
                cml.b("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void z() {
        cpn.a(4);
        if (this.e.n != null) {
            try {
                this.e.n.e();
            } catch (RemoteException e2) {
                cml.b("#007 Could not call remote method.", e2);
            }
        }
    }
}
