package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class EpisodeState {

    public static final class ProtoEpisodeCollectionState extends GeneratedMessageLite<ProtoEpisodeCollectionState, a> implements jcs {
        /* access modifiers changed from: private */
        public static final ProtoEpisodeCollectionState h;
        private static volatile fkr<ProtoEpisodeCollectionState> i;
        public boolean d;
        public boolean e;
        public boolean f;
        private int g;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoEpisodeCollectionState, a> implements jcs {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoEpisodeCollectionState.h);
            }

            public final a a(boolean z) {
                b();
                ProtoEpisodeCollectionState.a((ProtoEpisodeCollectionState) this.a, z);
                return this;
            }

            public final a b(boolean z) {
                b();
                ProtoEpisodeCollectionState.b((ProtoEpisodeCollectionState) this.a, z);
                return this;
            }
        }

        private ProtoEpisodeCollectionState() {
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
                codedOutputStream.a(2, this.e);
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
                i3 += CodedOutputStream.b(2, this.e);
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
                    return new ProtoEpisodeCollectionState();
                case IS_INITIALIZED:
                    return h;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoEpisodeCollectionState protoEpisodeCollectionState = (ProtoEpisodeCollectionState) obj2;
                    this.d = fVar.a(n(), this.d, protoEpisodeCollectionState.n(), protoEpisodeCollectionState.d);
                    this.e = fVar.a(o(), this.e, protoEpisodeCollectionState.o(), protoEpisodeCollectionState.e);
                    this.f = fVar.a(p(), this.f, protoEpisodeCollectionState.p(), protoEpisodeCollectionState.f);
                    if (fVar == e.a) {
                        this.g |= protoEpisodeCollectionState.g;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.g |= 1;
                                    this.d = fkc.b();
                                } else if (a2 == 16) {
                                    this.g |= 2;
                                    this.e = fkc.b();
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
                        synchronized (ProtoEpisodeCollectionState.class) {
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
            ProtoEpisodeCollectionState protoEpisodeCollectionState = new ProtoEpisodeCollectionState();
            h = protoEpisodeCollectionState;
            protoEpisodeCollectionState.e();
        }

        public static ProtoEpisodeCollectionState l() {
            return h;
        }

        public static fkr<ProtoEpisodeCollectionState> parser() {
            return h.c();
        }

        static /* synthetic */ void a(ProtoEpisodeCollectionState protoEpisodeCollectionState, boolean z) {
            protoEpisodeCollectionState.g |= 1;
            protoEpisodeCollectionState.d = z;
        }

        static /* synthetic */ void b(ProtoEpisodeCollectionState protoEpisodeCollectionState, boolean z) {
            protoEpisodeCollectionState.g |= 2;
            protoEpisodeCollectionState.e = z;
        }
    }

    public static final class ProtoEpisodeOfflineState extends GeneratedMessageLite<ProtoEpisodeOfflineState, a> implements jct {
        /* access modifiers changed from: private */
        public static final ProtoEpisodeOfflineState g;
        private static volatile fkr<ProtoEpisodeOfflineState> h;
        public String d = "";
        public int e;
        private int f;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoEpisodeOfflineState, a> implements jct {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoEpisodeOfflineState.g);
            }
        }

        private ProtoEpisodeOfflineState() {
        }

        private boolean m() {
            return (this.f & 1) == 1;
        }

        private boolean n() {
            return (this.f & 2) == 2;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.f & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.c(2, this.e);
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
                i2 += CodedOutputStream.g(2, this.e);
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoEpisodeOfflineState();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoEpisodeOfflineState protoEpisodeOfflineState = (ProtoEpisodeOfflineState) obj2;
                    this.d = fVar.a(m(), this.d, protoEpisodeOfflineState.m(), protoEpisodeOfflineState.d);
                    this.e = fVar.a(n(), this.e, protoEpisodeOfflineState.n(), protoEpisodeOfflineState.e);
                    if (fVar == e.a) {
                        this.f |= protoEpisodeOfflineState.f;
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
                                } else if (a2 == 16) {
                                    this.f |= 2;
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
                    if (h == null) {
                        synchronized (ProtoEpisodeOfflineState.class) {
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
            ProtoEpisodeOfflineState protoEpisodeOfflineState = new ProtoEpisodeOfflineState();
            g = protoEpisodeOfflineState;
            protoEpisodeOfflineState.e();
        }

        public static ProtoEpisodeOfflineState k() {
            return g;
        }

        public static fkr<ProtoEpisodeOfflineState> parser() {
            return g.c();
        }
    }

    public static final class ProtoEpisodePlayState extends GeneratedMessageLite<ProtoEpisodePlayState, a> implements jcu {
        /* access modifiers changed from: private */
        public static final ProtoEpisodePlayState i;
        private static volatile fkr<ProtoEpisodePlayState> j;
        public int d;
        public boolean e;
        public boolean f;
        public long g;
        private int h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoEpisodePlayState, a> implements jcu {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoEpisodePlayState.i);
            }

            public final a a(int i) {
                b();
                ProtoEpisodePlayState.a((ProtoEpisodePlayState) this.a, i);
                return this;
            }

            public final a a(boolean z) {
                b();
                ProtoEpisodePlayState.a((ProtoEpisodePlayState) this.a, z);
                return this;
            }

            public final a b(boolean z) {
                b();
                ProtoEpisodePlayState.b((ProtoEpisodePlayState) this.a, z);
                return this;
            }
        }

        private ProtoEpisodePlayState() {
        }

        public final boolean k() {
            return (this.h & 1) == 1;
        }

        private boolean o() {
            return (this.h & 2) == 2;
        }

        private boolean p() {
            return (this.h & 4) == 4;
        }

        private boolean q() {
            return (this.h & 8) == 8;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.h & 1) == 1) {
                codedOutputStream.c(1, this.d);
            }
            if ((this.h & 2) == 2) {
                codedOutputStream.a(2, this.e);
            }
            if ((this.h & 4) == 4) {
                codedOutputStream.a(3, this.f);
            }
            if ((this.h & 8) == 8) {
                codedOutputStream.a(4, this.g);
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
                i3 = 0 + CodedOutputStream.g(1, this.d);
            }
            if ((this.h & 2) == 2) {
                i3 += CodedOutputStream.b(2, this.e);
            }
            if ((this.h & 4) == 4) {
                i3 += CodedOutputStream.b(3, this.f);
            }
            if ((this.h & 8) == 8) {
                i3 += CodedOutputStream.d(4, this.g);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a l() {
            return (a) i.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoEpisodePlayState();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoEpisodePlayState protoEpisodePlayState = (ProtoEpisodePlayState) obj2;
                    this.d = fVar.a(k(), this.d, protoEpisodePlayState.k(), protoEpisodePlayState.d);
                    this.e = fVar.a(o(), this.e, protoEpisodePlayState.o(), protoEpisodePlayState.e);
                    this.f = fVar.a(p(), this.f, protoEpisodePlayState.p(), protoEpisodePlayState.f);
                    this.g = fVar.a(q(), this.g, protoEpisodePlayState.q(), protoEpisodePlayState.g);
                    if (fVar == e.a) {
                        this.h |= protoEpisodePlayState.h;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.h |= 1;
                                    this.d = fkc.g();
                                } else if (a2 == 16) {
                                    this.h |= 2;
                                    this.e = fkc.b();
                                } else if (a2 == 24) {
                                    this.h |= 4;
                                    this.f = fkc.b();
                                } else if (a2 == 32) {
                                    this.h |= 8;
                                    this.g = fkc.h();
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
                        synchronized (ProtoEpisodePlayState.class) {
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
            ProtoEpisodePlayState protoEpisodePlayState = new ProtoEpisodePlayState();
            i = protoEpisodePlayState;
            protoEpisodePlayState.e();
        }

        public static ProtoEpisodePlayState m() {
            return i;
        }

        public static fkr<ProtoEpisodePlayState> parser() {
            return i.c();
        }

        static /* synthetic */ void a(ProtoEpisodePlayState protoEpisodePlayState, int i2) {
            protoEpisodePlayState.h |= 1;
            protoEpisodePlayState.d = i2;
        }

        static /* synthetic */ void a(ProtoEpisodePlayState protoEpisodePlayState, boolean z) {
            protoEpisodePlayState.h |= 2;
            protoEpisodePlayState.e = z;
        }

        static /* synthetic */ void b(ProtoEpisodePlayState protoEpisodePlayState, boolean z) {
            protoEpisodePlayState.h |= 4;
            protoEpisodePlayState.f = z;
        }
    }
}
