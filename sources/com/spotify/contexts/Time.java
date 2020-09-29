package com.spotify.contexts;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Time extends GeneratedMessageLite<Time, a> implements gdz {
    /* access modifiers changed from: private */
    public static final Time f;
    private static volatile fll<Time> g;
    private int d;
    private long e;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Time, a> implements gdz {
        private a() {
            super(Time.f);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(long j) {
            b();
            Time.a((Time) this.a, j);
            return this;
        }
    }

    static {
        Time time = new Time();
        f = time;
        time.e();
    }

    private Time() {
    }

    static /* synthetic */ void a(Time time, long j) {
        time.d |= 1;
        time.e = j;
    }

    public static a k() {
        return (a) f.h();
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    public static fll<Time> parser() {
        return f.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Time();
            case IS_INITIALIZED:
                return f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Time time = (Time) obj2;
                this.e = fVar.a(m(), this.e, time.m(), time.e);
                if (fVar == e.a) {
                    this.d |= time.d;
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
                    synchronized (Time.class) {
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
            i2 = 0 + CodedOutputStream.c(1, this.e);
        }
        int d2 = i2 + this.b.d();
        this.c = d2;
        return d2;
    }
}
