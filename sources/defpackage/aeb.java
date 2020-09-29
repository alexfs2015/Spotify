package defpackage;

/* renamed from: aeb reason: default package */
public class aeb extends afg implements afp {
    protected agi[] a;

    public aeb(String str) {
        super(str);
        b.b("InternalList(%s)", str);
    }

    private static String[] a(agi agi) {
        String str = "<null>";
        if (agi instanceof afu) {
            String[] strArr = new String[3];
            afu afu = (afu) agi;
            strArr[0] = afu.c() == null ? str : afu.c();
            strArr[1] = afu.a() == null ? str : afu.a();
            if (afu.d() != null) {
                str = afu.d();
            }
            strArr[2] = str;
            return strArr;
        } else if (agi instanceof afq) {
            String[] strArr2 = new String[2];
            afq afq = (afq) agi;
            strArr2[0] = afq.c() == null ? str : afq.c();
            if (afq.a() != null) {
                str = afq.a();
            }
            strArr2[1] = str;
            return strArr2;
        } else if (agi instanceof afs) {
            String[] strArr3 = new String[1];
            afs afs = (afs) agi;
            if (afs.c() != null) {
                str = afs.c();
            }
            strArr3[0] = str;
            return strArr3;
        } else if (!(agi instanceof aft)) {
            return null;
        } else {
            String[] strArr4 = new String[1];
            aft aft = (aft) agi;
            if (aft.c() != null) {
                str = aft.c();
            }
            strArr4[0] = str;
            return strArr4;
        }
    }

    public void a(int i, agi agi) {
        String[] a2 = a(agi);
        String str = null;
        byte[] b = ((agi instanceof afs) || (agi instanceof afq) || (agi instanceof afu)) ? ((afs) agi).b() : null;
        aew g = g();
        String format = String.format("%s:%d", new Object[]{this.c, Integer.valueOf(i)});
        String str2 = a2.length > 0 ? a2[0] : null;
        String str3 = a2.length > 1 ? a2[1] : null;
        if (a2.length > 2) {
            str = a2[2];
        }
        g.a(format, str2, str3, str, b);
    }

    public void a(agi[] agiArr) {
        agd agd = b;
        Object[] objArr = new Object[2];
        objArr[0] = agiArr;
        objArr[1] = Integer.valueOf(agiArr != null ? agiArr.length : -1);
        agd.b("setItems(%s) %d", objArr);
        this.a = agiArr;
        if (agiArr == null || agiArr.length <= 0) {
            this.a = new agi[0];
            g().a(this.c, new String[0], null, null, null, null);
        } else {
            agi agi = agiArr[0];
            if ((agi instanceof afu) || (agi instanceof afq) || (agi instanceof afs)) {
                b.b("setItems() creating litems with length %d", Integer.valueOf(agiArr.length));
                String[] strArr = new String[agiArr.length];
                String[] strArr2 = new String[agiArr.length];
                String[] strArr3 = new String[agiArr.length];
                int[] iArr = new int[agiArr.length];
                int i = 0;
                int i2 = 0;
                while (i < agiArr.length) {
                    byte[] b = agiArr[i].b();
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
                for (int i4 = 0; i4 < agiArr.length; i4++) {
                    afs afs = agiArr[i4];
                    String[] a2 = a((agi) afs);
                    if (a2.length > 2) {
                        strArr3[i4] = a2[2];
                    }
                    if (a2.length > 1) {
                        strArr2[i4] = a2[1];
                    }
                    if (a2.length > 0) {
                        strArr[i4] = a2[0];
                    }
                    if (afs.b() != null) {
                        System.arraycopy(afs.b(), 0, bArr, i3, iArr[i4]);
                        i3 += iArr[i4];
                    }
                }
                g().a(this.c, strArr, strArr2, strArr3, iArr, bArr);
            } else {
                b.b("setItems() creating sitems with length %d", Integer.valueOf(agiArr.length));
                String[] strArr4 = new String[agiArr.length];
                for (int i5 = 0; i5 < agiArr.length; i5++) {
                    aft aft = agiArr[i5];
                    String c = aft.c();
                    b.b("setItems() si.getLine()=%s", c);
                    if (c == null) {
                        strArr4[i5] = "";
                    } else {
                        strArr4[i5] = new String(aft.c());
                    }
                }
                g().a(this.c, strArr4, null, null, null, null);
            }
        }
    }

    public final agi[] a() {
        return this.a;
    }
}
