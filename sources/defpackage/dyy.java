package defpackage;

import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@cey
/* renamed from: dyy reason: default package */
public final class dyy {
    final Map<dyz, dza> a = new HashMap();
    final LinkedList<dyz> b = new LinkedList<>();
    dxt c;

    static Set<String> a(doy doy) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(doy.c.keySet());
        Bundle bundle = doy.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    private static void a(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split("/", 2);
            if (split.length != 0) {
                String str2 = split[0];
                if (split.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = split[1];
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    static String[] a(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException unused) {
            return new String[0];
        }
    }

    static doy b(doy doy) {
        doy d = d(doy);
        Bundle bundle = d.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        String str = "_skipMediation";
        if (bundle != null) {
            bundle.putBoolean(str, true);
        }
        d.c.putBoolean(str, true);
        return d;
    }

    private final String b() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                sb.append(Base64.encodeToString(((dyz) it.next()).toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    sb.append("\u0000");
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    static boolean b(String str) {
        try {
            return Pattern.matches((String) dpn.f().a(dsp.aY), str);
        } catch (RuntimeException e) {
            bjl.i().a((Throwable) e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    static doy c(doy doy) {
        String[] split;
        doy d = d(doy);
        for (String str : ((String) dpn.f().a(dsp.aU)).split(",")) {
            a(d.m, str);
            String str2 = "com.google.ads.mediation.admob.AdMobAdapter/";
            if (str.startsWith(str2)) {
                a(d.c, str.replaceFirst(str2, ""));
            }
        }
        return d;
    }

    static String c(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            return matcher.matches() ? matcher.group(1) : str;
        } catch (RuntimeException unused) {
            return str;
        }
    }

    private static doy d(doy doy) {
        Parcel obtain = Parcel.obtain();
        doy.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        doy doy2 = (doy) doy.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return ((Boolean) dpn.f().a(dsp.aL)).booleanValue() ? doy2.a() : doy2;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (this.c != null) {
            for (Entry entry : this.a.entrySet()) {
                dyz dyz = (dyz) entry.getKey();
                dza dza = (dza) entry.getValue();
                if (clu.a(2)) {
                    int size = dza.a.size();
                    int a2 = dza.a();
                    if (a2 < size) {
                        String.format("Loading %s/%s pooled interstitials for %s.", new Object[]{Integer.valueOf(size - a2), Integer.valueOf(size), dyz});
                        clu.a();
                    }
                }
                int b2 = dza.b() + 0;
                while (true) {
                    if (dza.a.size() >= ((Integer) dpn.f().a(dsp.aW)).intValue()) {
                        break;
                    }
                    a("Pooling and loading one new interstitial for %s.", dyz);
                    if (dza.a(this.c)) {
                        b2++;
                    }
                }
                dzc.a().a(b2);
            }
            dxt dxt = this.c;
            if (dxt != null) {
                Editor edit = dxt.a.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
                edit.clear();
                for (Entry entry2 : this.a.entrySet()) {
                    dyz dyz2 = (dyz) entry2.getKey();
                    dza dza2 = (dza) entry2.getValue();
                    if (dza2.e) {
                        edit.putString(dyz2.toString(), new dze(dza2).a());
                        a("Saved interstitial queue for %s.", dyz2);
                    }
                }
                edit.putString("PoolKeys", b());
                edit.apply();
            }
        }
    }

    static void a(String str, dyz dyz) {
        if (clu.a(2)) {
            String.format(str, new Object[]{dyz});
            clu.a();
        }
    }
}
