package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: dmh reason: default package */
final class dmh {
    private ByteArrayOutputStream a = new ByteArrayOutputStream(4096);
    private Base64OutputStream b = new Base64OutputStream(this.a, 10);

    public final void a(byte[] bArr) {
        this.b.write(bArr);
    }

    public final String toString() {
        String str;
        String str2 = "HashManager: Unable to convert to Base64.";
        try {
            this.b.close();
        } catch (IOException e) {
            clu.a(str2, e);
        }
        try {
            this.a.close();
            str = this.a.toString();
        } catch (IOException e2) {
            clu.a(str2, e2);
            str = "";
        } catch (Throwable th) {
            this.a = null;
            this.b = null;
            throw th;
        }
        this.a = null;
        this.b = null;
        return str;
    }
}
