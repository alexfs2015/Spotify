package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzatm;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@cey
/* renamed from: edn reason: default package */
public final class edn extends ect {
    private final bkn a;
    private edo b;

    public edn(bkn bkn) {
        this.a = bkn;
    }

    private static boolean a(doy doy) {
        if (!doy.f) {
            dpn.a();
            if (!col.a()) {
                return false;
            }
        }
        return true;
    }

    public final void a(car car, doy doy, String str, ecv ecv) {
        a(car, doy, str, (String) null, ecv);
    }

    public final void a(car car, dpc dpc, doy doy, String str, ecv ecv) {
        a(car, dpc, doy, str, null, ecv);
    }

    public final void a(doy doy, String str) {
        a(doy, str, (String) null);
    }

    public final void c() {
        try {
            this.a.onDestroy();
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final void d() {
        try {
            this.a.onPause();
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final void e() {
        try {
            this.a.onResume();
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final Bundle l() {
        return new Bundle();
    }

    public final boolean m() {
        return this.a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final dqz o() {
        bkn bkn = this.a;
        if (!(bkn instanceof blc)) {
            return null;
        }
        try {
            return ((blc) bkn).getVideoController();
        } catch (Throwable th) {
            cow.a("", th);
            return null;
        }
    }

    public final car a() {
        bkn bkn = this.a;
        if (!(bkn instanceof MediationBannerAdapter)) {
            String str = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(bkn.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cow.a(5);
            throw new RemoteException();
        }
        try {
            return cas.a(((MediationBannerAdapter) bkn).getBannerView());
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(car car, dpc dpc, doy doy, String str, String str2, ecv ecv) {
        dpc dpc2 = dpc;
        doy doy2 = doy;
        bkn bkn = this.a;
        if (!(bkn instanceof MediationBannerAdapter)) {
            String str3 = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(bkn.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            cow.a(5);
            throw new RemoteException();
        }
        cow.a(3);
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.a;
            Bundle bundle = null;
            edm edm = new edm(doy2.b == -1 ? null : new Date(doy2.b), doy2.d, doy2.e != null ? new HashSet(doy2.e) : null, doy2.k, a(doy), doy2.g, doy2.r);
            if (doy2.m != null) {
                bundle = doy2.m.getBundle(mediationBannerAdapter.getClass().getName());
            }
            mediationBannerAdapter.requestBannerAd((Context) cas.a(car), new edo(ecv), a(str, doy2, str2), bli.a(dpc2.e, dpc2.b, dpc2.a), edm, bundle);
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final Bundle j() {
        bkn bkn = this.a;
        if (bkn instanceof zzatl) {
            return ((zzatl) bkn).zzmq();
        }
        String str = "Not a v2 MediationBannerAdapter: ";
        String valueOf = String.valueOf(bkn.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cow.a(5);
        return new Bundle();
    }

    public final void a(car car, doy doy, String str, String str2, ecv ecv) {
        doy doy2 = doy;
        bkn bkn = this.a;
        if (!(bkn instanceof MediationInterstitialAdapter)) {
            String str3 = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(bkn.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            cow.a(5);
            throw new RemoteException();
        }
        cow.a(3);
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.a;
            Bundle bundle = null;
            edm edm = new edm(doy2.b == -1 ? null : new Date(doy2.b), doy2.d, doy2.e != null ? new HashSet(doy2.e) : null, doy2.k, a(doy), doy2.g, doy2.r);
            if (doy2.m != null) {
                bundle = doy2.m.getBundle(mediationInterstitialAdapter.getClass().getName());
            }
            mediationInterstitialAdapter.requestInterstitialAd((Context) cas.a(car), new edo(ecv), a(str, doy2, str2), edm, bundle);
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final Bundle k() {
        bkn bkn = this.a;
        if (bkn instanceof zzatm) {
            return ((zzatm) bkn).getInterstitialAdapterInfo();
        }
        String str = "Not a v2 MediationInterstitialAdapter: ";
        String valueOf = String.valueOf(bkn.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cow.a(5);
        return new Bundle();
    }

    public final void a(car car, doy doy, String str, String str2, ecv ecv, dup dup, List<String> list) {
        doy doy2 = doy;
        bkn bkn = this.a;
        if (!(bkn instanceof MediationNativeAdapter)) {
            String str3 = "Not a MediationNativeAdapter: ";
            String valueOf = String.valueOf(bkn.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            cow.a(5);
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) bkn;
            Bundle bundle = null;
            edr edr = new edr(doy2.b == -1 ? null : new Date(doy2.b), doy2.d, doy2.e != null ? new HashSet(doy2.e) : null, doy2.k, a(doy), doy2.g, dup, list, doy2.r);
            if (doy2.m != null) {
                bundle = doy2.m.getBundle(mediationNativeAdapter.getClass().getName());
            }
            this.b = new edo(ecv);
            mediationNativeAdapter.requestNativeAd((Context) cas.a(car), this.b, a(str, doy2, str2), edr, bundle);
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final edb h() {
        bkr bkr = this.b.a;
        if (bkr instanceof bks) {
            return new edp((bks) bkr);
        }
        return null;
    }

    public final edi p() {
        bkw bkw = this.b.b;
        if (bkw != null) {
            return new edz(bkw);
        }
        return null;
    }

    public final edf i() {
        bkr bkr = this.b.a;
        if (bkr instanceof bkt) {
            return new edq((bkt) bkr);
        }
        return null;
    }

    public final dvw n() {
        bfd bfd = this.b.c;
        if (bfd instanceof dvz) {
            return ((dvz) bfd).a;
        }
        return null;
    }

    public final void a(car car, doy doy, String str, cjt cjt, String str2) {
        Bundle bundle;
        edm edm;
        doy doy2 = doy;
        bkn bkn = this.a;
        if (!(bkn instanceof MediationRewardedVideoAdAdapter)) {
            String str3 = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(bkn.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            cow.a(5);
            throw new RemoteException();
        }
        cow.a(3);
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.a;
            Bundle a2 = a(str2, doy2, (String) null);
            if (doy2 != null) {
                edm edm2 = new edm(doy2.b == -1 ? null : new Date(doy2.b), doy2.d, doy2.e != null ? new HashSet(doy2.e) : null, doy2.k, a(doy), doy2.g, doy2.r);
                bundle = doy2.m != null ? doy2.m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                edm = edm2;
            } else {
                edm = null;
                bundle = null;
            }
            mediationRewardedVideoAdAdapter.initialize((Context) cas.a(car), edm, str, new cjw(cjt), a2, bundle);
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(car car, cjt cjt, List<String> list) {
        bkn bkn = this.a;
        if (!(bkn instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String str = "Not an InitializableMediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(bkn.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cow.a(5);
            throw new RemoteException();
        }
        cow.a(3);
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.a;
            ArrayList arrayList = new ArrayList();
            for (String a2 : list) {
                arrayList.add(a(a2, (doy) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) cas.a(car), new cjw(cjt), arrayList);
        } catch (Throwable unused) {
            cow.a(5);
            throw new RemoteException();
        }
    }

    public final void a(doy doy, String str, String str2) {
        bkn bkn = this.a;
        if (!(bkn instanceof MediationRewardedVideoAdAdapter)) {
            String str3 = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(bkn.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            cow.a(5);
            throw new RemoteException();
        }
        cow.a(3);
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.a;
            Bundle bundle = null;
            edm edm = new edm(doy.b == -1 ? null : new Date(doy.b), doy.d, doy.e != null ? new HashSet(doy.e) : null, doy.k, a(doy), doy.g, doy.r);
            if (doy.m != null) {
                bundle = doy.m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
            }
            mediationRewardedVideoAdAdapter.loadAd(edm, a(str, doy, str2), bundle);
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final void f() {
        bkn bkn = this.a;
        if (!(bkn instanceof MediationRewardedVideoAdAdapter)) {
            String str = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(bkn.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cow.a(5);
            throw new RemoteException();
        }
        cow.a(3);
        try {
            ((MediationRewardedVideoAdAdapter) this.a).showVideo();
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final boolean g() {
        bkn bkn = this.a;
        if (!(bkn instanceof MediationRewardedVideoAdAdapter)) {
            String str = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(bkn.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cow.a(5);
            throw new RemoteException();
        }
        cow.a(3);
        try {
            return ((MediationRewardedVideoAdAdapter) this.a).isInitialized();
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(boolean z) {
        bkn bkn = this.a;
        if (!(bkn instanceof bkv)) {
            String str = "Not an OnImmersiveModeUpdatedListener: ";
            String valueOf = String.valueOf(bkn.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cow.a(4);
            return;
        }
        try {
            ((bkv) bkn).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            cow.a("", th);
        }
    }

    public final void b() {
        bkn bkn = this.a;
        if (!(bkn instanceof MediationInterstitialAdapter)) {
            String str = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(bkn.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cow.a(5);
            throw new RemoteException();
        }
        cow.a(3);
        try {
            ((MediationInterstitialAdapter) this.a).showInterstitial();
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(car car) {
        try {
            cas.a(car);
        } catch (Throwable unused) {
            cow.a(5);
        }
    }

    private final Bundle a(String str, doy doy, String str2) {
        Bundle bundle;
        String valueOf = String.valueOf(str);
        String str3 = "Server parameters: ";
        if (valueOf.length() != 0) {
            str3.concat(valueOf);
        } else {
            new String(str3);
        }
        cow.a(5);
        try {
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str4 = (String) keys.next();
                    bundle.putString(str4, jSONObject.getString(str4));
                }
            } else {
                bundle = bundle2;
            }
            if (this.a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (doy != null) {
                    bundle.putInt("tagForChildDirectedTreatment", doy.g);
                }
            }
            return bundle;
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }
}
