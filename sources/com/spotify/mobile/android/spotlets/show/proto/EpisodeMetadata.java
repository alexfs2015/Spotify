package com.spotify.mobile.android.spotlets.show.proto;

import com.comscore.streaming.ContentType;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup;
import java.io.IOException;

public final class EpisodeMetadata {

    public static final class ProtoEpisodeMetadata extends GeneratedMessageLite<ProtoEpisodeMetadata, a> implements jcq {
        /* access modifiers changed from: private */
        public static final ProtoEpisodeMetadata u;
        private static volatile fkr<ProtoEpisodeMetadata> v;
        public String d;
        public String e;
        public int f;
        public String g;
        public String h;
        public long i;
        public boolean j;
        public int k;
        public boolean l;
        public String m;
        public boolean n;
        public String o;
        private int p;
        private ProtoEpisodeShowMetadata q;
        private ProtoImageGroup r;
        private ProtoImageGroup s;
        private String t;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoEpisodeMetadata, a> implements jcq {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoEpisodeMetadata.u);
            }

            public final a a(ProtoEpisodeShowMetadata protoEpisodeShowMetadata) {
                b();
                ProtoEpisodeMetadata.a((ProtoEpisodeMetadata) this.a, protoEpisodeShowMetadata);
                return this;
            }

            public final a a(String str) {
                b();
                ProtoEpisodeMetadata.a((ProtoEpisodeMetadata) this.a, str);
                return this;
            }

            public final a b(String str) {
                b();
                ProtoEpisodeMetadata.b((ProtoEpisodeMetadata) this.a, str);
                return this;
            }

            public final a a(int i) {
                b();
                ProtoEpisodeMetadata.a((ProtoEpisodeMetadata) this.a, i);
                return this;
            }

            public final a a(ProtoImageGroup protoImageGroup) {
                b();
                ProtoEpisodeMetadata.a((ProtoEpisodeMetadata) this.a, protoImageGroup);
                return this;
            }

            public final a c(String str) {
                b();
                ProtoEpisodeMetadata.c((ProtoEpisodeMetadata) this.a, str);
                return this;
            }

            public final a d(String str) {
                b();
                ProtoEpisodeMetadata.d((ProtoEpisodeMetadata) this.a, str);
                return this;
            }

            public final a a(long j) {
                b();
                ProtoEpisodeMetadata.a((ProtoEpisodeMetadata) this.a, j);
                return this;
            }

            public final a b(ProtoImageGroup protoImageGroup) {
                b();
                ProtoEpisodeMetadata.b((ProtoEpisodeMetadata) this.a, protoImageGroup);
                return this;
            }

            public final a e(String str) {
                b();
                ProtoEpisodeMetadata.e((ProtoEpisodeMetadata) this.a, str);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoEpisodeMetadata.a((ProtoEpisodeMetadata) this.a, z);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoEpisodeMetadata.b((ProtoEpisodeMetadata) this.a, i);
                return this;
            }

            public final a b(boolean z) {
                b();
                ProtoEpisodeMetadata.b((ProtoEpisodeMetadata) this.a, z);
                return this;
            }

            public final a f(String str) {
                b();
                ProtoEpisodeMetadata.f((ProtoEpisodeMetadata) this.a, str);
                return this;
            }

