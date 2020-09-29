package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/* renamed from: vzw reason: default package */
public final class vzw {
    public static final vyv a = b.a(0, 0);
    private static final vyw b = vzx.b;
    private static /* synthetic */ boolean c = (!vzw.class.desiredAssertionStatus());

    static {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        if (!c && !(a instanceof vzd)) {
            throw new AssertionError("EMPTY_BUFFER must be an EmptyByteBuf.");
        }
    }

    public static vyv a(int i) {
        return b.c(0);
    }

    public static vyv b(int i) {
        return b.d(i);
    }

    public static vyv a(byte[] bArr) {
        if (bArr.length == 0) {
            return a;
        }
        return new waa(b, bArr, bArr.length);
    }

    public static vyv a(ByteBuffer byteBuffer) {
        vyv vyv;
        if (!byteBuffer.hasRemaining()) {
            return a;
        }
        if (!byteBuffer.isDirect() && byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int remaining = byteBuffer.remaining();
            if (remaining == 0) {
                vyv = a;
            } else if (arrayOffset == 0 && remaining == array.length) {
                vyv = a(array);
            } else {
                vyv = a(array).i(arrayOffset, remaining);
            }
            return vyv.a(byteBuffer.order());
        } else if (PlatformDependent.e()) {
            if (!byteBuffer.isReadOnly()) {
                return new wac(b, byteBuffer, byteBuffer.remaining());
            }
            if (byteBuffer.isDirect()) {
                return new vzs(b, byteBuffer);
            }
            return new vzr(b, byteBuffer);
        } else if (byteBuffer.isReadOnly()) {
            return new vzr(b, byteBuffer);
        } else {
            return new vzy(b, byteBuffer, byteBuffer.remaining());
        }
    }

    public static vyv a(CharSequence charSequence, Charset charset) {
        if (charSequence != null) {
            return vza.a(b, true, CharBuffer.wrap(charSequence), charset, 0);
        }
        throw new NullPointerException("string");
    }

    public static vyv a(vyv vyv) {
        return new waf(vyv);
    }

    private vzw() {
    }
}
