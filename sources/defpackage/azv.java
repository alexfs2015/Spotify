package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: azv reason: default package */
public final class azv extends azw {
    private final bdj b = new bdj();
    private final bdi c = new bdi();
    private final int d;
    private final a[] e;
    private a f;
    private List<azi> g;
    private List<azi> h;
    private b i;
    private int j;

    /* renamed from: azv$a */
    static final class a {
        public static final int a = a(2, 2, 2, 0);
        static final int[] b = {0, 0, 0, 0, 0, 2, 0};
        static final int[] c;
        static final int[] d;
        private static int r = a(0, 0, 0, 0);
        private static int s = a(0, 0, 0, 3);
        private static final int[] t = {0, 0, 0, 0, 0, 0, 2};
        private static final int[] u = {3, 3, 3, 3, 3, 3, 1};
        private static final boolean[] v = {false, false, false, true, true, true, false};
        private static final int[] w = {0, 1, 2, 3, 4, 3, 4};
        private static final int[] x = {0, 0, 0, 0, 0, 3, 3};
        private int A;
        private int B;
        private int C;
        private int D;
        private int E;
        private int F;
        private int G;
        final List<SpannableString> e = new ArrayList();
        boolean f;
        boolean g;
        int h;
        boolean i;
        int j;
        int k;
        int l;
        int m;
        boolean n;
        int o;
        int p;
        int q;
        private final SpannableStringBuilder y = new SpannableStringBuilder();
        private int z;

        static {
            int i2 = r;
            int i3 = s;
            c = new int[]{i2, i3, i2, i2, i3, i2, i2};
            d = new int[]{i2, i2, i2, i2, i2, i3, i3};
        }

        public a() {
            b();
        }

        public final void b() {
            c();
            this.f = false;
            this.g = false;
            this.h = 4;
            this.i = false;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = 15;
            this.n = true;
            this.z = 0;
            this.o = 0;
            this.p = 0;
            int i2 = r;
            this.A = i2;
            this.E = a;
            this.G = i2;
        }

        public final void c() {
            this.e.clear();
            this.y.clear();
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.F = -1;
            this.q = 0;
        }

        public final void a(int i2, int i3) {
            this.A = i2;
            this.z = i3;
        }

        public final void a(boolean z2, boolean z3) {
            if (this.B != -1) {
                if (!z2) {
                    this.y.setSpan(new StyleSpan(2), this.B, this.y.length(), 33);
                    this.B = -1;
                }
            } else if (z2) {
                this.B = this.y.length();
            }
            if (this.C != -1) {
                if (!z3) {
                    this.y.setSpan(new UnderlineSpan(), this.C, this.y.length(), 33);
                    this.C = -1;
                }
            } else if (z3) {
                this.C = this.y.length();
            }
        }

        public final void b(int i2, int i3) {
            if (this.D != -1) {
                int i4 = this.E;
                if (i4 != i2) {
                    this.y.setSpan(new ForegroundColorSpan(i4), this.D, this.y.length(), 33);
                }
            }
            if (i2 != a) {
                this.D = this.y.length();
                this.E = i2;
            }
            if (this.F != -1) {
                int i5 = this.G;
                if (i5 != i3) {
                    this.y.setSpan(new BackgroundColorSpan(i5), this.F, this.y.length(), 33);
                }
            }
            if (i3 != r) {
                this.F = this.y.length();
                this.G = i3;
            }
        }

        public final void d() {
            int length = this.y.length();
            if (length > 0) {
                this.y.delete(length - 1, length);
            }
        }

