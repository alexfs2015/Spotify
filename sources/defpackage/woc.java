package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/* renamed from: woc reason: default package */
public final class woc {
    public static final wnb a = b.a(0, 0);
    private static final wnc b = wod.b;
    private static /* synthetic */ boolean c = (!woc.class.desiredAssertionStatus());

    static {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        if (!c && !(a instanceof wnj)) {
            throw new AssertionError("EMPTY_BUFFER must be an EmptyByteBuf.");
        }
    }

    private woc() {
    }

    public static wnb a(int i) {
        return b.c(0);
    }

    public static wnb a(CharSequence charSequence, Charset charset) {
        if (charSequence != null) {
            return wng.a(b, true, CharBuffer.wrap(charSequence), charset, 0);
        }
        throw new NullPointerException("string");
    }

    public static wnb a(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return a;
        }
        if (byteBuffer.isDirect() || !byteBuffer.hasArray()) {
            return PlatformDependent.e() ? byteBuffer.isReadOnly() ? byteBuffer.isDirect() ? new wny(b, byteBuffer) : new wnx(b, byteBuffer) : new woi(b, byteBuffer, byteBuffer.remaining()) : byteBuffer.isReadOnly() ? new wnx(b, byteBuffer) : new woe(b, byteBuffer, byteBuffer.remaining());
        }
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int remaining = byteBuffer.remaining();
        wnb wnb = remaining == 0 ? a : (arrayOffset == 0 && remaining == array.length) ? a(array) : a(array).i(arrayOffset, remaining);
        return wnb.a(byteBuffer.order());
    }

    public static wnb a(wnb wnb) {
        return new wol(wnb);
    }

    public static wnb a(byte[] bArr) {
        return bArr.length == 0 ? a : new wog(b, bArr, bArr.length);
    }

    public static wnb b(int i) {
        return b.d(i);
    }
}