            public final a c(boolean z) {
                b();
                ProtoEpisodeMetadata.c((ProtoEpisodeMetadata) this.a, z);
                return this;
            }
        }

        private ProtoEpisodeMetadata() {
            String str = "";
            this.d = str;
            this.e = str;
            this.g = str;
            this.h = str;
            this.t = str;
            this.m = str;
            this.o = str;
        }

        public final boolean k() {
            return (this.p & 1) == 1;
        }

        public final ProtoEpisodeShowMetadata l() {
            ProtoEpisodeShowMetadata protoEpisodeShowMetadata = this.q;
            return protoEpisodeShowMetadata == null ? ProtoEpisodeShowMetadata.n() : protoEpisodeShowMetadata;
        }

        private boolean v() {
            return (this.p & 2) == 2;
        }

        private boolean w() {
            return (this.p & 4) == 4;
        }

        private boolean x() {
            return (this.p & 8) == 8;
        }

        public final boolean m() {
            return (this.p & 16) == 16;
        }

        public final ProtoImageGroup n() {
            ProtoImageGroup protoImageGroup = this.r;
            return protoImageGroup == null ? ProtoImageGroup.l() : protoImageGroup;
        }

        private boolean y() {
            return (this.p & 32) == 32;
        }

        private boolean z() {
            return (this.p & 64) == 64;
        }

        private boolean A() {
            return (this.p & 128) == 128;
        }

        public final boolean o() {
            return (this.p & 256) == 256;
        }

        public final ProtoImageGroup p() {
            ProtoImageGroup protoImageGroup = this.s;
            return protoImageGroup == null ? ProtoImageGroup.l() : protoImageGroup;
        }

        private boolean B() {
            return (this.p & 512) == 512;
        }

        private boolean C() {
            return (this.p & 1024) == 1024;
        }

        public final boolean q() {
            return (this.p & 2048) == 2048;
        }

        public final boolean r() {
            return (this.p & 4096) == 4096;
        }

        private boolean D() {
            return (this.p & 8192) == 8192;
        }

        private boolean E() {
            return (this.p & 16384) == 16384;
        }

        private boolean F() {
            return (this.p & 32768) == 32768;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.p & 1) == 1) {
                codedOutputStream.a(1, (fko) l());
            }
            if ((this.p & 2) == 2) {
                codedOutputStream.a(2, this.d);
            }
            if ((this.p & 4) == 4) {
                codedOutputStream.a(3, this.e);
            }
            if ((this.p & 8) == 8) {
                codedOutputStream.c(4, this.f);
            }
            if ((this.p & 16) == 16) {
                codedOutputStream.a(5, (fko) n());
            }
            if ((this.p & 32) == 32) {
                codedOutputStream.a(6, this.g);
            }
            if ((this.p & 64) == 64) {
                codedOutputStream.a(7, this.h);
            }
            if ((this.p & 128) == 128) {
                codedOutputStream.a(8, this.i);
            }
            if ((this.p & 256) == 256) {
                codedOutputStream.a(9, (fko) p());
            }
            if ((this.p & 512) == 512) {
                codedOutputStream.a(10, this.t);
            }
            if ((this.p & 1024) == 1024) {
                codedOutputStream.a(11, this.j);
            }
            if ((this.p & 2048) == 2048) {
                codedOutputStream.b(12, this.k);
            }
            if ((this.p & 4096) == 4096) {
                codedOutputStream.a(14, this.l);
            }
            if ((this.p & 8192) == 8192) {
                codedOutputStream.a(15, this.m);
            }
            if ((this.p & 16384) == 16384) {
                codedOutputStream.a(16, this.n);
            }
            if ((this.p & 32768) == 32768) {
                codedOutputStream.a(17, this.o);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.p & 1) == 1) {
                i3 = 0 + CodedOutputStream.b(1, (fko) l());
            }
            if ((this.p & 2) == 2) {
                i3 += CodedOutputStream.b(2, this.d);
            }
            if ((this.p & 4) == 4) {
                i3 += CodedOutputStream.b(3, this.e);
            }
            if ((this.p & 8) == 8) {
                i3 += CodedOutputStream.g(4, this.f);
            }
            if ((this.p & 16) == 16) {
                i3 += CodedOutputStream.b(5, (fko) n());
            }
            if ((this.p & 32) == 32) {
                i3 += CodedOutputStream.b(6, this.g);
            }
            if ((this.p & 64) == 64) {
                i3 += CodedOutputStream.b(7, this.h);
            }
            if ((this.p & 128) == 128) {
                i3 += CodedOutputStream.c(8, this.i);
            }
            if ((this.p & 256) == 256) {
                i3 += CodedOutputStream.b(9, (fko) p());
            }
            if ((this.p & 512) == 512) {
                i3 += CodedOutputStream.b(10, this.t);
            }
            if ((this.p & 1024) == 1024) {
                i3 += CodedOutputStream.b(11, this.j);
            }
            if ((this.p & 2048) == 2048) {
                i3 += CodedOutputStream.f(12, this.k);
            }
            if ((this.p & 4096) == 4096) {
                i3 += CodedOutputStream.b(14, this.l);
            }
            if ((this.p & 8192) == 8192) {
                i3 += CodedOutputStream.b(15, this.m);
            }
            if ((this.p & 16384) == 16384) {
                i3 += CodedOutputStream.b(16, this.n);
            }
            if ((this.p & 32768) == 32768) {
                i3 += CodedOutputStream.b(17, this.o);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a s() {
            return (a) u.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoEpisodeMetadata();
                case IS_INITIALIZED:
                    return u;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoEpisodeMetadata protoEpisodeMetadata = (ProtoEpisodeMetadata) obj2;
                    this.q = (ProtoEpisodeShowMetadata) fVar.a(this.q, protoEpisodeMetadata.q);
                    this.d = fVar.a(v(), this.d, protoEpisodeMetadata.v(), protoEpisodeMetadata.d);
                    this.e = fVar.a(w(), this.e, protoEpisodeMetadata.w(), protoEpisodeMetadata.e);
                    this.f = fVar.a(x(), this.f, protoEpisodeMetadata.x(), protoEpisodeMetadata.f);
                    this.r = (ProtoImageGroup) fVar.a(this.r, protoEpisodeMetadata.r);
                    this.g = fVar.a(y(), this.g, protoEpisodeMetadata.y(), protoEpisodeMetadata.g);
                    this.h = fVar.a(z(), this.h, protoEpisodeMetadata.z(), protoEpisodeMetadata.h);
                    this.i = fVar.a(A(), this.i, protoEpisodeMetadata.A(), protoEpisodeMetadata.i);
                    this.s = (ProtoImageGroup) fVar.a(this.s, protoEpisodeMetadata.s);
                    this.t = fVar.a(B(), this.t, protoEpisodeMetadata.B(), protoEpisodeMetadata.t);
                    this.j = fVar.a(C(), this.j, protoEpisodeMetadata.C(), protoEpisodeMetadata.j);
                    this.k = fVar.a(q(), this.k, protoEpisodeMetadata.q(), protoEpisodeMetadata.k);
                    this.l = fVar.a(r(), this.l, protoEpisodeMetadata.r(), protoEpisodeMetadata.l);
                    this.m = fVar.a(D(), this.m, protoEpisodeMetadata.D(), protoEpisodeMetadata.m);
                    this.n = fVar.a(E(), this.n, protoEpisodeMetadata.E(), protoEpisodeMetadata.n);
                    this.o = fVar.a(F(), this.o, protoEpisodeMetadata.F(), protoEpisodeMetadata.o);
                    if (fVar == e.a) {
                        this.p |= protoEpisodeMetadata.p;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    fke fke = (fke) obj2;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            switch (a2) {
                                case 0:
                                    z = true;
                                    break;
                                case 10:
                                    a aVar = (this.p & 1) == 1 ? (a) this.q.h() : null;
                                    this.q = (ProtoEpisodeShowMetadata) fkc.a(ProtoEpisodeShowMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.q);
                                        this.q = (ProtoEpisodeShowMetadata) aVar.e();
                                    }
                                    this.p |= 1;
                                    break;
                                case 18:
                                    String c = fkc.c();
                                    this.p |= 2;
                                    this.d = c;
                                    break;
                                case 26:
                                    String c2 = fkc.c();
                                    this.p |= 4;
                                    this.e = c2;
                                    break;
                                case 32:
                                    this.p |= 8;
                                    this.f = fkc.g();
                                    break;
                                case 42:
                                    com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a aVar2 = (this.p & 16) == 16 ? (com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a) this.r.h() : null;
                                    this.r = (ProtoImageGroup) fkc.a(ProtoImageGroup.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.r);
                                        this.r = (ProtoImageGroup) aVar2.e();
                                    }
                                    this.p |= 16;
                                    break;
                                case 50:
                                    String c3 = fkc.c();
                                    this.p |= 32;
                                    this.g = c3;
                                    break;
                                case 58:
                                    String c4 = fkc.c();
                                    this.p |= 64;
                                    this.h = c4;
                                    break;
                                case b.bs /*64*/:
                                    this.p |= 128;
                                    this.i = fkc.h();
                                    break;
                                case b.bC /*74*/:
                                    com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a aVar3 = (this.p & 256) == 256 ? (com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a) this.s.h() : null;
                                    this.s = (ProtoImageGroup) fkc.a(ProtoImageGroup.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a(this.s);
                                        this.s = (ProtoImageGroup) aVar3.e();
                                    }
                                    this.p |= 256;
                                    break;
                                case 82:
                                    String c5 = fkc.c();
                                    this.p |= 512;
                                    this.t = c5;
                                    break;
                                case 88:
                                    this.p |= 1024;
                                    this.j = fkc.b();
                                    break;
                                case 96:
                                    this.p |= 2048;
                                    this.k = fkc.g();
                                    break;
                                case ContentType.LONG_FORM_ON_DEMAND /*112*/:
                                    this.p |= 4096;
                                    this.l = fkc.b();
                                    break;
                                case 122:
                                    String c6 = fkc.c();
                                    this.p |= 8192;
                                    this.m = c6;
                                    break;
                                case 128:
                                    this.p |= 16384;
                                    this.n = fkc.b();
                                    break;
                                case 138:
                                    String c7 = fkc.c();
                                    this.p |= 32768;
                                    this.o = c7;
                                    break;
                                default:
                                    if (a(a2, fkc)) {
                                        break;
                                    }
                                    z = true;
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
                    if (v == null) {
                        synchronized (ProtoEpisodeMetadata.class) {
                            if (v == null) {
                                v = new b(u);
                            }
                        }
                    }
                    return v;
                default:
                    throw new UnsupportedOperationException();
            }
            return u;
        }

        static {
            ProtoEpisodeMetadata protoEpisodeMetadata = new ProtoEpisodeMetadata();
            u = protoEpisodeMetadata;
            protoEpisodeMetadata.e();
        }

        public static ProtoEpisodeMetadata t() {
            return u;
        }

        public static fkr<ProtoEpisodeMetadata> parser() {
            return u.c();
        }

        static /* synthetic */ void a(ProtoEpisodeMetadata protoEpisodeMetadata, ProtoEpisodeShowMetadata protoEpisodeShowMetadata) {
            if (protoEpisodeShowMetadata != null) {
                protoEpisodeMetadata.q = protoEpisodeShowMetadata;
                protoEpisodeMetadata.p |= 1;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoEpisodeMetadata protoEpisodeMetadata, String str) {
            if (str != null) {
                protoEpisodeMetadata.p |= 2;
                protoEpisodeMetadata.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ProtoEpisodeMetadata protoEpisodeMetadata, String str) {
            if (str != null) {
                protoEpisodeMetadata.p |= 4;
                protoEpisodeMetadata.e = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoEpisodeMetadata protoEpisodeMetadata, int i2) {
            protoEpisodeMetadata.p |= 8;
            protoEpisodeMetadata.f = i2;
        }

        static /* synthetic */ void a(ProtoEpisodeMetadata protoEpisodeMetadata, ProtoImageGroup protoImageGroup) {
            if (protoImageGroup != null) {
                protoEpisodeMetadata.r = protoImageGroup;
                protoEpisodeMetadata.p |= 16;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void c(ProtoEpisodeMetadata protoEpisodeMetadata, String str) {
            if (str != null) {
                protoEpisodeMetadata.p |= 32;
                protoEpisodeMetadata.g = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void d(ProtoEpisodeMetadata protoEpisodeMetadata, String str) {
            if (str != null) {
                protoEpisodeMetadata.p |= 64;
                protoEpisodeMetadata.h = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoEpisodeMetadata protoEpisodeMetadata, long j2) {
            protoEpisodeMetadata.p |= 128;
            protoEpisodeMetadata.i = j2;
        }

        static /* synthetic */ void b(ProtoEpisodeMetadata protoEpisodeMetadata, ProtoImageGroup protoImageGroup) {
            if (protoImageGroup != null) {
                protoEpisodeMetadata.s = protoImageGroup;
                protoEpisodeMetadata.p |= 256;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void e(ProtoEpisodeMetadata protoEpisodeMetadata, String str) {
            if (str != null) {
                protoEpisodeMetadata.p |= 512;
                protoEpisodeMetadata.t = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoEpisodeMetadata protoEpisodeMetadata, boolean z) {
            protoEpisodeMetadata.p |= 1024;
            protoEpisodeMetadata.j = z;
        }

        static /* synthetic */ void b(ProtoEpisodeMetadata protoEpisodeMetadata, int i2) {
            protoEpisodeMetadata.p |= 2048;
            protoEpisodeMetadata.k = i2;
        }

        static /* synthetic */ void b(ProtoEpisodeMetadata protoEpisodeMetadata, boolean z) {
            protoEpisodeMetadata.p |= 4096;
            protoEpisodeMetadata.l = z;
        }

        static /* synthetic */ void f(ProtoEpisodeMetadata protoEpisodeMetadata, String str) {
            if (str != null) {
                protoEpisodeMetadata.p |= 8192;
                protoEpisodeMetadata.m = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void c(ProtoEpisodeMetadata protoEpisodeMetadata, boolean z) {
            protoEpisodeMetadata.p |= 16384;
            protoEpisodeMetadata.n = z;
        }
    }

    public static final class ProtoEpisodeShowMetadata extends GeneratedMessageLite<ProtoEpisodeShowMetadata, a> implements jcr {
        /* access modifiers changed from: private */
        public static final ProtoEpisodeShowMetadata i;
        private static volatile fkr<ProtoEpisodeShowMetadata> j;
        public String d;
        public String e;
        public String f;
        private int g;
        private ProtoImageGroup h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoEpisodeShowMetadata, a> implements jcr {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoEpisodeShowMetadata.i);
            }

            public final a a(String str) {
                b();
                ProtoEpisodeShowMetadata.a((ProtoEpisodeShowMetadata) this.a, str);
                return this;
            }

            public final a b(String str) {
                b();
                ProtoEpisodeShowMetadata.b((ProtoEpisodeShowMetadata) this.a, str);
                return this;
            }

            public final a c(String str) {
                b();
                ProtoEpisodeShowMetadata.c((ProtoEpisodeShowMetadata) this.a, str);
                return this;
            }

            public final a a(ProtoImageGroup protoImageGroup) {
                b();
                ProtoEpisodeShowMetadata.a((ProtoEpisodeShowMetadata) this.a, protoImageGroup);
                return this;
            }
        }

        private ProtoEpisodeShowMetadata() {
            String str = "";
            this.d = str;
            this.e = str;
            this.f = str;
        }

        private boolean p() {
            return (this.g & 1) == 1;
        }

        private boolean q() {
            return (this.g & 2) == 2;
        }

        private boolean r() {
            return (this.g & 4) == 4;
        }

        public final boolean k() {
            return (this.g & 8) == 8;
        }

        public final ProtoImageGroup l() {
            ProtoImageGroup protoImageGroup = this.h;
            return protoImageGroup == null ? ProtoImageGroup.l() : protoImageGroup;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.g & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.g & 2) == 2) {
                codedOutputStream.a(2, this.e);
            }
            if ((this.g & 4) == 4) {
                codedOutputStream.a(3, this.f);
            }
            if ((this.g & 8) == 8) {
                codedOutputStream.a(4, (fko) l());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.g & 1) == 1) {
                i3 = 0 + CodedOutputStream.b(1, this.d);
            }
            if ((this.g & 2) == 2) {
                i3 += CodedOutputStream.b(2, this.e);
            }
            if ((this.g & 4) == 4) {
                i3 += CodedOutputStream.b(3, this.f);
            }
            if ((this.g & 8) == 8) {
                i3 += CodedOutputStream.b(4, (fko) l());
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a m() {
            return (a) i.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoEpisodeShowMetadata();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoEpisodeShowMetadata protoEpisodeShowMetadata = (ProtoEpisodeShowMetadata) obj2;
                    this.d = fVar.a(p(), this.d, protoEpisodeShowMetadata.p(), protoEpisodeShowMetadata.d);
                    this.e = fVar.a(q(), this.e, protoEpisodeShowMetadata.q(), protoEpisodeShowMetadata.e);
                    this.f = fVar.a(r(), this.f, protoEpisodeShowMetadata.r(), protoEpisodeShowMetadata.f);
                    this.h = (ProtoImageGroup) fVar.a(this.h, protoEpisodeShowMetadata.h);
                    if (fVar == e.a) {
                        this.g |= protoEpisodeShowMetadata.g;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    fke fke = (fke) obj2;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    String c = fkc.c();
                                    this.g |= 1;
                                    this.d = c;
                                } else if (a2 == 18) {
                                    String c2 = fkc.c();
                                    this.g |= 2;
                                    this.e = c2;
                                } else if (a2 == 26) {
                                    String c3 = fkc.c();
                                    this.g |= 4;
                                    this.f = c3;
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a aVar = (this.g & 8) == 8 ? (com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a) this.h.h() : null;
                                    this.h = (ProtoImageGroup) fkc.a(ProtoImageGroup.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.h);
                                        this.h = (ProtoImageGroup) aVar.e();
                                    }
                                    this.g |= 8;
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
                        synchronized (ProtoEpisodeShowMetadata.class) {
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
            ProtoEpisodeShowMetadata protoEpisodeShowMetadata = new ProtoEpisodeShowMetadata();
            i = protoEpisodeShowMetadata;
            protoEpisodeShowMetadata.e();
        }

        public static ProtoEpisodeShowMetadata n() {
            return i;
        }

        public static fkr<ProtoEpisodeShowMetadata> parser() {
            return i.c();
        }

        static /* synthetic */ void a(ProtoEpisodeShowMetadata protoEpisodeShowMetadata, String str) {
            if (str != null) {
                protoEpisodeShowMetadata.g |= 1;
                protoEpisodeShowMetadata.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ProtoEpisodeShowMetadata protoEpisodeShowMetadata, String str) {
            if (str != null) {
                protoEpisodeShowMetadata.g |= 2;
                protoEpisodeShowMetadata.e = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void c(ProtoEpisodeShowMetadata protoEpisodeShowMetadata, String str) {
            if (str != null) {
                protoEpisodeShowMetadata.g |= 4;
                protoEpisodeShowMetadata.f = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoEpisodeShowMetadata protoEpisodeShowMetadata, ProtoImageGroup protoImageGroup) {
            if (protoImageGroup != null) {
                protoEpisodeShowMetadata.h = protoImageGroup;
                protoEpisodeShowMetadata.g |= 8;
                return;
            }
            throw new NullPointerException();
        }
    }
}
