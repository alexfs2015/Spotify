package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.GeneratorBase;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;
import org.msgpack.core.buffer.OutputStreamBufferOutput;
import org.msgpack.jackson.dataformat.MessagePackExtensionType;

/* renamed from: xdv reason: default package */
public final class xdv extends GeneratorBase {
    private static ThreadLocal<xds> a = new ThreadLocal<>();
    private static ThreadLocal<OutputStreamBufferOutput> b = new ThreadLocal<>();
    private LinkedList<a> c;
    private a d;

    /* renamed from: xdv$a */
    static abstract class a {
        protected List<String> a;
        private List<Object> b;

        private a() {
            this.a = new ArrayList();
            this.b = new ArrayList();
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public abstract List<String> a();

        /* access modifiers changed from: 0000 */
        public final void a(Object obj) {
            this.b.add(obj);
        }

        /* access modifiers changed from: 0000 */
        public abstract void a(String str);

        /* access modifiers changed from: 0000 */
        public final List<Object> b() {
            return this.b;
        }
    }

    /* renamed from: xdv$b */
    static class b extends a {
        private b() {
            super(0);
        }

        /* synthetic */ b(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public final List<String> a() {
            throw new IllegalStateException("This method shouldn't be called");
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str) {
            throw new IllegalStateException("This method shouldn't be called");
        }
    }

    /* renamed from: xdv$c */
    static class c extends a {
        private c() {
            super(0);
        }

        /* synthetic */ c(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public final List<String> a() {
            return this.a;
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str) {
            this.a.add(str);
        }
    }

    static {
        Charset.forName("UTF-8");
    }

    public xdv(int i, ObjectCodec objectCodec, OutputStream outputStream) {
        super(i, objectCodec);
        xds xds = (xds) a.get();
        OutputStreamBufferOutput outputStreamBufferOutput = (OutputStreamBufferOutput) b.get();
        if (outputStreamBufferOutput == null) {
            outputStreamBufferOutput = new OutputStreamBufferOutput(outputStream);
        } else {
            outputStreamBufferOutput.reset(outputStream);
        }
        b.set(outputStreamBufferOutput);
        if (xds == null) {
            xds = new xds(outputStreamBufferOutput);
        } else {
            MessageBufferOutput messageBufferOutput = (MessageBufferOutput) xdu.a(outputStreamBufferOutput, (Object) "MessageBufferOutput is null");
            MessageBufferOutput messageBufferOutput2 = xds.b;
            xds.b = messageBufferOutput;
            xds.d = 0;
            xds.e = 0;
        }
        a.set(xds);
        this.c = new LinkedList<>();
    }

    private void a() {
        d().b();
    }

    private void a(b bVar) {
        List b2 = bVar.b();
        d().b(b2.size());
        for (int i = 0; i < b2.size(); i++) {
            b(b2.get(i));
        }
    }

    private void a(c cVar) {
        List a2 = cVar.a();
        List b2 = cVar.b();
        xds d2 = d();
        d2.c(a2.size());
        for (int i = 0; i < a2.size(); i++) {
            d2.a((String) a2.get(i));
            b(b2.get(i));
        }
    }

    private a b() {
        if (!this.c.isEmpty()) {
            return (a) this.c.getFirst();
        }
        throw new IllegalStateException("The stack is empty");
    }

