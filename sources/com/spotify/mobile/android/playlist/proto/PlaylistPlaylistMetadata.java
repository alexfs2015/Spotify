package com.spotify.mobile.android.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.playlist.proto.PlaylistUserState.ProtoUser;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup;
import java.io.IOException;

public final class PlaylistPlaylistMetadata {

    public static final class ProtoPlaylistFormatListAttribute extends GeneratedMessageLite<ProtoPlaylistFormatListAttribute, a> implements hej {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistFormatListAttribute g;
        private static volatile fll<ProtoPlaylistFormatListAttribute> h;
        public String d;
        public String e;
        private int f;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistFormatListAttribute, a> implements hej {
            private a() {
                super(ProtoPlaylistFormatListAttribute.g);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoPlaylistFormatListAttribute protoPlaylistFormatListAttribute = new ProtoPlaylistFormatListAttribute();
            g = protoPlaylistFormatListAttribute;
            protoPlaylistFormatListAttribute.e();
        }

        private ProtoPlaylistFormatListAttribute() {
            String str = "";
            this.d = str;
            this.e = str;
        }

        private boolean l() {
            return (this.f & 1) == 1;
        }

        private boolean m() {
            return (this.f & 2) == 2;
        }

        public static fll<ProtoPlaylistFormatListAttribute> parser() {
            return g.c();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoPlaylistFormatListAttribute();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoPlaylistFormatListAttribute protoPlaylistFormatListAttribute = (ProtoPlaylistFormatListAttribute) obj2;
                    this.d = fVar.a(l(), this.d, protoPlaylistFormatListAttribute.l(), protoPlaylistFormatListAttribute.d);
                    this.e = fVar.a(m(), this.e, protoPlaylistFormatListAttribute.m(), protoPlaylistFormatListAttribute.e);
                    if (fVar == e.a) {
                        this.f |= protoPlaylistFormatListAttribute.f;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkw fkw = (fkw) obj;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    String c = fkw.c();
                                    this.f |= 1;
                                    this.d = c;
                                } else if (a2 == 18) {
                                    String c2 = fkw.c();
                                    this.f |= 2;
                                    this.e = c2;
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
                        synchronized (ProtoPlaylistFormatListAttribute.class) {
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

        public final void a(CodedOutputStream codedOutputStream) {
            boolean z = true | true;
            if ((this.f & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.a(2, this.e);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f & 1) == 1) {
                i2 = 0 + CodedOutputStream.b(1, this.d);
            }
            if ((this.f & 2) == 2) {
                i2 += CodedOutputStream.b(2, this.e);
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }
    }

    public static final class ProtoPlaylistMetadata extends GeneratedMessageLite<ProtoPlaylistMetadata, a> implements hek {
        /* access modifiers changed from: private */
        public static final ProtoPlaylistMetadata w;
        private static volatile fll<ProtoPlaylistMetadata> x;
        public String d;
        public String e;
        public boolean f;
        public boolean g;
        public int h;
        public String i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public String o;
        public e<ProtoPlaylistFormatListAttribute> p = flm.d();
        public boolean q;
        public boolean r;
        private int s;
        private ProtoUser t;
        private ProtoImageGroup u;
        private ProtoUser v;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoPlaylistMetadata, a> implements hek {
            private a() {
                super(ProtoPlaylistMetadata.w);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoPlaylistMetadata protoPlaylistMetadata = new ProtoPlaylistMetadata();
            w = protoPlaylistMetadata;
            protoPlaylistMetadata.e();
        }

        private ProtoPlaylistMetadata() {
            String str = "";
            this.d = str;
            this.e = str;
            this.i = str;
            this.o = str;
        }

        private boolean A() {
            return (this.s & 512) == 512;
        }

        private boolean B() {
            return (this.s & 1024) == 1024;
        }

        private boolean C() {
            return (this.s & 2048) == 2048;
        }

        private boolean D() {
            return (this.s & 4096) == 4096;
        }

        private boolean E() {
            return (this.s & 8192) == 8192;
        }

        private boolean F() {
            return (this.s & 16384) == 16384;
        }

        private boolean G() {
            return (this.s & 32768) == 32768;
        }

        public static fll<ProtoPlaylistMetadata> parser() {
            return w.c();
        }

        public static ProtoPlaylistMetadata r() {
            return w;
        }

        private boolean t() {
            return (this.s & 1) == 1;
        }

        private boolean u() {
            return (this.s & 2) == 2;
        }

        private boolean v() {
            return (this.s & 8) == 8;
        }

        private boolean w() {
            return (this.s & 16) == 16;
        }

        private boolean x() {
            return (this.s & 32) == 32;
        }

        private boolean y() {
            return (this.s & 64) == 64;
        }

        private boolean z() {
            return (this.s & 256) == 256;
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoPlaylistMetadata();
                case IS_INITIALIZED:
                    return w;
                case MAKE_IMMUTABLE:
                    this.p.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoPlaylistMetadata protoPlaylistMetadata = (ProtoPlaylistMetadata) obj2;
                    this.d = fVar.a(t(), this.d, protoPlaylistMetadata.t(), protoPlaylistMetadata.d);
                    this.e = fVar.a(u(), this.e, protoPlaylistMetadata.u(), protoPlaylistMetadata.e);
                    this.t = (ProtoUser) fVar.a(this.t, protoPlaylistMetadata.t);
                    this.f = fVar.a(v(), this.f, protoPlaylistMetadata.v(), protoPlaylistMetadata.f);
                    this.g = fVar.a(w(), this.g, protoPlaylistMetadata.w(), protoPlaylistMetadata.g);
                    this.h = fVar.a(x(), this.h, protoPlaylistMetadata.x(), protoPlaylistMetadata.h);
                    this.i = fVar.a(y(), this.i, protoPlaylistMetadata.y(), protoPlaylistMetadata.i);
                    this.u = (ProtoImageGroup) fVar.a(this.u, protoPlaylistMetadata.u);
                    this.j = fVar.a(z(), this.j, protoPlaylistMetadata.z(), protoPlaylistMetadata.j);
                    this.k = fVar.a(A(), this.k, protoPlaylistMetadata.A(), protoPlaylistMetadata.k);
                    this.l = fVar.a(B(), this.l, protoPlaylistMetadata.B(), protoPlaylistMetadata.l);
                    this.m = fVar.a(C(), this.m, protoPlaylistMetadata.C(), protoPlaylistMetadata.m);
                    this.n = fVar.a(D(), this.n, protoPlaylistMetadata.D(), protoPlaylistMetadata.n);
                    this.o = fVar.a(E(), this.o, protoPlaylistMetadata.E(), protoPlaylistMetadata.o);
                    this.p = fVar.a(this.p, protoPlaylistMetadata.p);
                    this.q = fVar.a(F(), this.q, protoPlaylistMetadata.F(), protoPlaylistMetadata.q);
                    this.r = fVar.a(G(), this.r, protoPlaylistMetadata.G(), protoPlaylistMetadata.r);
                    this.v = (ProtoUser) fVar.a(this.v, protoPlaylistMetadata.v);
                    if (fVar == e.a) {
                        this.s |= protoPlaylistMetadata.s;
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
                                    this.s |= 1;
                                    this.d = c;
                                    break;
                                case 18:
                                    String c2 = fkw.c();
                                    this.s |= 2;
                                    this.e = c2;
                                    break;
                                case 26:
                                    com.spotify.mobile.android.playlist.proto.PlaylistUserState.ProtoUser.a aVar = (this.s & 4) == 4 ? (com.spotify.mobile.android.playlist.proto.PlaylistUserState.ProtoUser.a) this.t.h() : null;
                                    this.t = (ProtoUser) fkw.a(ProtoUser.parser(), fky);
                                    if (aVar != null) {
                                        aVar.a(this.t);
                                        this.t = (ProtoUser) aVar.e();
                                    }
                                    this.s |= 4;
                                    break;
                                case 32:
                                    this.s |= 8;
                                    this.f = fkw.b();
                                    break;
                                case 40:
                                    this.s |= 16;
                                    this.g = fkw.b();
                                    break;
                                case 48:
                                    this.s |= 32;
                                    this.h = fkw.g();
                                    break;
                                case 58:
                                    String c3 = fkw.c();
                                    this.s |= 64;
                                    this.i = c3;
                                    break;
                                case b.bu /*66*/:
                                    com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a aVar2 = (this.s & 128) == 128 ? (com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a) this.u.h() : null;
                                    this.u = (ProtoImageGroup) fkw.a(ProtoImageGroup.parser(), fky);
                                    if (aVar2 != null) {
                                        aVar2.a(this.u);
                                        this.u = (ProtoImageGroup) aVar2.e();
                                    }
                                    this.s |= 128;
                                    break;
                                case b.bA /*72*/:
                                    this.s |= 256;
                                    this.j = fkw.b();
                                    break;
                                case PlaybackSpeed.PLAYBACK_SPEED_80 /*80*/:
                                    this.s |= 512;
                                    this.k = fkw.b();
                                    break;
                                case 88:
                                    this.s |= 1024;
                                    this.l = fkw.b();
                                    break;
                                case 96:
                                    this.s |= 2048;
                                    this.m = fkw.b();
                                    break;
                                case 104:
                                    this.s |= 4096;
                                    this.n = fkw.b();
                                    break;
                                case defpackage.o.a.aB /*114*/:
                                    String c4 = fkw.c();
                                    this.s |= 8192;
                                    this.o = c4;
                                    break;
                                case 122:
                                    if (!this.p.a()) {
                                        this.p = GeneratedMessageLite.a(this.p);
                                    }
                                    this.p.add(fkw.a(ProtoPlaylistFormatListAttribute.parser(), fky));
                                    break;
                                case 128:
                                    this.s |= 16384;
                                    this.q = fkw.b();
                                    break;
                                case 136:
                                    this.s |= 32768;
                                    this.r = fkw.b();
                                    break;
                                case 162:
                                    com.spotify.mobile.android.playlist.proto.PlaylistUserState.ProtoUser.a aVar3 = (this.s & 65536) == 65536 ? (com.spotify.mobile.android.playlist.proto.PlaylistUserState.ProtoUser.a) this.v.h() : null;
                                    this.v = (ProtoUser) fkw.a(ProtoUser.parser(), fky);
                                    if (aVar3 != null) {
                                        aVar3.a(this.v);
                                        this.v = (ProtoUser) aVar3.e();
                                    }
                                    this.s |= 65536;
                                    break;
                                default:
                                    if (a(a2, fkw)) {
                                        break;
                                    } else {
                                        z = true;
                                        break;
                                    }
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
                    if (x == null) {
                        Class<ProtoPlaylistMetadata> cls = ProtoPlaylistMetadata.class;
                        synchronized (ProtoPlaylistMetadata.class) {
                            try {
                                if (x == null) {
                                    x = new b(w);
                                }
                            } catch (Throwable th2) {
                                throw th2;
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
            if ((this.s & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.s & 2) == 2) {
                codedOutputStream.a(2, this.e);
            }
            if ((this.s & 4) == 4) {
                codedOutputStream.a(3, (fli) l());
            }
            if ((this.s & 8) == 8) {
                codedOutputStream.a(4, this.f);
            }
            if ((this.s & 16) == 16) {
                codedOutputStream.a(5, this.g);
            }
            if ((this.s & 32) == 32) {
                int i2 = 6 << 6;
                codedOutputStream.c(6, this.h);
            }
            if ((this.s & 64) == 64) {
                codedOutputStream.a(7, this.i);
            }
            if ((this.s & 128) == 128) {
                codedOutputStream.a(8, (fli) n());
            }
            if ((this.s & 256) == 256) {
                codedOutputStream.a(9, this.j);
            }
            if ((this.s & 512) == 512) {
                codedOutputStream.a(10, this.k);
            }
            if ((this.s & 1024) == 1024) {
                codedOutputStream.a(11, this.l);
            }
            if ((this.s & 2048) == 2048) {
                codedOutputStream.a(12, this.m);
            }
            if ((this.s & 4096) == 4096) {
                codedOutputStream.a(13, this.n);
            }
            if ((this.s & 8192) == 8192) {
                codedOutputStream.a(14, this.o);
            }
            for (int i3 = 0; i3 < this.p.size(); i3++) {
                codedOutputStream.a(15, (fli) this.p.get(i3));
            }
            if ((this.s & 16384) == 16384) {
                codedOutputStream.a(16, this.q);
            }
            if ((this.s & 32768) == 32768) {
                codedOutputStream.a(17, this.r);
            }
            if ((this.s & 65536) == 65536) {
                codedOutputStream.a(20, (fli) q());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int b = (this.s & 1) == 1 ? CodedOutputStream.b(1, this.d) + 0 : 0;
            if ((this.s & 2) == 2) {
                b += CodedOutputStream.b(2, this.e);
            }
            if ((this.s & 4) == 4) {
                b += CodedOutputStream.b(3, (fli) l());
            }
            if ((this.s & 8) == 8) {
                b += CodedOutputStream.b(4, this.f);
            }
            if ((this.s & 16) == 16) {
                b += CodedOutputStream.b(5, this.g);
            }
            if ((this.s & 32) == 32) {
                b += CodedOutputStream.g(6, this.h);
            }
            if ((this.s & 64) == 64) {
                b += CodedOutputStream.b(7, this.i);
            }
            if ((this.s & 128) == 128) {
                b += CodedOutputStream.b(8, (fli) n());
            }
            if ((this.s & 256) == 256) {
                b += CodedOutputStream.b(9, this.j);
            }
            if ((this.s & 512) == 512) {
                b += CodedOutputStream.b(10, this.k);
            }
            if ((this.s & 1024) == 1024) {
                b += CodedOutputStream.b(11, this.l);
            }
            if ((this.s & 2048) == 2048) {
                b += CodedOutputStream.b(12, this.m);
            }
            if ((this.s & 4096) == 4096) {
                b += CodedOutputStream.b(13, this.n);
            }
            if ((this.s & 8192) == 8192) {
                b += CodedOutputStream.b(14, this.o);
            }
            for (int i3 = 0; i3 < this.p.size(); i3++) {
                b += CodedOutputStream.b(15, (fli) this.p.get(i3));
            }
            if ((this.s & 16384) == 16384) {
                b += CodedOutputStream.b(16, this.q);
            }
            if ((this.s & 32768) == 32768) {
                b += CodedOutputStream.b(17, this.r);
            }
            if ((this.s & 65536) == 65536) {
                b += CodedOutputStream.b(20, (fli) q());
            }
            int d2 = b + this.b.d();
            this.c = d2;
            return d2;
        }

        public final boolean k() {
            if ((this.s & 4) != 4) {
                return false;
            }
            boolean z = false | true;
            return true;
        }

        public final ProtoUser l() {
            ProtoUser protoUser = this.t;
            if (protoUser == null) {
                protoUser = ProtoUser.k();
            }
            return protoUser;
        }

        public final boolean m() {
            return (this.s & 128) == 128;
        }

        public final ProtoImageGroup n() {
            ProtoImageGroup protoImageGroup = this.u;
            return protoImageGroup == null ? ProtoImageGroup.l() : protoImageGroup;
        }

        public final int o() {
            return this.p.size();
        }

        public final boolean p() {
            return (this.s & 65536) == 65536;
        }

        public final ProtoUser q() {
            ProtoUser protoUser = this.v;
            if (protoUser == null) {
                protoUser = ProtoUser.k();
            }
            return protoUser;
        }
    }
}
