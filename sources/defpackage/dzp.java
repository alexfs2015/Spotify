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

@cfp
/* renamed from: dzp reason: default package */
public final class dzp {
    final Map<dzq, dzr> a = new HashMap();
    final LinkedList<dzq> b = new LinkedList<>();
    dyk c;

    static Set<String> a(dpp dpp) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(dpp.c.keySet());
        Bundle bundle = dpp.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
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

    static void a(String str, dzq dzq) {
        if (cml.a(2)) {
            String.format(str, new Object[]{dzq});
            cml.a();
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

    static dpp b(dpp dpp) {
        dpp d = d(dpp);
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
                sb.append(Base64.encodeToString(((dzq) it.next()).toString().getBytes("UTF-8"), 0));
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
            return Pattern.matches((String) dqe.f().a(dtg.aY), str);
        } catch (RuntimeException e) {
            bkc.i().a((Throwable) e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    static dpp c(dpp dpp) {
        String[] split;
        dpp d = d(dpp);
        for (String str : ((String) dqe.f().a(dtg.aU)).split(",")) {
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

    private static dpp d(dpp dpp) {
        Parcel obtain = Parcel.obtain();
        dpp.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        dpp dpp2 = (dpp) dpp.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return ((Boolean) dqe.f().a(dtg.aL)).booleanValue() ? dpp2.a() : dpp2;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (this.c != null) {
            for (Entry entry : this.a.entrySet()) {
                dzq dzq = (dzq) entry.getKey();
                dzr dzr = (dzr) entry.getValue();
                if (cml.a(2)) {
                    int size = dzr.a.size();
                    int a2 = dzr.a();
                    if (a2 < size) {
                        String.format("Loading %s/%s pooled interstitials for %s.", new Object[]{Integer.valueOf(size - a2), Integer.valueOf(size), dzq});
                        cml.a();
                    }
                }
                int b2 = dzr.b() + 0;
                while (true) {
                    if (dzr.a.size() >= ((Integer) dqe.f().a(dtg.aW)).intValue()) {
                        break;
                    }
                    a("Pooling and loading one new interstitial for %s.", dzq);
                    if (dzr.a(this.c)) {
                        b2++;
                    }
                }
                dzt.a().a(b2);
            }
            dyk dyk = this.c;
            if (dyk != null) {
                Editor edit = dyk.a.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
                edit.clear();
                for (Entry entry2 : this.a.entrySet()) {
                    dzq dzq2 = (dzq) entry2.getKey();
                    dzr dzr2 = (dzr) entry2.getValue();
                    if (dzr2.e) {
                        edit.putString(dzq2.toString(), new dzv(dzr2).a());
                        a("Saved interstitial queue for %s.", dzq2);
                    }
                }
                edit.putString("PoolKeys", b());
                edit.apply();
            }
        }
    }
}
