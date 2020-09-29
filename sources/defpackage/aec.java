package defpackage;

/* renamed from: aec reason: default package */
public final class aec extends adn implements afl {
    public aec(String str) {
        super(str);
    }

    public final void a(afu[] afuArr) {
        boolean[] zArr;
        int i;
        int i2;
        int i3;
        int i4;
        afu[] afuArr2 = afuArr;
        afp afp = b;
        Object[] objArr = new Object[2];
        objArr[0] = afuArr2;
        objArr[1] = Integer.valueOf(afuArr2 != null ? afuArr2.length : -1);
        afp.b("setItems(%s) %d", objArr);
        this.a = afuArr2;
        if (afuArr2 == null || afuArr2.length <= 0) {
            g().a(f(), null, null, null, null, null, null, null, null, null, null);
            return;
        }
        String[] strArr = new String[afuArr2.length];
        String[] strArr2 = new String[afuArr2.length];
        boolean[] zArr2 = new boolean[afuArr2.length];
        boolean[] zArr3 = new boolean[afuArr2.length];
        int[] iArr = new int[afuArr2.length];
        int[] iArr2 = new int[afuArr2.length];
        int[] iArr3 = new int[afuArr2.length];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < afuArr2.length; i8++) {
            afm afm = (afm) afuArr2[i8];
            byte[] b = afm.b();
            if (b == null) {
                i2 = 0;
            } else {
                i2 = b.length;
            }
            iArr[i8] = i2;
            i5 += iArr[i8];
            byte[] d = afm.d();
            if (d == null) {
                i3 = 0;
            } else {
                i3 = d.length;
            }
            iArr2[i8] = i3;
            i6 += iArr2[i8];
            byte[] f = afm.f();
            if (f == null) {
                i4 = 0;
            } else {
                i4 = f.length;
            }
            iArr3[i8] = i4;
            i7 += iArr3[i8];
            zArr2[i8] = afm.a();
            zArr3[i8] = afm.h();
        }
        byte[] bArr = new byte[i5];
        byte[] bArr2 = new byte[i6];
        byte[] bArr3 = new byte[i7];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 < afuArr2.length) {
            afm afm2 = (afm) afuArr2[i9];
            strArr[i9] = afm2.c();
            strArr2[i9] = afm2.g();
            if (afm2.b() != null) {
                zArr = zArr3;
                i = 0;
                System.arraycopy(afm2.b(), 0, bArr, i10, iArr[i9]);
                i10 += iArr[i9];
            } else {
                zArr = zArr3;
                i = 0;
            }
            if (afm2.d() != null) {
                System.arraycopy(afm2.d(), i, bArr2, i11, iArr2[i9]);
                i11 += iArr2[i9];
            }
            if (afm2.f() != null) {
                int i13 = i12;
                System.arraycopy(afm2.f(), i, bArr3, i13, iArr3[i9]);
                i12 = i13 + iArr3[i9];
            } else {
                int i14 = i12;
            }
            i9++;
            afuArr2 = afuArr;
            zArr3 = zArr;
        }
        boolean[] zArr4 = zArr3;
        g().a(f(), strArr, strArr2, iArr, bArr, iArr2, bArr2, iArr3, bArr3, zArr2, zArr3);
    }

    public final void a(int i, afu afu) {
        afm afm = (afm) afu;
        g().a(String.format("%s:%d", new Object[]{this.c, Integer.valueOf(i)}), afm.c(), afm.g(), afm.b(), afm.d(), afm.f(), afm.a(), afm.h());
    }
}
