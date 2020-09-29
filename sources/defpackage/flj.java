package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: flj reason: default package */
public final class flj {
    static final String[] a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    static final int[][] c;
    private static final int[][] e;
    final byte[] d;

    static {
        Class<int> cls = int.class;
        int[][] iArr = (int[][]) Array.newInstance(cls, new int[]{5, 256});
        e = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            e[0][i] = (i - 65) + 2;
        }
        e[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            e[1][i2] = (i2 - 97) + 2;
        }
        e[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            e[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = e;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, a.aL, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            e[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                e[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(cls, new int[]{6, 6});
        c = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = c;
        iArr6[0][4] = 0;
        iArr6[1][4] = 0;
        iArr6[1][0] = 28;
        iArr6[3][4] = 0;
        iArr6[2][4] = 0;
        iArr6[2][0] = 15;
    }

    public flj(byte[] bArr) {
        this.d = bArr;
    }

    /* access modifiers changed from: 0000 */
    public void a(fll fll, int i, Collection<fll> collection) {
        char c2 = (char) (this.d[i] & 255);
        boolean z = e[fll.b][c2] > 0;
        fll fll2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = e[i2][c2];
            if (i3 > 0) {
                if (fll2 == null) {
                    fll2 = fll.b(i);
                }
                if (!z || i2 == fll.b || i2 == 2) {
                    collection.add(fll2.a(i2, i3));
                }
                if (!z && c[fll.b][i2] >= 0) {
                    collection.add(fll2.b(i2, i3));
                }
            }
        }
        if (fll.c > 0 || e[fll.b][c2] == 0) {
            collection.add(fll.a(i));
        }
    }

    static Collection<fll> a(Iterable<fll> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (fll a2 : iterable) {
            a(a2, i, i2, linkedList);
        }
        return a(linkedList);
    }

    private static void a(fll fll, int i, int i2, Collection<fll> collection) {
        fll b2 = fll.b(i);
        collection.add(b2.a(4, i2));
        if (fll.b != 4) {
            collection.add(b2.b(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(b2.a(2, 16 - i2).a(2, 1));
        }
        if (fll.c > 0) {
            collection.add(fll.a(i).a(i + 1));
        }
    }

    static Collection<fll> a(Iterable<fll> iterable) {
        LinkedList linkedList = new LinkedList();
        for (fll fll : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                fll fll2 = (fll) it.next();
                if (fll2.a(fll)) {
                    z = false;
                    break;
                } else if (fll.a(fll2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(fll);
            }
        }
        return linkedList;
    }
}
