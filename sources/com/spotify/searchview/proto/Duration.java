package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Duration extends GeneratedMessageLite<Duration, a> implements vwk {
    /* access modifiers changed from: private */
    public static final Duration f;
    private static volatile fll<Duration> g;
    public long d;
    private int e;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Duration, a> implements vwk {
        private a() {
            super(Duration.f);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Duration duration = new Duration();
        f = duration;
        duration.e();
    }

    private Duration() {
    }

    public static Duration k() {
        return f;
    }

    public static fll<Duration> parser() {
        return f.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = true;
        boolean z2 = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Duration();
            case IS_INITIALIZED:
                return f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Duration duration = (Duration) obj2;
                this.d = fVar.a(this.d != 0, this.d, duration.d != 0, duration.d);
                boolean z3 = this.e != 0;
                int i = this.e;
                if (duration.e == 0) {
                    z = false;
                }
                this.e = fVar.a(z3, i, z, duration.e);
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                while (!z2) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 8) {
                                this.d = fkw.h();
                            } else if (a2 == 16) {
                                this.e = fkw.g();
                            } else if (!fkw.b(a2)) {
                            }
                        }
                        z2 = true;
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
                    synchronized (Duration.class) {
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
        long j = this.d;
        if (j != 0) {
            codedOutputStream.a(1, j);
        }
        int i = this.e;
        if (i != 0) {
            codedOutputStream.b(2, i);
        }
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        long j = this.d;
        int i2 = 0;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.c(1, j);
        }
        int i3 = this.e;
        if (i3 != 0) {
            i2 += CodedOutputStream.f(2, i3);
        }
        this.c = i2;
        return i2;
    }
}
