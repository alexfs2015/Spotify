package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: ahc reason: default package */
public final class ahc {
    private static final Set<String> a = new HashSet(Arrays.asList(new String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", LogMessage.SEVERITY_ERROR, "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"}));

    static String a(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_event";
        }
        String str2 = "fabric_";
        if (a.contains(str)) {
            StringBuilder sb = new StringBuilder(str2);
            sb.append(str);
            return sb.toString();
        }
        String replaceAll = str.replaceAll("[^\\p{Alnum}_]+", "_");
        if (replaceAll.startsWith("ga_") || replaceAll.startsWith("google_") || replaceAll.startsWith("firebase_") || !Character.isLetter(replaceAll.charAt(0))) {
            StringBuilder sb2 = new StringBuilder(str2);
            sb2.append(replaceAll);
            replaceAll = sb2.toString();
        }
        if (replaceAll.length() > 40) {
            replaceAll = replaceAll.substring(0, 40);
        }
        return replaceAll;
    }

    static void a(Bundle bundle, String str, Long l) {
        if (l != null) {
            bundle.putLong(str, l.longValue());
        }
    }

    static void a(Bundle bundle, String str, Integer num) {
        if (num != null) {
            bundle.putInt(str, num.intValue());
        }
    }

    static void a(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Bundle bundle, String str, Double d) {
        Double a2 = a((Object) d);
        if (a2 != null) {
            bundle.putDouble(str, a2.doubleValue());
        }
    }

    static Double a(Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf == null) {
            return null;
        }
        return Double.valueOf(valueOf);
    }

    static Integer b(String str) {
        if (str == null) {
            return null;
        }
        return Integer.valueOf(str.equals("true") ? 1 : 0);
    }

    static Double b(Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            return null;
        }
        return Double.valueOf(new BigDecimal(l.longValue()).divide(agl.a).doubleValue());
    }

    /* access modifiers changed from: 0000 */
    public void a(Bundle bundle, Map<String, Object> map) {
        String str;
        for (Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String str2 = (String) entry.getKey();
            if (str2 == null || str2.length() == 0) {
                str = "fabric_unnamed_parameter";
            } else {
                str = str2.replaceAll("[^\\p{Alnum}_]+", "_");
                if (str.startsWith("ga_") || str.startsWith("google_") || str.startsWith("firebase_") || !Character.isLetter(str.charAt(0))) {
                    StringBuilder sb = new StringBuilder("fabric_");
                    sb.append(str);
                    str = sb.toString();
                }
                if (str.length() > 40) {
                    str = str.substring(0, 40);
                }
            }
            if (value instanceof String) {
                bundle.putString(str, entry.getValue().toString());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Double) entry.getValue()).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Long) entry.getValue()).longValue());
            } else if (value instanceof Integer) {
                bundle.putInt(str, ((Integer) entry.getValue()).intValue());
            }
        }
    }
}
