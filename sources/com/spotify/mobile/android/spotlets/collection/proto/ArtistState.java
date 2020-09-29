package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class ArtistState {

    public static final class ProtoArtistCollectionState extends GeneratedMessageLite<ProtoArtistCollectionState, a> implements iro {
        /* access modifiers changed from: private */
        public static final ProtoArtistCollectionState j;
        private static volatile fll<ProtoArtistCollectionState> k;
        public String d = "";
        public boolean e;
        public int f;
        public int g;
        public boolean h;
        private int i;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoArtistCollectionState, a> implements iro {
            private a() {
                super(ProtoArtistCollectionState.j);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(int i) {
                b();
                ProtoArtistCollectionState.a((ProtoArtistCollectionState) this.a, i);
                return this;
            }

            public final a a(String str) {
                b();
                ProtoArtistCollectionState.a((ProtoArtistCollectionState) this.a, str);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoArtistCollectionState.a((ProtoArtistCollectionState) this.a, z);
                return this;
            }

            public final a b(int i) {
                b();
                ProtoArtistCollectionState.b((ProtoArtistCollectionState) this.a, i);
                return this;
            }

            public final a b(boolean z) {
                b();
                ProtoArtistCollectionState.b((ProtoArtistCollectionState) this.a, z);
                return this;
            }
        }

        static {
            ProtoArtistCollectionState protoArtistCollectionState = new ProtoArtistCollectionState();
            j = protoArtistCollectionState;
            protoArtistCollectionState.e();
        }

        private ProtoArtistCollectionState() {
        }

        static /* synthetic */ void a(ProtoArtistCollectionState protoArtistCollectionState, int i2) {
            protoArtistCollectionState.i |= 4;
            protoArtistCollectionState.f = i2;
        }

        static /* synthetic */ void a(ProtoArtistCollectionState protoArtistCollectionState, String str) {
            if (str != null) {
                protoArtistCollectionState.i |= 1;
                protoArtistCollectionState.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ProtoArtistCollectionState protoArtistCollectionState, boolean z) {
            protoArtistCollectionState.i |= 2;
            protoArtistCollectionState.e = z;
        }

        static /* synthetic */ void b(ProtoArtistCollectionState protoArtistCollectionState, int i2) {
            protoArtistCollectionState.i |= 8;
            protoArtistCollectionState.g = i2;
        }

        static /* synthetic */ void b(ProtoArtistCollectionState protoArtistCollectionState, boolean z) {
            protoArtistCollectionState.i |= 16;
            protoArtistCollectionState.h = z;
        }

        public static a k() {
            return (a) j.h();
        }

        public static ProtoArtistCollectionState l() {
            return j;
        }

        private boolean n() {
            return (this.i & 1) == 1;
        }

        private boolean o() {
            return (this.i & 2) == 2;
        }

        private boolean p() {
            return (this.i & 4) == 4;
        }

        public static fll<ProtoArtistCollectionState> parser() {
            return j.c();
        }

        private boolean q() {
            return (this.i & 8) == 8;
        }

        private boolean r() {
            return (this.i & 16) == 16;
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            boolean z2 = true;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoArtistCollectionState();
                case IS_INITIALIZED:
                    return j;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoArtistCollectionState protoArtistCollectionState = (ProtoArtistCollectionState) obj2;
                    this.d = fVar.a(n(), this.d, protoArtistCollectionState.n(), protoArtistCollectionState.d);
                    this.e = fVar.a(o(), this.e, protoArtistCollectionState.o(), protoArtistCollectionState.e);
                    this.f = fVar.a(p(), this.f, protoArtistCollectionState.p(), protoArtistCollectionState.f);
                    this.g = fVar.a(q(), this.g, protoArtistCollectionState.q(), protoArtistCollectionState.g);
                    this.h = fVar.a(r(), this.h, protoArtistCollectionState.r(), protoArtistCollectionState.h);
                    if (fVar == e.a) {
                        this.i |= protoArtistCollectionState.i;
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
                                    this.i |= 1;
                                    this.d = c;
                                } else if (a2 == 16) {
                                    this.i |= 2;
                                    this.e = fkw.b();
                                } else if (a2 == 24) {
                                    this.i |= 4;
                                    this.f = fkw.g();
                                } else if (a2 == 32) {
                                    this.i |= 8;
                                    this.g = fkw.g();
                                } else if (a2 == 40) {
                                    this.i |= 16;
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
                    if (k == null) {
                        synchronized (ProtoArtistCollectionState.class) {
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
            if ((this.i & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.i & 2) == 2) {
                codedOutputStream.a(2, this.e);
            }
            if ((this.i & 4) == 4) {
                codedOutputStream.c(3, this.f);
            }
            if ((this.i & 8) == 8) {
                codedOutputStream.c(4, this.g);
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
                i3 += CodedOutputStream.g(3, this.f);
            }
            if ((this.i & 8) == 8) {
                i3 += CodedOutputStream.g(4, this.g);
            }
            if ((this.i & 16) == 16) {
                int i4 = 5 >> 5;
                i3 += CodedOutputStream.b(5, this.h);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }
    }

    public static final class ProtoArtistOfflineState extends GeneratedMessageLite<ProtoArtistOfflineState, a> implements irp {
        /* access modifiers changed from: private */
        public static final ProtoArtistOfflineState h;
        private static volatile fll<ProtoArtistOfflineState> i;
        public String d;
        public int e;
        private int f;
        private String g;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoArtistOfflineState, a> implements irp {
            private a() {
                super(ProtoArtistOfflineState.h);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoArtistOfflineState protoArtistOfflineState = new ProtoArtistOfflineState();
            h = protoArtistOfflineState;
            protoArtistOfflineState.e();
        }

        private ProtoArtistOfflineState() {
            String str = "";
            this.d = str;
            this.g = str;
        }

        public static ProtoArtistOfflineState k() {
            return h;
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

        public static fll<ProtoArtistOfflineState> parser() {
            return h.c();
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoArtistOfflineState();
                case IS_INITIALIZED:
                    return h;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoArtistOfflineState protoArtistOfflineState = (ProtoArtistOfflineState) obj2;
                    this.d = fVar.a(m(), this.d, protoArtistOfflineState.m(), protoArtistOfflineState.d);
                    this.g = fVar.a(n(), this.g, protoArtistOfflineState.n(), protoArtistOfflineState.g);
                    this.e = fVar.a(o(), this.e, protoArtistOfflineState.o(), protoArtistOfflineState.e);
                    if (fVar == e.a) {
                        this.f |= protoArtistOfflineState.f;
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
                                    this.g = c2;
                                } else if (a2 == 24) {
                                    this.f |= 4;
                                    this.e = fkw.g();
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
                        synchronized (ProtoArtistOfflineState.class) {
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
    }
}
