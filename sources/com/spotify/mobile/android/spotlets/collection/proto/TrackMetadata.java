package com.spotify.mobile.android.spotlets.collection.proto;

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

public final class TrackMetadata {

    public static final class ProtoTrackAlbumArtistMetadata extends GeneratedMessageLite<ProtoTrackAlbumArtistMetadata, a> implements ipq {
        /* access modifiers changed from: private */
        public static final ProtoTrackAlbumArtistMetadata g;
        private static volatile fkr<ProtoTrackAlbumArtistMetadata> h;
        public String d;
        public String e;
        private int f;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoTrackAlbumArtistMetadata, a> implements ipq {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoTrackAlbumArtistMetadata.g);
            }

            public final a a(String str) {
                b();
                ProtoTrackAlbumArtistMetadata.a((ProtoTrackAlbumArtistMetadata) this.a, str);
                return this;
            }

            public final a b(String str) {
                b();
                ProtoTrackAlbumArtistMetadata.b((ProtoTrackAlbumArtistMetadata) this.a, str);
                return this;
            }
        }

        private ProtoTrackAlbumArtistMetadata() {
            String str = "";
            this.d = str;
            this.e = str;
        }

        private boolean n() {
            return (this.f & 1) == 1;
        }

        private boolean o() {
            return (this.f & 2) == 2;
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

        public static a k() {
            return (a) g.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoTrackAlbumArtistMetadata();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoTrackAlbumArtistMetadata protoTrackAlbumArtistMetadata = (ProtoTrackAlbumArtistMetadata) obj2;
                    this.d = fVar.a(n(), this.d, protoTrackAlbumArtistMetadata.n(), protoTrackAlbumArtistMetadata.d);
                    this.e = fVar.a(o(), this.e, protoTrackAlbumArtistMetadata.o(), protoTrackAlbumArtistMetadata.e);
                    if (fVar == e.a) {
                        this.f |= protoTrackAlbumArtistMetadata.f;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    String c = fkc.c();
                                    this.f |= 1;
                                    this.d = c;
                                } else if (a2 == 18) {
                                    String c2 = fkc.c();
                                    this.f |= 2;
                                    this.e = c2;
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
                        synchronized (ProtoTrackAlbumArtistMetadata.class) {
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
            ProtoTrackAlbumArtistMetadata protoTrackAlbumArtistMetadata = new ProtoTrackAlbumArtistMetadata();
            g = protoTrackAlbumArtistMetadata;
            protoTrackAlbumArtistMetadata.e();
        }

        public static ProtoTrackAlbumArtistMetadata l() {
            return g;
        }

        public static fkr<ProtoTrackAlbumArtistMetadata> parser() {
            return g.c();
        }

        static /* synthetic */ void a(ProtoTrackAlbumArtistMetadata protoTrackAlbumArtistMetadata, String str) {
            if (str != null) {
                protoTrackAlbumArtistMetadata.f |= 1;
                protoTrackAlbumArtistMetadata.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ProtoTrackAlbumArtistMetadata protoTrackAlbumArtistMetadata, String str) {
            if (str != null) {
                protoTrackAlbumArtistMetadata.f |= 2;
                protoTrackAlbumArtistMetadata.e = str;
                return;
            }
            throw new NullPointerException();
        }
    }

    public static final class ProtoTrackAlbumMetadata extends GeneratedMessageLite<ProtoTrackAlbumMetadata, a> implements ipr {
        /* access modifiers changed from: private */
        public static final ProtoTrackAlbumMetadata i;
        private static volatile fkr<ProtoTrackAlbumMetadata> j;
        public String d;
        public String e;
        private int f;
        private ProtoTrackAlbumArtistMetadata g;
        private ProtoImageGroup h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoTrackAlbumMetadata, a> implements ipr {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoTrackAlbumMetadata.i);
            }

            public final a a(ProtoTrackAlbumArtistMetadata protoTrackAlbumArtistMetadata) {
                b();
                ProtoTrackAlbumMetadata.a((ProtoTrackAlbumMetadata) this.a, protoTrackAlbumArtistMetadata);
                return this;
            }

            public final a a(String str) {
                b();
                ProtoTrackAlbumMetadata.a((ProtoTrackAlbumMetadata) this.a, str);
                return this;
            }

            public final a b(String str) {
                b();
                ProtoTrackAlbumMetadata.b((ProtoTrackAlbumMetadata) this.a, str);
                return this;
            }

            public final a a(ProtoImageGroup protoImageGroup) {
                b();
                ProtoTrackAlbumMetadata.a((ProtoTrackAlbumMetadata) this.a, protoImageGroup);
                return this;
            }
        }

        private ProtoTrackAlbumMetadata() {
            String str = "";
            this.d = str;
            this.e = str;
        }

        public final boolean k() {
            return (this.f & 1) == 1;
        }

        public final ProtoTrackAlbumArtistMetadata l() {
            ProtoTrackAlbumArtistMetadata protoTrackAlbumArtistMetadata = this.g;
            return protoTrackAlbumArtistMetadata == null ? ProtoTrackAlbumArtistMetadata.l() : protoTrackAlbumArtistMetadata;
        }

        private boolean r() {
            return (this.f & 2) == 2;
        }

        private boolean s() {
            return (this.f & 4) == 4;
        }

        public final boolean m() {
            return (this.f & 8) == 8;
        }

        public final ProtoImageGroup n() {
            ProtoImageGroup protoImageGroup = this.h;
            return protoImageGroup == null ? ProtoImageGroup.l() : protoImageGroup;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.f & 1) == 1) {
                codedOutputStream.a(1, (fko) l());
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.a(2, this.d);
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.a(3, this.e);
            }
            if ((this.f & 8) == 8) {
                codedOutputStream.a(4, (fko) n());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.f & 1) == 1) {
                i3 = 0 + CodedOutputStream.b(1, (fko) l());
            }
            if ((this.f & 2) == 2) {
                i3 += CodedOutputStream.b(2, this.d);
            }
            if ((this.f & 4) == 4) {
                i3 += CodedOutputStream.b(3, this.e);
            }
            if ((this.f & 8) == 8) {
                i3 += CodedOutputStream.b(4, (fko) n());
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a o() {
            return (a) i.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoTrackAlbumMetadata();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoTrackAlbumMetadata protoTrackAlbumMetadata = (ProtoTrackAlbumMetadata) obj2;
                    this.g = (ProtoTrackAlbumArtistMetadata) fVar.a(this.g, protoTrackAlbumMetadata.g);
                    this.d = fVar.a(r(), this.d, protoTrackAlbumMetadata.r(), protoTrackAlbumMetadata.d);
                    this.e = fVar.a(s(), this.e, protoTrackAlbumMetadata.s(), protoTrackAlbumMetadata.e);
                    this.h = (ProtoImageGroup) fVar.a(this.h, protoTrackAlbumMetadata.h);
                    if (fVar == e.a) {
                        this.f |= protoTrackAlbumMetadata.f;
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
                                    a aVar = (this.f & 1) == 1 ? (a) this.g.h() : null;
                                    this.g = (ProtoTrackAlbumArtistMetadata) fkc.a(ProtoTrackAlbumArtistMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.g);
                                        this.g = (ProtoTrackAlbumArtistMetadata) aVar.e();
                                    }
                                    this.f |= 1;
                                } else if (a2 == 18) {
                                    String c = fkc.c();
                                    this.f |= 2;
                                    this.d = c;
                                } else if (a2 == 26) {
                                    String c2 = fkc.c();
                                    this.f |= 4;
                                    this.e = c2;
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a aVar2 = (this.f & 8) == 8 ? (com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a) this.h.h() : null;
                                    this.h = (ProtoImageGroup) fkc.a(ProtoImageGroup.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.h);
                                        this.h = (ProtoImageGroup) aVar2.e();
                                    }
                                    this.f |= 8;
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
                        synchronized (ProtoTrackAlbumMetadata.class) {
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
            ProtoTrackAlbumMetadata protoTrackAlbumMetadata = new ProtoTrackAlbumMetadata();
            i = protoTrackAlbumMetadata;
            protoTrackAlbumMetadata.e();
        }

        public static ProtoTrackAlbumMetadata p() {
            return i;
        }

        public static fkr<ProtoTrackAlbumMetadata> parser() {
            return i.c();
        }

        static /* synthetic */ void a(ProtoTrackAlbumMetadata protoTrackAlbumMetadata, ProtoTrackAlbumArtistMetadata protoTrackAlbumArtistMetadata) {
            if (protoTrackAlbumArtistMetadata != null) {
                protoTrackAlbumMetadata.g = protoTrackAlbumArtistMetadata;
                protoTrackAlbumMetadata.f |= 1;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoTrackAlbumMetadata protoTrackAlbumMetadata, String str) {
            if (str != null) {
                protoTrackAlbumMetadata.f |= 2;
                protoTrackAlbumMetadata.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ProtoTrackAlbumMetadata protoTrackAlbumMetadata, String str) {
            if (str != null) {
                protoTrackAlbumMetadata.f |= 4;
                protoTrackAlbumMetadata.e = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoTrackAlbumMetadata protoTrackAlbumMetadata, ProtoImageGroup protoImageGroup) {
            if (protoImageGroup != null) {
                protoTrackAlbumMetadata.h = protoImageGroup;
                protoTrackAlbumMetadata.f |= 8;
                return;
            }
            throw new NullPointerException();
        }
    }

    public static final class ProtoTrackArtistMetadata extends GeneratedMessageLite<ProtoTrackArtistMetadata, a> implements ips {
        /* access modifiers changed from: private */
        public static final ProtoTrackArtistMetadata h;
        private static volatile fkr<ProtoTrackArtistMetadata> i;
        public String d;
        public String e;
        private int f;
        private ProtoImageGroup g;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoTrackArtistMetadata, a> implements ips {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoTrackArtistMetadata.h);
            }

            public final a a(String str) {
                b();
                ProtoTrackArtistMetadata.a((ProtoTrackArtistMetadata) this.a, str);
                return this;
            }

            public final a b(String str) {
                b();
                ProtoTrackArtistMetadata.b((ProtoTrackArtistMetadata) this.a, str);
                return this;
            }
        }

        private ProtoTrackArtistMetadata() {
            String str = "";
            this.d = str;
            this.e = str;
        }

        private boolean n() {
            return (this.f & 1) == 1;
        }

        private boolean o() {
            return (this.f & 2) == 2;
        }

        public final ProtoImageGroup k() {
            ProtoImageGroup protoImageGroup = this.g;
            return protoImageGroup == null ? ProtoImageGroup.l() : protoImageGroup;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.f & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.a(2, this.e);
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.a(3, (fko) k());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.f & 1) == 1) {
                i3 = 0 + CodedOutputStream.b(1, this.d);
            }
            if ((this.f & 2) == 2) {
                i3 += CodedOutputStream.b(2, this.e);
            }
            if ((this.f & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fko) k());
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a l() {
            return (a) h.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoTrackArtistMetadata();
                case IS_INITIALIZED:
                    return h;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoTrackArtistMetadata protoTrackArtistMetadata = (ProtoTrackArtistMetadata) obj2;
                    this.d = fVar.a(n(), this.d, protoTrackArtistMetadata.n(), protoTrackArtistMetadata.d);
                    this.e = fVar.a(o(), this.e, protoTrackArtistMetadata.o(), protoTrackArtistMetadata.e);
                    this.g = (ProtoImageGroup) fVar.a(this.g, protoTrackArtistMetadata.g);
                    if (fVar == e.a) {
                        this.f |= protoTrackArtistMetadata.f;
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
                                    this.f |= 1;
                                    this.d = c;
                                } else if (a2 == 18) {
                                    String c2 = fkc.c();
                                    this.f |= 2;
                                    this.e = c2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a aVar = (this.f & 4) == 4 ? (com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a) this.g.h() : null;
                                    this.g = (ProtoImageGroup) fkc.a(ProtoImageGroup.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.g);
                                        this.g = (ProtoImageGroup) aVar.e();
                                    }
                                    this.f |= 4;
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
                    if (i == null) {
                        synchronized (ProtoTrackArtistMetadata.class) {
                            if (i == null) {
                                i = new b(h);
                            }
                        }
                    }
                    return i;
                default:
                    throw new UnsupportedOperationException();
            }
            return h;
        }

        static {
            ProtoTrackArtistMetadata protoTrackArtistMetadata = new ProtoTrackArtistMetadata();
            h = protoTrackArtistMetadata;
            protoTrackArtistMetadata.e();
        }

        public static fkr<ProtoTrackArtistMetadata> parser() {
            return h.c();
        }

        static /* synthetic */ void a(ProtoTrackArtistMetadata protoTrackArtistMetadata, String str) {
            if (str != null) {
                protoTrackArtistMetadata.f |= 1;
                protoTrackArtistMetadata.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ProtoTrackArtistMetadata protoTrackArtistMetadata, String str) {
            if (str != null) {
                protoTrackArtistMetadata.f |= 2;
                protoTrackArtistMetadata.e = str;
                return;
            }
            throw new NullPointerException();
        }
    }

    public static final class ProtoTrackMetadata extends GeneratedMessageLite<ProtoTrackMetadata, a> implements ipt {
        /* access modifiers changed from: private */
        public static final ProtoTrackMetadata s;
        private static volatile fkr<ProtoTrackMetadata> t;
        public e<ProtoTrackArtistMetadata> d = fks.d();
        public String e;
        public String f;
        public int g;
        public boolean h;
        public boolean i;
        public String j;
        public boolean k;
        public boolean l;
        public boolean m;
        public String n;
        private int o;
        private ProtoTrackAlbumMetadata p;
        private int q;
        private int r;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoTrackMetadata, a> implements ipt {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoTrackMetadata.s);
            }

            public final a a(ProtoTrackAlbumMetadata protoTrackAlbumMetadata) {
                b();
                ProtoTrackMetadata.a((ProtoTrackMetadata) this.a, protoTrackAlbumMetadata);
                return this;
            }

            public final a a(Iterable<? extends ProtoTrackArtistMetadata> iterable) {
                b();
                ProtoTrackMetadata.a((ProtoTrackMetadata) this.a, (Iterable) iterable);
                return this;
            }

            public final a a(String str) {
                b();
                ProtoTrackMetadata.a((ProtoTrackMetadata) this.a, str);
                return this;
            }

            public final a b(String str) {
                b();
                ProtoTrackMetadata.b((ProtoTrackMetadata) this.a, str);
                return this;
            }

            public final a a(int i) {
                b();
                ProtoTrackMetadata.a((ProtoTrackMetadata) this.a, i);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoTrackMetadata.a((ProtoTrackMetadata) this.a, z);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoTrackMetadata.b((ProtoTrackMetadata) this.a, 0);
                return this;
            }

            public final a c(int i) {
                b();
                ProtoTrackMetadata.c((ProtoTrackMetadata) this.a, 0);
                return this;
            }

            public final a b(boolean z) {
                b();
                ProtoTrackMetadata.b((ProtoTrackMetadata) this.a, z);
                return this;
            }

            public final a c(String str) {
                b();
                ProtoTrackMetadata.c((ProtoTrackMetadata) this.a, str);
                return this;
            }

            public final a c(boolean z) {
                b();
                ProtoTrackMetadata.c((ProtoTrackMetadata) this.a, z);
                return this;
            }

            public final a d(boolean z) {
                b();
                ProtoTrackMetadata.d((ProtoTrackMetadata) this.a, z);
                return this;
            }

            public final a d(String str) {
                b();
                ProtoTrackMetadata.d((ProtoTrackMetadata) this.a, str);
                return this;
            }
        }

        private ProtoTrackMetadata() {
            String str = "";
            this.e = str;
            this.f = str;
            this.j = str;
            this.n = str;
        }

        public final boolean k() {
            return (this.o & 1) == 1;
        }

        public final ProtoTrackAlbumMetadata l() {
            ProtoTrackAlbumMetadata protoTrackAlbumMetadata = this.p;
            return protoTrackAlbumMetadata == null ? ProtoTrackAlbumMetadata.p() : protoTrackAlbumMetadata;
        }

        public final int m() {
            return this.d.size();
        }

        private boolean q() {
            return (this.o & 2) == 2;
        }

        private boolean r() {
            return (this.o & 4) == 4;
        }

        private boolean s() {
            return (this.o & 8) == 8;
        }

        private boolean t() {
            return (this.o & 16) == 16;
        }

        private boolean u() {
            return (this.o & 32) == 32;
        }

        private boolean v() {
            return (this.o & 64) == 64;
        }

        private boolean w() {
            return (this.o & 128) == 128;
        }

        private boolean x() {
            return (this.o & 256) == 256;
        }

        private boolean y() {
            return (this.o & 512) == 512;
        }

        private boolean z() {
            return (this.o & 1024) == 1024;
        }

        private boolean A() {
            return (this.o & 2048) == 2048;
        }

        private boolean B() {
            return (this.o & 4096) == 4096;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.o & 1) == 1) {
                codedOutputStream.a(1, (fko) l());
            }
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                codedOutputStream.a(2, (fko) this.d.get(i2));
            }
            if ((this.o & 2) == 2) {
                codedOutputStream.a(3, this.e);
            }
            if ((this.o & 4) == 4) {
                codedOutputStream.a(4, this.f);
            }
            if ((this.o & 8) == 8) {
                codedOutputStream.c(5, this.g);
            }
            if ((this.o & 16) == 16) {
                codedOutputStream.a(6, this.h);
            }
            if ((this.o & 32) == 32) {
                codedOutputStream.c(7, this.q);
            }
            if ((this.o & 64) == 64) {
                codedOutputStream.c(8, this.r);
            }
            if ((this.o & 128) == 128) {
                codedOutputStream.a(9, this.i);
            }
            if ((this.o & 256) == 256) {
                codedOutputStream.a(10, this.j);
            }
            if ((this.o & 512) == 512) {
                codedOutputStream.a(11, this.k);
            }
            if ((this.o & 1024) == 1024) {
                codedOutputStream.a(13, this.l);
            }
            if ((this.o & 2048) == 2048) {
                codedOutputStream.a(14, this.m);
            }
            if ((this.o & 4096) == 4096) {
                codedOutputStream.a(16, this.n);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int b = (this.o & 1) == 1 ? CodedOutputStream.b(1, (fko) l()) + 0 : 0;
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                b += CodedOutputStream.b(2, (fko) this.d.get(i3));
            }
            if ((this.o & 2) == 2) {
                b += CodedOutputStream.b(3, this.e);
            }
            if ((this.o & 4) == 4) {
                b += CodedOutputStream.b(4, this.f);
            }
            if ((this.o & 8) == 8) {
                b += CodedOutputStream.g(5, this.g);
            }
            if ((this.o & 16) == 16) {
                b += CodedOutputStream.b(6, this.h);
            }
            if ((this.o & 32) == 32) {
                b += CodedOutputStream.g(7, this.q);
            }
            if ((this.o & 64) == 64) {
                b += CodedOutputStream.g(8, this.r);
            }
            if ((this.o & 128) == 128) {
                b += CodedOutputStream.b(9, this.i);
            }
            if ((this.o & 256) == 256) {
                b += CodedOutputStream.b(10, this.j);
            }
            if ((this.o & 512) == 512) {
                b += CodedOutputStream.b(11, this.k);
            }
            if ((this.o & 1024) == 1024) {
                b += CodedOutputStream.b(13, this.l);
            }
            if ((this.o & 2048) == 2048) {
                b += CodedOutputStream.b(14, this.m);
            }
            if ((this.o & 4096) == 4096) {
                b += CodedOutputStream.b(16, this.n);
            }
            int d2 = b + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a n() {
            return (a) s.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoTrackMetadata();
                case IS_INITIALIZED:
                    return s;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoTrackMetadata protoTrackMetadata = (ProtoTrackMetadata) obj2;
                    this.p = (ProtoTrackAlbumMetadata) fVar.a(this.p, protoTrackMetadata.p);
                    this.d = fVar.a(this.d, protoTrackMetadata.d);
                    this.e = fVar.a(q(), this.e, protoTrackMetadata.q(), protoTrackMetadata.e);
                    this.f = fVar.a(r(), this.f, protoTrackMetadata.r(), protoTrackMetadata.f);
                    this.g = fVar.a(s(), this.g, protoTrackMetadata.s(), protoTrackMetadata.g);
                    this.h = fVar.a(t(), this.h, protoTrackMetadata.t(), protoTrackMetadata.h);
                    this.q = fVar.a(u(), this.q, protoTrackMetadata.u(), protoTrackMetadata.q);
                    this.r = fVar.a(v(), this.r, protoTrackMetadata.v(), protoTrackMetadata.r);
                    this.i = fVar.a(w(), this.i, protoTrackMetadata.w(), protoTrackMetadata.i);
                    this.j = fVar.a(x(), this.j, protoTrackMetadata.x(), protoTrackMetadata.j);
                    this.k = fVar.a(y(), this.k, protoTrackMetadata.y(), protoTrackMetadata.k);
                    this.l = fVar.a(z(), this.l, protoTrackMetadata.z(), protoTrackMetadata.l);
                    this.m = fVar.a(A(), this.m, protoTrackMetadata.A(), protoTrackMetadata.m);
                    this.n = fVar.a(B(), this.n, protoTrackMetadata.B(), protoTrackMetadata.n);
                    if (fVar == e.a) {
                        this.o |= protoTrackMetadata.o;
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
                                    a aVar = (this.o & 1) == 1 ? (a) this.p.h() : null;
                                    this.p = (ProtoTrackAlbumMetadata) fkc.a(ProtoTrackAlbumMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.p);
                                        this.p = (ProtoTrackAlbumMetadata) aVar.e();
                                    }
                                    this.o |= 1;
                                    break;
                                case 18:
                                    if (!this.d.a()) {
                                        this.d = GeneratedMessageLite.a(this.d);
                                    }
                                    this.d.add(fkc.a(ProtoTrackArtistMetadata.parser(), fke));
                                    break;
                                case 26:
                                    String c = fkc.c();
                                    this.o |= 2;
                                    this.e = c;
                                    break;
                                case 34:
                                    String c2 = fkc.c();
                                    this.o |= 4;
                                    this.f = c2;
                                    break;
                                case 40:
                                    this.o |= 8;
                                    this.g = fkc.g();
                                    break;
                                case 48:
                                    this.o |= 16;
                                    this.h = fkc.b();
                                    break;
                                case 56:
                                    this.o |= 32;
                                    this.q = fkc.g();
                                    break;
                                case b.bs /*64*/:
                                    this.o |= 64;
                                    this.r = fkc.g();
                                    break;
                                case b.bA /*72*/:
                                    this.o |= 128;
                                    this.i = fkc.b();
                                    break;
                                case 82:
                                    String c3 = fkc.c();
                                    this.o |= 256;
                                    this.j = c3;
                                    break;
                                case 88:
                                    this.o |= 512;
                                    this.k = fkc.b();
                                    break;
                                case 104:
                                    this.o |= 1024;
                                    this.l = fkc.b();
                                    break;
                                case ContentType.LONG_FORM_ON_DEMAND /*112*/:
                                    this.o |= 2048;
                                    this.m = fkc.b();
                                    break;
                                case 130:
                                    String c4 = fkc.c();
                                    this.o |= 4096;
                                    this.n = c4;
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
                    if (t == null) {
                        synchronized (ProtoTrackMetadata.class) {
                            if (t == null) {
                                t = new b(s);
                            }
                        }
                    }
                    return t;
                default:
                    throw new UnsupportedOperationException();
            }
            return s;
        }

        static {
            ProtoTrackMetadata protoTrackMetadata = new ProtoTrackMetadata();
            s = protoTrackMetadata;
            protoTrackMetadata.e();
        }

        public static ProtoTrackMetadata o() {
            return s;
        }

        public static fkr<ProtoTrackMetadata> parser() {
            return s.c();
        }

        static /* synthetic */ void a(ProtoTrackMetadata protoTrackMetadata, ProtoTrackAlbumMetadata protoTrackAlbumMetadata) {
            if (protoTrackAlbumMetadata != null) {
                protoTrackMetadata.p = protoTrackAlbumMetadata;
                protoTrackMetadata.o |= 1;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoTrackMetadata protoTrackMetadata, Iterable iterable) {
            if (!protoTrackMetadata.d.a()) {
                protoTrackMetadata.d = GeneratedMessageLite.a(protoTrackMetadata.d);
            }
            fjx.a(iterable, protoTrackMetadata.d);
        }

        static /* synthetic */ void a(ProtoTrackMetadata protoTrackMetadata, String str) {
            if (str != null) {
                protoTrackMetadata.o |= 2;
                protoTrackMetadata.e = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ProtoTrackMetadata protoTrackMetadata, String str) {
            if (str != null) {
                protoTrackMetadata.o |= 4;
                protoTrackMetadata.f = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoTrackMetadata protoTrackMetadata, int i2) {
            protoTrackMetadata.o |= 8;
            protoTrackMetadata.g = i2;
        }

        static /* synthetic */ void a(ProtoTrackMetadata protoTrackMetadata, boolean z) {
            protoTrackMetadata.o |= 16;
            protoTrackMetadata.h = z;
        }

        static /* synthetic */ void b(ProtoTrackMetadata protoTrackMetadata, int i2) {
            protoTrackMetadata.o |= 32;
            protoTrackMetadata.q = i2;
        }

        static /* synthetic */ void c(ProtoTrackMetadata protoTrackMetadata, int i2) {
            protoTrackMetadata.o |= 64;
            protoTrackMetadata.r = i2;
        }

        static /* synthetic */ void b(ProtoTrackMetadata protoTrackMetadata, boolean z) {
            protoTrackMetadata.o |= 128;
            protoTrackMetadata.i = z;
        }

        static /* synthetic */ void c(ProtoTrackMetadata protoTrackMetadata, String str) {
            if (str != null) {
                protoTrackMetadata.o |= 256;
                protoTrackMetadata.j = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void c(ProtoTrackMetadata protoTrackMetadata, boolean z) {
            protoTrackMetadata.o |= 512;
            protoTrackMetadata.k = z;
        }

        static /* synthetic */ void d(ProtoTrackMetadata protoTrackMetadata, boolean z) {
            protoTrackMetadata.o |= 2048;
            protoTrackMetadata.m = z;
        }

        static /* synthetic */ void d(ProtoTrackMetadata protoTrackMetadata, String str) {
            if (str != null) {
                protoTrackMetadata.o |= 4096;
                protoTrackMetadata.n = str;
                return;
            }
            throw new NullPointerException();
        }
    }
}
