package defpackage;

import android.net.Uri;
import com.spotify.cosmos.router.Request;
import java.util.Arrays;

/* renamed from: bbp reason: default package */
public final class bbp {
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;
    @Deprecated
    private byte[] i;

    public bbp(Uri uri, int i2) {
        this(uri, 0, -1, null, 3);
    }

    public bbp(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public bbp(Uri uri, long j, long j2, String str, int i2) {
        this(uri, 0, 0, -1, null, i2);
    }

    public bbp(Uri uri, long j, long j2, long j3, String str, int i2) {
        this(uri, null, j, j2, j3, str, i2);
    }

    private bbp(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i2) {
        this(uri, 1, null, j, j2, j3, str, i2);
    }

    public bbp(Uri uri, int i2, byte[] bArr, long j, long j2, long j3, String str, int i3) {
        byte[] bArr2 = bArr;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        boolean z = true;
        bcu.a(j4 >= 0);
        bcu.a(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        bcu.a(z);
        this.a = uri;
        this.b = i2;
        if (bArr2 == null || bArr2.length == 0) {
            bArr2 = null;
        }
        this.c = bArr2;
        this.i = this.c;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = str;
        this.h = i3;
    }

    public final boolean a(int i2) {
        return (this.h & i2) == i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.b));
        sb.append(" ");
        sb.append(this.a);
        String str = ", ";
        sb.append(str);
        sb.append(Arrays.toString(this.c));
        sb.append(str);
        sb.append(this.d);
        sb.append(str);
        sb.append(this.e);
        sb.append(str);
        sb.append(this.f);
        sb.append(str);
        sb.append(this.g);
        sb.append(str);
        sb.append(this.h);
        sb.append("]");
        return sb.toString();
    }

    public static String b(int i2) {
        if (i2 == 1) {
            return Request.GET;
        }
        if (i2 == 2) {
            return Request.POST;
        }
        if (i2 == 3) {
            return "HEAD";
        }
        throw new AssertionError(i2);
    }

    public final bbp a(long j) {
        long j2 = this.f;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return a(j, j3);
    }

    public final bbp a(long j, long j2) {
        if (j == 0 && this.f == j2) {
            return this;
        }
        bbp bbp = new bbp(this.a, this.b, this.c, this.d + j, this.e + j, j2, this.g, this.h);
        return bbp;
    }
}