    private void b(Object obj) {
        xds d2 = d();
        if (obj == null) {
            d2.a(-64);
        } else if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            if (intValue < -32) {
                if (intValue < -32768) {
                    d2.a(-46, intValue);
                } else if (intValue < -128) {
                    d2.a(-47, (short) intValue);
                } else {
                    d2.a(-48, (byte) intValue);
                }
            } else if (intValue < 128) {
                d2.a((byte) intValue);
            } else if (intValue < 256) {
                d2.a(-52, (byte) intValue);
            } else if (intValue < 65536) {
                d2.a(-51, (short) intValue);
            } else {
                d2.a(-50, intValue);
            }
        } else if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            int limit = byteBuffer.limit();
            if (limit < 256) {
                d2.a(-60, (byte) limit);
            } else if (limit < 65536) {
                d2.a(-59, (short) limit);
            } else {
                d2.a(-58, limit);
            }
            int remaining = byteBuffer.remaining();
            if (remaining >= d2.a.f) {
                d2.b();
                d2.b.flush(MessageBuffer.wrap(byteBuffer));
                byteBuffer.position(byteBuffer.limit());
                d2.e += (long) remaining;
            } else {
                while (byteBuffer.remaining() > 0) {
                    if (d2.d >= d2.c.size()) {
                        d2.b();
                    }
                    d2.a();
                    int min = Math.min(d2.c.size() - d2.d, byteBuffer.remaining());
                    d2.c.putByteBuffer(d2.d, byteBuffer, min);
                    d2.d += min;
                }
            }
        } else if (obj instanceof String) {
            d2.a((String) obj);
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            d2.a(5);
            MessageBuffer messageBuffer = d2.c;
            int i = d2.d;
            d2.d = i + 1;
            messageBuffer.putByte(i, -54);
            d2.c.putFloat(d2.d, floatValue);
            d2.d += 4;
        } else if (obj instanceof Long) {
            d2.a(((Long) obj).longValue());
        } else if (obj instanceof c) {
            a((c) obj);
        } else if (obj instanceof b) {
            a((b) obj);
        } else if (obj instanceof Double) {
            d2.a(((Double) obj).doubleValue());
        } else if (obj instanceof BigInteger) {
            d2.a((BigInteger) obj);
        } else {
            boolean z = true;
            if (obj instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                xds d3 = d();
                try {
                    d3.a(bigDecimal.toBigIntegerExact());
                    z = false;
                } catch (ArithmeticException | IllegalArgumentException unused) {
                }
                if (z) {
                    double doubleValue = bigDecimal.doubleValue();
                    if (bigDecimal.stripTrailingZeros().toEngineeringString().equals(BigDecimal.valueOf(doubleValue).toEngineeringString())) {
                        d3.a(doubleValue);
                    } else {
                        StringBuilder sb = new StringBuilder("MessagePack cannot serialize a BigDecimal that can't be represented as double. ");
                        sb.append(bigDecimal);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } else if (obj instanceof Boolean) {
                d2.a(((Boolean) obj).booleanValue() ? (byte) -61 : -62);
            } else if (obj instanceof MessagePackExtensionType) {
                MessagePackExtensionType messagePackExtensionType = (MessagePackExtensionType) obj;
                byte[] bArr = messagePackExtensionType.b;
                byte b2 = messagePackExtensionType.a;
                int length = bArr.length;
                if (length < 256) {
                    if (length <= 0 || ((length - 1) & length) != 0) {
                        d2.a(-57, (byte) length);
                        d2.a(b2);
                    } else if (length == 1) {
                        d2.a(-44, b2);
                    } else if (length == 2) {
                        d2.a(-43, b2);
                    } else if (length == 4) {
                        d2.a(-42, b2);
                    } else if (length == 8) {
                        d2.a(-41, b2);
                    } else if (length == 16) {
                        d2.a(-40, b2);
                    } else {
                        d2.a(-57, (byte) length);
                        d2.a(b2);
                    }
                } else if (length < 65536) {
                    d2.a(-56, (short) length);
                    d2.a(b2);
                } else {
                    d2.a(-55, length);
                    d2.a(b2);
                }
                d2.a(bArr);
            } else {
                throw new IllegalArgumentException(obj.toString());
            }
        }
    }

    private void c() {
        a aVar = (a) this.c.pop();
        if (this.c.size() > 0) {
            a((Object) aVar);
        } else if (this.d == null) {
            this.d = aVar;
        } else {
            throw new IllegalStateException("rootStackItem is not null");
        }
    }

    private static xds d() {
        xds xds = (xds) a.get();
        if (xds != null) {
            return xds;
        }
        throw new IllegalStateException("messagePacker is null");
    }

    public final void _verifyValueWrite(String str) {
        if (this._writeContext.writeValue() == 5) {
            StringBuilder sb = new StringBuilder("Can not ");
            sb.append(str);
            sb.append(", expecting field name");
            _reportError(sb.toString());
        }
    }

    public void a(Object obj) {
        if (this.c.isEmpty()) {
            b(obj);
            a();
            return;
        }
        b().a(obj);
    }

    public final void close() {
        try {
            flush();
        } finally {
            if (isEnabled(Feature.AUTO_CLOSE_TARGET)) {
                d().close();
            }
        }
    }

    public final void flush() {
        a aVar = this.d;
        if (aVar != null) {
            if (aVar instanceof c) {
                a((c) aVar);
            } else if (aVar instanceof b) {
                a((b) aVar);
            } else {
                StringBuilder sb = new StringBuilder("Unexpected rootStackItem: ");
                sb.append(this.d);
                throw new IllegalStateException(sb.toString());
            }
            this.d = null;
            a();
        }
    }

    public final void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        a((Object) ByteBuffer.wrap(bArr, i, i2));
    }

