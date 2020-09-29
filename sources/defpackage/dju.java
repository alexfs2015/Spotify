package defpackage;

import com.google.android.gms.internal.ads.zzcl;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: dju reason: default package */
public class dju {
    private final dil a;
    private final String b;
    private final String c;
    private final int d = 2;
    private volatile Method e = null;
    private final Class<?>[] f;
    private CountDownLatch g = new CountDownLatch(1);

    static {
        dju.class.getSimpleName();
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

    public dju(dil dil, String str, String str2, Class<?>... clsArr) {
        this.a = dil;
        this.b = str;
        this.c = str2;
        this.f = clsArr;
        this.a.b.submit(new djv(this));
    }

    private final String a(byte[] bArr, String str) {
        return new String(this.a.d.a(bArr, str), "UTF-8");
    }

    static /* synthetic */ void a(dju dju) {
        try {
            Class loadClass = dju.a.c.loadClass(dju.a(dju.a.e, dju.b));
            if (loadClass != null) {
                dju.e = loadClass.getMethod(dju.a(dju.a.e, dju.c), dju.f);
                Method method = dju.e;
            }
        } catch (zzcl | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            dju.g.countDown();
            throw th;
        }
        dju.g.countDown();
    }
}
