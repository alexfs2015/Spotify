package com.spotify.contexts;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Sdk extends GeneratedMessageLite<Sdk, a> implements gdy {
    /* access modifiers changed from: private */
    public static final Sdk f;
    private static volatile fll<Sdk> g;
    private int d;
    private String e = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Sdk, a> implements gdy {
        private a() {
            super(Sdk.f);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(String str) {
            b();
            Sdk.a((Sdk) this.a, str);
            return this;
        }
    }

    static {
        Sdk sdk = new Sdk();
        f = sdk;
        sdk.e();
    }

    private Sdk() {
    }

    static /* synthetic */ void a(Sdk sdk, String str) {
        if (str != null) {
            sdk.d |= 1;
            sdk.e = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a k() {
        return (a) f.h();
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    public static fll<Sdk> parser() {
        return f.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Sdk();
            case IS_INITIALIZED:
                return f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Sdk sdk = (Sdk) obj2;
                this.e = fVar.a(m(), this.e, sdk.m(), sdk.e);
                if (fVar == e.a) {
                    this.d |= sdk.d;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                String c = fkw.c();
                                this.d |= 1;
                                this.e = c;
                            } else if (!a(a2, fkw)) {
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
                    synchronized (Sdk.class) {
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

    public final void a(CodedOutputStream codedOutputStream) {
        if ((this.d & 1) == 1) {
            codedOutputStream.a(1, this.e);
        }
        this.b.a(codedOutputStream);
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.d & 1) == 1) {
            i2 = 0 + CodedOutputStream.b(1, this.e);
        }
        int d2 = i2 + this.b.d();
        this.c = d2;
        return d2;
    }
}
