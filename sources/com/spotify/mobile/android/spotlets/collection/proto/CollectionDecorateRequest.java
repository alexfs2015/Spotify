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
import com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata.ProtoArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState;
import java.io.IOException;

public final class CollectionDecorateRequest {

    public static final class ProtoDecorateAlbumItem extends GeneratedMessageLite<ProtoDecorateAlbumItem, a> implements iph {
        /* access modifiers changed from: private */
        public static final ProtoDecorateAlbumItem i;
        private static volatile fkr<ProtoDecorateAlbumItem> j;
        public int d;
        public String e = "";
        private ProtoAlbumMetadata f;
        private ProtoAlbumCollectionState g;
        private ProtoAlbumOfflineState h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoDecorateAlbumItem, a> implements iph {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoDecorateAlbumItem.i);
            }
        }

        private ProtoDecorateAlbumItem() {
        }

        public final ProtoAlbumMetadata k() {
            ProtoAlbumMetadata protoAlbumMetadata = this.f;
            return protoAlbumMetadata == null ? ProtoAlbumMetadata.n() : protoAlbumMetadata;
        }

        public final ProtoAlbumCollectionState l() {
            ProtoAlbumCollectionState protoAlbumCollectionState = this.g;
            return protoAlbumCollectionState == null ? ProtoAlbumCollectionState.l() : protoAlbumCollectionState;
        }

        public final ProtoAlbumOfflineState m() {
            ProtoAlbumOfflineState protoAlbumOfflineState = this.h;
            return protoAlbumOfflineState == null ? ProtoAlbumOfflineState.k() : protoAlbumOfflineState;
        }

        private boolean o() {
            return (this.d & 8) == 8;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, (fko) k());
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, (fko) l());
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.a(3, (fko) m());
            }
            if ((this.d & 8) == 8) {
                codedOutputStream.a(4, this.e);
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
                i3 = 0 + CodedOutputStream.b(1, (fko) k());
            }
            if ((this.d & 2) == 2) {
                i3 += CodedOutputStream.b(2, (fko) l());
            }
            if ((this.d & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fko) m());
            }
            if ((this.d & 8) == 8) {
                i3 += CodedOutputStream.b(4, this.e);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoDecorateAlbumItem();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoDecorateAlbumItem protoDecorateAlbumItem = (ProtoDecorateAlbumItem) obj2;
                    this.f = (ProtoAlbumMetadata) fVar.a(this.f, protoDecorateAlbumItem.f);
                    this.g = (ProtoAlbumCollectionState) fVar.a(this.g, protoDecorateAlbumItem.g);
                    this.h = (ProtoAlbumOfflineState) fVar.a(this.h, protoDecorateAlbumItem.h);
                    this.e = fVar.a(o(), this.e, protoDecorateAlbumItem.o(), protoDecorateAlbumItem.e);
                    if (fVar == e.a) {
                        this.d |= protoDecorateAlbumItem.d;
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
                                    com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata.ProtoAlbumMetadata.a aVar = (this.d & 1) == 1 ? (com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata.ProtoAlbumMetadata.a) this.f.h() : null;
                                    this.f = (ProtoAlbumMetadata) fkc.a(ProtoAlbumMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (ProtoAlbumMetadata) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumCollectionState.a aVar2 = (this.d & 2) == 2 ? (com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumCollectionState.a) this.g.h() : null;
                                    this.g = (ProtoAlbumCollectionState) fkc.a(ProtoAlbumCollectionState.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (ProtoAlbumCollectionState) aVar2.e();
                                    }
                                    this.d |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumOfflineState.a aVar3 = (this.d & 4) == 4 ? (com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumOfflineState.a) this.h.h() : null;
                                    this.h = (ProtoAlbumOfflineState) fkc.a(ProtoAlbumOfflineState.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a(this.h);
                                        this.h = (ProtoAlbumOfflineState) aVar3.e();
                                    }
                                    this.d |= 4;
                                } else if (a2 == 34) {
                                    String c = fkc.c();
                                    this.d |= 8;
                                    this.e = c;
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
                        synchronized (ProtoDecorateAlbumItem.class) {
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
            ProtoDecorateAlbumItem protoDecorateAlbumItem = new ProtoDecorateAlbumItem();
            i = protoDecorateAlbumItem;
            protoDecorateAlbumItem.e();
        }

        public static fkr<ProtoDecorateAlbumItem> parser() {
            return i.c();
        }
    }

    public static final class ProtoDecorateArtistItem extends GeneratedMessageLite<ProtoDecorateArtistItem, a> implements ipi {
        /* access modifiers changed from: private */
        public static final ProtoDecorateArtistItem i;
        private static volatile fkr<ProtoDecorateArtistItem> j;
        public int d;
        public String e = "";
        private ProtoArtistMetadata f;
        private ProtoArtistCollectionState g;
        private ProtoArtistOfflineState h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoDecorateArtistItem, a> implements ipi {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoDecorateArtistItem.i);
            }
        }

        private ProtoDecorateArtistItem() {
        }

        public final ProtoArtistMetadata k() {
            ProtoArtistMetadata protoArtistMetadata = this.f;
            return protoArtistMetadata == null ? ProtoArtistMetadata.n() : protoArtistMetadata;
        }

        public final ProtoArtistCollectionState l() {
            ProtoArtistCollectionState protoArtistCollectionState = this.g;
            return protoArtistCollectionState == null ? ProtoArtistCollectionState.l() : protoArtistCollectionState;
        }

        public final ProtoArtistOfflineState m() {
            ProtoArtistOfflineState protoArtistOfflineState = this.h;
            return protoArtistOfflineState == null ? ProtoArtistOfflineState.k() : protoArtistOfflineState;
        }

        private boolean o() {
            return (this.d & 8) == 8;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, (fko) k());
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, (fko) l());
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.a(3, (fko) m());
            }
            if ((this.d & 8) == 8) {
                codedOutputStream.a(4, this.e);
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
                i3 = 0 + CodedOutputStream.b(1, (fko) k());
            }
            if ((this.d & 2) == 2) {
                i3 += CodedOutputStream.b(2, (fko) l());
            }
            if ((this.d & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fko) m());
            }
            if ((this.d & 8) == 8) {
                i3 += CodedOutputStream.b(4, this.e);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoDecorateArtistItem();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoDecorateArtistItem protoDecorateArtistItem = (ProtoDecorateArtistItem) obj2;
                    this.f = (ProtoArtistMetadata) fVar.a(this.f, protoDecorateArtistItem.f);
                    this.g = (ProtoArtistCollectionState) fVar.a(this.g, protoDecorateArtistItem.g);
                    this.h = (ProtoArtistOfflineState) fVar.a(this.h, protoDecorateArtistItem.h);
                    this.e = fVar.a(o(), this.e, protoDecorateArtistItem.o(), protoDecorateArtistItem.e);
                    if (fVar == e.a) {
                        this.d |= protoDecorateArtistItem.d;
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
                                    com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata.ProtoArtistMetadata.a aVar = (this.d & 1) == 1 ? (com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata.ProtoArtistMetadata.a) this.f.h() : null;
                                    this.f = (ProtoArtistMetadata) fkc.a(ProtoArtistMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (ProtoArtistMetadata) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistCollectionState.a aVar2 = (this.d & 2) == 2 ? (com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistCollectionState.a) this.g.h() : null;
                                    this.g = (ProtoArtistCollectionState) fkc.a(ProtoArtistCollectionState.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (ProtoArtistCollectionState) aVar2.e();
                                    }
                                    this.d |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistOfflineState.a aVar3 = (this.d & 4) == 4 ? (com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistOfflineState.a) this.h.h() : null;
                                    this.h = (ProtoArtistOfflineState) fkc.a(ProtoArtistOfflineState.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a(this.h);
                                        this.h = (ProtoArtistOfflineState) aVar3.e();
                                    }
                                    this.d |= 4;
                                } else if (a2 == 34) {
                                    String c = fkc.c();
                                    this.d |= 8;
                                    this.e = c;
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
                        synchronized (ProtoDecorateArtistItem.class) {
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
            ProtoDecorateArtistItem protoDecorateArtistItem = new ProtoDecorateArtistItem();
            i = protoDecorateArtistItem;
            protoDecorateArtistItem.e();
        }

        public static fkr<ProtoDecorateArtistItem> parser() {
            return i.c();
        }
    }

    public static final class ProtoDecorateResponse extends GeneratedMessageLite<ProtoDecorateResponse, a> implements ipj {
        /* access modifiers changed from: private */
        public static final ProtoDecorateResponse g;
        private static volatile fkr<ProtoDecorateResponse> h;
        public e<ProtoDecorateAlbumItem> d = fks.d();
        public e<ProtoDecorateArtistItem> e = fks.d();
        public e<ProtoDecorateTrackItem> f = fks.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoDecorateResponse, a> implements ipj {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoDecorateResponse.g);
            }
        }

        private ProtoDecorateResponse() {
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.a(3, (fko) this.d.get(i));
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                codedOutputStream.a(4, (fko) this.e.get(i2));
            }
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                codedOutputStream.a(5, (fko) this.f.get(i3));
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                i2 += CodedOutputStream.b(3, (fko) this.d.get(i3));
            }
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                i2 += CodedOutputStream.b(4, (fko) this.e.get(i4));
            }
            for (int i5 = 0; i5 < this.f.size(); i5++) {
                i2 += CodedOutputStream.b(5, (fko) this.f.get(i5));
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static ProtoDecorateResponse a(byte[] bArr) {
            return (ProtoDecorateResponse) GeneratedMessageLite.a(g, bArr);
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoDecorateResponse();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    this.e.b();
                    this.f.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoDecorateResponse protoDecorateResponse = (ProtoDecorateResponse) obj2;
                    this.d = fVar.a(this.d, protoDecorateResponse.d);
                    this.e = fVar.a(this.e, protoDecorateResponse.e);
                    this.f = fVar.a(this.f, protoDecorateResponse.f);
                    e eVar = e.a;
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    fke fke = (fke) obj2;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 26) {
                                    if (!this.d.a()) {
                                        this.d = GeneratedMessageLite.a(this.d);
                                    }
                                    this.d.add(fkc.a(ProtoDecorateAlbumItem.parser(), fke));
                                } else if (a2 == 34) {
                                    if (!this.e.a()) {
                                        this.e = GeneratedMessageLite.a(this.e);
                                    }
                                    this.e.add(fkc.a(ProtoDecorateArtistItem.parser(), fke));
                                } else if (a2 == 42) {
                                    if (!this.f.a()) {
                                        this.f = GeneratedMessageLite.a(this.f);
                                    }
                                    this.f.add(fkc.a(ProtoDecorateTrackItem.parser(), fke));
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
                        synchronized (ProtoDecorateResponse.class) {
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
            ProtoDecorateResponse protoDecorateResponse = new ProtoDecorateResponse();
            g = protoDecorateResponse;
            protoDecorateResponse.e();
        }

        public static fkr<ProtoDecorateResponse> parser() {
            return g.c();
        }
    }

    public static final class ProtoDecorateTrackItem extends GeneratedMessageLite<ProtoDecorateTrackItem, a> implements ipk {
        /* access modifiers changed from: private */
        public static final ProtoDecorateTrackItem j;
        private static volatile fkr<ProtoDecorateTrackItem> k;
        public int d;
        public String e = "";
        private ProtoTrackMetadata f;
        private ProtoTrackOfflineState g;
        private ProtoTrackPlayState h;
        private ProtoTrackCollectionState i;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoDecorateTrackItem, a> implements ipk {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoDecorateTrackItem.j);
            }
        }

        private ProtoDecorateTrackItem() {
        }

        public final ProtoTrackMetadata k() {
            ProtoTrackMetadata protoTrackMetadata = this.f;
            return protoTrackMetadata == null ? ProtoTrackMetadata.o() : protoTrackMetadata;
        }

        public final ProtoTrackOfflineState l() {
            ProtoTrackOfflineState protoTrackOfflineState = this.g;
            return protoTrackOfflineState == null ? ProtoTrackOfflineState.k() : protoTrackOfflineState;
        }

        public final ProtoTrackPlayState m() {
            ProtoTrackPlayState protoTrackPlayState = this.h;
            return protoTrackPlayState == null ? ProtoTrackPlayState.m() : protoTrackPlayState;
        }

        public final ProtoTrackCollectionState n() {
            ProtoTrackCollectionState protoTrackCollectionState = this.i;
            return protoTrackCollectionState == null ? ProtoTrackCollectionState.l() : protoTrackCollectionState;
        }

        private boolean p() {
            return (this.d & 16) == 16;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, (fko) k());
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, (fko) l());
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.a(3, (fko) m());
            }
            if ((this.d & 8) == 8) {
                codedOutputStream.a(4, (fko) n());
            }
            if ((this.d & 16) == 16) {
                codedOutputStream.a(5, this.e);
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
                i3 = 0 + CodedOutputStream.b(1, (fko) k());
            }
            if ((this.d & 2) == 2) {
                i3 += CodedOutputStream.b(2, (fko) l());
            }
            if ((this.d & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fko) m());
            }
            if ((this.d & 8) == 8) {
                i3 += CodedOutputStream.b(4, (fko) n());
            }
            if ((this.d & 16) == 16) {
                i3 += CodedOutputStream.b(5, this.e);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoDecorateTrackItem();
                case IS_INITIALIZED:
                    return j;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoDecorateTrackItem protoDecorateTrackItem = (ProtoDecorateTrackItem) obj2;
                    this.f = (ProtoTrackMetadata) fVar.a(this.f, protoDecorateTrackItem.f);
                    this.g = (ProtoTrackOfflineState) fVar.a(this.g, protoDecorateTrackItem.g);
                    this.h = (ProtoTrackPlayState) fVar.a(this.h, protoDecorateTrackItem.h);
                    this.i = (ProtoTrackCollectionState) fVar.a(this.i, protoDecorateTrackItem.i);
                    this.e = fVar.a(p(), this.e, protoDecorateTrackItem.p(), protoDecorateTrackItem.e);
                    if (fVar == e.a) {
                        this.d |= protoDecorateTrackItem.d;
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
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.a aVar = (this.d & 1) == 1 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.a) this.f.h() : null;
                                    this.f = (ProtoTrackMetadata) fkc.a(ProtoTrackMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (ProtoTrackMetadata) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState.a aVar2 = (this.d & 2) == 2 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState.a) this.g.h() : null;
                                    this.g = (ProtoTrackOfflineState) fkc.a(ProtoTrackOfflineState.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (ProtoTrackOfflineState) aVar2.e();
                                    }
                                    this.d |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState.a aVar3 = (this.d & 4) == 4 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState.a) this.h.h() : null;
                                    this.h = (ProtoTrackPlayState) fkc.a(ProtoTrackPlayState.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a(this.h);
                                        this.h = (ProtoTrackPlayState) aVar3.e();
                                    }
                                    this.d |= 4;
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState.a aVar4 = (this.d & 8) == 8 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState.a) this.i.h() : null;
                                    this.i = (ProtoTrackCollectionState) fkc.a(ProtoTrackCollectionState.parser(), fke);
                                    if (aVar4 != null) {
                                        aVar4.a(this.i);
                                        this.i = (ProtoTrackCollectionState) aVar4.e();
                                    }
                                    this.d |= 8;
                                } else if (a2 == 42) {
                                    String c = fkc.c();
                                    this.d |= 16;
                                    this.e = c;
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
                        synchronized (ProtoDecorateTrackItem.class) {
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
            ProtoDecorateTrackItem protoDecorateTrackItem = new ProtoDecorateTrackItem();
            j = protoDecorateTrackItem;
            protoDecorateTrackItem.e();
        }

        public static fkr<ProtoDecorateTrackItem> parser() {
            return j.c();
        }
    }
}