    public final void writeBoolean(boolean z) {
        a((Object) Boolean.valueOf(z));
    }

    public final void writeEndArray() {
        if (!this._writeContext.inArray()) {
            StringBuilder sb = new StringBuilder("Current context not an array but ");
            sb.append(this._writeContext.getTypeDesc());
            _reportError(sb.toString());
        }
        a b2 = b();
        if (b2 instanceof b) {
            b bVar = (b) b2;
            this._writeContext = this._writeContext.getParent();
            c();
            return;
        }
        StringBuilder sb2 = new StringBuilder("The stack top should be Array: ");
        sb2.append(b2);
        throw new IllegalStateException(sb2.toString());
    }

    public final void writeEndObject() {
        if (!this._writeContext.inObject()) {
            StringBuilder sb = new StringBuilder("Current context not an object but ");
            sb.append(this._writeContext.getTypeDesc());
            _reportError(sb.toString());
        }
        a b2 = b();
        if (b2 instanceof c) {
            c cVar = (c) b2;
            if (cVar.a().size() == cVar.b().size()) {
                this._writeContext = this._writeContext.getParent();
                c();
                return;
            }
            throw new IllegalStateException(String.format("objectKeys.size() and objectValues.size() is not same: depth=%d, key=%d, value=%d", new Object[]{Integer.valueOf(this.c.size()), Integer.valueOf(cVar.a().size()), Integer.valueOf(cVar.b().size())}));
        }
        StringBuilder sb2 = new StringBuilder("The stack top should be Object: ");
        sb2.append(b2);
        throw new IllegalStateException(sb2.toString());
    }

    public final void writeFieldName(String str) {
        b().a(str);
    }

    public final void writeNull() {
        a((Object) null);
    }

    public final void writeNumber(double d2) {
        a((Object) Double.valueOf(d2));
    }

    public final void writeNumber(float f) {
        a((Object) Float.valueOf(f));
    }

    public final void writeNumber(int i) {
        a((Object) Integer.valueOf(i));
    }

    public final void writeNumber(long j) {
        a((Object) Long.valueOf(j));
    }

    public final void writeNumber(String str) {
        throw new UnsupportedOperationException("writeNumber(String encodedValue) isn't supported yet");
    }

    public final void writeNumber(BigDecimal bigDecimal) {
        a((Object) bigDecimal);
    }

    public final void writeNumber(BigInteger bigInteger) {
        a((Object) bigInteger);
    }

    public final void writeRaw(char c2) {
        a((Object) String.valueOf(c2));
    }

    public final void writeRaw(String str) {
        a((Object) str);
    }

    public final void writeRaw(char[] cArr, int i, int i2) {
        a((Object) new String(cArr, i, i2));
    }

    public final void writeStartArray() {
        this._writeContext = this._writeContext.createChildArrayContext();
        this.c.push(new b(0));
    }

    public final void writeStartObject() {
        this._writeContext = this._writeContext.createChildObjectContext();
        this.c.push(new c(0));
    }

    public final void writeString(String str) {
        a((Object) str);
    }

    public final void writeString(char[] cArr, int i, int i2) {
        a((Object) new String(cArr, i, i2));
    }
}
