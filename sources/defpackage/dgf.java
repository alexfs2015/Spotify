package defpackage;

import com.google.android.gms.internal.ads.zzbfh;
import java.io.IOException;

/* renamed from: dgf reason: default package */
public abstract class dgf {
    protected volatile int Z = -1;

    static final <T extends dgf> T a(T t, byte[] bArr, int i) {
        try {
            dfx a = dfx.a(bArr, i);
            t.a(a);
            a.a(0);
            return t;
        } catch (zzbfh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    /* access modifiers changed from: protected */
    public int a() {
        return 0;
    }

    public abstract dgf a(dfx dfx);

    public void a(dfz dfz) {
    }

    /* renamed from: c */
    public dgf clone() {
        return (dgf) super.clone();
    }

    public final int d() {
        int a = a();
        this.Z = a;
        return a;
    }

    public String toString() {
        return dgg.a(this);
    }

    public static final byte[] a(dgf dgf) {
        byte[] bArr = new byte[dgf.d()];
        try {
            dfz a = dfz.a(bArr, bArr.length);
            dgf.a(a);
            if (a.a.remaining() == 0) {
                return bArr;
            }
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(a.a.remaining())}));
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }
}
