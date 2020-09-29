package defpackage;

import com.google.android.gms.internal.ads.zzcl;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: dkl reason: default package */
public class dkl {
    private final djc a;
    private final String b;
    private final String c;
    private final int d = 2;
    private volatile Method e = null;
    private final Class<?>[] f;
    private CountDownLatch g = new CountDownLatch(1);

    static {
        dkl.class.getSimpleName();
    }

    public dkl(djc djc, String str, String str2, Class<?>... clsArr) {
        this.a = djc;
        this.b = str;
        this.c = str2;
        this.f = clsArr;
        this.a.b.submit(new dkm(this));
    }

    private final String a(byte[] bArr, String str) {
        return new String(this.a.d.a(bArr, str), "UTF-8");
    }

    static /* synthetic */ void a(dkl dkl) {
        try {
            Class loadClass = dkl.a.c.loadClass(dkl.a(dkl.a.e, dkl.b));
            if (loadClass != null) {
                dkl.e = loadClass.getMethod(dkl.a(dkl.a.e, dkl.c), dkl.f);
                Method method = dkl.e;
            }
        } catch (zzcl | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            dkl.g.countDown();
            throw th;
        }
        dkl.g.countDown();
    }

    public final Method a() {
        if (this.e != null) {
            return this.e;
        }
        Method method = null;
        try {
            if (!this.g.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            method = this.e;
            return method;
        } catch (InterruptedException unused) {
        }
    }
}
