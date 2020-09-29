package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import org.msgpack.core.buffer.ArrayBufferInput;
import org.msgpack.core.buffer.InputStreamBufferInput;
import org.msgpack.core.buffer.MessageBufferInput;
import org.msgpack.jackson.dataformat.MessagePackExtensionType;
import org.msgpack.value.Variable;

/* renamed from: wpr reason: default package */
public final class wpr extends ParserMinimalBase {
    private static final ThreadLocal<wps<Object, wpo>> a = new ThreadLocal<>();
    private ObjectCodec b;
    private JsonReadContext c;
    private final LinkedList<a> d;
    private wqq e;
    private Variable f;
    private boolean g;
    private long h;
    private long i;
    private final IOContext j;

    /* renamed from: wpr$a */
    static abstract class a {
        long a;

        protected a(long j) {
            this.a = j;
        }
    }

    /* renamed from: wpr$b */
    static class b extends a {
        b(long j) {
            super(j);
        }
    }

    /* renamed from: wpr$c */
    static class c extends a {
        c(long j) {
            super(j);
        }
    }

    public final void _handleEOF() {
    }

    public final int getTextOffset() {
        return 0;
    }

    public final boolean hasTextCharacters() {
        return false;
    }

    public wpr(IOContext iOContext, int i2, ObjectCodec objectCodec, InputStream inputStream) {
        this(iOContext, i2, new InputStreamBufferInput(inputStream), objectCodec, inputStream);
    }

    public wpr(IOContext iOContext, int i2, ObjectCodec objectCodec, byte[] bArr) {
        this(iOContext, i2, new ArrayBufferInput(bArr), objectCodec, bArr);
    }

