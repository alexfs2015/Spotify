package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: wet reason: default package */
final class wet {
    static List<String> a(Iterable<String> iterable) {
        if (iterable == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (String str : iterable) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("protocol cannot be null or empty");
            }
            arrayList.add(str);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new IllegalArgumentException("protocols cannot empty");
    }
}
