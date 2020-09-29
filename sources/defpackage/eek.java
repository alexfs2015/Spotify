package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: eek reason: default package */
public final class eek extends eef {
    private final cvc a;

    public eek(cvc cvc) {
        this.a = cvc;
    }

    public final eeo a() {
        return eeo.a(this.a.b());
    }

    public final void a(car car, String str, Bundle bundle, eeh eeh) {
        int i;
        try {
            new een(eeh);
            Context context = (Context) cas.a(car);
            char c = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                i = cvd.a;
            } else if (c == 1) {
                i = cvd.b;
            } else if (c == 2) {
                i = cvd.c;
            } else if (c == 3) {
                i = cvd.d;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            new cve(context, i, bundle);
        } catch (Throwable th) {
            cow.a("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    public final void a(byte[] bArr, String str, Bundle bundle, car car, eea eea, ecv ecv, dpc dpc) {
        try {
            eel eel = new eel(eea, ecv);
            cvc cvc = this.a;
            new cvb((Context) cas.a(car), bArr, a(str), bundle);
            bli.a(dpc.e, dpc.b, dpc.a);
            eel.a(String.valueOf(cvc.getClass().getSimpleName()).concat(" does not support banner."));
        } catch (Throwable th) {
            cow.a("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    public final void a(byte[] bArr, String str, Bundle bundle, car car, eec eec, ecv ecv) {
        try {
            eem eem = new eem(this, eec, ecv);
            cvc cvc = this.a;
            new cvb((Context) cas.a(car), bArr, a(str), bundle);
            eem.a(String.valueOf(cvc.getClass().getSimpleName()).concat(" does not support interstitial."));
        } catch (Throwable th) {
            cow.a("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    public final eeo b() {
        return eeo.a(this.a.a());
    }

    public final dqz c() {
        cvc cvc = this.a;
        if (!(cvc instanceof blc)) {
            return null;
        }
        try {
            return ((blc) cvc).getVideoController();
        } catch (Throwable th) {
            cow.a("", th);
            return null;
        }
    }

    public final void d() {
    }

    private static Bundle a(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Server parameters: ";
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        cow.a(5);
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                bundle2.putString(str3, jSONObject.getString(str3));
            }
            return bundle2;
        } catch (JSONException e) {
            cow.a("", e);
            throw new RemoteException();
        }
    }
}
