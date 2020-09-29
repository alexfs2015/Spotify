package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: wed reason: default package */
final class wed {
    static void a(StringBuilder sb, wec wec) {
        sb.append(wjn.a((Object) wec));
        sb.append("(decodeResult: ");
        sb.append(wec.b());
        sb.append(", version: ");
        sb.append(wec.e());
        sb.append(')');
        sb.append(wjn.a);
    }

    static void a(StringBuilder sb, wej wej) {
        sb.append(wej.e());
        sb.append(' ');
        sb.append(wej.f());
        sb.append(wjn.a);
    }

    static void a(StringBuilder sb, wea wea) {
        Iterator it = wea.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
            sb.append(wjn.a);
        }
    }

    static void a(StringBuilder sb) {
        sb.setLength(sb.length() - wjn.a.length());
    }
}
