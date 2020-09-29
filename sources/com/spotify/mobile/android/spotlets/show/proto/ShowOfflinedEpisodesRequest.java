package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState;
import java.io.IOException;

public final class ShowOfflinedEpisodesRequest {

    public static final class ProtoOfflinedEpisodesRequestItem extends GeneratedMessageLite<ProtoOfflinedEpisodesRequestItem, a> implements jda {
        /* access modifiers changed from: private */
        public static final ProtoOfflinedEpisodesRequestItem j;
        private static volatile fkr<ProtoOfflinedEpisodesRequestItem> k;
        public String d = "";
        private int e;
        private ProtoEpisodeMetadata f;
        private ProtoEpisodeCollectionState g;
        private ProtoEpisodeOfflineState h;
        private ProtoEpisodePlayState i;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoOfflinedEpisodesRequestItem, a> implements jda {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoOfflinedEpisodesRequestItem.j);
            }

            public final a a(String str) {
                b();
                ProtoOfflinedEpisodesRequestItem.a((ProtoOfflinedEpisodesRequestItem) this.a, str);
                return this;
            }

            public final a a(ProtoEpisodeMetadata protoEpisodeMetadata) {
                b();
                ProtoOfflinedEpisodesRequestItem.a((ProtoOfflinedEpisodesRequestItem) this.a, protoEpisodeMetadata);
                return this;
            }

            public final a a(ProtoEpisodeCollectionState protoEpisodeCollectionState) {
                b();
                ProtoOfflinedEpisodesRequestItem.a((ProtoOfflinedEpisodesRequestItem) this.a, protoEpisodeCollectionState);
                return this;
            }

