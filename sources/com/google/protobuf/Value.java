package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import java.io.IOException;

public final class Value extends GeneratedMessageLite<Value, a> implements fkz {
    /* access modifiers changed from: private */
    public static final Value f;
    private static volatile fkr<Value> g;
    public int d = 0;
    private Object e;

    public enum KindCase implements b {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);
        
        private final int value;

        private KindCase(int i) {
            this.value = i;
        }

        public static KindCase a(int i) {
            switch (i) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        public final int a() {
            return this.value;
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Value, a> implements fkz {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(Value.f);
        }
    }

    private Value() {
    }

    public final double k() {
        if (this.d == 2) {
            return ((Double) this.e).doubleValue();
        }
        return 0.0d;
    }

    public final String l() {
        return this.d == 3 ? (String) this.e : "";
    }

    public final boolean m() {
        if (this.d == 4) {
            return ((Boolean) this.e).booleanValue();
        }
        return false;
    }

    public final Struct n() {
        if (this.d == 5) {
            return (Struct) this.e;
        }
        return Struct.l();
    }

    public final ListValue o() {
        if (this.d == 6) {
            return (ListValue) this.e;
        }
        return ListValue.k();
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (this.d == 1) {
            codedOutputStream.b(1, ((Integer) this.e).intValue());
        }
        if (this.d == 2) {
            codedOutputStream.a(2, ((Double) this.e).doubleValue());
        }
        if (this.d == 3) {
            codedOutputStream.a(3, l());
        }
        if (this.d == 4) {
            codedOutputStream.a(4, ((Boolean) this.e).booleanValue());
        }
        if (this.d == 5) {
            codedOutputStream.a(5, (fko) (Struct) this.e);
        }
        if (this.d == 6) {
            codedOutputStream.a(6, (fko) (ListValue) this.e);
        }
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.d == 1) {
            i2 = 0 + CodedOutputStream.j(1, ((Integer) this.e).intValue());
        }
        if (this.d == 2) {
            i2 += CodedOutputStream.b(2, ((Double) this.e).doubleValue());
        }
        if (this.d == 3) {
            i2 += CodedOutputStream.b(3, l());
        }
        if (this.d == 4) {
            i2 += CodedOutputStream.b(4, ((Boolean) this.e).booleanValue());
        }
        if (this.d == 5) {
            i2 += CodedOutputStream.b(5, (fko) (Struct) this.e);
        }
        if (this.d == 6) {
            i2 += CodedOutputStream.b(6, (fko) (ListValue) this.e);
        }
        this.c = i2;
        return i2;
    }

    /* access modifiers changed from: protected */
    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Value();
            case IS_INITIALIZED:
                return f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Value value = (Value) obj2;
                switch (KindCase.a(value.d)) {
                    case NULL_VALUE:
                        if (this.d == 1) {
                            z = true;
                        }
                        this.e = fVar.b(z, this.e, value.e);
                        break;
                    case NUMBER_VALUE:
                        if (this.d == 2) {
                            z = true;
                        }
                        this.e = fVar.c(z, this.e, value.e);
                        break;
                    case STRING_VALUE:
                        if (this.d == 3) {
                            z = true;
                        }
                        this.e = fVar.d(z, this.e, value.e);
                        break;
                    case BOOL_VALUE:
                        if (this.d == 4) {
                            z = true;
                        }
                        this.e = fVar.a(z, this.e, value.e);
                        break;
                    case STRUCT_VALUE:
                        if (this.d == 5) {
                            z = true;
                        }
                        this.e = fVar.e(z, this.e, value.e);
                        break;
                    case LIST_VALUE:
                        if (this.d == 6) {
                            z = true;
                        }
                        this.e = fVar.e(z, this.e, value.e);
                        break;
                    case KIND_NOT_SET:
                        if (this.d != 0) {
                            z = true;
                        }
                        fVar.a(z);
                        break;
                }
                if (fVar == e.a) {
                    int i = value.d;
                    if (i != 0) {
                        this.d = i;
                    }
                }
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                fke fke = (fke) obj2;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 8) {
                                int g2 = fkc.g();
                                this.d = 1;
                                this.e = Integer.valueOf(g2);
                            } else if (a2 == 17) {
                                this.d = 2;
                                this.e = Double.valueOf(Double.longBitsToDouble(fkc.j()));
                            } else if (a2 == 26) {
                                String d2 = fkc.d();
                                this.d = 3;
                                this.e = d2;
                            } else if (a2 == 32) {
                                this.d = 4;
                                this.e = Boolean.valueOf(fkc.b());
                            } else if (a2 == 42) {
                                com.google.protobuf.Struct.a aVar = this.d == 5 ? (com.google.protobuf.Struct.a) ((Struct) this.e).h() : null;
                                this.e = fkc.a(Struct.parser(), fke);
                                if (aVar != null) {
                                    aVar.a((Struct) this.e);
                                    this.e = aVar.e();
                                }
                                this.d = 5;
                            } else if (a2 == 50) {
                                com.google.protobuf.ListValue.a aVar2 = this.d == 6 ? (com.google.protobuf.ListValue.a) ((ListValue) this.e).h() : null;
                                this.e = fkc.a(ListValue.parser(), fke);
                                if (aVar2 != null) {
                                    aVar2.a((ListValue) this.e);
                                    this.e = aVar2.e();
                                }
                                this.d = 6;
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
                if (g == null) {
                    synchronized (Value.class) {
                        if (g == null) {
                            g = new b(f);
                        }
                    }
                }
                return g;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    static {
        Value value = new Value();
        f = value;
        value.e();
    }

    public static Value p() {
        return f;
    }

    public static fkr<Value> parser() {
        return f.c();
    }
}
