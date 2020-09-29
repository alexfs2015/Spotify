package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: flr reason: default package */
public final class flr {
    private final flp a;
    private final List<flq> b = new ArrayList();

    public flr(flp flp) {
        this.a = flp;
        this.b.add(new flq(flp, new int[]{1}));
    }

    private flq a(int i) {
        int i2 = i;
        if (i2 >= this.b.size()) {
            List<flq> list = this.b;
            int i3 = 1;
            flq flq = (flq) list.get(list.size() - 1);
            int size = this.b.size();
            while (size <= i2) {
                flp flp = this.a;
                int[] iArr = new int[2];
                iArr[0] = i3;
                iArr[i3] = flp.g[(size - 1) + flp.k];
                flq flq2 = new flq(flp, iArr);
                if (flq.a.equals(flq2.a)) {
                    if (flq.a() || flq2.a()) {
                        flq = flq.a.i;
                    } else {
                        int[] iArr2 = flq.b;
                        int length = iArr2.length;
                        int[] iArr3 = flq2.b;
                        int length2 = iArr3.length;
                        int[] iArr4 = new int[((length + length2) - i3)];
                        for (int i4 = 0; i4 < length; i4++) {
                            int i5 = iArr2[i4];
                            for (int i6 = 0; i6 < length2; i6++) {
                                int i7 = i4 + i6;
                                iArr4[i7] = flp.a(iArr4[i7], flq.a.b(i5, iArr3[i6]));
                            }
                        }
                        flq = new flq(flq.a, iArr4);
                    }
                    this.b.add(flq);
                    size++;
                    i3 = 1;
                } else {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                }
            }
        }
        return (flq) this.b.get(i2);
    }

    public final void a(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                flq a2 = a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] iArr3 = new flq(this.a, iArr2).a(i, 1).a(a2)[1].b;
                int length2 = i - iArr3.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(iArr3, 0, iArr, length + length2, iArr3.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
