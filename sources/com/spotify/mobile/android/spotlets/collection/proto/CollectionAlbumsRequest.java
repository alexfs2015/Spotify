package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata.ProtoAlbumMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumOfflineState;
import java.io.IOException;

public final class CollectionAlbumsRequest {

    public static final class ProtoCollectionAlbumsItem extends GeneratedMessageLite<ProtoCollectionAlbumsItem, a> implements ipd {
        /* access modifiers changed from: private */
        public static final ProtoCollectionAlbumsItem k;
        private static volatile fkr<ProtoCollectionAlbumsItem> l;
        public String d = "";
        public int e;
        private int f;
        private int g;
        private ProtoAlbumMetadata h;
        private ProtoAlbumCollectionState i;
        private ProtoAlbumOfflineState j;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoCollectionAlbumsItem, a> implements ipd {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoCollectionAlbumsItem.k);
            }

            public final a a(String str) {
                b();
                ProtoCollectionAlbumsItem.a((ProtoCollectionAlbumsItem) this.a, str);
                return this;
            }

            public final a a(int i) {
                b();
                ProtoCollectionAlbumsItem.a((ProtoCollectionAlbumsItem) this.a, 0);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoCollectionAlbumsItem.b((ProtoCollectionAlbumsItem) this.a, 0);
                return this;
            }

            public final a a(ProtoAlbumMetadata protoAlbumMetadata) {
                b();
                ProtoCollectionAlbumsItem.a((ProtoCollectionAlbumsItem) this.a, protoAlbumMetadata);
                return this;
            }

