package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PushTokenRegistrationErrorV1 extends GeneratedMessageLite<PushTokenRegistrationErrorV1, a> implements grm {
    /* access modifiers changed from: private */
    public static final PushTokenRegistrationErrorV1 g;
    private static volatile fll<PushTokenRegistrationErrorV1> h;
    private int d;
    private long e;
    private String f = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<PushTokenRegistrationErrorV1, a> implements grm {
        private a() {
            super(PushTokenRegistrationErrorV1.g);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(long j) {
            b();
            PushTokenRegistrationErrorV1.a((PushTokenRegistrationErrorV1) this.a, j);
            return this;
        }

        public final a a(String str) {
            b();
            PushTokenRegistrationErrorV1.a((PushTokenRegistrationErrorV1) this.a, str);
            return this;
        }
    }

    static {
        PushTokenRegistrationErrorV1 pushTokenRegistrationErrorV1 = new PushTokenRegistrationErrorV1();
        g = pushTokenRegistrationErrorV1;
        pushTokenRegistrationErrorV1.e();
    }

    private PushTokenRegistrationErrorV1() {
    }

    static /* synthetic */ void a(PushTokenRegistrationErrorV1 pushTokenRegistrationErrorV1, long j) {
        pushTokenRegistrationErrorV1.d |= 1;
        pushTokenRegistrationErrorV1.e = j;
    }

    static /* synthetic */ void a(PushTokenRegistrationErrorV1 pushTokenRegistrationErrorV1, String str) {
        if (str != null) {
            pushTokenRegistrationErrorV1.d |= 2;
            pushTokenRegistrationErrorV1.f = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a k() {
        return (a) g.h();
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    private boolean n() {
        return (this.d & 2) == 2;
    }

    public static fll<PushTokenRegistrationErrorV1> parser() {
        return g.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new PushTokenRegistrationErrorV1();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                PushTokenRegistrationErrorV1 pushTokenRegistrationErrorV1 = (PushTokenRegistrationErrorV1) obj2;
                this.e = fVar.a(m(), this.e, pushTokenRegistrationErrorV1.m(), pushTokenRegistrationErrorV1.e);
                this.f = fVar.a(n(), this.f, pushTokenRegistrationErrorV1.n(), pushTokenRegistrationErrorV1.f);
                if (fVar == e.a) {
                    this.d |= pushTokenRegistrationErrorV1.d;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 8) {
                                this.d |= 1;
                                this.e = fkw.h();
                            } else if (a2 == 18) {
                                String c = fkw.c();
                                this.d |= 2;
                                this.f = c;
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
                if (h == null) {
                    synchronized (PushTokenRegistrationErrorV1.class) {
                        if (h == null) {
                            h = new b(g);
                        }
                    }
                }
                return h;
            default:
                throw new UnsupportedOperationException();
        }
        return g;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if ((this.d & 1) == 1) {
            codedOutputStream.a(1, this.e);
        }
        if ((this.d & 2) == 2) {
            codedOutputStream.a(2, this.f);
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
            i2 = 0 + CodedOutputStream.c(1, this.e);
        }
        if ((this.d & 2) == 2) {
            i2 += CodedOutputStream.b(2, this.f);
        }
        int d2 = i2 + this.b.d();
        this.c = d2;
        return d2;
    }
}
