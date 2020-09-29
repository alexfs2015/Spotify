package defpackage;

/* renamed from: adn reason: default package */
public class adn extends aes implements afb {
    protected afu[] a;

    public adn(String str) {
        super(str);
        b.b("InternalList(%s)", str);
    }

    public void a(afu[] afuArr) {
        afp afp = b;
        Object[] objArr = new Object[2];
        objArr[0] = afuArr;
        objArr[1] = Integer.valueOf(afuArr != null ? afuArr.length : -1);
        afp.b("setItems(%s) %d", objArr);
        this.a = afuArr;
        if (afuArr == null || afuArr.length <= 0) {
            this.a = new afu[0];
            g().a(this.c, new String[0], null, null, null, null);
        } else {
            afu afu = afuArr[0];
            if ((afu instanceof afg) || (afu instanceof afc) || (afu instanceof afe)) {
                b.b("setItems() creating litems with length %d", Integer.valueOf(afuArr.length));
                String[] strArr = new String[afuArr.length];
                String[] strArr2 = new String[afuArr.length];
                String[] strArr3 = new String[afuArr.length];
                int[] iArr = new int[afuArr.length];
                int i = 0;
                int i2 = 0;
                while (i < afuArr.length) {
                    byte[] b = afuArr[i].b();
                    if (b != null) {
                        iArr[i] = b.length;
                        i2 += iArr[i];
                        b.b("setItems(): iconSizes[%d]=%d", Integer.valueOf(i), Integer.valueOf(iArr[i]));
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder("Icon for item with index ");
                        sb.append(i);
                        sb.append(" is null. No null icons allowed.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                byte[] bArr = new byte[i2];
                b.b("setItems(): total iconsSize=%d", Integer.valueOf(i2));
                int i3 = 0;
                for (int i4 = 0; i4 < afuArr.length; i4++) {
                    afe afe = afuArr[i4];
                    String[] a2 = a((afu) afe);
                    if (a2.length > 2) {
                        strArr3[i4] = a2[2];
                    }
                    if (a2.length > 1) {
                        strArr2[i4] = a2[1];
                    }
                    if (a2.length > 0) {
                        strArr[i4] = a2[0];
                    }
                    if (afe.b() != null) {
                        System.arraycopy(afe.b(), 0, bArr, i3, iArr[i4]);
                        i3 += iArr[i4];
                    }
                }
                g().a(this.c, strArr, strArr2, strArr3, iArr, bArr);
            } else {
                b.b("setItems() creating sitems with length %d", Integer.valueOf(afuArr.length));
                String[] strArr4 = new String[afuArr.length];
                for (int i5 = 0; i5 < afuArr.length; i5++) {
                    aff aff = afuArr[i5];
                    String c = aff.c();
                    b.b("setItems() si.getLine()=%s", c);
                    if (c == null) {
                        strArr4[i5] = "";
                    } else {
                        strArr4[i5] = new String(aff.c());
                    }
                }
                g().a(this.c, strArr4, null, null, null, null);
            }
        }
    }

    public void a(int i, afu afu) {
        byte[] bArr;
        String[] a2 = a(afu);
        String str = null;
        if ((afu instanceof afe) || (afu instanceof afc) || (afu instanceof afg)) {
            bArr = ((afe) afu).b();
        } else {
            bArr = null;
        }
        aei g = g();
        String format = String.format("%s:%d", new Object[]{this.c, Integer.valueOf(i)});
        String str2 = a2.length > 0 ? a2[0] : null;
        String str3 = a2.length > 1 ? a2[1] : null;
        if (a2.length > 2) {
            str = a2[2];
        }
        g.a(format, str2, str3, str, bArr);
    }

    public final afu[] a() {
        return this.a;
    }

    private static String[] a(afu afu) {
        String str = "<null>";
        if (afu instanceof afg) {
            String[] strArr = new String[3];
            afg afg = (afg) afu;
            strArr[0] = afg.c() == null ? str : afg.c();
            strArr[1] = afg.a() == null ? str : afg.a();
            if (afg.d() != null) {
                str = afg.d();
            }
            strArr[2] = str;
            return strArr;
        } else if (afu instanceof afc) {
            String[] strArr2 = new String[2];
            afc afc = (afc) afu;
            strArr2[0] = afc.c() == null ? str : afc.c();
            if (afc.a() != null) {
                str = afc.a();
            }
            strArr2[1] = str;
            return strArr2;
        } else if (afu instanceof afe) {
            String[] strArr3 = new String[1];
            afe afe = (afe) afu;
            if (afe.c() != null) {
                str = afe.c();
            }
            strArr3[0] = str;
            return strArr3;
        } else if (!(afu instanceof aff)) {
            return null;
        } else {
            String[] strArr4 = new String[1];
            aff aff = (aff) afu;
            if (aff.c() != null) {
                str = aff.c();
            }
            strArr4[0] = str;
            return strArr4;
        }
    }
}
