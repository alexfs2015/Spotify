package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PushNotificationInteractionV1 extends GeneratedMessageLite<PushNotificationInteractionV1, a> implements gri {
    /* access modifiers changed from: private */
    public static final PushNotificationInteractionV1 j;
    private static volatile fll<PushNotificationInteractionV1> k;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private long i;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<PushNotificationInteractionV1, a> implements gri {
        private a() {
            super(PushNotificationInteractionV1.j);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(long j) {
            b();
            PushNotificationInteractionV1.a((PushNotificationInteractionV1) this.a, j);
            return this;
        }

        public final a a(String str) {
            b();
            PushNotificationInteractionV1.a((PushNotificationInteractionV1) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            PushNotificationInteractionV1.b((PushNotificationInteractionV1) this.a, str);
            return this;
        }

        public final a c(String str) {
            b();
            PushNotificationInteractionV1.c((PushNotificationInteractionV1) this.a, str);
            return this;
        }

        public final a d(String str) {
            b();
            PushNotificationInteractionV1.d((PushNotificationInteractionV1) this.a, str);
            return this;
        }
    }

    static {
        PushNotificationInteractionV1 pushNotificationInteractionV1 = new PushNotificationInteractionV1();
        j = pushNotificationInteractionV1;
        pushNotificationInteractionV1.e();
    }

    private PushNotificationInteractionV1() {
        String str = "";
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
    }

    static /* synthetic */ void a(PushNotificationInteractionV1 pushNotificationInteractionV1, long j2) {
        pushNotificationInteractionV1.d |= 16;
        pushNotificationInteractionV1.i = j2;
    }

    static /* synthetic */ void a(PushNotificationInteractionV1 pushNotificationInteractionV1, String str) {
        if (str != null) {
            pushNotificationInteractionV1.d |= 1;
            pushNotificationInteractionV1.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(PushNotificationInteractionV1 pushNotificationInteractionV1, String str) {
        if (str != null) {
            pushNotificationInteractionV1.d |= 2;
            pushNotificationInteractionV1.f = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void c(PushNotificationInteractionV1 pushNotificationInteractionV1, String str) {
        if (str != null) {
            pushNotificationInteractionV1.d |= 4;
            pushNotificationInteractionV1.g = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void d(PushNotificationInteractionV1 pushNotificationInteractionV1, String str) {
        if (str != null) {
            pushNotificationInteractionV1.d |= 8;
            pushNotificationInteractionV1.h = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a k() {
        return (a) j.h();
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

    public static fll<PushNotificationInteractionV1> parser() {
        return j.c();
    }

    private boolean q() {
        return (this.d & 16) == 16;
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new PushNotificationInteractionV1();
            case IS_INITIALIZED:
                return j;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                PushNotificationInteractionV1 pushNotificationInteractionV1 = (PushNotificationInteractionV1) obj2;
                this.e = fVar.a(m(), this.e, pushNotificationInteractionV1.m(), pushNotificationInteractionV1.e);
                this.f = fVar.a(n(), this.f, pushNotificationInteractionV1.n(), pushNotificationInteractionV1.f);
                this.g = fVar.a(o(), this.g, pushNotificationInteractionV1.o(), pushNotificationInteractionV1.g);
                this.h = fVar.a(p(), this.h, pushNotificationInteractionV1.p(), pushNotificationInteractionV1.h);
                this.i = fVar.a(q(), this.i, pushNotificationInteractionV1.q(), pushNotificationInteractionV1.i);
                if (fVar == e.a) {
                    this.d |= pushNotificationInteractionV1.d;
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
                            } else if (a2 == 26) {
                                String c3 = fkw.c();
                                this.d |= 4;
                                this.g = c3;
                            } else if (a2 == 34) {
                                String c4 = fkw.c();
                                this.d |= 8;
                                this.h = c4;
                            } else if (a2 == 40) {
                                this.d |= 16;
                                this.i = fkw.h();
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
                if (k == null) {
                    synchronized (PushNotificationInteractionV1.class) {
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
        if ((this.d & 16) == 16) {
            codedOutputStream.a(5, this.i);
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
            i3 += CodedOutputStream.b(3, this.g);
        }
        if ((this.d & 8) == 8) {
            i3 += CodedOutputStream.b(4, this.h);
        }
        if ((this.d & 16) == 16) {
            i3 += CodedOutputStream.c(5, this.i);
        }
        int d2 = i3 + this.b.d();
        this.c = d2;
        return d2;
    }
}
