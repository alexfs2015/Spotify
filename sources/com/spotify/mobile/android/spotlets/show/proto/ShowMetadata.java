package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup;
import java.io.IOException;

public final class ShowMetadata {

    public static final class ProtoShowMetadata extends GeneratedMessageLite<ProtoShowMetadata, a> implements jcz {
        /* access modifiers changed from: private */
        public static final ProtoShowMetadata q;
        private static volatile fkr<ProtoShowMetadata> r;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public int i;
        private int j;
        private int k;
        private String l;
        private boolean m;
        private ProtoImageGroup n;
        private int o;
        private e<String> p = fks.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoShowMetadata, a> implements jcz {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoShowMetadata.q);
            }

            public final a a(String str) {
                b();
                ProtoShowMetadata.a((ProtoShowMetadata) this.a, str);
                return this;
            }

            public final a b(String str) {
                b();
                ProtoShowMetadata.b((ProtoShowMetadata) this.a, str);
                return this;
            }

            public final a c(String str) {
                b();
                ProtoShowMetadata.c((ProtoShowMetadata) this.a, str);
                return this;
            }

            public final a a(int i) {
                b();
                ProtoShowMetadata.a((ProtoShowMetadata) this.a, 0);
                return this;
            }

            public final a d(String str) {
                b();
                ProtoShowMetadata.d((ProtoShowMetadata) this.a, str);
                return this;
            }

            public final a e(String str) {
                b();
                ProtoShowMetadata.e((ProtoShowMetadata) this.a, str);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoShowMetadata.a((ProtoShowMetadata) this.a, false);
                return this;
            }

            public final a a(ProtoImageGroup protoImageGroup) {
                b();
                ProtoShowMetadata.a((ProtoShowMetadata) this.a, protoImageGroup);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoShowMetadata.b((ProtoShowMetadata) this.a, 0);
                return this;
            }

            public final a f(String str) {
                b();
                ProtoShowMetadata.f((ProtoShowMetadata) this.a, str);
                return this;
            }

            public final a c(int i) {
                b();
                ProtoShowMetadata.c((ProtoShowMetadata) this.a, i);
                return this;
            }

