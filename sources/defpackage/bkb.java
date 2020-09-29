package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;

@cey
/* renamed from: bkb reason: default package */
public final class bkb {
    public static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            String str = obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString();
            sb.append(str);
        }
        return sb.toString();
    }
}
