package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata.ProtoArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistOfflineState;
import java.io.IOException;

public final class CollectionArtistsRequest {

    public static final class ProtoCollectionArtistsItem extends GeneratedMessageLite<ProtoCollectionArtistsItem, a> implements ipf {
        /* access modifiers changed from: private */
        public static final ProtoCollectionArtistsItem k;
        private static volatile fkr<ProtoCollectionArtistsItem> l;
        public String d = "";
        public int e;
        private int f;
        private int g;
        private ProtoArtistMetadata h;
        private ProtoArtistCollectionState i;
        private ProtoArtistOfflineState j;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoCollectionArtistsItem, a> implements ipf {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoCollectionArtistsItem.k);
            }

            public final a a(String str) {
                b();
                ProtoCollectionArtistsItem.a((ProtoCollectionArtistsItem) this.a, str);
                return this;
            }

            public final a a(int i) {
                b();
                ProtoCollectionArtistsItem.a((ProtoCollectionArtistsItem) this.a, 0);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoCollectionArtistsItem.b((ProtoCollectionArtistsItem) this.a, 0);
                return this;
            }

            public final a a(ProtoArtistMetadata protoArtistMetadata) {
                b();
                ProtoCollectionArtistsItem.a((ProtoCollectionArtistsItem) this.a, protoArtistMetadata);
                return this;
            }

