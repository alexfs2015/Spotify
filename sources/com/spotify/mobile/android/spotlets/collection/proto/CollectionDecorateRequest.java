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

    public static final class ProtoDecorateAlbumItem extends GeneratedMessageLite<ProtoDecorateAlbumItem, a> implements iru {
        /* access modifiers changed from: private */
        public static final ProtoDecorateAlbumItem i;
        private static volatile fll<ProtoDecorateAlbumItem> j;
        public int d;
        public String e = "";
        private ProtoAlbumMetadata f;
        private ProtoAlbumCollectionState g;
        private ProtoAlbumOfflineState h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoDecorateAlbumItem, a> implements iru {
            private a() {
                super(ProtoDecorateAlbumItem.i);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoDecorateAlbumItem protoDecorateAlbumItem = new ProtoDecorateAlbumItem();
            i = protoDecorateAlbumItem;
            protoDecorateAlbumItem.e();
        }

        private ProtoDecorateAlbumItem() {
        }

        private boolean o() {
            return (this.d & 8) == 8;
        }

        public static fll<ProtoDecorateAlbumItem> parser() {
            return i.c();
        }

        /* JADX INFO: finally extract failed */
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
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata.ProtoAlbumMetadata.a aVar = (this.d & 1) == 1 ? (com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata.ProtoAlbumMetadata.a) this.f.h() : null;
                                    this.f = (ProtoAlbumMetadata) fkw.a(ProtoAlbumMetadata.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (ProtoAlbumMetadata) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumCollectionState.a aVar2 = (this.d & 2) == 2 ? (com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumCollectionState.a) this.g.h() : null;
                                    this.g = (ProtoAlbumCollectionState) fkw.a(ProtoAlbumCollectionState.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (ProtoAlbumCollectionState) aVar2.e();
                                    }
                                    this.d |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumOfflineState.a aVar3 = (this.d & 4) == 4 ? (com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumOfflineState.a) this.h.h() : null;
                                    this.h = (ProtoAlbumOfflineState) fkw.a(ProtoAlbumOfflineState.parser(), fky);
                                    if (aVar3 != null) {
                                        aVar3.a(this.h);
                                        this.h = (ProtoAlbumOfflineState) aVar3.e();
                                    }
                                    this.d |= 4;
                                } else if (a2 == 34) {
                                    String c = fkw.c();
                                    this.d |= 8;
                                    this.e = c;
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
                    if (j == null) {
                        synchronized (ProtoDecorateAlbumItem.class) {
                            try {
                                if (j == null) {
                                    j = new b(i);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return j;
                default:
                    throw new UnsupportedOperationException();
            }
            return i;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, (fli) k());
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, (fli) l());
            }
            if ((this.d & 4) == 4) {
                boolean z = true & true;
                codedOutputStream.a(3, (fli) m());
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
                i3 = 0 + CodedOutputStream.b(1, (fli) k());
            }
            if ((this.d & 2) == 2) {
                i3 += CodedOutputStream.b(2, (fli) l());
            }
            if ((this.d & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fli) m());
            }
            if ((this.d & 8) == 8) {
                i3 += CodedOutputStream.b(4, this.e);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final ProtoAlbumMetadata k() {
            ProtoAlbumMetadata protoAlbumMetadata = this.f;
            if (protoAlbumMetadata == null) {
                protoAlbumMetadata = ProtoAlbumMetadata.n();
            }
            return protoAlbumMetadata;
        }

        public final ProtoAlbumCollectionState l() {
            ProtoAlbumCollectionState protoAlbumCollectionState = this.g;
            if (protoAlbumCollectionState == null) {
                protoAlbumCollectionState = ProtoAlbumCollectionState.l();
            }
            return protoAlbumCollectionState;
        }

        public final ProtoAlbumOfflineState m() {
            ProtoAlbumOfflineState protoAlbumOfflineState = this.h;
            if (protoAlbumOfflineState == null) {
                protoAlbumOfflineState = ProtoAlbumOfflineState.k();
            }
            return protoAlbumOfflineState;
        }
    }

    public static final class ProtoDecorateArtistItem extends GeneratedMessageLite<ProtoDecorateArtistItem, a> implements irv {
        /* access modifiers changed from: private */
        public static final ProtoDecorateArtistItem i;
        private static volatile fll<ProtoDecorateArtistItem> j;
        public int d;
        public String e = "";
        private ProtoArtistMetadata f;
        private ProtoArtistCollectionState g;
        private ProtoArtistOfflineState h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoDecorateArtistItem, a> implements irv {
            private a() {
                super(ProtoDecorateArtistItem.i);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoDecorateArtistItem protoDecorateArtistItem = new ProtoDecorateArtistItem();
            i = protoDecorateArtistItem;
            protoDecorateArtistItem.e();
        }

        private ProtoDecorateArtistItem() {
        }

        private boolean o() {
            return (this.d & 8) == 8;
        }

        public static fll<ProtoDecorateArtistItem> parser() {
            return i.c();
        }

        /* JADX INFO: finally extract failed */
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
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata.ProtoArtistMetadata.a aVar = (this.d & 1) == 1 ? (com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata.ProtoArtistMetadata.a) this.f.h() : null;
                                    this.f = (ProtoArtistMetadata) fkw.a(ProtoArtistMetadata.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (ProtoArtistMetadata) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistCollectionState.a aVar2 = (this.d & 2) == 2 ? (com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistCollectionState.a) this.g.h() : null;
                                    this.g = (ProtoArtistCollectionState) fkw.a(ProtoArtistCollectionState.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (ProtoArtistCollectionState) aVar2.e();
                                    }
                                    this.d |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistOfflineState.a aVar3 = (this.d & 4) == 4 ? (com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistOfflineState.a) this.h.h() : null;
                                    this.h = (ProtoArtistOfflineState) fkw.a(ProtoArtistOfflineState.parser(), fky);
                                    if (aVar3 != null) {
                                        aVar3.a(this.h);
                                        this.h = (ProtoArtistOfflineState) aVar3.e();
                                    }
                                    this.d |= 4;
                                } else if (a2 == 34) {
                                    String c = fkw.c();
                                    this.d |= 8;
                                    this.e = c;
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
                    if (j == null) {
                        Class<ProtoDecorateArtistItem> cls = ProtoDecorateArtistItem.class;
                        synchronized (ProtoDecorateArtistItem.class) {
                            try {
                                if (j == null) {
                                    j = new b(i);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return j;
                default:
                    throw new UnsupportedOperationException();
            }
            return i;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, (fli) k());
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, (fli) l());
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.a(3, (fli) m());
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
                i3 = 0 + CodedOutputStream.b(1, (fli) k());
            }
            if ((this.d & 2) == 2) {
                i3 += CodedOutputStream.b(2, (fli) l());
            }
            if ((this.d & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fli) m());
            }
            if ((this.d & 8) == 8) {
                i3 += CodedOutputStream.b(4, this.e);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final ProtoArtistMetadata k() {
            ProtoArtistMetadata protoArtistMetadata = this.f;
            if (protoArtistMetadata == null) {
                protoArtistMetadata = ProtoArtistMetadata.n();
            }
            return protoArtistMetadata;
        }

        public final ProtoArtistCollectionState l() {
            ProtoArtistCollectionState protoArtistCollectionState = this.g;
            if (protoArtistCollectionState == null) {
                protoArtistCollectionState = ProtoArtistCollectionState.l();
            }
            return protoArtistCollectionState;
        }

        public final ProtoArtistOfflineState m() {
            ProtoArtistOfflineState protoArtistOfflineState = this.h;
            if (protoArtistOfflineState == null) {
                protoArtistOfflineState = ProtoArtistOfflineState.k();
            }
            return protoArtistOfflineState;
        }
    }

    public static final class ProtoDecorateResponse extends GeneratedMessageLite<ProtoDecorateResponse, a> implements irw {
        /* access modifiers changed from: private */
        public static final ProtoDecorateResponse g;
        private static volatile fll<ProtoDecorateResponse> h;
        public e<ProtoDecorateAlbumItem> d = flm.d();
        public e<ProtoDecorateArtistItem> e = flm.d();
        public e<ProtoDecorateTrackItem> f = flm.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoDecorateResponse, a> implements irw {
            private a() {
                super(ProtoDecorateResponse.g);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoDecorateResponse protoDecorateResponse = new ProtoDecorateResponse();
            g = protoDecorateResponse;
            protoDecorateResponse.e();
        }

        private ProtoDecorateResponse() {
        }

        public static ProtoDecorateResponse a(byte[] bArr) {
            return (ProtoDecorateResponse) GeneratedMessageLite.a(g, bArr);
        }

        public static fll<ProtoDecorateResponse> parser() {
            return g.c();
        }

        /* JADX INFO: finally extract failed */
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
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 26) {
                                    if (!this.d.a()) {
                                        this.d = GeneratedMessageLite.a(this.d);
                                    }
                                    this.d.add(fkw.a(ProtoDecorateAlbumItem.parser(), fky));
                                } else if (a2 == 34) {
                                    if (!this.e.a()) {
                                        this.e = GeneratedMessageLite.a(this.e);
                                    }
                                    this.e.add(fkw.a(ProtoDecorateArtistItem.parser(), fky));
                                } else if (a2 == 42) {
                                    if (!this.f.a()) {
                                        this.f = GeneratedMessageLite.a(this.f);
                                    }
                                    this.f.add(fkw.a(ProtoDecorateTrackItem.parser(), fky));
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
                        synchronized (ProtoDecorateResponse.class) {
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
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.a(3, (fli) this.d.get(i));
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                codedOutputStream.a(4, (fli) this.e.get(i2));
            }
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                codedOutputStream.a(5, (fli) this.f.get(i3));
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
                int i4 = 2 << 3;
                i2 += CodedOutputStream.b(3, (fli) this.d.get(i3));
            }
            for (int i5 = 0; i5 < this.e.size(); i5++) {
                i2 += CodedOutputStream.b(4, (fli) this.e.get(i5));
            }
            for (int i6 = 0; i6 < this.f.size(); i6++) {
                i2 += CodedOutputStream.b(5, (fli) this.f.get(i6));
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }
    }

    public static final class ProtoDecorateTrackItem extends GeneratedMessageLite<ProtoDecorateTrackItem, a> implements irx {
        /* access modifiers changed from: private */
        public static final ProtoDecorateTrackItem j;
        private static volatile fll<ProtoDecorateTrackItem> k;
        public int d;
        public String e = "";
        private ProtoTrackMetadata f;
        private ProtoTrackOfflineState g;
        private ProtoTrackPlayState h;
        private ProtoTrackCollectionState i;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoDecorateTrackItem, a> implements irx {
            private a() {
                super(ProtoDecorateTrackItem.j);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoDecorateTrackItem protoDecorateTrackItem = new ProtoDecorateTrackItem();
            j = protoDecorateTrackItem;
            protoDecorateTrackItem.e();
        }

        private ProtoDecorateTrackItem() {
        }

        private boolean p() {
            return (this.d & 16) == 16;
        }

        public static fll<ProtoDecorateTrackItem> parser() {
            return j.c();
        }

        /* JADX INFO: finally extract failed */
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
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.a aVar = (this.d & 1) == 1 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.a) this.f.h() : null;
                                    this.f = (ProtoTrackMetadata) fkw.a(ProtoTrackMetadata.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (ProtoTrackMetadata) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState.a aVar2 = (this.d & 2) == 2 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState.a) this.g.h() : null;
                                    this.g = (ProtoTrackOfflineState) fkw.a(ProtoTrackOfflineState.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (ProtoTrackOfflineState) aVar2.e();
                                    }
                                    this.d |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState.a aVar3 = (this.d & 4) == 4 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState.a) this.h.h() : null;
                                    this.h = (ProtoTrackPlayState) fkw.a(ProtoTrackPlayState.parser(), fky);
                                    if (aVar3 != null) {
                                        aVar3.a(this.h);
                                        this.h = (ProtoTrackPlayState) aVar3.e();
                                    }
                                    this.d |= 4;
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState.a aVar4 = (this.d & 8) == 8 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState.a) this.i.h() : null;
                                    this.i = (ProtoTrackCollectionState) fkw.a(ProtoTrackCollectionState.parser(), fky);
                                    if (aVar4 != null) {
                                        aVar4.a(this.i);
                                        this.i = (ProtoTrackCollectionState) aVar4.e();
                                    }
                                    this.d |= 8;
                                } else if (a2 == 42) {
                                    String c = fkw.c();
                                    this.d |= 16;
                                    this.e = c;
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
                    if (k == null) {
                        Class<ProtoDecorateTrackItem> cls = ProtoDecorateTrackItem.class;
                        synchronized (ProtoDecorateTrackItem.class) {
                            try {
                                if (k == null) {
                                    k = new b(j);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return k;
                default:
                    throw new UnsupportedOperationException();
            }
            return j;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, (fli) k());
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, (fli) l());
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.a(3, (fli) m());
            }
            if ((this.d & 8) == 8) {
                codedOutputStream.a(4, (fli) n());
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
                i3 = 0 + CodedOutputStream.b(1, (fli) k());
            }
            if ((this.d & 2) == 2) {
                i3 += CodedOutputStream.b(2, (fli) l());
            }
            if ((this.d & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fli) m());
            }
            if ((this.d & 8) == 8) {
                i3 += CodedOutputStream.b(4, (fli) n());
            }
            if ((this.d & 16) == 16) {
                i3 += CodedOutputStream.b(5, this.e);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final ProtoTrackMetadata k() {
            ProtoTrackMetadata protoTrackMetadata = this.f;
            return protoTrackMetadata == null ? ProtoTrackMetadata.o() : protoTrackMetadata;
        }

        public final ProtoTrackOfflineState l() {
            ProtoTrackOfflineState protoTrackOfflineState = this.g;
            if (protoTrackOfflineState == null) {
                protoTrackOfflineState = ProtoTrackOfflineState.k();
            }
            return protoTrackOfflineState;
        }

        public final ProtoTrackPlayState m() {
            ProtoTrackPlayState protoTrackPlayState = this.h;
            if (protoTrackPlayState == null) {
                protoTrackPlayState = ProtoTrackPlayState.m();
            }
            return protoTrackPlayState;
        }

        public final ProtoTrackCollectionState n() {
            ProtoTrackCollectionState protoTrackCollectionState = this.i;
            if (protoTrackCollectionState == null) {
                protoTrackCollectionState = ProtoTrackCollectionState.l();
            }
            return protoTrackCollectionState;
        }
    }
}
