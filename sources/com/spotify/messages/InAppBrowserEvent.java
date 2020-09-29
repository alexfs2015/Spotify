package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class InAppBrowserEvent extends GeneratedMessageLite<InAppBrowserEvent, a> implements gre {
    /* access modifiers changed from: private */
    public static final InAppBrowserEvent h;
    private static volatile fll<InAppBrowserEvent> i;
    String d;
    private int e;
    private long f;
    private String g;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<InAppBrowserEvent, a> implements gre {
        private a() {
            super(InAppBrowserEvent.h);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(long j) {
            b();
            InAppBrowserEvent.a((InAppBrowserEvent) this.a, j);
            return this;
        }

        public final a a(String str) {
            b();
            InAppBrowserEvent.a((InAppBrowserEvent) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            InAppBrowserEvent.b((InAppBrowserEvent) this.a, str);
            return this;
        }

        public final String h() {
            return ((InAppBrowserEvent) this.a).d;
        }
    }

    static {
        InAppBrowserEvent inAppBrowserEvent = new InAppBrowserEvent();
        h = inAppBrowserEvent;
        inAppBrowserEvent.e();
    }

    private InAppBrowserEvent() {
        String str = "";
        this.d = str;
        this.g = str;
    }

    static /* synthetic */ void a(InAppBrowserEvent inAppBrowserEvent, long j) {
        inAppBrowserEvent.e |= 2;
        inAppBrowserEvent.f = j;
    }

    static /* synthetic */ void a(InAppBrowserEvent inAppBrowserEvent, String str) {
        if (str != null) {
            inAppBrowserEvent.e |= 1;
            inAppBrowserEvent.d = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(InAppBrowserEvent inAppBrowserEvent, String str) {
        if (str != null) {
            inAppBrowserEvent.e |= 4;
            inAppBrowserEvent.g = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a k() {
        return (a) h.h();
    }

    private boolean m() {
        return (this.e & 1) == 1;
    }

    private boolean n() {
        return (this.e & 2) == 2;
    }

    private boolean o() {
        return (this.e & 4) == 4;
    }

    public static fll<InAppBrowserEvent> parser() {
        return h.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new InAppBrowserEvent();
            case IS_INITIALIZED:
                return h;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                InAppBrowserEvent inAppBrowserEvent = (InAppBrowserEvent) obj2;
                this.d = fVar.a(m(), this.d, inAppBrowserEvent.m(), inAppBrowserEvent.d);
                this.f = fVar.a(n(), this.f, inAppBrowserEvent.n(), inAppBrowserEvent.f);
                this.g = fVar.a(o(), this.g, inAppBrowserEvent.o(), inAppBrowserEvent.g);
                if (fVar == e.a) {
                    this.e |= inAppBrowserEvent.e;
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
                            } else if (a2 == 16) {
                                this.e |= 2;
                                this.f = fkw.h();
                            } else if (a2 == 26) {
                                String c2 = fkw.c();
                                this.e |= 4;
                                this.g = c2;
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
                    synchronized (InAppBrowserEvent.class) {
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
        if ((this.e & 1) == 1) {
            codedOutputStream.a(1, this.d);
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.a(2, this.f);
        }
        if ((this.e & 4) == 4) {
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
        if ((this.e & 1) == 1) {
            i3 = 0 + CodedOutputStream.b(1, this.d);
        }
        if ((this.e & 2) == 2) {
            i3 += CodedOutputStream.c(2, this.f);
        }
        if ((this.e & 4) == 4) {
            i3 += CodedOutputStream.b(3, this.g);
        }
        int d2 = i3 + this.b.d();
        this.c = d2;
        return d2;
    }
}
