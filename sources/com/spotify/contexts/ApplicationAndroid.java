package com.spotify.contexts;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class ApplicationAndroid extends GeneratedMessageLite<ApplicationAndroid, a> implements gdt {
    /* access modifiers changed from: private */
    public static final ApplicationAndroid g;
    private static volatile fll<ApplicationAndroid> h;
    private int d;
    private String e = "";
    private long f;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ApplicationAndroid, a> implements gdt {
        private a() {
            super(ApplicationAndroid.g);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(long j) {
            b();
            ApplicationAndroid.a((ApplicationAndroid) this.a, j);
            return this;
        }

        public final a a(String str) {
            b();
            ApplicationAndroid.a((ApplicationAndroid) this.a, str);
            return this;
        }
    }

    static {
        ApplicationAndroid applicationAndroid = new ApplicationAndroid();
        g = applicationAndroid;
        applicationAndroid.e();
    }

    private ApplicationAndroid() {
    }

    static /* synthetic */ void a(ApplicationAndroid applicationAndroid, long j) {
        applicationAndroid.d |= 2;
        applicationAndroid.f = j;
    }

    static /* synthetic */ void a(ApplicationAndroid applicationAndroid, String str) {
        if (str != null) {
            applicationAndroid.d |= 1;
            applicationAndroid.e = str;
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

    public static fll<ApplicationAndroid> parser() {
        return g.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new ApplicationAndroid();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                ApplicationAndroid applicationAndroid = (ApplicationAndroid) obj2;
                this.e = fVar.a(m(), this.e, applicationAndroid.m(), applicationAndroid.e);
                this.f = fVar.a(n(), this.f, applicationAndroid.n(), applicationAndroid.f);
                if (fVar == e.a) {
                    this.d |= applicationAndroid.d;
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
                            } else if (a2 == 16) {
                                this.d |= 2;
                                this.f = fkw.h();
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
                    synchronized (ApplicationAndroid.class) {
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
            i2 = 0 + CodedOutputStream.b(1, this.e);
        }
        if ((this.d & 2) == 2) {
            i2 += CodedOutputStream.c(2, this.f);
        }
        int d2 = i2 + this.b.d();
        this.c = d2;
        return d2;
    }
}
