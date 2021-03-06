package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzu;
import java.util.Collections;
import java.util.Map;

/* renamed from: dwe reason: default package */
public abstract class dwe<T> implements Comparable<dwe<T>> {
    final int a;
    final String b;
    final int c;
    final Object d;
    edc e;
    Integer f;
    eab g;
    boolean h;
    ccs i;
    dho j;
    /* access modifiers changed from: private */
    public final a k;
    private boolean l;
    private boolean m;
    private boolean n;
    private dyb o;

    public dwe(int i2, String str, edc edc) {
        this.k = a.a ? new a() : null;
        this.d = new Object();
        this.h = true;
        int i3 = 0;
        this.l = false;
        this.m = false;
        this.n = false;
        this.j = null;
        this.a = i2;
        this.b = str;
        this.e = edc;
        this.i = new dmo();
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    i3 = host.hashCode();
                }
            }
        }
        this.c = i3;
    }

    /* access modifiers changed from: protected */
    public abstract ecb<T> a(dud dud);

    /* access modifiers changed from: 0000 */
    public final void a(dyb dyb) {
        synchronized (this.d) {
            this.o = dyb;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(ecb<?> ecb) {
        dyb dyb;
        synchronized (this.d) {
            dyb = this.o;
        }
        if (dyb != null) {
            dyb.a(this, ecb);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public byte[] a() {
        return null;
    }

    public Map<String, String> b() {
        return Collections.emptyMap();
    }

    public final void b(String str) {
        if (a.a) {
            this.k.a(str, Thread.currentThread().getId());
        }
    }

    public final int c() {
        return this.i.a();
    }

    /* access modifiers changed from: 0000 */
    public final void c(String str) {
        eab eab = this.g;
        if (eab != null) {
            eab.b(this);
        }
        if (a.a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new dxd(this, str, id));
            } else {
                this.k.a(str, id);
                this.k.a(toString());
            }
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        dwe dwe = (dwe) obj;
        zzu zzu = zzu.NORMAL;
        zzu zzu2 = zzu.NORMAL;
        return zzu == zzu2 ? this.f.intValue() - dwe.f.intValue() : zzu2.ordinal() - zzu.ordinal();
    }

    public final void d() {
        synchronized (this.d) {
            this.m = true;
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this.d) {
            z = this.m;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public final void f() {
        dyb dyb;
        synchronized (this.d) {
            dyb = this.o;
        }
        if (dyb != null) {
            dyb.a(this);
        }
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.c));
        String str = "0x";
        String concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        String str2 = "[ ] ";
        String str3 = this.b;
        String valueOf2 = String.valueOf(zzu.NORMAL);
        String valueOf3 = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(str2.length() + 3 + String.valueOf(str3).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(str2);
        sb.append(str3);
        String str4 = " ";
        sb.append(str4);
        sb.append(concat);
        sb.append(str4);
        sb.append(valueOf2);
        sb.append(str4);
        sb.append(valueOf3);
        return sb.toString();
    }
}
