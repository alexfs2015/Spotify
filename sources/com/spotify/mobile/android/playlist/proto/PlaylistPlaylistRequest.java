package com.spotify.mobile.android.playlist.proto;

import com.comscore.streaming.ContentType;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistFormatListAttribute;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistMetadata;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistState.ProtoPlaylistOfflineState;
import com.spotify.mobile.android.playlist.proto.PlaylistUserState.ProtoUser;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState;
import java.io.IOException;

public final class PlaylistPlaylistRequest {

    public static final class ProtoPlaylistHeader extends GeneratedMessageLite<ProtoPlaylistHeader, a> implements hbp {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistHeader g;
        private static volatile fkr<ProtoPlaylistHeader> h;
        public int d;
        private ProtoPlaylistMetadata e;
        private ProtoPlaylistOfflineState f;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistHeader, a> implements hbp {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoPlaylistHeader.g);
            }
        }

        private ProtoPlaylistHeader() {
        }

        public final ProtoPlaylistMetadata k() {
            ProtoPlaylistMetadata protoPlaylistMetadata = this.e;
            return protoPlaylistMetadata == null ? ProtoPlaylistMetadata.r() : protoPlaylistMetadata;
        }

        public final ProtoPlaylistOfflineState l() {
            ProtoPlaylistOfflineState protoPlaylistOfflineState = this.f;
            return protoPlaylistOfflineState == null ? ProtoPlaylistOfflineState.k() : protoPlaylistOfflineState;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, (fko) k());
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, (fko) l());
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
                i2 = 0 + CodedOutputStream.b(1, (fko) k());
            }
            if ((this.d & 2) == 2) {
                i2 += CodedOutputStream.b(2, (fko) l());
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoPlaylistHeader();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoPlaylistHeader protoPlaylistHeader = (ProtoPlaylistHeader) obj2;
                    this.e = (ProtoPlaylistMetadata) fVar.a(this.e, protoPlaylistHeader.e);
                    this.f = (ProtoPlaylistOfflineState) fVar.a(this.f, protoPlaylistHeader.f);
                    if (fVar == e.a) {
                        this.d |= protoPlaylistHeader.d;
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
                                    com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistMetadata.a aVar = (this.d & 1) == 1 ? (com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistMetadata.a) this.e.h() : null;
                                    this.e = (ProtoPlaylistMetadata) fkc.a(ProtoPlaylistMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.e);
                                        this.e = (ProtoPlaylistMetadata) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.playlist.proto.PlaylistPlaylistState.ProtoPlaylistOfflineState.a aVar2 = (this.d & 2) == 2 ? (com.spotify.mobile.android.playlist.proto.PlaylistPlaylistState.ProtoPlaylistOfflineState.a) this.f.h() : null;
                                    this.f = (ProtoPlaylistOfflineState) fkc.a(ProtoPlaylistOfflineState.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.f);
                                        this.f = (ProtoPlaylistOfflineState) aVar2.e();
                                    }
                                    this.d |= 2;
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
                        synchronized (ProtoPlaylistHeader.class) {
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
            ProtoPlaylistHeader protoPlaylistHeader = new ProtoPlaylistHeader();
            g = protoPlaylistHeader;
            protoPlaylistHeader.e();
        }

        public static ProtoPlaylistHeader m() {
            return g;
        }

        public static fkr<ProtoPlaylistHeader> parser() {
            return g.c();
        }
    }

    public static final class ProtoPlaylistItem extends GeneratedMessageLite<ProtoPlaylistItem, a> implements hbq {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistItem r;
        private static volatile fkr<ProtoPlaylistItem> s;
        public int d;
        public String e;
        public int f;
        public String g;
        public e<ProtoPlaylistFormatListAttribute> h = fks.d();
        private ProtoUser i;
        private ProtoTrackMetadata j;
        private ProtoTrackCollectionState k;
        private ProtoTrackOfflineState l;
        private ProtoTrackPlayState m;
        private ProtoEpisodeMetadata n;
        private ProtoEpisodeOfflineState o;
        private ProtoEpisodeCollectionState p;
        private ProtoEpisodePlayState q;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistItem, a> implements hbq {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoPlaylistItem.r);
            }
        }

        private ProtoPlaylistItem() {
            String str = "";
            this.e = str;
            this.g = str;
        }

        public final boolean k() {
            return (this.d & 1) == 1;
        }

        private boolean v() {
            return (this.d & 2) == 2;
        }

        public final ProtoUser l() {
            ProtoUser protoUser = this.i;
            return protoUser == null ? ProtoUser.k() : protoUser;
        }

        public final ProtoTrackMetadata m() {
            ProtoTrackMetadata protoTrackMetadata = this.j;
            return protoTrackMetadata == null ? ProtoTrackMetadata.o() : protoTrackMetadata;
        }

        public final ProtoTrackCollectionState n() {
            ProtoTrackCollectionState protoTrackCollectionState = this.k;
            return protoTrackCollectionState == null ? ProtoTrackCollectionState.l() : protoTrackCollectionState;
        }

        public final ProtoTrackOfflineState o() {
            ProtoTrackOfflineState protoTrackOfflineState = this.l;
            return protoTrackOfflineState == null ? ProtoTrackOfflineState.k() : protoTrackOfflineState;
        }

        private boolean w() {
            return (this.d & 64) == 64;
        }

        public final ProtoTrackPlayState p() {
            ProtoTrackPlayState protoTrackPlayState = this.m;
            return protoTrackPlayState == null ? ProtoTrackPlayState.m() : protoTrackPlayState;
        }

        public final ProtoEpisodeMetadata q() {
            ProtoEpisodeMetadata protoEpisodeMetadata = this.n;
            return protoEpisodeMetadata == null ? ProtoEpisodeMetadata.t() : protoEpisodeMetadata;
        }

        public final ProtoEpisodeOfflineState r() {
            ProtoEpisodeOfflineState protoEpisodeOfflineState = this.o;
            return protoEpisodeOfflineState == null ? ProtoEpisodeOfflineState.k() : protoEpisodeOfflineState;
        }

        public final ProtoEpisodeCollectionState s() {
            ProtoEpisodeCollectionState protoEpisodeCollectionState = this.p;
            return protoEpisodeCollectionState == null ? ProtoEpisodeCollectionState.l() : protoEpisodeCollectionState;
        }

        public final ProtoEpisodePlayState t() {
            ProtoEpisodePlayState protoEpisodePlayState = this.q;
            return protoEpisodePlayState == null ? ProtoEpisodePlayState.m() : protoEpisodePlayState;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, this.e);
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.c(2, this.f);
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.a(3, (fko) l());
            }
            if ((this.d & 8) == 8) {
                codedOutputStream.a(4, (fko) m());
            }
            if ((this.d & 16) == 16) {
                codedOutputStream.a(5, (fko) n());
            }
            if ((this.d & 32) == 32) {
                codedOutputStream.a(6, (fko) o());
            }
            if ((this.d & 64) == 64) {
                codedOutputStream.a(7, this.g);
            }
            if ((this.d & 128) == 128) {
                codedOutputStream.a(8, (fko) p());
            }
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                codedOutputStream.a(9, (fko) this.h.get(i2));
            }
            if ((this.d & 256) == 256) {
                codedOutputStream.a(10, (fko) q());
            }
            if ((this.d & 512) == 512) {
                codedOutputStream.a(11, (fko) r());
            }
            if ((this.d & 1024) == 1024) {
                codedOutputStream.a(12, (fko) s());
            }
            if ((this.d & 2048) == 2048) {
                codedOutputStream.a(13, (fko) t());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int b = (this.d & 1) == 1 ? CodedOutputStream.b(1, this.e) + 0 : 0;
            if ((this.d & 2) == 2) {
                b += CodedOutputStream.g(2, this.f);
            }
            if ((this.d & 4) == 4) {
                b += CodedOutputStream.b(3, (fko) l());
            }
            if ((this.d & 8) == 8) {
                b += CodedOutputStream.b(4, (fko) m());
            }
            if ((this.d & 16) == 16) {
                b += CodedOutputStream.b(5, (fko) n());
            }
            if ((this.d & 32) == 32) {
                b += CodedOutputStream.b(6, (fko) o());
            }
            if ((this.d & 64) == 64) {
                b += CodedOutputStream.b(7, this.g);
            }
            if ((this.d & 128) == 128) {
                b += CodedOutputStream.b(8, (fko) p());
            }
            for (int i3 = 0; i3 < this.h.size(); i3++) {
                b += CodedOutputStream.b(9, (fko) this.h.get(i3));
            }
            if ((this.d & 256) == 256) {
                b += CodedOutputStream.b(10, (fko) q());
            }
            if ((this.d & 512) == 512) {
                b += CodedOutputStream.b(11, (fko) r());
            }
            if ((this.d & 1024) == 1024) {
                b += CodedOutputStream.b(12, (fko) s());
            }
            if ((this.d & 2048) == 2048) {
                b += CodedOutputStream.b(13, (fko) t());
            }
            int d2 = b + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoPlaylistItem();
                case IS_INITIALIZED:
                    return r;
                case MAKE_IMMUTABLE:
                    this.h.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoPlaylistItem protoPlaylistItem = (ProtoPlaylistItem) obj2;
                    this.e = fVar.a(k(), this.e, protoPlaylistItem.k(), protoPlaylistItem.e);
                    this.f = fVar.a(v(), this.f, protoPlaylistItem.v(), protoPlaylistItem.f);
                    this.i = (ProtoUser) fVar.a(this.i, protoPlaylistItem.i);
                    this.j = (ProtoTrackMetadata) fVar.a(this.j, protoPlaylistItem.j);
                    this.k = (ProtoTrackCollectionState) fVar.a(this.k, protoPlaylistItem.k);
                    this.l = (ProtoTrackOfflineState) fVar.a(this.l, protoPlaylistItem.l);
                    this.g = fVar.a(w(), this.g, protoPlaylistItem.w(), protoPlaylistItem.g);
                    this.m = (ProtoTrackPlayState) fVar.a(this.m, protoPlaylistItem.m);
                    this.h = fVar.a(this.h, protoPlaylistItem.h);
                    this.n = (ProtoEpisodeMetadata) fVar.a(this.n, protoPlaylistItem.n);
                    this.o = (ProtoEpisodeOfflineState) fVar.a(this.o, protoPlaylistItem.o);
                    this.p = (ProtoEpisodeCollectionState) fVar.a(this.p, protoPlaylistItem.p);
                    this.q = (ProtoEpisodePlayState) fVar.a(this.q, protoPlaylistItem.q);
                    if (fVar == e.a) {
                        this.d |= protoPlaylistItem.d;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    fke fke = (fke) obj2;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            switch (a2) {
                                case 0:
                                    z = true;
                                    break;
                                case 10:
                                    String c = fkc.c();
                                    this.d |= 1;
                                    this.e = c;
                                    break;
                                case 16:
                                    this.d |= 2;
                                    this.f = fkc.g();
                                    break;
                                case 26:
                                    com.spotify.mobile.android.playlist.proto.PlaylistUserState.ProtoUser.a aVar = (this.d & 4) == 4 ? (com.spotify.mobile.android.playlist.proto.PlaylistUserState.ProtoUser.a) this.i.h() : null;
                                    this.i = (ProtoUser) fkc.a(ProtoUser.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.i);
                                        this.i = (ProtoUser) aVar.e();
                                    }
                                    this.d |= 4;
                                    break;
                                case 34:
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.a aVar2 = (this.d & 8) == 8 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.a) this.j.h() : null;
                                    this.j = (ProtoTrackMetadata) fkc.a(ProtoTrackMetadata.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.j);
                                        this.j = (ProtoTrackMetadata) aVar2.e();
                                    }
                                    this.d |= 8;
                                    break;
                                case 42:
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState.a aVar3 = (this.d & 16) == 16 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState.a) this.k.h() : null;
                                    this.k = (ProtoTrackCollectionState) fkc.a(ProtoTrackCollectionState.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a(this.k);
                                        this.k = (ProtoTrackCollectionState) aVar3.e();
                                    }
                                    this.d |= 16;
                                    break;
                                case 50:
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState.a aVar4 = (this.d & 32) == 32 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState.a) this.l.h() : null;
                                    this.l = (ProtoTrackOfflineState) fkc.a(ProtoTrackOfflineState.parser(), fke);
                                    if (aVar4 != null) {
                                        aVar4.a(this.l);
                                        this.l = (ProtoTrackOfflineState) aVar4.e();
                                    }
                                    this.d |= 32;
                                    break;
                                case 58:
                                    String c2 = fkc.c();
                                    this.d |= 64;
                                    this.g = c2;
                                    break;
                                case b.bu /*66*/:
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState.a aVar5 = (this.d & 128) == 128 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState.a) this.m.h() : null;
                                    this.m = (ProtoTrackPlayState) fkc.a(ProtoTrackPlayState.parser(), fke);
                                    if (aVar5 != null) {
                                        aVar5.a(this.m);
                                        this.m = (ProtoTrackPlayState) aVar5.e();
                                    }
                                    this.d |= 128;
                                    break;
                                case b.bC /*74*/:
                                    if (!this.h.a()) {
                                        this.h = GeneratedMessageLite.a(this.h);
                                    }
                                    this.h.add(fkc.a(ProtoPlaylistFormatListAttribute.parser(), fke));
                                    break;
                                case 82:
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata.a aVar6 = (this.d & 256) == 256 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata.a) this.n.h() : null;
                                    this.n = (ProtoEpisodeMetadata) fkc.a(ProtoEpisodeMetadata.parser(), fke);
                                    if (aVar6 != null) {
                                        aVar6.a(this.n);
                                        this.n = (ProtoEpisodeMetadata) aVar6.e();
                                    }
                                    this.d |= 256;
                                    break;
                                case 90:
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState.a aVar7 = (this.d & 512) == 512 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState.a) this.o.h() : null;
                                    this.o = (ProtoEpisodeOfflineState) fkc.a(ProtoEpisodeOfflineState.parser(), fke);
                                    if (aVar7 != null) {
                                        aVar7.a(this.o);
                                        this.o = (ProtoEpisodeOfflineState) aVar7.e();
                                    }
                                    this.d |= 512;
                                    break;
                                case 98:
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState.a aVar8 = (this.d & 1024) == 1024 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState.a) this.p.h() : null;
                                    this.p = (ProtoEpisodeCollectionState) fkc.a(ProtoEpisodeCollectionState.parser(), fke);
                                    if (aVar8 != null) {
                                        aVar8.a(this.p);
                                        this.p = (ProtoEpisodeCollectionState) aVar8.e();
                                    }
                                    this.d |= 1024;
                                    break;
                                case 106:
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState.a aVar9 = (this.d & 2048) == 2048 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState.a) this.q.h() : null;
                                    this.q = (ProtoEpisodePlayState) fkc.a(ProtoEpisodePlayState.parser(), fke);
                                    if (aVar9 != null) {
                                        aVar9.a(this.q);
                                        this.q = (ProtoEpisodePlayState) aVar9.e();
                                    }
                                    this.d |= 2048;
                                    break;
                                default:
                                    if (a(a2, fkc)) {
                                        break;
                                    }
                                    z = true;
                                    break;
                            }
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
                    if (s == null) {
                        synchronized (ProtoPlaylistItem.class) {
                            if (s == null) {
                                s = new b(r);
                            }
                        }
                    }
                    return s;
                default:
                    throw new UnsupportedOperationException();
            }
            return r;
        }

        static {
            ProtoPlaylistItem protoPlaylistItem = new ProtoPlaylistItem();
            r = protoPlaylistItem;
            protoPlaylistItem.e();
        }

        public static fkr<ProtoPlaylistItem> parser() {
            return r.c();
        }
    }

    public static final class ProtoPlaylistResponse extends GeneratedMessageLite<ProtoPlaylistResponse, a> implements hbr {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistResponse w;
        private static volatile fkr<ProtoPlaylistResponse> x;
        public int d;
        public e<ProtoPlaylistItem> e = fks.d();
        public int f;
        public int g;
        public long h;
        public boolean i;
        public long j;
        public int k;
        public e<ProtoRecommendationItem> l = fks.d();
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public int r;
        public int s;
        private ProtoPlaylistHeader t;
        private boolean u;
        private boolean v;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistResponse, a> implements hbr {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoPlaylistResponse.w);
            }
        }

        private ProtoPlaylistResponse() {
        }

        public final ProtoPlaylistHeader k() {
            ProtoPlaylistHeader protoPlaylistHeader = this.t;
            return protoPlaylistHeader == null ? ProtoPlaylistHeader.m() : protoPlaylistHeader;
        }

        private boolean n() {
            return (this.d & 2) == 2;
        }

        private boolean o() {
            return (this.d & 4) == 4;
        }

        private boolean p() {
            return (this.d & 8) == 8;
        }

        private boolean q() {
            return (this.d & 16) == 16;
        }

        private boolean r() {
            return (this.d & 32) == 32;
        }

        private boolean s() {
            return (this.d & 64) == 64;
        }

        private boolean t() {
            return (this.d & 128) == 128;
        }

        private boolean u() {
            return (this.d & 256) == 256;
        }

        private boolean v() {
            return (this.d & 512) == 512;
        }

        private boolean w() {
            return (this.d & 1024) == 1024;
        }

        private boolean x() {
            return (this.d & 2048) == 2048;
        }

        private boolean y() {
            return (this.d & 4096) == 4096;
        }

        public final boolean l() {
            return (this.d & 8192) == 8192;
        }

        private boolean z() {
            return (this.d & 16384) == 16384;
        }

        private boolean A() {
            return (this.d & 32768) == 32768;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                codedOutputStream.a(1, (fko) this.e.get(i2));
            }
            if ((this.d & 1) == 1) {
                codedOutputStream.a(2, (fko) k());
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.c(3, this.f);
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.c(4, this.g);
            }
            if ((this.d & 8) == 8) {
                codedOutputStream.a(5, this.h);
            }
            if ((this.d & 16) == 16) {
                codedOutputStream.a(6, this.i);
            }
            if ((this.d & 32) == 32) {
                codedOutputStream.a(7, this.j);
            }
            if ((this.d & 64) == 64) {
                codedOutputStream.c(8, this.k);
            }
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                codedOutputStream.a(10, (fko) this.l.get(i3));
            }
            if ((this.d & 128) == 128) {
                codedOutputStream.a(11, this.m);
            }
            if ((this.d & 256) == 256) {
                codedOutputStream.a(12, this.u);
            }
            if ((this.d & 512) == 512) {
                codedOutputStream.a(13, this.n);
            }
            if ((this.d & 1024) == 1024) {
                codedOutputStream.a(14, this.v);
            }
            if ((this.d & 2048) == 2048) {
                codedOutputStream.a(15, this.o);
            }
            if ((this.d & 4096) == 4096) {
                codedOutputStream.a(16, this.p);
            }
            if ((this.d & 8192) == 8192) {
                codedOutputStream.a(17, this.q);
            }
            if ((this.d & 16384) == 16384) {
                codedOutputStream.c(18, this.r);
            }
            if ((this.d & 32768) == 32768) {
                codedOutputStream.c(19, this.s);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                i3 += CodedOutputStream.b(1, (fko) this.e.get(i4));
            }
            if ((this.d & 1) == 1) {
                i3 += CodedOutputStream.b(2, (fko) k());
            }
            if ((this.d & 2) == 2) {
                i3 += CodedOutputStream.g(3, this.f);
            }
            if ((this.d & 4) == 4) {
                i3 += CodedOutputStream.g(4, this.g);
            }
            if ((this.d & 8) == 8) {
                i3 += CodedOutputStream.d(5, this.h);
            }
            if ((this.d & 16) == 16) {
                i3 += CodedOutputStream.b(6, this.i);
            }
            if ((this.d & 32) == 32) {
                i3 += CodedOutputStream.d(7, this.j);
            }
            if ((this.d & 64) == 64) {
                i3 += CodedOutputStream.g(8, this.k);
            }
            for (int i5 = 0; i5 < this.l.size(); i5++) {
                i3 += CodedOutputStream.b(10, (fko) this.l.get(i5));
            }
            if ((this.d & 128) == 128) {
                i3 += CodedOutputStream.b(11, this.m);
            }
            if ((this.d & 256) == 256) {
                i3 += CodedOutputStream.b(12, this.u);
            }
            if ((this.d & 512) == 512) {
                i3 += CodedOutputStream.b(13, this.n);
            }
            if ((this.d & 1024) == 1024) {
                i3 += CodedOutputStream.b(14, this.v);
            }
            if ((this.d & 2048) == 2048) {
                i3 += CodedOutputStream.b(15, this.o);
            }
            if ((this.d & 4096) == 4096) {
                i3 += CodedOutputStream.b(16, this.p);
            }
            if ((this.d & 8192) == 8192) {
                i3 += CodedOutputStream.b(17, this.q);
            }
            if ((this.d & 16384) == 16384) {
                i3 += CodedOutputStream.g(18, this.r);
            }
            if ((this.d & 32768) == 32768) {
                i3 += CodedOutputStream.g(19, this.s);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static ProtoPlaylistResponse a(byte[] bArr) {
            return (ProtoPlaylistResponse) GeneratedMessageLite.a(w, bArr);
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoPlaylistResponse();
                case IS_INITIALIZED:
                    return w;
                case MAKE_IMMUTABLE:
                    this.e.b();
                    this.l.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoPlaylistResponse protoPlaylistResponse = (ProtoPlaylistResponse) obj2;
                    this.e = fVar.a(this.e, protoPlaylistResponse.e);
                    this.t = (ProtoPlaylistHeader) fVar.a(this.t, protoPlaylistResponse.t);
                    this.f = fVar.a(n(), this.f, protoPlaylistResponse.n(), protoPlaylistResponse.f);
                    this.g = fVar.a(o(), this.g, protoPlaylistResponse.o(), protoPlaylistResponse.g);
                    this.h = fVar.a(p(), this.h, protoPlaylistResponse.p(), protoPlaylistResponse.h);
                    this.i = fVar.a(q(), this.i, protoPlaylistResponse.q(), protoPlaylistResponse.i);
                    this.j = fVar.a(r(), this.j, protoPlaylistResponse.r(), protoPlaylistResponse.j);
                    this.k = fVar.a(s(), this.k, protoPlaylistResponse.s(), protoPlaylistResponse.k);
                    this.l = fVar.a(this.l, protoPlaylistResponse.l);
                    this.m = fVar.a(t(), this.m, protoPlaylistResponse.t(), protoPlaylistResponse.m);
                    this.u = fVar.a(u(), this.u, protoPlaylistResponse.u(), protoPlaylistResponse.u);
                    this.n = fVar.a(v(), this.n, protoPlaylistResponse.v(), protoPlaylistResponse.n);
                    this.v = fVar.a(w(), this.v, protoPlaylistResponse.w(), protoPlaylistResponse.v);
                    this.o = fVar.a(x(), this.o, protoPlaylistResponse.x(), protoPlaylistResponse.o);
                    this.p = fVar.a(y(), this.p, protoPlaylistResponse.y(), protoPlaylistResponse.p);
                    this.q = fVar.a(l(), this.q, protoPlaylistResponse.l(), protoPlaylistResponse.q);
                    this.r = fVar.a(z(), this.r, protoPlaylistResponse.z(), protoPlaylistResponse.r);
                    this.s = fVar.a(A(), this.s, protoPlaylistResponse.A(), protoPlaylistResponse.s);
                    if (fVar == e.a) {
                        this.d |= protoPlaylistResponse.d;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    fke fke = (fke) obj2;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            switch (a2) {
                                case 0:
                                    z = true;
                                    break;
                                case 10:
                                    if (!this.e.a()) {
                                        this.e = GeneratedMessageLite.a(this.e);
                                    }
                                    this.e.add(fkc.a(ProtoPlaylistItem.parser(), fke));
                                    break;
                                case 18:
                                    a aVar = (this.d & 1) == 1 ? (a) this.t.h() : null;
                                    this.t = (ProtoPlaylistHeader) fkc.a(ProtoPlaylistHeader.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.t);
                                        this.t = (ProtoPlaylistHeader) aVar.e();
                                    }
                                    this.d |= 1;
                                    break;
                                case 24:
                                    this.d |= 2;
                                    this.f = fkc.g();
                                    break;
                                case 32:
                                    this.d |= 4;
                                    this.g = fkc.g();
                                    break;
                                case 40:
                                    this.d |= 8;
                                    this.h = fkc.h();
                                    break;
                                case 48:
                                    this.d |= 16;
                                    this.i = fkc.b();
                                    break;
                                case 56:
                                    this.d |= 32;
                                    this.j = fkc.h();
                                    break;
                                case b.bs /*64*/:
                                    this.d |= 64;
                                    this.k = fkc.g();
                                    break;
                                case 82:
                                    if (!this.l.a()) {
                                        this.l = GeneratedMessageLite.a(this.l);
                                    }
                                    this.l.add(fkc.a(ProtoRecommendationItem.parser(), fke));
                                    break;
                                case 88:
                                    this.d |= 128;
                                    this.m = fkc.b();
                                    break;
                                case 96:
                                    this.d |= 256;
                                    this.u = fkc.b();
                                    break;
                                case 104:
                                    this.d |= 512;
                                    this.n = fkc.b();
                                    break;
                                case ContentType.LONG_FORM_ON_DEMAND /*112*/:
                                    this.d |= 1024;
                                    this.v = fkc.b();
                                    break;
                                case 120:
                                    this.d |= 2048;
                                    this.o = fkc.b();
                                    break;
                                case 128:
                                    this.d |= 4096;
                                    this.p = fkc.b();
                                    break;
                                case 136:
                                    this.d |= 8192;
                                    this.q = fkc.b();
                                    break;
                                case 144:
                                    this.d |= 16384;
                                    this.r = fkc.g();
                                    break;
                                case 152:
                                    this.d |= 32768;
                                    this.s = fkc.g();
                                    break;
                                default:
                                    if (a(a2, fkc)) {
                                        break;
                                    }
                                    z = true;
                                    break;
                            }
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
                    if (x == null) {
                        synchronized (ProtoPlaylistResponse.class) {
                            if (x == null) {
                                x = new b(w);
                            }
                        }
                    }
                    return x;
                default:
                    throw new UnsupportedOperationException();
            }
            return w;
        }

        static {
            ProtoPlaylistResponse protoPlaylistResponse = new ProtoPlaylistResponse();
            w = protoPlaylistResponse;
            protoPlaylistResponse.e();
        }

        public static fkr<ProtoPlaylistResponse> parser() {
            return w.c();
        }
    }

    public static final class ProtoRecommendationItem extends GeneratedMessageLite<ProtoRecommendationItem, a> implements hbs {
        /* access modifiers changed from: private */
        public static final ProtoRecommendationItem i;
        private static volatile fkr<ProtoRecommendationItem> j;
        public int d;
        private ProtoTrackMetadata e;
        private ProtoTrackCollectionState f;
        private ProtoTrackOfflineState g;
        private ProtoTrackPlayState h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoRecommendationItem, a> implements hbs {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoRecommendationItem.i);
            }
        }

        private ProtoRecommendationItem() {
        }

        public final ProtoTrackMetadata k() {
            ProtoTrackMetadata protoTrackMetadata = this.e;
            return protoTrackMetadata == null ? ProtoTrackMetadata.o() : protoTrackMetadata;
        }

        public final ProtoTrackCollectionState l() {
            ProtoTrackCollectionState protoTrackCollectionState = this.f;
            return protoTrackCollectionState == null ? ProtoTrackCollectionState.l() : protoTrackCollectionState;
        }

        public final ProtoTrackOfflineState m() {
            ProtoTrackOfflineState protoTrackOfflineState = this.g;
            return protoTrackOfflineState == null ? ProtoTrackOfflineState.k() : protoTrackOfflineState;
        }

        public final ProtoTrackPlayState n() {
            ProtoTrackPlayState protoTrackPlayState = this.h;
            return protoTrackPlayState == null ? ProtoTrackPlayState.m() : protoTrackPlayState;
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
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoRecommendationItem();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoRecommendationItem protoRecommendationItem = (ProtoRecommendationItem) obj2;
                    this.e = (ProtoTrackMetadata) fVar.a(this.e, protoRecommendationItem.e);
                    this.f = (ProtoTrackCollectionState) fVar.a(this.f, protoRecommendationItem.f);
                    this.g = (ProtoTrackOfflineState) fVar.a(this.g, protoRecommendationItem.g);
                    this.h = (ProtoTrackPlayState) fVar.a(this.h, protoRecommendationItem.h);
                    if (fVar == e.a) {
                        this.d |= protoRecommendationItem.d;
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
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.a aVar = (this.d & 1) == 1 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.a) this.e.h() : null;
                                    this.e = (ProtoTrackMetadata) fkc.a(ProtoTrackMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.e);
                                        this.e = (ProtoTrackMetadata) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState.a aVar2 = (this.d & 2) == 2 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState.a) this.f.h() : null;
                                    this.f = (ProtoTrackCollectionState) fkc.a(ProtoTrackCollectionState.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.f);
                                        this.f = (ProtoTrackCollectionState) aVar2.e();
                                    }
                                    this.d |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState.a aVar3 = (this.d & 4) == 4 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState.a) this.g.h() : null;
                                    this.g = (ProtoTrackOfflineState) fkc.a(ProtoTrackOfflineState.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a(this.g);
                                        this.g = (ProtoTrackOfflineState) aVar3.e();
                                    }
                                    this.d |= 4;
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState.a aVar4 = (this.d & 8) == 8 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState.a) this.h.h() : null;
                                    this.h = (ProtoTrackPlayState) fkc.a(ProtoTrackPlayState.parser(), fke);
                                    if (aVar4 != null) {
                                        aVar4.a(this.h);
                                        this.h = (ProtoTrackPlayState) aVar4.e();
                                    }
                                    this.d |= 8;
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
                        synchronized (ProtoRecommendationItem.class) {
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
            ProtoRecommendationItem protoRecommendationItem = new ProtoRecommendationItem();
            i = protoRecommendationItem;
            protoRecommendationItem.e();
        }

        public static fkr<ProtoRecommendationItem> parser() {
            return i.c();
        }
    }
}
