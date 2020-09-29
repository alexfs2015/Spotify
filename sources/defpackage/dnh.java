package defpackage;

import java.util.Comparator;

/* renamed from: dnh reason: default package */
public final class dnh implements Comparator<dmu> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        dmu dmu = (dmu) obj;
        dmu dmu2 = (dmu) obj2;
        if (dmu.b < dmu2.b) {
            return -1;
        }
        if (dmu.b > dmu2.b) {
            return 1;
        }
        if (dmu.a < dmu2.a) {
            return -1;
        }
        if (dmu.a > dmu2.a) {
            return 1;
        }
        float f = (dmu.d - dmu.b) * (dmu.c - dmu.a);
        float f2 = (dmu2.d - dmu2.b) * (dmu2.c - dmu2.a);
        if (f > f2) {
            return -1;
        }
        return f < f2 ? 1 : 0;
    }
}
