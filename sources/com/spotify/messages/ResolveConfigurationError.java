package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class ResolveConfigurationError extends GeneratedMessageLite<ResolveConfigurationError, a> implements gpo {
    /* access modifiers changed from: private */
    public static final ResolveConfigurationError i;
    private static volatile fkr<ResolveConfigurationError> j;
    private int d;
    private String e;
    private long f;
    private String g;
    private String h;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ResolveConfigurationError, a> implements gpo {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(ResolveConfigurationError.i);
        }

        public final a a(String str) {
            b();
            ResolveConfigurationError.a((ResolveConfigurationError) this.a, str);
            return this;
        }

        public final a a(long j) {
            b();
            ResolveConfigurationError.a((ResolveConfigurationError) this.a, j);
            return this;
        }

        public final a b(String str) {
            b();
            ResolveConfigurationError.b((ResolveConfigurationError) this.a, str);
            return this;
        }

        public final a c(String str) {
            b();
            ResolveConfigurationError.c((ResolveConfigurationError) this.a, str);
            return this;
        }
    }

    private ResolveConfigurationError() {
        String str = "";
        this.e = str;
        this.g = str;
        this.h = str;
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    private boolean n() {
        return (this.d & 2) == 2;
    }

    private boolean o() {
        return (this.d & 4) == 4;
    }

    private boolean p() {
        return (this.d & 8) == 8;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if ((this.d & 1) == 1) {
            codedOutputStream.a(1, this.e);
        }
        if ((this.d & 2) == 2) {
            codedOutputStream.a(2, this.f);
        }
        if ((this.d & 4) == 4) {
            codedOutputStream.a(3, this.g);
        }
        if ((this.d & 8) == 8) {
            codedOutputStream.a(4, this.h);
        }
        this.b.a(codedOutputStream);
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.d & 1) == 1) {
            i3 = 0 + CodedOutputStream.b(1, this.e);
        }
        if ((this.d & 2) == 2) {
            i3 += CodedOutputStream.c(2, this.f);
        }
        if ((this.d & 4) == 4) {
            i3 += CodedOutputStream.b(3, this.g);
        }
        if ((this.d & 8) == 8) {
            i3 += CodedOutputStream.b(4, this.h);
        }
        int d2 = i3 + this.b.d();
        this.c = d2;
        return d2;
    }

    public static a k() {
        return (a) i.h();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new ResolveConfigurationError();
            case IS_INITIALIZED:
                return i;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                ResolveConfigurationError resolveConfigurationError = (ResolveConfigurationError) obj2;
                this.e = fVar.a(m(), this.e, resolveConfigurationError.m(), resolveConfigurationError.e);
                this.f = fVar.a(n(), this.f, resolveConfigurationError.n(), resolveConfigurationError.f);
                this.g = fVar.a(o(), this.g, resolveConfigurationError.o(), resolveConfigurationError.g);
                this.h = fVar.a(p(), this.h, resolveConfigurationError.p(), resolveConfigurationError.h);
                if (fVar == e.a) {
                    this.d |= resolveConfigurationError.d;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                String c = fkc.c();
                                this.d |= 1;
                                this.e = c;
                            } else if (a2 == 16) {
                                this.d |= 2;
                                this.f = fkc.h();
                            } else if (a2 == 26) {
                                String c2 = fkc.c();
                                this.d |= 4;
                                this.g = c2;
                            } else if (a2 == 34) {
                                String c3 = fkc.c();
                                this.d |= 8;
                                this.h = c3;
                            } else if (!a(a2, fkc)) {
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
                if (j == null) {
                    synchronized (ResolveConfigurationError.class) {
                        if (j == null) {
                            j = new b(i);
                        }
                    }
                }
                return j;
            default:
                throw new UnsupportedOperationException();
        }
        return i;
    }

    static {
        ResolveConfigurationError resolveConfigurationError = new ResolveConfigurationError();
        i = resolveConfigurationError;
        resolveConfigurationError.e();
    }

    public static fkr<ResolveConfigurationError> parser() {
        return i.c();
    }

    static /* synthetic */ void a(ResolveConfigurationError resolveConfigurationError, String str) {
        if (str != null) {
            resolveConfigurationError.d |= 1;
            resolveConfigurationError.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void a(ResolveConfigurationError resolveConfigurationError, long j2) {
        resolveConfigurationError.d |= 2;
        resolveConfigurationError.f = j2;
    }

    static /* synthetic */ void b(ResolveConfigurationError resolveConfigurationError, String str) {
        if (str != null) {
            resolveConfigurationError.d |= 4;
            resolveConfigurationError.g = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void c(ResolveConfigurationError resolveConfigurationError, String str) {
        if (str != null) {
            resolveConfigurationError.d |= 8;
            resolveConfigurationError.h = str;
            return;
        }
        throw new NullPointerException();
    }
}
