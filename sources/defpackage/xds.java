package defpackage;

import java.io.Closeable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;

/* renamed from: xds reason: default package */
public final class xds implements Closeable {
    public final b a;
    public MessageBufferOutput b;
    public MessageBuffer c;
    public int d;
    public long e;
    private MessageBuffer f;
    private CharsetEncoder g;

    public xds(MessageBufferOutput messageBufferOutput) {
        this(messageBufferOutput, xdr.b);
    }

    private xds(MessageBufferOutput messageBufferOutput, b bVar) {
        this.a = (b) xdu.a(bVar, (Object) "config is null");
        this.b = (MessageBufferOutput) xdu.a(messageBufferOutput, (Object) "MessageBufferOutput is null");
        this.d = 0;
        this.e = 0;
    }

    private void a(byte b2, long j) {
        a(9);
        MessageBuffer messageBuffer = this.c;
        int i = this.d;
        this.d = i + 1;
        messageBuffer.putByte(i, b2);
        this.c.putLong(this.d, j);
        this.d += 8;
    }

    private xds d(int i) {
        if (i < 32) {
            a((byte) (i | -96));
        } else if (i < 256) {
            a(-39, (byte) i);
        } else if (i < 65536) {
            a(-38, (short) i);
        } else {
            a(-37, i);
        }
        return this;
    }

    public final xds a(double d2) {
        a(9);
        MessageBuffer messageBuffer = this.c;
        int i = this.d;
        this.d = i + 1;
        messageBuffer.putByte(i, -53);
        this.c.putDouble(this.d, d2);
        this.d += 8;
        return this;
    }

    public final xds a(long j) {
        if (j < -32) {
            if (j < -32768) {
                if (j < -2147483648L) {
                    a(-45, j);
                } else {
                    a(-46, (int) j);
                }
            } else if (j < -128) {
                a(-47, (short) ((int) j));
            } else {
                a(-48, (byte) ((int) j));
            }
        } else if (j < 128) {
            a((byte) ((int) j));
        } else if (j < 65536) {
            if (j < 256) {
                a(-52, (byte) ((int) j));
            } else {
                a(-51, (short) ((int) j));
            }
        } else if (j < 4294967296L) {
            a(-50, (int) j);
        } else {
            a(-49, j);
        }
        return this;
    }

    public final xds a(String str) {
        if (str.length() <= 0) {
            d(0);
            return this;
        }
        CharBuffer wrap = CharBuffer.wrap(str);
        if (this.g == null) {
            this.g = xdr.a.newEncoder().onMalformedInput(this.a.c).onUnmappableCharacter(this.a.c);
        }
        b();
        a();
        MessageBuffer messageBuffer = this.c;
        ByteBuffer byteBuffer = messageBuffer.toByteBuffer(this.d, messageBuffer.size() - this.d);
        this.g.reset();
        boolean z = false;
        while (wrap.hasRemaining()) {
            try {
                CoderResult encode = this.g.encode(wrap, byteBuffer, true);
                if (encode.isUnderflow()) {
                    encode = this.g.flush(byteBuffer);
                }
                if (encode.isOverflow()) {
                    int max = Math.max(1, (int) (((float) wrap.remaining()) * this.g.averageBytesPerChar()));
                    byteBuffer.flip();
                    double capacity = (double) byteBuffer.capacity();
                    Double.isNaN(capacity);
                    ByteBuffer allocate = ByteBuffer.allocate(Math.max((int) (capacity * 1.5d), byteBuffer.remaining() + max));
                    allocate.put(byteBuffer);
                    this.g.reset();
                    byteBuffer = allocate;
                    z = true;
                } else if (encode.isError() && ((encode.isMalformed() && this.a.c == CodingErrorAction.REPORT) || (encode.isUnmappable() && this.a.d == CodingErrorAction.REPORT))) {
                    encode.throwException();
                }
            } catch (CharacterCodingException e2) {
                throw new MessageStringCodingException(e2);
            }
        }
        byteBuffer.flip();
        int remaining = byteBuffer.remaining();
        MessageBuffer messageBuffer2 = this.c;
        if (this.f == null) {
            this.f = MessageBuffer.newBuffer(5);
        }
        this.c = this.f;
        this.d = 0;
        d(remaining);
        b();
        if (z) {
            messageBuffer2 = MessageBuffer.wrap(byteBuffer);
        }
        this.c = messageBuffer2;
        this.d = remaining;
        return this;
    }

    public final xds a(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            a(bigInteger.longValue());
        } else if (bigInteger.bitLength() == 64 && bigInteger.signum() == 1) {
            a(-49, bigInteger.longValue());
        } else {
            throw new IllegalArgumentException("MessagePack cannot serialize BigInteger larger than 2^64-1");
        }
        return this;
    }

    public final xds a(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        if (length >= this.a.f) {
            b();
            this.b.flush(MessageBuffer.wrap(bArr).slice(0, length));
            this.e += (long) length;
        } else {
            while (i < length) {
                MessageBuffer messageBuffer = this.c;
                if (messageBuffer != null && this.d >= messageBuffer.size()) {
                    b();
                }
                a();
                int min = Math.min(this.c.size() - this.d, length - i);
                this.c.putBytes(this.d, bArr, i + 0, min);
                this.d += min;
                i += min;
            }
        }
        return this;
    }

    public void a() {
        if (this.c == null) {
            this.c = this.b.next(this.a.e);
        }
    }

    public void a(byte b2) {
        a(1);
        MessageBuffer messageBuffer = this.c;
        int i = this.d;
        this.d = i + 1;
        messageBuffer.putByte(i, b2);
    }

    public void a(byte b2, byte b3) {
        a(2);
        MessageBuffer messageBuffer = this.c;
        int i = this.d;
        this.d = i + 1;
        messageBuffer.putByte(i, b2);
        MessageBuffer messageBuffer2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        messageBuffer2.putByte(i2, b3);
    }

    public void a(byte b2, int i) {
        a(5);
        MessageBuffer messageBuffer = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        messageBuffer.putByte(i2, b2);
        this.c.putInt(this.d, i);
        this.d += 4;
    }

    public void a(byte b2, short s) {
        a(3);
        MessageBuffer messageBuffer = this.c;
        int i = this.d;
        this.d = i + 1;
        messageBuffer.putByte(i, b2);
        this.c.putShort(this.d, s);
        this.d += 2;
    }

    public void a(int i) {
        MessageBuffer messageBuffer = this.c;
        if (messageBuffer == null || this.d + i >= messageBuffer.size()) {
            b();
            this.c = this.b.next(Math.max(this.a.e, i));
        }
    }

    public final xds b(int i) {
        if (i >= 0) {
            if (i < 16) {
                a((byte) (i | -112));
            } else if (i < 65536) {
                a(-36, (short) i);
            } else {
                a(-35, i);
            }
            return this;
        }
        throw new IllegalArgumentException("array size must be >= 0");
    }

    public final void b() {
        MessageBuffer messageBuffer = this.c;
        if (messageBuffer != null) {
            if (this.d == messageBuffer.size()) {
                this.b.flush(this.c);
            } else {
                this.b.flush(this.c.slice(0, this.d));
            }
            this.c = null;
            this.e += (long) this.d;
            this.d = 0;
        }
    }

    public final xds c(int i) {
        if (i >= 0) {
            if (i < 16) {
                a((byte) (i | -128));
            } else if (i < 65536) {
                a(-34, (short) i);
            } else {
                a(-33, i);
            }
            return this;
        }
        throw new IllegalArgumentException("map size must be >= 0");
    }

    public final void close() {
        try {
            b();
        } finally {
            this.b.close();
        }
    }
}
