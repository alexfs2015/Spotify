package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PushNotificationInteractionErrorV1 extends GeneratedMessageLite<PushNotificationInteractionErrorV1, a> implements grh {
    /* access modifiers changed from: private */
    public static final PushNotificationInteractionErrorV1 k;
    private static volatile fll<PushNotificationInteractionErrorV1> l;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private long i;
    private String j;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<PushNotificationInteractionErrorV1, a> implements grh {
        private a() {
            super(PushNotificationInteractionErrorV1.k);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(long j) {
            b();
            PushNotificationInteractionErrorV1.a((PushNotificationInteractionErrorV1) this.a, j);
            return this;
        }

        public final a a(String str) {
            b();
            PushNotificationInteractionErrorV1.a((PushNotificationInteractionErrorV1) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            PushNotificationInteractionErrorV1.b((PushNotificationInteractionErrorV1) this.a, str);
            return this;
        }

        public final a c(String str) {
            b();
            PushNotificationInteractionErrorV1.c((PushNotificationInteractionErrorV1) this.a, str);
            return this;
        }

        public final a d(String str) {
            b();
            PushNotificationInteractionErrorV1.d((PushNotificationInteractionErrorV1) this.a, str);
            return this;
        }

        public final a e(String str) {
            b();
            PushNotificationInteractionErrorV1.e((PushNotificationInteractionErrorV1) this.a, str);
            return this;
        }
    }

    static {
        PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1 = new PushNotificationInteractionErrorV1();
        k = pushNotificationInteractionErrorV1;
        pushNotificationInteractionErrorV1.e();
    }

    private PushNotificationInteractionErrorV1() {
        String str = "";
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.j = str;
    }

    static /* synthetic */ void a(PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1, long j2) {
        pushNotificationInteractionErrorV1.d |= 16;
        pushNotificationInteractionErrorV1.i = j2;
    }

    static /* synthetic */ void a(PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1, String str) {
        if (str != null) {
            pushNotificationInteractionErrorV1.d |= 1;
            pushNotificationInteractionErrorV1.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1, String str) {
        if (str != null) {
            pushNotificationInteractionErrorV1.d |= 2;
            pushNotificationInteractionErrorV1.f = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void c(PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1, String str) {
        if (str != null) {
            pushNotificationInteractionErrorV1.d |= 4;
            pushNotificationInteractionErrorV1.g = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void d(PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1, String str) {
        if (str != null) {
            pushNotificationInteractionErrorV1.d |= 8;
            pushNotificationInteractionErrorV1.h = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void e(PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1, String str) {
        if (str != null) {
            pushNotificationInteractionErrorV1.d |= 32;
            pushNotificationInteractionErrorV1.j = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a k() {
        return (a) k.h();
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

    public static fll<PushNotificationInteractionErrorV1> parser() {
        return k.c();
    }

    private boolean q() {
        return (this.d & 16) == 16;
    }

    private boolean r() {
        return (this.d & 32) == 32;
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new PushNotificationInteractionErrorV1();
            case IS_INITIALIZED:
                return k;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1 = (PushNotificationInteractionErrorV1) obj2;
                this.e = fVar.a(m(), this.e, pushNotificationInteractionErrorV1.m(), pushNotificationInteractionErrorV1.e);
                this.f = fVar.a(n(), this.f, pushNotificationInteractionErrorV1.n(), pushNotificationInteractionErrorV1.f);
                this.g = fVar.a(o(), this.g, pushNotificationInteractionErrorV1.o(), pushNotificationInteractionErrorV1.g);
                this.h = fVar.a(p(), this.h, pushNotificationInteractionErrorV1.p(), pushNotificationInteractionErrorV1.h);
                this.i = fVar.a(q(), this.i, pushNotificationInteractionErrorV1.q(), pushNotificationInteractionErrorV1.i);
                this.j = fVar.a(r(), this.j, pushNotificationInteractionErrorV1.r(), pushNotificationInteractionErrorV1.j);
                if (fVar == e.a) {
                    this.d |= pushNotificationInteractionErrorV1.d;
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
                            } else if (a2 == 50) {
                                String c5 = fkw.c();
                                this.d |= 32;
                                this.j = c5;
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
                if (l == null) {
                    synchronized (PushNotificationInteractionErrorV1.class) {
                        if (l == null) {
                            l = new b(k);
                        }
                    }
                }
                return l;
            default:
                throw new UnsupportedOperationException();
        }
        return k;
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
        if ((this.d & 32) == 32) {
            codedOutputStream.a(6, this.j);
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
        if ((this.d & 32) == 32) {
            i3 += CodedOutputStream.b(6, this.j);
        }
        int d2 = i3 + this.b.d();
        this.c = d2;
        return d2;
    }
}