        public final void a(char c2) {
            if (c2 == 10) {
                this.e.add(f());
                this.y.clear();
                if (this.B != -1) {
                    this.B = 0;
                }
                if (this.C != -1) {
                    this.C = 0;
                }
                if (this.D != -1) {
                    this.D = 0;
                }
                if (this.F != -1) {
                    this.F = 0;
                }
                while (true) {
                    if ((this.n && this.e.size() >= this.m) || this.e.size() >= 15) {
                        this.e.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.y.append(c2);
            }
        }

        private SpannableString f() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.y);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.B != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.B, length, 33);
                }
                if (this.C != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.C, length, 33);
                }
                if (this.D != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.E), this.D, length, 33);
                }
                if (this.F != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.G), this.F, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final defpackage.azu e() {
            /*
                r15 = this;
                boolean r0 = r15.a()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = 0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.e
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.e
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.f()
                r2.append(r1)
                int r1 = r15.z
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x005b
                if (r1 == r5) goto L_0x0058
                if (r1 == r3) goto L_0x0055
                if (r1 != r4) goto L_0x003f
                goto L_0x005b
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unexpected justification value: "
                r1.<init>(r2)
                int r2 = r15.z
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0055:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x005d
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x005d
            L_0x005b:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x005d:
                r6 = r1
                boolean r1 = r15.i
                if (r1 == 0) goto L_0x006d
                int r1 = r15.k
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.j
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007a
            L_0x006d:
                int r1 = r15.k
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.j
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007a:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.l
                int r8 = r1 % 3
                if (r8 != 0) goto L_0x0090
                r8 = 0
                goto L_0x0096
            L_0x0090:
                int r1 = r1 % r4
                if (r1 != r5) goto L_0x0095
                r8 = 1
                goto L_0x0096
            L_0x0095:
                r8 = 2
            L_0x0096:
                int r1 = r15.l
                int r9 = r1 / 3
                if (r9 != 0) goto L_0x009e
                r9 = 0
                goto L_0x00a4
            L_0x009e:
                int r1 = r1 / r4
                if (r1 != r5) goto L_0x00a3
                r9 = 1
                goto L_0x00a4
            L_0x00a3:
                r9 = 2
            L_0x00a4:
                int r1 = r15.A
                int r3 = r
                if (r1 == r3) goto L_0x00ab
                r0 = 1
            L_0x00ab:
                azu r13 = new azu
                r5 = 0
                r11 = 1
                int r12 = r15.A
                int r14 = r15.h
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r11
                r10 = r0
                r11 = r12
                r12 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.azv.a.e():azu");
        }

        public static int a(int i2, int i3, int i4) {
            return a(i2, i3, i4, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int a(int r4, int r5, int r6, int r7) {
            /*
                r0 = 4
                r1 = 0
                defpackage.bcu.a(r4, r1, r0)
                defpackage.bcu.a(r5, r1, r0)
                defpackage.bcu.a(r6, r1, r0)
                defpackage.bcu.a(r7, r1, r0)
                r0 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x001b
                if (r7 == r0) goto L_0x001b
                r3 = 2
                if (r7 == r3) goto L_0x0020
                r3 = 3
                if (r7 == r3) goto L_0x001e
            L_0x001b:
                r7 = 255(0xff, float:3.57E-43)
                goto L_0x0022
            L_0x001e:
                r7 = 0
                goto L_0x0022
            L_0x0020:
                r7 = 127(0x7f, float:1.78E-43)
            L_0x0022:
                if (r4 <= r0) goto L_0x0027
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0028
            L_0x0027:
                r4 = 0
            L_0x0028:
                if (r5 <= r0) goto L_0x002d
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002e
            L_0x002d:
                r5 = 0
            L_0x002e:
                if (r6 <= r0) goto L_0x0032
                r1 = 255(0xff, float:3.57E-43)
            L_0x0032:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.azv.a.a(int, int, int, int):int");
        }

        public final boolean a() {
            return !this.f || (this.e.isEmpty() && this.y.length() == 0);
        }
    }

    /* renamed from: azv$b */
    static final class b {
        public final int a;
        public final int b;
        public final byte[] c;
        int d = 0;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = new byte[((i2 * 2) - 1)];
        }
    }

    public final /* bridge */ /* synthetic */ void a(long j2) {
        super.a(j2);
    }

    public final /* bridge */ /* synthetic */ void b(azo azo) {
        super.a(azo);
    }

    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public final /* bridge */ /* synthetic */ azp g() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ azo h() {
        return super.a();
    }

    public azv(int i2) {
        if (i2 == -1) {
            i2 = 1;
        }
        this.d = i2;
        this.e = new a[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.e[i3] = new a();
        }
        this.f = this.e[0];
        l();
    }

    public final void c() {
        super.c();
        this.g = null;
        this.h = null;
        this.j = 0;
        this.f = this.e[this.j];
        l();
        this.i = null;
    }

    /* access modifiers changed from: protected */
    public final boolean e() {
        return this.g != this.h;
    }

    /* access modifiers changed from: protected */
    public final azl f() {
        List<azi> list = this.g;
        this.h = list;
        return new azx(list);
    }

    /* access modifiers changed from: protected */
    public final void a(azo azo) {
        this.b.a(azo.c.array(), azo.c.limit());
        while (this.b.b() >= 3) {
            int c2 = this.b.c() & 7;
            int i2 = c2 & 3;
            boolean z = false;
            boolean z2 = (c2 & 4) == 4;
            byte c3 = (byte) this.b.c();
            byte c4 = (byte) this.b.c();
            if ((i2 == 2 || i2 == 3) && z2) {
                if (i2 == 3) {
                    i();
                    int i3 = (c3 & 192) >> 6;
                    byte b2 = c3 & 63;
                    if (b2 == 0) {
                        b2 = 64;
                    }
                    this.i = new b(i3, b2);
                    byte[] bArr = this.i.c;
                    b bVar = this.i;
                    int i4 = bVar.d;
                    bVar.d = i4 + 1;
                    bArr[i4] = c4;
                } else {
                    if (i2 == 2) {
                        z = true;
                    }
                    bcu.a(z);
                    b bVar2 = this.i;
                    if (bVar2 == null) {
                        bdd.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = bVar2.c;
                        b bVar3 = this.i;
                        int i5 = bVar3.d;
                        bVar3.d = i5 + 1;
                        bArr2[i5] = c3;
                        byte[] bArr3 = this.i.c;
                        b bVar4 = this.i;
                        int i6 = bVar4.d;
                        bVar4.d = i6 + 1;
                        bArr3[i6] = c4;
                    }
                }
                if (this.i.d == (this.i.b << 1) - 1) {
                    i();
                }
            }
        }
    }

    private void i() {
        if (this.i != null) {
            j();
            this.i = null;
        }
    }

    private void j() {
        String str = "Cea708Decoder";
        if (this.i.d != (this.i.b << 1) - 1) {
            StringBuilder sb = new StringBuilder("DtvCcPacket ended prematurely; size is ");
            sb.append((this.i.b << 1) - 1);
            sb.append(", but current index is ");
            sb.append(this.i.d);
            sb.append(" (sequence number ");
            sb.append(this.i.a);
            sb.append("); ignoring packet");
            bdd.c(str, sb.toString());
            return;
        }
        this.c.a(this.i.c, this.i.d);
        int c2 = this.c.c(3);
        int c3 = this.c.c(5);
        if (c2 == 7) {
            this.c.b(2);
            c2 += this.c.c(6);
        }
        if (c3 == 0) {
            if (c2 != 0) {
                StringBuilder sb2 = new StringBuilder("serviceNumber is non-zero (");
                sb2.append(c2);
                sb2.append(") when blockSize is 0");
                bdd.c(str, sb2.toString());
            }
        } else if (c2 == this.d) {
            boolean z = false;
            while (this.c.a() > 0) {
                int c4 = this.c.c(8);
                if (c4 == 16) {
                    int c5 = this.c.c(8);
                    if (c5 <= 31) {
                        c(c5);
                    } else if (c5 <= 127) {
                        g(c5);
                    } else if (c5 <= 159) {
                        d(c5);
                    } else if (c5 <= 255) {
                        h(c5);
                    } else {
                        StringBuilder sb3 = new StringBuilder("Invalid extended command: ");
                        sb3.append(c5);
                        bdd.c(str, sb3.toString());
                    }
                } else if (c4 <= 31) {
                    a(c4);
                } else if (c4 <= 127) {
                    e(c4);
                } else if (c4 <= 159) {
                    b(c4);
                } else if (c4 <= 255) {
                    f(c4);
                } else {
                    StringBuilder sb4 = new StringBuilder("Invalid base command: ");
                    sb4.append(c4);
                    bdd.c(str, sb4.toString());
                }
                z = true;
            }
            if (z) {
                this.g = k();
            }
        }
    }

    private void a(int i2) {
        if (i2 != 0) {
            if (i2 == 3) {
                this.g = k();
            } else if (i2 != 8) {
                switch (i2) {
                    case 12:
                        l();
                        return;
                    case 13:
                        this.f.a(10);
                        return;
                    case 14:
                        break;
                    default:
                        String str = "Cea708Decoder";
                        if (i2 >= 17 && i2 <= 23) {
                            StringBuilder sb = new StringBuilder("Currently unsupported COMMAND_EXT1 Command: ");
                            sb.append(i2);
                            bdd.c(str, sb.toString());
                            this.c.b(8);
                            return;
                        } else if (i2 < 24 || i2 > 31) {
                            StringBuilder sb2 = new StringBuilder("Invalid C0 command: ");
                            sb2.append(i2);
                            bdd.c(str, sb2.toString());
                            break;
                        } else {
                            StringBuilder sb3 = new StringBuilder("Currently unsupported COMMAND_P16 Command: ");
                            sb3.append(i2);
                            bdd.c(str, sb3.toString());
                            this.c.b(16);
                            return;
                        }
                        break;
                }
            } else {
                this.f.d();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0224, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x022b, code lost:
        if (r8 > 8) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0233, code lost:
        if (r0.c.e() == false) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0235, code lost:
        r0.e[8 - r8].b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x023e, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0241, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x025c, code lost:
        if (r8 > 8) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0264, code lost:
        if (r0.c.e() == false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0266, code lost:
        r0.e[8 - r8].g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0271, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0274, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x028c, code lost:
        if (r8 > 8) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0294, code lost:
        if (r0.c.e() == false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0296, code lost:
        r0.e[8 - r8].c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x029f, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02b1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 16
            r3 = 6
            r5 = 4
            r6 = 3
            r7 = 8
            r8 = 1
            r9 = 2
            switch(r1) {
                case 128: goto L_0x02a3;
                case 129: goto L_0x02a3;
                case 130: goto L_0x02a3;
                case 131: goto L_0x02a3;
                case 132: goto L_0x02a3;
                case 133: goto L_0x02a3;
                case 134: goto L_0x02a3;
                case 135: goto L_0x02a3;
                case 136: goto L_0x028c;
                case 137: goto L_0x0275;
                case 138: goto L_0x025c;
                case 139: goto L_0x0242;
                case 140: goto L_0x022b;
                case 141: goto L_0x0225;
                case 142: goto L_0x0224;
                case 143: goto L_0x0221;
                case 144: goto L_0x01ea;
                case 145: goto L_0x0184;
                case 146: goto L_0x0155;
                case 147: goto L_0x0010;
                case 148: goto L_0x0010;
                case 149: goto L_0x0010;
                case 150: goto L_0x0010;
                case 151: goto L_0x00ec;
                case 152: goto L_0x0025;
                case 153: goto L_0x0025;
                case 154: goto L_0x0025;
                case 155: goto L_0x0025;
                case 156: goto L_0x0025;
                case 157: goto L_0x0025;
                case 158: goto L_0x0025;
                case 159: goto L_0x0025;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid C1 command: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "Cea708Decoder"
            defpackage.bdd.c(r2, r1)
            goto L_0x02b1
        L_0x0025:
            int r1 = r1 + -152
            azv$a[] r2 = r0.e
            r2 = r2[r1]
            bdi r10 = r0.c
            r10.b(r9)
            bdi r10 = r0.c
            boolean r10 = r10.e()
            bdi r11 = r0.c
            boolean r11 = r11.e()
            bdi r12 = r0.c
            r12.e()
            bdi r12 = r0.c
            int r12 = r12.c(r6)
            bdi r13 = r0.c
            boolean r13 = r13.e()
            bdi r14 = r0.c
            r15 = 7
            int r14 = r14.c(r15)
            bdi r15 = r0.c
            int r7 = r15.c(r7)
            bdi r15 = r0.c
            int r15 = r15.c(r5)
            bdi r4 = r0.c
            int r4 = r4.c(r5)
            bdi r5 = r0.c
            r5.b(r9)
            bdi r5 = r0.c
            r5.c(r3)
            bdi r3 = r0.c
            r3.b(r9)
            bdi r3 = r0.c
            int r3 = r3.c(r6)
            bdi r5 = r0.c
            int r5 = r5.c(r6)
            r2.f = r8
            r2.g = r10
            r2.n = r11
            r2.h = r12
            r2.i = r13
            r2.j = r14
            r2.k = r7
            r2.l = r15
            int r6 = r2.m
            int r4 = r4 + r8
            if (r6 == r4) goto L_0x00b5
            r2.m = r4
        L_0x0098:
            if (r11 == 0) goto L_0x00a4
            java.util.List<android.text.SpannableString> r4 = r2.e
            int r4 = r4.size()
            int r6 = r2.m
            if (r4 >= r6) goto L_0x00ae
        L_0x00a4:
            java.util.List<android.text.SpannableString> r4 = r2.e
            int r4 = r4.size()
            r6 = 15
            if (r4 < r6) goto L_0x00b5
        L_0x00ae:
            java.util.List<android.text.SpannableString> r4 = r2.e
            r6 = 0
            r4.remove(r6)
            goto L_0x0098
        L_0x00b5:
            if (r3 == 0) goto L_0x00c9
            int r4 = r2.o
            if (r4 == r3) goto L_0x00c9
            r2.o = r3
            int r3 = r3 - r8
            int[] r4 = defpackage.azv.a.c
            r4 = r4[r3]
            int[] r6 = defpackage.azv.a.b
            r3 = r6[r3]
            r2.a(r4, r3)
        L_0x00c9:
            if (r5 == 0) goto L_0x00df
            int r3 = r2.p
            if (r3 == r5) goto L_0x00df
            r2.p = r5
            int r5 = r5 - r8
            r3 = 0
            r2.a(r3, r3)
            int r3 = defpackage.azv.a.a
            int[] r4 = defpackage.azv.a.d
            r4 = r4[r5]
            r2.b(r3, r4)
        L_0x00df:
            int r2 = r0.j
            if (r2 == r1) goto L_0x02b1
            r0.j = r1
            azv$a[] r2 = r0.e
            r1 = r2[r1]
            r0.f = r1
            return
        L_0x00ec:
            azv$a r1 = r0.f
            boolean r1 = r1.f
            if (r1 != 0) goto L_0x00fa
            bdi r1 = r0.c
            r2 = 32
            r1.b(r2)
            return
        L_0x00fa:
            bdi r1 = r0.c
            int r1 = r1.c(r9)
            bdi r2 = r0.c
            int r2 = r2.c(r9)
            bdi r3 = r0.c
            int r3 = r3.c(r9)
            bdi r4 = r0.c
            int r4 = r4.c(r9)
            int r1 = defpackage.azv.a.a(r2, r3, r4, r1)
            bdi r2 = r0.c
            r2.c(r9)
            bdi r2 = r0.c
            int r2 = r2.c(r9)
            bdi r3 = r0.c
            int r3 = r3.c(r9)
            bdi r4 = r0.c
            int r4 = r4.c(r9)
            defpackage.azv.a.a(r2, r3, r4)
            bdi r2 = r0.c
            r2.e()
            bdi r2 = r0.c
            r2.e()
            bdi r2 = r0.c
            r2.c(r9)
            bdi r2 = r0.c
            r2.c(r9)
            bdi r2 = r0.c
            int r2 = r2.c(r9)
            bdi r3 = r0.c
            r3.b(r7)
            azv$a r3 = r0.f
            r3.a(r1, r2)
            return
        L_0x0155:
            azv$a r1 = r0.f
            boolean r1 = r1.f
            if (r1 != 0) goto L_0x0161
            bdi r1 = r0.c
            r1.b(r2)
            return
        L_0x0161:
            bdi r1 = r0.c
            r1.b(r5)
            bdi r1 = r0.c
            int r1 = r1.c(r5)
            bdi r2 = r0.c
            r2.b(r9)
            bdi r2 = r0.c
            r2.c(r3)
            azv$a r2 = r0.f
            int r3 = r2.q
            if (r3 == r1) goto L_0x0181
            r3 = 10
            r2.a(r3)
        L_0x0181:
            r2.q = r1
            return
        L_0x0184:
            azv$a r1 = r0.f
            boolean r1 = r1.f
            if (r1 != 0) goto L_0x0192
            bdi r1 = r0.c
            r2 = 24
            r1.b(r2)
            return
        L_0x0192:
            bdi r1 = r0.c
            int r1 = r1.c(r9)
            bdi r2 = r0.c
            int r2 = r2.c(r9)
            bdi r3 = r0.c
            int r3 = r3.c(r9)
            bdi r4 = r0.c
            int r4 = r4.c(r9)
            int r1 = defpackage.azv.a.a(r2, r3, r4, r1)
            bdi r2 = r0.c
            int r2 = r2.c(r9)
            bdi r3 = r0.c
            int r3 = r3.c(r9)
            bdi r4 = r0.c
            int r4 = r4.c(r9)
            bdi r5 = r0.c
            int r5 = r5.c(r9)
            int r2 = defpackage.azv.a.a(r3, r4, r5, r2)
            bdi r3 = r0.c
            r3.b(r9)
            bdi r3 = r0.c
            int r3 = r3.c(r9)
            bdi r4 = r0.c
            int r4 = r4.c(r9)
            bdi r5 = r0.c
            int r5 = r5.c(r9)
            defpackage.azv.a.a(r3, r4, r5)
            azv$a r3 = r0.f
            r3.b(r1, r2)
            return
        L_0x01ea:
            azv$a r1 = r0.f
            boolean r1 = r1.f
            if (r1 != 0) goto L_0x01f6
            bdi r1 = r0.c
            r1.b(r2)
            return
        L_0x01f6:
            bdi r1 = r0.c
            r1.c(r5)
            bdi r1 = r0.c
            r1.c(r9)
            bdi r1 = r0.c
            r1.c(r9)
            bdi r1 = r0.c
            boolean r1 = r1.e()
            bdi r2 = r0.c
            boolean r2 = r2.e()
            bdi r3 = r0.c
            r3.c(r6)
            bdi r3 = r0.c
            r3.c(r6)
            azv$a r3 = r0.f
            r3.a(r1, r2)
            return
        L_0x0221:
            r16.l()
        L_0x0224:
            return
        L_0x0225:
            bdi r1 = r0.c
            r1.b(r7)
            return
        L_0x022b:
            if (r8 > r7) goto L_0x0241
            bdi r1 = r0.c
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x023e
            azv$a[] r1 = r0.e
            int r2 = 8 - r8
            r1 = r1[r2]
            r1.b()
        L_0x023e:
            int r8 = r8 + 1
            goto L_0x022b
        L_0x0241:
            return
        L_0x0242:
            r1 = 1
        L_0x0243:
            if (r1 > r7) goto L_0x025b
            bdi r2 = r0.c
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0258
            azv$a[] r2 = r0.e
            int r3 = 8 - r1
            r2 = r2[r3]
            boolean r3 = r2.g
            r3 = r3 ^ r8
            r2.g = r3
        L_0x0258:
            int r1 = r1 + 1
            goto L_0x0243
        L_0x025b:
            return
        L_0x025c:
            if (r8 > r7) goto L_0x0274
            bdi r1 = r0.c
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0270
            azv$a[] r1 = r0.e
            int r2 = 8 - r8
            r1 = r1[r2]
            r2 = 0
            r1.g = r2
            goto L_0x0271
        L_0x0270:
            r2 = 0
        L_0x0271:
            int r8 = r8 + 1
            goto L_0x025c
        L_0x0274:
            return
        L_0x0275:
            r1 = 1
        L_0x0276:
            if (r1 > r7) goto L_0x028b
            bdi r2 = r0.c
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0288
            azv$a[] r2 = r0.e
            int r3 = 8 - r1
            r2 = r2[r3]
            r2.g = r8
        L_0x0288:
            int r1 = r1 + 1
            goto L_0x0276
        L_0x028b:
            return
        L_0x028c:
            if (r8 > r7) goto L_0x02a2
            bdi r1 = r0.c
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x029f
            azv$a[] r1 = r0.e
            int r2 = 8 - r8
            r1 = r1[r2]
            r1.c()
        L_0x029f:
            int r8 = r8 + 1
            goto L_0x028c
        L_0x02a2:
            return
        L_0x02a3:
            int r1 = r1 + -128
            int r2 = r0.j
            if (r2 == r1) goto L_0x02b1
            r0.j = r1
            azv$a[] r2 = r0.e
            r1 = r2[r1]
            r0.f = r1
        L_0x02b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azv.b(int):void");
    }

    private void c(int i2) {
        if (i2 > 7) {
            if (i2 <= 15) {
                this.c.b(8);
            } else if (i2 <= 23) {
                this.c.b(16);
            } else if (i2 <= 31) {
                this.c.b(24);
            }
        }
    }

    private void d(int i2) {
        if (i2 <= 135) {
            this.c.b(32);
        } else if (i2 <= 143) {
            this.c.b(40);
        } else {
            if (i2 <= 159) {
                this.c.b(2);
                this.c.b(this.c.c(6) * 8);
            }
        }
    }

    private void e(int i2) {
        if (i2 == 127) {
            this.f.a(9835);
        } else {
            this.f.a((char) (i2 & 255));
        }
    }

    private void f(int i2) {
        this.f.a((char) (i2 & 255));
    }

    private void g(int i2) {
        if (i2 == 32) {
            this.f.a(' ');
        } else if (i2 == 33) {
            this.f.a(160);
        } else if (i2 == 37) {
            this.f.a(8230);
        } else if (i2 == 42) {
            this.f.a(352);
        } else if (i2 == 44) {
            this.f.a(338);
        } else if (i2 == 63) {
            this.f.a(376);
        } else if (i2 == 57) {
            this.f.a(8482);
        } else if (i2 == 58) {
            this.f.a(353);
        } else if (i2 == 60) {
            this.f.a(339);
        } else if (i2 != 61) {
            switch (i2) {
                case 48:
                    this.f.a(9608);
                    return;
                case 49:
                    this.f.a(8216);
                    return;
                case 50:
                    this.f.a(8217);
                    return;
                case 51:
                    this.f.a(8220);
                    return;
                case 52:
                    this.f.a(8221);
                    return;
                case 53:
                    this.f.a(8226);
                    return;
                default:
                    switch (i2) {
                        case defpackage.o.a.aF /*118*/:
                            this.f.a(8539);
                            return;
                        case defpackage.o.a.aG /*119*/:
                            this.f.a(8540);
                            return;
                        case 120:
                            this.f.a(8541);
                            return;
                        case 121:
                            this.f.a(8542);
                            return;
                        case 122:
                            this.f.a(9474);
                            return;
                        case 123:
                            this.f.a(9488);
                            return;
                        case defpackage.o.a.aL /*124*/:
                            this.f.a(9492);
                            return;
                        case 125:
                            this.f.a(9472);
                            return;
                        case 126:
                            this.f.a(9496);
                            return;
                        case 127:
                            this.f.a(9484);
                            return;
                        default:
                            StringBuilder sb = new StringBuilder("Invalid G2 character: ");
                            sb.append(i2);
                            bdd.c("Cea708Decoder", sb.toString());
                            return;
                    }
            }
        } else {
            this.f.a(8480);
        }
    }

    private void h(int i2) {
        if (i2 == 160) {
            this.f.a(13252);
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid G3 character: ");
        sb.append(i2);
        bdd.c("Cea708Decoder", sb.toString());
        this.f.a('_');
    }

    private List<azi> k() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            if (!this.e[i2].a() && this.e[i2].g) {
                arrayList.add(this.e[i2].e());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    private void l() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.e[i2].b();
        }
    }
}
