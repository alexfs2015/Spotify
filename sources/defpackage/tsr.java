package defpackage;

import java.util.LinkedList;
import java.util.List;

/* renamed from: tsr reason: default package */
public final class tsr {
    private static void a(List<Integer> list, int i) {
        if (i != 0 && gd.b(i, -16777216) >= 3.0d) {
            list.add(Integer.valueOf(i));
        }
    }

    public static int a(nl nlVar, int i) {
        List a = a(nlVar);
        if (!a.isEmpty()) {
            return ((Integer) a.get(0)).intValue();
        }
        return -11316397;
    }

    private static List<Integer> a(nl nlVar) {
        int i;
        LinkedList linkedList = new LinkedList();
        if (nlVar != null) {
            a((List<Integer>) linkedList, nlVar.c(0));
            a((List<Integer>) linkedList, nlVar.a(0));
            if (nlVar.b != null) {
                i = nlVar.b.a;
            } else {
                i = 0;
            }
            a((List<Integer>) linkedList, i);
            a((List<Integer>) linkedList, nlVar.b(0));
            a((List<Integer>) linkedList, nlVar.a(nm.d, 0));
            a((List<Integer>) linkedList, nlVar.a(nm.c, 0));
            a((List<Integer>) linkedList, nlVar.a(nm.f, 0));
        }
        return linkedList;
    }
}
