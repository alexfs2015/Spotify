package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class BetamaxPlaybackErrorDevice extends GeneratedMessageLite<BetamaxPlaybackErrorDevice, a> implements gqr {
    /* access modifiers changed from: private */
    public static final BetamaxPlaybackErrorDevice m;
    private static volatile fll<BetamaxPlaybackErrorDevice> n;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private int i;
    private String j;
    private String k;
    private String l;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<BetamaxPlaybackErrorDevice, a> implements gqr {
        private a() {
            super(BetamaxPlaybackErrorDevice.m);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(int i) {
            b();
            BetamaxPlaybackErrorDevice.a((BetamaxPlaybackErrorDevice) this.a, i);
            return this;
        }

        public final a a(String str) {
            b();
            BetamaxPlaybackErrorDevice.a((BetamaxPlaybackErrorDevice) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            BetamaxPlaybackErrorDevice.b((BetamaxPlaybackErrorDevice) this.a, str);
            return this;
        }

        public final a c(String str) {
            b();
            BetamaxPlaybackErrorDevice.c((BetamaxPlaybackErrorDevice) this.a, str);
            return this;
        }

        public final a d(String str) {
            b();
            BetamaxPlaybackErrorDevice.d((BetamaxPlaybackErrorDevice) this.a, str);
            return this;
        }

        public final a e(String str) {
            b();
            BetamaxPlaybackErrorDevice.e((BetamaxPlaybackErrorDevice) this.a, str);
            return this;
        }

        public final a f(String str) {
            b();
            BetamaxPlaybackErrorDevice.f((BetamaxPlaybackErrorDevice) this.a, str);
            return this;
        }

        public final a g(String str) {
            b();
            BetamaxPlaybackErrorDevice.g((BetamaxPlaybackErrorDevice) this.a, str);
            return this;
        }
    }

    static {
        BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice = new BetamaxPlaybackErrorDevice();
        m = betamaxPlaybackErrorDevice;
        betamaxPlaybackErrorDevice.e();
    }

    private BetamaxPlaybackErrorDevice() {
        String str = "";
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.j = str;
        this.k = str;
        this.l = str;
    }

    static /* synthetic */ void a(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, int i2) {
        betamaxPlaybackErrorDevice.d |= 16;
        betamaxPlaybackErrorDevice.i = i2;
    }

    static /* synthetic */ void a(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        if (str != null) {
            betamaxPlaybackErrorDevice.d |= 1;
            betamaxPlaybackErrorDevice.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        if (str != null) {
            betamaxPlaybackErrorDevice.d |= 2;
            betamaxPlaybackErrorDevice.f = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void c(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        if (str != null) {
            betamaxPlaybackErrorDevice.d |= 4;
            betamaxPlaybackErrorDevice.g = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void d(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        if (str != null) {
            betamaxPlaybackErrorDevice.d |= 8;
            betamaxPlaybackErrorDevice.h = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void e(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        if (str != null) {
            betamaxPlaybackErrorDevice.d |= 32;
            betamaxPlaybackErrorDevice.j = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void f(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        if (str != null) {
            betamaxPlaybackErrorDevice.d |= 64;
            betamaxPlaybackErrorDevice.k = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void g(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        if (str != null) {
            betamaxPlaybackErrorDevice.d |= 128;
            betamaxPlaybackErrorDevice.l = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a k() {
        return (a) m.h();
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

    public static fll<BetamaxPlaybackErrorDevice> parser() {
        return m.c();
    }

    private boolean q() {
        return (this.d & 16) == 16;
    }

    private boolean r() {
        return (this.d & 32) == 32;
    }

    private boolean s() {
        return (this.d & 64) == 64;
    }

    private boolean t() {
        return (this.d & 128) == 128;
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new BetamaxPlaybackErrorDevice();
            case IS_INITIALIZED:
                return m;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice = (BetamaxPlaybackErrorDevice) obj2;
                this.e = fVar.a(m(), this.e, betamaxPlaybackErrorDevice.m(), betamaxPlaybackErrorDevice.e);
                this.f = fVar.a(n(), this.f, betamaxPlaybackErrorDevice.n(), betamaxPlaybackErrorDevice.f);
                this.g = fVar.a(o(), this.g, betamaxPlaybackErrorDevice.o(), betamaxPlaybackErrorDevice.g);
                this.h = fVar.a(p(), this.h, betamaxPlaybackErrorDevice.p(), betamaxPlaybackErrorDevice.h);
                this.i = fVar.a(q(), this.i, betamaxPlaybackErrorDevice.q(), betamaxPlaybackErrorDevice.i);
                this.j = fVar.a(r(), this.j, betamaxPlaybackErrorDevice.r(), betamaxPlaybackErrorDevice.j);
                this.k = fVar.a(s(), this.k, betamaxPlaybackErrorDevice.s(), betamaxPlaybackErrorDevice.k);
                this.l = fVar.a(t(), this.l, betamaxPlaybackErrorDevice.t(), betamaxPlaybackErrorDevice.l);
                if (fVar == e.a) {
                    this.d |= betamaxPlaybackErrorDevice.d;
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
                            } else if (a2 == 18) {
                                String c2 = fkw.c();
                                this.d |= 2;
                                this.f = c2;
                            } else if (a2 == 26) {
                                String c3 = fkw.c();
                                this.d |= 4;
                                this.g = c3;
                            } else if (a2 == 34) {
                                String c4 = fkw.c();
                                this.d |= 8;
                                this.h = c4;
                            } else if (a2 == 40) {
                                this.d |= 16;
                                this.i = fkw.g();
                            } else if (a2 == 50) {
                                String c5 = fkw.c();
                                this.d |= 32;
                                this.j = c5;
                            } else if (a2 == 58) {
                                String c6 = fkw.c();
                                this.d |= 64;
                                this.k = c6;
                            } else if (a2 == 66) {
                                String c7 = fkw.c();
                                this.d |= 128;
                                this.l = c7;
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
                if (n == null) {
                    synchronized (BetamaxPlaybackErrorDevice.class) {
                        if (n == null) {
                            n = new b(m);
                        }
                    }
                }
                return n;
            default:
                throw new UnsupportedOperationException();
        }
        return m;
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
        if ((this.d & 16) == 16) {
            codedOutputStream.b(5, this.i);
        }
        if ((this.d & 32) == 32) {
            codedOutputStream.a(6, this.j);
        }
        if ((this.d & 64) == 64) {
            codedOutputStream.a(7, this.k);
        }
        if ((this.d & 128) == 128) {
            codedOutputStream.a(8, this.l);
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
            i3 += CodedOutputStream.b(2, this.f);
        }
        if ((this.d & 4) == 4) {
            i3 += CodedOutputStream.b(3, this.g);
        }
        if ((this.d & 8) == 8) {
            i3 += CodedOutputStream.b(4, this.h);
        }
        if ((this.d & 16) == 16) {
            i3 += CodedOutputStream.f(5, this.i);
        }
        if ((this.d & 32) == 32) {
            i3 += CodedOutputStream.b(6, this.j);
        }
        if ((this.d & 64) == 64) {
            i3 += CodedOutputStream.b(7, this.k);
        }
        if ((this.d & 128) == 128) {
            i3 += CodedOutputStream.b(8, this.l);
        }
        int d2 = i3 + this.b.d();
        this.c = d2;
        return d2;
    }
}
