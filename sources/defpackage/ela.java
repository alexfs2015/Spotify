package defpackage;

import com.comscore.streaming.AdType;
import com.google.android.gms.internal.measurement.zzft.zzb;
import com.google.android.gms.internal.measurement.zzft.zzb.a;
import com.google.android.gms.internal.measurement.zzve;
import com.spotify.core.http.HttpConnection;

/* renamed from: ela reason: default package */
public final class ela extends eql<ela> {
    private static volatile ela[] N;
    public ekv[] A;
    public String B;
    public Integer C;
    public String D;
    public Long E;
    public Long F;
    public String G;
    public Integer H;
    public String I;
    public zzb J;
    public int[] K;
    private Integer O;
    private Integer P;
    private String Q;
    private Long R;
    public Integer a;
    public ekx[] b;
    public eld[] c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public String i;
    public String j;
    public String k;
    public String l;
    public Integer m;
    public String n;
    public String o;
    public String p;
    public Long q;
    public Long r;
    public String s;
    public Boolean t;
    public String u;
    public Long v;
    public Integer w;
    public String x;
    public String y;
    public Boolean z;

    public ela() {
        this.a = null;
        this.b = ekx.a();
        this.c = eld.a();
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = ekv.a();
        this.B = null;
        this.C = null;
        this.O = null;
        this.P = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.Q = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = eqt.a;
        this.R = null;
        this.L = null;
        this.M = -1;
    }

    public static ela[] a() {
        if (N == null) {
            synchronized (eqp.b) {
                if (N == null) {
                    N = new ela[0];
                }
            }
        }
        return N;
    }

