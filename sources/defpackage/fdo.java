package defpackage;

import com.google.common.hash.HashCode;
import java.nio.charset.Charset;

/* renamed from: fdo reason: default package */
public abstract class fdo implements fdr {
    protected fdo() {
    }

    public HashCode a(CharSequence charSequence) {
        return a(charSequence.length() << 1).a(charSequence).a();
    }

    public HashCode a(CharSequence charSequence, Charset charset) {
        return a().a(charSequence, charset).a();
    }

    public final HashCode a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public HashCode a(byte[] bArr, int i, int i2) {
        fay.a(0, i2 + 0, bArr.length);
        return a(i2).b(bArr, 0, i2).a();
    }

    public fds a(int i) {
        fay.a(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        return a();
    }
}
