package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class AlbumState {

    public static final class ProtoAlbumCollectionState extends GeneratedMessageLite<ProtoAlbumCollectionState, a> implements ioy {
        /* access modifiers changed from: private */
        public static final ProtoAlbumCollectionState h;
        private static volatile fkr<ProtoAlbumCollectionState> i;
        public String d = "";
        public int e;
        public boolean f;
        private int g;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoAlbumCollectionState, a> implements ioy {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoAlbumCollectionState.h);
            }

            public final a a(String str) {
                b();
                ProtoAlbumCollectionState.a((ProtoAlbumCollectionState) this.a, str);
                return this;
            }

            public final a a(int i) {
                b();
                ProtoAlbumCollectionState.a((ProtoAlbumCollectionState) this.a, i);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoAlbumCollectionState.a((ProtoAlbumCollectionState) this.a, z);
                return this;
            }
        }

        private ProtoAlbumCollectionState() {
        }

        private boolean n() {
            return (this.g & 1) == 1;
        }

        private boolean o() {
            return (this.g & 2) == 2;
        }

        private boolean p() {
            return (this.g & 4) == 4;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.g & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.g & 2) == 2) {
                codedOutputStream.c(2, this.e);
            }
            if ((this.g & 4) == 4) {
                codedOutputStream.a(3, this.f);
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
                i3 += CodedOutputStream.g(2, this.e);
            }
            if ((this.g & 4) == 4) {
                i3 += CodedOutputStream.b(3, this.f);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a k() {
            return (a) h.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoAlbumCollectionState();
                case IS_INITIALIZED:
                    return h;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoAlbumCollectionState protoAlbumCollectionState = (ProtoAlbumCollectionState) obj2;
                    this.d = fVar.a(n(), this.d, protoAlbumCollectionState.n(), protoAlbumCollectionState.d);
                    this.e = fVar.a(o(), this.e, protoAlbumCollectionState.o(), protoAlbumCollectionState.e);
                    this.f = fVar.a(p(), this.f, protoAlbumCollectionState.p(), protoAlbumCollectionState.f);
                    if (fVar == e.a) {
                        this.g |= protoAlbumCollectionState.g;
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
                                    this.g |= 1;
                                    this.d = c;
                                } else if (a2 == 16) {
                                    this.g |= 2;
                                    this.e = fkc.g();
                                } else if (a2 == 24) {
                                    this.g |= 4;
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
                    if (i == null) {
                        synchronized (ProtoAlbumCollectionState.class) {
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
            ProtoAlbumCollectionState protoAlbumCollectionState = new ProtoAlbumCollectionState();
            h = protoAlbumCollectionState;
            protoAlbumCollectionState.e();
        }

        public static ProtoAlbumCollectionState l() {
            return h;
        }

        public static fkr<ProtoAlbumCollectionState> parser() {
            return h.c();
        }

        static /* synthetic */ void a(ProtoAlbumCollectionState protoAlbumCollectionState, String str) {
            if (str != null) {
                protoAlbumCollectionState.g |= 1;
                protoAlbumCollectionState.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoAlbumCollectionState protoAlbumCollectionState, int i2) {
            protoAlbumCollectionState.g |= 2;
            protoAlbumCollectionState.e = i2;
        }

        static /* synthetic */ void a(ProtoAlbumCollectionState protoAlbumCollectionState, boolean z) {
            protoAlbumCollectionState.g |= 4;
            protoAlbumCollectionState.f = z;
        }
    }

    public static final class ProtoAlbumOfflineState extends GeneratedMessageLite<ProtoAlbumOfflineState, a> implements ioz {
        /* access modifiers changed from: private */
        public static final ProtoAlbumOfflineState h;
        private static volatile fkr<ProtoAlbumOfflineState> i;
        public String d;
        public int e;
        private int f;
        private String g;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoAlbumOfflineState, a> implements ioz {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoAlbumOfflineState.h);
            }
        }

        private ProtoAlbumOfflineState() {
            String str = "";
            this.d = str;
            this.g = str;
        }

        private boolean m() {
            return (this.f & 1) == 1;
        }

        private boolean n() {
            return (this.f & 2) == 2;
        }

        private boolean o() {
            return (this.f & 4) == 4;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.f & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.a(2, this.g);
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.c(3, this.e);
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
                i3 = 0 + CodedOutputStream.b(1, this.d);
            }
            if ((this.f & 2) == 2) {
                i3 += CodedOutputStream.b(2, this.g);
            }
            if ((this.f & 4) == 4) {
                i3 += CodedOutputStream.g(3, this.e);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoAlbumOfflineState();
                case IS_INITIALIZED:
                    return h;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoAlbumOfflineState protoAlbumOfflineState = (ProtoAlbumOfflineState) obj2;
                    this.d = fVar.a(m(), this.d, protoAlbumOfflineState.m(), protoAlbumOfflineState.d);
                    this.g = fVar.a(n(), this.g, protoAlbumOfflineState.n(), protoAlbumOfflineState.g);
                    this.e = fVar.a(o(), this.e, protoAlbumOfflineState.o(), protoAlbumOfflineState.e);
                    if (fVar == e.a) {
                        this.f |= protoAlbumOfflineState.f;
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
                                    this.f |= 1;
                                    this.d = c;
                                } else if (a2 == 18) {
                                    String c2 = fkc.c();
                                    this.f |= 2;
                                    this.g = c2;
                                } else if (a2 == 24) {
                                    this.f |= 4;
                                    this.e = fkc.g();
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
                        synchronized (ProtoAlbumOfflineState.class) {
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
            ProtoAlbumOfflineState protoAlbumOfflineState = new ProtoAlbumOfflineState();
            h = protoAlbumOfflineState;
            protoAlbumOfflineState.e();
        }

        public static ProtoAlbumOfflineState k() {
            return h;
        }

        public static fkr<ProtoAlbumOfflineState> parser() {
            return h.c();
        }
    }
}
