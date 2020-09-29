package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fml reason: default package */
public final class fml {
    private final fmj a;
    private final List<fmk> b = new ArrayList();

    public fml(fmj fmj) {
        this.a = fmj;
        this.b.add(new fmk(fmj, new int[]{1}));
    }

    private fmk a(int i) {
        int i2 = i;
        if (i2 >= this.b.size()) {
            List<fmk> list = this.b;
            int i3 = 1;
            fmk fmk = (fmk) list.get(list.size() - 1);
            int size = this.b.size();
            while (size <= i2) {
                fmj fmj = this.a;
                int[] iArr = new int[2];
                iArr[0] = i3;
                iArr[i3] = fmj.g[(size - 1) + fmj.k];
                fmk fmk2 = new fmk(fmj, iArr);
                if (fmk.a.equals(fmk2.a)) {
                    if (fmk.a() || fmk2.a()) {
                        fmk = fmk.a.i;
                    } else {
                        int[] iArr2 = fmk.b;
                        int length = iArr2.length;
                        int[] iArr3 = fmk2.b;
                        int length2 = iArr3.length;
                        int[] iArr4 = new int[((length + length2) - i3)];
                        for (int i4 = 0; i4 < length; i4++) {
                            int i5 = iArr2[i4];
                            for (int i6 = 0; i6 < length2; i6++) {
                                int i7 = i4 + i6;
                                iArr4[i7] = fmj.a(iArr4[i7], fmk.a.b(i5, iArr3[i6]));
                            }
                        }
                        fmk = new fmk(fmk.a, iArr4);
                    }
                    this.b.add(fmk);
                    size++;
                    i3 = 1;
                } else {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                }
            }
        }
        return (fmk) this.b.get(i2);
    }

    public final void a(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                fmk a2 = a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] iArr3 = new fmk(this.a, iArr2).a(i, 1).a(a2)[1].b;
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
