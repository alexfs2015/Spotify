package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: wsj reason: default package */
final class wsj {
    static void a(StringBuilder sb) {
        sb.setLength(sb.length() - wxt.a.length());
    }

    static void a(StringBuilder sb, wsg wsg) {
        Iterator it = wsg.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
            sb.append(wxt.a);
        }
    }

    static void a(StringBuilder sb, wsi wsi) {
        sb.append(wxt.a((Object) wsi));
        sb.append("(decodeResult: ");
        sb.append(wsi.b());
        sb.append(", version: ");
        sb.append(wsi.e());
        sb.append(')');
        sb.append(wxt.a);
    }

    static void a(StringBuilder sb, wsp wsp) {
        sb.append(wsp.e());
        sb.append(' ');
        sb.append(wsp.f());
        sb.append(wxt.a);
    }
}
