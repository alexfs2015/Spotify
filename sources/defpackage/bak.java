package defpackage;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.comscore.streaming.AdType;
import com.comscore.streaming.ContentType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bak reason: default package */
public final class bak extends ban {
    private static final int[] b = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] c = {0, 4, 8, 12, 16, 20, 24, 28};
    /* access modifiers changed from: private */
    public static final int[] d = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] e = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, AdType.BRANDED_ON_DEMAND_POST_ROLL, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, ContentType.SHORT_FORM_ON_DEMAND, ContentType.LONG_FORM_ON_DEMAND, ContentType.LIVE, defpackage.o.a.aB, defpackage.o.a.aC, defpackage.o.a.aD, defpackage.o.a.aE, defpackage.o.a.aF, defpackage.o.a.aG, 120, 121, 122, AdType.BRANDED_ON_DEMAND_PRE_ROLL, 247, 209, 241, 9632};
    private static final int[] f = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, AdType.BRANDED_ON_DEMAND_MID_ROLL, 226, AdType.BRANDED_ON_DEMAND_CONTENT, 238, 244, 251};
    private static final int[] g = {193, 201, AdType.LINEAR_ON_DEMAND_PRE_ROLL, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, ContentType.BUMPER, 200, 202, 203, AdType.BRANDED_ON_DEMAND_LIVE, 206, 207, 239, AdType.LINEAR_ON_DEMAND_MID_ROLL, 217, 249, 219, 171, 187};
    private static final int[] h = {195, 227, 205, 204, 236, 210, 242, AdType.LINEAR_ON_DEMAND_POST_ROLL, 245, 123, 125, 92, 94, 95, defpackage.o.a.aL, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private final bea i = new bea();
    private final int j;
    private final int k;
    private final ArrayList<a> l = new ArrayList<>();
    private a m = new a(0, 4);
    private List<azz> n;
    private List<azz> o;
    private int p;
    private int q;
    private boolean r;
    private byte s;
    private byte t;

    /* renamed from: bak$a */
    static class a {
        final List<C0016a> a = new ArrayList();
        final List<SpannableString> b = new ArrayList();
        final StringBuilder c = new StringBuilder();
        int d;
        int e;
        int f;
        int g;
        private int h;

        /* renamed from: bak$a$a reason: collision with other inner class name */
        static class C0016a {
            public final int a;
            public final boolean b;
            public int c;

            public C0016a(int i, boolean z, int i2) {
                this.a = i;
                this.b = z;
                this.c = i2;
            }
        }

        public a(int i, int i2) {
            a(i);
            this.g = i2;
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
        }

        private static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        public final void a(char c2) {
            this.c.append(c2);
        }

        public final void a(int i) {
            this.h = i;
            this.a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public final void a(int i, boolean z) {
            this.a.add(new C0016a(i, z, this.c.length()));
        }

        public final boolean a() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }

        public final void b() {
            int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                int size = this.a.size() - 1;
                while (size >= 0) {
                    C0016a aVar = (C0016a) this.a.get(size);
                    if (aVar.c == length) {
                        aVar.c--;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        public final SpannableString c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            while (i < this.a.size()) {
                C0016a aVar = (C0016a) this.a.get(i);
                boolean z2 = aVar.b;
                int i7 = aVar.a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = bak.d[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.c;
                i++;
                if (i8 != (i < this.a.size() ? ((C0016a) this.a.get(i)).c : length)) {
                    if (i2 != -1 && !z2) {
                        a(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        b(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        a(spannableStringBuilder, i4, i8, i5);
                        i5 = i6;
                        i4 = i8;
                    }
                }
            }
            if (!(i2 == -1 || i2 == length)) {
                a(spannableStringBuilder, i2, length);
            }
            if (!(i3 == -1 || i3 == length)) {
                b(spannableStringBuilder, i3, length);
            }
            if (i4 != length) {
                a(spannableStringBuilder, i4, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final azz d() {
            int i;
            float f2;
            int i2;
            int i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                spannableStringBuilder.append((CharSequence) this.b.get(i4));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(c());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i5 = this.e + this.f;
            int length = (32 - i5) - spannableStringBuilder.length();
            int i6 = i5 - length;
            if (this.h == 2 && (Math.abs(i6) < 3 || length < 0)) {
                f2 = 0.5f;
                i = 1;
            } else if (this.h != 2 || i6 <= 0) {
                f2 = ((((float) i5) / 32.0f) * 0.8f) + 0.1f;
                i = 0;
            } else {
                f2 = ((((float) (32 - length)) / 32.0f) * 0.8f) + 0.1f;
                i = 2;
            }
            if (this.h != 1) {
                i3 = this.d;
                if (i3 <= 7) {
                    i2 = 0;
                    azz azz = new azz(spannableStringBuilder, Alignment.ALIGN_NORMAL, (float) i3, 1, i2, f2, i, Float.MIN_VALUE);
                    return azz;
                }
            }
            i3 = (this.d - 15) - 2;
            i2 = 2;
            azz azz2 = new azz(spannableStringBuilder, Alignment.ALIGN_NORMAL, (float) i3, 1, i2, f2, i, Float.MIN_VALUE);
            return azz2;
        }

        public final String toString() {
            return this.c.toString();
        }
    }

    public bak(String str, int i2) {
        this.j = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i2 == 3 || i2 == 4) {
            this.k = 2;
        } else {
            this.k = 1;
        }
        a(0);
        k();
    }

    private static char a(byte b2) {
        return (char) e[(b2 & Byte.MAX_VALUE) - 32];
    }

    private void a(int i2) {
        int i3 = this.p;
        if (i3 != i2) {
            this.p = i2;
            k();
            if (i3 == 3 || i2 == 1 || i2 == 0) {
                this.n = null;
            }
        }
    }

    private void b(int i2) {
        this.q = i2;
        this.m.g = i2;
    }

    private List<azz> j() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            azz d2 = ((a) this.l.get(i2)).d();
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }

    private void k() {
        this.m.a(this.p);
        this.l.clear();
        this.l.add(this.m);
    }

    public final /* bridge */ /* synthetic */ void a(long j2) {
        super.a(j2);
    }

    /* access modifiers changed from: protected */
    public final void a(baf baf) {
        this.i.a(baf.c.array(), baf.c.limit());
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int b2 = this.i.b();
            int i2 = this.j;
            if (b2 >= i2) {
                byte c2 = i2 == 2 ? -4 : (byte) this.i.c();
                byte c3 = (byte) (this.i.c() & 127);
                byte c4 = (byte) (this.i.c() & 127);
                if ((c2 & 6) == 4 && ((this.k != 1 || (c2 & 1) == 0) && ((this.k != 2 || (c2 & 1) == 1) && !(c3 == 0 && c4 == 0)))) {
                    byte b3 = c3 & 247;
                    if (b3 == 17 && (c4 & 240) == 48) {
                        this.m.a((char) f[c4 & 15]);
                    } else if ((c3 & 246) == 18 && (c4 & 224) == 32) {
                        this.m.b();
                        if ((c3 & 1) == 0) {
                            this.m.a((char) g[c4 & 31]);
                        } else {
                            this.m.a((char) h[c4 & 31]);
                        }
                    } else if ((c3 & 224) == 0) {
                        byte b4 = c3 & 240;
                        boolean z3 = b4 == 16;
                        if (z3) {
                            if (this.r && this.s == c3 && this.t == c4) {
                                this.r = false;
                                z2 = true;
                            } else {
                                this.r = true;
                                this.s = c3;
                                this.t = c4;
                            }
                        }
                        if (b3 == 17 && (c4 & 240) == 32) {
                            this.m.a(' ');
                            this.m.a((c4 >> 1) & 7, (c4 & 1) == 1);
                        } else {
                            if (b4 == 16 && (c4 & 192) == 64) {
                                int i3 = b[c3 & 7];
                                if ((c4 & 32) != 0) {
                                    i3++;
                                }
                                if (i3 != this.m.d) {
                                    if (this.p != 1 && !this.m.a()) {
                                        this.m = new a(this.p, this.q);
                                        this.l.add(this.m);
                                    }
                                    this.m.d = i3;
                                }
                                boolean z4 = (c4 & 16) == 16;
                                int i4 = (c4 >> 1) & 7;
                                this.m.a(z4 ? 8 : i4, (c4 & 1) == 1);
                                if (z4) {
                                    this.m.e = c[i4];
                                }
                            } else {
                                if (b3 == 23 && c4 >= 33 && c4 <= 35) {
                                    this.m.f = c4 - 32;
                                } else {
                                    if (b3 == 20 && (c4 & 240) == 32) {
                                        if (c4 == 32) {
                                            a(2);
                                        } else if (c4 != 41) {
                                            switch (c4) {
                                                case 37:
                                                    a(1);
                                                    b(2);
                                                    break;
                                                case 38:
                                                    a(1);
                                                    b(3);
                                                    break;
                                                case 39:
                                                    a(1);
                                                    b(4);
                                                    break;
                                                default:
                                                    int i5 = this.p;
                                                    if (i5 != 0) {
                                                        if (c4 == 33) {
                                                            this.m.b();
                                                            break;
                                                        } else {
                                                            switch (c4) {
                                                                case 44:
                                                                    this.n = null;
                                                                    if (i5 == 1 || i5 == 3) {
                                                                        k();
                                                                        break;
                                                                    }
                                                                case 45:
                                                                    if (i5 == 1 && !this.m.a()) {
                                                                        a aVar = this.m;
                                                                        aVar.b.add(aVar.c());
                                                                        aVar.c.setLength(0);
                                                                        aVar.a.clear();
                                                                        int min = Math.min(aVar.g, aVar.d);
                                                                        while (aVar.b.size() >= min) {
                                                                            aVar.b.remove(0);
                                                                        }
                                                                        break;
                                                                    }
                                                                case 46:
                                                                    k();
                                                                    break;
                                                                case 47:
                                                                    this.n = j();
                                                                    k();
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                            }
                                        } else {
                                            a(3);
                                        }
                                    }
                                }
                            }
                        }
                        z2 = z3;
                    } else {
                        this.m.a(a(c3));
                        if ((c4 & 224) != 0) {
                            this.m.a(a(c4));
                        }
                    }
                    z = true;
                }
            } else if (z) {
                if (!z2) {
                    this.r = false;
                }
                int i6 = this.p;
                if (i6 == 1 || i6 == 3) {
                    this.n = j();
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void b(baf baf) {
        super.a(baf);
    }

    public final void c() {
        super.c();
        this.n = null;
        this.o = null;
        a(0);
        b(4);
        k();
        this.r = false;
        this.s = 0;
        this.t = 0;
    }

    public final void d() {
    }

    /* access modifiers changed from: protected */
    public final boolean e() {
        return this.n != this.o;
    }

    /* access modifiers changed from: protected */
    public final bac f() {
        List<azz> list = this.n;
        this.o = list;
        return new bao(list);
    }

    public final /* bridge */ /* synthetic */ bag g() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ baf h() {
        return super.a();
    }
}
