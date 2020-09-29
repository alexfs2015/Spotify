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

    public static final class ProtoDecorateEpisodeItem extends GeneratedMessageLite<ProtoDecorateEpisodeItem, a> implements jfi {
        /* access modifiers changed from: private */
        public static final ProtoDecorateEpisodeItem j;
        private static volatile fll<ProtoDecorateEpisodeItem> k;
        public String d = "";
        private int e;
        private ProtoEpisodeMetadata f;
        private ProtoEpisodeCollectionState g;
        private ProtoEpisodeOfflineState h;
        private ProtoEpisodePlayState i;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoDecorateEpisodeItem, a> implements jfi {
            private a() {
                super(ProtoDecorateEpisodeItem.j);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoDecorateEpisodeItem protoDecorateEpisodeItem = new ProtoDecorateEpisodeItem();
            j = protoDecorateEpisodeItem;
            protoDecorateEpisodeItem.e();
        }

        private ProtoDecorateEpisodeItem() {
        }

        public static fll<ProtoDecorateEpisodeItem> parser() {
            return j.c();
        }

        private boolean t() {
            return (this.e & 16) == 16;
        }

        /* JADX INFO: finally extract failed */
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
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata.a aVar = (this.e & 1) == 1 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata.a) this.f.h() : null;
                                    this.f = (ProtoEpisodeMetadata) fkw.a(ProtoEpisodeMetadata.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (ProtoEpisodeMetadata) aVar.e();
                                    }
                                    this.e |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState.a aVar2 = (this.e & 2) == 2 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState.a) this.g.h() : null;
                                    this.g = (ProtoEpisodeCollectionState) fkw.a(ProtoEpisodeCollectionState.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (ProtoEpisodeCollectionState) aVar2.e();
                                    }
                                    this.e |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState.a aVar3 = (this.e & 4) == 4 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState.a) this.h.h() : null;
                                    this.h = (ProtoEpisodeOfflineState) fkw.a(ProtoEpisodeOfflineState.parser(), fky);
                                    if (aVar3 != null) {
                                        aVar3.a(this.h);
                                        this.h = (ProtoEpisodeOfflineState) aVar3.e();
                                    }
                                    this.e |= 4;
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState.a aVar4 = (this.e & 8) == 8 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState.a) this.i.h() : null;
                                    this.i = (ProtoEpisodePlayState) fkw.a(ProtoEpisodePlayState.parser(), fky);
                                    if (aVar4 != null) {
                                        aVar4.a(this.i);
                                        this.i = (ProtoEpisodePlayState) aVar4.e();
                                    }
                                    this.e |= 8;
                                } else if (a2 == 42) {
                                    String c = fkw.c();
                                    this.e |= 16;
                                    this.d = c;
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
                        synchronized (ProtoDecorateEpisodeItem.class) {
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
            if ((this.e & 1) == 1) {
                codedOutputStream.a(1, (fli) l());
            }
            if ((this.e & 2) == 2) {
                codedOutputStream.a(2, (fli) n());
            }
            if ((this.e & 4) == 4) {
                boolean z = true | true;
                codedOutputStream.a(3, (fli) p());
            }
            if ((this.e & 8) == 8) {
                codedOutputStream.a(4, (fli) r());
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
                i3 = 0 + CodedOutputStream.b(1, (fli) l());
            }
            if ((this.e & 2) == 2) {
                i3 += CodedOutputStream.b(2, (fli) n());
            }
            if ((this.e & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fli) p());
            }
            if ((this.e & 8) == 8) {
                i3 += CodedOutputStream.b(4, (fli) r());
            }
            if ((this.e & 16) == 16) {
                i3 += CodedOutputStream.b(5, this.d);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final boolean k() {
            return (this.e & 1) == 1;
        }

        public final ProtoEpisodeMetadata l() {
            ProtoEpisodeMetadata protoEpisodeMetadata = this.f;
            if (protoEpisodeMetadata == null) {
                protoEpisodeMetadata = ProtoEpisodeMetadata.t();
            }
            return protoEpisodeMetadata;
        }

        public final boolean m() {
            return (this.e & 2) == 2;
        }

        public final ProtoEpisodeCollectionState n() {
            ProtoEpisodeCollectionState protoEpisodeCollectionState = this.g;
            if (protoEpisodeCollectionState == null) {
                protoEpisodeCollectionState = ProtoEpisodeCollectionState.l();
            }
            return protoEpisodeCollectionState;
        }

        public final boolean o() {
            return (this.e & 4) == 4;
        }

        public final ProtoEpisodeOfflineState p() {
            ProtoEpisodeOfflineState protoEpisodeOfflineState = this.h;
            if (protoEpisodeOfflineState == null) {
                protoEpisodeOfflineState = ProtoEpisodeOfflineState.k();
            }
            return protoEpisodeOfflineState;
        }

        public final boolean q() {
            return (this.e & 8) == 8;
        }

        public final ProtoEpisodePlayState r() {
            ProtoEpisodePlayState protoEpisodePlayState = this.i;
            if (protoEpisodePlayState == null) {
                protoEpisodePlayState = ProtoEpisodePlayState.m();
            }
            return protoEpisodePlayState;
        }
    }

    public static final class ProtoDecorateResponse extends GeneratedMessageLite<ProtoDecorateResponse, a> implements jfj {
        /* access modifiers changed from: private */
        public static final ProtoDecorateResponse f;
        private static volatile fll<ProtoDecorateResponse> g;
        public e<ProtoDecorateShowItem> d = flm.d();
        public e<ProtoDecorateEpisodeItem> e = flm.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoDecorateResponse, a> implements jfj {
            private a() {
                super(ProtoDecorateResponse.f);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoDecorateResponse protoDecorateResponse = new ProtoDecorateResponse();
            f = protoDecorateResponse;
            protoDecorateResponse.e();
        }

        private ProtoDecorateResponse() {
        }

        public static ProtoDecorateResponse a(byte[] bArr) {
            return (ProtoDecorateResponse) GeneratedMessageLite.a(f, bArr);
        }

        public static fll<ProtoDecorateResponse> parser() {
            return f.c();
        }

        /* JADX INFO: finally extract failed */
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
                                    this.d.add(fkw.a(ProtoDecorateShowItem.parser(), fky));
                                } else if (a2 == 18) {
                                    if (!this.e.a()) {
                                        this.e = GeneratedMessageLite.a(this.e);
                                    }
                                    this.e.add(fkw.a(ProtoDecorateEpisodeItem.parser(), fky));
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
                    if (g == null) {
                        synchronized (ProtoDecorateResponse.class) {
                            try {
                                if (g == null) {
                                    g = new b(f);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.d.size(); i++) {
                boolean z = !true;
                codedOutputStream.a(1, (fli) this.d.get(i));
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                codedOutputStream.a(2, (fli) this.e.get(i2));
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
                i2 += CodedOutputStream.b(1, (fli) this.d.get(i3));
            }
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                i2 += CodedOutputStream.b(2, (fli) this.e.get(i4));
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final int k() {
            return this.e.size();
        }
    }

    public static final class ProtoDecorateShowItem extends GeneratedMessageLite<ProtoDecorateShowItem, a> implements jfk {
        /* access modifiers changed from: private */
        public static final ProtoDecorateShowItem i;
        private static volatile fll<ProtoDecorateShowItem> j;
        public int d;
        public String e = "";
        private ProtoShowMetadata f;
        private ProtoShowCollectionState g;
        private ProtoShowPlayState h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoDecorateShowItem, a> implements jfk {
            private a() {
                super(ProtoDecorateShowItem.i);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoDecorateShowItem protoDecorateShowItem = new ProtoDecorateShowItem();
            i = protoDecorateShowItem;
            protoDecorateShowItem.e();
        }

        private ProtoDecorateShowItem() {
        }

        private boolean o() {
            return (this.d & 8) == 8;
        }

        public static fll<ProtoDecorateShowItem> parser() {
            return i.c();
        }

        /* JADX INFO: finally extract failed */
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
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    com.spotify.mobile.android.spotlets.show.proto.ShowMetadata.ProtoShowMetadata.a aVar = (this.d & 1) == 1 ? (com.spotify.mobile.android.spotlets.show.proto.ShowMetadata.ProtoShowMetadata.a) this.f.h() : null;
                                    this.f = (ProtoShowMetadata) fkw.a(ProtoShowMetadata.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (ProtoShowMetadata) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowCollectionState.a aVar2 = (this.d & 2) == 2 ? (com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowCollectionState.a) this.g.h() : null;
                                    this.g = (ProtoShowCollectionState) fkw.a(ProtoShowCollectionState.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (ProtoShowCollectionState) aVar2.e();
                                    }
                                    this.d |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowPlayState.a aVar3 = (this.d & 4) == 4 ? (com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowPlayState.a) this.h.h() : null;
                                    this.h = (ProtoShowPlayState) fkw.a(ProtoShowPlayState.parser(), fky);
                                    if (aVar3 != null) {
                                        aVar3.a(this.h);
                                        this.h = (ProtoShowPlayState) aVar3.e();
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
                        Class<ProtoDecorateShowItem> cls = ProtoDecorateShowItem.class;
                        synchronized (ProtoDecorateShowItem.class) {
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

        public final ProtoShowMetadata k() {
            ProtoShowMetadata protoShowMetadata = this.f;
            return protoShowMetadata == null ? ProtoShowMetadata.o() : protoShowMetadata;
        }

        public final ProtoShowCollectionState l() {
            ProtoShowCollectionState protoShowCollectionState = this.g;
            if (protoShowCollectionState == null) {
                protoShowCollectionState = ProtoShowCollectionState.l();
            }
            return protoShowCollectionState;
        }

        public final ProtoShowPlayState m() {
            ProtoShowPlayState protoShowPlayState = this.h;
            return protoShowPlayState == null ? ProtoShowPlayState.l() : protoShowPlayState;
        }
    }
}
