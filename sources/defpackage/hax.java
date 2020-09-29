package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: hax reason: default package */
final class hax {
    public static String a(Object... objArr) {
        StringBuilder sb = new StringBuilder(1024);
        for (Object a : objArr) {
            a(sb, a);
            sb.append(9);
        }
        if (objArr.length != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private static void a(StringBuilder sb, Object obj) {
        if (obj instanceof Long) {
            sb.append(obj);
        } else if (obj instanceof String) {
            sb.append(obj);
        } else if (obj instanceof Double) {
            sb.append(obj);
        } else if (obj instanceof Boolean) {
            sb.append(obj);
        } else if (obj instanceof byte[]) {
            gbh.a(sb, (byte[]) obj);
        } else if (obj instanceof List) {
            a(sb, (List) obj);
        } else if (obj instanceof Map) {
            a(sb, (Map) obj);
        } else if (obj instanceof String[]) {
            a(sb, (String[]) obj);
        } else {
            if (obj != null) {
                Assertion.a("Invalid type for message field.");
            }
        }
    }

    private static void a(StringBuilder sb, String[] strArr) {
        a(sb, Arrays.asList(strArr));
    }

    private static void a(StringBuilder sb, List<?> list) {
        boolean z = false;
        for (Object next : list) {
            if (z) {
                sb.append(',');
            } else {
                z = true;
            }
            a(sb, next);
        }
    }

    private static void a(StringBuilder sb, Map<?, ?> map) {
        boolean z = false;
        for (Entry entry : map.entrySet()) {
            if (z) {
                sb.append(',');
            } else {
                z = true;
            }
            a(sb, entry.getKey());
            sb.append(':');
            a(sb, entry.getValue());
        }
    }
}
