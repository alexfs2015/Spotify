package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PushNotificationPayloadErrorV1 extends GeneratedMessageLite<PushNotificationPayloadErrorV1, a> implements grj {
    /* access modifiers changed from: private */
    public static final PushNotificationPayloadErrorV1 i;
    private static volatile fll<PushNotificationPayloadErrorV1> j;
    private int d;
    private String e;
    private String f;
    private long g;
    private String h;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<PushNotificationPayloadErrorV1, a> implements grj {
        private a() {
            super(PushNotificationPayloadErrorV1.i);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(long j) {
            b();
            PushNotificationPayloadErrorV1.a((PushNotificationPayloadErrorV1) this.a, j);
            return this;
        }

        public final a a(String str) {
            b();
            PushNotificationPayloadErrorV1.a((PushNotificationPayloadErrorV1) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            PushNotificationPayloadErrorV1.b((PushNotificationPayloadErrorV1) this.a, str);
            return this;
        }

        public final a c(String str) {
            b();
            PushNotificationPayloadErrorV1.c((PushNotificationPayloadErrorV1) this.a, str);
            return this;
        }
    }

    static {
        PushNotificationPayloadErrorV1 pushNotificationPayloadErrorV1 = new PushNotificationPayloadErrorV1();
        i = pushNotificationPayloadErrorV1;
        pushNotificationPayloadErrorV1.e();
    }

    private PushNotificationPayloadErrorV1() {
        String str = "";
        this.e = str;
        this.f = str;
        this.h = str;
    }

    static /* synthetic */ void a(PushNotificationPayloadErrorV1 pushNotificationPayloadErrorV1, long j2) {
        pushNotificationPayloadErrorV1.d |= 4;
        pushNotificationPayloadErrorV1.g = j2;
    }

    static /* synthetic */ void a(PushNotificationPayloadErrorV1 pushNotificationPayloadErrorV1, String str) {
        if (str != null) {
            pushNotificationPayloadErrorV1.d |= 1;
            pushNotificationPayloadErrorV1.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(PushNotificationPayloadErrorV1 pushNotificationPayloadErrorV1, String str) {
        if (str != null) {
            pushNotificationPayloadErrorV1.d |= 2;
            pushNotificationPayloadErrorV1.f = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void c(PushNotificationPayloadErrorV1 pushNotificationPayloadErrorV1, String str) {
        if (str != null) {
            pushNotificationPayloadErrorV1.d |= 8;
            pushNotificationPayloadErrorV1.h = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a k() {
        return (a) i.h();
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    private boolean n() {
        return (this.d & 2) == 2;
    }

    private boolean o() {
        return (this.d & 4) == 4;
    }

    private boolean p() {
        return (this.d & 8) == 8;
    }

    public static fll<PushNotificationPayloadErrorV1> parser() {
        return i.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new PushNotificationPayloadErrorV1();
            case IS_INITIALIZED:
                return i;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                PushNotificationPayloadErrorV1 pushNotificationPayloadErrorV1 = (PushNotificationPayloadErrorV1) obj2;
                this.e = fVar.a(m(), this.e, pushNotificationPayloadErrorV1.m(), pushNotificationPayloadErrorV1.e);
                this.f = fVar.a(n(), this.f, pushNotificationPayloadErrorV1.n(), pushNotificationPayloadErrorV1.f);
                this.g = fVar.a(o(), this.g, pushNotificationPayloadErrorV1.o(), pushNotificationPayloadErrorV1.g);
                this.h = fVar.a(p(), this.h, pushNotificationPayloadErrorV1.p(), pushNotificationPayloadErrorV1.h);
                if (fVar == e.a) {
                    this.d |= pushNotificationPayloadErrorV1.d;
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
                                this.d |= 1;
                                this.e = c;
                            } else if (a2 == 18) {
                                String c2 = fkw.c();
                                this.d |= 2;
                                this.f = c2;
                            } else if (a2 == 24) {
                                this.d |= 4;
                                this.g = fkw.h();
                            } else if (a2 == 34) {
                                String c3 = fkw.c();
                                this.d |= 8;
                                this.h = c3;
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
                    }
                }
                break;
            case GET_DEFAULT_INSTANCE:
                break;
            case GET_PARSER:
                if (j == null) {
                    synchronized (PushNotificationPayloadErrorV1.class) {
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
        if ((this.d & 1) == 1) {
            codedOutputStream.a(1, this.e);
        }
        if ((this.d & 2) == 2) {
            codedOutputStream.a(2, this.f);
        }
        if ((this.d & 4) == 4) {
            codedOutputStream.a(3, this.g);
        }
        if ((this.d & 8) == 8) {
            codedOutputStream.a(4, this.h);
        }
        this.b.a(codedOutputStream);
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.d & 1) == 1) {
            i3 = 0 + CodedOutputStream.b(1, this.e);
        }
        if ((this.d & 2) == 2) {
            i3 += CodedOutputStream.b(2, this.f);
        }
        if ((this.d & 4) == 4) {
            i3 += CodedOutputStream.c(3, this.g);
        }
        if ((this.d & 8) == 8) {
            i3 += CodedOutputStream.b(4, this.h);
        }
        int d2 = i3 + this.b.d();
        this.c = d2;
        return d2;
    }
}
