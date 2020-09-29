package defpackage;

import android.os.Build.VERSION;
import androidx.work.NetworkType;

/* renamed from: sc reason: default package */
public final class sc {
    public static final sc a = new a().a();
    public NetworkType b = NetworkType.NOT_REQUIRED;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g = -1;
    public long h = -1;
    public sd i = new sd();

    /* renamed from: sc$a */
    public static final class a {
        public boolean a = false;
        boolean b = false;
        public NetworkType c = NetworkType.NOT_REQUIRED;
        boolean d = false;
        boolean e = false;
        long f = -1;
        long g = -1;
        sd h = new sd();

        public final sc a() {
            return new sc(this);
        }
    }

    public sc() {
    }

    sc(a aVar) {
        this.c = aVar.a;
        int i2 = VERSION.SDK_INT;
        this.d = false;
        this.b = aVar.c;
        this.e = false;
        this.f = false;
        if (VERSION.SDK_INT >= 24) {
            this.i = aVar.h;
            this.g = aVar.f;
            this.h = aVar.g;
        }
    }

    public sc(sc scVar) {
        this.c = scVar.c;
        this.d = scVar.d;
        this.b = scVar.b;
        this.e = scVar.e;
        this.f = scVar.f;
        this.i = scVar.i;
    }

    public final boolean a() {
        return this.i.a() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sc scVar = (sc) obj;
        if (this.c == scVar.c && this.d == scVar.d && this.e == scVar.e && this.f == scVar.f && this.g == scVar.g && this.h == scVar.h && this.b == scVar.b) {
            return this.i.equals(scVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j = this.g;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.h;
        return ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.i.hashCode();
    }
}
