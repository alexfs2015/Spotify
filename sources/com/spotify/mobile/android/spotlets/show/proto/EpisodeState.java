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

    public static final class ProtoEpisodeCollectionState extends GeneratedMessageLite<ProtoEpisodeCollectionState, a> implements jfe {
        /* access modifiers changed from: private */
        public static final ProtoEpisodeCollectionState h;
        private static volatile fll<ProtoEpisodeCollectionState> i;
        public boolean d;
        public boolean e;
        public boolean f;
        private int g;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoEpisodeCollectionState, a> implements jfe {
            private a() {
                super(ProtoEpisodeCollectionState.h);
            }

            /* synthetic */ a(byte b) {
                this();
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

        static {
            ProtoEpisodeCollectionState protoEpisodeCollectionState = new ProtoEpisodeCollectionState();
            h = protoEpisodeCollectionState;
            protoEpisodeCollectionState.e();
        }

        private ProtoEpisodeCollectionState() {
        }

        static /* synthetic */ void a(ProtoEpisodeCollectionState protoEpisodeCollectionState, boolean z) {
            protoEpisodeCollectionState.g |= 1;
            protoEpisodeCollectionState.d = z;
        }

        static /* synthetic */ void b(ProtoEpisodeCollectionState protoEpisodeCollectionState, boolean z) {
            protoEpisodeCollectionState.g |= 2;
            protoEpisodeCollectionState.e = z;
        }

        public static a k() {
            return (a) h.h();
        }

        public static ProtoEpisodeCollectionState l() {
            return h;
        }

        private boolean n() {
            return (this.g & 1) == 1;
        }

        private boolean o() {
            if ((this.g & 2) != 2) {
                return false;
            }
            int i2 = 2 >> 1;
            return true;
        }

        private boolean p() {
            return (this.g & 4) == 4;
        }

        public static fll<ProtoEpisodeCollectionState> parser() {
            return h.c();
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z;
            boolean z2 = false;
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
                    fkw fkw = (fkw) obj;
                    while (!z2) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.g |= 1;
                                    this.d = fkw.b();
                                } else if (a2 == 16) {
                                    this.g |= 2;
                                    this.e = fkw.b();
                                } else if (a2 == 24) {
                                    this.g |= 4;
                                    this.f = fkw.b();
                                } else if (!a(a2, fkw)) {
                                }
                            }
                            z2 = true;
                        } catch (InvalidProtocolBufferException e2) {
                            e2.unfinishedMessage = this;
                            throw new RuntimeException(e2);
                        } catch (IOException e3) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                            invalidProtocolBufferException.unfinishedMessage = this;
                            throw new RuntimeException(invalidProtocolBufferException);
                        } finally {
                        }
                    }
                    break;
                case GET_DEFAULT_INSTANCE:
                    break;
                case GET_PARSER:
                    if (i == null) {
                        synchronized (ProtoEpisodeCollectionState.class) {
                            try {
                                if (i == null) {
                                    i = new b(h);
                                }
                            } catch (Throwable th) {
                                throw th;
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
    }

    public static final class ProtoEpisodeOfflineState extends GeneratedMessageLite<ProtoEpisodeOfflineState, a> implements jff {
        /* access modifiers changed from: private */
        public static final ProtoEpisodeOfflineState g;
        private static volatile fll<ProtoEpisodeOfflineState> h;
        public String d = "";
        public int e;
        private int f;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoEpisodeOfflineState, a> implements jff {
            private a() {
                super(ProtoEpisodeOfflineState.g);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ProtoEpisodeOfflineState protoEpisodeOfflineState = new ProtoEpisodeOfflineState();
            g = protoEpisodeOfflineState;
            protoEpisodeOfflineState.e();
        }

        private ProtoEpisodeOfflineState() {
        }

        public static ProtoEpisodeOfflineState k() {
            return g;
        }

        private boolean m() {
            return (this.f & 1) == 1;
        }

        private boolean n() {
            return (this.f & 2) == 2;
        }

        public static fll<ProtoEpisodeOfflineState> parser() {
            return g.c();
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            char c;
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
                    fkw fkw = (fkw) obj;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    String c2 = fkw.c();
                                    this.f |= 1;
                                    this.d = c2;
                                } else if (a2 == 16) {
                                    this.f |= 2;
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
                        } finally {
                        }
                    }
                    break;
                case GET_DEFAULT_INSTANCE:
                    break;
                case GET_PARSER:
                    if (h == null) {
                        Class<ProtoEpisodeOfflineState> cls = ProtoEpisodeOfflineState.class;
                        synchronized (ProtoEpisodeOfflineState.class) {
                            try {
                                if (h == null) {
                                    h = new b(g);
                                }
                            } catch (Throwable th) {
                                throw th;
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
            boolean z = true;
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
    }

    public static final class ProtoEpisodePlayState extends GeneratedMessageLite<ProtoEpisodePlayState, a> implements jfg {
        /* access modifiers changed from: private */
        public static final ProtoEpisodePlayState i;
        private static volatile fll<ProtoEpisodePlayState> j;
        public int d;
        public boolean e;
        public boolean f;
        public long g;
        private int h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoEpisodePlayState, a> implements jfg {
            private a() {
                super(ProtoEpisodePlayState.i);
            }

            /* synthetic */ a(byte b) {
                this();
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

        static {
            ProtoEpisodePlayState protoEpisodePlayState = new ProtoEpisodePlayState();
            i = protoEpisodePlayState;
            protoEpisodePlayState.e();
        }

        private ProtoEpisodePlayState() {
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

        public static a l() {
            return (a) i.h();
        }

        public static ProtoEpisodePlayState m() {
            return i;
        }

        private boolean o() {
            return (this.h & 2) == 2;
        }

        private boolean p() {
            return (this.h & 4) == 4;
        }

        public static fll<ProtoEpisodePlayState> parser() {
            return i.c();
        }

        private boolean q() {
            return (this.h & 8) == 8;
        }

        /* JADX INFO: finally extract failed */
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
                    f fVar2 = fVar;
                    this.g = fVar.a(q(), this.g, protoEpisodePlayState.q(), protoEpisodePlayState.g);
                    if (fVar == e.a) {
                        this.h |= protoEpisodePlayState.h;
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
                                    this.d = fkw.g();
                                } else if (a2 == 16) {
                                    this.h |= 2;
                                    this.e = fkw.b();
                                } else if (a2 == 24) {
                                    this.h |= 4;
                                    this.f = fkw.b();
                                } else if (a2 == 32) {
                                    this.h |= 8;
                                    this.g = fkw.h();
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
                        Class<ProtoEpisodePlayState> cls = ProtoEpisodePlayState.class;
                        synchronized (ProtoEpisodePlayState.class) {
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
                boolean z = true & true;
                i3 += CodedOutputStream.b(3, this.f);
            }
            if ((this.h & 8) == 8) {
                i3 += CodedOutputStream.d(4, this.g);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final boolean k() {
            return (this.h & 1) == 1;
        }
    }
}
