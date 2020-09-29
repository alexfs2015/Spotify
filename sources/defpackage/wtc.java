package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: wtc reason: default package */
public final class wtc implements wtb {
    public static final wtc a = new wtc();

    private wtc() {
    }

    public final String[] a(Iterable<String> iterable, List<String> list, Set<String> set) {
        if (iterable == null) {
            return (String[]) list.toArray(new String[list.size()]);
        }
        ArrayList a2 = wxi.b().a(set.size());
        for (String str : iterable) {
            if (str == null) {
                break;
            }
            a2.add(str);
        }
        return (String[]) a2.toArray(new String[a2.size()]);
    }
}
