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
import com.spotify.podcastextensions.proto.Podcastextensions.PodcastTopics;
import java.io.IOException;

public final class ShowShowRequest {

    public static final class AuxiliarySections extends GeneratedMessageLite<AuxiliarySections, a> implements jfo {
        /* access modifiers changed from: private */
        public static final AuxiliarySections g;
        private static volatile fll<AuxiliarySections> h;
        public int d;
        private ContinueListeningSection e;
        private PodcastTopics f;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<AuxiliarySections, a> implements jfo {
            private a() {
                super(AuxiliarySections.g);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            AuxiliarySections auxiliarySections = new AuxiliarySections();
            g = auxiliarySections;
            auxiliarySections.e();
        }

        private AuxiliarySections() {
        }

        public static AuxiliarySections m() {
            return g;
        }

        public static fll<AuxiliarySections> parser() {
            return g.c();
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new AuxiliarySections();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    AuxiliarySections auxiliarySections = (AuxiliarySections) obj2;
                    this.e = (ContinueListeningSection) fVar.a(this.e, auxiliarySections.e);
                    this.f = (PodcastTopics) fVar.a(this.f, auxiliarySections.f);
                    if (fVar == e.a) {
                        this.d |= auxiliarySections.d;
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
                                    a aVar = (this.d & 1) == 1 ? (a) this.e.h() : null;
                                    this.e = (ContinueListeningSection) fkw.a(ContinueListeningSection.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.e);
                                        this.e = (ContinueListeningSection) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.podcastextensions.proto.Podcastextensions.PodcastTopics.a aVar2 = (this.d & 2) == 2 ? (com.spotify.podcastextensions.proto.Podcastextensions.PodcastTopics.a) this.f.h() : null;
                                    this.f = (PodcastTopics) fkw.a(PodcastTopics.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.f);
                                        this.f = (PodcastTopics) aVar2.e();
                                    }
                                    this.d |= 2;
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
                        Class<AuxiliarySections> cls = AuxiliarySections.class;
                        synchronized (AuxiliarySections.class) {
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
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, (fli) k());
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, (fli) l());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.d & 1) == 1) {
                i2 = 0 + CodedOutputStream.b(1, (fli) k());
            }
            if ((this.d & 2) == 2) {
                i2 += CodedOutputStream.b(2, (fli) l());
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final ContinueListeningSection k() {
            ContinueListeningSection continueListeningSection = this.e;
            if (continueListeningSection == null) {
                continueListeningSection = ContinueListeningSection.l();
            }
            return continueListeningSection;
        }

        public final PodcastTopics l() {
            PodcastTopics podcastTopics = this.f;
            if (podcastTopics == null) {
                podcastTopics = PodcastTopics.l();
            }
            return podcastTopics;
        }
    }

    public static final class ContinueListeningSection extends GeneratedMessageLite<ContinueListeningSection, a> implements jfp {
        /* access modifiers changed from: private */
        public static final ContinueListeningSection f;
        private static volatile fll<ContinueListeningSection> g;
        public int d;
        private ProtoShowRequestItem e;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ContinueListeningSection, a> implements jfp {
            private a() {
                super(ContinueListeningSection.f);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ContinueListeningSection continueListeningSection = new ContinueListeningSection();
            f = continueListeningSection;
            continueListeningSection.e();
        }

        private ContinueListeningSection() {
        }

        public static ContinueListeningSection l() {
            return f;
        }

        public static fll<ContinueListeningSection> parser() {
            return f.c();
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ContinueListeningSection();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ContinueListeningSection continueListeningSection = (ContinueListeningSection) obj2;
                    this.e = (ProtoShowRequestItem) fVar.a(this.e, continueListeningSection.e);
                    if (fVar == e.a) {
                        this.d |= continueListeningSection.d;
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
                                    a aVar = (this.d & 1) == 1 ? (a) this.e.h() : null;
                                    this.e = (ProtoShowRequestItem) fkw.a(ProtoShowRequestItem.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.e);
                                        this.e = (ProtoShowRequestItem) aVar.e();
                                    }
                                    this.d |= 1;
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
                        synchronized (ContinueListeningSection.class) {
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
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, (fli) k());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.d & 1) == 1) {
                i2 = 0 + CodedOutputStream.b(1, (fli) k());
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final ProtoShowRequestItem k() {
            ProtoShowRequestItem protoShowRequestItem = this.e;
            if (protoShowRequestItem == null) {
                protoShowRequestItem = ProtoShowRequestItem.u();
            }
            return protoShowRequestItem;
        }
    }

