package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup;
import java.io.IOException;

public final class ArtistMetadata {

    public static final class ProtoArtistMetadata extends GeneratedMessageLite<ProtoArtistMetadata, a> implements ipa {
        /* access modifiers changed from: private */
        public static final ProtoArtistMetadata i;
        private static volatile fkr<ProtoArtistMetadata> j;
        public String d;
        public String e;
        public boolean f;
        private int g;
        private ProtoImageGroup h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoArtistMetadata, a> implements ipa {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoArtistMetadata.i);
            }

            public final a a(String str) {
                b();
                ProtoArtistMetadata.a((ProtoArtistMetadata) this.a, str);
                return this;
            }

            public final a b(String str) {
                b();
                ProtoArtistMetadata.b((ProtoArtistMetadata) this.a, str);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoArtistMetadata.a((ProtoArtistMetadata) this.a, z);
                return this;
            }

            public final a a(ProtoImageGroup protoImageGroup) {
                b();
                ProtoArtistMetadata.a((ProtoArtistMetadata) this.a, protoImageGroup);
                return this;
            }
        }

        private ProtoArtistMetadata() {
            String str = "";
            this.d = str;
            this.e = str;
        }

        private boolean p() {
            return (this.g & 1) == 1;
        }

        private boolean q() {
            return (this.g & 2) == 2;
        }

        private boolean r() {
            return (this.g & 4) == 4;
        }

        public final boolean k() {
            return (this.g & 8) == 8;
        }

        public final ProtoImageGroup l() {
            ProtoImageGroup protoImageGroup = this.h;
            return protoImageGroup == null ? ProtoImageGroup.l() : protoImageGroup;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.g & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.g & 2) == 2) {
                codedOutputStream.a(2, this.e);
            }
            if ((this.g & 4) == 4) {
                codedOutputStream.a(3, this.f);
            }
            if ((this.g & 8) == 8) {
                codedOutputStream.a(4, (fko) l());
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
                i3 += CodedOutputStream.b(2, this.e);
            }
            if ((this.g & 4) == 4) {
                i3 += CodedOutputStream.b(3, this.f);
            }
            if ((this.g & 8) == 8) {
                i3 += CodedOutputStream.b(4, (fko) l());
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a m() {
            return (a) i.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoArtistMetadata();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoArtistMetadata protoArtistMetadata = (ProtoArtistMetadata) obj2;
                    this.d = fVar.a(p(), this.d, protoArtistMetadata.p(), protoArtistMetadata.d);
                    this.e = fVar.a(q(), this.e, protoArtistMetadata.q(), protoArtistMetadata.e);
                    this.f = fVar.a(r(), this.f, protoArtistMetadata.r(), protoArtistMetadata.f);
                    this.h = (ProtoImageGroup) fVar.a(this.h, protoArtistMetadata.h);
                    if (fVar == e.a) {
                        this.g |= protoArtistMetadata.g;
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
                                    String c2 = fkc.c();
                                    this.g |= 2;
                                    this.e = c2;
                                } else if (a2 == 24) {
                                    this.g |= 4;
                                    this.f = fkc.b();
                                } else if (a2 == 34) {
                                    com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a aVar = (this.g & 8) == 8 ? (com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup.a) this.h.h() : null;
                                    this.h = (ProtoImageGroup) fkc.a(ProtoImageGroup.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.h);
                                        this.h = (ProtoImageGroup) aVar.e();
                                    }
                                    this.g |= 8;
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
                        synchronized (ProtoArtistMetadata.class) {
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
            ProtoArtistMetadata protoArtistMetadata = new ProtoArtistMetadata();
            i = protoArtistMetadata;
            protoArtistMetadata.e();
        }

        public static ProtoArtistMetadata n() {
            return i;
        }

        public static fkr<ProtoArtistMetadata> parser() {
            return i.c();
        }

        static /* synthetic */ void a(ProtoArtistMetadata protoArtistMetadata, String str) {
            if (str != null) {
                protoArtistMetadata.g |= 1;
                protoArtistMetadata.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ProtoArtistMetadata protoArtistMetadata, String str) {
            if (str != null) {
                protoArtistMetadata.g |= 2;
                protoArtistMetadata.e = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoArtistMetadata protoArtistMetadata, boolean z) {
            protoArtistMetadata.g |= 4;
            protoArtistMetadata.f = z;
        }

        static /* synthetic */ void a(ProtoArtistMetadata protoArtistMetadata, ProtoImageGroup protoImageGroup) {
            if (protoImageGroup != null) {
                protoArtistMetadata.h = protoImageGroup;
                protoArtistMetadata.g |= 8;
                return;
            }
            throw new NullPointerException();
        }
    }
}
