package defpackage;

import com.google.android.gms.internal.ads.zzbbj;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: dfg reason: default package */
final class dfg {
    private int A = Integer.MIN_VALUE;
    private int B = 0;
    private int C = 0;
    private int D = 0;
    private int E = 0;
    private int F = 0;
    final Object[] a;
    Class<?> b;
    final int c;
    final int d;
    final int e;
    final int f;
    final int g;
    final int h;
    final int i;
    final int j;
    final int k;
    final int[] l;
    int m;
    int n;
    int o;
    int p;
    int q;
    Field r;
    Object s;
    Object t;
    Object u;
    private final dfh v;
    private final int w;
    private int x;
    private int y;
    private int z = Integer.MAX_VALUE;

    dfg(Class<?> cls, String str, Object[] objArr) {
        this.b = cls;
        this.v = new dfh(str);
        this.a = objArr;
        this.c = this.v.b();
        this.d = this.v.b();
        int[] iArr = null;
        if (this.d == 0) {
            this.e = 0;
            this.w = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.j = 0;
            this.i = 0;
            this.k = 0;
            this.l = null;
            return;
        }
        this.e = this.v.b();
        this.w = this.v.b();
        this.f = this.v.b();
        this.g = this.v.b();
        this.j = this.v.b();
        this.i = this.v.b();
        this.h = this.v.b();
        this.k = this.v.b();
        int b2 = this.v.b();
        if (b2 != 0) {
            iArr = new int[b2];
        }
        this.l = iArr;
        this.x = (this.e << 1) + this.w;
    }

    static Field a(Class<?> cls, String str) {
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

    private final Object d() {
        Object[] objArr = this.a;
        int i2 = this.x;
        this.x = i2 + 1;
        return objArr[i2];
    }

    private final boolean e() {
        return (this.c & 1) == 1;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        int i2;
        boolean z2 = false;
        if (!this.v.a()) {
            return false;
        }
        this.m = this.v.b();
        this.n = this.v.b();
        this.o = this.n & 255;
        int i3 = this.m;
        if (i3 < this.z) {
            this.z = i3;
        }
        int i4 = this.m;
        if (i4 > this.A) {
            this.A = i4;
        }
        if (this.o == zzbbj.MAP.id) {
            this.B++;
        } else if (this.o >= zzbbj.DOUBLE_LIST.id && this.o <= zzbbj.GROUP_LIST.id) {
            this.C++;
        }
        this.F++;
        if (dfl.a(this.z, this.m, this.F)) {
            this.E = this.m + 1;
            i2 = this.E - this.z;
        } else {
            i2 = this.D + 1;
        }
        this.D = i2;
        if ((this.n & 1024) != 0) {
            int[] iArr = this.l;
            int i5 = this.y;
            this.y = i5 + 1;
            iArr[i5] = this.m;
        }
        this.s = null;
        this.t = null;
        this.u = null;
        if (b()) {
            this.p = this.v.b();
            if (this.o == zzbbj.MESSAGE.id + 51 || this.o == zzbbj.GROUP.id + 51) {
                this.s = d();
            } else if (this.o == zzbbj.ENUM.id + 51 && e()) {
                this.t = d();
            }
        } else {
            this.r = a(this.b, (String) d());
            if (c()) {
                this.q = this.v.b();
            }
            if (this.o == zzbbj.MESSAGE.id || this.o == zzbbj.GROUP.id) {
                this.s = this.r.getType();
            } else if (this.o == zzbbj.MESSAGE_LIST.id || this.o == zzbbj.GROUP_LIST.id) {
                this.s = d();
            } else if (this.o == zzbbj.ENUM.id || this.o == zzbbj.ENUM_LIST.id || this.o == zzbbj.ENUM_LIST_PACKED.id) {
                if (e()) {
                    this.t = d();
                }
            } else if (this.o == zzbbj.MAP.id) {
                this.u = d();
                if ((this.n & 2048) != 0) {
                    z2 = true;
                }
                if (z2) {
                    this.t = d();
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        return this.o > zzbbj.MAP.id;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return e() && this.o <= zzbbj.GROUP.id;
    }
}
