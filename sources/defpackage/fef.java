package defpackage;

import com.google.common.hash.HashCode;
import java.nio.charset.Charset;

/* renamed from: fef reason: default package */
public abstract class fef extends feg {
    protected final fej[] a;

    protected fef(fej... fejArr) {
        for (fej a2 : fejArr) {
            fbp.a(a2);
        }
        this.a = fejArr;
    }

    private fek b(final fek[] fekArr) {
        return new fek() {
            public final HashCode a() {
                return fef.this.a(fekArr);
            }

            public final fek a(CharSequence charSequence) {
                for (fek a2 : fekArr) {
                    a2.a(charSequence);
                }
                return this;
            }

            public final fek a(CharSequence charSequence, Charset charset) {
                for (fek a2 : fekArr) {
                    a2.a(charSequence, charset);
                }
                return this;
            }

            public final fek b(byte b2) {
                for (fek b3 : fekArr) {
                    b3.b(b2);
                }
                return this;
            }

            public final fek b(byte[] bArr, int i, int i2) {
                for (fek b2 : fekArr) {
                    b2.b(bArr, i, i2);
                }
                return this;
            }
        };
    }

    /* access modifiers changed from: protected */
    public abstract HashCode a(fek[] fekArr);

    public final fek a() {
        fek[] fekArr = new fek[this.a.length];
        for (int i = 0; i < fekArr.length; i++) {
            fekArr[i] = this.a[i].a();
        }
        return b(fekArr);
    }

    public final fek a(int i) {
        fbp.a(i >= 0);
        fek[] fekArr = new fek[this.a.length];
        for (int i2 = 0; i2 < fekArr.length; i2++) {
            fekArr[i2] = this.a[i2].a(i);
        }
        return b(fekArr);
    }
}
