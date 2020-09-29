package defpackage;

import com.google.android.gms.internal.ads.zzbfh;
import java.io.IOException;

/* renamed from: dgw reason: default package */
public abstract class dgw {
    protected volatile int Z = -1;

    static final <T extends dgw> T a(T t, byte[] bArr, int i) {
        try {
            dgo a = dgo.a(bArr, i);
            t.a(a);
            a.a(0);
            return t;
        } catch (zzbfh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public static final byte[] a(dgw dgw) {
        byte[] bArr = new byte[dgw.d()];
        try {
            dgq a = dgq.a(bArr, bArr.length);
            dgw.a(a);
            if (a.a.remaining() == 0) {
                return bArr;
            }
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(a.a.remaining())}));
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* access modifiers changed from: protected */
    public int a() {
        return 0;
    }

    public abstract dgw a(dgo dgo);

    public void a(dgq dgq) {
    }

    /* renamed from: c */
    public dgw clone() {
        return (dgw) super.clone();
    }

    public final int d() {
        int a = a();
        this.Z = a;
        return a;
    }

    public String toString() {
        return dgx.a(this);
    }
}
