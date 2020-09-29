package defpackage;

import android.graphics.Bitmap.Config;
import android.net.Uri;
import com.squareup.picasso.Picasso.Priority;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: wgq reason: default package */
public final class wgq {
    private static final long s = TimeUnit.SECONDS.toNanos(5);
    int a;
    long b;
    public int c;
    public final Uri d;
    public final int e;
    public final String f;
    public final List<wgz> g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final float m;
    public final float n;
    public final float o;
    public final boolean p;
    public final Config q;
    public final Priority r;

    /* renamed from: wgq$a */
    public static final class a {
        int a;
        int b;
        boolean c;
        boolean d;
        boolean e;
        List<wgz> f;
        Config g;
        Priority h;
        private Uri i;
        private int j;

        a(Uri uri, int i2, Config config) {
            this.i = uri;
            this.j = i2;
            this.g = config;
        }

        public final a a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i3 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i3 == 0 && i2 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.a = i2;
                this.b = i3;
                return this;
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a() {
            return (this.i == null && this.j == 0) ? false : true;
        }

        public final wgq b() {
            if (this.d && this.c) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.c && this.a == 0 && this.b == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (this.d && this.a == 0 && this.b == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.h == null) {
                    this.h = Priority.NORMAL;
                }
                wgq wgq = new wgq(this.i, this.j, null, this.f, this.a, this.b, this.c, this.d, this.e, 0.0f, 0.0f, 0.0f, false, this.g, this.h, 0);
                return wgq;
            }
        }
    }

    private wgq(Uri uri, int i2, String str, List<wgz> list, int i3, int i4, boolean z, boolean z2, boolean z3, float f2, float f3, float f4, boolean z4, Config config, Priority priority) {
        this.d = uri;
        this.e = i2;
        this.f = str;
        if (list == null) {
            this.g = null;
        } else {
            this.g = Collections.unmodifiableList(list);
        }
        this.h = i3;
        this.i = i4;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = f2;
        this.n = f3;
        this.o = f4;
        this.p = z4;
        this.q = config;
        this.r = priority;
    }

    /* synthetic */ wgq(Uri uri, int i2, String str, List list, int i3, int i4, boolean z, boolean z2, boolean z3, float f2, float f3, float f4, boolean z4, Config config, Priority priority, byte b2) {
        this(uri, i2, str, list, i3, i4, z, z2, z3, f2, f3, f4, z4, config, priority);
    }

    public final String a() {
        long nanoTime = System.nanoTime() - this.b;
        if (nanoTime > s) {
            StringBuilder sb = new StringBuilder();
            sb.append(b());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b());
        sb2.append('+');
        sb2.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
        sb2.append("ms");
        return sb2.toString();
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        StringBuilder sb = new StringBuilder("[R");
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }

    public final boolean c() {
        return (this.h == 0 && this.i == 0) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        return c() || this.m != 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public final boolean e() {
        return this.g != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i2 = this.e;
        if (i2 > 0) {
            sb.append(i2);
        } else {
            sb.append(this.d);
        }
        List<wgz> list = this.g;
        if (list != null && !list.isEmpty()) {
            for (wgz wgz : this.g) {
                sb.append(' ');
                sb.append(wgz.a());
            }
        }
        if (this.f != null) {
            sb.append(" stableKey(");
            sb.append(this.f);
            sb.append(')');
        }
        if (this.h > 0) {
            sb.append(" resize(");
            sb.append(this.h);
            sb.append(',');
            sb.append(this.i);
            sb.append(')');
        }
        if (this.j) {
            sb.append(" centerCrop");
        }
        if (this.k) {
            sb.append(" centerInside");
        }
        if (this.m != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.m);
            if (this.p) {
                sb.append(" @ ");
                sb.append(this.n);
                sb.append(',');
                sb.append(this.o);
            }
            sb.append(')');
        }
        if (this.q != null) {
            sb.append(' ');
            sb.append(this.q);
        }
        sb.append('}');
        return sb.toString();
    }
}
