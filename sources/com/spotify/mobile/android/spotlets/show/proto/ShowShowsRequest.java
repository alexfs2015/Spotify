package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.spotlets.show.proto.ShowMetadata.ProtoShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowPlayState;
import java.io.IOException;

public final class ShowShowsRequest {

    public static final class ProtoShowsRequestItem extends GeneratedMessageLite<ProtoShowsRequestItem, a> implements jdi {
        /* access modifiers changed from: private */
        public static final ProtoShowsRequestItem m;
        private static volatile fkr<ProtoShowsRequestItem> n;
        public int d;
        public boolean e;
        public long f;
        private int g;
        private String h = "";
        private ProtoShowMetadata i;
        private ProtoShowCollectionState j;
        private ProtoShowPlayState k;
        private int l;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoShowsRequestItem, a> implements jdi {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoShowsRequestItem.m);
            }

            public final a a(ProtoShowMetadata protoShowMetadata) {
                b();
                ProtoShowsRequestItem.a((ProtoShowsRequestItem) this.a, protoShowMetadata);
                return this;
            }

            public final a a(ProtoShowCollectionState protoShowCollectionState) {
                b();
                ProtoShowsRequestItem.a((ProtoShowsRequestItem) this.a, protoShowCollectionState);
                return this;
            }

            public final a a(ProtoShowPlayState protoShowPlayState) {
                b();
                ProtoShowsRequestItem.a((ProtoShowsRequestItem) this.a, protoShowPlayState);
                return this;
            }

            public final a a(int i) {
                b();
                ProtoShowsRequestItem.a((ProtoShowsRequestItem) this.a, i);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoShowsRequestItem.a((ProtoShowsRequestItem) this.a, z);
                return this;
            }

