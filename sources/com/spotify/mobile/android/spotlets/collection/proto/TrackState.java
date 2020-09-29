package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class TrackState {

    public static final class ProtoTrackCollectionState extends GeneratedMessageLite<ProtoTrackCollectionState, a> implements ipu {
        /* access modifiers changed from: private */
        public static final ProtoTrackCollectionState i;
        private static volatile fkr<ProtoTrackCollectionState> j;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;
        private int h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoTrackCollectionState, a> implements ipu {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoTrackCollectionState.i);
            }

            public final a a(boolean z) {
                b();
                ProtoTrackCollectionState.a((ProtoTrackCollectionState) this.a, z);
                return this;
            }

            public final a b(boolean z) {
                b();
                ProtoTrackCollectionState.b((ProtoTrackCollectionState) this.a, z);
                return this;
            }

            public final a c(boolean z) {
                b();
                ProtoTrackCollectionState.c((ProtoTrackCollectionState) this.a, z);
                return this;
            }

            public final a d(boolean z) {
                b();
                ProtoTrackCollectionState.d((ProtoTrackCollectionState) this.a, z);
                return this;
            }
        }

        private ProtoTrackCollectionState() {
        }

        private boolean n() {
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
                codedOutputStream.a(1, this.d);
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
                i3 = 0 + CodedOutputStream.b(1, this.d);
            }
            if ((this.h & 2) == 2) {
                i3 += CodedOutputStream.b(2, this.e);
            }
            if ((this.h & 4) == 4) {
                i3 += CodedOutputStream.b(3, this.f);
            }
            if ((this.h & 8) == 8) {
                i3 += CodedOutputStream.b(4, this.g);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a k() {
            return (a) i.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoTrackCollectionState();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoTrackCollectionState protoTrackCollectionState = (ProtoTrackCollectionState) obj2;
                    this.d = fVar.a(n(), this.d, protoTrackCollectionState.n(), protoTrackCollectionState.d);
                    this.e = fVar.a(o(), this.e, protoTrackCollectionState.o(), protoTrackCollectionState.e);
                    this.f = fVar.a(p(), this.f, protoTrackCollectionState.p(), protoTrackCollectionState.f);
                    this.g = fVar.a(q(), this.g, protoTrackCollectionState.q(), protoTrackCollectionState.g);
                    if (fVar == e.a) {
                        this.h |= protoTrackCollectionState.h;
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
                                    this.d = fkc.b();
                                } else if (a2 == 16) {
                                    this.h |= 2;
                                    this.e = fkc.b();
                                } else if (a2 == 24) {
                                    this.h |= 4;
                                    this.f = fkc.b();
                                } else if (a2 == 32) {
                                    this.h |= 8;
                                    this.g = fkc.b();
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
                        synchronized (ProtoTrackCollectionState.class) {
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
            ProtoTrackCollectionState protoTrackCollectionState = new ProtoTrackCollectionState();
            i = protoTrackCollectionState;
            protoTrackCollectionState.e();
        }

        public static ProtoTrackCollectionState l() {
            return i;
        }

        public static fkr<ProtoTrackCollectionState> parser() {
            return i.c();
        }

        static /* synthetic */ void a(ProtoTrackCollectionState protoTrackCollectionState, boolean z) {
            protoTrackCollectionState.h |= 1;
            protoTrackCollectionState.d = z;
        }

        static /* synthetic */ void b(ProtoTrackCollectionState protoTrackCollectionState, boolean z) {
            protoTrackCollectionState.h |= 2;
            protoTrackCollectionState.e = z;
        }

        static /* synthetic */ void c(ProtoTrackCollectionState protoTrackCollectionState, boolean z) {
            protoTrackCollectionState.h |= 4;
            protoTrackCollectionState.f = z;
        }

        static /* synthetic */ void d(ProtoTrackCollectionState protoTrackCollectionState, boolean z) {
            protoTrackCollectionState.h |= 8;
            protoTrackCollectionState.g = z;
        }
    }

    public static final class ProtoTrackOfflineState extends GeneratedMessageLite<ProtoTrackOfflineState, a> implements ipv {
        /* access modifiers changed from: private */
        public static final ProtoTrackOfflineState f;
        private static volatile fkr<ProtoTrackOfflineState> g;
        public String d = "";
        private int e;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoTrackOfflineState, a> implements ipv {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoTrackOfflineState.f);
            }
        }

        private ProtoTrackOfflineState() {
        }

        private boolean m() {
            return (this.e & 1) == 1;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.e & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.e & 1) == 1) {
                i2 = 0 + CodedOutputStream.b(1, this.d);
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoTrackOfflineState();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoTrackOfflineState protoTrackOfflineState = (ProtoTrackOfflineState) obj2;
                    this.d = fVar.a(m(), this.d, protoTrackOfflineState.m(), protoTrackOfflineState.d);
                    if (fVar == e.a) {
                        this.e |= protoTrackOfflineState.e;
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
                                    this.e |= 1;
                                    this.d = c;
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
                    if (g == null) {
                        synchronized (ProtoTrackOfflineState.class) {
                            if (g == null) {
                                g = new b(f);
                            }
                        }
                    }
                    return g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        static {
            ProtoTrackOfflineState protoTrackOfflineState = new ProtoTrackOfflineState();
            f = protoTrackOfflineState;
            protoTrackOfflineState.e();
        }

        public static ProtoTrackOfflineState k() {
            return f;
        }

        public static fkr<ProtoTrackOfflineState> parser() {
            return f.c();
        }
    }

    public static final class ProtoTrackPlayState extends GeneratedMessageLite<ProtoTrackPlayState, a> implements ipw {
        /* access modifiers changed from: private */
        public static final ProtoTrackPlayState f;
        private static volatile fkr<ProtoTrackPlayState> g;
        public boolean d;
        private int e;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoTrackPlayState, a> implements ipw {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ProtoTrackPlayState.f);
            }

            public final a a(boolean z) {
                b();
                ProtoTrackPlayState.a((ProtoTrackPlayState) this.a, z);
                return this;
            }
        }

        private ProtoTrackPlayState() {
        }

        public final boolean k() {
            return (this.e & 1) == 1;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.e & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.e & 1) == 1) {
                i2 = 0 + CodedOutputStream.b(1, this.d);
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a l() {
            return (a) f.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoTrackPlayState();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoTrackPlayState protoTrackPlayState = (ProtoTrackPlayState) obj2;
                    this.d = fVar.a(k(), this.d, protoTrackPlayState.k(), protoTrackPlayState.d);
                    if (fVar == e.a) {
                        this.e |= protoTrackPlayState.e;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.e |= 1;
                                    this.d = fkc.b();
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
                    if (g == null) {
                        synchronized (ProtoTrackPlayState.class) {
                            if (g == null) {
                                g = new b(f);
                            }
                        }
                    }
                    return g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        static {
            ProtoTrackPlayState protoTrackPlayState = new ProtoTrackPlayState();
            f = protoTrackPlayState;
            protoTrackPlayState.e();
        }

        public static ProtoTrackPlayState m() {
            return f;
        }

        public static fkr<ProtoTrackPlayState> parser() {
            return f.c();
        }

        static /* synthetic */ void a(ProtoTrackPlayState protoTrackPlayState, boolean z) {
            protoTrackPlayState.e |= 1;
            protoTrackPlayState.d = z;
        }
    }
}
