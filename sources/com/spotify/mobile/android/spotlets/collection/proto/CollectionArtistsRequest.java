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

    public static final class ProtoCollectionArtistsItem extends GeneratedMessageLite<ProtoCollectionArtistsItem, a> implements irs {
        /* access modifiers changed from: private */
        public static final ProtoCollectionArtistsItem k;
        private static volatile fll<ProtoCollectionArtistsItem> l;
        public String d = "";
        public int e;
        private int f;
        private int g;
        private ProtoArtistMetadata h;
        private ProtoArtistCollectionState i;
        private ProtoArtistOfflineState j;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoCollectionArtistsItem, a> implements irs {
            private a() {
                super(ProtoCollectionArtistsItem.k);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(int i) {
                b();
                ProtoCollectionArtistsItem.a((ProtoCollectionArtistsItem) this.a, 0);
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

            public final a a(String str) {
                b();
                ProtoCollectionArtistsItem.a((ProtoCollectionArtistsItem) this.a, str);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoCollectionArtistsItem.b((ProtoCollectionArtistsItem) this.a, 0);
                return this;
            }
        }

        static {
            ProtoCollectionArtistsItem protoCollectionArtistsItem = new ProtoCollectionArtistsItem();
            k = protoCollectionArtistsItem;
            protoCollectionArtistsItem.e();
        }

        private ProtoCollectionArtistsItem() {
        }

        static /* synthetic */ void a(ProtoCollectionArtistsItem protoCollectionArtistsItem, int i2) {
            protoCollectionArtistsItem.f |= 2;
            protoCollectionArtistsItem.g = i2;
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

        static /* synthetic */ void a(ProtoCollectionArtistsItem protoCollectionArtistsItem, String str) {
            if (str != null) {
                protoCollectionArtistsItem.f |= 1;
                protoCollectionArtistsItem.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ProtoCollectionArtistsItem protoCollectionArtistsItem, int i2) {
            protoCollectionArtistsItem.f |= 4;
            protoCollectionArtistsItem.e = i2;
        }

        public static fll<ProtoCollectionArtistsItem> parser() {
            return k.c();
        }

        public static a r() {
            return (a) k.h();
        }

        private boolean t() {
            return (this.f & 2) == 2;
        }

        private boolean u() {
            return (this.f & 4) == 4;
        }

        /* JADX INFO: finally extract failed */
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
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    String c = fkw.c();
                                    this.f |= 1;
                                    this.d = c;
                                } else if (a2 == 16) {
                                    this.f |= 2;
                                    this.g = fkw.g();
                                } else if (a2 == 24) {
                                    this.f |= 4;
                                    this.e = fkw.g();
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata.ProtoArtistMetadata.a aVar = (this.f & 8) == 8 ? (com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata.ProtoArtistMetadata.a) this.h.h() : null;
                                    this.h = (ProtoArtistMetadata) fkw.a(ProtoArtistMetadata.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.h);
                                        this.h = (ProtoArtistMetadata) aVar.e();
                                    }
                                    this.f |= 8;
                                } else if (a2 == 42) {
                                    com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistCollectionState.a aVar2 = (this.f & 16) == 16 ? (com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistCollectionState.a) this.i.h() : null;
                                    this.i = (ProtoArtistCollectionState) fkw.a(ProtoArtistCollectionState.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.i);
                                        this.i = (ProtoArtistCollectionState) aVar2.e();
                                    }
                                    this.f |= 16;
                                } else if (a2 == 50) {
                                    com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistOfflineState.a aVar3 = (this.f & 32) == 32 ? (com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistOfflineState.a) this.j.h() : null;
                                    this.j = (ProtoArtistOfflineState) fkw.a(ProtoArtistOfflineState.parser(), fky);
                                    if (aVar3 != null) {
                                        aVar3.a(this.j);
                                        this.j = (ProtoArtistOfflineState) aVar3.e();
                                    }
                                    this.f |= 32;
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
                    if (l == null) {
                        Class<ProtoCollectionArtistsItem> cls = ProtoCollectionArtistsItem.class;
                        synchronized (ProtoCollectionArtistsItem.class) {
                            try {
                                if (l == null) {
                                    l = new b(k);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return l;
                default:
                    throw new UnsupportedOperationException();
            }
            return k;
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
                codedOutputStream.a(4, (fli) m());
            }
            if ((this.f & 16) == 16) {
                codedOutputStream.a(5, (fli) o());
            }
            if ((this.f & 32) == 32) {
                codedOutputStream.a(6, (fli) q());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            boolean z = false | true;
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
                i3 += CodedOutputStream.b(4, (fli) m());
            }
            if ((this.f & 16) == 16) {
                i3 += CodedOutputStream.b(5, (fli) o());
            }
            if ((this.f & 32) == 32) {
                i3 += CodedOutputStream.b(6, (fli) q());
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final boolean k() {
            return (this.f & 1) == 1;
        }

        public final boolean l() {
            return (this.f & 8) == 8;
        }

        public final ProtoArtistMetadata m() {
            ProtoArtistMetadata protoArtistMetadata = this.h;
            if (protoArtistMetadata == null) {
                protoArtistMetadata = ProtoArtistMetadata.n();
            }
            return protoArtistMetadata;
        }

        public final boolean n() {
            return (this.f & 16) == 16;
        }

        public final ProtoArtistCollectionState o() {
            ProtoArtistCollectionState protoArtistCollectionState = this.i;
            if (protoArtistCollectionState == null) {
                protoArtistCollectionState = ProtoArtistCollectionState.l();
            }
            return protoArtistCollectionState;
        }

        public final boolean p() {
            return (this.f & 32) == 32;
        }

        public final ProtoArtistOfflineState q() {
            ProtoArtistOfflineState protoArtistOfflineState = this.j;
            if (protoArtistOfflineState == null) {
                protoArtistOfflineState = ProtoArtistOfflineState.k();
            }
            return protoArtistOfflineState;
        }
    }

    public static final class ProtoCollectionArtistsResponse extends GeneratedMessageLite<ProtoCollectionArtistsResponse, a> implements irt {
        /* access modifiers changed from: private */
        public static final ProtoCollectionArtistsResponse i;
        private static volatile fll<ProtoCollectionArtistsResponse> j;
        public e<ProtoCollectionArtistsItem> d = flm.d();
        public int e;
        public int f;
        public boolean g;
        private int h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoCollectionArtistsResponse, a> implements irt {
            private a() {
                super(ProtoCollectionArtistsResponse.i);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(int i) {
                b();
                ProtoCollectionArtistsResponse.a((ProtoCollectionArtistsResponse) this.a, i);
                return this;
            }

            public final a a(Iterable<? extends ProtoCollectionArtistsItem> iterable) {
                b();
                ProtoCollectionArtistsResponse.a((ProtoCollectionArtistsResponse) this.a, (Iterable) iterable);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoCollectionArtistsResponse.a((ProtoCollectionArtistsResponse) this.a, z);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoCollectionArtistsResponse.b((ProtoCollectionArtistsResponse) this.a, i);
                return this;
            }
        }

        static {
            ProtoCollectionArtistsResponse protoCollectionArtistsResponse = new ProtoCollectionArtistsResponse();
            i = protoCollectionArtistsResponse;
            protoCollectionArtistsResponse.e();
        }

        private ProtoCollectionArtistsResponse() {
        }

        public static ProtoCollectionArtistsResponse a(byte[] bArr) {
            return (ProtoCollectionArtistsResponse) GeneratedMessageLite.a(i, bArr);
        }

        static /* synthetic */ void a(ProtoCollectionArtistsResponse protoCollectionArtistsResponse, int i2) {
            protoCollectionArtistsResponse.h |= 1;
            protoCollectionArtistsResponse.e = i2;
        }

        static /* synthetic */ void a(ProtoCollectionArtistsResponse protoCollectionArtistsResponse, Iterable iterable) {
            if (!protoCollectionArtistsResponse.d.a()) {
                protoCollectionArtistsResponse.d = GeneratedMessageLite.a(protoCollectionArtistsResponse.d);
            }
            fkr.a(iterable, protoCollectionArtistsResponse.d);
        }

        static /* synthetic */ void a(ProtoCollectionArtistsResponse protoCollectionArtistsResponse, boolean z) {
            protoCollectionArtistsResponse.h |= 4;
            protoCollectionArtistsResponse.g = z;
        }

        static /* synthetic */ void b(ProtoCollectionArtistsResponse protoCollectionArtistsResponse, int i2) {
            protoCollectionArtistsResponse.h |= 2;
            protoCollectionArtistsResponse.f = i2;
        }

        public static a l() {
            return (a) i.h();
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

        public static fll<ProtoCollectionArtistsResponse> parser() {
            return i.c();
        }

        /* JADX INFO: finally extract failed */
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
                                    this.d.add(fkw.a(ProtoCollectionArtistsItem.parser(), fky));
                                } else if (a2 == 16) {
                                    this.h |= 1;
                                    this.e = fkw.g();
                                } else if (a2 == 24) {
                                    this.h |= 2;
                                    this.f = fkw.g();
                                } else if (a2 == 32) {
                                    this.h |= 4;
                                    this.g = fkw.b();
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
                        Class<ProtoCollectionArtistsResponse> cls = ProtoCollectionArtistsResponse.class;
                        synchronized (ProtoCollectionArtistsResponse.class) {
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
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                codedOutputStream.a(1, (fli) this.d.get(i2));
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
                i3 += CodedOutputStream.b(1, (fli) this.d.get(i4));
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

        public final int k() {
            return this.d.size();
        }
    }
}
