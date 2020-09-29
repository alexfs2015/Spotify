package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class AndroidLowMemory extends GeneratedMessageLite<AndroidLowMemory, a> implements gqp {
    /* access modifiers changed from: private */
    public static final AndroidLowMemory f;
    private static volatile fll<AndroidLowMemory> g;
    private int d;
    private int e;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<AndroidLowMemory, a> implements gqp {
        private a() {
            super(AndroidLowMemory.f);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(int i) {
            b();
            AndroidLowMemory.a((AndroidLowMemory) this.a, i);
            return this;
        }
    }

    static {
        AndroidLowMemory androidLowMemory = new AndroidLowMemory();
        f = androidLowMemory;
        androidLowMemory.e();
    }

    private AndroidLowMemory() {
    }

    static /* synthetic */ void a(AndroidLowMemory androidLowMemory, int i) {
        androidLowMemory.d |= 1;
        androidLowMemory.e = i;
    }

    public static a k() {
        return (a) f.h();
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    public static fll<AndroidLowMemory> parser() {
        return f.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new AndroidLowMemory();
            case IS_INITIALIZED:
                return f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                AndroidLowMemory androidLowMemory = (AndroidLowMemory) obj2;
                this.e = fVar.a(m(), this.e, androidLowMemory.m(), androidLowMemory.e);
                if (fVar == e.a) {
                    this.d |= androidLowMemory.d;
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
                                this.e = fkw.g();
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
                    synchronized (AndroidLowMemory.class) {
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
            codedOutputStream.b(1, this.e);
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
            i2 = 0 + CodedOutputStream.f(1, this.e);
        }
        int d2 = i2 + this.b.d();
        this.c = d2;
        return d2;
    }
}
