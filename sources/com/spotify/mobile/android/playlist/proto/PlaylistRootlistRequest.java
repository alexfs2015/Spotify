package com.spotify.mobile.android.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.playlist.proto.PlaylistFolderMetadata.ProtoFolderMetadata;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistMetadata;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistState.ProtoPlaylistOfflineState;
import java.io.IOException;

public final class PlaylistRootlistRequest {

    public static final class ProtoPlaylistRootFolder extends GeneratedMessageLite<ProtoPlaylistRootFolder, a> implements hbu {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistRootFolder i;
        private static volatile fkr<ProtoPlaylistRootFolder> j;
        public e<ProtoPlaylistRootItem> d = fks.d();
        public String e = "";
        public int f;
        private int g;
        private ProtoFolderMetadata h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistRootFolder, a> implements hbu {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoPlaylistRootFolder.i);
            }
        }

        private ProtoPlaylistRootFolder() {
        }

        public final boolean k() {
            return (this.g & 1) == 1;
        }

        public final ProtoFolderMetadata l() {
            ProtoFolderMetadata protoFolderMetadata = this.h;
            return protoFolderMetadata == null ? ProtoFolderMetadata.k() : protoFolderMetadata;
        }

        private boolean o() {
            return (this.g & 2) == 2;
        }

        private boolean p() {
            return (this.g & 4) == 4;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                codedOutputStream.a(1, (fko) this.d.get(i2));
            }
            if ((this.g & 1) == 1) {
                codedOutputStream.a(2, (fko) l());
            }
            if ((this.g & 2) == 2) {
                codedOutputStream.a(3, this.e);
            }
            if ((this.g & 4) == 4) {
                codedOutputStream.c(4, this.f);
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
            if ((this.g & 1) == 1) {
                i3 += CodedOutputStream.b(2, (fko) l());
            }
            if ((this.g & 2) == 2) {
                i3 += CodedOutputStream.b(3, this.e);
            }
            if ((this.g & 4) == 4) {
                i3 += CodedOutputStream.g(4, this.f);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoPlaylistRootFolder();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoPlaylistRootFolder protoPlaylistRootFolder = (ProtoPlaylistRootFolder) obj2;
                    this.d = fVar.a(this.d, protoPlaylistRootFolder.d);
                    this.h = (ProtoFolderMetadata) fVar.a(this.h, protoPlaylistRootFolder.h);
                    this.e = fVar.a(o(), this.e, protoPlaylistRootFolder.o(), protoPlaylistRootFolder.e);
                    this.f = fVar.a(p(), this.f, protoPlaylistRootFolder.p(), protoPlaylistRootFolder.f);
                    if (fVar == e.a) {
                        this.g |= protoPlaylistRootFolder.g;
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
                                    this.d.add(fkc.a(ProtoPlaylistRootItem.parser(), fke));
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.playlist.proto.PlaylistFolderMetadata.ProtoFolderMetadata.a aVar = (this.g & 1) == 1 ? (com.spotify.mobile.android.playlist.proto.PlaylistFolderMetadata.ProtoFolderMetadata.a) this.h.h() : null;
                                    this.h = (ProtoFolderMetadata) fkc.a(ProtoFolderMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.h);
                                        this.h = (ProtoFolderMetadata) aVar.e();
                                    }
                                    this.g |= 1;
                                } else if (a2 == 26) {
                                    String c = fkc.c();
                                    this.g |= 2;
                                    this.e = c;
                                } else if (a2 == 32) {
                                    this.g |= 4;
                                    this.f = fkc.g();
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
                        synchronized (ProtoPlaylistRootFolder.class) {
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
            ProtoPlaylistRootFolder protoPlaylistRootFolder = new ProtoPlaylistRootFolder();
            i = protoPlaylistRootFolder;
            protoPlaylistRootFolder.e();
        }

        public static ProtoPlaylistRootFolder m() {
            return i;
        }

        public static fkr<ProtoPlaylistRootFolder> parser() {
            return i.c();
        }
    }

    public static final class ProtoPlaylistRootItem extends GeneratedMessageLite<ProtoPlaylistRootItem, a> implements hbv {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistRootItem h;
        private static volatile fkr<ProtoPlaylistRootItem> i;
        public String d = "";
        private int e;
        private ProtoPlaylistRootFolder f;
        private ProtoPlaylistRootPlaylist g;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistRootItem, a> implements hbv {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoPlaylistRootItem.h);
            }
        }

        private ProtoPlaylistRootItem() {
        }

        private boolean o() {
            return (this.e & 1) == 1;
        }

        public final boolean k() {
            return (this.e & 2) == 2;
        }

        public final ProtoPlaylistRootFolder l() {
            ProtoPlaylistRootFolder protoPlaylistRootFolder = this.f;
            return protoPlaylistRootFolder == null ? ProtoPlaylistRootFolder.m() : protoPlaylistRootFolder;
        }

        public final ProtoPlaylistRootPlaylist m() {
            ProtoPlaylistRootPlaylist protoPlaylistRootPlaylist = this.g;
            return protoPlaylistRootPlaylist == null ? ProtoPlaylistRootPlaylist.p() : protoPlaylistRootPlaylist;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.e & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.e & 2) == 2) {
                codedOutputStream.a(2, (fko) l());
            }
            if ((this.e & 4) == 4) {
                codedOutputStream.a(3, (fko) m());
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
                i3 += CodedOutputStream.b(2, (fko) l());
            }
            if ((this.e & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fko) m());
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoPlaylistRootItem();
                case IS_INITIALIZED:
                    return h;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoPlaylistRootItem protoPlaylistRootItem = (ProtoPlaylistRootItem) obj2;
                    this.d = fVar.a(o(), this.d, protoPlaylistRootItem.o(), protoPlaylistRootItem.d);
                    this.f = (ProtoPlaylistRootFolder) fVar.a(this.f, protoPlaylistRootItem.f);
                    this.g = (ProtoPlaylistRootPlaylist) fVar.a(this.g, protoPlaylistRootItem.g);
                    if (fVar == e.a) {
                        this.e |= protoPlaylistRootItem.e;
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
                                    a aVar = (this.e & 2) == 2 ? (a) this.f.h() : null;
                                    this.f = (ProtoPlaylistRootFolder) fkc.a(ProtoPlaylistRootFolder.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (ProtoPlaylistRootFolder) aVar.e();
                                    }
                                    this.e |= 2;
                                } else if (a2 == 26) {
                                    a aVar2 = (this.e & 4) == 4 ? (a) this.g.h() : null;
                                    this.g = (ProtoPlaylistRootPlaylist) fkc.a(ProtoPlaylistRootPlaylist.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (ProtoPlaylistRootPlaylist) aVar2.e();
                                    }
                                    this.e |= 4;
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
                        synchronized (ProtoPlaylistRootItem.class) {
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
            ProtoPlaylistRootItem protoPlaylistRootItem = new ProtoPlaylistRootItem();
            h = protoPlaylistRootItem;
            protoPlaylistRootItem.e();
        }

        public static fkr<ProtoPlaylistRootItem> parser() {
            return h.c();
        }
    }

    public static final class ProtoPlaylistRootPlaylist extends GeneratedMessageLite<ProtoPlaylistRootPlaylist, a> implements hbw {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistRootPlaylist j;
        private static volatile fkr<ProtoPlaylistRootPlaylist> k;
        public String d = "";
        public int e;
        public boolean f;
        private int g;
        private ProtoPlaylistMetadata h;
        private ProtoPlaylistOfflineState i;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistRootPlaylist, a> implements hbw {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoPlaylistRootPlaylist.j);
            }
        }

        private ProtoPlaylistRootPlaylist() {
        }

        private boolean r() {
            return (this.g & 1) == 1;
        }

        public final boolean k() {
            return (this.g & 2) == 2;
        }

        public final ProtoPlaylistMetadata l() {
            ProtoPlaylistMetadata protoPlaylistMetadata = this.h;
            return protoPlaylistMetadata == null ? ProtoPlaylistMetadata.r() : protoPlaylistMetadata;
        }

        public final boolean m() {
            return (this.g & 4) == 4;
        }

        public final ProtoPlaylistOfflineState n() {
            ProtoPlaylistOfflineState protoPlaylistOfflineState = this.i;
            return protoPlaylistOfflineState == null ? ProtoPlaylistOfflineState.k() : protoPlaylistOfflineState;
        }

        private boolean s() {
            return (this.g & 8) == 8;
        }

        public final boolean o() {
            return (this.g & 16) == 16;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.g & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.g & 2) == 2) {
                codedOutputStream.a(2, (fko) l());
            }
            if ((this.g & 4) == 4) {
                codedOutputStream.a(3, (fko) n());
            }
            if ((this.g & 8) == 8) {
                codedOutputStream.c(4, this.e);
            }
            if ((this.g & 16) == 16) {
                codedOutputStream.a(5, this.f);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.g & 1) == 1) {
                i3 = 0 + CodedOutputStream.b(1, this.d);
            }
            if ((this.g & 2) == 2) {
                i3 += CodedOutputStream.b(2, (fko) l());
            }
            if ((this.g & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fko) n());
            }
            if ((this.g & 8) == 8) {
                i3 += CodedOutputStream.g(4, this.e);
            }
            if ((this.g & 16) == 16) {
                i3 += CodedOutputStream.b(5, this.f);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoPlaylistRootPlaylist();
                case IS_INITIALIZED:
                    return j;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoPlaylistRootPlaylist protoPlaylistRootPlaylist = (ProtoPlaylistRootPlaylist) obj2;
                    this.d = fVar.a(r(), this.d, protoPlaylistRootPlaylist.r(), protoPlaylistRootPlaylist.d);
                    this.h = (ProtoPlaylistMetadata) fVar.a(this.h, protoPlaylistRootPlaylist.h);
                    this.i = (ProtoPlaylistOfflineState) fVar.a(this.i, protoPlaylistRootPlaylist.i);
                    this.e = fVar.a(s(), this.e, protoPlaylistRootPlaylist.s(), protoPlaylistRootPlaylist.e);
                    this.f = fVar.a(o(), this.f, protoPlaylistRootPlaylist.o(), protoPlaylistRootPlaylist.f);
                    if (fVar == e.a) {
                        this.g |= protoPlaylistRootPlaylist.g;
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
                                    this.g |= 1;
                                    this.d = c;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistMetadata.a aVar = (this.g & 2) == 2 ? (com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistMetadata.a) this.h.h() : null;
                                    this.h = (ProtoPlaylistMetadata) fkc.a(ProtoPlaylistMetadata.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.h);
                                        this.h = (ProtoPlaylistMetadata) aVar.e();
                                    }
                                    this.g |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.playlist.proto.PlaylistPlaylistState.ProtoPlaylistOfflineState.a aVar2 = (this.g & 4) == 4 ? (com.spotify.mobile.android.playlist.proto.PlaylistPlaylistState.ProtoPlaylistOfflineState.a) this.i.h() : null;
                                    this.i = (ProtoPlaylistOfflineState) fkc.a(ProtoPlaylistOfflineState.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.i);
                                        this.i = (ProtoPlaylistOfflineState) aVar2.e();
                                    }
                                    this.g |= 4;
                                } else if (a2 == 32) {
                                    this.g |= 8;
                                    this.e = fkc.g();
                                } else if (a2 == 40) {
                                    this.g |= 16;
                                    this.f = fkc.b();
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
                        synchronized (ProtoPlaylistRootPlaylist.class) {
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
            ProtoPlaylistRootPlaylist protoPlaylistRootPlaylist = new ProtoPlaylistRootPlaylist();
            j = protoPlaylistRootPlaylist;
            protoPlaylistRootPlaylist.e();
        }

        public static ProtoPlaylistRootPlaylist p() {
            return j;
        }

        public static fkr<ProtoPlaylistRootPlaylist> parser() {
            return j.c();
        }
    }

    public static final class ProtoPlaylistRootResponse extends GeneratedMessageLite<ProtoPlaylistRootResponse, a> implements hbx {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistRootResponse i;
        private static volatile fkr<ProtoPlaylistRootResponse> j;
        public int d;
        public int e;
        public int f;
        private ProtoPlaylistRootFolder g;
        private boolean h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistRootResponse, a> implements hbx {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoPlaylistRootResponse.i);
            }
        }

        private ProtoPlaylistRootResponse() {
        }

        public final ProtoPlaylistRootFolder k() {
            ProtoPlaylistRootFolder protoPlaylistRootFolder = this.g;
            return protoPlaylistRootFolder == null ? ProtoPlaylistRootFolder.m() : protoPlaylistRootFolder;
        }

        private boolean m() {
            return (this.d & 2) == 2;
        }

        private boolean n() {
            return (this.d & 4) == 4;
        }

        private boolean o() {
            return (this.d & 8) == 8;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, (fko) k());
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.b(2, this.e);
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.b(3, this.f);
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
                i3 = 0 + CodedOutputStream.b(1, (fko) k());
            }
            if ((this.d & 2) == 2) {
                i3 += CodedOutputStream.f(2, this.e);
            }
            if ((this.d & 4) == 4) {
                i3 += CodedOutputStream.f(3, this.f);
            }
            if ((this.d & 8) == 8) {
                i3 += CodedOutputStream.b(4, this.h);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoPlaylistRootResponse();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoPlaylistRootResponse protoPlaylistRootResponse = (ProtoPlaylistRootResponse) obj2;
                    this.g = (ProtoPlaylistRootFolder) fVar.a(this.g, protoPlaylistRootResponse.g);
                    this.e = fVar.a(m(), this.e, protoPlaylistRootResponse.m(), protoPlaylistRootResponse.e);
                    this.f = fVar.a(n(), this.f, protoPlaylistRootResponse.n(), protoPlaylistRootResponse.f);
                    this.h = fVar.a(o(), this.h, protoPlaylistRootResponse.o(), protoPlaylistRootResponse.h);
                    if (fVar == e.a) {
                        this.d |= protoPlaylistRootResponse.d;
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
                                    a aVar = (this.d & 1) == 1 ? (a) this.g.h() : null;
                                    this.g = (ProtoPlaylistRootFolder) fkc.a(ProtoPlaylistRootFolder.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.g);
                                        this.g = (ProtoPlaylistRootFolder) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 16) {
                                    this.d |= 2;
                                    this.e = fkc.g();
                                } else if (a2 == 24) {
                                    this.d |= 4;
                                    this.f = fkc.g();
                                } else if (a2 == 32) {
                                    this.d |= 8;
                                    this.h = fkc.b();
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
                        synchronized (ProtoPlaylistRootResponse.class) {
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
            ProtoPlaylistRootResponse protoPlaylistRootResponse = new ProtoPlaylistRootResponse();
            i = protoPlaylistRootResponse;
            protoPlaylistRootResponse.e();
        }

        public static fkr<ProtoPlaylistRootResponse> parser() {
            return i.c();
        }
    }
}
