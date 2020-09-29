package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup;
import java.io.IOException;

public final class AlbumMetadata {

    public static final class ProtoAlbumArtistMetadata extends GeneratedMessageLite<ProtoAlbumArtistMetadata, a> implements irj {
        /* access modifiers changed from: private */
        public static final ProtoAlbumArtistMetadata g;
        private static volatile fll<ProtoAlbumArtistMetadata> h;
        public String d;
        public String e;
        private int f;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoAlbumArtistMetadata, a> implements irj {
            private a() {
                super(ProtoAlbumArtistMetadata.g);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(String str) {
                b();
                ProtoAlbumArtistMetadata.a((ProtoAlbumArtistMetadata) this.a, str);
                return this;
            }

            public final a b(String str) {
                b();
                ProtoAlbumArtistMetadata.b((ProtoAlbumArtistMetadata) this.a, str);
                return this;
            }
        }

        static {
            ProtoAlbumArtistMetadata protoAlbumArtistMetadata = new ProtoAlbumArtistMetadata();
            g = protoAlbumArtistMetadata;
            protoAlbumArtistMetadata.e();
        }

        private ProtoAlbumArtistMetadata() {
            String str = "";
            this.d = str;
            this.e = str;
        }

        static /* synthetic */ void a(ProtoAlbumArtistMetadata protoAlbumArtistMetadata, String str) {
            if (str != null) {
                protoAlbumArtistMetadata.f |= 1;
                protoAlbumArtistMetadata.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ProtoAlbumArtistMetadata protoAlbumArtistMetadata, String str) {
            if (str != null) {
                protoAlbumArtistMetadata.f |= 2;
                protoAlbumArtistMetadata.e = str;
                return;
            }
            throw new NullPointerException();
        }

        public static a k() {
            return (a) g.h();
        }

        private boolean m() {
            return (this.f & 1) == 1;
        }

        private boolean n() {
            if ((this.f & 2) != 2) {
                return false;
            }
            boolean z = true | true;
            return true;
        }

        public static fll<ProtoAlbumArtistMetadata> parser() {
            return g.c();
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoAlbumArtistMetadata();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoAlbumArtistMetadata protoAlbumArtistMetadata = (ProtoAlbumArtistMetadata) obj2;
                    this.d = fVar.a(m(), this.d, protoAlbumArtistMetadata.m(), protoAlbumArtistMetadata.d);
                    this.e = fVar.a(n(), this.e, protoAlbumArtistMetadata.n(), protoAlbumArtistMetadata.e);
                    if (fVar == e.a) {
                        this.f |= protoAlbumArtistMetadata.f;
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
                                    this.f |= 1;
                                    this.d = c;
                                } else if (a2 == 18) {
                                    String c2 = fkw.c();
                                    this.f |= 2;
                                    this.e = c2;
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
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    break;
                case GET_DEFAULT_INSTANCE:
                    break;
                case GET_PARSER:
                    if (h == null) {
                        Class<ProtoAlbumArtistMetadata> cls = ProtoAlbumArtistMetadata.class;
                        synchronized (ProtoAlbumArtistMetadata.class) {
                            try {
                                if (h == null) {
                                    h = new b(g);
                                }
                            } catch (Throwable th2) {
                                throw th2;
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
            if ((this.f & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.a(2, this.e);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f & 1) == 1) {
                i2 = 0 + CodedOutputStream.b(1, this.d);
            }
            if ((this.f & 2) == 2) {
                i2 += CodedOutputStream.b(2, this.e);
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }
    }

    public static final class ProtoAlbumMetadata extends GeneratedMessageLite<ProtoAlbumMetadata, a> implements irk {
        /* access modifiers changed from: private */
        public static final ProtoAlbumMetadata n;
        private static volatile fll<ProtoAlbumMetadata> o;
        public e<ProtoAlbumArtistMetadata> d = flm.d();
        public String e;
        public String f;
        public String g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        private int l;
        private ProtoImageGroup m;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoAlbumMetadata, a> implements irk {
            private a() {
                super(ProtoAlbumMetadata.n);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(int i) {
                b();
                ProtoAlbumMetadata.a((ProtoAlbumMetadata) this.a, i);
                return this;
            }

            public final a a(ProtoImageGroup protoImageGroup) {
                b();
                ProtoAlbumMetadata.a((ProtoAlbumMetadata) this.a, protoImageGroup);
                return this;
            }

            public final a a(Iterable<? extends ProtoAlbumArtistMetadata> iterable) {
                b();
                ProtoAlbumMetadata.a((ProtoAlbumMetadata) this.a, (Iterable) iterable);
                return this;
            }

            public final a a(String str) {
                b();
                ProtoAlbumMetadata.a((ProtoAlbumMetadata) this.a, str);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoAlbumMetadata.a((ProtoAlbumMetadata) this.a, z);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoAlbumMetadata.b((ProtoAlbumMetadata) this.a, i);
                return this;
            }

            public final a b(String str) {
                b();
                ProtoAlbumMetadata.b((ProtoAlbumMetadata) this.a, str);
                return this;
            }

            public final a c(int i) {
                b();
                ProtoAlbumMetadata.c((ProtoAlbumMetadata) this.a, i);
                return this;
            }

            public final a c(String str) {
                b();
                ProtoAlbumMetadata.c((ProtoAlbumMetadata) this.a, str);
                return this;
            }
        }

        static {
            ProtoAlbumMetadata protoAlbumMetadata = new ProtoAlbumMetadata();
            n = protoAlbumMetadata;
            protoAlbumMetadata.e();
        }

        private ProtoAlbumMetadata() {
            String str = "";
            this.e = str;
            this.f = str;
            this.g = str;
        }

        static /* synthetic */ void a(ProtoAlbumMetadata protoAlbumMetadata, int i2) {
            protoAlbumMetadata.l |= 16;
            protoAlbumMetadata.h = i2;
        }

        static /* synthetic */ void a(ProtoAlbumMetadata protoAlbumMetadata, ProtoImageGroup protoImageGroup) {
            if (protoImageGroup != null) {
                protoAlbumMetadata.m = protoImageGroup;
                protoAlbumMetadata.l |= 8;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoAlbumMetadata protoAlbumMetadata, Iterable iterable) {
            if (!protoAlbumMetadata.d.a()) {
                protoAlbumMetadata.d = GeneratedMessageLite.a(protoAlbumMetadata.d);
            }
            fkr.a(iterable, protoAlbumMetadata.d);
        }

        static /* synthetic */ void a(ProtoAlbumMetadata protoAlbumMetadata, String str) {
            if (str != null) {
                protoAlbumMetadata.l |= 1;
                protoAlbumMetadata.e = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoAlbumMetadata protoAlbumMetadata, boolean z) {
            protoAlbumMetadata.l |= 128;
            protoAlbumMetadata.k = z;
        }

        static /* synthetic */ void b(ProtoAlbumMetadata protoAlbumMetadata, int i2) {
            protoAlbumMetadata.l |= 32;
            protoAlbumMetadata.i = i2;
        }

        static /* synthetic */ void b(ProtoAlbumMetadata protoAlbumMetadata, String str) {
            if (str != null) {
                protoAlbumMetadata.l |= 2;
                protoAlbumMetadata.f = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void c(ProtoAlbumMetadata protoAlbumMetadata, int i2) {
            protoAlbumMetadata.l |= 64;
            protoAlbumMetadata.j = i2;
        }

        static /* synthetic */ void c(ProtoAlbumMetadata protoAlbumMetadata, String str) {
            if (str != null) {
                protoAlbumMetadata.l |= 4;
                protoAlbumMetadata.g = str;
                return;
            }
            throw new NullPointerException();
        }

        public static a m() {
            return (a) n.h();
        }

        public static ProtoAlbumMetadata n() {
            return n;
        }

        private boolean p() {
            return (this.l & 1) == 1;
        }

        public static fll<ProtoAlbumMetadata> parser() {
            return n.c();
        }

        private boolean q() {
            return (this.l & 2) == 2;
        }

        private boolean r() {
            return (this.l & 4) == 4;
        }

        private boolean s() {
            return (this.l & 16) == 16;
        }

        private boolean t() {
            return (this.l & 32) == 32;
        }

        private boolean u() {
            return (this.l & 64) == 64;
        }

        private boolean v() {
            return (this.l & 128) == 128;
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoAlbumMetadata();
                case IS_INITIALIZED:
                    return n;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoAlbumMetadata protoAlbumMetadata = (ProtoAlbumMetadata) obj2;
                    this.d = fVar.a(this.d, protoAlbumMetadata.d);
                    this.e = fVar.a(p(), this.e, protoAlbumMetadata.p(), protoAlbumMetadata.e);
                    this.f = fVar.a(q(), this.f, protoAlbumMetadata.q(), protoAlbumMetadata.f);
                    this.g = fVar.a(r(), this.g, protoAlbumMetadata.r(), protoAlbumMetadata.g);
                    this.m = (ProtoImageGroup) fVar.a(this.m, protoAlbumMetadata.m);
                    this.h = fVar.a(s(), this.h, protoAlbumMetadata.s(), protoAlbumMetadata.h);
                    this.i = fVar.a(t(), this.i, protoAlbumMetadata.t(), protoAlbumMetadata.i);
                    this.j = fVar.a(u(), this.j, protoAlbumMetadata.u(), protoAlbumMetadata.j);
                    this.k = fVar.a(v(), this.k, protoAlbumMetadata.v(), protoAlbumMetadata.k);
                    if (fVar == e.a) {
                        this.l |= protoAlbumMetadata.l;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    if (!this.d.a()) {
                                        this.d = GeneratedMessageLite.a(this.d);
                                    }
                                    this.d.add(fkw.a(ProtoAlbumArtistMetadata.parser(), fky));
                                } else if (a2 == 18) {
                                    String c = fkw.c();
                                    this.l |= 1;
                                    this.e = c;
                                } else if (a2 == 26) {
                                    String c2 = fkw.c();
                                    this.l |= 2;
                                    this.f = c2;
                                } else if (a2 == 34) {
                                    String c3 = fkw.c();
                                    this.l |= 4;
                                    this.g = c3;
                                } else if (a2 == 42) {
                                    com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a aVar = (this.l & 8) == 8 ? (com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a) this.m.h() : null;
                                    this.m = (ProtoImageGroup) fkw.a(ProtoImageGroup.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.m);
                                        this.m = (ProtoImageGroup) aVar.e();
                                    }
                                    this.l |= 8;
                                } else if (a2 == 48) {
                                    this.l |= 16;
                                    this.h = fkw.g();
                                } else if (a2 == 56) {
                                    this.l |= 32;
                                    this.i = fkw.g();
                                } else if (a2 == 64) {
                                    this.l |= 64;
                                    this.j = fkw.g();
                                } else if (a2 == 72) {
                                    this.l |= 128;
                                    this.k = fkw.b();
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
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    break;
                case GET_DEFAULT_INSTANCE:
                    break;
                case GET_PARSER:
                    if (o == null) {
                        Class<ProtoAlbumMetadata> cls = ProtoAlbumMetadata.class;
                        synchronized (ProtoAlbumMetadata.class) {
                            try {
                                if (o == null) {
                                    o = new b(n);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return o;
                default:
                    throw new UnsupportedOperationException();
            }
            return n;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                codedOutputStream.a(1, (fli) this.d.get(i2));
            }
            if ((this.l & 1) == 1) {
                codedOutputStream.a(2, this.e);
            }
            if ((this.l & 2) == 2) {
                codedOutputStream.a(3, this.f);
            }
            if ((this.l & 4) == 4) {
                codedOutputStream.a(4, this.g);
            }
            if ((this.l & 8) == 8) {
                codedOutputStream.a(5, (fli) l());
            }
            if ((this.l & 16) == 16) {
                codedOutputStream.c(6, this.h);
            }
            if ((this.l & 32) == 32) {
                codedOutputStream.c(7, this.i);
            }
            if ((this.l & 64) == 64) {
                codedOutputStream.c(8, this.j);
            }
            if ((this.l & 128) == 128) {
                codedOutputStream.a(9, this.k);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.d.size(); i4++) {
                i3 += CodedOutputStream.b(1, (fli) this.d.get(i4));
            }
            if ((this.l & 1) == 1) {
                i3 += CodedOutputStream.b(2, this.e);
            }
            if ((this.l & 2) == 2) {
                i3 += CodedOutputStream.b(3, this.f);
            }
            if ((this.l & 4) == 4) {
                i3 += CodedOutputStream.b(4, this.g);
            }
            if ((this.l & 8) == 8) {
                i3 += CodedOutputStream.b(5, (fli) l());
            }
            if ((this.l & 16) == 16) {
                i3 += CodedOutputStream.g(6, this.h);
            }
            if ((this.l & 32) == 32) {
                i3 += CodedOutputStream.g(7, this.i);
            }
            if ((this.l & 64) == 64) {
                i3 += CodedOutputStream.g(8, this.j);
            }
            if ((this.l & 128) == 128) {
                i3 += CodedOutputStream.b(9, this.k);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final boolean k() {
            return (this.l & 8) == 8;
        }

        public final ProtoImageGroup l() {
            ProtoImageGroup protoImageGroup = this.m;
            if (protoImageGroup == null) {
                protoImageGroup = ProtoImageGroup.l();
            }
            return protoImageGroup;
        }
    }
}
