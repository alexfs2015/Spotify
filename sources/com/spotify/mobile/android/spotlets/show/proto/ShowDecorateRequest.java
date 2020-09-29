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
import com.spotify.mobile.android.spotlets.show.proto.ShowMetadata.ProtoShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowPlayState;
import java.io.IOException;

public final class ShowDecorateRequest {

    public static final class ProtoDecorateEpisodeItem extends GeneratedMessageLite<ProtoDecorateEpisodeItem, a> implements jcw {
        /* access modifiers changed from: private */
        public static final ProtoDecorateEpisodeItem j;
        private static volatile fkr<ProtoDecorateEpisodeItem> k;
        public String d = "";
        private int e;
        private ProtoEpisodeMetadata f;
        private ProtoEpisodeCollectionState g;
        private ProtoEpisodeOfflineState h;
        private ProtoEpisodePlayState i;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoDecorateEpisodeItem, a> implements jcw {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoDecorateEpisodeItem.j);
            }
        }

        private ProtoDecorateEpisodeItem() {
        }

        public final boolean k() {
            return (this.e & 1) == 1;
        }

        public final ProtoEpisodeMetadata l() {
            ProtoEpisodeMetadata protoEpisodeMetadata = this.f;
            return protoEpisodeMetadata == null ? ProtoEpisodeMetadata.t() : protoEpisodeMetadata;
        }

        public final boolean m() {
            return (this.e & 2) == 2;
        }

        public final ProtoEpisodeCollectionState n() {
            ProtoEpisodeCollectionState protoEpisodeCollectionState = this.g;
            return protoEpisodeCollectionState == null ? ProtoEpisodeCollectionState.l() : protoEpisodeCollectionState;
        }

        public final boolean o() {
            return (this.e & 4) == 4;
        }

        public final ProtoEpisodeOfflineState p() {
            ProtoEpisodeOfflineState protoEpisodeOfflineState = this.h;
            return protoEpisodeOfflineState == null ? ProtoEpisodeOfflineState.k() : protoEpisodeOfflineState;
        }

        public final boolean q() {
            return (this.e & 8) == 8;
        }

        public final ProtoEpisodePlayState r() {
            ProtoEpisodePlayState protoEpisodePlayState = this.i;
            return protoEpisodePlayState == null ? ProtoEpisodePlayState.m() : protoEpisodePlayState;
        }

        private boolean t() {
            return (this.e & 16) == 16;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.e & 1) == 1) {
                codedOutputStream.a(1, (fko) l());
            }
            if ((this.e & 2) == 2) {
                codedOutputStream.a(2, (fko) n());
            }
            if ((this.e & 4) == 4) {
                codedOutputStream.a(3, (fko) p());
            }
            if ((this.e & 8) == 8) {
                codedOutputStream.a(4, (fko) r());
            }
            if ((this.e & 16) == 16) {
                codedOutputStream.a(5, this.d);
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
                i3 = 0 + CodedOutputStream.b(1, (fko) l());
            }
            if ((this.e & 2) == 2) {
                i3 += CodedOutputStream.b(2, (fko) n());
            }
            if ((this.e & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fko) p());
            }
            if ((this.e & 8) == 8) {
                i3 += CodedOutputStream.b(4, (fko) r());
            }
            if ((this.e & 16) == 16) {
                i3 += CodedOutputStream.b(5, this.d);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoDecorateEpisodeItem();
                case IS_INITIALIZED:
                    return j;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoDecorateEpisodeItem protoDecorateEpisodeItem = (ProtoDecorateEpisodeItem) obj2;
                    this.f = (ProtoEpisodeMetadata) fVar.a(this.f, protoDecorateEpisodeItem.f);
                    this.g = (ProtoEpisodeCollectionState) fVar.a(this.g, protoDecorateEpisodeItem.g);
                    this.h = (ProtoEpisodeOfflineState) fVar.a(this.h, protoDecorateEpisodeItem.h);
                    this.i = (ProtoEpisodePlayState) fVar.a(this.i, protoDecorateEpisodeItem.i);
                    this.d = fVar.a(t(), this.d, protoDecorateEpisodeItem.t(), protoDecorateEpisodeItem.d);
                    if (fVar == e.a) {
                        this.e |= protoDecorateEpisodeItem.e;
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
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata.a aVar = (this.e & 1) == 1 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata.a) this.f.h() : null;
                                    this.f = (ProtoEpisodeMetadata) fkc.a(ProtoEpisodeMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (ProtoEpisodeMetadata) aVar.e();
                                    }
                                    this.e |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState.a aVar2 = (this.e & 2) == 2 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState.a) this.g.h() : null;
                                    this.g = (ProtoEpisodeCollectionState) fkc.a(ProtoEpisodeCollectionState.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (ProtoEpisodeCollectionState) aVar2.e();
                                    }
                                    this.e |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState.a aVar3 = (this.e & 4) == 4 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState.a) this.h.h() : null;
                                    this.h = (ProtoEpisodeOfflineState) fkc.a(ProtoEpisodeOfflineState.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a(this.h);
                                        this.h = (ProtoEpisodeOfflineState) aVar3.e();
                                    }
                                    this.e |= 4;
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState.a aVar4 = (this.e & 8) == 8 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState.a) this.i.h() : null;
                                    this.i = (ProtoEpisodePlayState) fkc.a(ProtoEpisodePlayState.parser(), fke);
                                    if (aVar4 != null) {
                                        aVar4.a(this.i);
                                        this.i = (ProtoEpisodePlayState) aVar4.e();
                                    }
                                    this.e |= 8;
                                } else if (a2 == 42) {
                                    String c = fkc.c();
                                    this.e |= 16;
                                    this.d = c;
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
                        synchronized (ProtoDecorateEpisodeItem.class) {
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
            ProtoDecorateEpisodeItem protoDecorateEpisodeItem = new ProtoDecorateEpisodeItem();
            j = protoDecorateEpisodeItem;
            protoDecorateEpisodeItem.e();
        }

        public static fkr<ProtoDecorateEpisodeItem> parser() {
            return j.c();
        }
    }

    public static final class ProtoDecorateResponse extends GeneratedMessageLite<ProtoDecorateResponse, a> implements jcx {
        /* access modifiers changed from: private */
        public static final ProtoDecorateResponse f;
        private static volatile fkr<ProtoDecorateResponse> g;
        public e<ProtoDecorateShowItem> d = fks.d();
        public e<ProtoDecorateEpisodeItem> e = fks.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoDecorateResponse, a> implements jcx {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoDecorateResponse.f);
            }
        }

        private ProtoDecorateResponse() {
        }

        public final int k() {
            return this.e.size();
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.a(1, (fko) this.d.get(i));
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                codedOutputStream.a(2, (fko) this.e.get(i2));
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
                i2 += CodedOutputStream.b(1, (fko) this.d.get(i3));
            }
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                i2 += CodedOutputStream.b(2, (fko) this.e.get(i4));
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static ProtoDecorateResponse a(byte[] bArr) {
            return (ProtoDecorateResponse) GeneratedMessageLite.a(f, bArr);
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoDecorateResponse();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    this.e.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoDecorateResponse protoDecorateResponse = (ProtoDecorateResponse) obj2;
                    this.d = fVar.a(this.d, protoDecorateResponse.d);
                    this.e = fVar.a(this.e, protoDecorateResponse.e);
                    e eVar = e.a;
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
                                    this.d.add(fkc.a(ProtoDecorateShowItem.parser(), fke));
                                } else if (a2 == 18) {
                                    if (!this.e.a()) {
                                        this.e = GeneratedMessageLite.a(this.e);
                                    }
                                    this.e.add(fkc.a(ProtoDecorateEpisodeItem.parser(), fke));
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
                    if (g == null) {
                        synchronized (ProtoDecorateResponse.class) {
                            if (g == null) {
                                g = new b(f);
                            }
                        }
                    }
                    return g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        static {
            ProtoDecorateResponse protoDecorateResponse = new ProtoDecorateResponse();
            f = protoDecorateResponse;
            protoDecorateResponse.e();
        }

        public static fkr<ProtoDecorateResponse> parser() {
            return f.c();
        }
    }

    public static final class ProtoDecorateShowItem extends GeneratedMessageLite<ProtoDecorateShowItem, a> implements jcy {
        /* access modifiers changed from: private */
        public static final ProtoDecorateShowItem i;
        private static volatile fkr<ProtoDecorateShowItem> j;
        public int d;
        public String e = "";
        private ProtoShowMetadata f;
        private ProtoShowCollectionState g;
        private ProtoShowPlayState h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoDecorateShowItem, a> implements jcy {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoDecorateShowItem.i);
            }
        }

        private ProtoDecorateShowItem() {
        }

        public final ProtoShowMetadata k() {
            ProtoShowMetadata protoShowMetadata = this.f;
            return protoShowMetadata == null ? ProtoShowMetadata.o() : protoShowMetadata;
        }

        public final ProtoShowCollectionState l() {
            ProtoShowCollectionState protoShowCollectionState = this.g;
            return protoShowCollectionState == null ? ProtoShowCollectionState.l() : protoShowCollectionState;
        }

        public final ProtoShowPlayState m() {
            ProtoShowPlayState protoShowPlayState = this.h;
            return protoShowPlayState == null ? ProtoShowPlayState.l() : protoShowPlayState;
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
                    return new ProtoDecorateShowItem();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoDecorateShowItem protoDecorateShowItem = (ProtoDecorateShowItem) obj2;
                    this.f = (ProtoShowMetadata) fVar.a(this.f, protoDecorateShowItem.f);
                    this.g = (ProtoShowCollectionState) fVar.a(this.g, protoDecorateShowItem.g);
                    this.h = (ProtoShowPlayState) fVar.a(this.h, protoDecorateShowItem.h);
                    this.e = fVar.a(o(), this.e, protoDecorateShowItem.o(), protoDecorateShowItem.e);
                    if (fVar == e.a) {
                        this.d |= protoDecorateShowItem.d;
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
                                    com.spotify.mobile.android.spotlets.show.proto.ShowMetadata.ProtoShowMetadata.a aVar = (this.d & 1) == 1 ? (com.spotify.mobile.android.spotlets.show.proto.ShowMetadata.ProtoShowMetadata.a) this.f.h() : null;
                                    this.f = (ProtoShowMetadata) fkc.a(ProtoShowMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (ProtoShowMetadata) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowCollectionState.a aVar2 = (this.d & 2) == 2 ? (com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowCollectionState.a) this.g.h() : null;
                                    this.g = (ProtoShowCollectionState) fkc.a(ProtoShowCollectionState.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (ProtoShowCollectionState) aVar2.e();
                                    }
                                    this.d |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowPlayState.a aVar3 = (this.d & 4) == 4 ? (com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowPlayState.a) this.h.h() : null;
                                    this.h = (ProtoShowPlayState) fkc.a(ProtoShowPlayState.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a(this.h);
                                        this.h = (ProtoShowPlayState) aVar3.e();
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
                        synchronized (ProtoDecorateShowItem.class) {
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
            ProtoDecorateShowItem protoDecorateShowItem = new ProtoDecorateShowItem();
            i = protoDecorateShowItem;
            protoDecorateShowItem.e();
        }

        public static fkr<ProtoDecorateShowItem> parser() {
            return i.c();
        }
    }
}
