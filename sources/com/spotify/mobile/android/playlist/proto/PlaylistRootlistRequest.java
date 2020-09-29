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

    public static final class ProtoPlaylistRootFolder extends GeneratedMessageLite<ProtoPlaylistRootFolder, a> implements heq {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistRootFolder i;
        private static volatile fll<ProtoPlaylistRootFolder> j;
        public e<ProtoPlaylistRootItem> d = flm.d();
        public String e = "";
        public int f;
        private int g;
        private ProtoFolderMetadata h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistRootFolder, a> implements heq {
            private a() {
                super(ProtoPlaylistRootFolder.i);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoPlaylistRootFolder protoPlaylistRootFolder = new ProtoPlaylistRootFolder();
            i = protoPlaylistRootFolder;
            protoPlaylistRootFolder.e();
        }

        private ProtoPlaylistRootFolder() {
        }

        public static ProtoPlaylistRootFolder m() {
            return i;
        }

        private boolean o() {
            return (this.g & 2) == 2;
        }

        private boolean p() {
            return (this.g & 4) == 4;
        }

        public static fll<ProtoPlaylistRootFolder> parser() {
            return i.c();
        }

        /* JADX INFO: finally extract failed */
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
                                    this.d.add(fkw.a(ProtoPlaylistRootItem.parser(), fky));
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.playlist.proto.PlaylistFolderMetadata.ProtoFolderMetadata.a aVar = (this.g & 1) == 1 ? (com.spotify.mobile.android.playlist.proto.PlaylistFolderMetadata.ProtoFolderMetadata.a) this.h.h() : null;
                                    this.h = (ProtoFolderMetadata) fkw.a(ProtoFolderMetadata.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.h);
                                        this.h = (ProtoFolderMetadata) aVar.e();
                                    }
                                    this.g |= 1;
                                } else if (a2 == 26) {
                                    String c = fkw.c();
                                    this.g |= 2;
                                    this.e = c;
                                } else if (a2 == 32) {
                                    this.g |= 4;
                                    this.f = fkw.g();
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
                        synchronized (ProtoPlaylistRootFolder.class) {
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
            if ((this.g & 1) == 1) {
                codedOutputStream.a(2, (fli) l());
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
                i3 += CodedOutputStream.b(1, (fli) this.d.get(i4));
            }
            if ((this.g & 1) == 1) {
                i3 += CodedOutputStream.b(2, (fli) l());
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

        public final boolean k() {
            return (this.g & 1) == 1;
        }

        public final ProtoFolderMetadata l() {
            ProtoFolderMetadata protoFolderMetadata = this.h;
            return protoFolderMetadata == null ? ProtoFolderMetadata.k() : protoFolderMetadata;
        }
    }

    public static final class ProtoPlaylistRootItem extends GeneratedMessageLite<ProtoPlaylistRootItem, a> implements her {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistRootItem h;
        private static volatile fll<ProtoPlaylistRootItem> i;
        public String d = "";
        private int e;
        private ProtoPlaylistRootFolder f;
        private ProtoPlaylistRootPlaylist g;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistRootItem, a> implements her {
            private a() {
                super(ProtoPlaylistRootItem.h);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoPlaylistRootItem protoPlaylistRootItem = new ProtoPlaylistRootItem();
            h = protoPlaylistRootItem;
            protoPlaylistRootItem.e();
        }

        private ProtoPlaylistRootItem() {
        }

        private boolean o() {
            return (this.e & 1) == 1;
        }

        public static fll<ProtoPlaylistRootItem> parser() {
            return h.c();
        }

        /* JADX INFO: finally extract failed */
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
                                    a aVar = (this.e & 2) == 2 ? (a) this.f.h() : null;
                                    this.f = (ProtoPlaylistRootFolder) fkw.a(ProtoPlaylistRootFolder.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (ProtoPlaylistRootFolder) aVar.e();
                                    }
                                    this.e |= 2;
                                } else if (a2 == 26) {
                                    a aVar2 = (this.e & 4) == 4 ? (a) this.g.h() : null;
                                    this.g = (ProtoPlaylistRootPlaylist) fkw.a(ProtoPlaylistRootPlaylist.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (ProtoPlaylistRootPlaylist) aVar2.e();
                                    }
                                    this.e |= 4;
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
                        synchronized (ProtoPlaylistRootItem.class) {
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
            if ((this.e & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.e & 2) == 2) {
                codedOutputStream.a(2, (fli) l());
            }
            if ((this.e & 4) == 4) {
                codedOutputStream.a(3, (fli) m());
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
                i3 += CodedOutputStream.b(2, (fli) l());
            }
            if ((this.e & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fli) m());
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final boolean k() {
            return (this.e & 2) == 2;
        }

        public final ProtoPlaylistRootFolder l() {
            ProtoPlaylistRootFolder protoPlaylistRootFolder = this.f;
            if (protoPlaylistRootFolder == null) {
                protoPlaylistRootFolder = ProtoPlaylistRootFolder.m();
            }
            return protoPlaylistRootFolder;
        }

        public final ProtoPlaylistRootPlaylist m() {
            ProtoPlaylistRootPlaylist protoPlaylistRootPlaylist = this.g;
            if (protoPlaylistRootPlaylist == null) {
                protoPlaylistRootPlaylist = ProtoPlaylistRootPlaylist.p();
            }
            return protoPlaylistRootPlaylist;
        }
    }

    public static final class ProtoPlaylistRootPlaylist extends GeneratedMessageLite<ProtoPlaylistRootPlaylist, a> implements hes {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistRootPlaylist j;
        private static volatile fll<ProtoPlaylistRootPlaylist> k;
        public String d = "";
        public int e;
        public boolean f;
        private int g;
        private ProtoPlaylistMetadata h;
        private ProtoPlaylistOfflineState i;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistRootPlaylist, a> implements hes {
            private a() {
                super(ProtoPlaylistRootPlaylist.j);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoPlaylistRootPlaylist protoPlaylistRootPlaylist = new ProtoPlaylistRootPlaylist();
            j = protoPlaylistRootPlaylist;
            protoPlaylistRootPlaylist.e();
        }

        private ProtoPlaylistRootPlaylist() {
        }

        public static ProtoPlaylistRootPlaylist p() {
            return j;
        }

        public static fll<ProtoPlaylistRootPlaylist> parser() {
            return j.c();
        }

        private boolean r() {
            return (this.g & 1) == 1;
        }

        private boolean s() {
            return (this.g & 8) == 8;
        }

        /* JADX INFO: finally extract failed */
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
                    fkw fkw = (fkw) obj;
                    fky fky = (fky) obj2;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    String c = fkw.c();
                                    this.g |= 1;
                                    this.d = c;
                                } else if (a2 == 18) {
                                    com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistMetadata.a aVar = (this.g & 2) == 2 ? (com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistMetadata.a) this.h.h() : null;
                                    this.h = (ProtoPlaylistMetadata) fkw.a(ProtoPlaylistMetadata.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.h);
                                        this.h = (ProtoPlaylistMetadata) aVar.e();
                                    }
                                    this.g |= 2;
                                } else if (a2 == 26) {
                                    com.spotify.mobile.android.playlist.proto.PlaylistPlaylistState.ProtoPlaylistOfflineState.a aVar2 = (this.g & 4) == 4 ? (com.spotify.mobile.android.playlist.proto.PlaylistPlaylistState.ProtoPlaylistOfflineState.a) this.i.h() : null;
                                    this.i = (ProtoPlaylistOfflineState) fkw.a(ProtoPlaylistOfflineState.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.i);
                                        this.i = (ProtoPlaylistOfflineState) aVar2.e();
                                    }
                                    this.g |= 4;
                                } else if (a2 == 32) {
                                    this.g |= 8;
                                    this.e = fkw.g();
                                } else if (a2 == 40) {
                                    this.g |= 16;
                                    this.f = fkw.b();
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
                        Class<ProtoPlaylistRootPlaylist> cls = ProtoPlaylistRootPlaylist.class;
                        synchronized (ProtoPlaylistRootPlaylist.class) {
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
            if ((this.g & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.g & 2) == 2) {
                codedOutputStream.a(2, (fli) l());
            }
            if ((this.g & 4) == 4) {
                codedOutputStream.a(3, (fli) n());
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
                i3 += CodedOutputStream.b(2, (fli) l());
            }
            if ((this.g & 4) == 4) {
                i3 += CodedOutputStream.b(3, (fli) n());
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
            if (protoPlaylistOfflineState == null) {
                protoPlaylistOfflineState = ProtoPlaylistOfflineState.k();
            }
            return protoPlaylistOfflineState;
        }

        public final boolean o() {
            return (this.g & 16) == 16;
        }
    }

    public static final class ProtoPlaylistRootResponse extends GeneratedMessageLite<ProtoPlaylistRootResponse, a> implements het {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistRootResponse i;
        private static volatile fll<ProtoPlaylistRootResponse> j;
        public int d;
        public int e;
        private int f;
        private ProtoPlaylistRootFolder g;
        private boolean h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistRootResponse, a> implements het {
            private a() {
                super(ProtoPlaylistRootResponse.i);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoPlaylistRootResponse protoPlaylistRootResponse = new ProtoPlaylistRootResponse();
            i = protoPlaylistRootResponse;
            protoPlaylistRootResponse.e();
        }

        private ProtoPlaylistRootResponse() {
        }

        public static ProtoPlaylistRootResponse m() {
            return i;
        }

        private boolean o() {
            return (this.f & 2) == 2;
        }

        private boolean p() {
            return (this.f & 4) == 4;
        }

        public static fll<ProtoPlaylistRootResponse> parser() {
            return i.c();
        }

        private boolean q() {
            return (this.f & 8) == 8;
        }

        /* JADX INFO: finally extract failed */
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
                    this.d = fVar.a(o(), this.d, protoPlaylistRootResponse.o(), protoPlaylistRootResponse.d);
                    this.e = fVar.a(p(), this.e, protoPlaylistRootResponse.p(), protoPlaylistRootResponse.e);
                    this.h = fVar.a(q(), this.h, protoPlaylistRootResponse.q(), protoPlaylistRootResponse.h);
                    if (fVar == e.a) {
                        this.f |= protoPlaylistRootResponse.f;
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
                                    a aVar = (this.f & 1) == 1 ? (a) this.g.h() : null;
                                    this.g = (ProtoPlaylistRootFolder) fkw.a(ProtoPlaylistRootFolder.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.g);
                                        this.g = (ProtoPlaylistRootFolder) aVar.e();
                                    }
                                    this.f |= 1;
                                } else if (a2 == 16) {
                                    this.f |= 2;
                                    this.d = fkw.g();
                                } else if (a2 == 24) {
                                    this.f |= 4;
                                    this.e = fkw.g();
                                } else if (a2 == 32) {
                                    this.f |= 8;
                                    this.h = fkw.b();
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
                        synchronized (ProtoPlaylistRootResponse.class) {
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
            if ((this.f & 1) == 1) {
                codedOutputStream.a(1, (fli) l());
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.b(2, this.d);
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.b(3, this.e);
            }
            if ((this.f & 8) == 8) {
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
            if ((this.f & 1) == 1) {
                i3 = 0 + CodedOutputStream.b(1, (fli) l());
            }
            if ((this.f & 2) == 2) {
                i3 += CodedOutputStream.f(2, this.d);
            }
            if ((this.f & 4) == 4) {
                i3 += CodedOutputStream.f(3, this.e);
            }
            if ((this.f & 8) == 8) {
                i3 += CodedOutputStream.b(4, this.h);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final boolean k() {
            return (this.f & 1) == 1;
        }

        public final ProtoPlaylistRootFolder l() {
            ProtoPlaylistRootFolder protoPlaylistRootFolder = this.g;
            if (protoPlaylistRootFolder == null) {
                protoPlaylistRootFolder = ProtoPlaylistRootFolder.m();
            }
            return protoPlaylistRootFolder;
        }
    }
}