            public final a a(long j) {
                b();
                ProtoShowsRequestItem.a((ProtoShowsRequestItem) this.a, j);
                return this;
            }
        }

        private ProtoShowsRequestItem() {
        }

        private boolean s() {
            return (this.g & 1) == 1;
        }

        public final boolean k() {
            return (this.g & 2) == 2;
        }

        public final ProtoShowMetadata l() {
            ProtoShowMetadata protoShowMetadata = this.i;
            return protoShowMetadata == null ? ProtoShowMetadata.o() : protoShowMetadata;
        }

        public final boolean m() {
            return (this.g & 4) == 4;
        }

        public final ProtoShowCollectionState n() {
            ProtoShowCollectionState protoShowCollectionState = this.j;
            return protoShowCollectionState == null ? ProtoShowCollectionState.l() : protoShowCollectionState;
        }

        public final boolean o() {
            return (this.g & 8) == 8;
        }

        public final ProtoShowPlayState p() {
            ProtoShowPlayState protoShowPlayState = this.k;
            return protoShowPlayState == null ? ProtoShowPlayState.l() : protoShowPlayState;
        }

        private boolean t() {
            return (this.g & 16) == 16;
        }

        private boolean u() {
            return (this.g & 32) == 32;
        }

        private boolean v() {
            return (this.g & 64) == 64;
        }

        private boolean w() {
            return (this.g & 128) == 128;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.g & 1) == 1) {
                codedOutputStream.a(1, this.h);
            }
            if ((this.g & 2) == 2) {
                codedOutputStream.a(2, (fko) l());
            }
            if ((this.g & 4) == 4) {
                codedOutputStream.a(3, (fko) n());
            }
            if ((this.g & 8) == 8) {
                codedOutputStream.a(4, (fko) p());
            }
            if ((this.g & 16) == 16) {
                codedOutputStream.c(5, this.l);
            }
            if ((this.g & 32) == 32) {
                codedOutputStream.c(6, this.d);
            }
            if ((this.g & 64) == 64) {
                codedOutputStream.a(7, this.e);
            }
            if ((this.g & 128) == 128) {
                codedOutputStream.a(8, this.f);
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
                i3 = 0 + CodedOutputStream.b(1, this.h);
            }
            if ((this.g & 2) == 2) {
                i3 += CodedOutputStream.b(2, (fko) l());
            }
            if ((this.g & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fko) n());
            }
            if ((this.g & 8) == 8) {
                i3 += CodedOutputStream.b(4, (fko) p());
            }
            if ((this.g & 16) == 16) {
                i3 += CodedOutputStream.g(5, this.l);
            }
            if ((this.g & 32) == 32) {
                i3 += CodedOutputStream.g(6, this.d);
            }
            if ((this.g & 64) == 64) {
                i3 += CodedOutputStream.b(7, this.e);
            }
            if ((this.g & 128) == 128) {
                i3 += CodedOutputStream.d(8, this.f);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a q() {
            return (a) m.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoShowsRequestItem();
                case IS_INITIALIZED:
                    return m;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoShowsRequestItem protoShowsRequestItem = (ProtoShowsRequestItem) obj2;
                    this.h = fVar.a(s(), this.h, protoShowsRequestItem.s(), protoShowsRequestItem.h);
                    this.i = (ProtoShowMetadata) fVar.a(this.i, protoShowsRequestItem.i);
                    this.j = (ProtoShowCollectionState) fVar.a(this.j, protoShowsRequestItem.j);
                    this.k = (ProtoShowPlayState) fVar.a(this.k, protoShowsRequestItem.k);
                    this.l = fVar.a(t(), this.l, protoShowsRequestItem.t(), protoShowsRequestItem.l);
                    this.d = fVar.a(u(), this.d, protoShowsRequestItem.u(), protoShowsRequestItem.d);
                    this.e = fVar.a(v(), this.e, protoShowsRequestItem.v(), protoShowsRequestItem.e);
                    this.f = fVar.a(w(), this.f, protoShowsRequestItem.w(), protoShowsRequestItem.f);
                    if (fVar == e.a) {
                        this.g |= protoShowsRequestItem.g;
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
                                    this.h = c;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.show.proto.ShowMetadata.ProtoShowMetadata.a aVar = (this.g & 2) == 2 ? (com.spotify.mobile.android.spotlets.show.proto.ShowMetadata.ProtoShowMetadata.a) this.i.h() : null;
                                    this.i = (ProtoShowMetadata) fkc.a(ProtoShowMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.i);
                                        this.i = (ProtoShowMetadata) aVar.e();
                                    }
                                    this.g |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowCollectionState.a aVar2 = (this.g & 4) == 4 ? (com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowCollectionState.a) this.j.h() : null;
                                    this.j = (ProtoShowCollectionState) fkc.a(ProtoShowCollectionState.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.j);
                                        this.j = (ProtoShowCollectionState) aVar2.e();
                                    }
                                    this.g |= 4;
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowPlayState.a aVar3 = (this.g & 8) == 8 ? (com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowPlayState.a) this.k.h() : null;
                                    this.k = (ProtoShowPlayState) fkc.a(ProtoShowPlayState.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a(this.k);
                                        this.k = (ProtoShowPlayState) aVar3.e();
                                    }
                                    this.g |= 8;
                                } else if (a2 == 40) {
                                    this.g |= 16;
                                    this.l = fkc.g();
                                } else if (a2 == 48) {
                                    this.g |= 32;
                                    this.d = fkc.g();
                                } else if (a2 == 56) {
                                    this.g |= 64;
                                    this.e = fkc.b();
                                } else if (a2 == 64) {
                                    this.g |= 128;
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
                    if (n == null) {
                        synchronized (ProtoShowsRequestItem.class) {
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

        static {
            ProtoShowsRequestItem protoShowsRequestItem = new ProtoShowsRequestItem();
            m = protoShowsRequestItem;
            protoShowsRequestItem.e();
        }

        public static fkr<ProtoShowsRequestItem> parser() {
            return m.c();
        }

        static /* synthetic */ void a(ProtoShowsRequestItem protoShowsRequestItem, ProtoShowMetadata protoShowMetadata) {
            if (protoShowMetadata != null) {
                protoShowsRequestItem.i = protoShowMetadata;
                protoShowsRequestItem.g |= 2;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoShowsRequestItem protoShowsRequestItem, ProtoShowCollectionState protoShowCollectionState) {
            if (protoShowCollectionState != null) {
                protoShowsRequestItem.j = protoShowCollectionState;
                protoShowsRequestItem.g |= 4;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoShowsRequestItem protoShowsRequestItem, ProtoShowPlayState protoShowPlayState) {
            if (protoShowPlayState != null) {
                protoShowsRequestItem.k = protoShowPlayState;
                protoShowsRequestItem.g |= 8;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoShowsRequestItem protoShowsRequestItem, int i2) {
            protoShowsRequestItem.g |= 32;
            protoShowsRequestItem.d = i2;
        }

        static /* synthetic */ void a(ProtoShowsRequestItem protoShowsRequestItem, boolean z) {
            protoShowsRequestItem.g |= 64;
            protoShowsRequestItem.e = z;
        }

        static /* synthetic */ void a(ProtoShowsRequestItem protoShowsRequestItem, long j2) {
            protoShowsRequestItem.g |= 128;
            protoShowsRequestItem.f = j2;
        }
    }

    public static final class ProtoShowsResponse extends GeneratedMessageLite<ProtoShowsResponse, a> implements jdj {
        /* access modifiers changed from: private */
        public static final ProtoShowsResponse j;
        private static volatile fkr<ProtoShowsResponse> k;
        public e<ProtoShowsRequestItem> d = fks.d();
        public int e;
        public int f;
        public int g;
        public boolean h;
        private int i;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoShowsResponse, a> implements jdj {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoShowsResponse.j);
            }

            public final a a(Iterable<? extends ProtoShowsRequestItem> iterable) {
                b();
                ProtoShowsResponse.a((ProtoShowsResponse) this.a, (Iterable) iterable);
                return this;
            }

            public final a a(int i) {
                b();
                ProtoShowsResponse.a((ProtoShowsResponse) this.a, i);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoShowsResponse.b((ProtoShowsResponse) this.a, i);
                return this;
            }

            public final a c(int i) {
                b();
                ProtoShowsResponse.c((ProtoShowsResponse) this.a, i);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoShowsResponse.a((ProtoShowsResponse) this.a, z);
                return this;
            }
        }

        private ProtoShowsResponse() {
        }

        public final int k() {
            return this.d.size();
        }

        private boolean n() {
            return (this.i & 1) == 1;
        }

        private boolean o() {
            return (this.i & 2) == 2;
        }

        private boolean p() {
            return (this.i & 4) == 4;
        }

        private boolean q() {
            return (this.i & 8) == 8;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                codedOutputStream.a(1, (fko) this.d.get(i2));
            }
            if ((this.i & 1) == 1) {
                codedOutputStream.c(2, this.e);
            }
            if ((this.i & 2) == 2) {
                codedOutputStream.c(3, this.f);
            }
            if ((this.i & 4) == 4) {
                codedOutputStream.c(4, this.g);
            }
            if ((this.i & 8) == 8) {
                codedOutputStream.a(5, this.h);
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
                i3 += CodedOutputStream.b(1, (fko) this.d.get(i4));
            }
            if ((this.i & 1) == 1) {
                i3 += CodedOutputStream.g(2, this.e);
            }
            if ((this.i & 2) == 2) {
                i3 += CodedOutputStream.g(3, this.f);
            }
            if ((this.i & 4) == 4) {
                i3 += CodedOutputStream.g(4, this.g);
            }
            if ((this.i & 8) == 8) {
                i3 += CodedOutputStream.b(5, this.h);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static ProtoShowsResponse a(byte[] bArr) {
            return (ProtoShowsResponse) GeneratedMessageLite.a(j, bArr);
        }

        public static a l() {
            return (a) j.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoShowsResponse();
                case IS_INITIALIZED:
                    return j;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoShowsResponse protoShowsResponse = (ProtoShowsResponse) obj2;
                    this.d = fVar.a(this.d, protoShowsResponse.d);
                    this.e = fVar.a(n(), this.e, protoShowsResponse.n(), protoShowsResponse.e);
                    this.f = fVar.a(o(), this.f, protoShowsResponse.o(), protoShowsResponse.f);
                    this.g = fVar.a(p(), this.g, protoShowsResponse.p(), protoShowsResponse.g);
                    this.h = fVar.a(q(), this.h, protoShowsResponse.q(), protoShowsResponse.h);
                    if (fVar == e.a) {
                        this.i |= protoShowsResponse.i;
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
                                    if (!this.d.a()) {
                                        this.d = GeneratedMessageLite.a(this.d);
                                    }
                                    this.d.add(fkc.a(ProtoShowsRequestItem.parser(), fke));
                                } else if (a2 == 16) {
                                    this.i |= 1;
                                    this.e = fkc.g();
                                } else if (a2 == 24) {
                                    this.i |= 2;
                                    this.f = fkc.g();
                                } else if (a2 == 32) {
                                    this.i |= 4;
                                    this.g = fkc.g();
                                } else if (a2 == 40) {
                                    this.i |= 8;
                                    this.h = fkc.b();
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
                    if (k == null) {
                        synchronized (ProtoShowsResponse.class) {
                            if (k == null) {
                                k = new b(j);
                            }
                        }
                    }
                    return k;
                default:
                    throw new UnsupportedOperationException();
            }
            return j;
        }

        static {
            ProtoShowsResponse protoShowsResponse = new ProtoShowsResponse();
            j = protoShowsResponse;
            protoShowsResponse.e();
        }

        public static fkr<ProtoShowsResponse> parser() {
            return j.c();
        }

        static /* synthetic */ void a(ProtoShowsResponse protoShowsResponse, Iterable iterable) {
            if (!protoShowsResponse.d.a()) {
                protoShowsResponse.d = GeneratedMessageLite.a(protoShowsResponse.d);
            }
            fjx.a(iterable, protoShowsResponse.d);
        }

        static /* synthetic */ void a(ProtoShowsResponse protoShowsResponse, int i2) {
            protoShowsResponse.i |= 1;
            protoShowsResponse.e = i2;
        }

        static /* synthetic */ void b(ProtoShowsResponse protoShowsResponse, int i2) {
            protoShowsResponse.i |= 2;
            protoShowsResponse.f = i2;
        }

        static /* synthetic */ void c(ProtoShowsResponse protoShowsResponse, int i2) {
            protoShowsResponse.i |= 4;
            protoShowsResponse.g = i2;
        }

        static /* synthetic */ void a(ProtoShowsResponse protoShowsResponse, boolean z) {
            protoShowsResponse.i |= 8;
            protoShowsResponse.h = z;
        }
    }
}
