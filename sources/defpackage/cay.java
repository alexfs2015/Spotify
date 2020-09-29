package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: cay reason: default package */
abstract class cay extends bzi {
    private int a;

    protected cay(byte[] bArr) {
        bxo.b(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    protected static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final cbi a() {
        return cbj.a(c());
    }

    public final int b() {
        return hashCode();
    }

    /* access modifiers changed from: 0000 */
    public abstract byte[] c();

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof bzh)) {
            try {
                bzh bzh = (bzh) obj;
                if (bzh.b() != hashCode()) {
                    return false;
                }
                cbi a2 = bzh.a();
                if (a2 == null) {
                    return false;
                }
                return Arrays.equals(c(), (byte[]) cbj.a(a2));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }
}
