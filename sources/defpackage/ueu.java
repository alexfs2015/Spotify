package defpackage;

import java.util.LinkedList;
import java.util.List;

/* renamed from: ueu reason: default package */
public final class ueu {
    public static int a(nq nqVar, int i) {
        List a = a(nqVar);
        if (!a.isEmpty()) {
            return ((Integer) a.get(0)).intValue();
        }
        return -11316397;
    }

    private static List<Integer> a(nq nqVar) {
        LinkedList linkedList = new LinkedList();
        if (nqVar != null) {
            a((List<Integer>) linkedList, nqVar.d(0));
            a((List<Integer>) linkedList, nqVar.a(0));
            a((List<Integer>) linkedList, nqVar.g(0));
            a((List<Integer>) linkedList, nqVar.b(0));
            a((List<Integer>) linkedList, nqVar.e(0));
            a((List<Integer>) linkedList, nqVar.c(0));
            a((List<Integer>) linkedList, nqVar.f(0));
        }
        return linkedList;
    }

    private static void a(List<Integer> list, int i) {
        if (i != 0 && gd.b(i, -16777216) >= 3.0d) {
            list.add(Integer.valueOf(i));
        }
    }
}
