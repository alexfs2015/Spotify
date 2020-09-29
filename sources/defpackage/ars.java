package defpackage;

import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;

/* renamed from: ars reason: default package */
public final class ars {
    public byte[] a;
    public int[] b;
    public int[] c;
    public final CryptoInfo d;
    private byte[] e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final a j;

    /* renamed from: ars$a */
    static final class a {
        final CryptoInfo a;
        final Pattern b;

        /* synthetic */ a(CryptoInfo cryptoInfo, byte b2) {
            this(cryptoInfo);
        }

        private a(CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
            this.b = new Pattern(0, 0);
        }
    }

    public ars() {
        a aVar = null;
        this.d = bdw.a >= 16 ? new CryptoInfo() : null;
        if (bdw.a >= 24) {
            aVar = new a(this.d, 0);
        }
        this.j = aVar;
    }

    public final void a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.g = i2;
        this.b = iArr;
        this.c = iArr2;
        this.e = bArr;
        this.a = bArr2;
        this.f = i3;
        this.h = i4;
        this.i = i5;
        if (bdw.a >= 16) {
            CryptoInfo cryptoInfo = this.d;
            cryptoInfo.numSubSamples = this.g;
            cryptoInfo.numBytesOfClearData = this.b;
            cryptoInfo.numBytesOfEncryptedData = this.c;
            cryptoInfo.key = this.e;
            cryptoInfo.iv = this.a;
            cryptoInfo.mode = this.f;
            if (bdw.a >= 24) {
                a aVar = this.j;
                aVar.b.set(this.h, this.i);
                aVar.a.setPattern(aVar.b);
            }
        }
    }
}
