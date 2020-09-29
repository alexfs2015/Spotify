package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzwf;
import com.google.android.gms.internal.measurement.zzzg;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

/* renamed from: eob reason: default package */
final class eob<T> implements eon<T> {
    private static final int[] a = new int[0];
    private static final Unsafe b = epk.c();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final enx g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final eoe o;
    private final enj p;
    private final epe<?, ?> q;
    private final emm<?> r;
    private final ens s;

    private eob(int[] iArr, Object[] objArr, int i2, int i3, enx enx, boolean z, int[] iArr2, int i4, int i5, eoe eoe, enj enj, epe<?, ?> epe, emm<?> emm, ens ens) {
        this.c = iArr;
        this.d = objArr;
        this.e = i2;
        this.f = i3;
        this.i = enx instanceof emw;
        this.j = z;
        this.h = emm != null && emm.a(enx);
        this.k = false;
        this.l = iArr2;
        this.m = i4;
        this.n = i5;
        this.o = eoe;
        this.p = enj;
        this.q = epe;
        this.r = emm;
        this.g = enx;
        this.s = ens;
    }

    private static boolean e(int i2) {
        return (i2 & 536870912) != 0;
    }

    static <T> eob<T> a(env env, eoe eoe, enj enj, epe<?, ?> epe, emm<?> emm, ens ens) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr2;
        eol eol;
        String str;
        int i13;
        int i14;
        int i15;
        char c2;
        int i16;
        Field field;
        char charAt;
        int i17;
        int i18;
        Field field2;
        Field field3;
        char charAt2;
        int i19;
        char charAt3;
        int i20;
        char charAt4;
        int i21;
        char c3;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        char charAt5;
        int i27;
        char charAt6;
        int i28;
        char charAt7;
        int i29;
        char charAt8;
        char charAt9;
        char charAt10;
        char charAt11;
        char charAt12;
        char charAt13;
        char charAt14;
        env env2 = env;
        if (env2 instanceof eol) {
            eol eol2 = (eol) env2;
            int i30 = 0;
            boolean z = eol2.a() == e.i;
            String str2 = eol2.b;
            int length = str2.length();
            char charAt15 = str2.charAt(0);
            if (charAt15 >= 55296) {
                char c4 = charAt15 & 8191;
                int i31 = 1;
                int i32 = 13;
                while (true) {
                    i2 = i31 + 1;
                    charAt14 = str2.charAt(i31);
                    if (charAt14 < 55296) {
                        break;
                    }
                    c4 |= (charAt14 & 8191) << i32;
                    i32 += 13;
                    i31 = i2;
                }
                charAt15 = (charAt14 << i32) | c4;
            } else {
                i2 = 1;
            }
            int i33 = i2 + 1;
            char charAt16 = str2.charAt(i2);
            if (charAt16 >= 55296) {
                char c5 = charAt16 & 8191;
                int i34 = 13;
                while (true) {
                    i3 = i33 + 1;
                    charAt13 = str2.charAt(i33);
                    if (charAt13 < 55296) {
                        break;
                    }
                    c5 |= (charAt13 & 8191) << i34;
                    i34 += 13;
                    i33 = i3;
                }
                charAt16 = c5 | (charAt13 << i34);
            } else {
                i3 = i33;
            }
            if (charAt16 == 0) {
                i4 = i3;
                i9 = 0;
                i8 = 0;
                i7 = 0;
                i6 = 0;
                i5 = 0;
                iArr = a;
                i10 = 0;
            } else {
                int i35 = i3 + 1;
                char charAt17 = str2.charAt(i3);
                if (charAt17 >= 55296) {
                    char c6 = charAt17 & 8191;
                    int i36 = 13;
                    while (true) {
                        i21 = i35 + 1;
                        charAt12 = str2.charAt(i35);
                        if (charAt12 < 55296) {
                            break;
                        }
                        c6 |= (charAt12 & 8191) << i36;
                        i36 += 13;
                        i35 = i21;
                    }
                    c3 = (charAt12 << i36) | c6;
                } else {
                    i21 = i35;
                    c3 = charAt17;
                }
                int i37 = i21 + 1;
                char charAt18 = str2.charAt(i21);
                if (charAt18 >= 55296) {
                    char c7 = charAt18 & 8191;
                    int i38 = 13;
                    while (true) {
                        i22 = i37 + 1;
                        charAt11 = str2.charAt(i37);
                        if (charAt11 < 55296) {
                            break;
                        }
                        c7 |= (charAt11 & 8191) << i38;
                        i38 += 13;
                        i37 = i22;
                    }
                    charAt18 = c7 | (charAt11 << i38);
                } else {
                    i22 = i37;
                }
                int i39 = i22 + 1;
                int charAt19 = str2.charAt(i22);
                if (charAt19 >= 55296) {
                    int i40 = charAt19 & 8191;
                    int i41 = 13;
                    while (true) {
                        i23 = i39 + 1;
                        charAt10 = str2.charAt(i39);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i40 |= (charAt10 & 8191) << i41;
                        i41 += 13;
                        i39 = i23;
                    }
                    charAt19 = (charAt10 << i41) | i40;
                } else {
                    i23 = i39;
                }
                int i42 = i23 + 1;
                int charAt20 = str2.charAt(i23);
                if (charAt20 >= 55296) {
                    int i43 = charAt20 & 8191;
                    int i44 = 13;
                    while (true) {
                        i24 = i42 + 1;
                        charAt9 = str2.charAt(i42);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i43 |= (charAt9 & 8191) << i44;
                        i44 += 13;
                        i42 = i24;
                    }
                    charAt20 = (charAt9 << i44) | i43;
                } else {
                    i24 = i42;
                }
                int i45 = i24 + 1;
                i6 = str2.charAt(i24);
                if (i6 >= 55296) {
                    int i46 = i6 & 8191;
                    int i47 = 13;
                    while (true) {
                        i29 = i45 + 1;
                        charAt8 = str2.charAt(i45);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i46 |= (charAt8 & 8191) << i47;
                        i47 += 13;
                        i45 = i29;
                    }
                    i6 = (charAt8 << i47) | i46;
                    i45 = i29;
                }
                int i48 = i45 + 1;
                char charAt21 = str2.charAt(i45);
                if (charAt21 >= 55296) {
                    char c8 = charAt21 & 8191;
                    int i49 = 13;
                    while (true) {
                        i28 = i48 + 1;
                        charAt7 = str2.charAt(i48);
                        if (charAt7 < 55296) {
                            break;
                        }
                        c8 |= (charAt7 & 8191) << i49;
                        i49 += 13;
                        i48 = i28;
                    }
                    charAt21 = c8 | (charAt7 << i49);
                    i48 = i28;
                }
                int i50 = i48 + 1;
                char charAt22 = str2.charAt(i48);
                if (charAt22 >= 55296) {
                    int i51 = 13;
                    int i52 = i50;
                    int i53 = charAt22 & 8191;
                    int i54 = i52;
                    while (true) {
                        i27 = i54 + 1;
                        charAt6 = str2.charAt(i54);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i53 |= (charAt6 & 8191) << i51;
                        i51 += 13;
                        i54 = i27;
                    }
                    charAt22 = i53 | (charAt6 << i51);
                    i25 = i27;
                } else {
                    i25 = i50;
                }
                i4 = i25 + 1;
                char charAt23 = str2.charAt(i25);
                if (charAt23 >= 55296) {
                    int i55 = 13;
                    int i56 = i4;
                    int i57 = charAt23 & 8191;
                    int i58 = i56;
                    while (true) {
                        i26 = i58 + 1;
                        charAt5 = str2.charAt(i58);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i57 |= (charAt5 & 8191) << i55;
                        i55 += 13;
                        i58 = i26;
                    }
                    charAt23 = i57 | (charAt5 << i55);
                    i4 = i26;
                }
                i8 = (c3 << 1) + charAt18;
                int i59 = charAt20;
                i7 = charAt23;
                i30 = charAt21;
                i9 = i59;
                int[] iArr3 = new int[(charAt23 + charAt21 + charAt22)];
                i5 = c3;
                i10 = charAt19;
                iArr = iArr3;
            }
            Unsafe unsafe = b;
            Object[] objArr = eol2.c;
            Class cls = eol2.a.getClass();
            int i60 = i8;
            int[] iArr4 = new int[(i6 * 3)];
            Object[] objArr2 = new Object[(i6 << 1)];
            int i61 = i30 + i7;
            int i62 = i61;
            int i63 = i7;
            int i64 = i4;
            int i65 = i60;
            int i66 = 0;
            int i67 = 0;
            while (i64 < length) {
                int i68 = i64 + 1;
                int charAt24 = str2.charAt(i64);
                int i69 = length;
                char c9 = 55296;
                if (charAt24 >= 55296) {
                    int i70 = 13;
                    int i71 = i68;
                    int i72 = charAt24 & 8191;
                    int i73 = i71;
                    while (true) {
                        i20 = i73 + 1;
                        charAt4 = str2.charAt(i73);
                        if (charAt4 < c9) {
                            break;
                        }
                        i72 |= (charAt4 & 8191) << i70;
                        i70 += 13;
                        i73 = i20;
                        c9 = 55296;
                    }
                    charAt24 = i72 | (charAt4 << i70);
                    i11 = i20;
                } else {
                    i11 = i68;
                }
                int i74 = i11 + 1;
                char charAt25 = str2.charAt(i11);
                int i75 = i7;
                char c10 = 55296;
                if (charAt25 >= 55296) {
                    int i76 = 13;
                    int i77 = i74;
                    int i78 = charAt25 & 8191;
                    int i79 = i77;
                    while (true) {
                        i19 = i79 + 1;
                        charAt3 = str2.charAt(i79);
                        if (charAt3 < c10) {
                            break;
                        }
                        i78 |= (charAt3 & 8191) << i76;
                        i76 += 13;
                        i79 = i19;
                        c10 = 55296;
                    }
                    charAt25 = i78 | (charAt3 << i76);
                    i12 = i19;
                } else {
                    i12 = i74;
                }
                boolean z2 = z;
                char c11 = charAt25 & 255;
                int i80 = i9;
                if ((charAt25 & 1024) != 0) {
                    int i81 = i66 + 1;
                    iArr[i66] = i67;
                    i66 = i81;
                }
                int i82 = i10;
                if (c11 >= '3') {
                    int i83 = i12 + 1;
                    char charAt26 = str2.charAt(i12);
                    char c12 = 55296;
                    if (charAt26 >= 55296) {
                        char c13 = charAt26 & 8191;
                        int i84 = 13;
                        while (true) {
                            i18 = i83 + 1;
                            charAt2 = str2.charAt(i83);
                            if (charAt2 < c12) {
                                break;
                            }
                            c13 |= (charAt2 & 8191) << i84;
                            i84 += 13;
                            i83 = i18;
                            c12 = 55296;
                        }
                        charAt26 = c13 | (charAt2 << i84);
                    } else {
                        i18 = i83;
                    }
                    int i85 = c11 - '3';
                    if (i85 == 9 || i85 == 17) {
                        int i86 = i65 + 1;
                        objArr2[((i67 / 3) << 1) + 1] = objArr[i65];
                        i65 = i86;
                    } else if (i85 == 12 && (charAt15 & 1) == 1) {
                        int i87 = i65 + 1;
                        objArr2[((i67 / 3) << 1) + 1] = objArr[i65];
                        i65 = i87;
                    }
                    int i88 = charAt26 << 1;
                    Object obj = objArr[i88];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = a(cls, (String) obj);
                        objArr[i88] = field2;
                    }
                    iArr2 = iArr4;
                    i13 = (int) unsafe.objectFieldOffset(field2);
                    int i89 = i88 + 1;
                    Object obj2 = objArr[i89];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = a(cls, (String) obj2);
                        objArr[i89] = field3;
                    }
                    i14 = (int) unsafe.objectFieldOffset(field3);
                    eol = eol2;
                    str = str2;
                    i12 = i18;
                    i15 = 0;
                } else {
                    iArr2 = iArr4;
                    int i90 = i65 + 1;
                    Field a2 = a(cls, (String) objArr[i65]);
                    if (c11 == 9 || c11 == 17) {
                        eol = eol2;
                        c2 = 1;
                        objArr2[((i67 / 3) << 1) + 1] = a2.getType();
                    } else {
                        if (c11 == 27 || c11 == '1') {
                            eol = eol2;
                            c2 = 1;
                            i17 = i90 + 1;
                            objArr2[((i67 / 3) << 1) + 1] = objArr[i90];
                        } else if (c11 == 12 || c11 == 30 || c11 == ',') {
                            eol = eol2;
                            c2 = 1;
                            if ((charAt15 & 1) == 1) {
                                i17 = i90 + 1;
                                objArr2[((i67 / 3) << 1) + 1] = objArr[i90];
                            }
                        } else {
                            if (c11 == '2') {
                                int i91 = i63 + 1;
                                iArr[i63] = i67;
                                int i92 = (i67 / 3) << 1;
                                int i93 = i90 + 1;
                                objArr2[i92] = objArr[i90];
                                if ((charAt25 & 2048) != 0) {
                                    i90 = i93 + 1;
                                    objArr2[i92 + 1] = objArr[i93];
                                    eol = eol2;
                                    i63 = i91;
                                    c2 = 1;
                                } else {
                                    i63 = i91;
                                    i90 = i93;
                                }
                            }
                            eol = eol2;
                            c2 = 1;
                        }
                        i90 = i17;
                    }
                    i13 = (int) unsafe.objectFieldOffset(a2);
                    if ((charAt15 & 1) != c2 || c11 > 17) {
                        str = str2;
                        i15 = 0;
                        i14 = 0;
                    } else {
                        int i94 = i12 + 1;
                        char charAt27 = str2.charAt(i12);
                        if (charAt27 >= 55296) {
                            char c14 = charAt27 & 8191;
                            int i95 = 13;
                            while (true) {
                                i16 = i94 + 1;
                                charAt = str2.charAt(i94);
                                if (charAt < 55296) {
                                    break;
                                }
                                c14 |= (charAt & 8191) << i95;
                                i95 += 13;
                                i94 = i16;
                            }
                            charAt27 = c14 | (charAt << i95);
                        } else {
                            i16 = i94;
                        }
                        int i96 = (i5 << 1) + (charAt27 / ' ');
                        Object obj3 = objArr[i96];
                        if (obj3 instanceof Field) {
                            field = (Field) obj3;
                        } else {
                            field = a(cls, (String) obj3);
                            objArr[i96] = field;
                        }
                        str = str2;
                        int objectFieldOffset = (int) unsafe.objectFieldOffset(field);
                        int i97 = charAt27 % ' ';
                        i14 = objectFieldOffset;
                        i12 = i16;
                        i15 = i97;
                    }
                    if (c11 >= 18 && c11 <= '1') {
                        int i98 = i62 + 1;
                        iArr[i62] = i13;
                        i62 = i98;
                    }
                    i65 = i90;
                }
                int i99 = i67 + 1;
                iArr2[i67] = charAt24;
                int i100 = i99 + 1;
                iArr2[i99] = ((charAt25 & 256) != 0 ? 268435456 : 0) | ((charAt25 & 512) != 0 ? 536870912 : 0) | (c11 << 20) | i13;
                i67 = i100 + 1;
                iArr2[i100] = (i15 << 20) | i14;
                i64 = i12;
                str2 = str;
                z = z2;
                length = i69;
                i7 = i75;
                i9 = i80;
                eol2 = eol;
                i10 = i82;
                iArr4 = iArr2;
            }
            int i101 = i10;
            int i102 = i9;
            boolean z3 = z;
            int i103 = i7;
            eob eob = new eob(iArr4, objArr2, i10, i9, eol2.a, z, iArr, i7, i61, eoe, enj, epe, emm, ens);
            return eob;
        }
        epa epa = (epa) env2;
        throw new NoSuchMethodError();
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    public final T a() {
        return this.o.a(this.g);
    }

    /* JADX INFO: used method not loaded: eop.a(java.lang.Object, java.lang.Object):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (defpackage.eop.a(defpackage.epk.f(r10, r6), defpackage.epk.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (defpackage.epk.b(r10, r6) == defpackage.epk.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (defpackage.epk.a((java.lang.Object) r10, r6) == defpackage.epk.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (defpackage.epk.b(r10, r6) == defpackage.epk.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (defpackage.epk.a((java.lang.Object) r10, r6) == defpackage.epk.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (defpackage.epk.a((java.lang.Object) r10, r6) == defpackage.epk.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (defpackage.epk.a((java.lang.Object) r10, r6) == defpackage.epk.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (defpackage.eop.a(defpackage.epk.f(r10, r6), defpackage.epk.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (defpackage.eop.a(defpackage.epk.f(r10, r6), defpackage.epk.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (defpackage.eop.a(defpackage.epk.f(r10, r6), defpackage.epk.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (defpackage.epk.c(r10, r6) == defpackage.epk.c(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (defpackage.epk.a((java.lang.Object) r10, r6) == defpackage.epk.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (defpackage.epk.b(r10, r6) == defpackage.epk.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (defpackage.epk.a((java.lang.Object) r10, r6) == defpackage.epk.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (defpackage.epk.b(r10, r6) == defpackage.epk.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (defpackage.epk.b(r10, r6) == defpackage.epk.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(defpackage.epk.d(r10, r6)) == java.lang.Float.floatToIntBits(defpackage.epk.d(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(defpackage.epk.e(r10, r6)) == java.lang.Double.doubleToLongBits(defpackage.epk.e(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (defpackage.eop.a(defpackage.epk.f(r10, r6), defpackage.epk.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.c(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.d(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = defpackage.epk.a(r10, r4)
            int r4 = defpackage.epk.a(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = defpackage.epk.f(r10, r6)
            java.lang.Object r5 = defpackage.epk.f(r11, r6)
            boolean r4 = defpackage.eop.a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = defpackage.epk.f(r10, r6)
            java.lang.Object r4 = defpackage.epk.f(r11, r6)
            boolean r3 = defpackage.eop.a(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = defpackage.epk.f(r10, r6)
            java.lang.Object r4 = defpackage.epk.f(r11, r6)
            boolean r3 = defpackage.eop.a(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = defpackage.epk.f(r10, r6)
            java.lang.Object r5 = defpackage.epk.f(r11, r6)
            boolean r4 = defpackage.eop.a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = defpackage.epk.b(r10, r6)
            long r6 = defpackage.epk.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = defpackage.epk.a(r10, r6)
            int r5 = defpackage.epk.a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = defpackage.epk.b(r10, r6)
            long r6 = defpackage.epk.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = defpackage.epk.a(r10, r6)
            int r5 = defpackage.epk.a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = defpackage.epk.a(r10, r6)
            int r5 = defpackage.epk.a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = defpackage.epk.a(r10, r6)
            int r5 = defpackage.epk.a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = defpackage.epk.f(r10, r6)
            java.lang.Object r5 = defpackage.epk.f(r11, r6)
            boolean r4 = defpackage.eop.a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = defpackage.epk.f(r10, r6)
            java.lang.Object r5 = defpackage.epk.f(r11, r6)
            boolean r4 = defpackage.eop.a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = defpackage.epk.f(r10, r6)
            java.lang.Object r5 = defpackage.epk.f(r11, r6)
            boolean r4 = defpackage.eop.a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = defpackage.epk.c(r10, r6)
            boolean r5 = defpackage.epk.c(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = defpackage.epk.a(r10, r6)
            int r5 = defpackage.epk.a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = defpackage.epk.b(r10, r6)
            long r6 = defpackage.epk.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = defpackage.epk.a(r10, r6)
            int r5 = defpackage.epk.a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = defpackage.epk.b(r10, r6)
            long r6 = defpackage.epk.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = defpackage.epk.b(r10, r6)
            long r6 = defpackage.epk.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = defpackage.epk.d(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = defpackage.epk.d(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = defpackage.epk.e(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = defpackage.epk.e(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            epe<?, ?> r0 = r9.q
            java.lang.Object r0 = r0.b(r10)
            epe<?, ?> r2 = r9.q
            java.lang.Object r2 = r2.b(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.h
            if (r0 == 0) goto L_0x01f1
            emm<?> r0 = r9.r
            emp r10 = r0.a(r10)
            emm<?> r0 = r9.r
            emp r11 = r0.a(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eob.a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.c(r1)
            int[] r4 = r8.c
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = defpackage.epk.f(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = e(r9, r5)
            int r3 = defpackage.emy.a(r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = d(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = e(r9, r5)
            int r3 = defpackage.emy.a(r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = d(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = d(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = d(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = defpackage.epk.f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = defpackage.epk.f(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = defpackage.epk.f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = f(r9, r5)
            int r3 = defpackage.emy.a(r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = d(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = e(r9, r5)
            int r3 = defpackage.emy.a(r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = d(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = e(r9, r5)
            int r3 = defpackage.emy.a(r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = e(r9, r5)
            int r3 = defpackage.emy.a(r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = c(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = b((T) r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = defpackage.emy.a(r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = defpackage.epk.f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = defpackage.epk.f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = defpackage.epk.f(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = defpackage.epk.b(r9, r5)
            int r3 = defpackage.emy.a(r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = defpackage.epk.a(r9, r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = defpackage.epk.b(r9, r5)
            int r3 = defpackage.emy.a(r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = defpackage.epk.a(r9, r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = defpackage.epk.a(r9, r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = defpackage.epk.a(r9, r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = defpackage.epk.f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = defpackage.epk.f(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = defpackage.epk.f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = defpackage.epk.c(r9, r5)
            int r3 = defpackage.emy.a(r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = defpackage.epk.a(r9, r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = defpackage.epk.b(r9, r5)
            int r3 = defpackage.emy.a(r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = defpackage.epk.a(r9, r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = defpackage.epk.b(r9, r5)
            int r3 = defpackage.emy.a(r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = defpackage.epk.b(r9, r5)
            int r3 = defpackage.emy.a(r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = defpackage.epk.d(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = defpackage.epk.e(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = defpackage.emy.a(r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            epe<?, ?> r0 = r8.q
            java.lang.Object r0 = r0.b(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.h
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            emm<?> r0 = r8.r
            emp r9 = r0.a(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eob.a(java.lang.Object):int");
    }

    public final void b(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.c.length; i2 += 3) {
                int c2 = c(i2);
                long j2 = (long) (1048575 & c2);
                int i3 = this.c[i2];
                switch ((c2 & 267386880) >>> 20) {
                    case 0:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.e(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 1:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.d(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 2:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 3:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 4:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 5:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 6:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 7:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.c(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 8:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.f(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 9:
                        a(t, t2, i2);
                        break;
                    case 10:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.f(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 11:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 12:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 13:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 14:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 15:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 16:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 17:
                        a(t, t2, i2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.p.a(t, t2, j2);
                        break;
                    case 50:
                        eop.a(this.s, t, t2, j2);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!a(t2, i3, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.f(t2, j2));
                            b(t, i3, i2);
                            break;
                        }
                    case b.bo /*60*/:
                        b(t, t2, i2);
                        break;
                    case b.bp /*61*/:
                    case b.bq /*62*/:
                    case b.br /*63*/:
                    case b.bs /*64*/:
                    case b.bt /*65*/:
                    case b.bu /*66*/:
                    case b.bv /*67*/:
                        if (!a(t2, i3, i2)) {
                            break;
                        } else {
                            epk.a((Object) t, j2, epk.f(t2, j2));
                            b(t, i3, i2);
                            break;
                        }
                    case b.bw /*68*/:
                        b(t, t2, i2);
                        break;
                }
            }
            if (!this.j) {
                eop.a(this.q, t, t2);
                if (this.h) {
                    eop.a(this.r, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    private final void a(T t, T t2, int i2) {
        long c2 = (long) (c(i2) & 1048575);
        if (a(t2, i2)) {
            Object f2 = epk.f(t, c2);
            Object f3 = epk.f(t2, c2);
            if (f2 == null || f3 == null) {
                if (f3 != null) {
                    epk.a((Object) t, c2, f3);
                    b(t, i2);
                }
                return;
            }
            epk.a((Object) t, c2, emy.a(f2, f3));
            b(t, i2);
        }
    }

    private final void b(T t, T t2, int i2) {
        int c2 = c(i2);
        int i3 = this.c[i2];
        long j2 = (long) (c2 & 1048575);
        if (a(t2, i3, i2)) {
            Object f2 = epk.f(t, j2);
            Object f3 = epk.f(t2, j2);
            if (f2 == null || f3 == null) {
                if (f3 != null) {
                    epk.a((Object) t, j2, f3);
                    b(t, i3, i2);
                }
                return;
            }
            epk.a((Object) t, j2, emy.a(f2, f3));
            b(t, i3, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0292, code lost:
        r4 = r4 + ((r6 + r7) + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x06fd, code lost:
        r5 = r5 + ((r9 + r10) + r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(T r15) {
        /*
            r14 = this;
            boolean r0 = r14.j
            r1 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            if (r0 == 0) goto L_0x045d
            sun.misc.Unsafe r0 = b
            r4 = 0
        L_0x000d:
            int[] r5 = r14.c
            int r5 = r5.length
            if (r3 >= r5) goto L_0x0455
            int r5 = r14.c(r3)
            r6 = r5 & r1
            int r6 = r6 >>> 20
            int[] r7 = r14.c
            r7 = r7[r3]
            r5 = r5 & r2
            long r8 = (long) r5
            com.google.android.gms.internal.measurement.zzvr r5 = com.google.android.gms.internal.measurement.zzvr.DOUBLE_LIST_PACKED
            int r5 = r5.id
            if (r6 < r5) goto L_0x0028
            com.google.android.gms.internal.measurement.zzvr r5 = com.google.android.gms.internal.measurement.zzvr.SINT64_LIST_PACKED
        L_0x0028:
            switch(r6) {
                case 0: goto L_0x0445;
                case 1: goto L_0x0439;
                case 2: goto L_0x0429;
                case 3: goto L_0x0419;
                case 4: goto L_0x0409;
                case 5: goto L_0x03fd;
                case 6: goto L_0x03f1;
                case 7: goto L_0x03e5;
                case 8: goto L_0x03c7;
                case 9: goto L_0x03b3;
                case 10: goto L_0x03a2;
                case 11: goto L_0x0393;
                case 12: goto L_0x0384;
                case 13: goto L_0x0379;
                case 14: goto L_0x036e;
                case 15: goto L_0x035f;
                case 16: goto L_0x0350;
                case 17: goto L_0x033b;
                case 18: goto L_0x0330;
                case 19: goto L_0x0327;
                case 20: goto L_0x031e;
                case 21: goto L_0x0315;
                case 22: goto L_0x030c;
                case 23: goto L_0x0303;
                case 24: goto L_0x02fa;
                case 25: goto L_0x02f1;
                case 26: goto L_0x02e8;
                case 27: goto L_0x02db;
                case 28: goto L_0x02d2;
                case 29: goto L_0x02c9;
                case 30: goto L_0x02bf;
                case 31: goto L_0x02b5;
                case 32: goto L_0x02ab;
                case 33: goto L_0x02a1;
                case 34: goto L_0x0297;
                case 35: goto L_0x027e;
                case 36: goto L_0x0269;
                case 37: goto L_0x0254;
                case 38: goto L_0x023f;
                case 39: goto L_0x022a;
                case 40: goto L_0x0215;
                case 41: goto L_0x01ff;
                case 42: goto L_0x01e9;
                case 43: goto L_0x01d3;
                case 44: goto L_0x01bd;
                case 45: goto L_0x01a7;
                case 46: goto L_0x0191;
                case 47: goto L_0x017b;
                case 48: goto L_0x0165;
                case 49: goto L_0x0157;
                case 50: goto L_0x014b;
                case 51: goto L_0x013f;
                case 52: goto L_0x0133;
                case 53: goto L_0x0123;
                case 54: goto L_0x0113;
                case 55: goto L_0x0103;
                case 56: goto L_0x00f7;
                case 57: goto L_0x00eb;
                case 58: goto L_0x00df;
                case 59: goto L_0x00c1;
                case 60: goto L_0x00ad;
                case 61: goto L_0x009b;
                case 62: goto L_0x008b;
                case 63: goto L_0x007b;
                case 64: goto L_0x006f;
                case 65: goto L_0x0063;
                case 66: goto L_0x0053;
                case 67: goto L_0x0043;
                case 68: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0451
        L_0x002d:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            java.lang.Object r5 = defpackage.epk.f(r15, r8)
            enx r5 = (defpackage.enx) r5
            eon r6 = r14.a(r3)
            int r5 = com.google.android.gms.internal.measurement.zzve.c(r7, r5, r6)
            goto L_0x0338
        L_0x0043:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            long r5 = e(r15, r8)
            int r5 = com.google.android.gms.internal.measurement.zzve.f(r7, r5)
            goto L_0x0338
        L_0x0053:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = d(r15, r8)
            int r5 = com.google.android.gms.internal.measurement.zzve.h(r7, r5)
            goto L_0x0338
        L_0x0063:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = com.google.android.gms.internal.measurement.zzve.h(r7)
            goto L_0x0338
        L_0x006f:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = com.google.android.gms.internal.measurement.zzve.f(r7)
            goto L_0x0338
        L_0x007b:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = d(r15, r8)
            int r5 = com.google.android.gms.internal.measurement.zzve.i(r7, r5)
            goto L_0x0338
        L_0x008b:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = d(r15, r8)
            int r5 = com.google.android.gms.internal.measurement.zzve.g(r7, r5)
            goto L_0x0338
        L_0x009b:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            java.lang.Object r5 = defpackage.epk.f(r15, r8)
            com.google.android.gms.internal.measurement.zzun r5 = (com.google.android.gms.internal.measurement.zzun) r5
            int r5 = com.google.android.gms.internal.measurement.zzve.c(r7, r5)
            goto L_0x0338
        L_0x00ad:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            java.lang.Object r5 = defpackage.epk.f(r15, r8)
            eon r6 = r14.a(r3)
            int r5 = defpackage.eop.a(r7, r5, r6)
            goto L_0x0338
        L_0x00c1:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            java.lang.Object r5 = defpackage.epk.f(r15, r8)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.zzun
            if (r6 == 0) goto L_0x00d7
            com.google.android.gms.internal.measurement.zzun r5 = (com.google.android.gms.internal.measurement.zzun) r5
            int r5 = com.google.android.gms.internal.measurement.zzve.c(r7, r5)
            goto L_0x0338
        L_0x00d7:
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.google.android.gms.internal.measurement.zzve.b(r7, r5)
            goto L_0x0338
        L_0x00df:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = com.google.android.gms.internal.measurement.zzve.k(r7)
            goto L_0x0338
        L_0x00eb:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = com.google.android.gms.internal.measurement.zzve.e(r7)
            goto L_0x0338
        L_0x00f7:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = com.google.android.gms.internal.measurement.zzve.g(r7)
            goto L_0x0338
        L_0x0103:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = d(r15, r8)
            int r5 = com.google.android.gms.internal.measurement.zzve.f(r7, r5)
            goto L_0x0338
        L_0x0113:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            long r5 = e(r15, r8)
            int r5 = com.google.android.gms.internal.measurement.zzve.e(r7, r5)
            goto L_0x0338
        L_0x0123:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            long r5 = e(r15, r8)
            int r5 = com.google.android.gms.internal.measurement.zzve.d(r7, r5)
            goto L_0x0338
        L_0x0133:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = com.google.android.gms.internal.measurement.zzve.i(r7)
            goto L_0x0338
        L_0x013f:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = com.google.android.gms.internal.measurement.zzve.j(r7)
            goto L_0x0338
        L_0x014b:
            ens r5 = r14.s
            java.lang.Object r6 = defpackage.epk.f(r15, r8)
            int r5 = r5.e(r6)
            goto L_0x0338
        L_0x0157:
            java.util.List r5 = a(r15, r8)
            eon r6 = r14.a(r3)
            int r5 = defpackage.eop.b(r7, r5, r6)
            goto L_0x0338
        L_0x0165:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.eop.c(r5)
            if (r5 <= 0) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzve.l(r7)
            int r7 = com.google.android.gms.internal.measurement.zzve.n(r5)
            goto L_0x0292
        L_0x017b:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.eop.g(r5)
            if (r5 <= 0) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzve.l(r7)
            int r7 = com.google.android.gms.internal.measurement.zzve.n(r5)
            goto L_0x0292
        L_0x0191:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.eop.i(r5)
            if (r5 <= 0) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzve.l(r7)
            int r7 = com.google.android.gms.internal.measurement.zzve.n(r5)
            goto L_0x0292
        L_0x01a7:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.eop.h(r5)
            if (r5 <= 0) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzve.l(r7)
            int r7 = com.google.android.gms.internal.measurement.zzve.n(r5)
            goto L_0x0292
        L_0x01bd:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.eop.d(r5)
            if (r5 <= 0) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzve.l(r7)
            int r7 = com.google.android.gms.internal.measurement.zzve.n(r5)
            goto L_0x0292
        L_0x01d3:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.eop.f(r5)
            if (r5 <= 0) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzve.l(r7)
            int r7 = com.google.android.gms.internal.measurement.zzve.n(r5)
            goto L_0x0292
        L_0x01e9:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.eop.j(r5)
            if (r5 <= 0) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzve.l(r7)
            int r7 = com.google.android.gms.internal.measurement.zzve.n(r5)
            goto L_0x0292
        L_0x01ff:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.eop.h(r5)
            if (r5 <= 0) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzve.l(r7)
            int r7 = com.google.android.gms.internal.measurement.zzve.n(r5)
            goto L_0x0292
        L_0x0215:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.eop.i(r5)
            if (r5 <= 0) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzve.l(r7)
            int r7 = com.google.android.gms.internal.measurement.zzve.n(r5)
            goto L_0x0292
        L_0x022a:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.eop.e(r5)
            if (r5 <= 0) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzve.l(r7)
            int r7 = com.google.android.gms.internal.measurement.zzve.n(r5)
            goto L_0x0292
        L_0x023f:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.eop.b(r5)
            if (r5 <= 0) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzve.l(r7)
            int r7 = com.google.android.gms.internal.measurement.zzve.n(r5)
            goto L_0x0292
        L_0x0254:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.eop.a(r5)
            if (r5 <= 0) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzve.l(r7)
            int r7 = com.google.android.gms.internal.measurement.zzve.n(r5)
            goto L_0x0292
        L_0x0269:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.eop.h(r5)
            if (r5 <= 0) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzve.l(r7)
            int r7 = com.google.android.gms.internal.measurement.zzve.n(r5)
            goto L_0x0292
        L_0x027e:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.eop.i(r5)
            if (r5 <= 0) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzve.l(r7)
            int r7 = com.google.android.gms.internal.measurement.zzve.n(r5)
        L_0x0292:
            int r6 = r6 + r7
            int r6 = r6 + r5
            int r4 = r4 + r6
            goto L_0x0451
        L_0x0297:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.c(r7, r5)
            goto L_0x0338
        L_0x02a1:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.g(r7, r5)
            goto L_0x0338
        L_0x02ab:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.i(r7, r5)
            goto L_0x0338
        L_0x02b5:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.h(r7, r5)
            goto L_0x0338
        L_0x02bf:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.d(r7, r5)
            goto L_0x0338
        L_0x02c9:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.f(r7, r5)
            goto L_0x0338
        L_0x02d2:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.l(r7, r5)
            goto L_0x0338
        L_0x02db:
            java.util.List r5 = a(r15, r8)
            eon r6 = r14.a(r3)
            int r5 = defpackage.eop.a(r7, r5, r6)
            goto L_0x0338
        L_0x02e8:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.k(r7, r5)
            goto L_0x0338
        L_0x02f1:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.j(r7, r5)
            goto L_0x0338
        L_0x02fa:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.h(r7, r5)
            goto L_0x0338
        L_0x0303:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.i(r7, r5)
            goto L_0x0338
        L_0x030c:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.e(r7, r5)
            goto L_0x0338
        L_0x0315:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.b(r7, r5)
            goto L_0x0338
        L_0x031e:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.a(r7, r5)
            goto L_0x0338
        L_0x0327:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.h(r7, r5)
            goto L_0x0338
        L_0x0330:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.eop.i(r7, r5)
        L_0x0338:
            int r4 = r4 + r5
            goto L_0x0451
        L_0x033b:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            java.lang.Object r5 = defpackage.epk.f(r15, r8)
            enx r5 = (defpackage.enx) r5
            eon r6 = r14.a(r3)
            int r5 = com.google.android.gms.internal.measurement.zzve.c(r7, r5, r6)
            goto L_0x0338
        L_0x0350:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            long r5 = defpackage.epk.b(r15, r8)
            int r5 = com.google.android.gms.internal.measurement.zzve.f(r7, r5)
            goto L_0x0338
        L_0x035f:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = defpackage.epk.a(r15, r8)
            int r5 = com.google.android.gms.internal.measurement.zzve.h(r7, r5)
            goto L_0x0338
        L_0x036e:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = com.google.android.gms.internal.measurement.zzve.h(r7)
            goto L_0x0338
        L_0x0379:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = com.google.android.gms.internal.measurement.zzve.f(r7)
            goto L_0x0338
        L_0x0384:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = defpackage.epk.a(r15, r8)
            int r5 = com.google.android.gms.internal.measurement.zzve.i(r7, r5)
            goto L_0x0338
        L_0x0393:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = defpackage.epk.a(r15, r8)
            int r5 = com.google.android.gms.internal.measurement.zzve.g(r7, r5)
            goto L_0x0338
        L_0x03a2:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            java.lang.Object r5 = defpackage.epk.f(r15, r8)
            com.google.android.gms.internal.measurement.zzun r5 = (com.google.android.gms.internal.measurement.zzun) r5
            int r5 = com.google.android.gms.internal.measurement.zzve.c(r7, r5)
            goto L_0x0338
        L_0x03b3:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            java.lang.Object r5 = defpackage.epk.f(r15, r8)
            eon r6 = r14.a(r3)
            int r5 = defpackage.eop.a(r7, r5, r6)
            goto L_0x0338
        L_0x03c7:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            java.lang.Object r5 = defpackage.epk.f(r15, r8)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.zzun
            if (r6 == 0) goto L_0x03dd
            com.google.android.gms.internal.measurement.zzun r5 = (com.google.android.gms.internal.measurement.zzun) r5
            int r5 = com.google.android.gms.internal.measurement.zzve.c(r7, r5)
            goto L_0x0338
        L_0x03dd:
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.google.android.gms.internal.measurement.zzve.b(r7, r5)
            goto L_0x0338
        L_0x03e5:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = com.google.android.gms.internal.measurement.zzve.k(r7)
            goto L_0x0338
        L_0x03f1:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = com.google.android.gms.internal.measurement.zzve.e(r7)
            goto L_0x0338
        L_0x03fd:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = com.google.android.gms.internal.measurement.zzve.g(r7)
            goto L_0x0338
        L_0x0409:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = defpackage.epk.a(r15, r8)
            int r5 = com.google.android.gms.internal.measurement.zzve.f(r7, r5)
            goto L_0x0338
        L_0x0419:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            long r5 = defpackage.epk.b(r15, r8)
            int r5 = com.google.android.gms.internal.measurement.zzve.e(r7, r5)
            goto L_0x0338
        L_0x0429:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            long r5 = defpackage.epk.b(r15, r8)
            int r5 = com.google.android.gms.internal.measurement.zzve.d(r7, r5)
            goto L_0x0338
        L_0x0439:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = com.google.android.gms.internal.measurement.zzve.i(r7)
            goto L_0x0338
        L_0x0445:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x0451
            int r5 = com.google.android.gms.internal.measurement.zzve.j(r7)
            goto L_0x0338
        L_0x0451:
            int r3 = r3 + 3
            goto L_0x000d
        L_0x0455:
            epe<?, ?> r0 = r14.q
            int r15 = a(r0, (T) r15)
            int r4 = r4 + r15
            return r4
        L_0x045d:
            sun.misc.Unsafe r0 = b
            r4 = -1
            r4 = 0
            r5 = 0
            r6 = -1
            r7 = 0
        L_0x0464:
            int[] r8 = r14.c
            int r8 = r8.length
            if (r4 >= r8) goto L_0x08bf
            int r8 = r14.c(r4)
            int[] r9 = r14.c
            r10 = r9[r4]
            r11 = r8 & r1
            int r11 = r11 >>> 20
            r12 = 17
            if (r11 > r12) goto L_0x048e
            int r12 = r4 + 2
            r9 = r9[r12]
            r12 = r9 & r2
            int r9 = r9 >>> 20
            r13 = 1
            int r9 = r13 << r9
            if (r12 == r6) goto L_0x048f
            long r6 = (long) r12
            int r6 = r0.getInt(r15, r6)
            r7 = r6
            r6 = r12
            goto L_0x048f
        L_0x048e:
            r9 = 0
        L_0x048f:
            r8 = r8 & r2
            long r12 = (long) r8
            switch(r11) {
                case 0: goto L_0x08b1;
                case 1: goto L_0x08a7;
                case 2: goto L_0x0899;
                case 3: goto L_0x088b;
                case 4: goto L_0x087d;
                case 5: goto L_0x0873;
                case 6: goto L_0x0869;
                case 7: goto L_0x085f;
                case 8: goto L_0x0843;
                case 9: goto L_0x0832;
                case 10: goto L_0x0823;
                case 11: goto L_0x0816;
                case 12: goto L_0x0809;
                case 13: goto L_0x0800;
                case 14: goto L_0x07f7;
                case 15: goto L_0x07ea;
                case 16: goto L_0x07dd;
                case 17: goto L_0x07ca;
                case 18: goto L_0x07bd;
                case 19: goto L_0x07b2;
                case 20: goto L_0x07a7;
                case 21: goto L_0x079c;
                case 22: goto L_0x0791;
                case 23: goto L_0x0786;
                case 24: goto L_0x077b;
                case 25: goto L_0x0770;
                case 26: goto L_0x0765;
                case 27: goto L_0x0756;
                case 28: goto L_0x074a;
                case 29: goto L_0x073e;
                case 30: goto L_0x0732;
                case 31: goto L_0x0726;
                case 32: goto L_0x071a;
                case 33: goto L_0x070e;
                case 34: goto L_0x0702;
                case 35: goto L_0x06e9;
                case 36: goto L_0x06d4;
                case 37: goto L_0x06bf;
                case 38: goto L_0x06aa;
                case 39: goto L_0x0695;
                case 40: goto L_0x0680;
                case 41: goto L_0x066a;
                case 42: goto L_0x0654;
                case 43: goto L_0x063e;
                case 44: goto L_0x0628;
                case 45: goto L_0x0612;
                case 46: goto L_0x05fc;
                case 47: goto L_0x05e6;
                case 48: goto L_0x05d0;
                case 49: goto L_0x05c0;
                case 50: goto L_0x05b4;
                case 51: goto L_0x05a8;
                case 52: goto L_0x059c;
                case 53: goto L_0x058c;
                case 54: goto L_0x057c;
                case 55: goto L_0x056c;
                case 56: goto L_0x0560;
                case 57: goto L_0x0554;
                case 58: goto L_0x0548;
                case 59: goto L_0x052a;
                case 60: goto L_0x0516;
                case 61: goto L_0x0504;
                case 62: goto L_0x04f4;
                case 63: goto L_0x04e4;
                case 64: goto L_0x04d8;
                case 65: goto L_0x04cc;
                case 66: goto L_0x04bc;
                case 67: goto L_0x04ac;
                case 68: goto L_0x0496;
                default: goto L_0x0494;
            }
        L_0x0494:
            goto L_0x08bb
        L_0x0496:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            java.lang.Object r8 = r0.getObject(r15, r12)
            enx r8 = (defpackage.enx) r8
            eon r9 = r14.a(r4)
            int r8 = com.google.android.gms.internal.measurement.zzve.c(r10, r8, r9)
            goto L_0x07c7
        L_0x04ac:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            long r8 = e(r15, r12)
            int r8 = com.google.android.gms.internal.measurement.zzve.f(r10, r8)
            goto L_0x07c7
        L_0x04bc:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            int r8 = d(r15, r12)
            int r8 = com.google.android.gms.internal.measurement.zzve.h(r10, r8)
            goto L_0x07c7
        L_0x04cc:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            int r8 = com.google.android.gms.internal.measurement.zzve.h(r10)
            goto L_0x07c7
        L_0x04d8:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            int r8 = com.google.android.gms.internal.measurement.zzve.f(r10)
            goto L_0x07c7
        L_0x04e4:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            int r8 = d(r15, r12)
            int r8 = com.google.android.gms.internal.measurement.zzve.i(r10, r8)
            goto L_0x07c7
        L_0x04f4:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            int r8 = d(r15, r12)
            int r8 = com.google.android.gms.internal.measurement.zzve.g(r10, r8)
            goto L_0x07c7
        L_0x0504:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            java.lang.Object r8 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzun r8 = (com.google.android.gms.internal.measurement.zzun) r8
            int r8 = com.google.android.gms.internal.measurement.zzve.c(r10, r8)
            goto L_0x07c7
        L_0x0516:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            java.lang.Object r8 = r0.getObject(r15, r12)
            eon r9 = r14.a(r4)
            int r8 = defpackage.eop.a(r10, r8, r9)
            goto L_0x07c7
        L_0x052a:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            java.lang.Object r8 = r0.getObject(r15, r12)
            boolean r9 = r8 instanceof com.google.android.gms.internal.measurement.zzun
            if (r9 == 0) goto L_0x0540
            com.google.android.gms.internal.measurement.zzun r8 = (com.google.android.gms.internal.measurement.zzun) r8
            int r8 = com.google.android.gms.internal.measurement.zzve.c(r10, r8)
            goto L_0x07c7
        L_0x0540:
            java.lang.String r8 = (java.lang.String) r8
            int r8 = com.google.android.gms.internal.measurement.zzve.b(r10, r8)
            goto L_0x07c7
        L_0x0548:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            int r8 = com.google.android.gms.internal.measurement.zzve.k(r10)
            goto L_0x07c7
        L_0x0554:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            int r8 = com.google.android.gms.internal.measurement.zzve.e(r10)
            goto L_0x07c7
        L_0x0560:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            int r8 = com.google.android.gms.internal.measurement.zzve.g(r10)
            goto L_0x07c7
        L_0x056c:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            int r8 = d(r15, r12)
            int r8 = com.google.android.gms.internal.measurement.zzve.f(r10, r8)
            goto L_0x07c7
        L_0x057c:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            long r8 = e(r15, r12)
            int r8 = com.google.android.gms.internal.measurement.zzve.e(r10, r8)
            goto L_0x07c7
        L_0x058c:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            long r8 = e(r15, r12)
            int r8 = com.google.android.gms.internal.measurement.zzve.d(r10, r8)
            goto L_0x07c7
        L_0x059c:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            int r8 = com.google.android.gms.internal.measurement.zzve.i(r10)
            goto L_0x07c7
        L_0x05a8:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x08bb
            int r8 = com.google.android.gms.internal.measurement.zzve.j(r10)
            goto L_0x07c7
        L_0x05b4:
            ens r8 = r14.s
            java.lang.Object r9 = r0.getObject(r15, r12)
            int r8 = r8.e(r9)
            goto L_0x07c7
        L_0x05c0:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            eon r9 = r14.a(r4)
            int r8 = defpackage.eop.b(r10, r8, r9)
            goto L_0x07c7
        L_0x05d0:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.c(r8)
            if (r8 <= 0) goto L_0x08bb
            int r9 = com.google.android.gms.internal.measurement.zzve.l(r10)
            int r10 = com.google.android.gms.internal.measurement.zzve.n(r8)
            goto L_0x06fd
        L_0x05e6:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.g(r8)
            if (r8 <= 0) goto L_0x08bb
            int r9 = com.google.android.gms.internal.measurement.zzve.l(r10)
            int r10 = com.google.android.gms.internal.measurement.zzve.n(r8)
            goto L_0x06fd
        L_0x05fc:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.i(r8)
            if (r8 <= 0) goto L_0x08bb
            int r9 = com.google.android.gms.internal.measurement.zzve.l(r10)
            int r10 = com.google.android.gms.internal.measurement.zzve.n(r8)
            goto L_0x06fd
        L_0x0612:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.h(r8)
            if (r8 <= 0) goto L_0x08bb
            int r9 = com.google.android.gms.internal.measurement.zzve.l(r10)
            int r10 = com.google.android.gms.internal.measurement.zzve.n(r8)
            goto L_0x06fd
        L_0x0628:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.d(r8)
            if (r8 <= 0) goto L_0x08bb
            int r9 = com.google.android.gms.internal.measurement.zzve.l(r10)
            int r10 = com.google.android.gms.internal.measurement.zzve.n(r8)
            goto L_0x06fd
        L_0x063e:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.f(r8)
            if (r8 <= 0) goto L_0x08bb
            int r9 = com.google.android.gms.internal.measurement.zzve.l(r10)
            int r10 = com.google.android.gms.internal.measurement.zzve.n(r8)
            goto L_0x06fd
        L_0x0654:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.j(r8)
            if (r8 <= 0) goto L_0x08bb
            int r9 = com.google.android.gms.internal.measurement.zzve.l(r10)
            int r10 = com.google.android.gms.internal.measurement.zzve.n(r8)
            goto L_0x06fd
        L_0x066a:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.h(r8)
            if (r8 <= 0) goto L_0x08bb
            int r9 = com.google.android.gms.internal.measurement.zzve.l(r10)
            int r10 = com.google.android.gms.internal.measurement.zzve.n(r8)
            goto L_0x06fd
        L_0x0680:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.i(r8)
            if (r8 <= 0) goto L_0x08bb
            int r9 = com.google.android.gms.internal.measurement.zzve.l(r10)
            int r10 = com.google.android.gms.internal.measurement.zzve.n(r8)
            goto L_0x06fd
        L_0x0695:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.e(r8)
            if (r8 <= 0) goto L_0x08bb
            int r9 = com.google.android.gms.internal.measurement.zzve.l(r10)
            int r10 = com.google.android.gms.internal.measurement.zzve.n(r8)
            goto L_0x06fd
        L_0x06aa:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.b(r8)
            if (r8 <= 0) goto L_0x08bb
            int r9 = com.google.android.gms.internal.measurement.zzve.l(r10)
            int r10 = com.google.android.gms.internal.measurement.zzve.n(r8)
            goto L_0x06fd
        L_0x06bf:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.a(r8)
            if (r8 <= 0) goto L_0x08bb
            int r9 = com.google.android.gms.internal.measurement.zzve.l(r10)
            int r10 = com.google.android.gms.internal.measurement.zzve.n(r8)
            goto L_0x06fd
        L_0x06d4:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.h(r8)
            if (r8 <= 0) goto L_0x08bb
            int r9 = com.google.android.gms.internal.measurement.zzve.l(r10)
            int r10 = com.google.android.gms.internal.measurement.zzve.n(r8)
            goto L_0x06fd
        L_0x06e9:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.i(r8)
            if (r8 <= 0) goto L_0x08bb
            int r9 = com.google.android.gms.internal.measurement.zzve.l(r10)
            int r10 = com.google.android.gms.internal.measurement.zzve.n(r8)
        L_0x06fd:
            int r9 = r9 + r10
            int r9 = r9 + r8
            int r5 = r5 + r9
            goto L_0x08bb
        L_0x0702:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.c(r10, r8)
            goto L_0x07c7
        L_0x070e:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.g(r10, r8)
            goto L_0x07c7
        L_0x071a:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.i(r10, r8)
            goto L_0x07c7
        L_0x0726:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.h(r10, r8)
            goto L_0x07c7
        L_0x0732:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.d(r10, r8)
            goto L_0x07c7
        L_0x073e:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.f(r10, r8)
            goto L_0x07c7
        L_0x074a:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.l(r10, r8)
            goto L_0x07c7
        L_0x0756:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            eon r9 = r14.a(r4)
            int r8 = defpackage.eop.a(r10, r8, r9)
            goto L_0x07c7
        L_0x0765:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.k(r10, r8)
            goto L_0x07c7
        L_0x0770:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.j(r10, r8)
            goto L_0x07c7
        L_0x077b:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.h(r10, r8)
            goto L_0x07c7
        L_0x0786:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.i(r10, r8)
            goto L_0x07c7
        L_0x0791:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.e(r10, r8)
            goto L_0x07c7
        L_0x079c:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.b(r10, r8)
            goto L_0x07c7
        L_0x07a7:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.a(r10, r8)
            goto L_0x07c7
        L_0x07b2:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.h(r10, r8)
            goto L_0x07c7
        L_0x07bd:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.eop.i(r10, r8)
        L_0x07c7:
            int r5 = r5 + r8
            goto L_0x08bb
        L_0x07ca:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            java.lang.Object r8 = r0.getObject(r15, r12)
            enx r8 = (defpackage.enx) r8
            eon r9 = r14.a(r4)
            int r8 = com.google.android.gms.internal.measurement.zzve.c(r10, r8, r9)
            goto L_0x07c7
        L_0x07dd:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            long r8 = r0.getLong(r15, r12)
            int r8 = com.google.android.gms.internal.measurement.zzve.f(r10, r8)
            goto L_0x07c7
        L_0x07ea:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            int r8 = r0.getInt(r15, r12)
            int r8 = com.google.android.gms.internal.measurement.zzve.h(r10, r8)
            goto L_0x07c7
        L_0x07f7:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            int r8 = com.google.android.gms.internal.measurement.zzve.h(r10)
            goto L_0x07c7
        L_0x0800:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            int r8 = com.google.android.gms.internal.measurement.zzve.f(r10)
            goto L_0x07c7
        L_0x0809:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            int r8 = r0.getInt(r15, r12)
            int r8 = com.google.android.gms.internal.measurement.zzve.i(r10, r8)
            goto L_0x07c7
        L_0x0816:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            int r8 = r0.getInt(r15, r12)
            int r8 = com.google.android.gms.internal.measurement.zzve.g(r10, r8)
            goto L_0x07c7
        L_0x0823:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            java.lang.Object r8 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzun r8 = (com.google.android.gms.internal.measurement.zzun) r8
            int r8 = com.google.android.gms.internal.measurement.zzve.c(r10, r8)
            goto L_0x07c7
        L_0x0832:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            java.lang.Object r8 = r0.getObject(r15, r12)
            eon r9 = r14.a(r4)
            int r8 = defpackage.eop.a(r10, r8, r9)
            goto L_0x07c7
        L_0x0843:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            java.lang.Object r8 = r0.getObject(r15, r12)
            boolean r9 = r8 instanceof com.google.android.gms.internal.measurement.zzun
            if (r9 == 0) goto L_0x0857
            com.google.android.gms.internal.measurement.zzun r8 = (com.google.android.gms.internal.measurement.zzun) r8
            int r8 = com.google.android.gms.internal.measurement.zzve.c(r10, r8)
            goto L_0x07c7
        L_0x0857:
            java.lang.String r8 = (java.lang.String) r8
            int r8 = com.google.android.gms.internal.measurement.zzve.b(r10, r8)
            goto L_0x07c7
        L_0x085f:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            int r8 = com.google.android.gms.internal.measurement.zzve.k(r10)
            goto L_0x07c7
        L_0x0869:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            int r8 = com.google.android.gms.internal.measurement.zzve.e(r10)
            goto L_0x07c7
        L_0x0873:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            int r8 = com.google.android.gms.internal.measurement.zzve.g(r10)
            goto L_0x07c7
        L_0x087d:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            int r8 = r0.getInt(r15, r12)
            int r8 = com.google.android.gms.internal.measurement.zzve.f(r10, r8)
            goto L_0x07c7
        L_0x088b:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            long r8 = r0.getLong(r15, r12)
            int r8 = com.google.android.gms.internal.measurement.zzve.e(r10, r8)
            goto L_0x07c7
        L_0x0899:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            long r8 = r0.getLong(r15, r12)
            int r8 = com.google.android.gms.internal.measurement.zzve.d(r10, r8)
            goto L_0x07c7
        L_0x08a7:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            int r8 = com.google.android.gms.internal.measurement.zzve.i(r10)
            goto L_0x07c7
        L_0x08b1:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x08bb
            int r8 = com.google.android.gms.internal.measurement.zzve.j(r10)
            goto L_0x07c7
        L_0x08bb:
            int r4 = r4 + 3
            goto L_0x0464
        L_0x08bf:
            epe<?, ?> r0 = r14.q
            int r0 = a(r0, (T) r15)
            int r5 = r5 + r0
            boolean r0 = r14.h
            if (r0 == 0) goto L_0x0918
            emm<?> r0 = r14.r
            emp r15 = r0.a(r15)
            r0 = 0
        L_0x08d1:
            eoq<FieldDescriptorType, java.lang.Object> r1 = r15.a
            int r1 = r1.b()
            if (r3 >= r1) goto L_0x08f1
            eoq<FieldDescriptorType, java.lang.Object> r1 = r15.a
            java.util.Map$Entry r1 = r1.b(r3)
            java.lang.Object r2 = r1.getKey()
            emr r2 = (defpackage.emr) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = defpackage.emp.a(r2, r1)
            int r0 = r0 + r1
            int r3 = r3 + 1
            goto L_0x08d1
        L_0x08f1:
            eoq<FieldDescriptorType, java.lang.Object> r15 = r15.a
            java.lang.Iterable r15 = r15.c()
            java.util.Iterator r15 = r15.iterator()
        L_0x08fb:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0917
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            emr r2 = (defpackage.emr) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = defpackage.emp.a(r2, r1)
            int r0 = r0 + r1
            goto L_0x08fb
        L_0x0917:
            int r5 = r5 + r0
        L_0x0918:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eob.b(java.lang.Object):int");
    }

    private static <UT, UB> int a(epe<UT, UB> epe, T t) {
        return epe.f(epe.b(t));
    }

    private static <E> List<E> a(Object obj, long j2) {
        return (List) epk.f(obj, j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0a46  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r14, defpackage.epr r15) {
        /*
            r13 = this;
            int r0 = r15.a()
            int r1 = defpackage.emw.e.k
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0544
            epe<?, ?> r0 = r13.q
            a(r0, (T) r14, r15)
            boolean r0 = r13.h
            if (r0 == 0) goto L_0x004d
            emm<?> r0 = r13.r
            emp r0 = r0.a(r14)
            eoq<FieldDescriptorType, java.lang.Object> r1 = r0.a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x004d
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x003c
            enf r1 = new enf
            eoq<FieldDescriptorType, java.lang.Object> r0 = r0.a
            java.util.Set r0 = r0.d()
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            r0 = r1
            goto L_0x0046
        L_0x003c:
            eoq<FieldDescriptorType, java.lang.Object> r0 = r0.a
            java.util.Set r0 = r0.d()
            java.util.Iterator r0 = r0.iterator()
        L_0x0046:
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x004f
        L_0x004d:
            r0 = r3
            r1 = r0
        L_0x004f:
            int[] r7 = r13.c
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0054:
            if (r7 < 0) goto L_0x052c
            int r8 = r13.c(r7)
            int[] r9 = r13.c
            r9 = r9[r7]
        L_0x005e:
            if (r1 == 0) goto L_0x007c
            emm<?> r10 = r13.r
            int r10 = r10.a(r1)
            if (r10 <= r9) goto L_0x007c
            emm<?> r10 = r13.r
            r10.b(r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x005e
        L_0x007a:
            r1 = r3
            goto L_0x005e
        L_0x007c:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x0519;
                case 1: goto L_0x0509;
                case 2: goto L_0x04f9;
                case 3: goto L_0x04e9;
                case 4: goto L_0x04d9;
                case 5: goto L_0x04c9;
                case 6: goto L_0x04b9;
                case 7: goto L_0x04a8;
                case 8: goto L_0x0497;
                case 9: goto L_0x0482;
                case 10: goto L_0x046f;
                case 11: goto L_0x045e;
                case 12: goto L_0x044d;
                case 13: goto L_0x043c;
                case 14: goto L_0x042b;
                case 15: goto L_0x041a;
                case 16: goto L_0x0409;
                case 17: goto L_0x03f4;
                case 18: goto L_0x03e3;
                case 19: goto L_0x03d2;
                case 20: goto L_0x03c1;
                case 21: goto L_0x03b0;
                case 22: goto L_0x039f;
                case 23: goto L_0x038e;
                case 24: goto L_0x037d;
                case 25: goto L_0x036c;
                case 26: goto L_0x035b;
                case 27: goto L_0x0346;
                case 28: goto L_0x0335;
                case 29: goto L_0x0324;
                case 30: goto L_0x0313;
                case 31: goto L_0x0302;
                case 32: goto L_0x02f1;
                case 33: goto L_0x02e0;
                case 34: goto L_0x02cf;
                case 35: goto L_0x02be;
                case 36: goto L_0x02ad;
                case 37: goto L_0x029c;
                case 38: goto L_0x028b;
                case 39: goto L_0x027a;
                case 40: goto L_0x0269;
                case 41: goto L_0x0258;
                case 42: goto L_0x0247;
                case 43: goto L_0x0236;
                case 44: goto L_0x0225;
                case 45: goto L_0x0214;
                case 46: goto L_0x0203;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01e1;
                case 49: goto L_0x01cc;
                case 50: goto L_0x01c1;
                case 51: goto L_0x01b0;
                case 52: goto L_0x019f;
                case 53: goto L_0x018e;
                case 54: goto L_0x017d;
                case 55: goto L_0x016c;
                case 56: goto L_0x015b;
                case 57: goto L_0x014a;
                case 58: goto L_0x0139;
                case 59: goto L_0x0128;
                case 60: goto L_0x0113;
                case 61: goto L_0x0100;
                case 62: goto L_0x00ef;
                case 63: goto L_0x00de;
                case 64: goto L_0x00cd;
                case 65: goto L_0x00bc;
                case 66: goto L_0x00ab;
                case 67: goto L_0x009a;
                case 68: goto L_0x0085;
                default: goto L_0x0083;
            }
        L_0x0083:
            goto L_0x0528
        L_0x0085:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            eon r10 = r13.a(r7)
            r15.b(r9, r8, r10)
            goto L_0x0528
        L_0x009a:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = e(r14, r10)
            r15.e(r9, r10)
            goto L_0x0528
        L_0x00ab:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = d(r14, r10)
            r15.f(r9, r8)
            goto L_0x0528
        L_0x00bc:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = e(r14, r10)
            r15.b(r9, r10)
            goto L_0x0528
        L_0x00cd:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = d(r14, r10)
            r15.a(r9, r8)
            goto L_0x0528
        L_0x00de:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = d(r14, r10)
            r15.b(r9, r8)
            goto L_0x0528
        L_0x00ef:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = d(r14, r10)
            r15.e(r9, r8)
            goto L_0x0528
        L_0x0100:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            com.google.android.gms.internal.measurement.zzun r8 = (com.google.android.gms.internal.measurement.zzun) r8
            r15.a(r9, r8)
            goto L_0x0528
        L_0x0113:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            eon r10 = r13.a(r7)
            r15.a(r9, r8, r10)
            goto L_0x0528
        L_0x0128:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            a(r9, r8, r15)
            goto L_0x0528
        L_0x0139:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = f(r14, r10)
            r15.a(r9, r8)
            goto L_0x0528
        L_0x014a:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = d(r14, r10)
            r15.d(r9, r8)
            goto L_0x0528
        L_0x015b:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = e(r14, r10)
            r15.d(r9, r10)
            goto L_0x0528
        L_0x016c:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = d(r14, r10)
            r15.c(r9, r8)
            goto L_0x0528
        L_0x017d:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = e(r14, r10)
            r15.c(r9, r10)
            goto L_0x0528
        L_0x018e:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = e(r14, r10)
            r15.a(r9, r10)
            goto L_0x0528
        L_0x019f:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = c(r14, r10)
            r15.a(r9, r8)
            goto L_0x0528
        L_0x01b0:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = b((T) r14, r10)
            r15.a(r9, r10)
            goto L_0x0528
        L_0x01c1:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            r13.a(r15, r9, r8, r7)
            goto L_0x0528
        L_0x01cc:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            eon r10 = r13.a(r7)
            defpackage.eop.b(r9, r8, r15, r10)
            goto L_0x0528
        L_0x01e1:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.e(r9, r8, r15, r4)
            goto L_0x0528
        L_0x01f2:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.j(r9, r8, r15, r4)
            goto L_0x0528
        L_0x0203:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.g(r9, r8, r15, r4)
            goto L_0x0528
        L_0x0214:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.l(r9, r8, r15, r4)
            goto L_0x0528
        L_0x0225:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.m(r9, r8, r15, r4)
            goto L_0x0528
        L_0x0236:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.i(r9, r8, r15, r4)
            goto L_0x0528
        L_0x0247:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.n(r9, r8, r15, r4)
            goto L_0x0528
        L_0x0258:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.k(r9, r8, r15, r4)
            goto L_0x0528
        L_0x0269:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.f(r9, r8, r15, r4)
            goto L_0x0528
        L_0x027a:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.h(r9, r8, r15, r4)
            goto L_0x0528
        L_0x028b:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.d(r9, r8, r15, r4)
            goto L_0x0528
        L_0x029c:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.c(r9, r8, r15, r4)
            goto L_0x0528
        L_0x02ad:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.b(r9, r8, r15, r4)
            goto L_0x0528
        L_0x02be:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.a(r9, r8, r15, r4)
            goto L_0x0528
        L_0x02cf:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.e(r9, r8, r15, r5)
            goto L_0x0528
        L_0x02e0:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.j(r9, r8, r15, r5)
            goto L_0x0528
        L_0x02f1:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.g(r9, r8, r15, r5)
            goto L_0x0528
        L_0x0302:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.l(r9, r8, r15, r5)
            goto L_0x0528
        L_0x0313:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.m(r9, r8, r15, r5)
            goto L_0x0528
        L_0x0324:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.i(r9, r8, r15, r5)
            goto L_0x0528
        L_0x0335:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.b(r9, r8, r15)
            goto L_0x0528
        L_0x0346:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            eon r10 = r13.a(r7)
            defpackage.eop.a(r9, r8, r15, r10)
            goto L_0x0528
        L_0x035b:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.a(r9, r8, r15)
            goto L_0x0528
        L_0x036c:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.n(r9, r8, r15, r5)
            goto L_0x0528
        L_0x037d:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.k(r9, r8, r15, r5)
            goto L_0x0528
        L_0x038e:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.f(r9, r8, r15, r5)
            goto L_0x0528
        L_0x039f:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.h(r9, r8, r15, r5)
            goto L_0x0528
        L_0x03b0:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.d(r9, r8, r15, r5)
            goto L_0x0528
        L_0x03c1:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.c(r9, r8, r15, r5)
            goto L_0x0528
        L_0x03d2:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.b(r9, r8, r15, r5)
            goto L_0x0528
        L_0x03e3:
            int[] r9 = r13.c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.eop.a(r9, r8, r15, r5)
            goto L_0x0528
        L_0x03f4:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            eon r10 = r13.a(r7)
            r15.b(r9, r8, r10)
            goto L_0x0528
        L_0x0409:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = defpackage.epk.b(r14, r10)
            r15.e(r9, r10)
            goto L_0x0528
        L_0x041a:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = defpackage.epk.a(r14, r10)
            r15.f(r9, r8)
            goto L_0x0528
        L_0x042b:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = defpackage.epk.b(r14, r10)
            r15.b(r9, r10)
            goto L_0x0528
        L_0x043c:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = defpackage.epk.a(r14, r10)
            r15.a(r9, r8)
            goto L_0x0528
        L_0x044d:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = defpackage.epk.a(r14, r10)
            r15.b(r9, r8)
            goto L_0x0528
        L_0x045e:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = defpackage.epk.a(r14, r10)
            r15.e(r9, r8)
            goto L_0x0528
        L_0x046f:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            com.google.android.gms.internal.measurement.zzun r8 = (com.google.android.gms.internal.measurement.zzun) r8
            r15.a(r9, r8)
            goto L_0x0528
        L_0x0482:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            eon r10 = r13.a(r7)
            r15.a(r9, r8, r10)
            goto L_0x0528
        L_0x0497:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.epk.f(r14, r10)
            a(r9, r8, r15)
            goto L_0x0528
        L_0x04a8:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = defpackage.epk.c(r14, r10)
            r15.a(r9, r8)
            goto L_0x0528
        L_0x04b9:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = defpackage.epk.a(r14, r10)
            r15.d(r9, r8)
            goto L_0x0528
        L_0x04c9:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = defpackage.epk.b(r14, r10)
            r15.d(r9, r10)
            goto L_0x0528
        L_0x04d9:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = defpackage.epk.a(r14, r10)
            r15.c(r9, r8)
            goto L_0x0528
        L_0x04e9:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = defpackage.epk.b(r14, r10)
            r15.c(r9, r10)
            goto L_0x0528
        L_0x04f9:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = defpackage.epk.b(r14, r10)
            r15.a(r9, r10)
            goto L_0x0528
        L_0x0509:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = defpackage.epk.d(r14, r10)
            r15.a(r9, r8)
            goto L_0x0528
        L_0x0519:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x0528
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = defpackage.epk.e(r14, r10)
            r15.a(r9, r10)
        L_0x0528:
            int r7 = r7 + -3
            goto L_0x0054
        L_0x052c:
            if (r1 == 0) goto L_0x0543
            emm<?> r14 = r13.r
            r14.b(r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0541
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x052c
        L_0x0541:
            r1 = r3
            goto L_0x052c
        L_0x0543:
            return
        L_0x0544:
            boolean r0 = r13.j
            if (r0 == 0) goto L_0x0a61
            boolean r0 = r13.h
            if (r0 == 0) goto L_0x0565
            emm<?> r0 = r13.r
            emp r0 = r0.a(r14)
            eoq<FieldDescriptorType, java.lang.Object> r1 = r0.a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0565
            java.util.Iterator r0 = r0.c()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0567
        L_0x0565:
            r0 = r3
            r1 = r0
        L_0x0567:
            int[] r7 = r13.c
            int r7 = r7.length
            r8 = r1
            r1 = 0
        L_0x056c:
            if (r1 >= r7) goto L_0x0a44
            int r9 = r13.c(r1)
            int[] r10 = r13.c
            r10 = r10[r1]
        L_0x0576:
            if (r8 == 0) goto L_0x0594
            emm<?> r11 = r13.r
            int r11 = r11.a(r8)
            if (r11 > r10) goto L_0x0594
            emm<?> r11 = r13.r
            r11.b(r8)
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0592
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x0576
        L_0x0592:
            r8 = r3
            goto L_0x0576
        L_0x0594:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a31;
                case 1: goto L_0x0a21;
                case 2: goto L_0x0a11;
                case 3: goto L_0x0a01;
                case 4: goto L_0x09f1;
                case 5: goto L_0x09e1;
                case 6: goto L_0x09d1;
                case 7: goto L_0x09c0;
                case 8: goto L_0x09af;
                case 9: goto L_0x099a;
                case 10: goto L_0x0987;
                case 11: goto L_0x0976;
                case 12: goto L_0x0965;
                case 13: goto L_0x0954;
                case 14: goto L_0x0943;
                case 15: goto L_0x0932;
                case 16: goto L_0x0921;
                case 17: goto L_0x090c;
                case 18: goto L_0x08fb;
                case 19: goto L_0x08ea;
                case 20: goto L_0x08d9;
                case 21: goto L_0x08c8;
                case 22: goto L_0x08b7;
                case 23: goto L_0x08a6;
                case 24: goto L_0x0895;
                case 25: goto L_0x0884;
                case 26: goto L_0x0873;
                case 27: goto L_0x085e;
                case 28: goto L_0x084d;
                case 29: goto L_0x083c;
                case 30: goto L_0x082b;
                case 31: goto L_0x081a;
                case 32: goto L_0x0809;
                case 33: goto L_0x07f8;
                case 34: goto L_0x07e7;
                case 35: goto L_0x07d6;
                case 36: goto L_0x07c5;
                case 37: goto L_0x07b4;
                case 38: goto L_0x07a3;
                case 39: goto L_0x0792;
                case 40: goto L_0x0781;
                case 41: goto L_0x0770;
                case 42: goto L_0x075f;
                case 43: goto L_0x074e;
                case 44: goto L_0x073d;
                case 45: goto L_0x072c;
                case 46: goto L_0x071b;
                case 47: goto L_0x070a;
                case 48: goto L_0x06f9;
                case 49: goto L_0x06e4;
                case 50: goto L_0x06d9;
                case 51: goto L_0x06c8;
                case 52: goto L_0x06b7;
                case 53: goto L_0x06a6;
                case 54: goto L_0x0695;
                case 55: goto L_0x0684;
                case 56: goto L_0x0673;
                case 57: goto L_0x0662;
                case 58: goto L_0x0651;
                case 59: goto L_0x0640;
                case 60: goto L_0x062b;
                case 61: goto L_0x0618;
                case 62: goto L_0x0607;
                case 63: goto L_0x05f6;
                case 64: goto L_0x05e5;
                case 65: goto L_0x05d4;
                case 66: goto L_0x05c3;
                case 67: goto L_0x05b2;
                case 68: goto L_0x059d;
                default: goto L_0x059b;
            }
        L_0x059b:
            goto L_0x0a40
        L_0x059d:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            eon r11 = r13.a(r1)
            r15.b(r10, r9, r11)
            goto L_0x0a40
        L_0x05b2:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = e(r14, r11)
            r15.e(r10, r11)
            goto L_0x0a40
        L_0x05c3:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = d(r14, r11)
            r15.f(r10, r9)
            goto L_0x0a40
        L_0x05d4:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = e(r14, r11)
            r15.b(r10, r11)
            goto L_0x0a40
        L_0x05e5:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = d(r14, r11)
            r15.a(r10, r9)
            goto L_0x0a40
        L_0x05f6:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = d(r14, r11)
            r15.b(r10, r9)
            goto L_0x0a40
        L_0x0607:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = d(r14, r11)
            r15.e(r10, r9)
            goto L_0x0a40
        L_0x0618:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            com.google.android.gms.internal.measurement.zzun r9 = (com.google.android.gms.internal.measurement.zzun) r9
            r15.a(r10, r9)
            goto L_0x0a40
        L_0x062b:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            eon r11 = r13.a(r1)
            r15.a(r10, r9, r11)
            goto L_0x0a40
        L_0x0640:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            a(r10, r9, r15)
            goto L_0x0a40
        L_0x0651:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = f(r14, r11)
            r15.a(r10, r9)
            goto L_0x0a40
        L_0x0662:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = d(r14, r11)
            r15.d(r10, r9)
            goto L_0x0a40
        L_0x0673:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = e(r14, r11)
            r15.d(r10, r11)
            goto L_0x0a40
        L_0x0684:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = d(r14, r11)
            r15.c(r10, r9)
            goto L_0x0a40
        L_0x0695:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = e(r14, r11)
            r15.c(r10, r11)
            goto L_0x0a40
        L_0x06a6:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = e(r14, r11)
            r15.a(r10, r11)
            goto L_0x0a40
        L_0x06b7:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = c(r14, r11)
            r15.a(r10, r9)
            goto L_0x0a40
        L_0x06c8:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = b((T) r14, r11)
            r15.a(r10, r11)
            goto L_0x0a40
        L_0x06d9:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            r13.a(r15, r10, r9, r1)
            goto L_0x0a40
        L_0x06e4:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            eon r11 = r13.a(r1)
            defpackage.eop.b(r10, r9, r15, r11)
            goto L_0x0a40
        L_0x06f9:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.e(r10, r9, r15, r4)
            goto L_0x0a40
        L_0x070a:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.j(r10, r9, r15, r4)
            goto L_0x0a40
        L_0x071b:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.g(r10, r9, r15, r4)
            goto L_0x0a40
        L_0x072c:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.l(r10, r9, r15, r4)
            goto L_0x0a40
        L_0x073d:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.m(r10, r9, r15, r4)
            goto L_0x0a40
        L_0x074e:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.i(r10, r9, r15, r4)
            goto L_0x0a40
        L_0x075f:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.n(r10, r9, r15, r4)
            goto L_0x0a40
        L_0x0770:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.k(r10, r9, r15, r4)
            goto L_0x0a40
        L_0x0781:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.f(r10, r9, r15, r4)
            goto L_0x0a40
        L_0x0792:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.h(r10, r9, r15, r4)
            goto L_0x0a40
        L_0x07a3:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.d(r10, r9, r15, r4)
            goto L_0x0a40
        L_0x07b4:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.c(r10, r9, r15, r4)
            goto L_0x0a40
        L_0x07c5:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.b(r10, r9, r15, r4)
            goto L_0x0a40
        L_0x07d6:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.a(r10, r9, r15, r4)
            goto L_0x0a40
        L_0x07e7:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.e(r10, r9, r15, r5)
            goto L_0x0a40
        L_0x07f8:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.j(r10, r9, r15, r5)
            goto L_0x0a40
        L_0x0809:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.g(r10, r9, r15, r5)
            goto L_0x0a40
        L_0x081a:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.l(r10, r9, r15, r5)
            goto L_0x0a40
        L_0x082b:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.m(r10, r9, r15, r5)
            goto L_0x0a40
        L_0x083c:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.i(r10, r9, r15, r5)
            goto L_0x0a40
        L_0x084d:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.b(r10, r9, r15)
            goto L_0x0a40
        L_0x085e:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            eon r11 = r13.a(r1)
            defpackage.eop.a(r10, r9, r15, r11)
            goto L_0x0a40
        L_0x0873:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.a(r10, r9, r15)
            goto L_0x0a40
        L_0x0884:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.n(r10, r9, r15, r5)
            goto L_0x0a40
        L_0x0895:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.k(r10, r9, r15, r5)
            goto L_0x0a40
        L_0x08a6:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.f(r10, r9, r15, r5)
            goto L_0x0a40
        L_0x08b7:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.h(r10, r9, r15, r5)
            goto L_0x0a40
        L_0x08c8:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.d(r10, r9, r15, r5)
            goto L_0x0a40
        L_0x08d9:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.c(r10, r9, r15, r5)
            goto L_0x0a40
        L_0x08ea:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.b(r10, r9, r15, r5)
            goto L_0x0a40
        L_0x08fb:
            int[] r10 = r13.c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.a(r10, r9, r15, r5)
            goto L_0x0a40
        L_0x090c:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            eon r11 = r13.a(r1)
            r15.b(r10, r9, r11)
            goto L_0x0a40
        L_0x0921:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = defpackage.epk.b(r14, r11)
            r15.e(r10, r11)
            goto L_0x0a40
        L_0x0932:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = defpackage.epk.a(r14, r11)
            r15.f(r10, r9)
            goto L_0x0a40
        L_0x0943:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = defpackage.epk.b(r14, r11)
            r15.b(r10, r11)
            goto L_0x0a40
        L_0x0954:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = defpackage.epk.a(r14, r11)
            r15.a(r10, r9)
            goto L_0x0a40
        L_0x0965:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = defpackage.epk.a(r14, r11)
            r15.b(r10, r9)
            goto L_0x0a40
        L_0x0976:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = defpackage.epk.a(r14, r11)
            r15.e(r10, r9)
            goto L_0x0a40
        L_0x0987:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            com.google.android.gms.internal.measurement.zzun r9 = (com.google.android.gms.internal.measurement.zzun) r9
            r15.a(r10, r9)
            goto L_0x0a40
        L_0x099a:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            eon r11 = r13.a(r1)
            r15.a(r10, r9, r11)
            goto L_0x0a40
        L_0x09af:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.epk.f(r14, r11)
            a(r10, r9, r15)
            goto L_0x0a40
        L_0x09c0:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = defpackage.epk.c(r14, r11)
            r15.a(r10, r9)
            goto L_0x0a40
        L_0x09d1:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = defpackage.epk.a(r14, r11)
            r15.d(r10, r9)
            goto L_0x0a40
        L_0x09e1:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = defpackage.epk.b(r14, r11)
            r15.d(r10, r11)
            goto L_0x0a40
        L_0x09f1:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = defpackage.epk.a(r14, r11)
            r15.c(r10, r9)
            goto L_0x0a40
        L_0x0a01:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = defpackage.epk.b(r14, r11)
            r15.c(r10, r11)
            goto L_0x0a40
        L_0x0a11:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = defpackage.epk.b(r14, r11)
            r15.a(r10, r11)
            goto L_0x0a40
        L_0x0a21:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = defpackage.epk.d(r14, r11)
            r15.a(r10, r9)
            goto L_0x0a40
        L_0x0a31:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0a40
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = defpackage.epk.e(r14, r11)
            r15.a(r10, r11)
        L_0x0a40:
            int r1 = r1 + 3
            goto L_0x056c
        L_0x0a44:
            if (r8 == 0) goto L_0x0a5b
            emm<?> r1 = r13.r
            r1.b(r8)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a59
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r8 = r1
            goto L_0x0a44
        L_0x0a59:
            r8 = r3
            goto L_0x0a44
        L_0x0a5b:
            epe<?, ?> r0 = r13.q
            a(r0, (T) r14, r15)
            return
        L_0x0a61:
            r13.b((T) r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eob.a(java.lang.Object, epr):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(T r19, defpackage.epr r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.h
            if (r3 == 0) goto L_0x0023
            emm<?> r3 = r0.r
            emp r3 = r3.a(r1)
            eoq<FieldDescriptorType, java.lang.Object> r5 = r3.a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.c()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            r6 = -1
            int[] r7 = r0.c
            int r7 = r7.length
            sun.misc.Unsafe r8 = b
            r10 = r5
            r5 = 0
            r11 = 0
        L_0x002e:
            if (r5 >= r7) goto L_0x04ad
            int r12 = r0.c(r5)
            int[] r13 = r0.c
            r14 = r13[r5]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.j
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x0062
            r4 = 17
            if (r15 > r4) goto L_0x0062
            int r4 = r5 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0058
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            goto L_0x0059
        L_0x0058:
            r13 = r6
        L_0x0059:
            int r4 = r4 >>> 20
            r6 = 1
            int r9 = r6 << r4
            r6 = r13
            r10 = r17
            goto L_0x0067
        L_0x0062:
            r17 = r10
            r10 = r17
            r9 = 0
        L_0x0067:
            if (r10 == 0) goto L_0x0086
            emm<?> r4 = r0.r
            int r4 = r4.a(r10)
            if (r4 > r14) goto L_0x0086
            emm<?> r4 = r0.r
            r4.b(r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0067
        L_0x0084:
            r10 = 0
            goto L_0x0067
        L_0x0086:
            r4 = r12 & r16
            long r12 = (long) r4
            switch(r15) {
                case 0: goto L_0x049d;
                case 1: goto L_0x0490;
                case 2: goto L_0x0483;
                case 3: goto L_0x0476;
                case 4: goto L_0x0469;
                case 5: goto L_0x045c;
                case 6: goto L_0x044f;
                case 7: goto L_0x0442;
                case 8: goto L_0x0434;
                case 9: goto L_0x0422;
                case 10: goto L_0x0412;
                case 11: goto L_0x0404;
                case 12: goto L_0x03f6;
                case 13: goto L_0x03e8;
                case 14: goto L_0x03da;
                case 15: goto L_0x03cc;
                case 16: goto L_0x03be;
                case 17: goto L_0x03ac;
                case 18: goto L_0x039c;
                case 19: goto L_0x038c;
                case 20: goto L_0x037c;
                case 21: goto L_0x036c;
                case 22: goto L_0x035c;
                case 23: goto L_0x034c;
                case 24: goto L_0x033c;
                case 25: goto L_0x032c;
                case 26: goto L_0x031d;
                case 27: goto L_0x030a;
                case 28: goto L_0x02fb;
                case 29: goto L_0x02eb;
                case 30: goto L_0x02db;
                case 31: goto L_0x02cb;
                case 32: goto L_0x02bb;
                case 33: goto L_0x02ab;
                case 34: goto L_0x029b;
                case 35: goto L_0x028b;
                case 36: goto L_0x027b;
                case 37: goto L_0x026b;
                case 38: goto L_0x025b;
                case 39: goto L_0x024b;
                case 40: goto L_0x023b;
                case 41: goto L_0x022b;
                case 42: goto L_0x021b;
                case 43: goto L_0x020b;
                case 44: goto L_0x01fb;
                case 45: goto L_0x01eb;
                case 46: goto L_0x01db;
                case 47: goto L_0x01cb;
                case 48: goto L_0x01bb;
                case 49: goto L_0x01a8;
                case 50: goto L_0x019f;
                case 51: goto L_0x0190;
                case 52: goto L_0x0181;
                case 53: goto L_0x0172;
                case 54: goto L_0x0163;
                case 55: goto L_0x0154;
                case 56: goto L_0x0145;
                case 57: goto L_0x0136;
                case 58: goto L_0x0127;
                case 59: goto L_0x0118;
                case 60: goto L_0x0105;
                case 61: goto L_0x00f5;
                case 62: goto L_0x00e7;
                case 63: goto L_0x00d9;
                case 64: goto L_0x00cb;
                case 65: goto L_0x00bd;
                case 66: goto L_0x00af;
                case 67: goto L_0x00a1;
                case 68: goto L_0x008f;
                default: goto L_0x008c;
            }
        L_0x008c:
            r15 = 0
            goto L_0x04a9
        L_0x008f:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            eon r9 = r0.a(r5)
            r2.b(r14, r4, r9)
            goto L_0x008c
        L_0x00a1:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = e(r1, r12)
            r2.e(r14, r12)
            goto L_0x008c
        L_0x00af:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = d(r1, r12)
            r2.f(r14, r4)
            goto L_0x008c
        L_0x00bd:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = e(r1, r12)
            r2.b(r14, r12)
            goto L_0x008c
        L_0x00cb:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = d(r1, r12)
            r2.a(r14, r4)
            goto L_0x008c
        L_0x00d9:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = d(r1, r12)
            r2.b(r14, r4)
            goto L_0x008c
        L_0x00e7:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = d(r1, r12)
            r2.e(r14, r4)
            goto L_0x008c
        L_0x00f5:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.measurement.zzun r4 = (com.google.android.gms.internal.measurement.zzun) r4
            r2.a(r14, r4)
            goto L_0x008c
        L_0x0105:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            eon r9 = r0.a(r5)
            r2.a(r14, r4, r9)
            goto L_0x008c
        L_0x0118:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            a(r14, r4, r2)
            goto L_0x008c
        L_0x0127:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            boolean r4 = f(r1, r12)
            r2.a(r14, r4)
            goto L_0x008c
        L_0x0136:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = d(r1, r12)
            r2.d(r14, r4)
            goto L_0x008c
        L_0x0145:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = e(r1, r12)
            r2.d(r14, r12)
            goto L_0x008c
        L_0x0154:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = d(r1, r12)
            r2.c(r14, r4)
            goto L_0x008c
        L_0x0163:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = e(r1, r12)
            r2.c(r14, r12)
            goto L_0x008c
        L_0x0172:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = e(r1, r12)
            r2.a(r14, r12)
            goto L_0x008c
        L_0x0181:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            float r4 = c(r1, r12)
            r2.a(r14, r4)
            goto L_0x008c
        L_0x0190:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            double r12 = b((T) r1, r12)
            r2.a(r14, r12)
            goto L_0x008c
        L_0x019f:
            java.lang.Object r4 = r8.getObject(r1, r12)
            r0.a(r2, r14, r4, r5)
            goto L_0x008c
        L_0x01a8:
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            eon r12 = r0.a(r5)
            defpackage.eop.b(r4, r9, r2, r12)
            goto L_0x008c
        L_0x01bb:
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r14 = 1
            defpackage.eop.e(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01cb:
            r14 = 1
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.j(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01db:
            r14 = 1
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.g(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01eb:
            r14 = 1
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.l(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01fb:
            r14 = 1
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.m(r4, r9, r2, r14)
            goto L_0x008c
        L_0x020b:
            r14 = 1
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.i(r4, r9, r2, r14)
            goto L_0x008c
        L_0x021b:
            r14 = 1
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.n(r4, r9, r2, r14)
            goto L_0x008c
        L_0x022b:
            r14 = 1
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.k(r4, r9, r2, r14)
            goto L_0x008c
        L_0x023b:
            r14 = 1
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.f(r4, r9, r2, r14)
            goto L_0x008c
        L_0x024b:
            r14 = 1
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.h(r4, r9, r2, r14)
            goto L_0x008c
        L_0x025b:
            r14 = 1
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.d(r4, r9, r2, r14)
            goto L_0x008c
        L_0x026b:
            r14 = 1
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.c(r4, r9, r2, r14)
            goto L_0x008c
        L_0x027b:
            r14 = 1
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.b(r4, r9, r2, r14)
            goto L_0x008c
        L_0x028b:
            r14 = 1
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.a(r4, r9, r2, r14)
            goto L_0x008c
        L_0x029b:
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r14 = 0
            defpackage.eop.e(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02ab:
            r14 = 0
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.j(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02bb:
            r14 = 0
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.g(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02cb:
            r14 = 0
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.l(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02db:
            r14 = 0
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.m(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02eb:
            r14 = 0
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.i(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02fb:
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.b(r4, r9, r2)
            goto L_0x008c
        L_0x030a:
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            eon r12 = r0.a(r5)
            defpackage.eop.a(r4, r9, r2, r12)
            goto L_0x008c
        L_0x031d:
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.a(r4, r9, r2)
            goto L_0x008c
        L_0x032c:
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r15 = 0
            defpackage.eop.n(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x033c:
            r15 = 0
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.k(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x034c:
            r15 = 0
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.f(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x035c:
            r15 = 0
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.h(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x036c:
            r15 = 0
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.d(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x037c:
            r15 = 0
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.c(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x038c:
            r15 = 0
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.b(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x039c:
            r15 = 0
            int[] r4 = r0.c
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.eop.a(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x03ac:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            eon r9 = r0.a(r5)
            r2.b(r14, r4, r9)
            goto L_0x04a9
        L_0x03be:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.e(r14, r12)
            goto L_0x04a9
        L_0x03cc:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.f(r14, r4)
            goto L_0x04a9
        L_0x03da:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.b(r14, r12)
            goto L_0x04a9
        L_0x03e8:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.a(r14, r4)
            goto L_0x04a9
        L_0x03f6:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.b(r14, r4)
            goto L_0x04a9
        L_0x0404:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.e(r14, r4)
            goto L_0x04a9
        L_0x0412:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.measurement.zzun r4 = (com.google.android.gms.internal.measurement.zzun) r4
            r2.a(r14, r4)
            goto L_0x04a9
        L_0x0422:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            eon r9 = r0.a(r5)
            r2.a(r14, r4, r9)
            goto L_0x04a9
        L_0x0434:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            a(r14, r4, r2)
            goto L_0x04a9
        L_0x0442:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            boolean r4 = defpackage.epk.c(r1, r12)
            r2.a(r14, r4)
            goto L_0x04a9
        L_0x044f:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.d(r14, r4)
            goto L_0x04a9
        L_0x045c:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.d(r14, r12)
            goto L_0x04a9
        L_0x0469:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.c(r14, r4)
            goto L_0x04a9
        L_0x0476:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.c(r14, r12)
            goto L_0x04a9
        L_0x0483:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.a(r14, r12)
            goto L_0x04a9
        L_0x0490:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            float r4 = defpackage.epk.d(r1, r12)
            r2.a(r14, r4)
            goto L_0x04a9
        L_0x049d:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            double r12 = defpackage.epk.e(r1, r12)
            r2.a(r14, r12)
        L_0x04a9:
            int r5 = r5 + 3
            goto L_0x002e
        L_0x04ad:
            r17 = r10
            r4 = r17
        L_0x04b1:
            if (r4 == 0) goto L_0x04c7
            emm<?> r5 = r0.r
            r5.b(r4)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04c5
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            goto L_0x04b1
        L_0x04c5:
            r4 = 0
            goto L_0x04b1
        L_0x04c7:
            epe<?, ?> r3 = r0.q
            a(r3, (T) r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eob.b(java.lang.Object, epr):void");
    }

    private final <K, V> void a(epr epr, int i2, Object obj, int i3) {
        if (obj != null) {
            epr.a(i2, this.s.b(), this.s.b(obj));
        }
    }

    private static <UT, UB> void a(epe<UT, UB> epe, T t, epr epr) {
        epe.a(epe.b(t), epr);
    }

    public final void a(T t, eom eom, eml eml) {
        Object obj;
        if (eml != null) {
            epe<?, ?> epe = this.q;
            emm<?> emm = this.r;
            Object obj2 = null;
            emp emp = null;
            while (true) {
                try {
                    int a2 = eom.a();
                    int i2 = -1;
                    if (a2 >= this.e && a2 <= this.f) {
                        int i3 = 0;
                        int length = (this.c.length / 3) - 1;
                        while (true) {
                            if (i3 <= length) {
                                int i4 = (length + i3) >>> 1;
                                int i5 = i4 * 3;
                                int i6 = this.c[i5];
                                if (a2 == i6) {
                                    i2 = i5;
                                } else if (a2 < i6) {
                                    length = i4 - 1;
                                } else {
                                    i3 = i4 + 1;
                                }
                            }
                        }
                    }
                    if (i2 >= 0) {
                        int c2 = c(i2);
                        switch ((267386880 & c2) >>> 20) {
                            case 0:
                                epk.a((Object) t, (long) (c2 & 1048575), eom.d());
                                b(t, i2);
                                break;
                            case 1:
                                epk.a((Object) t, (long) (c2 & 1048575), eom.e());
                                b(t, i2);
                                break;
                            case 2:
                                epk.a((Object) t, (long) (c2 & 1048575), eom.g());
                                b(t, i2);
                                break;
                            case 3:
                                epk.a((Object) t, (long) (c2 & 1048575), eom.f());
                                b(t, i2);
                                break;
                            case 4:
                                epk.a((Object) t, (long) (c2 & 1048575), eom.h());
                                b(t, i2);
                                break;
                            case 5:
                                epk.a((Object) t, (long) (c2 & 1048575), eom.i());
                                b(t, i2);
                                break;
                            case 6:
                                epk.a((Object) t, (long) (c2 & 1048575), eom.j());
                                b(t, i2);
                                break;
                            case 7:
                                epk.a((Object) t, (long) (c2 & 1048575), eom.k());
                                b(t, i2);
                                break;
                            case 8:
                                a((Object) t, c2, eom);
                                b(t, i2);
                                break;
                            case 9:
                                if (!a(t, i2)) {
                                    epk.a((Object) t, (long) (c2 & 1048575), eom.a(a(i2), eml));
                                    b(t, i2);
                                    break;
                                } else {
                                    long j2 = (long) (c2 & 1048575);
                                    epk.a((Object) t, j2, emy.a(epk.f(t, j2), eom.a(a(i2), eml)));
                                    break;
                                }
                            case 10:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) eom.n());
                                b(t, i2);
                                break;
                            case 11:
                                epk.a((Object) t, (long) (c2 & 1048575), eom.o());
                                b(t, i2);
                                break;
                            case 12:
                                int p2 = eom.p();
                                enb b2 = b(i2);
                                if (b2 != null) {
                                    if (!b2.a(p2)) {
                                        obj2 = eop.a(a2, p2, obj2, epe);
                                        break;
                                    }
                                }
                                epk.a((Object) t, (long) (c2 & 1048575), p2);
                                b(t, i2);
                                break;
                            case 13:
                                epk.a((Object) t, (long) (c2 & 1048575), eom.q());
                                b(t, i2);
                                break;
                            case 14:
                                epk.a((Object) t, (long) (c2 & 1048575), eom.r());
                                b(t, i2);
                                break;
                            case 15:
                                epk.a((Object) t, (long) (c2 & 1048575), eom.s());
                                b(t, i2);
                                break;
                            case 16:
                                epk.a((Object) t, (long) (c2 & 1048575), eom.t());
                                b(t, i2);
                                break;
                            case 17:
                                if (!a(t, i2)) {
                                    epk.a((Object) t, (long) (c2 & 1048575), eom.b(a(i2), eml));
                                    b(t, i2);
                                    break;
                                } else {
                                    long j3 = (long) (c2 & 1048575);
                                    epk.a((Object) t, j3, emy.a(epk.f(t, j3), eom.b(a(i2), eml)));
                                    break;
                                }
                            case 18:
                                eom.a(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 19:
                                eom.b(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 20:
                                eom.d(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 21:
                                eom.c(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 22:
                                eom.e(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 23:
                                eom.f(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 24:
                                eom.g(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 25:
                                eom.h(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 26:
                                if (!e(c2)) {
                                    eom.i(this.p.a(t, (long) (c2 & 1048575)));
                                    break;
                                } else {
                                    eom.j(this.p.a(t, (long) (c2 & 1048575)));
                                    break;
                                }
                            case 27:
                                eom.a(this.p.a(t, (long) (c2 & 1048575)), a(i2), eml);
                                break;
                            case 28:
                                eom.k(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 29:
                                eom.l(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 30:
                                List a3 = this.p.a(t, (long) (c2 & 1048575));
                                eom.m(a3);
                                obj2 = eop.a(a2, a3, b(i2), obj2, epe);
                                break;
                            case 31:
                                eom.n(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 32:
                                eom.o(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 33:
                                eom.p(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 34:
                                eom.q(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 35:
                                eom.a(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 36:
                                eom.b(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 37:
                                eom.d(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 38:
                                eom.c(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 39:
                                eom.e(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 40:
                                eom.f(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 41:
                                eom.g(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 42:
                                eom.h(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 43:
                                eom.l(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 44:
                                List a4 = this.p.a(t, (long) (c2 & 1048575));
                                eom.m(a4);
                                obj2 = eop.a(a2, a4, b(i2), obj2, epe);
                                break;
                            case 45:
                                eom.n(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 46:
                                eom.o(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 47:
                                eom.p(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 48:
                                eom.q(this.p.a(t, (long) (c2 & 1048575)));
                                break;
                            case 49:
                                long j4 = (long) (c2 & 1048575);
                                eom.b(this.p.a(t, j4), a(i2), eml);
                                break;
                            case 50:
                                long c3 = (long) (c(i2) & 1048575);
                                Object f2 = epk.f(t, c3);
                                if (f2 == null) {
                                    f2 = this.s.a();
                                    epk.a((Object) t, c3, f2);
                                } else if (this.s.c(f2)) {
                                    Object a5 = this.s.a();
                                    this.s.a(a5, f2);
                                    epk.a((Object) t, c3, a5);
                                    f2 = a5;
                                }
                                eom.a(this.s.a(f2), this.s.b(), eml);
                                break;
                            case 51:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) Double.valueOf(eom.d()));
                                b(t, a2, i2);
                                break;
                            case 52:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) Float.valueOf(eom.e()));
                                b(t, a2, i2);
                                break;
                            case 53:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) Long.valueOf(eom.g()));
                                b(t, a2, i2);
                                break;
                            case 54:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) Long.valueOf(eom.f()));
                                b(t, a2, i2);
                                break;
                            case 55:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) Integer.valueOf(eom.h()));
                                b(t, a2, i2);
                                break;
                            case 56:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) Long.valueOf(eom.i()));
                                b(t, a2, i2);
                                break;
                            case 57:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) Integer.valueOf(eom.j()));
                                b(t, a2, i2);
                                break;
                            case 58:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) Boolean.valueOf(eom.k()));
                                b(t, a2, i2);
                                break;
                            case 59:
                                a((Object) t, c2, eom);
                                b(t, a2, i2);
                                break;
                            case b.bo /*60*/:
                                if (a(t, a2, i2)) {
                                    long j5 = (long) (c2 & 1048575);
                                    epk.a((Object) t, j5, emy.a(epk.f(t, j5), eom.a(a(i2), eml)));
                                } else {
                                    epk.a((Object) t, (long) (c2 & 1048575), eom.a(a(i2), eml));
                                    b(t, i2);
                                }
                                b(t, a2, i2);
                                break;
                            case b.bp /*61*/:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) eom.n());
                                b(t, a2, i2);
                                break;
                            case b.bq /*62*/:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) Integer.valueOf(eom.o()));
                                b(t, a2, i2);
                                break;
                            case b.br /*63*/:
                                int p3 = eom.p();
                                enb b3 = b(i2);
                                if (b3 != null) {
                                    if (!b3.a(p3)) {
                                        obj2 = eop.a(a2, p3, obj2, epe);
                                        break;
                                    }
                                }
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) Integer.valueOf(p3));
                                b(t, a2, i2);
                                break;
                            case b.bs /*64*/:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) Integer.valueOf(eom.q()));
                                b(t, a2, i2);
                                break;
                            case b.bt /*65*/:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) Long.valueOf(eom.r()));
                                b(t, a2, i2);
                                break;
                            case b.bu /*66*/:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) Integer.valueOf(eom.s()));
                                b(t, a2, i2);
                                break;
                            case b.bv /*67*/:
                                epk.a((Object) t, (long) (c2 & 1048575), (Object) Long.valueOf(eom.t()));
                                b(t, a2, i2);
                                break;
                            case b.bw /*68*/:
                                epk.a((Object) t, (long) (c2 & 1048575), eom.b(a(i2), eml));
                                b(t, a2, i2);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = epe.a();
                                }
                                if (epe.a(obj2, eom)) {
                                    break;
                                } else {
                                    for (int i7 = this.m; i7 < this.n; i7++) {
                                        obj2 = a((Object) t, this.l[i7], (UB) obj2, epe);
                                    }
                                    if (obj2 != null) {
                                        epe.b((Object) t, obj2);
                                    }
                                    return;
                                }
                        }
                    } else if (a2 == Integer.MAX_VALUE) {
                        for (int i8 = this.m; i8 < this.n; i8++) {
                            obj2 = a((Object) t, this.l[i8], (UB) obj2, epe);
                        }
                        if (obj2 != null) {
                            epe.b((Object) t, obj2);
                        }
                        return;
                    } else {
                        if (!this.h) {
                            obj = null;
                        } else {
                            obj = emm.a(eml, this.g, a2);
                        }
                        if (obj != null) {
                            if (emp == null) {
                                emp = emm.b((Object) t);
                            }
                            obj2 = emm.a();
                        } else {
                            if (obj2 == null) {
                                obj2 = epe.c(t);
                            }
                            if (!epe.a(obj2, eom)) {
                                for (int i9 = this.m; i9 < this.n; i9++) {
                                    obj2 = a((Object) t, this.l[i9], (UB) obj2, epe);
                                }
                                if (obj2 != null) {
                                    epe.b((Object) t, obj2);
                                }
                                return;
                            }
                        }
                    }
                } catch (zzwf unused) {
                    if (obj2 == null) {
                        obj2 = epe.c(t);
                    }
                    if (!epe.a(obj2, eom)) {
                        for (int i10 = this.m; i10 < this.n; i10++) {
                            obj2 = a((Object) t, this.l[i10], (UB) obj2, epe);
                        }
                        if (obj2 != null) {
                            epe.b((Object) t, obj2);
                        }
                        return;
                    }
                } catch (Throwable th) {
                    for (int i11 = this.m; i11 < this.n; i11++) {
                        obj2 = a((Object) t, this.l[i11], (UB) obj2, epe);
                    }
                    if (obj2 != null) {
                        epe.b((Object) t, obj2);
                    }
                    throw th;
                }
            }
        } else {
            throw new NullPointerException();
        }
    }

    private final eon a(int i2) {
        int i3 = (i2 / 3) << 1;
        eon eon = (eon) this.d[i3];
        if (eon != null) {
            return eon;
        }
        eon a2 = eoj.a().a((Class) this.d[i3 + 1]);
        this.d[i3] = a2;
        return a2;
    }

    private final enb b(int i2) {
        return (enb) this.d[((i2 / 3) << 1) + 1];
    }

    public final void c(T t) {
        int i2;
        int i3 = this.m;
        while (true) {
            i2 = this.n;
            if (i3 >= i2) {
                break;
            }
            long c2 = (long) (c(this.l[i3]) & 1048575);
            Object f2 = epk.f(t, c2);
            if (f2 != null) {
                epk.a((Object) t, c2, this.s.d(f2));
            }
            i3++;
        }
        int length = this.l.length;
        while (i2 < length) {
            this.p.b(t, (long) this.l[i2]);
            i2++;
        }
        this.q.d(t);
        if (this.h) {
            this.r.c(t);
        }
    }

    private final <UT, UB> UB a(Object obj, int i2, UB ub, epe<UT, UB> epe) {
        int i3 = this.c[i2];
        Object f2 = epk.f(obj, (long) (c(i2) & 1048575));
        if (f2 == null) {
            return ub;
        }
        enb b2 = b(i2);
        if (b2 == null) {
            return ub;
        }
        return a(i2, i3, this.s.a(f2), b2, ub, epe);
    }

    private final <K, V, UT, UB> UB a(int i2, int i3, Map<K, V> map, enb enb, UB ub, epe<UT, UB> epe) {
        enr b2 = this.s.b();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (!enb.a(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    ub = epe.a();
                }
                ema d2 = zzun.d(enq.a(b2, entry.getKey(), entry.getValue()));
                try {
                    enq.a(d2.a, b2, entry.getKey(), entry.getValue());
                    epe.a(ub, i3, d2.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    public final boolean d(T t) {
        int i2;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.m) {
                return !this.h || this.r.a((Object) t).d();
            }
            int i6 = this.l[i3];
            int i7 = this.c[i6];
            int c2 = c(i6);
            if (!this.j) {
                int i8 = this.c[i6 + 2];
                int i9 = i8 & 1048575;
                i2 = 1 << (i8 >>> 20);
                if (i9 != i4) {
                    i5 = b.getInt(t, (long) i9);
                    i4 = i9;
                }
            } else {
                i2 = 0;
            }
            if (((268435456 & c2) != 0) && !a(t, i6, i5, i2)) {
                return false;
            }
            int i10 = (267386880 & c2) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (a(t, i7, i6) && !a((Object) t, c2, a(i6))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 != 50) {
                            continue;
                        } else {
                            Map b2 = this.s.b(epk.f(t, (long) (c2 & 1048575)));
                            if (!b2.isEmpty() && this.s.b().c.zzcfd == zzzg.MESSAGE) {
                                eon eon = null;
                                Iterator it = b2.values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Object next = it.next();
                                    if (eon == null) {
                                        eon = eoj.a().a(next.getClass());
                                    }
                                    if (!eon.d(next)) {
                                        z = false;
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) epk.f(t, (long) (c2 & 1048575));
                if (!list.isEmpty()) {
                    eon a2 = a(i6);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            break;
                        } else if (!a2.d(list.get(i11))) {
                            z = false;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (a(t, i6, i5, i2) && !a((Object) t, c2, a(i6))) {
                return false;
            }
            i3++;
        }
    }

    private static boolean a(Object obj, int i2, eon eon) {
        return eon.d(epk.f(obj, (long) (i2 & 1048575)));
    }

    private static void a(int i2, Object obj, epr epr) {
        if (obj instanceof String) {
            epr.a(i2, (String) obj);
        } else {
            epr.a(i2, (zzun) obj);
        }
    }

    private final void a(Object obj, int i2, eom eom) {
        if (e(i2)) {
            epk.a(obj, (long) (i2 & 1048575), (Object) eom.m());
        } else if (this.i) {
            epk.a(obj, (long) (i2 & 1048575), (Object) eom.l());
        } else {
            epk.a(obj, (long) (i2 & 1048575), (Object) eom.n());
        }
    }

    private final int c(int i2) {
        return this.c[i2 + 1];
    }

    private final int d(int i2) {
        return this.c[i2 + 2];
    }

    private static <T> double b(T t, long j2) {
        return ((Double) epk.f(t, j2)).doubleValue();
    }

    private static <T> float c(T t, long j2) {
        return ((Float) epk.f(t, j2)).floatValue();
    }

    private static <T> int d(T t, long j2) {
        return ((Integer) epk.f(t, j2)).intValue();
    }

    private static <T> long e(T t, long j2) {
        return ((Long) epk.f(t, j2)).longValue();
    }

    private static <T> boolean f(T t, long j2) {
        return ((Boolean) epk.f(t, j2)).booleanValue();
    }

    private final boolean c(T t, T t2, int i2) {
        return a(t, i2) == a(t2, i2);
    }

    private final boolean a(T t, int i2, int i3, int i4) {
        if (this.j) {
            return a(t, i2);
        }
        return (i3 & i4) != 0;
    }

    private final boolean a(T t, int i2) {
        if (this.j) {
            int c2 = c(i2);
            long j2 = (long) (c2 & 1048575);
            switch ((c2 & 267386880) >>> 20) {
                case 0:
                    return epk.e(t, j2) != 0.0d;
                case 1:
                    return epk.d(t, j2) != 0.0f;
                case 2:
                    return epk.b(t, j2) != 0;
                case 3:
                    return epk.b(t, j2) != 0;
                case 4:
                    return epk.a((Object) t, j2) != 0;
                case 5:
                    return epk.b(t, j2) != 0;
                case 6:
                    return epk.a((Object) t, j2) != 0;
                case 7:
                    return epk.c(t, j2);
                case 8:
                    Object f2 = epk.f(t, j2);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof zzun) {
                        return !zzun.a.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return epk.f(t, j2) != null;
                case 10:
                    return !zzun.a.equals(epk.f(t, j2));
                case 11:
                    return epk.a((Object) t, j2) != 0;
                case 12:
                    return epk.a((Object) t, j2) != 0;
                case 13:
                    return epk.a((Object) t, j2) != 0;
                case 14:
                    return epk.b(t, j2) != 0;
                case 15:
                    return epk.a((Object) t, j2) != 0;
                case 16:
                    return epk.b(t, j2) != 0;
                case 17:
                    return epk.f(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int d2 = d(i2);
            return (epk.a((Object) t, (long) (d2 & 1048575)) & (1 << (d2 >>> 20))) != 0;
        }
    }

    private final void b(T t, int i2) {
        if (!this.j) {
            int d2 = d(i2);
            long j2 = (long) (d2 & 1048575);
            epk.a((Object) t, j2, epk.a((Object) t, j2) | (1 << (d2 >>> 20)));
        }
    }

    private final boolean a(T t, int i2, int i3) {
        return epk.a((Object) t, (long) (d(i3) & 1048575)) == i2;
    }

    private final void b(T t, int i2, int i3) {
        epk.a((Object) t, (long) (d(i3) & 1048575), i2);
    }
}