            public final a a(ProtoEpisodePlayState protoEpisodePlayState) {
                b();
                ProtoOfflinedEpisodesRequestItem.a((ProtoOfflinedEpisodesRequestItem) this.a, protoEpisodePlayState);
                return this;
            }
        }

        private ProtoOfflinedEpisodesRequestItem() {
        }

        public final boolean k() {
            return (this.e & 1) == 1;
        }

        public final boolean l() {
            return (this.e & 2) == 2;
        }

        public final ProtoEpisodeMetadata m() {
            ProtoEpisodeMetadata protoEpisodeMetadata = this.f;
            return protoEpisodeMetadata == null ? ProtoEpisodeMetadata.t() : protoEpisodeMetadata;
        }

        public final boolean n() {
            return (this.e & 4) == 4;
        }

        public final ProtoEpisodeCollectionState o() {
            ProtoEpisodeCollectionState protoEpisodeCollectionState = this.g;
            return protoEpisodeCollectionState == null ? ProtoEpisodeCollectionState.l() : protoEpisodeCollectionState;
        }

        public final boolean p() {
            return (this.e & 8) == 8;
        }

        public final ProtoEpisodeOfflineState q() {
            ProtoEpisodeOfflineState protoEpisodeOfflineState = this.h;
            return protoEpisodeOfflineState == null ? ProtoEpisodeOfflineState.k() : protoEpisodeOfflineState;
        }

        public final boolean r() {
            return (this.e & 16) == 16;
        }

        public final ProtoEpisodePlayState s() {
            ProtoEpisodePlayState protoEpisodePlayState = this.i;
            return protoEpisodePlayState == null ? ProtoEpisodePlayState.m() : protoEpisodePlayState;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.e & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.e & 2) == 2) {
                codedOutputStream.a(2, (fko) m());
            }
            if ((this.e & 4) == 4) {
                codedOutputStream.a(3, (fko) o());
            }
            if ((this.e & 8) == 8) {
                codedOutputStream.a(4, (fko) q());
            }
            if ((this.e & 16) == 16) {
                codedOutputStream.a(5, (fko) s());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.e & 1) == 1) {
                i3 = 0 + CodedOutputStream.b(1, this.d);
            }
            if ((this.e & 2) == 2) {
                i3 += CodedOutputStream.b(2, (fko) m());
            }
            if ((this.e & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fko) o());
            }
            if ((this.e & 8) == 8) {
                i3 += CodedOutputStream.b(4, (fko) q());
            }
            if ((this.e & 16) == 16) {
                i3 += CodedOutputStream.b(5, (fko) s());
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a t() {
            return (a) j.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoOfflinedEpisodesRequestItem();
                case IS_INITIALIZED:
                    return j;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoOfflinedEpisodesRequestItem protoOfflinedEpisodesRequestItem = (ProtoOfflinedEpisodesRequestItem) obj2;
                    this.d = fVar.a(k(), this.d, protoOfflinedEpisodesRequestItem.k(), protoOfflinedEpisodesRequestItem.d);
                    this.f = (ProtoEpisodeMetadata) fVar.a(this.f, protoOfflinedEpisodesRequestItem.f);
                    this.g = (ProtoEpisodeCollectionState) fVar.a(this.g, protoOfflinedEpisodesRequestItem.g);
                    this.h = (ProtoEpisodeOfflineState) fVar.a(this.h, protoOfflinedEpisodesRequestItem.h);
                    this.i = (ProtoEpisodePlayState) fVar.a(this.i, protoOfflinedEpisodesRequestItem.i);
                    if (fVar == e.a) {
                        this.e |= protoOfflinedEpisodesRequestItem.e;
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
                                    this.e |= 1;
                                    this.d = c;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata.a aVar = (this.e & 2) == 2 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata.a) this.f.h() : null;
                                    this.f = (ProtoEpisodeMetadata) fkc.a(ProtoEpisodeMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (ProtoEpisodeMetadata) aVar.e();
                                    }
                                    this.e |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState.a aVar2 = (this.e & 4) == 4 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState.a) this.g.h() : null;
                                    this.g = (ProtoEpisodeCollectionState) fkc.a(ProtoEpisodeCollectionState.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (ProtoEpisodeCollectionState) aVar2.e();
                                    }
                                    this.e |= 4;
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState.a aVar3 = (this.e & 8) == 8 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState.a) this.h.h() : null;
                                    this.h = (ProtoEpisodeOfflineState) fkc.a(ProtoEpisodeOfflineState.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a(this.h);
                                        this.h = (ProtoEpisodeOfflineState) aVar3.e();
                                    }
                                    this.e |= 8;
                                } else if (a2 == 42) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState.a aVar4 = (this.e & 16) == 16 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState.a) this.i.h() : null;
                                    this.i = (ProtoEpisodePlayState) fkc.a(ProtoEpisodePlayState.parser(), fke);
                                    if (aVar4 != null) {
                                        aVar4.a(this.i);
                                        this.i = (ProtoEpisodePlayState) aVar4.e();
                                    }
                                    this.e |= 16;
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
                        synchronized (ProtoOfflinedEpisodesRequestItem.class) {
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
            ProtoOfflinedEpisodesRequestItem protoOfflinedEpisodesRequestItem = new ProtoOfflinedEpisodesRequestItem();
            j = protoOfflinedEpisodesRequestItem;
            protoOfflinedEpisodesRequestItem.e();
        }

        public static fkr<ProtoOfflinedEpisodesRequestItem> parser() {
            return j.c();
        }

        static /* synthetic */ void a(ProtoOfflinedEpisodesRequestItem protoOfflinedEpisodesRequestItem, String str) {
            if (str != null) {
                protoOfflinedEpisodesRequestItem.e |= 1;
                protoOfflinedEpisodesRequestItem.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoOfflinedEpisodesRequestItem protoOfflinedEpisodesRequestItem, ProtoEpisodeMetadata protoEpisodeMetadata) {
            if (protoEpisodeMetadata != null) {
                protoOfflinedEpisodesRequestItem.f = protoEpisodeMetadata;
                protoOfflinedEpisodesRequestItem.e |= 2;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoOfflinedEpisodesRequestItem protoOfflinedEpisodesRequestItem, ProtoEpisodeCollectionState protoEpisodeCollectionState) {
            if (protoEpisodeCollectionState != null) {
                protoOfflinedEpisodesRequestItem.g = protoEpisodeCollectionState;
                protoOfflinedEpisodesRequestItem.e |= 4;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoOfflinedEpisodesRequestItem protoOfflinedEpisodesRequestItem, ProtoEpisodePlayState protoEpisodePlayState) {
            if (protoEpisodePlayState != null) {
                protoOfflinedEpisodesRequestItem.i = protoEpisodePlayState;
                protoOfflinedEpisodesRequestItem.e |= 16;
                return;
            }
            throw new NullPointerException();
        }
    }

    public static final class ProtoOfflinedEpisodesResponse extends GeneratedMessageLite<ProtoOfflinedEpisodesResponse, a> implements jdb {
        /* access modifiers changed from: private */
        public static final ProtoOfflinedEpisodesResponse i;
        private static volatile fkr<ProtoOfflinedEpisodesResponse> j;
        public e<ProtoOfflinedEpisodesRequestItem> d = fks.d();
        public int e;
        public int f;
        public boolean g;
        private int h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoOfflinedEpisodesResponse, a> implements jdb {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoOfflinedEpisodesResponse.i);
            }

            public final a a(Iterable<? extends ProtoOfflinedEpisodesRequestItem> iterable) {
                b();
                ProtoOfflinedEpisodesResponse.a((ProtoOfflinedEpisodesResponse) this.a, (Iterable) iterable);
                return this;
            }

            public final a a(int i) {
                b();
                ProtoOfflinedEpisodesResponse.a((ProtoOfflinedEpisodesResponse) this.a, i);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoOfflinedEpisodesResponse.b((ProtoOfflinedEpisodesResponse) this.a, i);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoOfflinedEpisodesResponse.a((ProtoOfflinedEpisodesResponse) this.a, z);
                return this;
            }
        }

        private ProtoOfflinedEpisodesResponse() {
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

        public static ProtoOfflinedEpisodesResponse a(byte[] bArr) {
            return (ProtoOfflinedEpisodesResponse) GeneratedMessageLite.a(i, bArr);
        }

        public static a l() {
            return (a) i.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoOfflinedEpisodesResponse();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoOfflinedEpisodesResponse protoOfflinedEpisodesResponse = (ProtoOfflinedEpisodesResponse) obj2;
                    this.d = fVar.a(this.d, protoOfflinedEpisodesResponse.d);
                    this.e = fVar.a(n(), this.e, protoOfflinedEpisodesResponse.n(), protoOfflinedEpisodesResponse.e);
                    this.f = fVar.a(o(), this.f, protoOfflinedEpisodesResponse.o(), protoOfflinedEpisodesResponse.f);
                    this.g = fVar.a(p(), this.g, protoOfflinedEpisodesResponse.p(), protoOfflinedEpisodesResponse.g);
                    if (fVar == e.a) {
                        this.h |= protoOfflinedEpisodesResponse.h;
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
                                    this.d.add(fkc.a(ProtoOfflinedEpisodesRequestItem.parser(), fke));
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
                        synchronized (ProtoOfflinedEpisodesResponse.class) {
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
            ProtoOfflinedEpisodesResponse protoOfflinedEpisodesResponse = new ProtoOfflinedEpisodesResponse();
            i = protoOfflinedEpisodesResponse;
            protoOfflinedEpisodesResponse.e();
        }

        public static fkr<ProtoOfflinedEpisodesResponse> parser() {
            return i.c();
        }

        static /* synthetic */ void a(ProtoOfflinedEpisodesResponse protoOfflinedEpisodesResponse, Iterable iterable) {
            if (!protoOfflinedEpisodesResponse.d.a()) {
                protoOfflinedEpisodesResponse.d = GeneratedMessageLite.a(protoOfflinedEpisodesResponse.d);
            }
            fjx.a(iterable, protoOfflinedEpisodesResponse.d);
        }

        static /* synthetic */ void a(ProtoOfflinedEpisodesResponse protoOfflinedEpisodesResponse, int i2) {
            protoOfflinedEpisodesResponse.h |= 1;
            protoOfflinedEpisodesResponse.e = i2;
        }

        static /* synthetic */ void b(ProtoOfflinedEpisodesResponse protoOfflinedEpisodesResponse, int i2) {
            protoOfflinedEpisodesResponse.h |= 2;
            protoOfflinedEpisodesResponse.f = i2;
        }

        static /* synthetic */ void a(ProtoOfflinedEpisodesResponse protoOfflinedEpisodesResponse, boolean z) {
            protoOfflinedEpisodesResponse.h |= 4;
            protoOfflinedEpisodesResponse.g = z;
        }
    }
}
