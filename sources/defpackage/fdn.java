package defpackage;

import com.google.common.hash.HashCode;
import java.nio.charset.Charset;

/* renamed from: fdn reason: default package */
public abstract class fdn extends fdo {
    protected final fdr[] a;

    /* access modifiers changed from: protected */
    public abstract HashCode a(fds[] fdsArr);

    protected fdn(fdr... fdrArr) {
        for (fdr a2 : fdrArr) {
            fay.a(a2);
        }
        this.a = fdrArr;
    }

    public final fds a() {
        fds[] fdsArr = new fds[this.a.length];
        for (int i = 0; i < fdsArr.length; i++) {
            fdsArr[i] = this.a[i].a();
        }
        return b(fdsArr);
    }

    public final fds a(int i) {
        fay.a(i >= 0);
        fds[] fdsArr = new fds[this.a.length];
        for (int i2 = 0; i2 < fdsArr.length; i2++) {
            fdsArr[i2] = this.a[i2].a(i);
        }
        return b(fdsArr);
    }

    private fds b(final fds[] fdsArr) {
        return new fds() {
            public final fds b(byte b2) {
                for (fds b3 : fdsArr) {
                    b3.b(b2);
                }
                return this;
            }

            public final fds b(byte[] bArr, int i, int i2) {
                for (fds b2 : fdsArr) {
                    b2.b(bArr, i, i2);
                }
                return this;
            }

            public final fds a(CharSequence charSequence) {
                for (fds a2 : fdsArr) {
                    a2.a(charSequence);
                }
                return this;
            }

            public final fds a(CharSequence charSequence, Charset charset) {
                for (fds a2 : fdsArr) {
                    a2.a(charSequence, charset);
                }
                return this;
            }

            public final HashCode a() {
                return fdn.this.a(fdsArr);
            }
        };
    }
}
