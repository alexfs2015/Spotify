package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import defpackage.apm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@cey
/* renamed from: eds reason: default package */
public final class eds<NETWORK_EXTRAS extends apm, SERVER_PARAMETERS extends MediationServerParameters> extends ect {
    private final apj<NETWORK_EXTRAS, SERVER_PARAMETERS> a;
    private final NETWORK_EXTRAS b;

    public eds(apj<NETWORK_EXTRAS, SERVER_PARAMETERS> apj, NETWORK_EXTRAS network_extras) {
        this.a = apj;
        this.b = network_extras;
    }

    private final SERVER_PARAMETERS a(String str) {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    hashMap.put(str2, jSONObject.getString(str2));
                }
            } catch (Throwable th) {
                cow.a("", th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class serverParametersType = this.a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (MediationServerParameters) serverParametersType.newInstance();
        server_parameters.a(hashMap);
        return server_parameters;
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

    public final void a(car car) {
    }

    public final void a(car car, cjt cjt, List<String> list) {
    }

    public final void a(car car, doy doy, String str, cjt cjt, String str2) {
    }

    public final void a(car car, doy doy, String str, ecv ecv) {
        a(car, doy, str, (String) null, ecv);
    }

    public final void a(car car, doy doy, String str, String str2, ecv ecv, dup dup, List<String> list) {
    }

    public final void a(car car, dpc dpc, doy doy, String str, ecv ecv) {
        a(car, dpc, doy, str, null, ecv);
    }

    public final void a(doy doy, String str) {
    }

    public final void a(doy doy, String str, String str2) {
    }

    public final void a(boolean z) {
    }

    public final void c() {
        try {
            this.a.destroy();
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final void d() {
        throw new RemoteException();
    }

    public final void e() {
        throw new RemoteException();
    }

    public final void f() {
    }

    public final boolean g() {
        return true;
    }

    public final edb h() {
        return null;
    }

    public final edf i() {
        return null;
    }

    public final Bundle j() {
        return new Bundle();
    }

    public final Bundle k() {
        return new Bundle();
    }

    public final Bundle l() {
        return new Bundle();
    }

    public final boolean m() {
        return false;
    }

    public final dvw n() {
        return null;
    }

    public final dqz o() {
        return null;
    }

    public final edi p() {
        return null;
    }

    public final car a() {
        apj<NETWORK_EXTRAS, SERVER_PARAMETERS> apj = this.a;
        if (!(apj instanceof MediationBannerAdapter)) {
            String str = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(apj.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cow.a(5);
            throw new RemoteException();
        }
        try {
            return cas.a(((MediationBannerAdapter) apj).getBannerView());
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(car car, dpc dpc, doy doy, String str, String str2, ecv ecv) {
        aph aph;
        apj<NETWORK_EXTRAS, SERVER_PARAMETERS> apj = this.a;
        if (!(apj instanceof MediationBannerAdapter)) {
            String str3 = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(apj.getClass().getCanonicalName());
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
            edt edt = new edt(ecv);
            Activity activity = (Activity) cas.a(car);
            MediationServerParameters a2 = a(str);
            int i = 0;
            aph[] aphArr = {aph.a, aph.b, aph.c, aph.d, aph.e, aph.f};
            while (true) {
                if (i < 6) {
                    if (aphArr[i].a() == dpc.e && aphArr[i].b() == dpc.b) {
                        aph = aphArr[i];
                        break;
                    }
                    i++;
                } else {
                    aph = new aph(bli.a(dpc.e, dpc.b, dpc.a));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(edt, activity, a2, aph, edx.a(doy, a(doy)), this.b);
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(car car, doy doy, String str, String str2, ecv ecv) {
        apj<NETWORK_EXTRAS, SERVER_PARAMETERS> apj = this.a;
        if (!(apj instanceof MediationInterstitialAdapter)) {
            String str3 = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(apj.getClass().getCanonicalName());
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
            ((MediationInterstitialAdapter) this.a).requestInterstitialAd(new edt(ecv), (Activity) cas.a(car), a(str), edx.a(doy, a(doy)), this.b);
        } catch (Throwable th) {
            cow.a("", th);
            throw new RemoteException();
        }
    }

    public final void b() {
        apj<NETWORK_EXTRAS, SERVER_PARAMETERS> apj = this.a;
        if (!(apj instanceof MediationInterstitialAdapter)) {
            String str = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(apj.getClass().getCanonicalName());
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
}
