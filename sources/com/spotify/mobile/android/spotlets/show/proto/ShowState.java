package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class ShowState {

    public static final class ProtoShowCollectionState extends GeneratedMessageLite<ProtoShowCollectionState, a> implements jfw {
        /* access modifiers changed from: private */
        public static final ProtoShowCollectionState f;
        private static volatile fll<ProtoShowCollectionState> g;
        public boolean d;
        private int e;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoShowCollectionState, a> implements jfw {
            private a() {
                super(ProtoShowCollectionState.f);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(boolean z) {
                b();
                ProtoShowCollectionState.a((ProtoShowCollectionState) this.a, z);
                return this;
            }
        }

        static {
            ProtoShowCollectionState protoShowCollectionState = new ProtoShowCollectionState();
            f = protoShowCollectionState;
            protoShowCollectionState.e();
        }

        private ProtoShowCollectionState() {
        }

        static /* synthetic */ void a(ProtoShowCollectionState protoShowCollectionState, boolean z) {
            protoShowCollectionState.e |= 1;
            protoShowCollectionState.d = z;
        }

        public static a k() {
            return (a) f.h();
        }

        public static ProtoShowCollectionState l() {
            return f;
        }

        private boolean n() {
            return (this.e & 1) == 1;
        }

        public static fll<ProtoShowCollectionState> parser() {
            return f.c();
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z;
            boolean z2 = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoShowCollectionState();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoShowCollectionState protoShowCollectionState = (ProtoShowCollectionState) obj2;
                    this.d = fVar.a(n(), this.d, protoShowCollectionState.n(), protoShowCollectionState.d);
                    if (fVar == e.a) {
                        this.e |= protoShowCollectionState.e;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkw fkw = (fkw) obj;
                    while (!z2) {
                        try {
                            int a2 = fkw.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.e |= 1;
                                    this.d = fkw.b();
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
                    if (g == null) {
                        Class<ProtoShowCollectionState> cls = ProtoShowCollectionState.class;
                        synchronized (ProtoShowCollectionState.class) {
                            try {
                                if (g == null) {
                                    g = new b(f);
                                }
                            } catch (Throwable th) {
                                throw th;
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

    public static final class ProtoShowPlayState extends GeneratedMessageLite<ProtoShowPlayState, a> implements jfx {
        /* access modifiers changed from: private */
        public static final ProtoShowPlayState f;
        private static volatile fll<ProtoShowPlayState> g;
        public String d = "";
        private int e;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoShowPlayState, a> implements jfx {
            private a() {
                super(ProtoShowPlayState.f);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(String str) {
                b();
                ProtoShowPlayState.a((ProtoShowPlayState) this.a, str);
                return this;
            }
        }

        static {
            ProtoShowPlayState protoShowPlayState = new ProtoShowPlayState();
            f = protoShowPlayState;
            protoShowPlayState.e();
        }

        private ProtoShowPlayState() {
        }

        static /* synthetic */ void a(ProtoShowPlayState protoShowPlayState, String str) {
            if (str != null) {
                protoShowPlayState.e |= 1;
                protoShowPlayState.d = str;
                return;
            }
            throw new NullPointerException();
        }

        public static a k() {
            return (a) f.h();
        }

        public static ProtoShowPlayState l() {
            return f;
        }

        private boolean n() {
            return (this.e & 1) == 1;
        }

        public static fll<ProtoShowPlayState> parser() {
            return f.c();
        }

        /* JADX INFO: finally extract failed */
        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProtoShowPlayState();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoShowPlayState protoShowPlayState = (ProtoShowPlayState) obj2;
                    this.d = fVar.a(n(), this.d, protoShowPlayState.n(), protoShowPlayState.d);
                    if (fVar == e.a) {
                        this.e |= protoShowPlayState.e;
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
                        } finally {
                        }
                    }
                    break;
                case GET_DEFAULT_INSTANCE:
                    break;
                case GET_PARSER:
                    if (g == null) {
                        synchronized (ProtoShowPlayState.class) {
                            try {
                                if (g == null) {
                                    g = new b(f);
                                }
                            } catch (Throwable th) {
                                throw th;
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
}
