package defpackage;

import com.comscore.streaming.AdType;
import com.google.android.gms.internal.measurement.zzft.zzb;
import com.google.android.gms.internal.measurement.zzft.zzb.a;
import com.google.android.gms.internal.measurement.zzve;
import com.spotify.core.http.HttpConnection;

/* renamed from: ekj reason: default package */
public final class ekj extends epu<ekj> {
    private static volatile ekj[] N;
    public eke[] A;
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
    public ekg[] b;
    public ekm[] c;
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

    public static ekj[] a() {
        if (N == null) {
            synchronized (epy.b) {
                if (N == null) {
                    N = new ekj[0];
                }
            }
        }
        return N;
    }

    public ekj() {
        this.a = null;
        this.b = ekg.a();
        this.c = ekm.a();
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
        this.A = eke.a();
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
        this.K = eqc.a;
        this.R = null;
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekj)) {
            return false;
        }
        ekj ekj = (ekj) obj;
        Integer num = this.a;
        if (num == null) {
            if (ekj.a != null) {
                return false;
            }
        } else if (!num.equals(ekj.a)) {
            return false;
        }
        if (!epy.a((Object[]) this.b, (Object[]) ekj.b) || !epy.a((Object[]) this.c, (Object[]) ekj.c)) {
            return false;
        }
        Long l2 = this.d;
        if (l2 == null) {
            if (ekj.d != null) {
                return false;
            }
        } else if (!l2.equals(ekj.d)) {
            return false;
        }
        Long l3 = this.e;
        if (l3 == null) {
            if (ekj.e != null) {
                return false;
            }
        } else if (!l3.equals(ekj.e)) {
            return false;
        }
        Long l4 = this.f;
        if (l4 == null) {
            if (ekj.f != null) {
                return false;
            }
        } else if (!l4.equals(ekj.f)) {
            return false;
        }
        Long l5 = this.g;
        if (l5 == null) {
            if (ekj.g != null) {
                return false;
            }
        } else if (!l5.equals(ekj.g)) {
            return false;
        }
        Long l6 = this.h;
        if (l6 == null) {
            if (ekj.h != null) {
                return false;
            }
        } else if (!l6.equals(ekj.h)) {
            return false;
        }
        String str = this.i;
        if (str == null) {
            if (ekj.i != null) {
                return false;
            }
        } else if (!str.equals(ekj.i)) {
            return false;
        }
        String str2 = this.j;
        if (str2 == null) {
            if (ekj.j != null) {
                return false;
            }
        } else if (!str2.equals(ekj.j)) {
            return false;
        }
        String str3 = this.k;
        if (str3 == null) {
            if (ekj.k != null) {
                return false;
            }
        } else if (!str3.equals(ekj.k)) {
            return false;
        }
        String str4 = this.l;
        if (str4 == null) {
            if (ekj.l != null) {
                return false;
            }
        } else if (!str4.equals(ekj.l)) {
            return false;
        }
        Integer num2 = this.m;
        if (num2 == null) {
            if (ekj.m != null) {
                return false;
            }
        } else if (!num2.equals(ekj.m)) {
            return false;
        }
        String str5 = this.n;
        if (str5 == null) {
            if (ekj.n != null) {
                return false;
            }
        } else if (!str5.equals(ekj.n)) {
            return false;
        }
        String str6 = this.o;
        if (str6 == null) {
            if (ekj.o != null) {
                return false;
            }
        } else if (!str6.equals(ekj.o)) {
            return false;
        }
        String str7 = this.p;
        if (str7 == null) {
            if (ekj.p != null) {
                return false;
            }
        } else if (!str7.equals(ekj.p)) {
            return false;
        }
        Long l7 = this.q;
        if (l7 == null) {
            if (ekj.q != null) {
                return false;
            }
        } else if (!l7.equals(ekj.q)) {
            return false;
        }
        Long l8 = this.r;
        if (l8 == null) {
            if (ekj.r != null) {
                return false;
            }
        } else if (!l8.equals(ekj.r)) {
            return false;
        }
        String str8 = this.s;
        if (str8 == null) {
            if (ekj.s != null) {
                return false;
            }
        } else if (!str8.equals(ekj.s)) {
            return false;
        }
        Boolean bool = this.t;
        if (bool == null) {
            if (ekj.t != null) {
                return false;
            }
        } else if (!bool.equals(ekj.t)) {
            return false;
        }
        String str9 = this.u;
        if (str9 == null) {
            if (ekj.u != null) {
                return false;
            }
        } else if (!str9.equals(ekj.u)) {
            return false;
        }
        Long l9 = this.v;
        if (l9 == null) {
            if (ekj.v != null) {
                return false;
            }
        } else if (!l9.equals(ekj.v)) {
            return false;
        }
        Integer num3 = this.w;
        if (num3 == null) {
            if (ekj.w != null) {
                return false;
            }
        } else if (!num3.equals(ekj.w)) {
            return false;
        }
        String str10 = this.x;
        if (str10 == null) {
            if (ekj.x != null) {
                return false;
            }
        } else if (!str10.equals(ekj.x)) {
            return false;
        }
        String str11 = this.y;
        if (str11 == null) {
            if (ekj.y != null) {
                return false;
            }
        } else if (!str11.equals(ekj.y)) {
            return false;
        }
        Boolean bool2 = this.z;
        if (bool2 == null) {
            if (ekj.z != null) {
                return false;
            }
        } else if (!bool2.equals(ekj.z)) {
            return false;
        }
        if (!epy.a((Object[]) this.A, (Object[]) ekj.A)) {
            return false;
        }
        String str12 = this.B;
        if (str12 == null) {
            if (ekj.B != null) {
                return false;
            }
        } else if (!str12.equals(ekj.B)) {
            return false;
        }
        Integer num4 = this.C;
        if (num4 == null) {
            if (ekj.C != null) {
                return false;
            }
        } else if (!num4.equals(ekj.C)) {
            return false;
        }
        Integer num5 = this.O;
        if (num5 == null) {
            if (ekj.O != null) {
                return false;
            }
        } else if (!num5.equals(ekj.O)) {
            return false;
        }
        Integer num6 = this.P;
        if (num6 == null) {
            if (ekj.P != null) {
                return false;
            }
        } else if (!num6.equals(ekj.P)) {
            return false;
        }
        String str13 = this.D;
        if (str13 == null) {
            if (ekj.D != null) {
                return false;
            }
        } else if (!str13.equals(ekj.D)) {
            return false;
        }
        Long l10 = this.E;
        if (l10 == null) {
            if (ekj.E != null) {
                return false;
            }
        } else if (!l10.equals(ekj.E)) {
            return false;
        }
        Long l11 = this.F;
        if (l11 == null) {
            if (ekj.F != null) {
                return false;
            }
        } else if (!l11.equals(ekj.F)) {
            return false;
        }
        String str14 = this.G;
        if (str14 == null) {
            if (ekj.G != null) {
                return false;
            }
        } else if (!str14.equals(ekj.G)) {
            return false;
        }
        String str15 = this.Q;
        if (str15 == null) {
            if (ekj.Q != null) {
                return false;
            }
        } else if (!str15.equals(ekj.Q)) {
            return false;
        }
        Integer num7 = this.H;
        if (num7 == null) {
            if (ekj.H != null) {
                return false;
            }
        } else if (!num7.equals(ekj.H)) {
            return false;
        }
        String str16 = this.I;
        if (str16 == null) {
            if (ekj.I != null) {
                return false;
            }
        } else if (!str16.equals(ekj.I)) {
            return false;
        }
        zzb zzb = this.J;
        if (zzb == null) {
            if (ekj.J != null) {
                return false;
            }
        } else if (!zzb.equals(ekj.J)) {
            return false;
        }
        if (!epy.a(this.K, ekj.K)) {
            return false;
        }
        Long l12 = this.R;
        if (l12 == null) {
            if (ekj.R != null) {
                return false;
            }
        } else if (!l12.equals(ekj.R)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return ekj.L == null || ekj.L.a();
        }
        return this.L.equals(ekj.L);
    }

    public final int hashCode() {
        int i2;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i3 = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + epy.a((Object[]) this.b)) * 31) + epy.a((Object[]) this.c)) * 31;
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
        int hashCode25 = (((hashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + epy.a((Object[]) this.A)) * 31;
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
        int i4 = hashCode36 * 31;
        if (zzb == null) {
            i2 = 0;
        } else {
            i2 = zzb.hashCode();
        }
        int a2 = (((i4 + i2) * 31) + epy.a(this.K)) * 31;
        Long l12 = this.R;
        int hashCode37 = (a2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        if (this.L != null && !this.L.a()) {
            i3 = this.L.hashCode();
        }
        return hashCode37 + i3;
    }

    public final void a(ept ept) {
        Integer num = this.a;
        if (num != null) {
            ept.a(1, num.intValue());
        }
        ekg[] ekgArr = this.b;
        if (ekgArr != null && ekgArr.length > 0) {
            int i2 = 0;
            while (true) {
                ekg[] ekgArr2 = this.b;
                if (i2 >= ekgArr2.length) {
                    break;
                }
                ekg ekg = ekgArr2[i2];
                if (ekg != null) {
                    ept.a(2, (epz) ekg);
                }
                i2++;
            }
        }
        ekm[] ekmArr = this.c;
        if (ekmArr != null && ekmArr.length > 0) {
            int i3 = 0;
            while (true) {
                ekm[] ekmArr2 = this.c;
                if (i3 >= ekmArr2.length) {
                    break;
                }
                ekm ekm = ekmArr2[i3];
                if (ekm != null) {
                    ept.a(3, (epz) ekm);
                }
                i3++;
            }
        }
        Long l2 = this.d;
        if (l2 != null) {
            ept.b(4, l2.longValue());
        }
        Long l3 = this.e;
        if (l3 != null) {
            ept.b(5, l3.longValue());
        }
        Long l4 = this.f;
        if (l4 != null) {
            ept.b(6, l4.longValue());
        }
        Long l5 = this.h;
        if (l5 != null) {
            ept.b(7, l5.longValue());
        }
        String str = this.i;
        if (str != null) {
            ept.a(8, str);
        }
        String str2 = this.j;
        if (str2 != null) {
            ept.a(9, str2);
        }
        String str3 = this.k;
        if (str3 != null) {
            ept.a(10, str3);
        }
        String str4 = this.l;
        if (str4 != null) {
            ept.a(11, str4);
        }
        Integer num2 = this.m;
        if (num2 != null) {
            ept.a(12, num2.intValue());
        }
        String str5 = this.n;
        if (str5 != null) {
            ept.a(13, str5);
        }
        String str6 = this.o;
        if (str6 != null) {
            ept.a(14, str6);
        }
        String str7 = this.p;
        if (str7 != null) {
            ept.a(16, str7);
        }
        Long l6 = this.q;
        if (l6 != null) {
            ept.b(17, l6.longValue());
        }
        Long l7 = this.r;
        if (l7 != null) {
            ept.b(18, l7.longValue());
        }
        String str8 = this.s;
        if (str8 != null) {
            ept.a(19, str8);
        }
        Boolean bool = this.t;
        if (bool != null) {
            ept.a(20, bool.booleanValue());
        }
        String str9 = this.u;
        if (str9 != null) {
            ept.a(21, str9);
        }
        Long l8 = this.v;
        if (l8 != null) {
            ept.b(22, l8.longValue());
        }
        Integer num3 = this.w;
        if (num3 != null) {
            ept.a(23, num3.intValue());
        }
        String str10 = this.x;
        if (str10 != null) {
            ept.a(24, str10);
        }
        String str11 = this.y;
        if (str11 != null) {
            ept.a(25, str11);
        }
        Long l9 = this.g;
        if (l9 != null) {
            ept.b(26, l9.longValue());
        }
        Boolean bool2 = this.z;
        if (bool2 != null) {
            ept.a(28, bool2.booleanValue());
        }
        eke[] ekeArr = this.A;
        if (ekeArr != null && ekeArr.length > 0) {
            int i4 = 0;
            while (true) {
                eke[] ekeArr2 = this.A;
                if (i4 >= ekeArr2.length) {
                    break;
                }
                eke eke = ekeArr2[i4];
                if (eke != null) {
                    ept.a(29, (epz) eke);
                }
                i4++;
            }
        }
        String str12 = this.B;
        if (str12 != null) {
            ept.a(30, str12);
        }
        Integer num4 = this.C;
        if (num4 != null) {
            ept.a(31, num4.intValue());
        }
        Integer num5 = this.O;
        if (num5 != null) {
            ept.a(32, num5.intValue());
        }
        Integer num6 = this.P;
        if (num6 != null) {
            ept.a(33, num6.intValue());
        }
        String str13 = this.D;
        if (str13 != null) {
            ept.a(34, str13);
        }
        Long l10 = this.E;
        if (l10 != null) {
            ept.b(35, l10.longValue());
        }
        Long l11 = this.F;
        if (l11 != null) {
            ept.b(36, l11.longValue());
        }
        String str14 = this.G;
        if (str14 != null) {
            ept.a(37, str14);
        }
        String str15 = this.Q;
        if (str15 != null) {
            ept.a(38, str15);
        }
        Integer num7 = this.H;
        if (num7 != null) {
            ept.a(39, num7.intValue());
        }
        String str16 = this.I;
        if (str16 != null) {
            ept.a(41, str16);
        }
        zzb zzb = this.J;
        if (zzb != null) {
            if (ept.b == null) {
                ept.b = zzve.a(ept.a);
                ept.c = ept.a.position();
            } else if (ept.c != ept.a.position()) {
                ept.b.b(ept.a.array(), ept.c, ept.a.position() - ept.c);
                ept.c = ept.a.position();
            }
            zzve zzve = ept.b;
            zzve.a(44, (enx) zzb);
            zzve.h();
            ept.c = ept.a.position();
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
                ept.c(45, 0);
                ept.b(i6);
                i5++;
            }
        }
        Long l12 = this.R;
        if (l12 != null) {
            ept.b(46, l12.longValue());
        }
        super.a(ept);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int[] iArr;
        int b2 = super.b();
        Integer num = this.a;
        if (num != null) {
            b2 += ept.b(1, num.intValue());
        }
        ekg[] ekgArr = this.b;
        int i2 = 0;
        if (ekgArr != null && ekgArr.length > 0) {
            int i3 = b2;
            int i4 = 0;
            while (true) {
                ekg[] ekgArr2 = this.b;
                if (i4 >= ekgArr2.length) {
                    break;
                }
                ekg ekg = ekgArr2[i4];
                if (ekg != null) {
                    i3 += ept.b(2, (epz) ekg);
                }
                i4++;
            }
            b2 = i3;
        }
        ekm[] ekmArr = this.c;
        if (ekmArr != null && ekmArr.length > 0) {
            int i5 = b2;
            int i6 = 0;
            while (true) {
                ekm[] ekmArr2 = this.c;
                if (i6 >= ekmArr2.length) {
                    break;
                }
                ekm ekm = ekmArr2[i6];
                if (ekm != null) {
                    i5 += ept.b(3, (epz) ekm);
                }
                i6++;
            }
            b2 = i5;
        }
        Long l2 = this.d;
        if (l2 != null) {
            b2 += ept.c(4, l2.longValue());
        }
        Long l3 = this.e;
        if (l3 != null) {
            b2 += ept.c(5, l3.longValue());
        }
        Long l4 = this.f;
        if (l4 != null) {
            b2 += ept.c(6, l4.longValue());
        }
        Long l5 = this.h;
        if (l5 != null) {
            b2 += ept.c(7, l5.longValue());
        }
        String str = this.i;
        if (str != null) {
            b2 += ept.b(8, str);
        }
        String str2 = this.j;
        if (str2 != null) {
            b2 += ept.b(9, str2);
        }
        String str3 = this.k;
        if (str3 != null) {
            b2 += ept.b(10, str3);
        }
        String str4 = this.l;
        if (str4 != null) {
            b2 += ept.b(11, str4);
        }
        Integer num2 = this.m;
        if (num2 != null) {
            b2 += ept.b(12, num2.intValue());
        }
        String str5 = this.n;
        if (str5 != null) {
            b2 += ept.b(13, str5);
        }
        String str6 = this.o;
        if (str6 != null) {
            b2 += ept.b(14, str6);
        }
        String str7 = this.p;
        if (str7 != null) {
            b2 += ept.b(16, str7);
        }
        Long l6 = this.q;
        if (l6 != null) {
            b2 += ept.c(17, l6.longValue());
        }
        Long l7 = this.r;
        if (l7 != null) {
            b2 += ept.c(18, l7.longValue());
        }
        String str8 = this.s;
        if (str8 != null) {
            b2 += ept.b(19, str8);
        }
        Boolean bool = this.t;
        if (bool != null) {
            bool.booleanValue();
            b2 += ept.c(160) + 1;
        }
        String str9 = this.u;
        if (str9 != null) {
            b2 += ept.b(21, str9);
        }
        Long l8 = this.v;
        if (l8 != null) {
            b2 += ept.c(22, l8.longValue());
        }
        Integer num3 = this.w;
        if (num3 != null) {
            b2 += ept.b(23, num3.intValue());
        }
        String str10 = this.x;
        if (str10 != null) {
            b2 += ept.b(24, str10);
        }
        String str11 = this.y;
        if (str11 != null) {
            b2 += ept.b(25, str11);
        }
        Long l9 = this.g;
        if (l9 != null) {
            b2 += ept.c(26, l9.longValue());
        }
        Boolean bool2 = this.z;
        if (bool2 != null) {
            bool2.booleanValue();
            b2 += ept.c(224) + 1;
        }
        eke[] ekeArr = this.A;
        if (ekeArr != null && ekeArr.length > 0) {
            int i7 = b2;
            int i8 = 0;
            while (true) {
                eke[] ekeArr2 = this.A;
                if (i8 >= ekeArr2.length) {
                    break;
                }
                eke eke = ekeArr2[i8];
                if (eke != null) {
                    i7 += ept.b(29, (epz) eke);
                }
                i8++;
            }
            b2 = i7;
        }
        String str12 = this.B;
        if (str12 != null) {
            b2 += ept.b(30, str12);
        }
        Integer num4 = this.C;
        if (num4 != null) {
            b2 += ept.b(31, num4.intValue());
        }
        Integer num5 = this.O;
        if (num5 != null) {
            b2 += ept.b(32, num5.intValue());
        }
        Integer num6 = this.P;
        if (num6 != null) {
            b2 += ept.b(33, num6.intValue());
        }
        String str13 = this.D;
        if (str13 != null) {
            b2 += ept.b(34, str13);
        }
        Long l10 = this.E;
        if (l10 != null) {
            b2 += ept.c(35, l10.longValue());
        }
        Long l11 = this.F;
        if (l11 != null) {
            b2 += ept.c(36, l11.longValue());
        }
        String str14 = this.G;
        if (str14 != null) {
            b2 += ept.b(37, str14);
        }
        String str15 = this.Q;
        if (str15 != null) {
            b2 += ept.b(38, str15);
        }
        Integer num7 = this.H;
        if (num7 != null) {
            b2 += ept.b(39, num7.intValue());
        }
        String str16 = this.I;
        if (str16 != null) {
            b2 += ept.b(41, str16);
        }
        zzb zzb = this.J;
        if (zzb != null) {
            b2 += zzve.c(44, (enx) zzb);
        }
        int[] iArr2 = this.K;
        if (iArr2 != null && iArr2.length > 0) {
            int i9 = 0;
            while (true) {
                iArr = this.K;
                if (i2 >= iArr.length) {
                    break;
                }
                i9 += ept.c(iArr[i2]);
                i2++;
            }
            b2 = b2 + i9 + (iArr.length * 2);
        }
        Long l12 = this.R;
        return l12 != null ? b2 + ept.c(46, l12.longValue()) : b2;
    }

    public final /* synthetic */ epz a(eps eps) {
        while (true) {
            int a2 = eps.a();
            switch (a2) {
                case 0:
                    return this;
                case 8:
                    this.a = Integer.valueOf(eps.d());
                    break;
                case 18:
                    int a3 = eqc.a(eps, 18);
                    ekg[] ekgArr = this.b;
                    int length = ekgArr == null ? 0 : ekgArr.length;
                    ekg[] ekgArr2 = new ekg[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, ekgArr2, 0, length);
                    }
                    while (length < ekgArr2.length - 1) {
                        ekgArr2[length] = new ekg();
                        eps.a((epz) ekgArr2[length]);
                        eps.a();
                        length++;
                    }
                    ekgArr2[length] = new ekg();
                    eps.a((epz) ekgArr2[length]);
                    this.b = ekgArr2;
                    break;
                case 26:
                    int a4 = eqc.a(eps, 26);
                    ekm[] ekmArr = this.c;
                    int length2 = ekmArr == null ? 0 : ekmArr.length;
                    ekm[] ekmArr2 = new ekm[(a4 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.c, 0, ekmArr2, 0, length2);
                    }
                    while (length2 < ekmArr2.length - 1) {
                        ekmArr2[length2] = new ekm();
                        eps.a((epz) ekmArr2[length2]);
                        eps.a();
                        length2++;
                    }
                    ekmArr2[length2] = new ekm();
                    eps.a((epz) ekmArr2[length2]);
                    this.c = ekmArr2;
                    break;
                case 32:
                    this.d = Long.valueOf(eps.e());
                    break;
                case 40:
                    this.e = Long.valueOf(eps.e());
                    break;
                case 48:
                    this.f = Long.valueOf(eps.e());
                    break;
                case 56:
                    this.h = Long.valueOf(eps.e());
                    break;
                case b.bu /*66*/:
                    this.i = eps.c();
                    break;
                case b.bC /*74*/:
                    this.j = eps.c();
                    break;
                case 82:
                    this.k = eps.c();
                    break;
                case 90:
                    this.l = eps.c();
                    break;
                case 96:
                    this.m = Integer.valueOf(eps.d());
                    break;
                case 106:
                    this.n = eps.c();
                    break;
                case a.aB /*114*/:
                    this.o = eps.c();
                    break;
                case 130:
                    this.p = eps.c();
                    break;
                case 136:
                    this.q = Long.valueOf(eps.e());
                    break;
                case 144:
                    this.r = Long.valueOf(eps.e());
                    break;
                case 154:
                    this.s = eps.c();
                    break;
                case 160:
                    this.t = Boolean.valueOf(eps.b());
                    break;
                case 170:
                    this.u = eps.c();
                    break;
                case 176:
                    this.v = Long.valueOf(eps.e());
                    break;
                case 184:
                    this.w = Integer.valueOf(eps.d());
                    break;
                case 194:
                    this.x = eps.c();
                    break;
                case 202:
                    this.y = eps.c();
                    break;
                case 208:
                    this.g = Long.valueOf(eps.e());
                    break;
                case 224:
                    this.z = Boolean.valueOf(eps.b());
                    break;
                case AdType.BRANDED_ON_DEMAND_CONTENT /*234*/:
                    int a5 = eqc.a(eps, AdType.BRANDED_ON_DEMAND_CONTENT);
                    eke[] ekeArr = this.A;
                    int length3 = ekeArr == null ? 0 : ekeArr.length;
                    eke[] ekeArr2 = new eke[(a5 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.A, 0, ekeArr2, 0, length3);
                    }
                    while (length3 < ekeArr2.length - 1) {
                        ekeArr2[length3] = new eke();
                        eps.a((epz) ekeArr2[length3]);
                        eps.a();
                        length3++;
                    }
                    ekeArr2[length3] = new eke();
                    eps.a((epz) ekeArr2[length3]);
                    this.A = ekeArr2;
                    break;
                case 242:
                    this.B = eps.c();
                    break;
                case 248:
                    this.C = Integer.valueOf(eps.d());
                    break;
                case 256:
                    this.O = Integer.valueOf(eps.d());
                    break;
                case 264:
                    this.P = Integer.valueOf(eps.d());
                    break;
                case 274:
                    this.D = eps.c();
                    break;
                case 280:
                    this.E = Long.valueOf(eps.e());
                    break;
                case 288:
                    this.F = Long.valueOf(eps.e());
                    break;
                case 298:
                    this.G = eps.c();
                    break;
                case HttpConnection.kErrorHttpTooManyRedirects /*306*/:
                    this.Q = eps.c();
                    break;
                case 312:
                    this.H = Integer.valueOf(eps.d());
                    break;
                case 330:
                    this.I = eps.c();
                    break;
                case 354:
                    zzb zzb = (zzb) eps.a(zzb.b());
                    zzb zzb2 = this.J;
                    if (zzb2 != null) {
                        zzb = (zzb) ((emw) ((a) ((a) zzb2.g()).a(zzb)).d());
                    }
                    this.J = zzb;
                    break;
                case 360:
                    int a6 = eqc.a(eps, 360);
                    int[] iArr = this.K;
                    int length4 = iArr == null ? 0 : iArr.length;
                    int[] iArr2 = new int[(a6 + length4)];
                    if (length4 != 0) {
                        System.arraycopy(this.K, 0, iArr2, 0, length4);
                    }
                    while (length4 < iArr2.length - 1) {
                        iArr2[length4] = eps.d();
                        eps.a();
                        length4++;
                    }
                    iArr2[length4] = eps.d();
                    this.K = iArr2;
                    break;
                case 362:
                    int c2 = eps.c(eps.d());
                    int i2 = eps.i();
                    int i3 = 0;
                    while (eps.h() > 0) {
                        eps.d();
                        i3++;
                    }
                    eps.e(i2);
                    int[] iArr3 = this.K;
                    int length5 = iArr3 == null ? 0 : iArr3.length;
                    int[] iArr4 = new int[(i3 + length5)];
                    if (length5 != 0) {
                        System.arraycopy(this.K, 0, iArr4, 0, length5);
                    }
                    while (length5 < iArr4.length) {
                        iArr4[length5] = eps.d();
                        length5++;
                    }
                    this.K = iArr4;
                    eps.d(c2);
                    break;
                case 368:
                    this.R = Long.valueOf(eps.e());
                    break;
                default:
                    if (super.a(eps, a2)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }
}
