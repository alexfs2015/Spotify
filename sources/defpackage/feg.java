package defpackage;

import com.google.common.hash.HashCode;
import java.nio.charset.Charset;

/* renamed from: feg reason: default package */
public abstract class feg implements fej {
    protected feg() {
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
        fbp.a(0, i2 + 0, bArr.length);
        return a(i2).b(bArr, 0, i2).a();
    }

    public fek a(int i) {
        fbp.a(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        return a();
    }
}
