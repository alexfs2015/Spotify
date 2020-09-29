package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.util.HashSet;
import java.util.Set;

/* renamed from: rtg reason: default package */
public final class rtg {
    private final Set<rti> a;

    public rtg(Set<rti> set) {
        this.a = set;
    }

    public final boolean a(String str) {
        HashSet<rti> hashSet = new HashSet<>(1);
        for (rti rti : this.a) {
            if (rti.a(str)) {
                hashSet.add(rti);
            }
        }
        if (hashSet.size() > 1) {
            for (rti rti2 : hashSet) {
                Logger.e("Configurator for package '%s': '%s'", str, rti2.getClass().getName());
            }
            Assertion.b(String.format("Multiple handlers registered for package: '%s'", new Object[]{str}));
        }
        if (!hashSet.isEmpty()) {
            return true;
        }
        return false;
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("---");
        sb.append(str2);
        return sb.toString();
    }

    public final String b(String str) {
        String[] split = str.split("---");
        if (split.length != 2) {
            if (a(str)) {
                return str;
            }
            return null;
        } else if (a(split[0])) {
            return split[0];
        } else {
            return null;
        }
    }

    public static String c(String str) {
        String[] split = str.split("---");
        if (split.length != 2) {
            return str;
        }
        return split[1];
    }
}
