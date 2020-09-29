package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: cah reason: default package */
abstract class cah extends byr {
    private int a;

    protected cah(byte[] bArr) {
        bwx.b(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    /* access modifiers changed from: 0000 */
    public abstract byte[] c();

    public int hashCode() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof byq)) {
            try {
                byq byq = (byq) obj;
                if (byq.b() != hashCode()) {
                    return false;
                }
                car a2 = byq.a();
                if (a2 == null) {
                    return false;
                }
                return Arrays.equals(c(), (byte[]) cas.a(a2));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final car a() {
        return cas.a(c());
    }

    public final int b() {
        return hashCode();
    }

    protected static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
