package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.util.HashSet;
import java.util.Set;

/* renamed from: scn reason: default package */
public final class scn {
    private final Set<scp> a;

    public scn(Set<scp> set) {
        this.a = set;
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("---");
        sb.append(str2);
        return sb.toString();
    }

    public static String c(String str) {
        String[] split = str.split("---");
        return split.length != 2 ? str : split[1];
    }

    public final boolean a(String str) {
        HashSet<scp> hashSet = new HashSet<>(1);
        for (scp scp : this.a) {
            if (scp.a(str)) {
                hashSet.add(scp);
            }
        }
        if (hashSet.size() > 1) {
            for (scp scp2 : hashSet) {
                Logger.e("Configurator for package '%s': '%s'", str, scp2.getClass().getName());
            }
            Assertion.b(String.format("Multiple handlers registered for package: '%s'", new Object[]{str}));
        }
        return !hashSet.isEmpty();
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
}
