package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState;
import java.io.IOException;

public final class CollectionTracksRequest {

    public static final class ProtoCollectionTracksItem extends GeneratedMessageLite<ProtoCollectionTracksItem, a> implements ipl {
        /* access modifiers changed from: private */
        public static final ProtoCollectionTracksItem l;
        private static volatile fkr<ProtoCollectionTracksItem> m;
        public String d = "";
        public int e;
        private int f;
        private int g;
        private ProtoTrackMetadata h;
        private ProtoTrackOfflineState i;
        private ProtoTrackPlayState j;
        private ProtoTrackCollectionState k;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoCollectionTracksItem, a> implements ipl {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoCollectionTracksItem.l);
            }

            public final a a(String str) {
                b();
                ProtoCollectionTracksItem.a((ProtoCollectionTracksItem) this.a, str);
                return this;
            }

            public final a a(int i) {
                b();
                ProtoCollectionTracksItem.a((ProtoCollectionTracksItem) this.a, 0);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoCollectionTracksItem.b((ProtoCollectionTracksItem) this.a, i);
                return this;
            }

            public final a a(ProtoTrackMetadata protoTrackMetadata) {
                b();
                ProtoCollectionTracksItem.a((ProtoCollectionTracksItem) this.a, protoTrackMetadata);
                return this;
            }

            public final a a(ProtoTrackPlayState protoTrackPlayState) {
                b();
                ProtoCollectionTracksItem.a((ProtoCollectionTracksItem) this.a, protoTrackPlayState);
                return this;
            }

