package com.spotify.messages;

import com.comscore.streaming.AdType;
import com.comscore.streaming.ContentType;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;
import java.io.IOException;

public final class BetamaxPlaybackSession extends GeneratedMessageLite<BetamaxPlaybackSession, a> implements gqs {
    /* access modifiers changed from: private */
    public static final BetamaxPlaybackSession M;
    private static volatile fll<BetamaxPlaybackSession> N;
    private String A;
    private String B;
    private int C;
    private String D;
    private long E;
    private long F;
    private int G;
    private long H;
    private float I;
    private String J;
    private float K;
    private String L;
    private int d;
    private int e;
    private String f;
    private String g;
    private String h;
    private long i;
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private long r;
    private long s;
    private int t;
    private int u;
    private int v;
    private long w;
    private long x;
    private long y;
    private long z;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<BetamaxPlaybackSession, a> implements gqs {
        private a() {
            super(BetamaxPlaybackSession.M);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(float f) {
            b();
            BetamaxPlaybackSession.a((BetamaxPlaybackSession) this.a, f);
            return this;
        }

        public final a a(int i) {
            b();
            BetamaxPlaybackSession.a((BetamaxPlaybackSession) this.a, i);
            return this;
        }

        public final a a(long j) {
            b();
            BetamaxPlaybackSession.a((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a a(String str) {
            b();
            BetamaxPlaybackSession.a((BetamaxPlaybackSession) this.a, str);
            return this;
        }

        public final a b(int i) {
            b();
            BetamaxPlaybackSession.b((BetamaxPlaybackSession) this.a, i);
            return this;
        }

        public final a b(long j) {
            b();
            BetamaxPlaybackSession.b((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a b(String str) {
            b();
            BetamaxPlaybackSession.b((BetamaxPlaybackSession) this.a, str);
            return this;
        }

        public final a c(int i) {
            b();
            BetamaxPlaybackSession.c((BetamaxPlaybackSession) this.a, i);
            return this;
        }

        public final a c(long j) {
            b();
            BetamaxPlaybackSession.c((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a c(String str) {
            b();
            BetamaxPlaybackSession.c((BetamaxPlaybackSession) this.a, str);
            return this;
        }

        public final a d(int i) {
            b();
            BetamaxPlaybackSession.d((BetamaxPlaybackSession) this.a, i);
            return this;
        }

        public final a d(long j) {
            b();
            BetamaxPlaybackSession.d((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a d(String str) {
            b();
            BetamaxPlaybackSession.d((BetamaxPlaybackSession) this.a, str);
            return this;
        }

        public final a e(int i) {
            b();
            BetamaxPlaybackSession.e((BetamaxPlaybackSession) this.a, i);
            return this;
        }

        public final a e(long j) {
            b();
            BetamaxPlaybackSession.e((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a e(String str) {
            b();
            BetamaxPlaybackSession.e((BetamaxPlaybackSession) this.a, str);
            return this;
        }

        public final a f(long j) {
            b();
            BetamaxPlaybackSession.f((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a f(String str) {
            b();
            BetamaxPlaybackSession.f((BetamaxPlaybackSession) this.a, str);
            return this;
        }

        public final a g(long j) {
            b();
            BetamaxPlaybackSession.g((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a g(String str) {
            b();
            BetamaxPlaybackSession.g((BetamaxPlaybackSession) this.a, str);
            return this;
        }

        public final a h(long j) {
            b();
            BetamaxPlaybackSession.h((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a h(String str) {
            b();
            BetamaxPlaybackSession.h((BetamaxPlaybackSession) this.a, str);
            return this;
        }

        public final a i(long j) {
            b();
            BetamaxPlaybackSession.i((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a j(long j) {
            b();
            BetamaxPlaybackSession.j((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a k(long j) {
            b();
            BetamaxPlaybackSession.k((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a l(long j) {
            b();
            BetamaxPlaybackSession.l((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a m(long j) {
            b();
            BetamaxPlaybackSession.m((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a n(long j) {
            b();
            BetamaxPlaybackSession.n((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a o(long j) {
            b();
            BetamaxPlaybackSession.o((BetamaxPlaybackSession) this.a, 0);
            return this;
        }

        public final a p(long j) {
            b();
            BetamaxPlaybackSession.p((BetamaxPlaybackSession) this.a, j);
            return this;
        }

        public final a q(long j) {
            b();
            BetamaxPlaybackSession.q((BetamaxPlaybackSession) this.a, j);
            return this;
        }
    }

    static {
        BetamaxPlaybackSession betamaxPlaybackSession = new BetamaxPlaybackSession();
        M = betamaxPlaybackSession;
        betamaxPlaybackSession.e();
    }

    private BetamaxPlaybackSession() {
        String str = "";
        this.f = str;
        this.g = str;
        this.h = str;
        this.A = str;
        this.B = str;
        this.D = str;
        this.J = str;
        this.L = str;
    }

    private boolean A() {
        return (this.d & 16384) == 16384;
    }

    private boolean B() {
        return (this.d & 32768) == 32768;
    }

    private boolean C() {
        return (this.d & 65536) == 65536;
    }

    private boolean D() {
        return (this.d & 131072) == 131072;
    }

    private boolean E() {
        return (this.d & 262144) == 262144;
    }

    private boolean F() {
        return (this.d & 524288) == 524288;
    }

    private boolean G() {
        return (this.d & 1048576) == 1048576;
    }

    private boolean H() {
        return (this.d & 2097152) == 2097152;
    }

    private boolean I() {
        return (this.d & 4194304) == 4194304;
    }

    private boolean J() {
        return (this.d & 8388608) == 8388608;
    }

    private boolean K() {
        return (this.d & 16777216) == 16777216;
    }

    private boolean L() {
        return (this.d & 33554432) == 33554432;
    }

    private boolean M() {
        return (this.d & 67108864) == 67108864;
    }

    private boolean N() {
        return (this.d & 134217728) == 134217728;
    }

    private boolean O() {
        return (this.d & 268435456) == 268435456;
    }

    private boolean P() {
        return (this.d & 536870912) == 536870912;
    }

    private boolean Q() {
        return (this.d & 1073741824) == 1073741824;
    }

    private boolean R() {
        return (this.d & Integer.MIN_VALUE) == Integer.MIN_VALUE;
    }

    private boolean S() {
        return (this.e & 1) == 1;
    }

    static /* synthetic */ void a(BetamaxPlaybackSession betamaxPlaybackSession, float f2) {
        betamaxPlaybackSession.d |= Integer.MIN_VALUE;
        betamaxPlaybackSession.K = f2;
    }

    static /* synthetic */ void a(BetamaxPlaybackSession betamaxPlaybackSession, int i2) {
        betamaxPlaybackSession.d |= 16;
        betamaxPlaybackSession.j = i2;
    }

    static /* synthetic */ void a(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 8;
        betamaxPlaybackSession.i = j2;
    }

    static /* synthetic */ void a(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        if (str != null) {
            betamaxPlaybackSession.d |= 1;
            betamaxPlaybackSession.f = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(BetamaxPlaybackSession betamaxPlaybackSession, int i2) {
        betamaxPlaybackSession.d |= 16384;
        betamaxPlaybackSession.t = i2;
    }

    static /* synthetic */ void b(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 32;
        betamaxPlaybackSession.k = j2;
    }

    static /* synthetic */ void b(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        if (str != null) {
            betamaxPlaybackSession.d |= 2;
            betamaxPlaybackSession.g = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void c(BetamaxPlaybackSession betamaxPlaybackSession, int i2) {
        betamaxPlaybackSession.d |= 32768;
        betamaxPlaybackSession.u = i2;
    }

    static /* synthetic */ void c(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 64;
        betamaxPlaybackSession.l = j2;
    }

    static /* synthetic */ void c(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        if (str != null) {
            betamaxPlaybackSession.d |= 4;
            betamaxPlaybackSession.h = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void d(BetamaxPlaybackSession betamaxPlaybackSession, int i2) {
        betamaxPlaybackSession.d |= 65536;
        betamaxPlaybackSession.v = i2;
    }

    static /* synthetic */ void d(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 128;
        betamaxPlaybackSession.m = j2;
    }

    static /* synthetic */ void d(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        if (str != null) {
            betamaxPlaybackSession.d |= 2097152;
            betamaxPlaybackSession.A = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void e(BetamaxPlaybackSession betamaxPlaybackSession, int i2) {
        betamaxPlaybackSession.d |= 8388608;
        betamaxPlaybackSession.C = i2;
    }

    static /* synthetic */ void e(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 256;
        betamaxPlaybackSession.n = j2;
    }

    static /* synthetic */ void e(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        if (str != null) {
            betamaxPlaybackSession.d |= 4194304;
            betamaxPlaybackSession.B = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void f(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 512;
        betamaxPlaybackSession.o = j2;
    }

    static /* synthetic */ void f(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        if (str != null) {
            betamaxPlaybackSession.d |= 16777216;
            betamaxPlaybackSession.D = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void g(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 1024;
        betamaxPlaybackSession.p = j2;
    }

    static /* synthetic */ void g(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        if (str != null) {
            betamaxPlaybackSession.d |= 1073741824;
            betamaxPlaybackSession.J = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void h(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 2048;
        betamaxPlaybackSession.q = j2;
    }

    static /* synthetic */ void h(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        if (str != null) {
            betamaxPlaybackSession.e |= 1;
            betamaxPlaybackSession.L = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void i(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 4096;
        betamaxPlaybackSession.r = j2;
    }

    static /* synthetic */ void j(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 8192;
        betamaxPlaybackSession.s = j2;
    }

    public static a k() {
        return (a) M.h();
    }

    static /* synthetic */ void k(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 131072;
        betamaxPlaybackSession.w = j2;
    }

    static /* synthetic */ void l(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 262144;
        betamaxPlaybackSession.x = j2;
    }

    static /* synthetic */ void m(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 524288;
        betamaxPlaybackSession.y = j2;
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    static /* synthetic */ void n(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 1048576;
        betamaxPlaybackSession.z = j2;
    }

    private boolean n() {
        return (this.d & 2) == 2;
    }

    static /* synthetic */ void o(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 33554432;
        betamaxPlaybackSession.E = j2;
    }

    private boolean o() {
        return (this.d & 4) == 4;
    }

    static /* synthetic */ void p(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 67108864;
        betamaxPlaybackSession.F = j2;
    }

    private boolean p() {
        return (this.d & 8) == 8;
    }

    public static fll<BetamaxPlaybackSession> parser() {
        return M.c();
    }

    static /* synthetic */ void q(BetamaxPlaybackSession betamaxPlaybackSession, long j2) {
        betamaxPlaybackSession.d |= 268435456;
        betamaxPlaybackSession.H = j2;
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

    private boolean u() {
        return (this.d & 256) == 256;
    }

    private boolean v() {
        return (this.d & 512) == 512;
    }

    private boolean w() {
        return (this.d & 1024) == 1024;
    }

    private boolean x() {
        return (this.d & 2048) == 2048;
    }

    private boolean y() {
        return (this.d & 4096) == 4096;
    }

    private boolean z() {
        return (this.d & 8192) == 8192;
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z2 = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new BetamaxPlaybackSession();
            case IS_INITIALIZED:
                return M;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                BetamaxPlaybackSession betamaxPlaybackSession = (BetamaxPlaybackSession) obj2;
                this.f = fVar.a(m(), this.f, betamaxPlaybackSession.m(), betamaxPlaybackSession.f);
                this.g = fVar.a(n(), this.g, betamaxPlaybackSession.n(), betamaxPlaybackSession.g);
                this.h = fVar.a(o(), this.h, betamaxPlaybackSession.o(), betamaxPlaybackSession.h);
                this.i = fVar.a(p(), this.i, betamaxPlaybackSession.p(), betamaxPlaybackSession.i);
                this.j = fVar.a(q(), this.j, betamaxPlaybackSession.q(), betamaxPlaybackSession.j);
                this.k = fVar.a(r(), this.k, betamaxPlaybackSession.r(), betamaxPlaybackSession.k);
                this.l = fVar.a(s(), this.l, betamaxPlaybackSession.s(), betamaxPlaybackSession.l);
                this.m = fVar.a(t(), this.m, betamaxPlaybackSession.t(), betamaxPlaybackSession.m);
                this.n = fVar.a(u(), this.n, betamaxPlaybackSession.u(), betamaxPlaybackSession.n);
                this.o = fVar.a(v(), this.o, betamaxPlaybackSession.v(), betamaxPlaybackSession.o);
                this.p = fVar.a(w(), this.p, betamaxPlaybackSession.w(), betamaxPlaybackSession.p);
                this.q = fVar.a(x(), this.q, betamaxPlaybackSession.x(), betamaxPlaybackSession.q);
                this.r = fVar.a(y(), this.r, betamaxPlaybackSession.y(), betamaxPlaybackSession.r);
                this.s = fVar.a(z(), this.s, betamaxPlaybackSession.z(), betamaxPlaybackSession.s);
                this.t = fVar.a(A(), this.t, betamaxPlaybackSession.A(), betamaxPlaybackSession.t);
                this.u = fVar.a(B(), this.u, betamaxPlaybackSession.B(), betamaxPlaybackSession.u);
                this.v = fVar.a(C(), this.v, betamaxPlaybackSession.C(), betamaxPlaybackSession.v);
                this.w = fVar.a(D(), this.w, betamaxPlaybackSession.D(), betamaxPlaybackSession.w);
                this.x = fVar.a(E(), this.x, betamaxPlaybackSession.E(), betamaxPlaybackSession.x);
                this.y = fVar.a(F(), this.y, betamaxPlaybackSession.F(), betamaxPlaybackSession.y);
                this.z = fVar.a(G(), this.z, betamaxPlaybackSession.G(), betamaxPlaybackSession.z);
                this.A = fVar.a(H(), this.A, betamaxPlaybackSession.H(), betamaxPlaybackSession.A);
                this.B = fVar.a(I(), this.B, betamaxPlaybackSession.I(), betamaxPlaybackSession.B);
                this.C = fVar.a(J(), this.C, betamaxPlaybackSession.J(), betamaxPlaybackSession.C);
                this.D = fVar.a(K(), this.D, betamaxPlaybackSession.K(), betamaxPlaybackSession.D);
                this.E = fVar.a(L(), this.E, betamaxPlaybackSession.L(), betamaxPlaybackSession.E);
                this.F = fVar.a(M(), this.F, betamaxPlaybackSession.M(), betamaxPlaybackSession.F);
                this.G = fVar.a(N(), this.G, betamaxPlaybackSession.N(), betamaxPlaybackSession.G);
                this.H = fVar.a(O(), this.H, betamaxPlaybackSession.O(), betamaxPlaybackSession.H);
                this.I = fVar.a(P(), this.I, betamaxPlaybackSession.P(), betamaxPlaybackSession.I);
                this.J = fVar.a(Q(), this.J, betamaxPlaybackSession.Q(), betamaxPlaybackSession.J);
                this.K = fVar.a(R(), this.K, betamaxPlaybackSession.R(), betamaxPlaybackSession.K);
                this.L = fVar.a(S(), this.L, betamaxPlaybackSession.S(), betamaxPlaybackSession.L);
                if (fVar == e.a) {
                    this.d |= betamaxPlaybackSession.d;
                    this.e |= betamaxPlaybackSession.e;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                while (!z2) {
                    try {
                        int a2 = fkw.a();
                        switch (a2) {
                            case 0:
                                z2 = true;
                                break;
                            case 10:
                                String c = fkw.c();
                                this.d |= 1;
                                this.f = c;
                                break;
                            case 18:
                                String c2 = fkw.c();
                                this.d |= 2;
                                this.g = c2;
                                break;
                            case 26:
                                String c3 = fkw.c();
                                this.d |= 4;
                                this.h = c3;
                                break;
                            case 32:
                                this.d |= 8;
                                this.i = fkw.h();
                                break;
                            case 40:
                                this.d |= 16;
                                this.j = fkw.g();
                                break;
                            case 48:
                                this.d |= 32;
                                this.k = fkw.h();
                                break;
                            case 56:
                                this.d |= 64;
                                this.l = fkw.h();
                                break;
                            case b.bs /*64*/:
                                this.d |= 128;
                                this.m = fkw.h();
                                break;
                            case b.bA /*72*/:
                                this.d |= 256;
                                this.n = fkw.h();
                                break;
                            case PlaybackSpeed.PLAYBACK_SPEED_80 /*80*/:
                                this.d |= 512;
                                this.o = fkw.h();
                                break;
                            case 88:
                                this.d |= 1024;
                                this.p = fkw.h();
                                break;
                            case 96:
                                this.d |= 2048;
                                this.q = fkw.h();
                                break;
                            case 104:
                                this.d |= 4096;
                                this.r = fkw.h();
                                break;
                            case ContentType.LONG_FORM_ON_DEMAND /*112*/:
                                this.d |= 8192;
                                this.s = fkw.h();
                                break;
                            case 120:
                                this.d |= 16384;
                                this.t = fkw.g();
                                break;
                            case 128:
                                this.d |= 32768;
                                this.u = fkw.g();
                                break;
                            case 136:
                                this.d |= 65536;
                                this.v = fkw.g();
                                break;
                            case 144:
                                this.d |= 131072;
                                this.w = fkw.h();
                                break;
                            case 152:
                                this.d |= 262144;
                                this.x = fkw.h();
                                break;
                            case 160:
                                this.d |= 524288;
                                this.y = fkw.h();
                                break;
                            case 168:
                                this.d |= 1048576;
                                this.z = fkw.h();
                                break;
                            case 178:
                                String c4 = fkw.c();
                                this.d |= 2097152;
                                this.A = c4;
                                break;
                            case 186:
                                String c5 = fkw.c();
                                this.d |= 4194304;
                                this.B = c5;
                                break;
                            case 192:
                                this.d |= 8388608;
                                this.C = fkw.g();
                                break;
                            case 202:
                                String c6 = fkw.c();
                                this.d |= 16777216;
                                this.D = c6;
                                break;
                            case 208:
                                this.d |= 33554432;
                                this.E = fkw.h();
                                break;
                            case 216:
                                this.d |= 67108864;
                                this.F = fkw.h();
                                break;
                            case 224:
                                this.d |= 134217728;
                                this.G = fkw.g();
                                break;
                            case AdType.BRANDED_ON_DEMAND_MID_ROLL /*232*/:
                                this.d |= 268435456;
                                this.H = fkw.h();
                                break;
                            case 245:
                                this.d |= 536870912;
                                this.I = Float.intBitsToFloat(fkw.i());
                                break;
                            case 250:
                                String c7 = fkw.c();
                                this.d |= 1073741824;
                                this.J = c7;
                                break;
                            case 261:
                                this.d |= Integer.MIN_VALUE;
                                this.K = Float.intBitsToFloat(fkw.i());
                                break;
                            case 266:
                                String c8 = fkw.c();
                                this.e |= 1;
                                this.L = c8;
                                break;
                            default:
                                if (a(a2, fkw)) {
                                    break;
                                }
                                z2 = true;
                                break;
                        }
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
                if (N == null) {
                    synchronized (BetamaxPlaybackSession.class) {
                        if (N == null) {
                            N = new b(M);
                        }
                    }
                }
                return N;
            default:
                throw new UnsupportedOperationException();
        }
        return M;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if ((this.d & 1) == 1) {
            codedOutputStream.a(1, this.f);
        }
        if ((this.d & 2) == 2) {
            codedOutputStream.a(2, this.g);
        }
        if ((this.d & 4) == 4) {
            codedOutputStream.a(3, this.h);
        }
        if ((this.d & 8) == 8) {
            codedOutputStream.a(4, this.i);
        }
        if ((this.d & 16) == 16) {
            codedOutputStream.b(5, this.j);
        }
        if ((this.d & 32) == 32) {
            codedOutputStream.a(6, this.k);
        }
        if ((this.d & 64) == 64) {
            codedOutputStream.a(7, this.l);
        }
        if ((this.d & 128) == 128) {
            codedOutputStream.a(8, this.m);
        }
        if ((this.d & 256) == 256) {
            codedOutputStream.a(9, this.n);
        }
        if ((this.d & 512) == 512) {
            codedOutputStream.a(10, this.o);
        }
        if ((this.d & 1024) == 1024) {
            codedOutputStream.a(11, this.p);
        }
        if ((this.d & 2048) == 2048) {
            codedOutputStream.a(12, this.q);
        }
        if ((this.d & 4096) == 4096) {
            codedOutputStream.a(13, this.r);
        }
        if ((this.d & 8192) == 8192) {
            codedOutputStream.a(14, this.s);
        }
        if ((this.d & 16384) == 16384) {
            codedOutputStream.b(15, this.t);
        }
        if ((this.d & 32768) == 32768) {
            codedOutputStream.b(16, this.u);
        }
        if ((this.d & 65536) == 65536) {
            codedOutputStream.b(17, this.v);
        }
        if ((this.d & 131072) == 131072) {
            codedOutputStream.a(18, this.w);
        }
        if ((this.d & 262144) == 262144) {
            codedOutputStream.a(19, this.x);
        }
        if ((this.d & 524288) == 524288) {
            codedOutputStream.a(20, this.y);
        }
        if ((this.d & 1048576) == 1048576) {
            codedOutputStream.a(21, this.z);
        }
        if ((this.d & 2097152) == 2097152) {
            codedOutputStream.a(22, this.A);
        }
        if ((this.d & 4194304) == 4194304) {
            codedOutputStream.a(23, this.B);
        }
        if ((this.d & 8388608) == 8388608) {
            codedOutputStream.b(24, this.C);
        }
        if ((this.d & 16777216) == 16777216) {
            codedOutputStream.a(25, this.D);
        }
        if ((this.d & 33554432) == 33554432) {
            codedOutputStream.a(26, this.E);
        }
        if ((this.d & 67108864) == 67108864) {
            codedOutputStream.a(27, this.F);
        }
        if ((this.d & 134217728) == 134217728) {
            codedOutputStream.b(28, this.G);
        }
        if ((this.d & 268435456) == 268435456) {
            codedOutputStream.a(29, this.H);
        }
        if ((this.d & 536870912) == 536870912) {
            codedOutputStream.a(30, this.I);
        }
        if ((this.d & 1073741824) == 1073741824) {
            codedOutputStream.a(31, this.J);
        }
        if ((this.d & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            codedOutputStream.a(32, this.K);
        }
        if ((this.e & 1) == 1) {
            codedOutputStream.a(33, this.L);
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
            i3 = 0 + CodedOutputStream.b(1, this.f);
        }
        if ((this.d & 2) == 2) {
            i3 += CodedOutputStream.b(2, this.g);
        }
        if ((this.d & 4) == 4) {
            i3 += CodedOutputStream.b(3, this.h);
        }
        if ((this.d & 8) == 8) {
            i3 += CodedOutputStream.c(4, this.i);
        }
        if ((this.d & 16) == 16) {
            i3 += CodedOutputStream.f(5, this.j);
        }
        if ((this.d & 32) == 32) {
            i3 += CodedOutputStream.c(6, this.k);
        }
        if ((this.d & 64) == 64) {
            i3 += CodedOutputStream.c(7, this.l);
        }
        if ((this.d & 128) == 128) {
            i3 += CodedOutputStream.c(8, this.m);
        }
        if ((this.d & 256) == 256) {
            i3 += CodedOutputStream.c(9, this.n);
        }
        if ((this.d & 512) == 512) {
            i3 += CodedOutputStream.c(10, this.o);
        }
        if ((this.d & 1024) == 1024) {
            i3 += CodedOutputStream.c(11, this.p);
        }
        if ((this.d & 2048) == 2048) {
            i3 += CodedOutputStream.c(12, this.q);
        }
        if ((this.d & 4096) == 4096) {
            i3 += CodedOutputStream.c(13, this.r);
        }
        if ((this.d & 8192) == 8192) {
            i3 += CodedOutputStream.c(14, this.s);
        }
        if ((this.d & 16384) == 16384) {
            i3 += CodedOutputStream.f(15, this.t);
        }
        if ((this.d & 32768) == 32768) {
            i3 += CodedOutputStream.f(16, this.u);
        }
        if ((this.d & 65536) == 65536) {
            i3 += CodedOutputStream.f(17, this.v);
        }
        if ((this.d & 131072) == 131072) {
            i3 += CodedOutputStream.c(18, this.w);
        }
        if ((this.d & 262144) == 262144) {
            i3 += CodedOutputStream.c(19, this.x);
        }
        if ((this.d & 524288) == 524288) {
            i3 += CodedOutputStream.c(20, this.y);
        }
        if ((this.d & 1048576) == 1048576) {
            i3 += CodedOutputStream.c(21, this.z);
        }
        if ((this.d & 2097152) == 2097152) {
            i3 += CodedOutputStream.b(22, this.A);
        }
        if ((this.d & 4194304) == 4194304) {
            i3 += CodedOutputStream.b(23, this.B);
        }
        if ((this.d & 8388608) == 8388608) {
            i3 += CodedOutputStream.f(24, this.C);
        }
        if ((this.d & 16777216) == 16777216) {
            i3 += CodedOutputStream.b(25, this.D);
        }
        if ((this.d & 33554432) == 33554432) {
            i3 += CodedOutputStream.c(26, this.E);
        }
        if ((this.d & 67108864) == 67108864) {
            i3 += CodedOutputStream.c(27, this.F);
        }
        if ((this.d & 134217728) == 134217728) {
            i3 += CodedOutputStream.f(28, this.G);
        }
        if ((this.d & 268435456) == 268435456) {
            i3 += CodedOutputStream.c(29, this.H);
        }
        if ((this.d & 536870912) == 536870912) {
            i3 += CodedOutputStream.b(30, this.I);
        }
        if ((this.d & 1073741824) == 1073741824) {
            i3 += CodedOutputStream.b(31, this.J);
        }
        if ((this.d & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            i3 += CodedOutputStream.b(32, this.K);
        }
        if ((this.e & 1) == 1) {
            i3 += CodedOutputStream.b(33, this.L);
        }
        int d2 = i3 + this.b.d();
        this.c = d2;
        return d2;
    }
}
