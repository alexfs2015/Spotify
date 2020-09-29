package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: ffp reason: default package */
public final class ffp {
    private static final List<String> a = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open"});
    private static final List<String> b = Arrays.asList(new String[]{"auto", "app", "am"});
    private static final List<String> c = Arrays.asList(new String[]{"_r", "_dbg"});
    private static final List<String> d = Arrays.asList((String[]) bzu.a(a.a, a.b));
    private static final List<String> e = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    static {
        new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
    }

    public static boolean a(String str) {
        return !b.contains(str);
    }

    public static boolean a(String str, Bundle bundle) {
        if (a.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String containsKey : c) {
                if (bundle.containsKey(containsKey)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        String str3 = "fcm";
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(str3) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(str3) || str.equals("fiam");
        }
        if (d.contains(str2)) {
            return false;
        }
        for (String matches : e) {
            if (str2.matches(matches)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        for (String containsKey : c) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c2 = 2;
                }
            } else if (str.equals("fdl")) {
                c2 = 1;
            }
        } else if (str.equals("fcm")) {
            c2 = 0;
        }
        String str3 = "_cis";
        if (c2 == 0) {
            bundle.putString(str3, "fcm_integration");
            return true;
        } else if (c2 == 1) {
            bundle.putString(str3, "fdl_integration");
            return true;
        } else if (c2 != 2) {
            return false;
        } else {
            bundle.putString(str3, "fiam_integration");
            return true;
        }
    }
}
