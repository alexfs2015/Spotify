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

    public static final class ProtoTrackCollectionState extends GeneratedMessageLite<ProtoTrackCollectionState, a> implements ish {
        /* access modifiers changed from: private */
        public static final ProtoTrackCollectionState i;
        private static volatile fll<ProtoTrackCollectionState> j;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;
        private int h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoTrackCollectionState, a> implements ish {
            private a() {
                super(ProtoTrackCollectionState.i);
            }

            /* synthetic */ a(byte b) {
                this();
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

        static {
            ProtoTrackCollectionState protoTrackCollectionState = new ProtoTrackCollectionState();
            i = protoTrackCollectionState;
            protoTrackCollectionState.e();
        }

        private ProtoTrackCollectionState() {
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

        public static a k() {
            return (a) i.h();
        }

        public static ProtoTrackCollectionState l() {
            return i;
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

        public static fll<ProtoTrackCollectionState> parser() {
            return i.c();
        }

        private boolean q() {
            return (this.h & 8) == 8;
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
                    fkw fkw = (fkw) obj;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.h |= 1;
                                    this.d = fkw.b();
                                } else if (a2 == 16) {
                                    this.h |= 2;
                                    this.e = fkw.b();
                                } else if (a2 == 24) {
                                    this.h |= 4;
                                    this.f = fkw.b();
                                } else if (a2 == 32) {
                                    this.h |= 8;
                                    this.g = fkw.b();
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
    }

    public static final class ProtoTrackOfflineState extends GeneratedMessageLite<ProtoTrackOfflineState, a> implements isi {
        /* access modifiers changed from: private */
        public static final ProtoTrackOfflineState f;
        private static volatile fll<ProtoTrackOfflineState> g;
        public String d = "";
        private int e;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoTrackOfflineState, a> implements isi {
            private a() {
                super(ProtoTrackOfflineState.f);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoTrackOfflineState protoTrackOfflineState = new ProtoTrackOfflineState();
            f = protoTrackOfflineState;
            protoTrackOfflineState.e();
        }

        private ProtoTrackOfflineState() {
        }

        public static ProtoTrackOfflineState k() {
            return f;
        }

        private boolean m() {
            return (this.e & 1) == 1;
        }

        public static fll<ProtoTrackOfflineState> parser() {
            return f.c();
        }

        /* JADX INFO: finally extract failed */
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
                    fkw fkw = (fkw) obj;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    String c = fkw.c();
                                    this.e |= 1;
                                    this.d = c;
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
                    if (g == null) {
                        synchronized (ProtoTrackOfflineState.class) {
                            try {
                                if (g == null) {
                                    g = new b(f);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
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
    }

    public static final class ProtoTrackPlayState extends GeneratedMessageLite<ProtoTrackPlayState, a> implements isj {
        /* access modifiers changed from: private */
        public static final ProtoTrackPlayState f;
        private static volatile fll<ProtoTrackPlayState> g;
        public boolean d;
        private int e;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoTrackPlayState, a> implements isj {
            private a() {
                super(ProtoTrackPlayState.f);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(boolean z) {
                b();
                ProtoTrackPlayState.a((ProtoTrackPlayState) this.a, z);
                return this;
            }
        }

        static {
            ProtoTrackPlayState protoTrackPlayState = new ProtoTrackPlayState();
            f = protoTrackPlayState;
            protoTrackPlayState.e();
        }

        private ProtoTrackPlayState() {
        }

        static /* synthetic */ void a(ProtoTrackPlayState protoTrackPlayState, boolean z) {
            protoTrackPlayState.e |= 1;
            protoTrackPlayState.d = z;
        }

        public static a l() {
            return (a) f.h();
        }

        public static ProtoTrackPlayState m() {
            return f;
        }

        public static fll<ProtoTrackPlayState> parser() {
            return f.c();
        }

        /* JADX INFO: finally extract failed */
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
                    fkw fkw = (fkw) obj;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.e |= 1;
                                    this.d = fkw.b();
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
                    if (g == null) {
                        Class<ProtoTrackPlayState> cls = ProtoTrackPlayState.class;
                        synchronized (ProtoTrackPlayState.class) {
                            try {
                                if (g == null) {
                                    g = new b(f);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
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

        public final boolean k() {
            return (this.e & 1) == 1;
        }
    }
}
