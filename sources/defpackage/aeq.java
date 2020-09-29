package defpackage;

/* renamed from: aeq reason: default package */
public final class aeq extends aeb implements afz {
    public aeq(String str) {
        super(str);
    }

    public final void a(int i, agi agi) {
        aga aga = (aga) agi;
        g().a(String.format("%s:%d", new Object[]{this.c, Integer.valueOf(i)}), aga.c(), aga.g(), aga.b(), aga.d(), aga.f(), aga.a(), aga.h());
    }

    public final void a(agi[] agiArr) {
        boolean[] zArr;
        int i;
        agi[] agiArr2 = agiArr;
        agd agd = b;
        Object[] objArr = new Object[2];
        objArr[0] = agiArr2;
        objArr[1] = Integer.valueOf(agiArr2 != null ? agiArr2.length : -1);
        agd.b("setItems(%s) %d", objArr);
        this.a = agiArr2;
        if (agiArr2 == null || agiArr2.length <= 0) {
            g().a(f(), null, null, null, null, null, null, null, null, null, null);
            return;
        }
        String[] strArr = new String[agiArr2.length];
        String[] strArr2 = new String[agiArr2.length];
        boolean[] zArr2 = new boolean[agiArr2.length];
        boolean[] zArr3 = new boolean[agiArr2.length];
        int[] iArr = new int[agiArr2.length];
        int[] iArr2 = new int[agiArr2.length];
        int[] iArr3 = new int[agiArr2.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < agiArr2.length; i5++) {
            aga aga = (aga) agiArr2[i5];
            byte[] b = aga.b();
            iArr[i5] = b == null ? 0 : b.length;
            i2 += iArr[i5];
            byte[] d = aga.d();
            iArr2[i5] = d == null ? 0 : d.length;
            i3 += iArr2[i5];
            byte[] f = aga.f();
            iArr3[i5] = f == null ? 0 : f.length;
            i4 += iArr3[i5];
            zArr2[i5] = aga.a();
            zArr3[i5] = aga.h();
        }
        byte[] bArr = new byte[i2];
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[i4];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < agiArr2.length) {
            aga aga2 = (aga) agiArr2[i6];
            strArr[i6] = aga2.c();
            strArr2[i6] = aga2.g();
            if (aga2.b() != null) {
                zArr = zArr3;
                i = 0;
                System.arraycopy(aga2.b(), 0, bArr, i7, iArr[i6]);
                i7 += iArr[i6];
            } else {
                zArr = zArr3;
                i = 0;
            }
            if (aga2.d() != null) {
                System.arraycopy(aga2.d(), i, bArr2, i8, iArr2[i6]);
                i8 += iArr2[i6];
            }
            if (aga2.f() != null) {
                int i10 = i9;
                System.arraycopy(aga2.f(), i, bArr3, i10, iArr3[i6]);
                i9 = i10 + iArr3[i6];
            } else {
                int i11 = i9;
            }
            i6++;
            agiArr2 = agiArr;
            zArr3 = zArr;
        }
        boolean[] zArr4 = zArr3;
        g().a(f(), strArr, strArr2, iArr, bArr, iArr2, bArr2, iArr3, bArr3, zArr2, zArr3);
    }
}
