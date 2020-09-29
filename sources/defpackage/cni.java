package defpackage;

import java.util.ArrayList;
import java.util.List;

@cey
/* renamed from: cni reason: default package */
public final class cni {
    final double[] a;
    final double[] b;
    final int[] c;
    int d;
    private final String[] e;

    /* synthetic */ cni(cnk cnk, byte b2) {
        this(cnk);
    }

    private static double[] a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public final List<cnj> a() {
        ArrayList arrayList = new ArrayList(this.e.length);
        int i = 0;
        while (true) {
            String[] strArr = this.e;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d2 = this.b[i];
            double d3 = this.a[i];
            int[] iArr = this.c;
            double d4 = (double) iArr[i];
            double d5 = (double) this.d;
            Double.isNaN(d4);
            Double.isNaN(d5);
            cnj cnj = new cnj(str, d2, d3, d4 / d5, iArr[i]);
            arrayList.add(cnj);
            i++;
        }
    }

    private cni(cnk cnk) {
        int size = cnk.b.size();
        this.e = (String[]) cnk.a.toArray(new String[size]);
        this.a = a(cnk.b);
        this.b = a(cnk.c);
        this.c = new int[size];
        this.d = 0;
    }
}
