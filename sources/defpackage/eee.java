package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.PinkiePie;
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

@cfp
/* renamed from: eee reason: default package */
public final class eee extends edk {
    private final ble a;
    private eef b;

    public eee(ble ble) {
        this.a = ble;
    }

    private final Bundle a(String str, dpp dpp, String str2) {
        Bundle bundle;
        String valueOf = String.valueOf(str);
        String str3 = "Server parameters: ";
        if (valueOf.length() != 0) {
            str3.concat(valueOf);
        } else {
            new String(str3);
        }
        cpn.a(5);
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
                if (dpp != null) {
                    bundle.putInt("tagForChildDirectedTreatment", dpp.g);
                }
            }
            return bundle;
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    private static boolean a(dpp dpp) {
        if (!dpp.f) {
            dqe.a();
            if (!cpc.a()) {
                return false;
            }
        }
        return true;
    }

    public final cbi a() {
        ble ble = this.a;
        if (!(ble instanceof MediationBannerAdapter)) {
            String str = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(ble.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cpn.a(5);
            throw new RemoteException();
        }
        try {
            return cbj.a(((MediationBannerAdapter) ble).getBannerView());
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(cbi cbi) {
        try {
            cbj.a(cbi);
        } catch (Throwable unused) {
            cpn.a(5);
        }
    }

    public final void a(cbi cbi, ckk ckk, List<String> list) {
        ble ble = this.a;
        if (!(ble instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String str = "Not an InitializableMediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(ble.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cpn.a(5);
            throw new RemoteException();
        }
        cpn.a(3);
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.a;
            ArrayList arrayList = new ArrayList();
            for (String a2 : list) {
                arrayList.add(a(a2, (dpp) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) cbj.a(cbi), new ckn(ckk), arrayList);
        } catch (Throwable unused) {
            cpn.a(5);
            throw new RemoteException();
        }
    }

    public final void a(cbi cbi, dpp dpp, String str, ckk ckk, String str2) {
        Bundle bundle;
        eed eed;
        dpp dpp2 = dpp;
        ble ble = this.a;
        if (!(ble instanceof MediationRewardedVideoAdAdapter)) {
            String str3 = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(ble.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            cpn.a(5);
            throw new RemoteException();
        }
        cpn.a(3);
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.a;
            Bundle a2 = a(str2, dpp2, (String) null);
            if (dpp2 != null) {
                eed eed2 = new eed(dpp2.b == -1 ? null : new Date(dpp2.b), dpp2.d, dpp2.e != null ? new HashSet(dpp2.e) : null, dpp2.k, a(dpp), dpp2.g, dpp2.r);
                bundle = dpp2.m != null ? dpp2.m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                eed = eed2;
            } else {
                eed = null;
                bundle = null;
            }
            mediationRewardedVideoAdAdapter.initialize((Context) cbj.a(cbi), eed, str, new ckn(ckk), a2, bundle);
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(cbi cbi, dpp dpp, String str, edm edm) {
        a(cbi, dpp, str, (String) null, edm);
    }

    public final void a(cbi cbi, dpp dpp, String str, String str2, edm edm) {
        dpp dpp2 = dpp;
        ble ble = this.a;
        if (!(ble instanceof MediationInterstitialAdapter)) {
            String str3 = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(ble.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            cpn.a(5);
            throw new RemoteException();
        }
        cpn.a(3);
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.a;
            Bundle bundle = null;
            eed eed = new eed(dpp2.b == -1 ? null : new Date(dpp2.b), dpp2.d, dpp2.e != null ? new HashSet(dpp2.e) : null, dpp2.k, a(dpp), dpp2.g, dpp2.r);
            if (dpp2.m != null) {
                bundle = dpp2.m.getBundle(mediationInterstitialAdapter.getClass().getName());
            }
            Bundle bundle2 = bundle;
            Context context = (Context) cbj.a(cbi);
            new eef(edm);
            Bundle a2 = a(str, dpp2, str2);
            eed eed2 = eed;
            PinkiePie.DianePie();
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(cbi cbi, dpp dpp, String str, String str2, edm edm, dvg dvg, List<String> list) {
        dpp dpp2 = dpp;
        ble ble = this.a;
        if (!(ble instanceof MediationNativeAdapter)) {
            String str3 = "Not a MediationNativeAdapter: ";
            String valueOf = String.valueOf(ble.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            cpn.a(5);
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) ble;
            Bundle bundle = null;
            eei eei = new eei(dpp2.b == -1 ? null : new Date(dpp2.b), dpp2.d, dpp2.e != null ? new HashSet(dpp2.e) : null, dpp2.k, a(dpp), dpp2.g, dvg, list, dpp2.r);
            if (dpp2.m != null) {
                bundle = dpp2.m.getBundle(mediationNativeAdapter.getClass().getName());
            }
            this.b = new eef(edm);
            mediationNativeAdapter.requestNativeAd((Context) cbj.a(cbi), this.b, a(str, dpp2, str2), eei, bundle);
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(cbi cbi, dpt dpt, dpp dpp, String str, edm edm) {
        a(cbi, dpt, dpp, str, null, edm);
    }

    public final void a(cbi cbi, dpt dpt, dpp dpp, String str, String str2, edm edm) {
        dpt dpt2 = dpt;
        dpp dpp2 = dpp;
        ble ble = this.a;
        if (!(ble instanceof MediationBannerAdapter)) {
            String str3 = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(ble.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            cpn.a(5);
            throw new RemoteException();
        }
        cpn.a(3);
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.a;
            Bundle bundle = null;
            eed eed = new eed(dpp2.b == -1 ? null : new Date(dpp2.b), dpp2.d, dpp2.e != null ? new HashSet(dpp2.e) : null, dpp2.k, a(dpp), dpp2.g, dpp2.r);
            if (dpp2.m != null) {
                bundle = dpp2.m.getBundle(mediationBannerAdapter.getClass().getName());
            }
            Bundle bundle2 = bundle;
            Context context = (Context) cbj.a(cbi);
            new eef(edm);
            Bundle a2 = a(str, dpp2, str2);
            bfi a3 = blz.a(dpt2.e, dpt2.b, dpt2.a);
            eed eed2 = eed;
            PinkiePie.DianePie();
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(dpp dpp, String str) {
        a(dpp, str, (String) null);
    }

    public final void a(dpp dpp, String str, String str2) {
        ble ble = this.a;
        if (!(ble instanceof MediationRewardedVideoAdAdapter)) {
            String str3 = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(ble.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            cpn.a(5);
            throw new RemoteException();
        }
        cpn.a(3);
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.a;
            eed eed = new eed(dpp.b == -1 ? null : new Date(dpp.b), dpp.d, dpp.e != null ? new HashSet(dpp.e) : null, dpp.k, a(dpp), dpp.g, dpp.r);
            if (dpp.m != null) {
                Bundle bundle = dpp.m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
            }
            Bundle a2 = a(str, dpp, str2);
            PinkiePie.DianePie();
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(boolean z) {
        ble ble = this.a;
        if (!(ble instanceof blm)) {
            String str = "Not an OnImmersiveModeUpdatedListener: ";
            String valueOf = String.valueOf(ble.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cpn.a(4);
            return;
        }
        try {
            ((blm) ble).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            cpn.a("", th);
        }
    }

    public final void b() {
        ble ble = this.a;
        if (!(ble instanceof MediationInterstitialAdapter)) {
            String str = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(ble.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cpn.a(5);
            throw new RemoteException();
        }
        cpn.a(3);
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.a;
            PinkiePie.DianePie();
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final void c() {
        try {
            this.a.onDestroy();
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final void d() {
        try {
            this.a.onPause();
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final void e() {
        try {
            this.a.onResume();
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final void f() {
        ble ble = this.a;
        if (!(ble instanceof MediationRewardedVideoAdAdapter)) {
            String str = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(ble.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cpn.a(5);
            throw new RemoteException();
        }
        cpn.a(3);
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.a;
            PinkiePie.DianePie();
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final boolean g() {
        ble ble = this.a;
        if (!(ble instanceof MediationRewardedVideoAdAdapter)) {
            String str = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(ble.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cpn.a(5);
            throw new RemoteException();
        }
        cpn.a(3);
        try {
            return ((MediationRewardedVideoAdAdapter) this.a).isInitialized();
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final eds h() {
        bli bli = this.b.a;
        if (bli instanceof blj) {
            return new eeg((blj) bli);
        }
        return null;
    }

    public final edw i() {
        bli bli = this.b.a;
        if (bli instanceof blk) {
            return new eeh((blk) bli);
        }
        return null;
    }

    public final Bundle j() {
        ble ble = this.a;
        if (ble instanceof zzatl) {
            return ((zzatl) ble).zzmq();
        }
        String str = "Not a v2 MediationBannerAdapter: ";
        String valueOf = String.valueOf(ble.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cpn.a(5);
        return new Bundle();
    }

    public final Bundle k() {
        ble ble = this.a;
        if (ble instanceof zzatm) {
            return ((zzatm) ble).getInterstitialAdapterInfo();
        }
        String str = "Not a v2 MediationInterstitialAdapter: ";
        String valueOf = String.valueOf(ble.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cpn.a(5);
        return new Bundle();
    }

    public final Bundle l() {
        return new Bundle();
    }

    public final boolean m() {
        return this.a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final dwn n() {
        bfu bfu = this.b.c;
        if (bfu instanceof dwq) {
            return ((dwq) bfu).a;
        }
        return null;
    }

    public final drq o() {
        ble ble = this.a;
        if (!(ble instanceof blt)) {
            return null;
        }
        try {
            return ((blt) ble).getVideoController();
        } catch (Throwable th) {
            cpn.a("", th);
            return null;
        }
    }

    public final edz p() {
        bln bln = this.b.b;
        if (bln != null) {
            return new eeq(bln);
        }
        return null;
    }
}
