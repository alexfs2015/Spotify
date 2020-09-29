package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class ImageGroup {

    public static final class ProtoImageGroup extends GeneratedMessageLite<ProtoImageGroup, a> implements jfh {
        /* access modifiers changed from: private */
        public static final ProtoImageGroup i;
        private static volatile fll<ProtoImageGroup> j;
        public String d;
        public String e;
        public String f;
        public String g;
        private int h;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ProtoImageGroup, a> implements jfh {
            private a() {
                super(ProtoImageGroup.i);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(String str) {
                b();
                ProtoImageGroup.a((ProtoImageGroup) this.a, str);
                return this;
            }

            public final a b(String str) {
                b();
                ProtoImageGroup.b((ProtoImageGroup) this.a, str);
                return this;
            }

            public final a c(String str) {
                b();
                ProtoImageGroup.c((ProtoImageGroup) this.a, str);
                return this;
            }

            public final a d(String str) {
                b();
                ProtoImageGroup.d((ProtoImageGroup) this.a, str);
                return this;
            }
        }

        static {
            ProtoImageGroup protoImageGroup = new ProtoImageGroup();
            i = protoImageGroup;
            protoImageGroup.e();
        }

        private ProtoImageGroup() {
            String str = "";
            this.d = str;
            this.e = str;
            this.f = str;
            this.g = str;
        }

        static /* synthetic */ void a(ProtoImageGroup protoImageGroup, String str) {
            if (str != null) {
                protoImageGroup.h |= 1;
                protoImageGroup.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ProtoImageGroup protoImageGroup, String str) {
            if (str != null) {
                protoImageGroup.h |= 2;
                protoImageGroup.e = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void c(ProtoImageGroup protoImageGroup, String str) {
            if (str != null) {
                protoImageGroup.h |= 4;
                protoImageGroup.f = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void d(ProtoImageGroup protoImageGroup, String str) {
            if (str != null) {
                protoImageGroup.h |= 8;
                protoImageGroup.g = str;
                return;
            }
            throw new NullPointerException();
        }

        public static a k() {
            return (a) i.h();
        }

        public static ProtoImageGroup l() {
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

        public static fll<ProtoImageGroup> parser() {
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
                    return new ProtoImageGroup();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ProtoImageGroup protoImageGroup = (ProtoImageGroup) obj2;
                    this.d = fVar.a(n(), this.d, protoImageGroup.n(), protoImageGroup.d);
                    this.e = fVar.a(o(), this.e, protoImageGroup.o(), protoImageGroup.e);
                    this.f = fVar.a(p(), this.f, protoImageGroup.p(), protoImageGroup.f);
                    this.g = fVar.a(q(), this.g, protoImageGroup.q(), protoImageGroup.g);
                    if (fVar == e.a) {
                        this.h |= protoImageGroup.h;
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
                                    this.d = c;
                                } else if (a2 == 18) {
                                    String c2 = fkw.c();
                                    this.h |= 2;
                                    this.e = c2;
                                } else if (a2 == 26) {
                                    String c3 = fkw.c();
                                    this.h |= 4;
                                    this.f = c3;
                                } else if (a2 == 34) {
                                    String c4 = fkw.c();
                                    this.h |= 8;
                                    this.g = c4;
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
                        Class<ProtoImageGroup> cls = ProtoImageGroup.class;
                        synchronized (ProtoImageGroup.class) {
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
                boolean z = true | true;
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
}
