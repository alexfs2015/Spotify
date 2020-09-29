package defpackage;

import java.util.Comparator;

/* renamed from: dmq reason: default package */
public final class dmq implements Comparator<dmd> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        dmd dmd = (dmd) obj;
        dmd dmd2 = (dmd) obj2;
        if (dmd.b < dmd2.b) {
            return -1;
        }
        if (dmd.b > dmd2.b) {
            return 1;
        }
        if (dmd.a < dmd2.a) {
            return -1;
        }
        if (dmd.a > dmd2.a) {
            return 1;
        }
        float f = (dmd.d - dmd.b) * (dmd.c - dmd.a);
        float f2 = (dmd2.d - dmd2.b) * (dmd2.c - dmd2.a);
        if (f > f2) {
            return -1;
        }
        if (f < f2) {
            return 1;
        }
        return 0;
    }
}
