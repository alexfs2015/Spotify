package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PushNotificationsReceivedV1 extends GeneratedMessageLite<PushNotificationsReceivedV1, a> implements grl {
    /* access modifiers changed from: private */
    public static final PushNotificationsReceivedV1 h;
    private static volatile fll<PushNotificationsReceivedV1> i;
    private int d;
    private String e;
    private String f;
    private long g;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<PushNotificationsReceivedV1, a> implements grl {
        private a() {
            super(PushNotificationsReceivedV1.h);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(long j) {
            b();
            PushNotificationsReceivedV1.a((PushNotificationsReceivedV1) this.a, j);
            return this;
        }

        public final a a(String str) {
            b();
            PushNotificationsReceivedV1.a((PushNotificationsReceivedV1) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            PushNotificationsReceivedV1.b((PushNotificationsReceivedV1) this.a, str);
            return this;
        }
    }

    static {
        PushNotificationsReceivedV1 pushNotificationsReceivedV1 = new PushNotificationsReceivedV1();
        h = pushNotificationsReceivedV1;
        pushNotificationsReceivedV1.e();
    }

    private PushNotificationsReceivedV1() {
        String str = "";
        this.e = str;
        this.f = str;
    }

    static /* synthetic */ void a(PushNotificationsReceivedV1 pushNotificationsReceivedV1, long j) {
        pushNotificationsReceivedV1.d |= 4;
        pushNotificationsReceivedV1.g = j;
    }

    static /* synthetic */ void a(PushNotificationsReceivedV1 pushNotificationsReceivedV1, String str) {
        if (str != null) {
            pushNotificationsReceivedV1.d |= 1;
            pushNotificationsReceivedV1.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(PushNotificationsReceivedV1 pushNotificationsReceivedV1, String str) {
        if (str != null) {
            pushNotificationsReceivedV1.d |= 2;
            pushNotificationsReceivedV1.f = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a k() {
        return (a) h.h();
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

    public static fll<PushNotificationsReceivedV1> parser() {
        return h.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new PushNotificationsReceivedV1();
            case IS_INITIALIZED:
                return h;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                PushNotificationsReceivedV1 pushNotificationsReceivedV1 = (PushNotificationsReceivedV1) obj2;
                this.e = fVar.a(m(), this.e, pushNotificationsReceivedV1.m(), pushNotificationsReceivedV1.e);
                this.f = fVar.a(n(), this.f, pushNotificationsReceivedV1.n(), pushNotificationsReceivedV1.f);
                this.g = fVar.a(o(), this.g, pushNotificationsReceivedV1.o(), pushNotificationsReceivedV1.g);
                if (fVar == e.a) {
                    this.d |= pushNotificationsReceivedV1.d;
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
                if (i == null) {
                    synchronized (PushNotificationsReceivedV1.class) {
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
        int d2 = i3 + this.b.d();
        this.c = d2;
        return d2;
    }
}
