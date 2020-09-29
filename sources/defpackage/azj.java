package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* renamed from: azj reason: default package */
public abstract class azj extends arx<azo, azp, SubtitleDecoderException> implements azm {
    private final String c;

    /* access modifiers changed from: protected */
    public abstract azl a(byte[] bArr, int i, boolean z);

    public final void a(long j) {
    }

    public final /* bridge */ /* synthetic */ void a(arw arw) {
        super.a((azp) arw);
    }

    protected azj(String str) {
        super(new azo[2], new azp[2]);
        this.c = str;
        bcu.b(this.b == this.a.length);
        for (I c2 : this.a) {
            c2.c(1024);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(azp azp) {
        super.a(azp);
    }

    /* access modifiers changed from: private */
    public SubtitleDecoderException a(azo azo, azp azp, boolean z) {
        try {
            ByteBuffer byteBuffer = azo.c;
            azp azp2 = azp;
            azp2.a(azo.d, a(byteBuffer.array(), byteBuffer.limit(), z), azo.f);
            azp.a &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    public final /* synthetic */ Exception a(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    public final /* synthetic */ arw g() {
        return new azk(this);
    }

    public final /* synthetic */ arv f() {
        return new azo();
    }
}
