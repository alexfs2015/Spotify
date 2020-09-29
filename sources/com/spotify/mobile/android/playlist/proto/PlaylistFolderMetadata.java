package com.spotify.mobile.android.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PlaylistFolderMetadata {

    public static final class ProtoFolderMetadata extends GeneratedMessageLite<ProtoFolderMetadata, a> implements hei {
        /* access modifiers changed from: private */
        public static final ProtoFolderMetadata l;
        private static volatile fll<ProtoFolderMetadata> m;
        public String d;
        public int e;
        public int f;
        public String g;
        private int h;
        private String i;
        private int j;
        private int k;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoFolderMetadata, a> implements hei {
            private a() {
                super(ProtoFolderMetadata.l);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoFolderMetadata protoFolderMetadata = new ProtoFolderMetadata();
            l = protoFolderMetadata;
            protoFolderMetadata.e();
        }

        private ProtoFolderMetadata() {
            String str = "";
            this.i = str;
            this.d = str;
            this.g = str;
        }

        public static ProtoFolderMetadata k() {
            return l;
        }

        private boolean m() {
            return (this.h & 1) == 1;
        }

        private boolean n() {
            return (this.h & 2) == 2;
        }

        private boolean o() {
            return (this.h & 4) == 4;
        }

        private boolean p() {
            return (this.h & 8) == 8;
        }

        public static fll<ProtoFolderMetadata> parser() {
            return l.c();
        }

        private boolean q() {
            return (this.h & 16) == 16;
        }

        private boolean r() {
            return (this.h & 32) == 32;
        }

        private boolean s() {
            return (this.h & 64) == 64;
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoFolderMetadata();
                case IS_INITIALIZED:
                    return l;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoFolderMetadata protoFolderMetadata = (ProtoFolderMetadata) obj2;
                    this.i = fVar.a(m(), this.i, protoFolderMetadata.m(), protoFolderMetadata.i);
                    this.d = fVar.a(n(), this.d, protoFolderMetadata.n(), protoFolderMetadata.d);
                    this.e = fVar.a(o(), this.e, protoFolderMetadata.o(), protoFolderMetadata.e);
                    this.f = fVar.a(p(), this.f, protoFolderMetadata.p(), protoFolderMetadata.f);
                    this.j = fVar.a(q(), this.j, protoFolderMetadata.q(), protoFolderMetadata.j);
                    this.k = fVar.a(r(), this.k, protoFolderMetadata.r(), protoFolderMetadata.k);
                    this.g = fVar.a(s(), this.g, protoFolderMetadata.s(), protoFolderMetadata.g);
                    if (fVar == e.a) {
                        this.h |= protoFolderMetadata.h;
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
                                    this.h |= 1;
                                    this.i = c;
                                } else if (a2 == 18) {
                                    String c2 = fkw.c();
                                    this.h |= 2;
                                    this.d = c2;
                                } else if (a2 == 24) {
                                    this.h |= 4;
                                    this.e = fkw.g();
                                } else if (a2 == 32) {
                                    this.h |= 8;
                                    this.f = fkw.g();
                                } else if (a2 == 40) {
                                    this.h |= 16;
                                    this.j = fkw.g();
                                } else if (a2 == 48) {
                                    this.h |= 32;
                                    this.k = fkw.g();
                                } else if (a2 == 58) {
                                    String c3 = fkw.c();
                                    this.h |= 64;
                                    this.g = c3;
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
                    if (m == null) {
                        Class<ProtoFolderMetadata> cls = ProtoFolderMetadata.class;
                        synchronized (ProtoFolderMetadata.class) {
                            try {
                                if (m == null) {
                                    m = new b(l);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return m;
                default:
                    throw new UnsupportedOperationException();
            }
            return l;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.h & 1) == 1) {
                codedOutputStream.a(1, this.i);
            }
            if ((this.h & 2) == 2) {
                codedOutputStream.a(2, this.d);
            }
            if ((this.h & 4) == 4) {
                codedOutputStream.c(3, this.e);
            }
            if ((this.h & 8) == 8) {
                codedOutputStream.c(4, this.f);
            }
            if ((this.h & 16) == 16) {
                codedOutputStream.c(5, this.j);
            }
            if ((this.h & 32) == 32) {
                codedOutputStream.c(6, this.k);
            }
            if ((this.h & 64) == 64) {
                codedOutputStream.a(7, this.g);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.h & 1) == 1) {
                i3 = 0 + CodedOutputStream.b(1, this.i);
            }
            if ((this.h & 2) == 2) {
                i3 += CodedOutputStream.b(2, this.d);
            }
            if ((this.h & 4) == 4) {
                i3 += CodedOutputStream.g(3, this.e);
            }
            if ((this.h & 8) == 8) {
                i3 += CodedOutputStream.g(4, this.f);
            }
            if ((this.h & 16) == 16) {
                i3 += CodedOutputStream.g(5, this.j);
            }
            if ((this.h & 32) == 32) {
                i3 += CodedOutputStream.g(6, this.k);
            }
            if ((this.h & 64) == 64) {
                i3 += CodedOutputStream.b(7, this.g);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }
    }
}