    public final /* synthetic */ eqq a(eqj eqj) {
        while (true) {
            int a2 = eqj.a();
            switch (a2) {
                case 0:
                    return this;
                case 8:
                    this.a = Integer.valueOf(eqj.d());
                    break;
                case 18:
                    int a3 = eqt.a(eqj, 18);
                    ekx[] ekxArr = this.b;
                    int length = ekxArr == null ? 0 : ekxArr.length;
                    ekx[] ekxArr2 = new ekx[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, ekxArr2, 0, length);
                    }
                    while (length < ekxArr2.length - 1) {
                        ekxArr2[length] = new ekx();
                        eqj.a((eqq) ekxArr2[length]);
                        eqj.a();
                        length++;
                    }
                    ekxArr2[length] = new ekx();
                    eqj.a((eqq) ekxArr2[length]);
                    this.b = ekxArr2;
                    break;
                case 26:
                    int a4 = eqt.a(eqj, 26);
                    eld[] eldArr = this.c;
                    int length2 = eldArr == null ? 0 : eldArr.length;
                    eld[] eldArr2 = new eld[(a4 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.c, 0, eldArr2, 0, length2);
                    }
                    while (length2 < eldArr2.length - 1) {
                        eldArr2[length2] = new eld();
                        eqj.a((eqq) eldArr2[length2]);
                        eqj.a();
                        length2++;
                    }
                    eldArr2[length2] = new eld();
                    eqj.a((eqq) eldArr2[length2]);
                    this.c = eldArr2;
                    break;
                case 32:
                    this.d = Long.valueOf(eqj.e());
                    break;
                case 40:
                    this.e = Long.valueOf(eqj.e());
                    break;
                case 48:
                    this.f = Long.valueOf(eqj.e());
                    break;
                case 56:
                    this.h = Long.valueOf(eqj.e());
                    break;
                case b.bu /*66*/:
                    this.i = eqj.c();
                    break;
                case b.bC /*74*/:
                    this.j = eqj.c();
                    break;
                case 82:
                    this.k = eqj.c();
                    break;
                case 90:
                    this.l = eqj.c();
                    break;
                case 96:
                    this.m = Integer.valueOf(eqj.d());
                    break;
                case 106:
                    this.n = eqj.c();
                    break;
                case a.aB /*114*/:
                    this.o = eqj.c();
                    break;
                case 130:
                    this.p = eqj.c();
                    break;
                case 136:
                    this.q = Long.valueOf(eqj.e());
                    break;
                case 144:
                    this.r = Long.valueOf(eqj.e());
                    break;
                case 154:
                    this.s = eqj.c();
                    break;
                case 160:
                    this.t = Boolean.valueOf(eqj.b());
                    break;
                case 170:
                    this.u = eqj.c();
                    break;
                case 176:
                    this.v = Long.valueOf(eqj.e());
                    break;
                case 184:
                    this.w = Integer.valueOf(eqj.d());
                    break;
                case 194:
                    this.x = eqj.c();
                    break;
                case 202:
                    this.y = eqj.c();
                    break;
                case 208:
                    this.g = Long.valueOf(eqj.e());
                    break;
                case 224:
                    this.z = Boolean.valueOf(eqj.b());
                    break;
                case AdType.BRANDED_ON_DEMAND_CONTENT /*234*/:
                    int a5 = eqt.a(eqj, AdType.BRANDED_ON_DEMAND_CONTENT);
                    ekv[] ekvArr = this.A;
                    int length3 = ekvArr == null ? 0 : ekvArr.length;
                    ekv[] ekvArr2 = new ekv[(a5 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.A, 0, ekvArr2, 0, length3);
                    }
                    while (length3 < ekvArr2.length - 1) {
                        ekvArr2[length3] = new ekv();
                        eqj.a((eqq) ekvArr2[length3]);
                        eqj.a();
                        length3++;
                    }
                    ekvArr2[length3] = new ekv();
                    eqj.a((eqq) ekvArr2[length3]);
                    this.A = ekvArr2;
                    break;
                case 242:
                    this.B = eqj.c();
                    break;
                case 248:
                    this.C = Integer.valueOf(eqj.d());
                    break;
                case 256:
                    this.O = Integer.valueOf(eqj.d());
                    break;
                case 264:
                    this.P = Integer.valueOf(eqj.d());
                    break;
                case 274:
                    this.D = eqj.c();
                    break;
                case 280:
                    this.E = Long.valueOf(eqj.e());
                    break;
                case 288:
                    this.F = Long.valueOf(eqj.e());
                    break;
                case 298:
                    this.G = eqj.c();
                    break;
                case HttpConnection.kErrorHttpTooManyRedirects /*306*/:
                    this.Q = eqj.c();
                    break;
                case 312:
                    this.H = Integer.valueOf(eqj.d());
                    break;
                case 330:
                    this.I = eqj.c();
                    break;
                case 354:
                    zzb zzb = (zzb) eqj.a(zzb.b());
                    zzb zzb2 = this.J;
                    if (zzb2 != null) {
                        zzb = (zzb) ((enn) ((a) ((a) zzb2.g()).a(zzb)).d());
                    }
                    this.J = zzb;
                    break;
                case 360:
                    int a6 = eqt.a(eqj, 360);
                    int[] iArr = this.K;
                    int length4 = iArr == null ? 0 : iArr.length;
                    int[] iArr2 = new int[(a6 + length4)];
                    if (length4 != 0) {
                        System.arraycopy(this.K, 0, iArr2, 0, length4);
                    }
                    while (length4 < iArr2.length - 1) {
                        iArr2[length4] = eqj.d();
                        eqj.a();
                        length4++;
                    }
                    iArr2[length4] = eqj.d();
                    this.K = iArr2;
                    break;
                case 362:
                    int c2 = eqj.c(eqj.d());
                    int i2 = eqj.i();
                    int i3 = 0;
                    while (eqj.h() > 0) {
                        eqj.d();
                        i3++;
                    }
                    eqj.e(i2);
                    int[] iArr3 = this.K;
                    int length5 = iArr3 == null ? 0 : iArr3.length;
                    int[] iArr4 = new int[(i3 + length5)];
                    if (length5 != 0) {
                        System.arraycopy(this.K, 0, iArr4, 0, length5);
                    }
                    while (length5 < iArr4.length) {
                        iArr4[length5] = eqj.d();
                        length5++;
                    }
                    this.K = iArr4;
                    eqj.d(c2);
                    break;
                case 368:
                    this.R = Long.valueOf(eqj.e());
                    break;
                default:
                    if (super.a(eqj, a2)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    public final void a(eqk eqk) {
        Integer num = this.a;
        if (num != null) {
            eqk.a(1, num.intValue());
        }
        ekx[] ekxArr = this.b;
        if (ekxArr != null && ekxArr.length > 0) {
            int i2 = 0;
            while (true) {
                ekx[] ekxArr2 = this.b;
                if (i2 >= ekxArr2.length) {
                    break;
                }
                ekx ekx = ekxArr2[i2];
                if (ekx != null) {
                    eqk.a(2, (eqq) ekx);
                }
                i2++;
            }
        }
        eld[] eldArr = this.c;
        if (eldArr != null && eldArr.length > 0) {
            int i3 = 0;
            while (true) {
                eld[] eldArr2 = this.c;
                if (i3 >= eldArr2.length) {
                    break;
                }
                eld eld = eldArr2[i3];
                if (eld != null) {
                    eqk.a(3, (eqq) eld);
                }
                i3++;
            }
        }
        Long l2 = this.d;
        if (l2 != null) {
            eqk.b(4, l2.longValue());
        }
        Long l3 = this.e;
        if (l3 != null) {
            eqk.b(5, l3.longValue());
        }
        Long l4 = this.f;
        if (l4 != null) {
            eqk.b(6, l4.longValue());
        }
        Long l5 = this.h;
        if (l5 != null) {
            eqk.b(7, l5.longValue());
        }
        String str = this.i;
        if (str != null) {
            eqk.a(8, str);
        }
        String str2 = this.j;
        if (str2 != null) {
            eqk.a(9, str2);
        }
        String str3 = this.k;
        if (str3 != null) {
            eqk.a(10, str3);
        }
        String str4 = this.l;
        if (str4 != null) {
            eqk.a(11, str4);
        }
        Integer num2 = this.m;
        if (num2 != null) {
            eqk.a(12, num2.intValue());
        }
        String str5 = this.n;
        if (str5 != null) {
            eqk.a(13, str5);
        }
        String str6 = this.o;
        if (str6 != null) {
            eqk.a(14, str6);
        }
        String str7 = this.p;
        if (str7 != null) {
            eqk.a(16, str7);
        }
        Long l6 = this.q;
        if (l6 != null) {
            eqk.b(17, l6.longValue());
        }
        Long l7 = this.r;
        if (l7 != null) {
            eqk.b(18, l7.longValue());
        }
        String str8 = this.s;
        if (str8 != null) {
            eqk.a(19, str8);
        }
        Boolean bool = this.t;
        if (bool != null) {
            eqk.a(20, bool.booleanValue());
        }
        String str9 = this.u;
        if (str9 != null) {
            eqk.a(21, str9);
        }
        Long l8 = this.v;
        if (l8 != null) {
            eqk.b(22, l8.longValue());
        }
        Integer num3 = this.w;
        if (num3 != null) {
            eqk.a(23, num3.intValue());
        }
        String str10 = this.x;
        if (str10 != null) {
            eqk.a(24, str10);
        }
        String str11 = this.y;
        if (str11 != null) {
            eqk.a(25, str11);
        }
        Long l9 = this.g;
        if (l9 != null) {
            eqk.b(26, l9.longValue());
        }
        Boolean bool2 = this.z;
        if (bool2 != null) {
            eqk.a(28, bool2.booleanValue());
        }
        ekv[] ekvArr = this.A;
        if (ekvArr != null && ekvArr.length > 0) {
            int i4 = 0;
            while (true) {
                ekv[] ekvArr2 = this.A;
                if (i4 >= ekvArr2.length) {
                    break;
                }
                ekv ekv = ekvArr2[i4];
                if (ekv != null) {
                    eqk.a(29, (eqq) ekv);
                }
                i4++;
            }
        }
        String str12 = this.B;
        if (str12 != null) {
            eqk.a(30, str12);
        }
        Integer num4 = this.C;
        if (num4 != null) {
            eqk.a(31, num4.intValue());
        }
        Integer num5 = this.O;
        if (num5 != null) {
            eqk.a(32, num5.intValue());
        }
        Integer num6 = this.P;
        if (num6 != null) {
            eqk.a(33, num6.intValue());
        }
        String str13 = this.D;
        if (str13 != null) {
            eqk.a(34, str13);
        }
        Long l10 = this.E;
        if (l10 != null) {
            eqk.b(35, l10.longValue());
        }
        Long l11 = this.F;
        if (l11 != null) {
            eqk.b(36, l11.longValue());
        }
        String str14 = this.G;
        if (str14 != null) {
            eqk.a(37, str14);
        }
        String str15 = this.Q;
        if (str15 != null) {
            eqk.a(38, str15);
        }
        Integer num7 = this.H;
        if (num7 != null) {
            eqk.a(39, num7.intValue());
        }
        String str16 = this.I;
        if (str16 != null) {
            eqk.a(41, str16);
        }
        zzb zzb = this.J;
        if (zzb != null) {
            if (eqk.b == null) {
                eqk.b = zzve.a(eqk.a);
                eqk.c = eqk.a.position();
            } else if (eqk.c != eqk.a.position()) {
                eqk.b.b(eqk.a.array(), eqk.c, eqk.a.position() - eqk.c);
                eqk.c = eqk.a.position();
            }
            zzve zzve = eqk.b;
            zzve.a(44, (eoo) zzb);
            zzve.h();
            eqk.c = eqk.a.position();
        }
        int[] iArr = this.K;
        if (iArr != null && iArr.length > 0) {
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.K;
                if (i5 >= iArr2.length) {
                    break;
                }
                int i6 = iArr2[i5];
                eqk.c(45, 0);
                eqk.b(i6);
                i5++;
            }
        }
        Long l12 = this.R;
        if (l12 != null) {
            eqk.b(46, l12.longValue());
        }
        super.a(eqk);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int[] iArr;
        int b2 = super.b();
        Integer num = this.a;
        if (num != null) {
            b2 += eqk.b(1, num.intValue());
        }
        ekx[] ekxArr = this.b;
        int i2 = 0;
        if (ekxArr != null && ekxArr.length > 0) {
            int i3 = b2;
            int i4 = 0;
            while (true) {
                ekx[] ekxArr2 = this.b;
                if (i4 >= ekxArr2.length) {
                    break;
                }
                ekx ekx = ekxArr2[i4];
                if (ekx != null) {
                    i3 += eqk.b(2, (eqq) ekx);
                }
                i4++;
            }
            b2 = i3;
        }
        eld[] eldArr = this.c;
        if (eldArr != null && eldArr.length > 0) {
            int i5 = b2;
            int i6 = 0;
            while (true) {
                eld[] eldArr2 = this.c;
                if (i6 >= eldArr2.length) {
                    break;
                }
                eld eld = eldArr2[i6];
                if (eld != null) {
                    i5 += eqk.b(3, (eqq) eld);
                }
                i6++;
            }
            b2 = i5;
        }
        Long l2 = this.d;
        if (l2 != null) {
            b2 += eqk.c(4, l2.longValue());
        }
        Long l3 = this.e;
        if (l3 != null) {
            b2 += eqk.c(5, l3.longValue());
        }
        Long l4 = this.f;
        if (l4 != null) {
            b2 += eqk.c(6, l4.longValue());
        }
        Long l5 = this.h;
        if (l5 != null) {
            b2 += eqk.c(7, l5.longValue());
        }
        String str = this.i;
        if (str != null) {
            b2 += eqk.b(8, str);
        }
        String str2 = this.j;
        if (str2 != null) {
            b2 += eqk.b(9, str2);
        }
        String str3 = this.k;
        if (str3 != null) {
            b2 += eqk.b(10, str3);
        }
        String str4 = this.l;
        if (str4 != null) {
            b2 += eqk.b(11, str4);
        }
        Integer num2 = this.m;
        if (num2 != null) {
            b2 += eqk.b(12, num2.intValue());
        }
        String str5 = this.n;
        if (str5 != null) {
            b2 += eqk.b(13, str5);
        }
        String str6 = this.o;
        if (str6 != null) {
            b2 += eqk.b(14, str6);
        }
        String str7 = this.p;
        if (str7 != null) {
            b2 += eqk.b(16, str7);
        }
        Long l6 = this.q;
        if (l6 != null) {
            b2 += eqk.c(17, l6.longValue());
        }
        Long l7 = this.r;
        if (l7 != null) {
            b2 += eqk.c(18, l7.longValue());
        }
        String str8 = this.s;
        if (str8 != null) {
            b2 += eqk.b(19, str8);
        }
        Boolean bool = this.t;
        if (bool != null) {
            bool.booleanValue();
            b2 += eqk.c(160) + 1;
        }
        String str9 = this.u;
        if (str9 != null) {
            b2 += eqk.b(21, str9);
        }
        Long l8 = this.v;
        if (l8 != null) {
            b2 += eqk.c(22, l8.longValue());
        }
        Integer num3 = this.w;
        if (num3 != null) {
            b2 += eqk.b(23, num3.intValue());
        }
        String str10 = this.x;
        if (str10 != null) {
            b2 += eqk.b(24, str10);
        }
        String str11 = this.y;
        if (str11 != null) {
            b2 += eqk.b(25, str11);
        }
        Long l9 = this.g;
        if (l9 != null) {
            b2 += eqk.c(26, l9.longValue());
        }
        Boolean bool2 = this.z;
        if (bool2 != null) {
            bool2.booleanValue();
            b2 += eqk.c(224) + 1;
        }
        ekv[] ekvArr = this.A;
        if (ekvArr != null && ekvArr.length > 0) {
            int i7 = b2;
            int i8 = 0;
            while (true) {
                ekv[] ekvArr2 = this.A;
                if (i8 >= ekvArr2.length) {
                    break;
                }
                ekv ekv = ekvArr2[i8];
                if (ekv != null) {
                    i7 += eqk.b(29, (eqq) ekv);
                }
                i8++;
            }
            b2 = i7;
        }
        String str12 = this.B;
        if (str12 != null) {
            b2 += eqk.b(30, str12);
        }
        Integer num4 = this.C;
        if (num4 != null) {
            b2 += eqk.b(31, num4.intValue());
        }
        Integer num5 = this.O;
        if (num5 != null) {
            b2 += eqk.b(32, num5.intValue());
        }
        Integer num6 = this.P;
        if (num6 != null) {
            b2 += eqk.b(33, num6.intValue());
        }
        String str13 = this.D;
        if (str13 != null) {
            b2 += eqk.b(34, str13);
        }
        Long l10 = this.E;
        if (l10 != null) {
            b2 += eqk.c(35, l10.longValue());
        }
        Long l11 = this.F;
        if (l11 != null) {
            b2 += eqk.c(36, l11.longValue());
        }
        String str14 = this.G;
        if (str14 != null) {
            b2 += eqk.b(37, str14);
        }
        String str15 = this.Q;
        if (str15 != null) {
            b2 += eqk.b(38, str15);
        }
        Integer num7 = this.H;
        if (num7 != null) {
            b2 += eqk.b(39, num7.intValue());
        }
        String str16 = this.I;
        if (str16 != null) {
            b2 += eqk.b(41, str16);
        }
        zzb zzb = this.J;
        if (zzb != null) {
            b2 += zzve.c(44, (eoo) zzb);
        }
        int[] iArr2 = this.K;
        if (iArr2 != null && iArr2.length > 0) {
            int i9 = 0;
            while (true) {
                iArr = this.K;
                if (i2 >= iArr.length) {
                    break;
                }
                i9 += eqk.c(iArr[i2]);
                i2++;
            }
            b2 = b2 + i9 + (iArr.length * 2);
        }
        Long l12 = this.R;
        return l12 != null ? b2 + eqk.c(46, l12.longValue()) : b2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ela)) {
            return false;
        }
        ela ela = (ela) obj;
        Integer num = this.a;
        if (num == null) {
            if (ela.a != null) {
                return false;
            }
        } else if (!num.equals(ela.a)) {
            return false;
        }
        if (!eqp.a((Object[]) this.b, (Object[]) ela.b) || !eqp.a((Object[]) this.c, (Object[]) ela.c)) {
            return false;
        }
        Long l2 = this.d;
        if (l2 == null) {
            if (ela.d != null) {
                return false;
            }
        } else if (!l2.equals(ela.d)) {
            return false;
        }
        Long l3 = this.e;
        if (l3 == null) {
            if (ela.e != null) {
                return false;
            }
        } else if (!l3.equals(ela.e)) {
            return false;
        }
        Long l4 = this.f;
        if (l4 == null) {
            if (ela.f != null) {
                return false;
            }
        } else if (!l4.equals(ela.f)) {
            return false;
        }
        Long l5 = this.g;
        if (l5 == null) {
            if (ela.g != null) {
                return false;
            }
        } else if (!l5.equals(ela.g)) {
            return false;
        }
        Long l6 = this.h;
        if (l6 == null) {
            if (ela.h != null) {
                return false;
            }
        } else if (!l6.equals(ela.h)) {
            return false;
        }
        String str = this.i;
        if (str == null) {
            if (ela.i != null) {
                return false;
            }
        } else if (!str.equals(ela.i)) {
            return false;
        }
        String str2 = this.j;
        if (str2 == null) {
            if (ela.j != null) {
                return false;
            }
        } else if (!str2.equals(ela.j)) {
            return false;
        }
        String str3 = this.k;
        if (str3 == null) {
            if (ela.k != null) {
                return false;
            }
        } else if (!str3.equals(ela.k)) {
            return false;
        }
        String str4 = this.l;
        if (str4 == null) {
            if (ela.l != null) {
                return false;
            }
        } else if (!str4.equals(ela.l)) {
            return false;
        }
        Integer num2 = this.m;
        if (num2 == null) {
            if (ela.m != null) {
                return false;
            }
        } else if (!num2.equals(ela.m)) {
            return false;
        }
        String str5 = this.n;
        if (str5 == null) {
            if (ela.n != null) {
                return false;
            }
        } else if (!str5.equals(ela.n)) {
            return false;
        }
        String str6 = this.o;
        if (str6 == null) {
            if (ela.o != null) {
                return false;
            }
        } else if (!str6.equals(ela.o)) {
            return false;
        }
        String str7 = this.p;
        if (str7 == null) {
            if (ela.p != null) {
                return false;
            }
        } else if (!str7.equals(ela.p)) {
            return false;
        }
        Long l7 = this.q;
        if (l7 == null) {
            if (ela.q != null) {
                return false;
            }
        } else if (!l7.equals(ela.q)) {
            return false;
        }
        Long l8 = this.r;
        if (l8 == null) {
            if (ela.r != null) {
                return false;
            }
        } else if (!l8.equals(ela.r)) {
            return false;
        }
        String str8 = this.s;
        if (str8 == null) {
            if (ela.s != null) {
                return false;
            }
        } else if (!str8.equals(ela.s)) {
            return false;
        }
        Boolean bool = this.t;
        if (bool == null) {
            if (ela.t != null) {
                return false;
            }
        } else if (!bool.equals(ela.t)) {
            return false;
        }
        String str9 = this.u;
        if (str9 == null) {
            if (ela.u != null) {
                return false;
            }
        } else if (!str9.equals(ela.u)) {
            return false;
        }
        Long l9 = this.v;
        if (l9 == null) {
            if (ela.v != null) {
                return false;
            }
        } else if (!l9.equals(ela.v)) {
            return false;
        }
        Integer num3 = this.w;
        if (num3 == null) {
            if (ela.w != null) {
                return false;
            }
        } else if (!num3.equals(ela.w)) {
            return false;
        }
        String str10 = this.x;
        if (str10 == null) {
            if (ela.x != null) {
                return false;
            }
        } else if (!str10.equals(ela.x)) {
            return false;
        }
        String str11 = this.y;
        if (str11 == null) {
            if (ela.y != null) {
                return false;
            }
        } else if (!str11.equals(ela.y)) {
            return false;
        }
        Boolean bool2 = this.z;
        if (bool2 == null) {
            if (ela.z != null) {
                return false;
            }
        } else if (!bool2.equals(ela.z)) {
            return false;
        }
        if (!eqp.a((Object[]) this.A, (Object[]) ela.A)) {
            return false;
        }
        String str12 = this.B;
        if (str12 == null) {
            if (ela.B != null) {
                return false;
            }
        } else if (!str12.equals(ela.B)) {
            return false;
        }
        Integer num4 = this.C;
        if (num4 == null) {
            if (ela.C != null) {
                return false;
            }
        } else if (!num4.equals(ela.C)) {
            return false;
        }
        Integer num5 = this.O;
        if (num5 == null) {
            if (ela.O != null) {
                return false;
            }
        } else if (!num5.equals(ela.O)) {
            return false;
        }
        Integer num6 = this.P;
        if (num6 == null) {
            if (ela.P != null) {
                return false;
            }
        } else if (!num6.equals(ela.P)) {
            return false;
        }
        String str13 = this.D;
        if (str13 == null) {
            if (ela.D != null) {
                return false;
            }
        } else if (!str13.equals(ela.D)) {
            return false;
        }
        Long l10 = this.E;
        if (l10 == null) {
            if (ela.E != null) {
                return false;
            }
        } else if (!l10.equals(ela.E)) {
            return false;
        }
        Long l11 = this.F;
        if (l11 == null) {
            if (ela.F != null) {
                return false;
            }
        } else if (!l11.equals(ela.F)) {
            return false;
        }
        String str14 = this.G;
        if (str14 == null) {
            if (ela.G != null) {
                return false;
            }
        } else if (!str14.equals(ela.G)) {
            return false;
        }
        String str15 = this.Q;
        if (str15 == null) {
            if (ela.Q != null) {
                return false;
            }
        } else if (!str15.equals(ela.Q)) {
            return false;
        }
        Integer num7 = this.H;
        if (num7 == null) {
            if (ela.H != null) {
                return false;
            }
        } else if (!num7.equals(ela.H)) {
            return false;
        }
        String str16 = this.I;
        if (str16 == null) {
            if (ela.I != null) {
                return false;
            }
        } else if (!str16.equals(ela.I)) {
            return false;
        }
        zzb zzb = this.J;
        if (zzb == null) {
            if (ela.J != null) {
                return false;
            }
        } else if (!zzb.equals(ela.J)) {
            return false;
        }
        if (!eqp.a(this.K, ela.K)) {
            return false;
        }
        Long l12 = this.R;
        if (l12 == null) {
            if (ela.R != null) {
                return false;
            }
        } else if (!l12.equals(ela.R)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? ela.L == null || ela.L.a() : this.L.equals(ela.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i2 = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + eqp.a((Object[]) this.b)) * 31) + eqp.a((Object[]) this.c)) * 31;
        Long l2 = this.d;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.g;
        int hashCode6 = (hashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.h;
        int hashCode7 = (hashCode6 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str = this.i;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.m;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.n;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.p;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l7 = this.q;
        int hashCode16 = (hashCode15 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.r;
        int hashCode17 = (hashCode16 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str8 = this.s;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.t;
        int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.u;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l9 = this.v;
        int hashCode21 = (hashCode20 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Integer num3 = this.w;
        int hashCode22 = (hashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str10 = this.x;
        int hashCode23 = (hashCode22 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.y;
        int hashCode24 = (hashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.z;
        int hashCode25 = (((hashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + eqp.a((Object[]) this.A)) * 31;
        String str12 = this.B;
        int hashCode26 = (hashCode25 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num4 = this.C;
        int hashCode27 = (hashCode26 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.O;
        int hashCode28 = (hashCode27 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.P;
        int hashCode29 = (hashCode28 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str13 = this.D;
        int hashCode30 = (hashCode29 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l10 = this.E;
        int hashCode31 = (hashCode30 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.F;
        int hashCode32 = (hashCode31 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str14 = this.G;
        int hashCode33 = (hashCode32 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.Q;
        int hashCode34 = (hashCode33 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num7 = this.H;
        int hashCode35 = (hashCode34 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str16 = this.I;
        int hashCode36 = hashCode35 + (str16 == null ? 0 : str16.hashCode());
        zzb zzb = this.J;
        int hashCode37 = ((((hashCode36 * 31) + (zzb == null ? 0 : zzb.hashCode())) * 31) + eqp.a(this.K)) * 31;
        Long l12 = this.R;
        int hashCode38 = (hashCode37 + (l12 == null ? 0 : l12.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i2 = this.L.hashCode();
        }
        return hashCode38 + i2;
    }
}
