package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.WireFormat.FieldType;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

public final class Struct extends GeneratedMessageLite<Struct, a> implements fkv {
    /* access modifiers changed from: private */
    public static final Struct e;
    private static volatile fkr<Struct> f;
    private MapFieldLite<String, Value> d = MapFieldLite.a();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Struct, a> implements fkv {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(Struct.e);
        }
    }

    static final class b {
        static final fkn<String, Value> a = fkn.a(FieldType.STRING, "", FieldType.MESSAGE, Value.p());
    }

    private Struct() {
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (Entry entry : this.d.entrySet()) {
            i2 += b.a.a(1, entry.getKey(), entry.getValue());
        }
        this.c = i2;
        return i2;
    }

    /* access modifiers changed from: protected */
    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Struct();
            case IS_INITIALIZED:
                return e;
            case MAKE_IMMUTABLE:
                this.d.isMutable = false;
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                this.d = ((f) obj).a(this.d, ((Struct) obj2).d);
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                fke fke = (fke) obj2;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                if (!this.d.isMutable) {
                                    this.d = this.d.b();
                                }
                                b.a.a(this.d, fkc, fke);
                            } else if (!fkc.b(a2)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.unfinishedMessage = this;
                        throw new RuntimeException(e2);
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.unfinishedMessage = this;
                        throw new RuntimeException(invalidProtocolBufferException);
                    }
                }
                break;
            case GET_DEFAULT_INSTANCE:
                break;
            case GET_PARSER:
                if (f == null) {
                    synchronized (Struct.class) {
                        if (f == null) {
                            f = new com.google.protobuf.GeneratedMessageLite.b(e);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return e;
    }

    static {
        Struct struct = new Struct();
        e = struct;
        struct.e();
    }

    public static Struct l() {
        return e;
    }

    public static fkr<Struct> parser() {
        return e.c();
    }

    public final Map<String, Value> k() {
        return Collections.unmodifiableMap(this.d);
    }

    public final void a(CodedOutputStream codedOutputStream) {
        for (Entry entry : this.d.entrySet()) {
            b.a.a(codedOutputStream, 1, entry.getKey(), entry.getValue());
        }
    }
}
