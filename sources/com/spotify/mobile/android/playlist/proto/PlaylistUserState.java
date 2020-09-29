package com.spotify.mobile.android.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PlaylistUserState {

    public static final class ProtoUser extends GeneratedMessageLite<ProtoUser, a> implements hby {
        /* access modifiers changed from: private */
        public static final ProtoUser j;
        private static volatile fkr<ProtoUser> k;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        private int i;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoUser, a> implements hby {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoUser.j);
            }
        }

        private ProtoUser() {
            String str = "";
            this.d = str;
            this.e = str;
            this.f = str;
            this.g = str;
            this.h = str;
        }

        private boolean m() {
            return (this.i & 1) == 1;
        }

        private boolean n() {
            return (this.i & 2) == 2;
        }

        private boolean o() {
            return (this.i & 4) == 4;
        }

        private boolean p() {
            return (this.i & 8) == 8;
        }

        private boolean q() {
            return (this.i & 16) == 16;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.i & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.i & 2) == 2) {
                codedOutputStream.a(2, this.e);
            }
            if ((this.i & 4) == 4) {
                codedOutputStream.a(3, this.f);
            }
            if ((this.i & 8) == 8) {
                codedOutputStream.a(4, this.g);
            }
            if ((this.i & 16) == 16) {
                codedOutputStream.a(5, this.h);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.i & 1) == 1) {
                i3 = 0 + CodedOutputStream.b(1, this.d);
            }
            if ((this.i & 2) == 2) {
                i3 += CodedOutputStream.b(2, this.e);
            }
            if ((this.i & 4) == 4) {
                i3 += CodedOutputStream.b(3, this.f);
            }
            if ((this.i & 8) == 8) {
                i3 += CodedOutputStream.b(4, this.g);
            }
            if ((this.i & 16) == 16) {
                i3 += CodedOutputStream.b(5, this.h);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoUser();
                case IS_INITIALIZED:
                    return j;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoUser protoUser = (ProtoUser) obj2;
                    this.d = fVar.a(m(), this.d, protoUser.m(), protoUser.d);
                    this.e = fVar.a(n(), this.e, protoUser.n(), protoUser.e);
                    this.f = fVar.a(o(), this.f, protoUser.o(), protoUser.f);
                    this.g = fVar.a(p(), this.g, protoUser.p(), protoUser.g);
                    this.h = fVar.a(q(), this.h, protoUser.q(), protoUser.h);
                    if (fVar == e.a) {
                        this.i |= protoUser.i;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    String c = fkc.c();
                                    this.i |= 1;
                                    this.d = c;
                                } else if (a2 == 18) {
                                    String c2 = fkc.c();
                                    this.i |= 2;
                                    this.e = c2;
                                } else if (a2 == 26) {
                                    String c3 = fkc.c();
                                    this.i |= 4;
                                    this.f = c3;
                                } else if (a2 == 34) {
                                    String c4 = fkc.c();
                                    this.i |= 8;
                                    this.g = c4;
                                } else if (a2 == 42) {
                                    String c5 = fkc.c();
                                    this.i |= 16;
                                    this.h = c5;
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
                        synchronized (ProtoUser.class) {
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
            ProtoUser protoUser = new ProtoUser();
            j = protoUser;
            protoUser.e();
        }

        public static ProtoUser k() {
            return j;
        }

        public static fkr<ProtoUser> parser() {
            return j.c();
        }
    }
}