            public final a a(ProtoTrackCollectionState protoTrackCollectionState) {
                b();
                ProtoCollectionTracksItem.a((ProtoCollectionTracksItem) this.a, protoTrackCollectionState);
                return this;
            }
        }

        private ProtoCollectionTracksItem() {
        }

        public final boolean k() {
            return (this.f & 1) == 1;
        }

        private boolean v() {
            return (this.f & 2) == 2;
        }

        private boolean w() {
            return (this.f & 4) == 4;
        }

        public final boolean l() {
            return (this.f & 8) == 8;
        }

        public final ProtoTrackMetadata m() {
            ProtoTrackMetadata protoTrackMetadata = this.h;
            return protoTrackMetadata == null ? ProtoTrackMetadata.o() : protoTrackMetadata;
        }

        public final boolean n() {
            return (this.f & 16) == 16;
        }

        public final ProtoTrackOfflineState o() {
            ProtoTrackOfflineState protoTrackOfflineState = this.i;
            return protoTrackOfflineState == null ? ProtoTrackOfflineState.k() : protoTrackOfflineState;
        }

        public final boolean p() {
            return (this.f & 32) == 32;
        }

        public final ProtoTrackPlayState q() {
            ProtoTrackPlayState protoTrackPlayState = this.j;
            return protoTrackPlayState == null ? ProtoTrackPlayState.m() : protoTrackPlayState;
        }

        public final boolean r() {
            return (this.f & 64) == 64;
        }

        public final ProtoTrackCollectionState s() {
            ProtoTrackCollectionState protoTrackCollectionState = this.k;
            return protoTrackCollectionState == null ? ProtoTrackCollectionState.l() : protoTrackCollectionState;
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
            if ((this.f & 64) == 64) {
                codedOutputStream.a(7, (fko) s());
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
            if ((this.f & 64) == 64) {
                i3 += CodedOutputStream.b(7, (fko) s());
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a t() {
            return (a) l.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoCollectionTracksItem();
                case IS_INITIALIZED:
                    return l;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoCollectionTracksItem protoCollectionTracksItem = (ProtoCollectionTracksItem) obj2;
                    this.d = fVar.a(k(), this.d, protoCollectionTracksItem.k(), protoCollectionTracksItem.d);
                    this.g = fVar.a(v(), this.g, protoCollectionTracksItem.v(), protoCollectionTracksItem.g);
                    this.e = fVar.a(w(), this.e, protoCollectionTracksItem.w(), protoCollectionTracksItem.e);
                    this.h = (ProtoTrackMetadata) fVar.a(this.h, protoCollectionTracksItem.h);
                    this.i = (ProtoTrackOfflineState) fVar.a(this.i, protoCollectionTracksItem.i);
                    this.j = (ProtoTrackPlayState) fVar.a(this.j, protoCollectionTracksItem.j);
                    this.k = (ProtoTrackCollectionState) fVar.a(this.k, protoCollectionTracksItem.k);
                    if (fVar == e.a) {
                        this.f |= protoCollectionTracksItem.f;
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
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.a aVar = (this.f & 8) == 8 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.a) this.h.h() : null;
                                    this.h = (ProtoTrackMetadata) fkc.a(ProtoTrackMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.h);
                                        this.h = (ProtoTrackMetadata) aVar.e();
                                    }
                                    this.f |= 8;
                                } else if (a2 == 42) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState.a aVar2 = (this.f & 16) == 16 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState.a) this.i.h() : null;
                                    this.i = (ProtoTrackOfflineState) fkc.a(ProtoTrackOfflineState.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.i);
                                        this.i = (ProtoTrackOfflineState) aVar2.e();
                                    }
                                    this.f |= 16;
                                } else if (a2 == 50) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState.a aVar3 = (this.f & 32) == 32 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState.a) this.j.h() : null;
                                    this.j = (ProtoTrackPlayState) fkc.a(ProtoTrackPlayState.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a(this.j);
                                        this.j = (ProtoTrackPlayState) aVar3.e();
                                    }
                                    this.f |= 32;
                                } else if (a2 == 58) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState.a aVar4 = (this.f & 64) == 64 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState.a) this.k.h() : null;
                                    this.k = (ProtoTrackCollectionState) fkc.a(ProtoTrackCollectionState.parser(), fke);
                                    if (aVar4 != null) {
                                        aVar4.a(this.k);
                                        this.k = (ProtoTrackCollectionState) aVar4.e();
                                    }
                                    this.f |= 64;
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
                    if (m == null) {
                        synchronized (ProtoCollectionTracksItem.class) {
                            if (m == null) {
                                m = new b(l);
                            }
                        }
                    }
                    return m;
                default:
                    throw new UnsupportedOperationException();
            }
            return l;
        }

        static {
            ProtoCollectionTracksItem protoCollectionTracksItem = new ProtoCollectionTracksItem();
            l = protoCollectionTracksItem;
            protoCollectionTracksItem.e();
        }

        public static fkr<ProtoCollectionTracksItem> parser() {
            return l.c();
        }

        static /* synthetic */ void a(ProtoCollectionTracksItem protoCollectionTracksItem, String str) {
            if (str != null) {
                protoCollectionTracksItem.f |= 1;
                protoCollectionTracksItem.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoCollectionTracksItem protoCollectionTracksItem, int i2) {
            protoCollectionTracksItem.f |= 2;
            protoCollectionTracksItem.g = i2;
        }

        static /* synthetic */ void b(ProtoCollectionTracksItem protoCollectionTracksItem, int i2) {
            protoCollectionTracksItem.f |= 4;
            protoCollectionTracksItem.e = i2;
        }

        static /* synthetic */ void a(ProtoCollectionTracksItem protoCollectionTracksItem, ProtoTrackMetadata protoTrackMetadata) {
            if (protoTrackMetadata != null) {
                protoCollectionTracksItem.h = protoTrackMetadata;
                protoCollectionTracksItem.f |= 8;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoCollectionTracksItem protoCollectionTracksItem, ProtoTrackPlayState protoTrackPlayState) {
            if (protoTrackPlayState != null) {
                protoCollectionTracksItem.j = protoTrackPlayState;
                protoCollectionTracksItem.f |= 32;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoCollectionTracksItem protoCollectionTracksItem, ProtoTrackCollectionState protoTrackCollectionState) {
            if (protoTrackCollectionState != null) {
                protoCollectionTracksItem.k = protoTrackCollectionState;
                protoCollectionTracksItem.f |= 64;
                return;
            }
            throw new NullPointerException();
        }
    }

    public static final class ProtoCollectionTracksResponse extends GeneratedMessageLite<ProtoCollectionTracksResponse, a> implements ipm {
        /* access modifiers changed from: private */
        public static final ProtoCollectionTracksResponse l;
        private static volatile fkr<ProtoCollectionTracksResponse> m;
        public e<ProtoCollectionTracksItem> d = fks.d();
        public int e;
        public int f;
        public boolean g;
        public String h = "";
        public int i;
        public e<ProtoGroupHeader> j = fks.d();
        private int k;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoCollectionTracksResponse, a> implements ipm {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoCollectionTracksResponse.l);
            }

            public final a a(Iterable<? extends ProtoCollectionTracksItem> iterable) {
                b();
                ProtoCollectionTracksResponse.a((ProtoCollectionTracksResponse) this.a, (Iterable) iterable);
                return this;
            }

            public final a a(int i) {
                b();
                ProtoCollectionTracksResponse.a((ProtoCollectionTracksResponse) this.a, i);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoCollectionTracksResponse.b((ProtoCollectionTracksResponse) this.a, i);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoCollectionTracksResponse.a((ProtoCollectionTracksResponse) this.a, z);
                return this;
            }
        }

        private ProtoCollectionTracksResponse() {
        }

        public final int k() {
            return this.d.size();
        }

        private boolean n() {
            return (this.k & 1) == 1;
        }

        private boolean o() {
            return (this.k & 2) == 2;
        }

        private boolean p() {
            return (this.k & 4) == 4;
        }

        private boolean q() {
            return (this.k & 8) == 8;
        }

        private boolean r() {
            return (this.k & 16) == 16;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                codedOutputStream.a(1, (fko) this.d.get(i2));
            }
            if ((this.k & 1) == 1) {
                codedOutputStream.c(2, this.e);
            }
            if ((this.k & 2) == 2) {
                codedOutputStream.c(3, this.f);
            }
            if ((this.k & 4) == 4) {
                codedOutputStream.a(4, this.g);
            }
            if ((this.k & 8) == 8) {
                codedOutputStream.a(5, this.h);
            }
            if ((this.k & 16) == 16) {
                codedOutputStream.c(6, this.i);
            }
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                codedOutputStream.a(7, (fko) this.j.get(i3));
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
            if ((this.k & 1) == 1) {
                i3 += CodedOutputStream.g(2, this.e);
            }
            if ((this.k & 2) == 2) {
                i3 += CodedOutputStream.g(3, this.f);
            }
            if ((this.k & 4) == 4) {
                i3 += CodedOutputStream.b(4, this.g);
            }
            if ((this.k & 8) == 8) {
                i3 += CodedOutputStream.b(5, this.h);
            }
            if ((this.k & 16) == 16) {
                i3 += CodedOutputStream.g(6, this.i);
            }
            for (int i5 = 0; i5 < this.j.size(); i5++) {
                i3 += CodedOutputStream.b(7, (fko) this.j.get(i5));
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static ProtoCollectionTracksResponse a(byte[] bArr) {
            return (ProtoCollectionTracksResponse) GeneratedMessageLite.a(l, bArr);
        }

        public static a l() {
            return (a) l.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoCollectionTracksResponse();
                case IS_INITIALIZED:
                    return l;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    this.j.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoCollectionTracksResponse protoCollectionTracksResponse = (ProtoCollectionTracksResponse) obj2;
                    this.d = fVar.a(this.d, protoCollectionTracksResponse.d);
                    this.e = fVar.a(n(), this.e, protoCollectionTracksResponse.n(), protoCollectionTracksResponse.e);
                    this.f = fVar.a(o(), this.f, protoCollectionTracksResponse.o(), protoCollectionTracksResponse.f);
                    this.g = fVar.a(p(), this.g, protoCollectionTracksResponse.p(), protoCollectionTracksResponse.g);
                    this.h = fVar.a(q(), this.h, protoCollectionTracksResponse.q(), protoCollectionTracksResponse.h);
                    this.i = fVar.a(r(), this.i, protoCollectionTracksResponse.r(), protoCollectionTracksResponse.i);
                    this.j = fVar.a(this.j, protoCollectionTracksResponse.j);
                    if (fVar == e.a) {
                        this.k |= protoCollectionTracksResponse.k;
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
                                    this.d.add(fkc.a(ProtoCollectionTracksItem.parser(), fke));
                                } else if (a2 == 16) {
                                    this.k |= 1;
                                    this.e = fkc.g();
                                } else if (a2 == 24) {
                                    this.k |= 2;
                                    this.f = fkc.g();
                                } else if (a2 == 32) {
                                    this.k |= 4;
                                    this.g = fkc.b();
                                } else if (a2 == 42) {
                                    String c = fkc.c();
                                    this.k |= 8;
                                    this.h = c;
                                } else if (a2 == 48) {
                                    this.k |= 16;
                                    this.i = fkc.g();
                                } else if (a2 == 58) {
                                    if (!this.j.a()) {
                                        this.j = GeneratedMessageLite.a(this.j);
                                    }
                                    this.j.add(fkc.a(ProtoGroupHeader.parser(), fke));
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
                    if (m == null) {
                        synchronized (ProtoCollectionTracksResponse.class) {
                            if (m == null) {
                                m = new b(l);
                            }
                        }
                    }
                    return m;
                default:
                    throw new UnsupportedOperationException();
            }
            return l;
        }

        static {
            ProtoCollectionTracksResponse protoCollectionTracksResponse = new ProtoCollectionTracksResponse();
            l = protoCollectionTracksResponse;
            protoCollectionTracksResponse.e();
        }

        public static fkr<ProtoCollectionTracksResponse> parser() {
            return l.c();
        }

        static /* synthetic */ void a(ProtoCollectionTracksResponse protoCollectionTracksResponse, Iterable iterable) {
            if (!protoCollectionTracksResponse.d.a()) {
                protoCollectionTracksResponse.d = GeneratedMessageLite.a(protoCollectionTracksResponse.d);
            }
            fjx.a(iterable, protoCollectionTracksResponse.d);
        }

        static /* synthetic */ void a(ProtoCollectionTracksResponse protoCollectionTracksResponse, int i2) {
            protoCollectionTracksResponse.k |= 1;
            protoCollectionTracksResponse.e = i2;
        }

        static /* synthetic */ void b(ProtoCollectionTracksResponse protoCollectionTracksResponse, int i2) {
            protoCollectionTracksResponse.k |= 2;
            protoCollectionTracksResponse.f = i2;
        }

        static /* synthetic */ void a(ProtoCollectionTracksResponse protoCollectionTracksResponse, boolean z) {
            protoCollectionTracksResponse.k |= 4;
            protoCollectionTracksResponse.g = z;
        }
    }

    public static final class ProtoGroupHeader extends GeneratedMessageLite<ProtoGroupHeader, a> implements ipn {
        /* access modifiers changed from: private */
        public static final ProtoGroupHeader h;
        private static volatile fkr<ProtoGroupHeader> i;
        public int d;
        public int e;
        private int f;
        private String g = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoGroupHeader, a> implements ipn {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoGroupHeader.h);
            }
        }

        private ProtoGroupHeader() {
        }

        private boolean l() {
            return (this.f & 1) == 1;
        }

        private boolean m() {
            return (this.f & 2) == 2;
        }

        private boolean n() {
            return (this.f & 4) == 4;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.f & 1) == 1) {
                codedOutputStream.a(1, this.g);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.c(2, this.d);
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.c(3, this.e);
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
                i3 = 0 + CodedOutputStream.b(1, this.g);
            }
            if ((this.f & 2) == 2) {
                i3 += CodedOutputStream.g(2, this.d);
            }
            if ((this.f & 4) == 4) {
                i3 += CodedOutputStream.g(3, this.e);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoGroupHeader();
                case IS_INITIALIZED:
                    return h;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoGroupHeader protoGroupHeader = (ProtoGroupHeader) obj2;
                    this.g = fVar.a(l(), this.g, protoGroupHeader.l(), protoGroupHeader.g);
                    this.d = fVar.a(m(), this.d, protoGroupHeader.m(), protoGroupHeader.d);
                    this.e = fVar.a(n(), this.e, protoGroupHeader.n(), protoGroupHeader.e);
                    if (fVar == e.a) {
                        this.f |= protoGroupHeader.f;
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
                                    this.g = c;
                                } else if (a2 == 16) {
                                    this.f |= 2;
                                    this.d = fkc.g();
                                } else if (a2 == 24) {
                                    this.f |= 4;
                                    this.e = fkc.g();
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
                        synchronized (ProtoGroupHeader.class) {
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
            ProtoGroupHeader protoGroupHeader = new ProtoGroupHeader();
            h = protoGroupHeader;
            protoGroupHeader.e();
        }

        public static fkr<ProtoGroupHeader> parser() {
            return h.c();
        }
    }
}