            public final a a(Iterable<String> iterable) {
                b();
                ProtoShowMetadata.a((ProtoShowMetadata) this.a, (Iterable) iterable);
                return this;
            }
        }

        private ProtoShowMetadata() {
            String str = "";
            this.d = str;
            this.e = str;
            this.f = str;
            this.g = str;
            this.l = str;
            this.h = str;
        }

        private boolean q() {
            return (this.j & 1) == 1;
        }

        private boolean r() {
            return (this.j & 2) == 2;
        }

        private boolean s() {
            return (this.j & 4) == 4;
        }

        private boolean t() {
            return (this.j & 8) == 8;
        }

        private boolean u() {
            return (this.j & 16) == 16;
        }

        private boolean v() {
            return (this.j & 32) == 32;
        }

        private boolean w() {
            return (this.j & 64) == 64;
        }

        public final boolean k() {
            return (this.j & 128) == 128;
        }

        public final ProtoImageGroup l() {
            ProtoImageGroup protoImageGroup = this.n;
            return protoImageGroup == null ? ProtoImageGroup.l() : protoImageGroup;
        }

        private boolean x() {
            return (this.j & 256) == 256;
        }

        private boolean y() {
            return (this.j & 512) == 512;
        }

        public final boolean m() {
            return (this.j & 1024) == 1024;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.j & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.j & 2) == 2) {
                codedOutputStream.a(2, this.e);
            }
            if ((this.j & 4) == 4) {
                codedOutputStream.a(3, this.f);
            }
            if ((this.j & 8) == 8) {
                codedOutputStream.c(4, this.k);
            }
            if ((this.j & 16) == 16) {
                codedOutputStream.a(5, this.g);
            }
            if ((this.j & 32) == 32) {
                codedOutputStream.a(6, this.l);
            }
            if ((this.j & 64) == 64) {
                codedOutputStream.a(7, this.m);
            }
            if ((this.j & 128) == 128) {
                codedOutputStream.a(8, (fko) l());
            }
            if ((this.j & 256) == 256) {
                codedOutputStream.c(9, this.o);
            }
            if ((this.j & 512) == 512) {
                codedOutputStream.a(10, this.h);
            }
            if ((this.j & 1024) == 1024) {
                codedOutputStream.b(11, this.i);
            }
            for (int i2 = 0; i2 < this.p.size(); i2++) {
                codedOutputStream.a(12, (String) this.p.get(i2));
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int b = (this.j & 1) == 1 ? CodedOutputStream.b(1, this.d) + 0 : 0;
            if ((this.j & 2) == 2) {
                b += CodedOutputStream.b(2, this.e);
            }
            if ((this.j & 4) == 4) {
                b += CodedOutputStream.b(3, this.f);
            }
            if ((this.j & 8) == 8) {
                b += CodedOutputStream.g(4, this.k);
            }
            if ((this.j & 16) == 16) {
                b += CodedOutputStream.b(5, this.g);
            }
            if ((this.j & 32) == 32) {
                b += CodedOutputStream.b(6, this.l);
            }
            if ((this.j & 64) == 64) {
                b += CodedOutputStream.b(7, this.m);
            }
            if ((this.j & 128) == 128) {
                b += CodedOutputStream.b(8, (fko) l());
            }
            if ((this.j & 256) == 256) {
                b += CodedOutputStream.g(9, this.o);
            }
            if ((this.j & 512) == 512) {
                b += CodedOutputStream.b(10, this.h);
            }
            if ((this.j & 1024) == 1024) {
                b += CodedOutputStream.f(11, this.i);
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.p.size(); i4++) {
                i3 += CodedOutputStream.b((String) this.p.get(i4));
            }
            int size = b + i3 + (this.p.size() * 1) + this.b.d();
            this.c = size;
            return size;
        }

        public static a n() {
            return (a) q.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoShowMetadata();
                case IS_INITIALIZED:
                    return q;
                case MAKE_IMMUTABLE:
                    this.p.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoShowMetadata protoShowMetadata = (ProtoShowMetadata) obj2;
                    this.d = fVar.a(q(), this.d, protoShowMetadata.q(), protoShowMetadata.d);
                    this.e = fVar.a(r(), this.e, protoShowMetadata.r(), protoShowMetadata.e);
                    this.f = fVar.a(s(), this.f, protoShowMetadata.s(), protoShowMetadata.f);
                    this.k = fVar.a(t(), this.k, protoShowMetadata.t(), protoShowMetadata.k);
                    this.g = fVar.a(u(), this.g, protoShowMetadata.u(), protoShowMetadata.g);
                    this.l = fVar.a(v(), this.l, protoShowMetadata.v(), protoShowMetadata.l);
                    this.m = fVar.a(w(), this.m, protoShowMetadata.w(), protoShowMetadata.m);
                    this.n = (ProtoImageGroup) fVar.a(this.n, protoShowMetadata.n);
                    this.o = fVar.a(x(), this.o, protoShowMetadata.x(), protoShowMetadata.o);
                    this.h = fVar.a(y(), this.h, protoShowMetadata.y(), protoShowMetadata.h);
                    this.i = fVar.a(m(), this.i, protoShowMetadata.m(), protoShowMetadata.i);
                    this.p = fVar.a(this.p, protoShowMetadata.p);
                    if (fVar == e.a) {
                        this.j |= protoShowMetadata.j;
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
                                    String c = fkc.c();
                                    this.j |= 1;
                                    this.d = c;
                                    break;
                                case 18:
                                    String c2 = fkc.c();
                                    this.j |= 2;
                                    this.e = c2;
                                    break;
                                case 26:
                                    String c3 = fkc.c();
                                    this.j |= 4;
                                    this.f = c3;
                                    break;
                                case 32:
                                    this.j |= 8;
                                    this.k = fkc.g();
                                    break;
                                case 42:
                                    String c4 = fkc.c();
                                    this.j |= 16;
                                    this.g = c4;
                                    break;
                                case 50:
                                    String c5 = fkc.c();
                                    this.j |= 32;
                                    this.l = c5;
                                    break;
                                case 56:
                                    this.j |= 64;
                                    this.m = fkc.b();
                                    break;
                                case b.bu /*66*/:
                                    com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a aVar = (this.j & 128) == 128 ? (com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a) this.n.h() : null;
                                    this.n = (ProtoImageGroup) fkc.a(ProtoImageGroup.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.n);
                                        this.n = (ProtoImageGroup) aVar.e();
                                    }
                                    this.j |= 128;
                                    break;
                                case b.bA /*72*/:
                                    this.j |= 256;
                                    this.o = fkc.g();
                                    break;
                                case 82:
                                    String c6 = fkc.c();
                                    this.j |= 512;
                                    this.h = c6;
                                    break;
                                case 88:
                                    this.j |= 1024;
                                    this.i = fkc.g();
                                    break;
                                case 98:
                                    String c7 = fkc.c();
                                    if (!this.p.a()) {
                                        this.p = GeneratedMessageLite.a(this.p);
                                    }
                                    this.p.add(c7);
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
                    if (r == null) {
                        synchronized (ProtoShowMetadata.class) {
                            if (r == null) {
                                r = new b(q);
                            }
                        }
                    }
                    return r;
                default:
                    throw new UnsupportedOperationException();
            }
            return q;
        }

        static {
            ProtoShowMetadata protoShowMetadata = new ProtoShowMetadata();
            q = protoShowMetadata;
            protoShowMetadata.e();
        }

        public static ProtoShowMetadata o() {
            return q;
        }

        public static fkr<ProtoShowMetadata> parser() {
            return q.c();
        }

        static /* synthetic */ void a(ProtoShowMetadata protoShowMetadata, String str) {
            if (str != null) {
                protoShowMetadata.j |= 1;
                protoShowMetadata.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ProtoShowMetadata protoShowMetadata, String str) {
            if (str != null) {
                protoShowMetadata.j |= 2;
                protoShowMetadata.e = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void c(ProtoShowMetadata protoShowMetadata, String str) {
            if (str != null) {
                protoShowMetadata.j |= 4;
                protoShowMetadata.f = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoShowMetadata protoShowMetadata, int i2) {
            protoShowMetadata.j |= 8;
            protoShowMetadata.k = i2;
        }

        static /* synthetic */ void d(ProtoShowMetadata protoShowMetadata, String str) {
            if (str != null) {
                protoShowMetadata.j |= 16;
                protoShowMetadata.g = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void e(ProtoShowMetadata protoShowMetadata, String str) {
            if (str != null) {
                protoShowMetadata.j |= 32;
                protoShowMetadata.l = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoShowMetadata protoShowMetadata, boolean z) {
            protoShowMetadata.j |= 64;
            protoShowMetadata.m = z;
        }

        static /* synthetic */ void a(ProtoShowMetadata protoShowMetadata, ProtoImageGroup protoImageGroup) {
            if (protoImageGroup != null) {
                protoShowMetadata.n = protoImageGroup;
                protoShowMetadata.j |= 128;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ProtoShowMetadata protoShowMetadata, int i2) {
            protoShowMetadata.j |= 256;
            protoShowMetadata.o = i2;
        }

        static /* synthetic */ void f(ProtoShowMetadata protoShowMetadata, String str) {
            if (str != null) {
                protoShowMetadata.j |= 512;
                protoShowMetadata.h = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void c(ProtoShowMetadata protoShowMetadata, int i2) {
            protoShowMetadata.j |= 1024;
            protoShowMetadata.i = i2;
        }

        static /* synthetic */ void a(ProtoShowMetadata protoShowMetadata, Iterable iterable) {
            if (!protoShowMetadata.p.a()) {
                protoShowMetadata.p = GeneratedMessageLite.a(protoShowMetadata.p);
            }
            fjx.a(iterable, protoShowMetadata.p);
        }
    }
}
