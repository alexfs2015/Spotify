package defpackage;

import android.os.Build.VERSION;
import androidx.work.NetworkType;

/* renamed from: sq reason: default package */
public final class sq {
    public static final sq a = new a().a();
    public NetworkType b = NetworkType.NOT_REQUIRED;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g = -1;
    public long h = -1;
    public sr i = new sr();

    /* renamed from: sq$a */
    public static final class a {
        public boolean a = false;
        boolean b = false;
        public NetworkType c = NetworkType.NOT_REQUIRED;
        boolean d = false;
        boolean e = false;
        long f = -1;
        long g = -1;
        sr h = new sr();

        public final sq a() {
            return new sq(this);
        }
    }

    public sq() {
    }

    sq(a aVar) {
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

    public sq(sq sqVar) {
        this.c = sqVar.c;
        this.d = sqVar.d;
        this.b = sqVar.b;
        this.e = sqVar.e;
        this.f = sqVar.f;
        this.i = sqVar.i;
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
        sq sqVar = (sq) obj;
        if (this.c == sqVar.c && this.d == sqVar.d && this.e == sqVar.e && this.f == sqVar.f && this.g == sqVar.g && this.h == sqVar.h && this.b == sqVar.b) {
            return this.i.equals(sqVar.i);
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
