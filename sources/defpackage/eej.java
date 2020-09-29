package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.PinkiePie;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import defpackage.aqd;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@cfp
/* renamed from: eej reason: default package */
public final class eej<NETWORK_EXTRAS extends aqd, SERVER_PARAMETERS extends MediationServerParameters> extends edk {
    private final aqa<NETWORK_EXTRAS, SERVER_PARAMETERS> a;
    private final NETWORK_EXTRAS b;

    public eej(aqa<NETWORK_EXTRAS, SERVER_PARAMETERS> aqa, NETWORK_EXTRAS network_extras) {
        this.a = aqa;
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
                cpn.a("", th);
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
        aqa<NETWORK_EXTRAS, SERVER_PARAMETERS> aqa = this.a;
        if (!(aqa instanceof MediationBannerAdapter)) {
            String str = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(aqa.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cpn.a(5);
            throw new RemoteException();
        }
        try {
            return cbj.a(((MediationBannerAdapter) aqa).getBannerView());
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(cbi cbi) {
    }

    public final void a(cbi cbi, ckk ckk, List<String> list) {
    }

    public final void a(cbi cbi, dpp dpp, String str, ckk ckk, String str2) {
    }

    public final void a(cbi cbi, dpp dpp, String str, edm edm) {
        a(cbi, dpp, str, (String) null, edm);
    }

    public final void a(cbi cbi, dpp dpp, String str, String str2, edm edm) {
        aqa<NETWORK_EXTRAS, SERVER_PARAMETERS> aqa = this.a;
        if (!(aqa instanceof MediationInterstitialAdapter)) {
            String str3 = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(aqa.getClass().getCanonicalName());
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
            new eek(edm);
            Activity activity = (Activity) cbj.a(cbi);
            MediationServerParameters a2 = a(str);
            apz a3 = eeo.a(dpp, a(dpp));
            NETWORK_EXTRAS network_extras = this.b;
            PinkiePie.DianePie();
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(cbi cbi, dpp dpp, String str, String str2, edm edm, dvg dvg, List<String> list) {
    }

    public final void a(cbi cbi, dpt dpt, dpp dpp, String str, edm edm) {
        a(cbi, dpt, dpp, str, null, edm);
    }

    public final void a(cbi cbi, dpt dpt, dpp dpp, String str, String str2, edm edm) {
        apy apy;
        aqa<NETWORK_EXTRAS, SERVER_PARAMETERS> aqa = this.a;
        if (!(aqa instanceof MediationBannerAdapter)) {
            String str3 = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(aqa.getClass().getCanonicalName());
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
            new eek(edm);
            Activity activity = (Activity) cbj.a(cbi);
            MediationServerParameters a2 = a(str);
            int i = 0;
            apy[] apyArr = {apy.a, apy.b, apy.c, apy.d, apy.e, apy.f};
            while (true) {
                if (i < 6) {
                    if (apyArr[i].a() == dpt.e && apyArr[i].b() == dpt.b) {
                        apy = apyArr[i];
                        break;
                    }
                    i++;
                } else {
                    apy = new apy(blz.a(dpt.e, dpt.b, dpt.a));
                    break;
                }
            }
            apy apy2 = apy;
            apz a3 = eeo.a(dpp, a(dpp));
            NETWORK_EXTRAS network_extras = this.b;
            PinkiePie.DianePie();
        } catch (Throwable th) {
            cpn.a("", th);
            throw new RemoteException();
        }
    }

    public final void a(dpp dpp, String str) {
    }

    public final void a(dpp dpp, String str, String str2) {
    }

    public final void a(boolean z) {
    }

    public final void b() {
        aqa<NETWORK_EXTRAS, SERVER_PARAMETERS> aqa = this.a;
        if (!(aqa instanceof MediationInterstitialAdapter)) {
            String str = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(aqa.getClass().getCanonicalName());
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
            this.a.destroy();
        } catch (Throwable th) {
            cpn.a("", th);
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

    public final eds h() {
        return null;
    }

    public final edw i() {
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

    public final dwn n() {
        return null;
    }

    public final drq o() {
        return null;
    }

    public final edz p() {
        return null;
    }
}
