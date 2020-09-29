package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class CoreIntegrationTestEvent extends GeneratedMessageLite<CoreIntegrationTestEvent, a> implements gpk {
    /* access modifiers changed from: private */
    public static final CoreIntegrationTestEvent g;
    private static volatile fkr<CoreIntegrationTestEvent> h;
    private int d;
    private String e = "";
    private e<String> f = fks.d();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<CoreIntegrationTestEvent, a> implements gpk {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(CoreIntegrationTestEvent.g);
        }

        public final a a(String str) {
            b();
            CoreIntegrationTestEvent.a((CoreIntegrationTestEvent) this.a, str);
            return this;
        }

        public final a a(Iterable<String> iterable) {
            b();
            CoreIntegrationTestEvent.a((CoreIntegrationTestEvent) this.a, (Iterable) iterable);
            return this;
        }
    }

    private CoreIntegrationTestEvent() {
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if ((this.d & 1) == 1) {
            codedOutputStream.a(1, this.e);
        }
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.a(2, (String) this.f.get(i));
        }
        this.b.a(codedOutputStream);
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int b = (this.d & 1) == 1 ? CodedOutputStream.b(1, this.e) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            i2 += CodedOutputStream.b((String) this.f.get(i3));
        }
        int size = b + i2 + (this.f.size() * 1) + this.b.d();
        this.c = size;
        return size;
    }

    public static a k() {
        return (a) g.h();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new CoreIntegrationTestEvent();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                this.f.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                CoreIntegrationTestEvent coreIntegrationTestEvent = (CoreIntegrationTestEvent) obj2;
                this.e = fVar.a(m(), this.e, coreIntegrationTestEvent.m(), coreIntegrationTestEvent.e);
                this.f = fVar.a(this.f, coreIntegrationTestEvent.f);
                if (fVar == e.a) {
                    this.d |= coreIntegrationTestEvent.d;
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
                                this.d |= 1;
                                this.e = c;
                            } else if (a2 == 18) {
                                String c2 = fkc.c();
                                if (!this.f.a()) {
                                    this.f = GeneratedMessageLite.a(this.f);
                                }
                                this.f.add(c2);
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
                if (h == null) {
                    synchronized (CoreIntegrationTestEvent.class) {
                        if (h == null) {
                            h = new b(g);
                        }
                    }
                }
                return h;
            default:
                throw new UnsupportedOperationException();
        }
        return g;
    }

    static {
        CoreIntegrationTestEvent coreIntegrationTestEvent = new CoreIntegrationTestEvent();
        g = coreIntegrationTestEvent;
        coreIntegrationTestEvent.e();
    }

    public static fkr<CoreIntegrationTestEvent> parser() {
        return g.c();
    }

    static /* synthetic */ void a(CoreIntegrationTestEvent coreIntegrationTestEvent, String str) {
        if (str != null) {
            coreIntegrationTestEvent.d |= 1;
            coreIntegrationTestEvent.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void a(CoreIntegrationTestEvent coreIntegrationTestEvent, Iterable iterable) {
        if (!coreIntegrationTestEvent.f.a()) {
            coreIntegrationTestEvent.f = GeneratedMessageLite.a(coreIntegrationTestEvent.f);
        }
        fjx.a(iterable, coreIntegrationTestEvent.f);
    }
}
