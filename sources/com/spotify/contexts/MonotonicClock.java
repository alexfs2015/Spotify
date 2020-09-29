package com.spotify.contexts;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class MonotonicClock extends GeneratedMessageLite<MonotonicClock, a> implements gcm {
    /* access modifiers changed from: private */
    public static final MonotonicClock g;
    private static volatile fkr<MonotonicClock> h;
    private int d;
    private long e;
    private long f;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<MonotonicClock, a> implements gcm {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(MonotonicClock.g);
        }

        public final a a(long j) {
            b();
            MonotonicClock.a((MonotonicClock) this.a, j);
            return this;
        }

        public final a b(long j) {
            b();
            MonotonicClock.b((MonotonicClock) this.a, j);
            return this;
        }
    }

    private MonotonicClock() {
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    private boolean n() {
        return (this.d & 2) == 2;
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
            i2 += CodedOutputStream.c(2, this.f);
        }
        int d2 = i2 + this.b.d();
        this.c = d2;
        return d2;
    }

    public static a k() {
        return (a) g.h();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new MonotonicClock();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                MonotonicClock monotonicClock = (MonotonicClock) obj2;
                this.e = fVar.a(m(), this.e, monotonicClock.m(), monotonicClock.e);
                this.f = fVar.a(n(), this.f, monotonicClock.n(), monotonicClock.f);
                if (fVar == e.a) {
                    this.d |= monotonicClock.d;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 8) {
                                this.d |= 1;
                                this.e = fkc.h();
                            } else if (a2 == 16) {
                                this.d |= 2;
                                this.f = fkc.h();
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
                if (h == null) {
                    synchronized (MonotonicClock.class) {
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

    static {
        MonotonicClock monotonicClock = new MonotonicClock();
        g = monotonicClock;
        monotonicClock.e();
    }

    public static fkr<MonotonicClock> parser() {
        return g.c();
    }

    static /* synthetic */ void a(MonotonicClock monotonicClock, long j) {
        monotonicClock.d |= 1;
        monotonicClock.e = j;
    }

    static /* synthetic */ void b(MonotonicClock monotonicClock, long j) {
        monotonicClock.d |= 2;
        monotonicClock.f = j;
    }
}