    public static final class ProtoOnlineData extends GeneratedMessageLite<ProtoOnlineData, a> implements jfq {
        /* access modifiers changed from: private */
        public static final ProtoOnlineData f;
        private static volatile fll<ProtoOnlineData> g;
        private int d;
        private int e;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoOnlineData, a> implements jfq {
            private a() {
                super(ProtoOnlineData.f);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(int i) {
                b();
                ProtoOnlineData.a((ProtoOnlineData) this.a, i);
                return this;
            }
        }

        static {
            ProtoOnlineData protoOnlineData = new ProtoOnlineData();
            f = protoOnlineData;
            protoOnlineData.e();
        }

        private ProtoOnlineData() {
        }

        static /* synthetic */ void a(ProtoOnlineData protoOnlineData, int i) {
            protoOnlineData.d |= 1;
            protoOnlineData.e = i;
        }

        public static a l() {
            return (a) f.h();
        }

        public static ProtoOnlineData m() {
            return f;
        }

        private boolean o() {
            return (this.d & 1) == 1;
        }

        public static fll<ProtoOnlineData> parser() {
            return f.c();
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoOnlineData();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoOnlineData protoOnlineData = (ProtoOnlineData) obj2;
                    this.e = fVar.a(o(), this.e, protoOnlineData.o(), protoOnlineData.e);
                    if (fVar == e.a) {
                        this.d |= protoOnlineData.d;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkw fkw = (fkw) obj;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.d |= 1;
                                    this.e = fkw.g();
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
                        synchronized (ProtoOnlineData.class) {
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
            if ((this.d & 1) == 1) {
                codedOutputStream.c(1, this.e);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.d & 1) == 1) {
                i2 = 0 + CodedOutputStream.g(1, this.e);
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final int k() {
            return this.e;
        }
    }

    public static final class ProtoShowRequestHeader extends GeneratedMessageLite<ProtoShowRequestHeader, a> implements jfr {
        /* access modifiers changed from: private */
        public static final ProtoShowRequestHeader h;
        private static volatile fll<ProtoShowRequestHeader> i;
        private int d;
        private ProtoShowMetadata e;
        private ProtoShowCollectionState f;
        private ProtoShowPlayState g;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoShowRequestHeader, a> implements jfr {
            private a() {
                super(ProtoShowRequestHeader.h);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(ProtoShowMetadata protoShowMetadata) {
                b();
                ProtoShowRequestHeader.a((ProtoShowRequestHeader) this.a, protoShowMetadata);
                return this;
            }

            public final a a(ProtoShowCollectionState protoShowCollectionState) {
                b();
                ProtoShowRequestHeader.a((ProtoShowRequestHeader) this.a, protoShowCollectionState);
                return this;
            }

            public final a a(ProtoShowPlayState protoShowPlayState) {
                b();
                ProtoShowRequestHeader.a((ProtoShowRequestHeader) this.a, protoShowPlayState);
                return this;
            }
        }

        static {
            ProtoShowRequestHeader protoShowRequestHeader = new ProtoShowRequestHeader();
            h = protoShowRequestHeader;
            protoShowRequestHeader.e();
        }

        private ProtoShowRequestHeader() {
        }

        static /* synthetic */ void a(ProtoShowRequestHeader protoShowRequestHeader, ProtoShowMetadata protoShowMetadata) {
            if (protoShowMetadata != null) {
                protoShowRequestHeader.e = protoShowMetadata;
                protoShowRequestHeader.d |= 1;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoShowRequestHeader protoShowRequestHeader, ProtoShowCollectionState protoShowCollectionState) {
            if (protoShowCollectionState != null) {
                protoShowRequestHeader.f = protoShowCollectionState;
                protoShowRequestHeader.d |= 2;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoShowRequestHeader protoShowRequestHeader, ProtoShowPlayState protoShowPlayState) {
            if (protoShowPlayState != null) {
                protoShowRequestHeader.g = protoShowPlayState;
                protoShowRequestHeader.d |= 4;
                return;
            }
            throw new NullPointerException();
        }

        public static fll<ProtoShowRequestHeader> parser() {
            return h.c();
        }

        public static a q() {
            return (a) h.h();
        }

        public static ProtoShowRequestHeader r() {
            return h;
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoShowRequestHeader();
                case IS_INITIALIZED:
                    return h;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoShowRequestHeader protoShowRequestHeader = (ProtoShowRequestHeader) obj2;
                    this.e = (ProtoShowMetadata) fVar.a(this.e, protoShowRequestHeader.e);
                    this.f = (ProtoShowCollectionState) fVar.a(this.f, protoShowRequestHeader.f);
                    this.g = (ProtoShowPlayState) fVar.a(this.g, protoShowRequestHeader.g);
                    if (fVar == e.a) {
                        this.d |= protoShowRequestHeader.d;
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
                                    com.spotify.mobile.android.spotlets.show.proto.ShowMetadata.ProtoShowMetadata.a aVar = (this.d & 1) == 1 ? (com.spotify.mobile.android.spotlets.show.proto.ShowMetadata.ProtoShowMetadata.a) this.e.h() : null;
                                    this.e = (ProtoShowMetadata) fkw.a(ProtoShowMetadata.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.e);
                                        this.e = (ProtoShowMetadata) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowCollectionState.a aVar2 = (this.d & 2) == 2 ? (com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowCollectionState.a) this.f.h() : null;
                                    this.f = (ProtoShowCollectionState) fkw.a(ProtoShowCollectionState.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.f);
                                        this.f = (ProtoShowCollectionState) aVar2.e();
                                    }
                                    this.d |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowPlayState.a aVar3 = (this.d & 4) == 4 ? (com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowPlayState.a) this.g.h() : null;
                                    this.g = (ProtoShowPlayState) fkw.a(ProtoShowPlayState.parser(), fky);
                                    if (aVar3 != null) {
                                        aVar3.a(this.g);
                                        this.g = (ProtoShowPlayState) aVar3.e();
                                    }
                                    this.d |= 4;
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
                    if (i == null) {
                        synchronized (ProtoShowRequestHeader.class) {
                            try {
                                if (i == null) {
                                    i = new b(h);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return i;
                default:
                    throw new UnsupportedOperationException();
            }
            return h;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, (fli) l());
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, (fli) n());
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.a(3, (fli) p());
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
                i3 = 0 + CodedOutputStream.b(1, (fli) l());
            }
            if ((this.d & 2) == 2) {
                i3 += CodedOutputStream.b(2, (fli) n());
            }
            if ((this.d & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fli) p());
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final boolean k() {
            return (this.d & 1) == 1;
        }

        public final ProtoShowMetadata l() {
            ProtoShowMetadata protoShowMetadata = this.e;
            if (protoShowMetadata == null) {
                protoShowMetadata = ProtoShowMetadata.o();
            }
            return protoShowMetadata;
        }

        public final boolean m() {
            return (this.d & 2) == 2;
        }

        public final ProtoShowCollectionState n() {
            ProtoShowCollectionState protoShowCollectionState = this.f;
            if (protoShowCollectionState == null) {
                protoShowCollectionState = ProtoShowCollectionState.l();
            }
            return protoShowCollectionState;
        }

        public final boolean o() {
            return (this.d & 4) == 4;
        }

        public final ProtoShowPlayState p() {
            ProtoShowPlayState protoShowPlayState = this.g;
            return protoShowPlayState == null ? ProtoShowPlayState.l() : protoShowPlayState;
        }
    }

    public static final class ProtoShowRequestItem extends GeneratedMessageLite<ProtoShowRequestItem, a> implements jfs {
        /* access modifiers changed from: private */
        public static final ProtoShowRequestItem j;
        private static volatile fll<ProtoShowRequestItem> k;
        public String d = "";
        private int e;
        private ProtoEpisodeMetadata f;
        private ProtoEpisodeCollectionState g;
        private ProtoEpisodeOfflineState h;
        private ProtoEpisodePlayState i;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoShowRequestItem, a> implements jfs {
            private a() {
                super(ProtoShowRequestItem.j);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(ProtoEpisodeMetadata protoEpisodeMetadata) {
                b();
                ProtoShowRequestItem.a((ProtoShowRequestItem) this.a, protoEpisodeMetadata);
                return this;
            }

            public final a a(ProtoEpisodeCollectionState protoEpisodeCollectionState) {
                b();
                ProtoShowRequestItem.a((ProtoShowRequestItem) this.a, protoEpisodeCollectionState);
                return this;
            }

            public final a a(ProtoEpisodePlayState protoEpisodePlayState) {
                b();
                ProtoShowRequestItem.a((ProtoShowRequestItem) this.a, protoEpisodePlayState);
                return this;
            }

            public final a a(String str) {
                b();
                ProtoShowRequestItem.a((ProtoShowRequestItem) this.a, str);
                return this;
            }
        }

        static {
            ProtoShowRequestItem protoShowRequestItem = new ProtoShowRequestItem();
            j = protoShowRequestItem;
            protoShowRequestItem.e();
        }

        private ProtoShowRequestItem() {
        }

        static /* synthetic */ void a(ProtoShowRequestItem protoShowRequestItem, ProtoEpisodeMetadata protoEpisodeMetadata) {
            if (protoEpisodeMetadata != null) {
                protoShowRequestItem.f = protoEpisodeMetadata;
                protoShowRequestItem.e |= 2;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoShowRequestItem protoShowRequestItem, ProtoEpisodeCollectionState protoEpisodeCollectionState) {
            if (protoEpisodeCollectionState != null) {
                protoShowRequestItem.g = protoEpisodeCollectionState;
                protoShowRequestItem.e |= 4;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoShowRequestItem protoShowRequestItem, ProtoEpisodePlayState protoEpisodePlayState) {
            if (protoEpisodePlayState != null) {
                protoShowRequestItem.i = protoEpisodePlayState;
                protoShowRequestItem.e |= 16;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoShowRequestItem protoShowRequestItem, String str) {
            if (str != null) {
                protoShowRequestItem.e |= 1;
                protoShowRequestItem.d = str;
                return;
            }
            throw new NullPointerException();
        }

        public static fll<ProtoShowRequestItem> parser() {
            return j.c();
        }

        public static a t() {
            return (a) j.h();
        }

        public static ProtoShowRequestItem u() {
            return j;
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            int i2 = 7 << 0;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoShowRequestItem();
                case IS_INITIALIZED:
                    return j;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoShowRequestItem protoShowRequestItem = (ProtoShowRequestItem) obj2;
                    this.d = fVar.a(k(), this.d, protoShowRequestItem.k(), protoShowRequestItem.d);
                    this.f = (ProtoEpisodeMetadata) fVar.a(this.f, protoShowRequestItem.f);
                    this.g = (ProtoEpisodeCollectionState) fVar.a(this.g, protoShowRequestItem.g);
                    this.h = (ProtoEpisodeOfflineState) fVar.a(this.h, protoShowRequestItem.h);
                    this.i = (ProtoEpisodePlayState) fVar.a(this.i, protoShowRequestItem.i);
                    if (fVar == e.a) {
                        this.e |= protoShowRequestItem.e;
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
                                    this.e |= 1;
                                    this.d = c;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata.a aVar = (this.e & 2) == 2 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata.a) this.f.h() : null;
                                    this.f = (ProtoEpisodeMetadata) fkw.a(ProtoEpisodeMetadata.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (ProtoEpisodeMetadata) aVar.e();
                                    }
                                    this.e |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState.a aVar2 = (this.e & 4) == 4 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState.a) this.g.h() : null;
                                    this.g = (ProtoEpisodeCollectionState) fkw.a(ProtoEpisodeCollectionState.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (ProtoEpisodeCollectionState) aVar2.e();
                                    }
                                    this.e |= 4;
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState.a aVar3 = (this.e & 8) == 8 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState.a) this.h.h() : null;
                                    this.h = (ProtoEpisodeOfflineState) fkw.a(ProtoEpisodeOfflineState.parser(), fky);
                                    if (aVar3 != null) {
                                        aVar3.a(this.h);
                                        this.h = (ProtoEpisodeOfflineState) aVar3.e();
                                    }
                                    this.e |= 8;
                                } else if (a2 == 42) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState.a aVar4 = (this.e & 16) == 16 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState.a) this.i.h() : null;
                                    this.i = (ProtoEpisodePlayState) fkw.a(ProtoEpisodePlayState.parser(), fky);
                                    if (aVar4 != null) {
                                        aVar4.a(this.i);
                                        this.i = (ProtoEpisodePlayState) aVar4.e();
                                    }
                                    this.e |= 16;
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
                        synchronized (ProtoShowRequestItem.class) {
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
                codedOutputStream.a(1, this.d);
            }
            if ((this.e & 2) == 2) {
                codedOutputStream.a(2, (fli) m());
            }
            if ((this.e & 4) == 4) {
                codedOutputStream.a(3, (fli) o());
            }
            if ((this.e & 8) == 8) {
                codedOutputStream.a(4, (fli) q());
            }
            if ((this.e & 16) == 16) {
                codedOutputStream.a(5, (fli) s());
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
                i3 += CodedOutputStream.b(2, (fli) m());
            }
            if ((this.e & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fli) o());
            }
            if ((this.e & 8) == 8) {
                i3 += CodedOutputStream.b(4, (fli) q());
            }
            if ((this.e & 16) == 16) {
                i3 += CodedOutputStream.b(5, (fli) s());
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final boolean k() {
            return (this.e & 1) == 1;
        }

        public final boolean l() {
            return (this.e & 2) == 2;
        }

        public final ProtoEpisodeMetadata m() {
            ProtoEpisodeMetadata protoEpisodeMetadata = this.f;
            if (protoEpisodeMetadata == null) {
                protoEpisodeMetadata = ProtoEpisodeMetadata.t();
            }
            return protoEpisodeMetadata;
        }

        public final boolean n() {
            boolean z = true ^ true;
            return (this.e & 4) == 4;
        }

        public final ProtoEpisodeCollectionState o() {
            ProtoEpisodeCollectionState protoEpisodeCollectionState = this.g;
            if (protoEpisodeCollectionState == null) {
                protoEpisodeCollectionState = ProtoEpisodeCollectionState.l();
            }
            return protoEpisodeCollectionState;
        }

        public final boolean p() {
            return (this.e & 8) == 8;
        }

        public final ProtoEpisodeOfflineState q() {
            ProtoEpisodeOfflineState protoEpisodeOfflineState = this.h;
            if (protoEpisodeOfflineState == null) {
                protoEpisodeOfflineState = ProtoEpisodeOfflineState.k();
            }
            return protoEpisodeOfflineState;
        }

        public final boolean r() {
            return (this.e & 16) == 16;
        }

        public final ProtoEpisodePlayState s() {
            ProtoEpisodePlayState protoEpisodePlayState = this.i;
            if (protoEpisodePlayState == null) {
                protoEpisodePlayState = ProtoEpisodePlayState.m();
            }
            return protoEpisodePlayState;
        }
    }

    public static final class ProtoShowResponse extends GeneratedMessageLite<ProtoShowResponse, a> implements jft {
        /* access modifiers changed from: private */
        public static final ProtoShowResponse m;
        private static volatile fll<ProtoShowResponse> n;
        public e<ProtoShowRequestItem> d = flm.d();
        public int e;
        public boolean f;
        public int g;
        private int h;
        private ProtoShowRequestHeader i;
        private ProtoOnlineData j;
        private int k;
        private AuxiliarySections l;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoShowResponse, a> implements jft {
            private a() {
                super(ProtoShowResponse.m);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(int i) {
                b();
                ProtoShowResponse.a((ProtoShowResponse) this.a, i);
                return this;
            }

            public final a a(ProtoOnlineData protoOnlineData) {
                b();
                ProtoShowResponse.a((ProtoShowResponse) this.a, protoOnlineData);
                return this;
            }

            public final a a(ProtoShowRequestHeader protoShowRequestHeader) {
                b();
                ProtoShowResponse.a((ProtoShowResponse) this.a, protoShowRequestHeader);
                return this;
            }

            public final a a(Iterable<? extends ProtoShowRequestItem> iterable) {
                b();
                ProtoShowResponse.a((ProtoShowResponse) this.a, (Iterable) iterable);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoShowResponse.a((ProtoShowResponse) this.a, z);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoShowResponse.b((ProtoShowResponse) this.a, i);
                return this;
            }

            public final a c(int i) {
                b();
                ProtoShowResponse.c((ProtoShowResponse) this.a, i);
                return this;
            }
        }

        static {
            ProtoShowResponse protoShowResponse = new ProtoShowResponse();
            m = protoShowResponse;
            protoShowResponse.e();
        }

        private ProtoShowResponse() {
        }

        public static ProtoShowResponse a(byte[] bArr) {
            return (ProtoShowResponse) GeneratedMessageLite.a(m, bArr);
        }

        static /* synthetic */ void a(ProtoShowResponse protoShowResponse, int i2) {
            protoShowResponse.h |= 4;
            protoShowResponse.e = i2;
        }

        static /* synthetic */ void a(ProtoShowResponse protoShowResponse, ProtoOnlineData protoOnlineData) {
            if (protoOnlineData != null) {
                protoShowResponse.j = protoOnlineData;
                protoShowResponse.h |= 2;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoShowResponse protoShowResponse, ProtoShowRequestHeader protoShowRequestHeader) {
            if (protoShowRequestHeader != null) {
                protoShowResponse.i = protoShowRequestHeader;
                protoShowResponse.h |= 1;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoShowResponse protoShowResponse, Iterable iterable) {
            if (!protoShowResponse.d.a()) {
                protoShowResponse.d = GeneratedMessageLite.a(protoShowResponse.d);
            }
            fkr.a(iterable, protoShowResponse.d);
        }

        static /* synthetic */ void a(ProtoShowResponse protoShowResponse, boolean z) {
            protoShowResponse.h |= 16;
            protoShowResponse.f = z;
        }

        static /* synthetic */ void b(ProtoShowResponse protoShowResponse, int i2) {
            protoShowResponse.h |= 8;
            protoShowResponse.k = i2;
        }

        static /* synthetic */ void c(ProtoShowResponse protoShowResponse, int i2) {
            protoShowResponse.h |= 32;
            protoShowResponse.g = i2;
        }

        public static fll<ProtoShowResponse> parser() {
            return m.c();
        }

        public static a r() {
            return (a) m.h();
        }

        private boolean t() {
            return (this.h & 4) == 4;
        }

        private boolean u() {
            return (this.h & 8) == 8;
        }

        private boolean v() {
            if ((this.h & 16) != 16) {
                return false;
            }
            boolean z = true | true;
            return true;
        }

        private boolean w() {
            return (this.h & 32) == 32;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoShowResponse();
                case IS_INITIALIZED:
                    return m;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoShowResponse protoShowResponse = (ProtoShowResponse) obj2;
                    this.d = fVar.a(this.d, protoShowResponse.d);
                    this.i = (ProtoShowRequestHeader) fVar.a(this.i, protoShowResponse.i);
                    this.j = (ProtoOnlineData) fVar.a(this.j, protoShowResponse.j);
                    this.e = fVar.a(t(), this.e, protoShowResponse.t(), protoShowResponse.e);
                    this.k = fVar.a(u(), this.k, protoShowResponse.u(), protoShowResponse.k);
                    this.f = fVar.a(v(), this.f, protoShowResponse.v(), protoShowResponse.f);
                    this.g = fVar.a(w(), this.g, protoShowResponse.w(), protoShowResponse.g);
                    this.l = (AuxiliarySections) fVar.a(this.l, protoShowResponse.l);
                    if (fVar == e.a) {
                        this.h |= protoShowResponse.h;
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
                                    this.d.add(fkw.a(ProtoShowRequestItem.parser(), fky));
                                } else if (a2 == 18) {
                                    a aVar = (this.h & 1) == 1 ? (a) this.i.h() : null;
                                    this.i = (ProtoShowRequestHeader) fkw.a(ProtoShowRequestHeader.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.i);
                                        this.i = (ProtoShowRequestHeader) aVar.e();
                                    }
                                    this.h |= 1;
                                } else if (a2 == 26) {
                                    a aVar2 = (this.h & 2) == 2 ? (a) this.j.h() : null;
                                    this.j = (ProtoOnlineData) fkw.a(ProtoOnlineData.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.j);
                                        this.j = (ProtoOnlineData) aVar2.e();
                                    }
                                    this.h |= 2;
                                } else if (a2 == 32) {
                                    this.h |= 4;
                                    this.e = fkw.g();
                                } else if (a2 == 40) {
                                    this.h |= 8;
                                    this.k = fkw.g();
                                } else if (a2 == 48) {
                                    this.h |= 16;
                                    this.f = fkw.b();
                                } else if (a2 == 56) {
                                    this.h |= 32;
                                    this.g = fkw.g();
                                } else if (a2 == 66) {
                                    a aVar3 = (this.h & 64) == 64 ? (a) this.l.h() : null;
                                    this.l = (AuxiliarySections) fkw.a(AuxiliarySections.parser(), fky);
                                    if (aVar3 != null) {
                                        aVar3.a(this.l);
                                        this.l = (AuxiliarySections) aVar3.e();
                                    }
                                    this.h |= 64;
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
                    if (n == null) {
                        Class<ProtoShowResponse> cls = ProtoShowResponse.class;
                        synchronized (ProtoShowResponse.class) {
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

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                codedOutputStream.a(1, (fli) this.d.get(i2));
            }
            if ((this.h & 1) == 1) {
                codedOutputStream.a(2, (fli) m());
            }
            if ((this.h & 2) == 2) {
                codedOutputStream.a(3, (fli) o());
            }
            if ((this.h & 4) == 4) {
                codedOutputStream.c(4, this.e);
            }
            if ((this.h & 8) == 8) {
                codedOutputStream.c(5, this.k);
            }
            if ((this.h & 16) == 16) {
                codedOutputStream.a(6, this.f);
            }
            if ((this.h & 32) == 32) {
                codedOutputStream.c(7, this.g);
            }
            if ((this.h & 64) == 64) {
                codedOutputStream.a(8, (fli) q());
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
                i3 += CodedOutputStream.b(2, (fli) m());
            }
            if ((this.h & 2) == 2) {
                i3 += CodedOutputStream.b(3, (fli) o());
            }
            if ((this.h & 4) == 4) {
                i3 += CodedOutputStream.g(4, this.e);
            }
            if ((this.h & 8) == 8) {
                i3 += CodedOutputStream.g(5, this.k);
            }
            if ((this.h & 16) == 16) {
                i3 += CodedOutputStream.b(6, this.f);
            }
            if ((this.h & 32) == 32) {
                i3 += CodedOutputStream.g(7, this.g);
            }
            if ((this.h & 64) == 64) {
                i3 += CodedOutputStream.b(8, (fli) q());
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final int k() {
            return this.d.size();
        }

        public final boolean l() {
            return (this.h & 1) == 1;
        }

        public final ProtoShowRequestHeader m() {
            ProtoShowRequestHeader protoShowRequestHeader = this.i;
            if (protoShowRequestHeader == null) {
                protoShowRequestHeader = ProtoShowRequestHeader.r();
            }
            return protoShowRequestHeader;
        }

        public final boolean n() {
            return (this.h & 2) == 2;
        }

        public final ProtoOnlineData o() {
            ProtoOnlineData protoOnlineData = this.j;
            if (protoOnlineData == null) {
                protoOnlineData = ProtoOnlineData.m();
            }
            return protoOnlineData;
        }

        public final boolean p() {
            return (this.h & 64) == 64;
        }

        public final AuxiliarySections q() {
            AuxiliarySections auxiliarySections = this.l;
            if (auxiliarySections == null) {
                auxiliarySections = AuxiliarySections.m();
            }
            return auxiliarySections;
        }
    }
}
