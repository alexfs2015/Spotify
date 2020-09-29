package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: efb reason: default package */
public final class efb extends eew {
    private final cvt a;

    public efb(cvt cvt) {
        this.a = cvt;
    }

    private static Bundle a(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Server parameters: ";
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        cpn.a(5);
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
            cpn.a("", e);
            throw new RemoteException();
        }
    }

    public final eff a() {
        return eff.a(this.a.b());
    }

    public final void a(cbi cbi, String str, Bundle bundle, eey eey) {
        int i;
        try {
            new efe(eey);
            Context context = (Context) cbj.a(cbi);
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
                i = cvu.a;
            } else if (c == 1) {
                i = cvu.b;
            } else if (c == 2) {
                i = cvu.c;
            } else if (c == 3) {
                i = cvu.d;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            new cvv(context, i, bundle);
        } catch (Throwable th) {
            cpn.a("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    public final void a(byte[] bArr, String str, Bundle bundle, cbi cbi, eer eer, edm edm, dpt dpt) {
        try {
            efc efc = new efc(eer, edm);
            cvt cvt = this.a;
            new cvs((Context) cbj.a(cbi), bArr, a(str), bundle);
            blz.a(dpt.e, dpt.b, dpt.a);
            efc.a(String.valueOf(cvt.getClass().getSimpleName()).concat(" does not support banner."));
        } catch (Throwable th) {
            cpn.a("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    public final void a(byte[] bArr, String str, Bundle bundle, cbi cbi, eet eet, edm edm) {
        try {
            efd efd = new efd(this, eet, edm);
            cvt cvt = this.a;
            new cvs((Context) cbj.a(cbi), bArr, a(str), bundle);
            efd.a(String.valueOf(cvt.getClass().getSimpleName()).concat(" does not support interstitial."));
        } catch (Throwable th) {
            cpn.a("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    public final eff b() {
        return eff.a(this.a.a());
    }

    public final drq c() {
        cvt cvt = this.a;
        if (!(cvt instanceof blt)) {
            return null;
        }
        try {
            return ((blt) cvt).getVideoController();
        } catch (Throwable th) {
            cpn.a("", th);
            return null;
        }
    }

    public final void d() {
    }
}