            public final a a(ProtoAlbumCollectionState protoAlbumCollectionState) {
                b();
                ProtoCollectionAlbumsItem.a((ProtoCollectionAlbumsItem) this.a, protoAlbumCollectionState);
                return this;
            }
        }

        private ProtoCollectionAlbumsItem() {
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

        public final ProtoAlbumMetadata m() {
            ProtoAlbumMetadata protoAlbumMetadata = this.h;
            return protoAlbumMetadata == null ? ProtoAlbumMetadata.n() : protoAlbumMetadata;
        }

        public final boolean n() {
            return (this.f & 16) == 16;
        }

        public final ProtoAlbumCollectionState o() {
            ProtoAlbumCollectionState protoAlbumCollectionState = this.i;
            return protoAlbumCollectionState == null ? ProtoAlbumCollectionState.l() : protoAlbumCollectionState;
        }

        public final boolean p() {
            return (this.f & 32) == 32;
        }

        public final ProtoAlbumOfflineState q() {
            ProtoAlbumOfflineState protoAlbumOfflineState = this.j;
            return protoAlbumOfflineState == null ? ProtoAlbumOfflineState.k() : protoAlbumOfflineState;
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
                    return new ProtoCollectionAlbumsItem();
                case IS_INITIALIZED:
                    return k;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoCollectionAlbumsItem protoCollectionAlbumsItem = (ProtoCollectionAlbumsItem) obj2;
                    this.d = fVar.a(k(), this.d, protoCollectionAlbumsItem.k(), protoCollectionAlbumsItem.d);
                    this.g = fVar.a(t(), this.g, protoCollectionAlbumsItem.t(), protoCollectionAlbumsItem.g);
                    this.e = fVar.a(u(), this.e, protoCollectionAlbumsItem.u(), protoCollectionAlbumsItem.e);
                    this.h = (ProtoAlbumMetadata) fVar.a(this.h, protoCollectionAlbumsItem.h);
                    this.i = (ProtoAlbumCollectionState) fVar.a(this.i, protoCollectionAlbumsItem.i);
                    this.j = (ProtoAlbumOfflineState) fVar.a(this.j, protoCollectionAlbumsItem.j);
                    if (fVar == e.a) {
                        this.f |= protoCollectionAlbumsItem.f;
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
                                    com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata.ProtoAlbumMetadata.a aVar = (this.f & 8) == 8 ? (com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata.ProtoAlbumMetadata.a) this.h.h() : null;
                                    this.h = (ProtoAlbumMetadata) fkc.a(ProtoAlbumMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.h);
                                        this.h = (ProtoAlbumMetadata) aVar.e();
                                    }
                                    this.f |= 8;
                                } else if (a2 == 42) {
                                    com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumCollectionState.a aVar2 = (this.f & 16) == 16 ? (com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumCollectionState.a) this.i.h() : null;
                                    this.i = (ProtoAlbumCollectionState) fkc.a(ProtoAlbumCollectionState.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.i);
                                        this.i = (ProtoAlbumCollectionState) aVar2.e();
                                    }
                                    this.f |= 16;
                                } else if (a2 == 50) {
                                    com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumOfflineState.a aVar3 = (this.f & 32) == 32 ? (com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumOfflineState.a) this.j.h() : null;
                                    this.j = (ProtoAlbumOfflineState) fkc.a(ProtoAlbumOfflineState.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a(this.j);
                                        this.j = (ProtoAlbumOfflineState) aVar3.e();
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
                        synchronized (ProtoCollectionAlbumsItem.class) {
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
            ProtoCollectionAlbumsItem protoCollectionAlbumsItem = new ProtoCollectionAlbumsItem();
            k = protoCollectionAlbumsItem;
            protoCollectionAlbumsItem.e();
        }

        public static fkr<ProtoCollectionAlbumsItem> parser() {
            return k.c();
        }

        static /* synthetic */ void a(ProtoCollectionAlbumsItem protoCollectionAlbumsItem, String str) {
            if (str != null) {
                protoCollectionAlbumsItem.f |= 1;
                protoCollectionAlbumsItem.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoCollectionAlbumsItem protoCollectionAlbumsItem, int i2) {
            protoCollectionAlbumsItem.f |= 2;
            protoCollectionAlbumsItem.g = i2;
        }

        static /* synthetic */ void b(ProtoCollectionAlbumsItem protoCollectionAlbumsItem, int i2) {
            protoCollectionAlbumsItem.f |= 4;
            protoCollectionAlbumsItem.e = i2;
        }

        static /* synthetic */ void a(ProtoCollectionAlbumsItem protoCollectionAlbumsItem, ProtoAlbumMetadata protoAlbumMetadata) {
            if (protoAlbumMetadata != null) {
                protoCollectionAlbumsItem.h = protoAlbumMetadata;
                protoCollectionAlbumsItem.f |= 8;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoCollectionAlbumsItem protoCollectionAlbumsItem, ProtoAlbumCollectionState protoAlbumCollectionState) {
            if (protoAlbumCollectionState != null) {
                protoCollectionAlbumsItem.i = protoAlbumCollectionState;
                protoCollectionAlbumsItem.f |= 16;
                return;
            }
            throw new NullPointerException();
        }
    }

    public static final class ProtoCollectionAlbumsResponse extends GeneratedMessageLite<ProtoCollectionAlbumsResponse, a> implements ipe {
        /* access modifiers changed from: private */
        public static final ProtoCollectionAlbumsResponse i;
        private static volatile fkr<ProtoCollectionAlbumsResponse> j;
        public e<ProtoCollectionAlbumsItem> d = fks.d();
        public int e;
        public int f;
        public boolean g;
        private int h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoCollectionAlbumsResponse, a> implements ipe {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoCollectionAlbumsResponse.i);
            }

            public final a a(Iterable<? extends ProtoCollectionAlbumsItem> iterable) {
                b();
                ProtoCollectionAlbumsResponse.a((ProtoCollectionAlbumsResponse) this.a, (Iterable) iterable);
                return this;
            }

            public final a a(int i) {
                b();
                ProtoCollectionAlbumsResponse.a((ProtoCollectionAlbumsResponse) this.a, i);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoCollectionAlbumsResponse.b((ProtoCollectionAlbumsResponse) this.a, i);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoCollectionAlbumsResponse.a((ProtoCollectionAlbumsResponse) this.a, z);
                return this;
            }
        }

        private ProtoCollectionAlbumsResponse() {
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

        public static ProtoCollectionAlbumsResponse a(byte[] bArr) {
            return (ProtoCollectionAlbumsResponse) GeneratedMessageLite.a(i, bArr);
        }

        public static a l() {
            return (a) i.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoCollectionAlbumsResponse();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoCollectionAlbumsResponse protoCollectionAlbumsResponse = (ProtoCollectionAlbumsResponse) obj2;
                    this.d = fVar.a(this.d, protoCollectionAlbumsResponse.d);
                    this.e = fVar.a(n(), this.e, protoCollectionAlbumsResponse.n(), protoCollectionAlbumsResponse.e);
                    this.f = fVar.a(o(), this.f, protoCollectionAlbumsResponse.o(), protoCollectionAlbumsResponse.f);
                    this.g = fVar.a(p(), this.g, protoCollectionAlbumsResponse.p(), protoCollectionAlbumsResponse.g);
                    if (fVar == e.a) {
                        this.h |= protoCollectionAlbumsResponse.h;
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
                                    this.d.add(fkc.a(ProtoCollectionAlbumsItem.parser(), fke));
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
                        synchronized (ProtoCollectionAlbumsResponse.class) {
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
            ProtoCollectionAlbumsResponse protoCollectionAlbumsResponse = new ProtoCollectionAlbumsResponse();
            i = protoCollectionAlbumsResponse;
            protoCollectionAlbumsResponse.e();
        }

        public static fkr<ProtoCollectionAlbumsResponse> parser() {
            return i.c();
        }

        static /* synthetic */ void a(ProtoCollectionAlbumsResponse protoCollectionAlbumsResponse, Iterable iterable) {
            if (!protoCollectionAlbumsResponse.d.a()) {
                protoCollectionAlbumsResponse.d = GeneratedMessageLite.a(protoCollectionAlbumsResponse.d);
            }
            fjx.a(iterable, protoCollectionAlbumsResponse.d);
        }

        static /* synthetic */ void a(ProtoCollectionAlbumsResponse protoCollectionAlbumsResponse, int i2) {
            protoCollectionAlbumsResponse.h |= 1;
            protoCollectionAlbumsResponse.e = i2;
        }

        static /* synthetic */ void b(ProtoCollectionAlbumsResponse protoCollectionAlbumsResponse, int i2) {
            protoCollectionAlbumsResponse.h |= 2;
            protoCollectionAlbumsResponse.f = i2;
        }

        static /* synthetic */ void a(ProtoCollectionAlbumsResponse protoCollectionAlbumsResponse, boolean z) {
            protoCollectionAlbumsResponse.h |= 4;
            protoCollectionAlbumsResponse.g = z;
        }
    }
}
