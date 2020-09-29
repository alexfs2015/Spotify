package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bep reason: default package */
public final class bep {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    private bep(List<byte[]> list, int i, int i2, int i3, float f) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public static bep a(bea bea) {
        float f;
        int i;
        int i2;
        try {
            bea.d(4);
            int c2 = (bea.c() & 3) + 1;
            if (c2 != 3) {
                ArrayList arrayList = new ArrayList();
                int c3 = bea.c() & 31;
                for (int i3 = 0; i3 < c3; i3++) {
                    arrayList.add(b(bea));
                }
                int c4 = bea.c();
                for (int i4 = 0; i4 < c4; i4++) {
                    arrayList.add(b(bea));
                }
                if (c3 > 0) {
                    b a2 = bdy.a((byte[]) arrayList.get(0), c2, ((byte[]) arrayList.get(0)).length);
                    int i5 = a2.e;
                    int i6 = a2.f;
                    f = a2.g;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                bep bep = new bep(arrayList, c2, i2, i, f);
                return bep;
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ParserException("Error parsing AVC config", e2);
        }
    }

    private static byte[] b(bea bea) {
        int d2 = bea.d();
        int i = bea.b;
        bea.d(d2);
        return bdo.a(bea.a, i, d2);
    }
}
