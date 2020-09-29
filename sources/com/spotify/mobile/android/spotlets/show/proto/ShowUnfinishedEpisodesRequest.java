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

public final class ShowUnfinishedEpisodesRequest {

    public static final class Episode extends GeneratedMessageLite<Episode, a> implements jfy {
        /* access modifiers changed from: private */
        public static final Episode j;
        private static volatile fll<Episode> k;
        public int d;
        private ProtoEpisodeMetadata e;
        private ProtoEpisodeCollectionState f;
        private ProtoEpisodeOfflineState g;
        private ProtoEpisodePlayState h;
        private String i = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Episode, a> implements jfy {
            private a() {
                super(Episode.j);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            Episode episode = new Episode();
            j = episode;
            episode.e();
        }

        private Episode() {
        }

        private boolean p() {
            return (this.d & 16) == 16;
        }

        public static fll<Episode> parser() {
            return j.c();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            boolean z2 = false | false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Episode();
                case IS_INITIALIZED:
                    return j;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Episode episode = (Episode) obj2;
                    this.e = (ProtoEpisodeMetadata) fVar.a(this.e, episode.e);
                    this.f = (ProtoEpisodeCollectionState) fVar.a(this.f, episode.f);
                    this.g = (ProtoEpisodeOfflineState) fVar.a(this.g, episode.g);
                    this.h = (ProtoEpisodePlayState) fVar.a(this.h, episode.h);
                    this.i = fVar.a(p(), this.i, episode.p(), episode.i);
                    if (fVar == e.a) {
                        this.d |= episode.d;
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
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata.a aVar = (this.d & 1) == 1 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata.a) this.e.h() : null;
                                    this.e = (ProtoEpisodeMetadata) fkw.a(ProtoEpisodeMetadata.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.e);
                                        this.e = (ProtoEpisodeMetadata) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState.a aVar2 = (this.d & 2) == 2 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState.a) this.f.h() : null;
                                    this.f = (ProtoEpisodeCollectionState) fkw.a(ProtoEpisodeCollectionState.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.f);
                                        this.f = (ProtoEpisodeCollectionState) aVar2.e();
                                    }
                                    this.d |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState.a aVar3 = (this.d & 4) == 4 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState.a) this.g.h() : null;
                                    this.g = (ProtoEpisodeOfflineState) fkw.a(ProtoEpisodeOfflineState.parser(), fky);
                                    if (aVar3 != null) {
                                        aVar3.a(this.g);
                                        this.g = (ProtoEpisodeOfflineState) aVar3.e();
                                    }
                                    this.d |= 4;
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState.a aVar4 = (this.d & 8) == 8 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState.a) this.h.h() : null;
                                    this.h = (ProtoEpisodePlayState) fkw.a(ProtoEpisodePlayState.parser(), fky);
                                    if (aVar4 != null) {
                                        aVar4.a(this.h);
                                        this.h = (ProtoEpisodePlayState) aVar4.e();
                                    }
                                    this.d |= 8;
                                } else if (a2 == 42) {
                                    String c = fkw.c();
                                    this.d |= 16;
                                    this.i = c;
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
                        Class<Episode> cls = Episode.class;
                        synchronized (Episode.class) {
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
                codedOutputStream.a(5, this.i);
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
                i3 += CodedOutputStream.b(5, this.i);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final ProtoEpisodeMetadata k() {
            ProtoEpisodeMetadata protoEpisodeMetadata = this.e;
            if (protoEpisodeMetadata == null) {
                protoEpisodeMetadata = ProtoEpisodeMetadata.t();
            }
            return protoEpisodeMetadata;
        }

        public final ProtoEpisodeCollectionState l() {
            ProtoEpisodeCollectionState protoEpisodeCollectionState = this.f;
            if (protoEpisodeCollectionState == null) {
                protoEpisodeCollectionState = ProtoEpisodeCollectionState.l();
            }
            return protoEpisodeCollectionState;
        }

        public final ProtoEpisodeOfflineState m() {
            ProtoEpisodeOfflineState protoEpisodeOfflineState = this.g;
            if (protoEpisodeOfflineState == null) {
                protoEpisodeOfflineState = ProtoEpisodeOfflineState.k();
            }
            return protoEpisodeOfflineState;
        }

        public final ProtoEpisodePlayState n() {
            ProtoEpisodePlayState protoEpisodePlayState = this.h;
            if (protoEpisodePlayState == null) {
                protoEpisodePlayState = ProtoEpisodePlayState.m();
            }
            return protoEpisodePlayState;
        }
    }

    public static final class Response extends GeneratedMessageLite<Response, a> implements jfz {
        /* access modifiers changed from: private */
        public static final Response f;
        private static volatile fll<Response> g;
        public e<Episode> d = flm.d();
        private e<Show> e = flm.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Response, a> implements jfz {
            private a() {
                super(Response.f);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            Response response = new Response();
            f = response;
            response.e();
        }

        private Response() {
        }

        public static Response a(byte[] bArr) {
            return (Response) GeneratedMessageLite.a(f, bArr);
        }

        public static fll<Response> parser() {
            return f.c();
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            char c;
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Response();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    this.e.b();
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Response response = (Response) obj2;
                    this.e = fVar.a(this.e, response.e);
                    this.d = fVar.a(this.d, response.d);
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
                                    if (!this.e.a()) {
                                        this.e = GeneratedMessageLite.a(this.e);
                                    }
                                    this.e.add(fkw.a(Show.parser(), fky));
                                } else if (a2 == 18) {
                                    if (!this.d.a()) {
                                        this.d = GeneratedMessageLite.a(this.d);
                                    }
                                    this.d.add(fkw.a(Episode.parser(), fky));
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
                        } finally {
                        }
                    }
                    break;
                case GET_DEFAULT_INSTANCE:
                    break;
                case GET_PARSER:
                    if (g == null) {
                        synchronized (Response.class) {
                            try {
                                if (g == null) {
                                    g = new b(f);
                                }
                            } catch (Throwable th) {
                                throw th;
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
            for (int i = 0; i < this.e.size(); i++) {
                codedOutputStream.a(1, (fli) this.e.get(i));
            }
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                codedOutputStream.a(2, (fli) this.d.get(i2));
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                i2 += CodedOutputStream.b(1, (fli) this.e.get(i3));
            }
            for (int i4 = 0; i4 < this.d.size(); i4++) {
                i2 += CodedOutputStream.b(2, (fli) this.d.get(i4));
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final int k() {
            return this.d.size();
        }
    }

    public static final class Show extends GeneratedMessageLite<Show, a> implements jga {
        /* access modifiers changed from: private */
        public static final Show i;
        private static volatile fll<Show> j;
        private int d;
        private ProtoShowMetadata e;
        private ProtoShowCollectionState f;
        private ProtoShowPlayState g;
        private String h = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Show, a> implements jga {
            private a() {
                super(Show.i);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            Show show = new Show();
            i = show;
            show.e();
        }

        private Show() {
        }

        private ProtoShowMetadata l() {
            ProtoShowMetadata protoShowMetadata = this.e;
            if (protoShowMetadata == null) {
                protoShowMetadata = ProtoShowMetadata.o();
            }
            return protoShowMetadata;
        }

        private ProtoShowCollectionState m() {
            ProtoShowCollectionState protoShowCollectionState = this.f;
            if (protoShowCollectionState == null) {
                protoShowCollectionState = ProtoShowCollectionState.l();
            }
            return protoShowCollectionState;
        }

        private ProtoShowPlayState n() {
            ProtoShowPlayState protoShowPlayState = this.g;
            if (protoShowPlayState == null) {
                protoShowPlayState = ProtoShowPlayState.l();
            }
            return protoShowPlayState;
        }

        private boolean o() {
            return (this.d & 8) == 8;
        }

        public static fll<Show> parser() {
            return i.c();
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            boolean z2 = true;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Show();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Show show = (Show) obj2;
                    this.e = (ProtoShowMetadata) fVar.a(this.e, show.e);
                    this.f = (ProtoShowCollectionState) fVar.a(this.f, show.f);
                    this.g = (ProtoShowPlayState) fVar.a(this.g, show.g);
                    this.h = fVar.a(o(), this.h, show.o(), show.h);
                    if (fVar == e.a) {
                        this.d |= show.d;
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
                                } else if (a2 == 34) {
                                    String c = fkw.c();
                                    this.d |= 8;
                                    this.h = c;
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
                        synchronized (Show.class) {
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
                codedOutputStream.a(1, (fli) l());
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, (fli) m());
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.a(3, (fli) n());
            }
            if ((this.d & 8) == 8) {
                codedOutputStream.a(4, this.h);
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
                i3 += CodedOutputStream.b(2, (fli) m());
            }
            if ((this.d & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fli) n());
            }
            if ((this.d & 8) == 8) {
                i3 += CodedOutputStream.b(4, this.h);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }
    }
}