            public final a a(ProtoArtistCollectionState protoArtistCollectionState) {
                b();
                ProtoCollectionArtistsItem.a((ProtoCollectionArtistsItem) this.a, protoArtistCollectionState);
                return this;
            }
        }

        private ProtoCollectionArtistsItem() {
        }

        public final boolean k() {
            return (this.f & 1) == 1;
        }

        private boolean t() {
            return (this.f & 2) == 2;
        }

        private boolean u() {
            return (this.f & 4) == 4;
        }

        public final boolean l() {
            return (this.f & 8) == 8;
        }

        public final ProtoArtistMetadata m() {
            ProtoArtistMetadata protoArtistMetadata = this.h;
            return protoArtistMetadata == null ? ProtoArtistMetadata.n() : protoArtistMetadata;
        }

        public final boolean n() {
            return (this.f & 16) == 16;
        }

        public final ProtoArtistCollectionState o() {
            ProtoArtistCollectionState protoArtistCollectionState = this.i;
            return protoArtistCollectionState == null ? ProtoArtistCollectionState.l() : protoArtistCollectionState;
        }

        public final boolean p() {
            return (this.f & 32) == 32;
        }

        public final ProtoArtistOfflineState q() {
            ProtoArtistOfflineState protoArtistOfflineState = this.j;
            return protoArtistOfflineState == null ? ProtoArtistOfflineState.k() : protoArtistOfflineState;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.f & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.c(2, this.g);
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.c(3, this.e);
            }
            if ((this.f & 8) == 8) {
                codedOutputStream.a(4, (fko) m());
            }
            if ((this.f & 16) == 16) {
                codedOutputStream.a(5, (fko) o());
            }
            if ((this.f & 32) == 32) {
                codedOutputStream.a(6, (fko) q());
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
                i3 += CodedOutputStream.g(2, this.g);
            }
            if ((this.f & 4) == 4) {
                i3 += CodedOutputStream.g(3, this.e);
            }
            if ((this.f & 8) == 8) {
                i3 += CodedOutputStream.b(4, (fko) m());
            }
            if ((this.f & 16) == 16) {
                i3 += CodedOutputStream.b(5, (fko) o());
            }
            if ((this.f & 32) == 32) {
                i3 += CodedOutputStream.b(6, (fko) q());
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a r() {
            return (a) k.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoCollectionArtistsItem();
                case IS_INITIALIZED:
                    return k;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoCollectionArtistsItem protoCollectionArtistsItem = (ProtoCollectionArtistsItem) obj2;
                    this.d = fVar.a(k(), this.d, protoCollectionArtistsItem.k(), protoCollectionArtistsItem.d);
                    this.g = fVar.a(t(), this.g, protoCollectionArtistsItem.t(), protoCollectionArtistsItem.g);
                    this.e = fVar.a(u(), this.e, protoCollectionArtistsItem.u(), protoCollectionArtistsItem.e);
                    this.h = (ProtoArtistMetadata) fVar.a(this.h, protoCollectionArtistsItem.h);
                    this.i = (ProtoArtistCollectionState) fVar.a(this.i, protoCollectionArtistsItem.i);
                    this.j = (ProtoArtistOfflineState) fVar.a(this.j, protoCollectionArtistsItem.j);
                    if (fVar == e.a) {
                        this.f |= protoCollectionArtistsItem.f;
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
                                } else if (a2 == 16) {
                                    this.f |= 2;
                                    this.g = fkc.g();
                                } else if (a2 == 24) {
                                    this.f |= 4;
                                    this.e = fkc.g();
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata.ProtoArtistMetadata.a aVar = (this.f & 8) == 8 ? (com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata.ProtoArtistMetadata.a) this.h.h() : null;
                                    this.h = (ProtoArtistMetadata) fkc.a(ProtoArtistMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.h);
                                        this.h = (ProtoArtistMetadata) aVar.e();
                                    }
                                    this.f |= 8;
                                } else if (a2 == 42) {
                                    com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistCollectionState.a aVar2 = (this.f & 16) == 16 ? (com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistCollectionState.a) this.i.h() : null;
                                    this.i = (ProtoArtistCollectionState) fkc.a(ProtoArtistCollectionState.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.i);
                                        this.i = (ProtoArtistCollectionState) aVar2.e();
                                    }
                                    this.f |= 16;
                                } else if (a2 == 50) {
                                    com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistOfflineState.a aVar3 = (this.f & 32) == 32 ? (com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistOfflineState.a) this.j.h() : null;
                                    this.j = (ProtoArtistOfflineState) fkc.a(ProtoArtistOfflineState.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a(this.j);
                                        this.j = (ProtoArtistOfflineState) aVar3.e();
                                    }
                                    this.f |= 32;
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
                    if (l == null) {
                        synchronized (ProtoCollectionArtistsItem.class) {
                            if (l == null) {
                                l = new b(k);
                            }
                        }
                    }
                    return l;
                default:
                    throw new UnsupportedOperationException();
            }
            return k;
        }

        static {
            ProtoCollectionArtistsItem protoCollectionArtistsItem = new ProtoCollectionArtistsItem();
            k = protoCollectionArtistsItem;
            protoCollectionArtistsItem.e();
        }

        public static fkr<ProtoCollectionArtistsItem> parser() {
            return k.c();
        }

        static /* synthetic */ void a(ProtoCollectionArtistsItem protoCollectionArtistsItem, String str) {
            if (str != null) {
                protoCollectionArtistsItem.f |= 1;
                protoCollectionArtistsItem.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoCollectionArtistsItem protoCollectionArtistsItem, int i2) {
            protoCollectionArtistsItem.f |= 2;
            protoCollectionArtistsItem.g = i2;
        }

        static /* synthetic */ void b(ProtoCollectionArtistsItem protoCollectionArtistsItem, int i2) {
            protoCollectionArtistsItem.f |= 4;
            protoCollectionArtistsItem.e = i2;
        }

        static /* synthetic */ void a(ProtoCollectionArtistsItem protoCollectionArtistsItem, ProtoArtistMetadata protoArtistMetadata) {
            if (protoArtistMetadata != null) {
                protoCollectionArtistsItem.h = protoArtistMetadata;
                protoCollectionArtistsItem.f |= 8;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoCollectionArtistsItem protoCollectionArtistsItem, ProtoArtistCollectionState protoArtistCollectionState) {
            if (protoArtistCollectionState != null) {
                protoCollectionArtistsItem.i = protoArtistCollectionState;
                protoCollectionArtistsItem.f |= 16;
                return;
            }
            throw new NullPointerException();
        }
    }

    public static final class ProtoCollectionArtistsResponse extends GeneratedMessageLite<ProtoCollectionArtistsResponse, a> implements ipg {
        /* access modifiers changed from: private */
        public static final ProtoCollectionArtistsResponse i;
        private static volatile fkr<ProtoCollectionArtistsResponse> j;
        public e<ProtoCollectionArtistsItem> d = fks.d();
        public int e;
        public int f;
        public boolean g;
        private int h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoCollectionArtistsResponse, a> implements ipg {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoCollectionArtistsResponse.i);
            }

            public final a a(Iterable<? extends ProtoCollectionArtistsItem> iterable) {
                b();
                ProtoCollectionArtistsResponse.a((ProtoCollectionArtistsResponse) this.a, (Iterable) iterable);
                return this;
            }

            public final a a(int i) {
                b();
                ProtoCollectionArtistsResponse.a((ProtoCollectionArtistsResponse) this.a, i);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoCollectionArtistsResponse.b((ProtoCollectionArtistsResponse) this.a, i);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoCollectionArtistsResponse.a((ProtoCollectionArtistsResponse) this.a, z);
                return this;
            }
        }

        private ProtoCollectionArtistsResponse() {
        }

        public final int k() {
            return this.d.size();
        }

        private boolean n() {
            return (this.h & 1) == 1;
        }

        private boolean o() {
            return (this.h & 2) == 2;
        }

        private boolean p() {
            return (this.h & 4) == 4;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                codedOutputStream.a(1, (fko) this.d.get(i2));
            }
            if ((this.h & 1) == 1) {
                codedOutputStream.c(2, this.e);
            }
            if ((this.h & 2) == 2) {
                codedOutputStream.c(3, this.f);
            }
            if ((this.h & 4) == 4) {
                codedOutputStream.a(4, this.g);
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
            if ((this.h & 1) == 1) {
                i3 += CodedOutputStream.g(2, this.e);
            }
            if ((this.h & 2) == 2) {
                i3 += CodedOutputStream.g(3, this.f);
            }
            if ((this.h & 4) == 4) {
                i3 += CodedOutputStream.b(4, this.g);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static ProtoCollectionArtistsResponse a(byte[] bArr) {
            return (ProtoCollectionArtistsResponse) GeneratedMessageLite.a(i, bArr);
        }

        public static a l() {
            return (a) i.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoCollectionArtistsResponse();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoCollectionArtistsResponse protoCollectionArtistsResponse = (ProtoCollectionArtistsResponse) obj2;
                    this.d = fVar.a(this.d, protoCollectionArtistsResponse.d);
                    this.e = fVar.a(n(), this.e, protoCollectionArtistsResponse.n(), protoCollectionArtistsResponse.e);
                    this.f = fVar.a(o(), this.f, protoCollectionArtistsResponse.o(), protoCollectionArtistsResponse.f);
                    this.g = fVar.a(p(), this.g, protoCollectionArtistsResponse.p(), protoCollectionArtistsResponse.g);
                    if (fVar == e.a) {
                        this.h |= protoCollectionArtistsResponse.h;
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
                                    this.d.add(fkc.a(ProtoCollectionArtistsItem.parser(), fke));
                                } else if (a2 == 16) {
                                    this.h |= 1;
                                    this.e = fkc.g();
                                } else if (a2 == 24) {
                                    this.h |= 2;
                                    this.f = fkc.g();
                                } else if (a2 == 32) {
                                    this.h |= 4;
                                    this.g = fkc.b();
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
                        synchronized (ProtoCollectionArtistsResponse.class) {
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
            ProtoCollectionArtistsResponse protoCollectionArtistsResponse = new ProtoCollectionArtistsResponse();
            i = protoCollectionArtistsResponse;
            protoCollectionArtistsResponse.e();
        }

        public static fkr<ProtoCollectionArtistsResponse> parser() {
            return i.c();
        }

        static /* synthetic */ void a(ProtoCollectionArtistsResponse protoCollectionArtistsResponse, Iterable iterable) {
            if (!protoCollectionArtistsResponse.d.a()) {
                protoCollectionArtistsResponse.d = GeneratedMessageLite.a(protoCollectionArtistsResponse.d);
            }
            fjx.a(iterable, protoCollectionArtistsResponse.d);
        }

        static /* synthetic */ void a(ProtoCollectionArtistsResponse protoCollectionArtistsResponse, int i2) {
            protoCollectionArtistsResponse.h |= 1;
            protoCollectionArtistsResponse.e = i2;
        }

        static /* synthetic */ void b(ProtoCollectionArtistsResponse protoCollectionArtistsResponse, int i2) {
            protoCollectionArtistsResponse.h |= 2;
            protoCollectionArtistsResponse.f = i2;
        }

        static /* synthetic */ void a(ProtoCollectionArtistsResponse protoCollectionArtistsResponse, boolean z) {
            protoCollectionArtistsResponse.h |= 4;
            protoCollectionArtistsResponse.g = z;
        }
    }
}
