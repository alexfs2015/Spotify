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

    public static final class ProtoPlaylistHeader extends GeneratedMessageLite<ProtoPlaylistHeader, a> implements hel {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistHeader g;
        private static volatile fll<ProtoPlaylistHeader> h;
        public int d;
        private ProtoPlaylistMetadata e;
        private ProtoPlaylistOfflineState f;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistHeader, a> implements hel {
            private a() {
                super(ProtoPlaylistHeader.g);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoPlaylistHeader protoPlaylistHeader = new ProtoPlaylistHeader();
            g = protoPlaylistHeader;
            protoPlaylistHeader.e();
        }

        private ProtoPlaylistHeader() {
        }

        public static ProtoPlaylistHeader m() {
            return g;
        }

        public static fll<ProtoPlaylistHeader> parser() {
            return g.c();
        }

        /* JADX INFO: finally extract failed */
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
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistMetadata.a aVar = (this.d & 1) == 1 ? (com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistMetadata.a) this.e.h() : null;
                                    this.e = (ProtoPlaylistMetadata) fkw.a(ProtoPlaylistMetadata.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.e);
                                        this.e = (ProtoPlaylistMetadata) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.playlist.proto.PlaylistPlaylistState.ProtoPlaylistOfflineState.a aVar2 = (this.d & 2) == 2 ? (com.spotify.mobile.android.playlist.proto.PlaylistPlaylistState.ProtoPlaylistOfflineState.a) this.f.h() : null;
                                    this.f = (ProtoPlaylistOfflineState) fkw.a(ProtoPlaylistOfflineState.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.f);
                                        this.f = (ProtoPlaylistOfflineState) aVar2.e();
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
                        Class<ProtoPlaylistHeader> cls = ProtoPlaylistHeader.class;
                        synchronized (ProtoPlaylistHeader.class) {
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

        public final ProtoPlaylistMetadata k() {
            ProtoPlaylistMetadata protoPlaylistMetadata = this.e;
            if (protoPlaylistMetadata == null) {
                protoPlaylistMetadata = ProtoPlaylistMetadata.r();
            }
            return protoPlaylistMetadata;
        }

        public final ProtoPlaylistOfflineState l() {
            ProtoPlaylistOfflineState protoPlaylistOfflineState = this.f;
            if (protoPlaylistOfflineState == null) {
                protoPlaylistOfflineState = ProtoPlaylistOfflineState.k();
            }
            return protoPlaylistOfflineState;
        }
    }

    public static final class ProtoPlaylistItem extends GeneratedMessageLite<ProtoPlaylistItem, a> implements hem {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistItem r;
        private static volatile fll<ProtoPlaylistItem> s;
        public String d;
        public int e;
        public String f;
        public e<ProtoPlaylistFormatListAttribute> g = flm.d();
        private int h;
        private ProtoUser i;
        private ProtoTrackMetadata j;
        private ProtoTrackCollectionState k;
        private ProtoTrackOfflineState l;
        private ProtoTrackPlayState m;
        private ProtoEpisodeMetadata n;
        private ProtoEpisodeOfflineState o;
        private ProtoEpisodeCollectionState p;
        private ProtoEpisodePlayState q;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistItem, a> implements hem {
            private a() {
                super(ProtoPlaylistItem.r);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoPlaylistItem protoPlaylistItem = new ProtoPlaylistItem();
            r = protoPlaylistItem;
            protoPlaylistItem.e();
        }

        private ProtoPlaylistItem() {
            String str = "";
            this.d = str;
            this.f = str;
        }

        private boolean F() {
            return (this.h & 2) == 2;
        }

        private boolean G() {
            return (this.h & 64) == 64;
        }

        public static fll<ProtoPlaylistItem> parser() {
            return r.c();
        }

        public final boolean A() {
            if ((this.h & 1024) != 1024) {
                return false;
            }
            int i2 = 6 >> 1;
            return true;
        }

        public final ProtoEpisodeCollectionState B() {
            ProtoEpisodeCollectionState protoEpisodeCollectionState = this.p;
            if (protoEpisodeCollectionState == null) {
                protoEpisodeCollectionState = ProtoEpisodeCollectionState.l();
            }
            return protoEpisodeCollectionState;
        }

        public final boolean C() {
            return (this.h & 2048) == 2048;
        }

        public final ProtoEpisodePlayState D() {
            ProtoEpisodePlayState protoEpisodePlayState = this.q;
            if (protoEpisodePlayState == null) {
                protoEpisodePlayState = ProtoEpisodePlayState.m();
            }
            return protoEpisodePlayState;
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoPlaylistItem();
                case IS_INITIALIZED:
                    return r;
                case MAKE_IMMUTABLE:
                    this.g.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoPlaylistItem protoPlaylistItem = (ProtoPlaylistItem) obj2;
                    this.d = fVar.a(k(), this.d, protoPlaylistItem.k(), protoPlaylistItem.d);
                    this.e = fVar.a(F(), this.e, protoPlaylistItem.F(), protoPlaylistItem.e);
                    this.i = (ProtoUser) fVar.a(this.i, protoPlaylistItem.i);
                    this.j = (ProtoTrackMetadata) fVar.a(this.j, protoPlaylistItem.j);
                    this.k = (ProtoTrackCollectionState) fVar.a(this.k, protoPlaylistItem.k);
                    this.l = (ProtoTrackOfflineState) fVar.a(this.l, protoPlaylistItem.l);
                    this.f = fVar.a(G(), this.f, protoPlaylistItem.G(), protoPlaylistItem.f);
                    this.m = (ProtoTrackPlayState) fVar.a(this.m, protoPlaylistItem.m);
                    this.g = fVar.a(this.g, protoPlaylistItem.g);
                    this.n = (ProtoEpisodeMetadata) fVar.a(this.n, protoPlaylistItem.n);
                    this.o = (ProtoEpisodeOfflineState) fVar.a(this.o, protoPlaylistItem.o);
                    this.p = (ProtoEpisodeCollectionState) fVar.a(this.p, protoPlaylistItem.p);
                    this.q = (ProtoEpisodePlayState) fVar.a(this.q, protoPlaylistItem.q);
                    if (fVar == e.a) {
                        this.h |= protoPlaylistItem.h;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            switch (a2) {
                                case 0:
                                    z = true;
                                    break;
                                case 10:
                                    String c = fkw.c();
                                    this.h |= 1;
                                    this.d = c;
                                    break;
                                case 16:
                                    this.h |= 2;
                                    this.e = fkw.g();
                                    break;
                                case 26:
                                    com.spotify.mobile.android.playlist.proto.PlaylistUserState.ProtoUser.a aVar = (this.h & 4) == 4 ? (com.spotify.mobile.android.playlist.proto.PlaylistUserState.ProtoUser.a) this.i.h() : null;
                                    this.i = (ProtoUser) fkw.a(ProtoUser.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.i);
                                        this.i = (ProtoUser) aVar.e();
                                    }
                                    this.h |= 4;
                                    break;
                                case 34:
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.a aVar2 = (this.h & 8) == 8 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.a) this.j.h() : null;
                                    this.j = (ProtoTrackMetadata) fkw.a(ProtoTrackMetadata.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.j);
                                        this.j = (ProtoTrackMetadata) aVar2.e();
                                    }
                                    this.h |= 8;
                                    break;
                                case 42:
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState.a aVar3 = (this.h & 16) == 16 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState.a) this.k.h() : null;
                                    this.k = (ProtoTrackCollectionState) fkw.a(ProtoTrackCollectionState.parser(), fky);
                                    if (aVar3 != null) {
                                        aVar3.a(this.k);
                                        this.k = (ProtoTrackCollectionState) aVar3.e();
                                    }
                                    this.h |= 16;
                                    break;
                                case 50:
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState.a aVar4 = (this.h & 32) == 32 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState.a) this.l.h() : null;
                                    this.l = (ProtoTrackOfflineState) fkw.a(ProtoTrackOfflineState.parser(), fky);
                                    if (aVar4 != null) {
                                        aVar4.a(this.l);
                                        this.l = (ProtoTrackOfflineState) aVar4.e();
                                    }
                                    this.h |= 32;
                                    break;
                                case 58:
                                    String c2 = fkw.c();
                                    this.h |= 64;
                                    this.f = c2;
                                    break;
                                case b.bu /*66*/:
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState.a aVar5 = (this.h & 128) == 128 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState.a) this.m.h() : null;
                                    this.m = (ProtoTrackPlayState) fkw.a(ProtoTrackPlayState.parser(), fky);
                                    if (aVar5 != null) {
                                        aVar5.a(this.m);
                                        this.m = (ProtoTrackPlayState) aVar5.e();
                                    }
                                    this.h |= 128;
                                    break;
                                case b.bC /*74*/:
                                    if (!this.g.a()) {
                                        this.g = GeneratedMessageLite.a(this.g);
                                    }
                                    this.g.add(fkw.a(ProtoPlaylistFormatListAttribute.parser(), fky));
                                    break;
                                case 82:
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata.a aVar6 = (this.h & 256) == 256 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata.a) this.n.h() : null;
                                    this.n = (ProtoEpisodeMetadata) fkw.a(ProtoEpisodeMetadata.parser(), fky);
                                    if (aVar6 != null) {
                                        aVar6.a(this.n);
                                        this.n = (ProtoEpisodeMetadata) aVar6.e();
                                    }
                                    this.h |= 256;
                                    break;
                                case 90:
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState.a aVar7 = (this.h & 512) == 512 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState.a) this.o.h() : null;
                                    this.o = (ProtoEpisodeOfflineState) fkw.a(ProtoEpisodeOfflineState.parser(), fky);
                                    if (aVar7 != null) {
                                        aVar7.a(this.o);
                                        this.o = (ProtoEpisodeOfflineState) aVar7.e();
                                    }
                                    this.h |= 512;
                                    break;
                                case 98:
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState.a aVar8 = (this.h & 1024) == 1024 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState.a) this.p.h() : null;
                                    this.p = (ProtoEpisodeCollectionState) fkw.a(ProtoEpisodeCollectionState.parser(), fky);
                                    if (aVar8 != null) {
                                        aVar8.a(this.p);
                                        this.p = (ProtoEpisodeCollectionState) aVar8.e();
                                    }
                                    this.h |= 1024;
                                    break;
                                case 106:
                                    com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState.a aVar9 = (this.h & 2048) == 2048 ? (com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState.a) this.q.h() : null;
                                    this.q = (ProtoEpisodePlayState) fkw.a(ProtoEpisodePlayState.parser(), fky);
                                    if (aVar9 != null) {
                                        aVar9.a(this.q);
                                        this.q = (ProtoEpisodePlayState) aVar9.e();
                                    }
                                    this.h |= 2048;
                                    break;
                                default:
                                    if (a(a2, fkw)) {
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
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    break;
                case GET_DEFAULT_INSTANCE:
                    break;
                case GET_PARSER:
                    if (s == null) {
                        Class<ProtoPlaylistItem> cls = ProtoPlaylistItem.class;
                        synchronized (ProtoPlaylistItem.class) {
                            try {
                                if (s == null) {
                                    s = new b(r);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return s;
                default:
                    throw new UnsupportedOperationException();
            }
            return r;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.h & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.h & 2) == 2) {
                codedOutputStream.c(2, this.e);
            }
            if ((this.h & 4) == 4) {
                codedOutputStream.a(3, (fli) m());
            }
            if ((this.h & 8) == 8) {
                codedOutputStream.a(4, (fli) o());
            }
            if ((this.h & 16) == 16) {
                codedOutputStream.a(5, (fli) q());
            }
            if ((this.h & 32) == 32) {
                codedOutputStream.a(6, (fli) s());
            }
            if ((this.h & 64) == 64) {
                codedOutputStream.a(7, this.f);
            }
            if ((this.h & 128) == 128) {
                codedOutputStream.a(8, (fli) u());
            }
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                codedOutputStream.a(9, (fli) this.g.get(i2));
            }
            if ((this.h & 256) == 256) {
                codedOutputStream.a(10, (fli) x());
            }
            if ((this.h & 512) == 512) {
                codedOutputStream.a(11, (fli) z());
            }
            if ((this.h & 1024) == 1024) {
                codedOutputStream.a(12, (fli) B());
            }
            if ((this.h & 2048) == 2048) {
                codedOutputStream.a(13, (fli) D());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int b = (this.h & 1) == 1 ? CodedOutputStream.b(1, this.d) + 0 : 0;
            if ((this.h & 2) == 2) {
                b += CodedOutputStream.g(2, this.e);
            }
            if ((this.h & 4) == 4) {
                int i3 = 1 >> 3;
                b += CodedOutputStream.b(3, (fli) m());
            }
            if ((this.h & 8) == 8) {
                b += CodedOutputStream.b(4, (fli) o());
            }
            if ((this.h & 16) == 16) {
                b += CodedOutputStream.b(5, (fli) q());
            }
            if ((this.h & 32) == 32) {
                b += CodedOutputStream.b(6, (fli) s());
            }
            if ((this.h & 64) == 64) {
                b += CodedOutputStream.b(7, this.f);
            }
            if ((this.h & 128) == 128) {
                b += CodedOutputStream.b(8, (fli) u());
            }
            for (int i4 = 0; i4 < this.g.size(); i4++) {
                b += CodedOutputStream.b(9, (fli) this.g.get(i4));
            }
            if ((this.h & 256) == 256) {
                b += CodedOutputStream.b(10, (fli) x());
            }
            if ((this.h & 512) == 512) {
                b += CodedOutputStream.b(11, (fli) z());
            }
            if ((this.h & 1024) == 1024) {
                b += CodedOutputStream.b(12, (fli) B());
            }
            if ((this.h & 2048) == 2048) {
                b += CodedOutputStream.b(13, (fli) D());
            }
            int d2 = b + this.b.d();
            this.c = d2;
            return d2;
        }

        public final boolean k() {
            return (this.h & 1) == 1;
        }

        public final boolean l() {
            int i2 = 3 >> 4;
            return (this.h & 4) == 4;
        }

        public final ProtoUser m() {
            ProtoUser protoUser = this.i;
            if (protoUser == null) {
                protoUser = ProtoUser.k();
            }
            return protoUser;
        }

        public final boolean n() {
            return (this.h & 8) == 8;
        }

        public final ProtoTrackMetadata o() {
            ProtoTrackMetadata protoTrackMetadata = this.j;
            if (protoTrackMetadata == null) {
                protoTrackMetadata = ProtoTrackMetadata.o();
            }
            return protoTrackMetadata;
        }

        public final boolean p() {
            return (this.h & 16) == 16;
        }

        public final ProtoTrackCollectionState q() {
            ProtoTrackCollectionState protoTrackCollectionState = this.k;
            if (protoTrackCollectionState == null) {
                protoTrackCollectionState = ProtoTrackCollectionState.l();
            }
            return protoTrackCollectionState;
        }

        public final boolean r() {
            return (this.h & 32) == 32;
        }

        public final ProtoTrackOfflineState s() {
            ProtoTrackOfflineState protoTrackOfflineState = this.l;
            if (protoTrackOfflineState == null) {
                protoTrackOfflineState = ProtoTrackOfflineState.k();
            }
            return protoTrackOfflineState;
        }

        public final boolean t() {
            if ((this.h & 128) != 128) {
                return false;
            }
            int i2 = 6 << 1;
            return true;
        }

        public final ProtoTrackPlayState u() {
            ProtoTrackPlayState protoTrackPlayState = this.m;
            if (protoTrackPlayState == null) {
                protoTrackPlayState = ProtoTrackPlayState.m();
            }
            return protoTrackPlayState;
        }

        public final int v() {
            return this.g.size();
        }

        public final boolean w() {
            return (this.h & 256) == 256;
        }

        public final ProtoEpisodeMetadata x() {
            ProtoEpisodeMetadata protoEpisodeMetadata = this.n;
            if (protoEpisodeMetadata == null) {
                protoEpisodeMetadata = ProtoEpisodeMetadata.t();
            }
            return protoEpisodeMetadata;
        }

        public final boolean y() {
            return (this.h & 512) == 512;
        }

        public final ProtoEpisodeOfflineState z() {
            ProtoEpisodeOfflineState protoEpisodeOfflineState = this.o;
            if (protoEpisodeOfflineState == null) {
                protoEpisodeOfflineState = ProtoEpisodeOfflineState.k();
            }
            return protoEpisodeOfflineState;
        }
    }

    public static final class ProtoPlaylistResponse extends GeneratedMessageLite<ProtoPlaylistResponse, a> implements hen {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistResponse w;
        private static volatile fll<ProtoPlaylistResponse> x;
        public int d;
        public e<ProtoPlaylistItem> e = flm.d();
        public int f;
        public int g;
        public long h;
        public boolean i;
        public long j;
        public int k;
        public e<ProtoRecommendationItem> l = flm.d();
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

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistResponse, a> implements hen {
            private a() {
                super(ProtoPlaylistResponse.w);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoPlaylistResponse protoPlaylistResponse = new ProtoPlaylistResponse();
            w = protoPlaylistResponse;
            protoPlaylistResponse.e();
        }

        private ProtoPlaylistResponse() {
        }

        private boolean A() {
            return (this.d & 16384) == 16384;
        }

        private boolean B() {
            return (this.d & 32768) == 32768;
        }

        public static ProtoPlaylistResponse m() {
            return w;
        }

        private boolean o() {
            return (this.d & 2) == 2;
        }

        private boolean p() {
            return (this.d & 4) == 4;
        }

        public static fll<ProtoPlaylistResponse> parser() {
            return w.c();
        }

        private boolean q() {
            return (this.d & 8) == 8;
        }

        private boolean r() {
            return (this.d & 16) == 16;
        }

        private boolean s() {
            return (this.d & 32) == 32;
        }

        private boolean t() {
            return (this.d & 64) == 64;
        }

        private boolean u() {
            return (this.d & 128) == 128;
        }

        private boolean v() {
            return (this.d & 256) == 256;
        }

        private boolean w() {
            return (this.d & 512) == 512;
        }

        private boolean x() {
            if ((this.d & 1024) != 1024) {
                return false;
            }
            int i2 = 2 << 1;
            return true;
        }

        private boolean y() {
            return (this.d & 2048) == 2048;
        }

        private boolean z() {
            return (this.d & 4096) == 4096;
        }

        /* JADX INFO: finally extract failed */
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
                    this.f = fVar.a(o(), this.f, protoPlaylistResponse.o(), protoPlaylistResponse.f);
                    this.g = fVar.a(p(), this.g, protoPlaylistResponse.p(), protoPlaylistResponse.g);
                    f fVar2 = fVar;
                    this.h = fVar.a(q(), this.h, protoPlaylistResponse.q(), protoPlaylistResponse.h);
                    this.i = fVar.a(r(), this.i, protoPlaylistResponse.r(), protoPlaylistResponse.i);
                    f fVar3 = fVar;
                    this.j = fVar.a(s(), this.j, protoPlaylistResponse.s(), protoPlaylistResponse.j);
                    this.k = fVar.a(t(), this.k, protoPlaylistResponse.t(), protoPlaylistResponse.k);
                    this.l = fVar.a(this.l, protoPlaylistResponse.l);
                    this.m = fVar.a(u(), this.m, protoPlaylistResponse.u(), protoPlaylistResponse.m);
                    this.u = fVar.a(v(), this.u, protoPlaylistResponse.v(), protoPlaylistResponse.u);
                    this.n = fVar.a(w(), this.n, protoPlaylistResponse.w(), protoPlaylistResponse.n);
                    this.v = fVar.a(x(), this.v, protoPlaylistResponse.x(), protoPlaylistResponse.v);
                    this.o = fVar.a(y(), this.o, protoPlaylistResponse.y(), protoPlaylistResponse.o);
                    this.p = fVar.a(z(), this.p, protoPlaylistResponse.z(), protoPlaylistResponse.p);
                    this.q = fVar.a(l(), this.q, protoPlaylistResponse.l(), protoPlaylistResponse.q);
                    this.r = fVar.a(A(), this.r, protoPlaylistResponse.A(), protoPlaylistResponse.r);
                    this.s = fVar.a(B(), this.s, protoPlaylistResponse.B(), protoPlaylistResponse.s);
                    if (fVar == e.a) {
                        this.d |= protoPlaylistResponse.d;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            switch (a2) {
                                case 0:
                                    z = true;
                                    break;
                                case 10:
                                    if (!this.e.a()) {
                                        this.e = GeneratedMessageLite.a(this.e);
                                    }
                                    this.e.add(fkw.a(ProtoPlaylistItem.parser(), fky));
                                    break;
                                case 18:
                                    a aVar = (this.d & 1) == 1 ? (a) this.t.h() : null;
                                    this.t = (ProtoPlaylistHeader) fkw.a(ProtoPlaylistHeader.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.t);
                                        this.t = (ProtoPlaylistHeader) aVar.e();
                                    }
                                    this.d |= 1;
                                    break;
                                case 24:
                                    this.d |= 2;
                                    this.f = fkw.g();
                                    break;
                                case 32:
                                    this.d |= 4;
                                    this.g = fkw.g();
                                    break;
                                case 40:
                                    this.d |= 8;
                                    this.h = fkw.h();
                                    break;
                                case 48:
                                    this.d |= 16;
                                    this.i = fkw.b();
                                    break;
                                case 56:
                                    this.d |= 32;
                                    this.j = fkw.h();
                                    break;
                                case b.bs /*64*/:
                                    this.d |= 64;
                                    this.k = fkw.g();
                                    break;
                                case 82:
                                    if (!this.l.a()) {
                                        this.l = GeneratedMessageLite.a(this.l);
                                    }
                                    this.l.add(fkw.a(ProtoRecommendationItem.parser(), fky));
                                    break;
                                case 88:
                                    this.d |= 128;
                                    this.m = fkw.b();
                                    break;
                                case 96:
                                    this.d |= 256;
                                    this.u = fkw.b();
                                    break;
                                case 104:
                                    this.d |= 512;
                                    this.n = fkw.b();
                                    break;
                                case ContentType.LONG_FORM_ON_DEMAND /*112*/:
                                    this.d |= 1024;
                                    this.v = fkw.b();
                                    break;
                                case 120:
                                    this.d |= 2048;
                                    this.o = fkw.b();
                                    break;
                                case 128:
                                    this.d |= 4096;
                                    this.p = fkw.b();
                                    break;
                                case 136:
                                    this.d |= 8192;
                                    this.q = fkw.b();
                                    break;
                                case 144:
                                    this.d |= 16384;
                                    this.r = fkw.g();
                                    break;
                                case 152:
                                    this.d |= 32768;
                                    this.s = fkw.g();
                                    break;
                                default:
                                    if (a(a2, fkw)) {
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
                        } finally {
                        }
                    }
                    break;
                case GET_DEFAULT_INSTANCE:
                    break;
                case GET_PARSER:
                    if (x == null) {
                        synchronized (ProtoPlaylistResponse.class) {
                            try {
                                if (x == null) {
                                    x = new b(w);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return x;
                default:
                    throw new UnsupportedOperationException();
            }
            return w;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            int i2 = 0;
            while (true) {
                boolean z = !true;
                if (i2 >= this.e.size()) {
                    break;
                }
                codedOutputStream.a(1, (fli) this.e.get(i2));
                i2++;
            }
            if ((this.d & 1) == 1) {
                codedOutputStream.a(2, (fli) k());
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
                codedOutputStream.a(10, (fli) this.l.get(i3));
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
                i3 += CodedOutputStream.b(1, (fli) this.e.get(i4));
            }
            if ((this.d & 1) == 1) {
                i3 += CodedOutputStream.b(2, (fli) k());
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
                i3 += CodedOutputStream.b(10, (fli) this.l.get(i5));
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

        public final ProtoPlaylistHeader k() {
            ProtoPlaylistHeader protoPlaylistHeader = this.t;
            if (protoPlaylistHeader == null) {
                protoPlaylistHeader = ProtoPlaylistHeader.m();
            }
            return protoPlaylistHeader;
        }

        public final boolean l() {
            if ((this.d & 8192) != 8192) {
                return false;
            }
            int i2 = 1 << 1;
            return true;
        }
    }

    public static final class ProtoRecommendationItem extends GeneratedMessageLite<ProtoRecommendationItem, a> implements heo {
        /* access modifiers changed from: private */
        public static final ProtoRecommendationItem i;
        private static volatile fll<ProtoRecommendationItem> j;
        public int d;
        private ProtoTrackMetadata e;
        private ProtoTrackCollectionState f;
        private ProtoTrackOfflineState g;
        private ProtoTrackPlayState h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoRecommendationItem, a> implements heo {
            private a() {
                super(ProtoRecommendationItem.i);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoRecommendationItem protoRecommendationItem = new ProtoRecommendationItem();
            i = protoRecommendationItem;
            protoRecommendationItem.e();
        }

        private ProtoRecommendationItem() {
        }

        public static fll<ProtoRecommendationItem> parser() {
            return i.c();
        }

        /* JADX INFO: finally extract failed */
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
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.a aVar = (this.d & 1) == 1 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.a) this.e.h() : null;
                                    this.e = (ProtoTrackMetadata) fkw.a(ProtoTrackMetadata.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.e);
                                        this.e = (ProtoTrackMetadata) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState.a aVar2 = (this.d & 2) == 2 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState.a) this.f.h() : null;
                                    this.f = (ProtoTrackCollectionState) fkw.a(ProtoTrackCollectionState.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.f);
                                        this.f = (ProtoTrackCollectionState) aVar2.e();
                                    }
                                    this.d |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState.a aVar3 = (this.d & 4) == 4 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState.a) this.g.h() : null;
                                    this.g = (ProtoTrackOfflineState) fkw.a(ProtoTrackOfflineState.parser(), fky);
                                    if (aVar3 != null) {
                                        aVar3.a(this.g);
                                        this.g = (ProtoTrackOfflineState) aVar3.e();
                                    }
                                    this.d |= 4;
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState.a aVar4 = (this.d & 8) == 8 ? (com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState.a) this.h.h() : null;
                                    this.h = (ProtoTrackPlayState) fkw.a(ProtoTrackPlayState.parser(), fky);
                                    if (aVar4 != null) {
                                        aVar4.a(this.h);
                                        this.h = (ProtoTrackPlayState) aVar4.e();
                                    }
                                    this.d |= 8;
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
                        synchronized (ProtoRecommendationItem.class) {
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
                codedOutputStream.a(4, (fli) n());
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
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final ProtoTrackMetadata k() {
            ProtoTrackMetadata protoTrackMetadata = this.e;
            if (protoTrackMetadata == null) {
                protoTrackMetadata = ProtoTrackMetadata.o();
            }
            return protoTrackMetadata;
        }

        public final ProtoTrackCollectionState l() {
            ProtoTrackCollectionState protoTrackCollectionState = this.f;
            if (protoTrackCollectionState == null) {
                protoTrackCollectionState = ProtoTrackCollectionState.l();
            }
            return protoTrackCollectionState;
        }

        public final ProtoTrackOfflineState m() {
            ProtoTrackOfflineState protoTrackOfflineState = this.g;
            if (protoTrackOfflineState == null) {
                protoTrackOfflineState = ProtoTrackOfflineState.k();
            }
            return protoTrackOfflineState;
        }

        public final ProtoTrackPlayState n() {
            ProtoTrackPlayState protoTrackPlayState = this.h;
            if (protoTrackPlayState == null) {
                protoTrackPlayState = ProtoTrackPlayState.m();
            }
            return protoTrackPlayState;
        }
    }
}