    private wpr(IOContext iOContext, int i2, MessageBufferInput messageBufferInput, ObjectCodec objectCodec, Object obj) {
        wpo wpo;
        super(i2);
        this.d = new LinkedList<>();
        this.e = wrc.a();
        this.f = new Variable();
        this.b = objectCodec;
        this.j = iOContext;
        this.c = JsonReadContext.createRootContext(Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i2) ? DupDetector.rootDetector((JsonParser) this) : null);
        wps wps = (wps) a.get();
        if (wps == null) {
            wpo = new wpo(messageBufferInput);
        } else {
            if (isEnabled(Feature.AUTO_CLOSE_SOURCE) || wps.a != obj) {
                wpo wpo2 = (wpo) wps.b;
                MessageBufferInput messageBufferInput2 = (MessageBufferInput) wpp.a(messageBufferInput, (Object) "MessageBufferInput is null");
                MessageBufferInput messageBufferInput3 = wpo2.b;
                wpo2.b = messageBufferInput2;
                wpo2.c = wpo.a;
                wpo2.d = 0;
                wpo2.e = 0;
                wpo2.f = null;
                wpo2.g = false;
            }
            wpo = (wpo) wps.b;
        }
        a.set(new wps(obj, wpo));
    }

    public final ObjectCodec getCodec() {
        return this.b;
    }

    public final JsonToken nextToken() {
        JsonToken jsonToken;
        Object obj;
        wpo a2 = a();
        this.h = a2.a();
        if (this.c.inObject() || this.c.inArray()) {
            if (((a) this.d.getFirst()).a == 0) {
                this.d.pop();
                this._currToken = this.c.inObject() ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
                this.c = this.c.getParent();
                return this._currToken;
            }
        }
        Object obj2 = null;
        if (!a2.a(1)) {
            return null;
        }
        switch (a2.b().a()) {
            case NIL:
                a2.c();
                this.e = wrc.a();
                jsonToken = JsonToken.VALUE_NULL;
                break;
            case BOOLEAN:
                boolean d2 = a2.d();
                this.e = wrc.a();
                if (!this.c.inObject() || this._currToken == JsonToken.FIELD_NAME) {
                    if (!d2) {
                        jsonToken = JsonToken.VALUE_FALSE;
                        break;
                    } else {
                        jsonToken = JsonToken.VALUE_TRUE;
                        break;
                    }
                } else {
                    this.c.setCurrentName(Boolean.toString(d2));
                    jsonToken = JsonToken.FIELD_NAME;
                    break;
                }
                break;
            case INTEGER:
                this.e = a2.a(this.f);
                if (this.c.inObject() && this._currToken != JsonToken.FIELD_NAME) {
                    this.c.setCurrentName(this.e.v().toString());
                    jsonToken = JsonToken.FIELD_NAME;
                    break;
                } else {
                    jsonToken = JsonToken.VALUE_NUMBER_INT;
                    break;
                }
                break;
            case FLOAT:
                this.e = a2.a(this.f);
                if (this.c.inObject() && this._currToken != JsonToken.FIELD_NAME) {
                    this.c.setCurrentName(this.e.w().toString());
                    jsonToken = JsonToken.FIELD_NAME;
                    break;
                } else {
                    jsonToken = JsonToken.VALUE_NUMBER_FLOAT;
                    break;
                }
            case STRING:
                this.e = a2.a(this.f);
                if (this.c.inObject() && this._currToken != JsonToken.FIELD_NAME) {
                    this.c.setCurrentName(this.e.x().toString());
                    jsonToken = JsonToken.FIELD_NAME;
                    break;
                } else {
                    jsonToken = JsonToken.VALUE_STRING;
                    break;
                }
            case BINARY:
                this.e = a2.a(this.f);
                if (this.c.inObject() && this._currToken != JsonToken.FIELD_NAME) {
                    this.c.setCurrentName(this.e.x().toString());
                    jsonToken = JsonToken.FIELD_NAME;
                    break;
                } else {
                    jsonToken = JsonToken.VALUE_EMBEDDED_OBJECT;
                    break;
                }
                break;
            case ARRAY:
                this.e = wrc.a();
                obj = new b((long) a2.e());
                break;
            case MAP:
                this.e = wrc.a();
                obj = new c((long) a2.f());
                break;
            case EXTENSION:
                this.e = a2.a(this.f);
                jsonToken = JsonToken.VALUE_EMBEDDED_OBJECT;
                break;
            default:
                throw new IllegalStateException("Shouldn't reach here");
        }
        obj2 = obj;
        jsonToken = null;
        this.i = a2.a();
        if ((this.c.inObject() && jsonToken != JsonToken.FIELD_NAME) || this.c.inArray()) {
            a aVar = (a) this.d.getFirst();
            aVar.a--;
        }
        if (obj2 != null) {
            this.d.push(obj2);
            if (obj2 instanceof b) {
                jsonToken = JsonToken.START_ARRAY;
                this.c = this.c.createChildArrayContext(-1, -1);
            } else if (obj2 instanceof c) {
                jsonToken = JsonToken.START_OBJECT;
                this.c = this.c.createChildObjectContext(-1, -1);
            }
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final String getText() {
        if (this.e.n()) {
            return this.e.x().toString();
        }
        return this.e.toString();
    }

    public final char[] getTextCharacters() {
        return getText().toCharArray();
    }

    public final int getTextLength() {
        return getText().length();
    }

    public final byte[] getBinaryValue(Base64Variant base64Variant) {
        return this.e.x().a();
    }

    public final Number getNumberValue() {
        if (!this.e.l()) {
            return Double.valueOf(this.e.u().bq_());
        }
        wqk v = this.e.v();
        if (v.a()) {
            return Integer.valueOf(v.bm_());
        }
        if (v.br_()) {
            return Long.valueOf(v.bn_());
        }
        return v.bo_();
    }

    public final int getIntValue() {
        return this.e.u().bm_();
    }

    public final long getLongValue() {
        return this.e.u().bn_();
    }

    public final BigInteger getBigIntegerValue() {
        return this.e.u().bo_();
    }

    public final float getFloatValue() {
        return this.e.u().bp_();
    }

    public final double getDoubleValue() {
        return this.e.u().bq_();
    }

    public final BigDecimal getDecimalValue() {
        if (this.e.l()) {
            wqk v = this.e.v();
            if (v.br_()) {
                return BigDecimal.valueOf(v.bn_());
            }
            return new BigDecimal(v.bo_());
        } else if (this.e.m()) {
            return BigDecimal.valueOf(this.e.w().bq_());
        } else {
            StringBuilder sb = new StringBuilder("Couldn't parse value as BigDecimal. ");
            sb.append(this.e);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    public final Object getEmbeddedObject() {
        if (this.e.o()) {
            return this.e.y().a();
        }
        if (this.e.s()) {
            wpw C = this.e.C();
            return new MessagePackExtensionType(C.a(), C.bs_());
        }
        throw new UnsupportedOperationException();
    }

    public final NumberType getNumberType() {
        if (this.e.l()) {
            wqk v = this.e.v();
            if (v.a()) {
                return NumberType.INT;
            }
            if (v.br_()) {
                return NumberType.LONG;
            }
            return NumberType.BIG_INTEGER;
        }
        this.e.u();
        return NumberType.DOUBLE;
    }

    public final void close() {
        try {
            if (isEnabled(Feature.AUTO_CLOSE_SOURCE)) {
                a().close();
            }
        } finally {
            this.g = true;
        }
    }

    public final JsonStreamContext getParsingContext() {
        return this.c;
    }

    public final JsonLocation getTokenLocation() {
        Object sourceReference = this.j.getSourceReference();
        long j2 = this.h;
        JsonLocation jsonLocation = new JsonLocation(sourceReference, j2, -1, -1, (int) j2);
        return jsonLocation;
    }

    public final JsonLocation getCurrentLocation() {
        Object sourceReference = this.j.getSourceReference();
        long j2 = this.i;
        JsonLocation jsonLocation = new JsonLocation(sourceReference, j2, -1, -1, (int) j2);
        return jsonLocation;
    }

    public final String getCurrentName() {
        if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
            return this.c.getParent().getCurrentName();
        }
        return this.c.getCurrentName();
    }

    private static wpo a() {
        wps wps = (wps) a.get();
        if (wps != null) {
            return (wpo) wps.b;
        }
        throw new IllegalStateException("messageUnpacker is null");
    }
}
