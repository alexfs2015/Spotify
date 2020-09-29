package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* renamed from: baa reason: default package */
public abstract class baa extends aso<baf, bag, SubtitleDecoderException> implements bad {
    private final String c;

    protected baa(String str) {
        super(new baf[2], new bag[2]);
        this.c = str;
        bdl.b(this.b == this.a.length);
        for (I c2 : this.a) {
            c2.c(1024);
        }
    }

    /* access modifiers changed from: private */
    public SubtitleDecoderException a(baf baf, bag bag, boolean z) {
        try {
            ByteBuffer byteBuffer = baf.c;
            bag bag2 = bag;
            bag2.a(baf.d, a(byteBuffer.array(), byteBuffer.limit(), z), baf.f);
            bag.a &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    /* access modifiers changed from: protected */
    public abstract bac a(byte[] bArr, int i, boolean z);

    public final /* synthetic */ Exception a(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    public final void a(long j) {
    }

    public final /* bridge */ /* synthetic */ void a(asn asn) {
        super.a((bag) asn);
    }

    /* access modifiers changed from: protected */
    public final void a(bag bag) {
        super.a(bag);
    }

    public final /* synthetic */ asm f() {
        return new baf();
    }

    public final /* synthetic */ asn g() {
        return new bab(this);
    }
}
