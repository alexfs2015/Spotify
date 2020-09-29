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

@cey
/* renamed from: bho reason: default package */
public abstract class bho extends dqe implements bfr, bft, bhi, cdd, cfa, clk, dos {
    protected dtc a;
    protected dta b;
    protected boolean c = false;
    protected final bjb d;
    protected final bjm e;
    protected transient doy f;
    protected final dkf g;
    protected car h;
    protected final bki i;
    private dta j;
    private final Bundle k = new Bundle();
    private boolean l = false;

    protected static boolean a(doy doy) {
        Bundle bundle = doy.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
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
            cow.a("", e2);
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    public final void A() {
        if (this.e.C != null) {
            try {
                this.e.C.c();
            } catch (RemoteException e2) {
                clu.b("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void B() {
        if (this.e.C != null) {
            try {
                this.e.C.f();
            } catch (RemoteException e2) {
                clu.b("#007 Could not call remote method.", e2);
            }
        }
    }

    public String D() {
        return this.e.b;
    }

    public final dqm E() {
        return this.e.o;
    }

    public final dps F() {
        return this.e.n;
    }

    public void a(int i2) {
        a(i2, false);
    }

    public final void a(Bundle bundle) {
        this.k.putAll(bundle);
        if (this.l && this.e.p != null) {
            try {
                this.e.p.a();
            } catch (RemoteException e2) {
                clu.b("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(View view) {
        bjn bjn = this.e.f;
        if (bjn != null) {
            bjn.addView(view, bjl.g().d());
        }
    }

    public final void a(cio cio) {
        bwx.b("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.e.D = cio;
    }

    public final void a(ciw ciw) {
        bwx.b("#008 Must be called on the main UI thread.: setRewardedVideoAdListener");
        this.e.C = ciw;
    }

    /* access modifiers changed from: protected */
    public abstract void a(cla cla, dtc dtc);

    public final void a(dpc dpc) {
        bwx.b("#008 Must be called on the main UI thread.: setAdSize");
        bjm bjm = this.e;
        bjm.i = dpc;
        if (!(bjm.j == null || this.e.j.b == null || this.e.I != 0)) {
            this.e.j.b.a(cue.a(dpc));
        }
        if (this.e.f != null) {
            if (this.e.f.getChildCount() > 1) {
                this.e.f.removeView(this.e.f.getNextView());
            }
            this.e.f.setMinimumWidth(dpc.f);
            this.e.f.setMinimumHeight(dpc.c);
            this.e.f.requestLayout();
        }
    }

    public final void a(dpp dpp) {
        bwx.b("#008 Must be called on the main UI thread.: setAdClickListener");
        this.e.m = dpp;
    }

    public final void a(dps dps) {
        bwx.b("#008 Must be called on the main UI thread.: setAdListener");
        this.e.n = dps;
    }

    public final void a(dqi dqi) {
        this.e.p = dqi;
    }

    public final void a(dqm dqm) {
        bwx.b("#008 Must be called on the main UI thread.: setAppEventListener");
        this.e.o = dqm;
    }

    public final void a(dqs dqs) {
        bwx.b("#008 Must be called on the main UI thread.: setCorrelationIdProvider");
        this.e.q = dqs;
    }

    public final void a(drf drf) {
        bwx.b("#008 Must be called on the main UI thread.: setIconAdOptions");
        this.e.y = drf;
    }

    public final void a(dry dry) {
        bwx.b("#008 Must be called on the main UI thread.: setVideoOptions");
        this.e.x = dry;
    }

    public void a(dth dth) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    public final void a(String str) {
        bwx.b("#008 Must be called on the main UI thread.: setUserId");
        this.e.E = str;
    }

    public final void a(String str, String str2) {
        if (this.e.o != null) {
            try {
                this.e.o.a(str, str2);
            } catch (RemoteException e2) {
                clu.b("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(ckz ckz) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(ckz ckz, ckz ckz2);

    /* access modifiers changed from: protected */
    public abstract boolean a(doy doy, dtc dtc);

    /* access modifiers changed from: protected */
    public final List<String> b(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String a2 : list) {
            arrayList.add(ckt.a(a2, this.e.c));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final void b(cjx cjx) {
        if (this.e.C != null) {
            String str = "";
            int i2 = 1;
            if (cjx != null) {
                try {
                    str = cjx.a;
                    i2 = cjx.b;
                } catch (RemoteException e2) {
                    clu.b("#007 Could not call remote method.", e2);
                    return;
                }
            }
            cig cig = new cig(str, i2);
            this.e.C.a((cil) cig);
            if (this.e.D != null) {
                this.e.D.a(cig, this.e.k.a.v);
            }
        }
    }

    public void c(boolean z) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    /* access modifiers changed from: protected */
    public boolean c(doy doy) {
        if (this.e.f == null) {
            return false;
        }
        ViewParent parent = this.e.f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return bjl.e().a(view, view.getContext());
    }

    public final void h() {
        v();
    }

    public final bki i() {
        return this.i;
    }

    public final car k() {
        bwx.b("#008 Must be called on the main UI thread.: getAdFrame");
        return cas.a(this.e.f);
    }

    public final dpc l() {
        bwx.b("#008 Must be called on the main UI thread.: getAdSize");
        if (this.e.i == null) {
            return null;
        }
        return new drw(this.e.i);
    }

    public final boolean m() {
        bwx.b("#008 Must be called on the main UI thread.: isLoaded");
        return this.e.g == null && this.e.h == null && this.e.j != null;
    }

    public void o() {
        bwx.b("#008 Must be called on the main UI thread.: pause");
    }

    public void p() {
        bwx.b("#008 Must be called on the main UI thread.: resume");
    }

    public final Bundle q() {
        return this.l ? this.k : new Bundle();
    }

    public final void r() {
        bwx.b("#008 Must be called on the main UI thread.: stopLoading");
        this.c = false;
        this.e.a(true);
    }

    public final boolean s() {
        return this.c;
    }

    public dqz t() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void x() {
        d(false);
    }

    bho(bjm bjm, bki bki) {
        this.e = bjm;
        this.d = new bjb(this);
        this.i = bki;
        cmd e2 = bjl.e();
        Context context = this.e.c;
        if (!e2.b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new cmi(e2, 0), intentFilter);
            e2.b = true;
        }
        bjl.e().b(this.e.c);
        clr.a(this.e.c);
        bjl.C().a(this.e.c);
        bjl.i().a(this.e.c, this.e.e);
        bjl.k().a(this.e.c);
        this.g = bjl.i().b;
        dlu h2 = bjl.h();
        Context context2 = this.e.c;
        synchronized (h2.a) {
            if (!h2.c) {
                if (((Boolean) dpn.f().a(dsp.aE)).booleanValue()) {
                    Application application = null;
                    Context applicationContext = context2.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context2;
                    }
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    }
                    if (application == null) {
                        cow.a(5);
                    } else {
                        if (h2.b == null) {
                            h2.b = new dlv();
                        }
                        dlv dlv = h2.b;
                        if (!dlv.c) {
                            application.registerActivityLifecycleCallbacks(dlv);
                            if (context2 instanceof Activity) {
                                dlv.a((Activity) context2);
                            }
                            dlv.b = application;
                            dlv.d = ((Long) dpn.f().a(dsp.aF)).longValue();
                            dlv.c = true;
                        }
                        h2.c = true;
                    }
                }
            }
        }
        bjl.E().a(this.e.c);
        if (((Boolean) dpn.f().a(dsp.cl)).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(new bip(this, new CountDownLatch(((Integer) dpn.f().a(dsp.cn)).intValue()), timer), 0, ((Long) dpn.f().a(dsp.cm)).longValue());
        }
    }

    public final void a(dta dta) {
        String str = "load_ad";
        this.a = new dtc(((Boolean) dpn.f().a(dsp.N)).booleanValue(), str, this.e.i.a);
        this.j = new dta(-1, null, null);
        if (dta == null) {
            this.b = new dta(-1, null, null);
        } else {
            this.b = new dta(dta.a, dta.b, dta.c);
        }
    }

    public void j() {
        bwx.b("#008 Must be called on the main UI thread.: destroy");
        this.d.a();
        dkf dkf = this.g;
        ckz ckz = this.e.j;
        synchronized (dkf.a) {
            dkg dkg = (dkg) dkf.b.get(ckz);
            if (dkg != null) {
                dkg.e();
            }
        }
        bjm bjm = this.e;
        if (bjm.f != null) {
            bjn bjn = bjm.f;
            clu.a();
            bjn.b.b();
        }
        bjm.n = null;
        bjm.p = null;
        bjm.o = null;
        bjm.B = null;
        bjm.q = null;
        bjm.a(false);
        if (bjm.f != null) {
            bjm.f.removeAllViews();
        }
        bjm.a();
        bjm.b();
        bjm.j = null;
    }

    public void b(boolean z) {
        cow.a(5);
    }

    public boolean b(doy doy) {
        doy doy2;
        bwx.b("#008 Must be called on the main UI thread.: loadAd");
        dms k2 = bjl.k();
        if (((Boolean) dpn.f().a(dsp.cD)).booleanValue()) {
            synchronized (k2.b) {
                k2.a();
                bjl.e();
                cmd.a.removeCallbacks(k2.a);
                bjl.e();
                cmd.a.postDelayed(k2.a, ((Long) dpn.f().a(dsp.cE)).longValue());
            }
        }
        this.k.clear();
        this.l = false;
        if (((Boolean) dpn.f().a(dsp.aL)).booleanValue()) {
            doy2 = doy.a();
            if (((Boolean) dpn.f().a(dsp.aM)).booleanValue()) {
                doy2.c.putBoolean(AdMobAdapter.NEW_BUNDLE, true);
            }
        } else {
            doy2 = doy;
        }
        if (bzk.c(this.e.c) && doy2.k != null) {
            doz doz = new doz(doy2);
            doz.j = null;
            doy2 = new doy(7, doz.a, doz.b, doz.c, doz.d, doz.e, doz.f, doz.g, doz.h, doz.i, doz.j, doz.k, doz.l, doz.m, doz.n, doz.o, doz.p, false);
        }
        if (this.e.g == null && this.e.h == null) {
            cow.a(4);
            a((dta) null);
            this.b = this.a.a();
            if (doy2.f) {
                cow.a(4);
            } else {
                dpn.a();
                String a2 = col.a(this.e.c);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 71);
                sb.append("Use AdRequest.Builder.addTestDevice(\"");
                sb.append(a2);
                sb.append("\") to get test ads on this device.");
                sb.toString();
                cow.a(4);
            }
            this.d.a = doy2;
            this.c = a(doy2, this.a);
            return this.c;
        }
        if (this.f != null) {
            cow.a(5);
        } else {
            cow.a(5);
        }
        this.f = doy2;
        return false;
    }

    public final void a(cla cla) {
        if (cla.b.m != -1 && !TextUtils.isEmpty(cla.b.w)) {
            long b2 = b(cla.b.w);
            if (b2 != -1) {
                dta a2 = this.a.a(cla.b.m + b2);
                this.a.a(a2, "stc");
            }
        }
        dtc dtc = this.a;
        String str = cla.b.w;
        if (dtc.a) {
            synchronized (dtc.b) {
                dtc.c = str;
            }
        }
        this.a.a(this.b, "arf");
        this.j = this.a.a();
        this.a.a("gqi", cla.b.x);
        bjm bjm = this.e;
        bjm.g = null;
        bjm.k = cla;
        cla.i.a((dni) new bjo(cla));
        cla.i.a(zzb.AD_LOADED);
        a(cla, this.a);
    }

    public void b(ckz ckz) {
        zzb zzb;
        dnh dnh;
        this.a.a(this.j, "awr");
        this.e.h = null;
        if (!(ckz.d == -2 || ckz.d == 3 || this.e.K == null)) {
            cln j2 = bjl.j();
            HashSet<clb> hashSet = this.e.K;
            synchronized (j2.a) {
                j2.b.addAll(hashSet);
            }
        }
        if (ckz.d == -1) {
            this.c = false;
            return;
        }
        if (a(ckz)) {
            cow.a(3);
        }
        if (ckz.d != -2) {
            if (ckz.d == 3) {
                dnh = ckz.K;
                zzb = zzb.AD_FAILED_TO_LOAD_NO_FILL;
            } else {
                dnh = ckz.K;
                zzb = zzb.AD_FAILED_TO_LOAD;
            }
            dnh.a(zzb);
            a(ckz.d);
            return;
        }
        if (this.e.G == null) {
            bjm bjm = this.e;
            bjm.G = new clm(bjm.b);
        }
        if (this.e.f != null) {
            this.e.f.a.e = ckz.B;
        }
        this.g.a(this.e.j);
        if (a(this.e.j, ckz)) {
            bjm bjm2 = this.e;
            bjm2.j = ckz;
            if (bjm2.l != null) {
                if (bjm2.j != null) {
                    clb clb = bjm2.l;
                    long j3 = bjm2.j.y;
                    synchronized (clb.c) {
                        clb.j = j3;
                        if (clb.j != -1) {
                            clb.a.a(clb);
                        }
                    }
                    clb clb2 = bjm2.l;
                    long j4 = bjm2.j.z;
                    synchronized (clb2.c) {
                        if (clb2.j != -1) {
                            clb2.d = j4;
                            clb2.a.a(clb2);
                        }
                    }
                    clb clb3 = bjm2.l;
                    boolean z = bjm2.j.n;
                    synchronized (clb3.c) {
                        if (clb3.j != -1) {
                            clb3.f = z;
                            clb3.a.a(clb3);
                        }
                    }
                }
                clb clb4 = bjm2.l;
                boolean z2 = bjm2.i.d;
                synchronized (clb4.c) {
                    if (clb4.j != -1) {
                        clb4.g = SystemClock.elapsedRealtime();
                        if (!z2) {
                            clb4.e = clb4.g;
                            clb4.a.a(clb4);
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
            if (bjl.i().a() != null) {
                bjl.i().a().a(this.a);
            }
            C();
            if (this.e.c()) {
                x();
            }
        }
        if (ckz.J != null) {
            bjl.e().a(this.e.c, ckz.J);
        }
    }

    public void e() {
        if (this.e.j == null) {
            cow.a(5);
            return;
        }
        cow.a(3);
        if (this.e.l != null) {
            clb clb = this.e.l;
            synchronized (clb.c) {
                if (clb.j != -1) {
                    clc clc = new clc();
                    clc.a = SystemClock.elapsedRealtime();
                    clb.b.add(clc);
                    clb.h++;
                    clb.a.a();
                    clb.a.a(clb);
                }
            }
        }
        if (this.e.j.c != null) {
            bjl.e();
            cmd.a(this.e.c, this.e.e.a, b(this.e.j.c));
        }
        if (this.e.m != null) {
            try {
                this.e.m.a();
            } catch (RemoteException e2) {
                clu.b("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void n() {
        bwx.b("#008 Must be called on the main UI thread.: recordManualImpression");
        if (this.e.j == null) {
            cow.a(5);
            return;
        }
        cow.a(3);
        if (!this.e.j.H) {
            ArrayList arrayList = new ArrayList();
            if (this.e.j.g != null) {
                arrayList.addAll(this.e.j.g);
            }
            if (!(this.e.j.o == null || this.e.j.o.i == null)) {
                arrayList.addAll(this.e.j.o.i);
            }
            if (!arrayList.isEmpty()) {
                bjl.e();
                cmd.a(this.e.c, this.e.e.a, (List<String>) arrayList);
                this.e.j.H = true;
            }
        }
    }

    public void a(ccp ccp) {
        cow.a(5);
    }

    public final void a(ccv ccv, String str) {
        cow.a(5);
    }

    /* access modifiers changed from: protected */
    public void u() {
        clu.a();
        String str = "#007 Could not call remote method.";
        if (this.e.n != null) {
            try {
                this.e.n.a();
            } catch (RemoteException e2) {
                clu.b(str, e2);
            }
        }
        if (this.e.C != null) {
            try {
                this.e.C.d();
            } catch (RemoteException e3) {
                clu.b(str, e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void v() {
        clu.a();
        String str = "#007 Could not call remote method.";
        if (this.e.n != null) {
            try {
                this.e.n.b();
            } catch (RemoteException e2) {
                clu.b(str, e2);
            }
        }
        if (this.e.C != null) {
            try {
                this.e.C.e();
            } catch (RemoteException e3) {
                clu.b(str, e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void w() {
        clu.a();
        String str = "#007 Could not call remote method.";
        if (this.e.n != null) {
            try {
                this.e.n.d();
            } catch (RemoteException e2) {
                clu.b(str, e2);
            }
        }
        if (this.e.C != null) {
            try {
                this.e.C.b();
            } catch (RemoteException e3) {
                clu.b(str, e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void d(boolean z) {
        clu.a();
        this.c = z;
        this.l = true;
        String str = "#007 Could not call remote method.";
        if (this.e.n != null) {
            try {
                this.e.n.c();
            } catch (RemoteException e2) {
                clu.b(str, e2);
            }
        }
        if (this.e.C != null) {
            try {
                this.e.C.a();
            } catch (RemoteException e3) {
                clu.b(str, e3);
            }
        }
        if (this.e.p != null) {
            try {
                this.e.p.a();
            } catch (RemoteException e4) {
                clu.b(str, e4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2, boolean z) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Failed to load ad: ");
        sb.append(i2);
        sb.toString();
        cow.a(5);
        this.c = z;
        String str = "#007 Could not call remote method.";
        if (this.e.n != null) {
            try {
                this.e.n.a(i2);
            } catch (RemoteException e2) {
                clu.b(str, e2);
            }
        }
        if (this.e.C != null) {
            try {
                this.e.C.a(i2);
            } catch (RemoteException e3) {
                clu.b(str, e3);
            }
        }
    }

    public final void y() {
        cow.a(4);
        if (this.e.n != null) {
            try {
                this.e.n.f();
            } catch (RemoteException e2) {
                clu.b("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void z() {
        cow.a(4);
        if (this.e.n != null) {
            try {
                this.e.n.e();
            } catch (RemoteException e2) {
                clu.b("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final List<String> a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            Context context = this.e.c;
            if (bjl.B().a(context) && !TextUtils.isEmpty(str)) {
                String i2 = bjl.B().i(context);
                if (i2 != null && bjl.e().e(str)) {
                    if (((Boolean) dpn.f().a(dsp.ar)).booleanValue()) {
                        String str2 = (String) dpn.f().a(dsp.as);
                        if (str.contains(str2)) {
                            str = str.replace(str2, i2);
                        }
                    } else {
                        String str3 = "fbs_aeid";
                        if (!str.contains(str3)) {
                            str = ckt.a(str, str3, i2).toString();
                        }
                    }
                }
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public final void C() {
        ckz ckz = this.e.j;
        if (ckz != null && !TextUtils.isEmpty(ckz.B) && !ckz.I && bjl.o().b()) {
            cow.a(3);
            bjl.o().a(this.e.c, this.e.e.a, ckz.B, this.e.b);
            ckz.I = true;
        }
    }

    public final void a(HashSet<clb> hashSet) {
        this.e.K = hashSet;
    }

    /* access modifiers changed from: protected */
    public final void G() {
        if (this.h != null) {
            ccg u = bjl.u();
            car car = this.h;
            synchronized (ccg.a) {
                if (((Boolean) dpn.f().a(dsp.de)).booleanValue()) {
                    if (ccg.b) {
                        try {
                            u.c.c(car);
                        } catch (RemoteException | NullPointerException e2) {
                            cow.b("#007 Could not call remote method.", e2);
                        }
                    }
                }
            }
            this.h = null;
        }
    }

    /* access modifiers changed from: protected */
    public final String H() {
        cla cla = this.e.k;
        String str = "javascript";
        if (cla == null || cla.b == null) {
            return str;
        }
        String str2 = cla.b.T;
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            if (new JSONObject(str2).optInt("media_type", -1) == 0) {
                return null;
            }
            return str;
        } catch (JSONException unused) {
            cow.a(5);
            return str;
        }
    }
}
