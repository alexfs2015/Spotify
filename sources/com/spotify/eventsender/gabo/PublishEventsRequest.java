package com.spotify.eventsender.gabo;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PublishEventsRequest extends GeneratedMessageLite<PublishEventsRequest, a> implements gfz {
    /* access modifiers changed from: private */
    public static final PublishEventsRequest g;
    private static volatile fkr<PublishEventsRequest> h;
    private int d;
    private e<EventEnvelope> e = fks.d();
    private boolean f;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<PublishEventsRequest, a> implements gfz {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(PublishEventsRequest.g);
        }

        public final a a(Iterable<? extends EventEnvelope> iterable) {
            b();
            PublishEventsRequest.a((PublishEventsRequest) this.a, iterable);
            return this;
        }
    }

    private PublishEventsRequest() {
    }

    public final void a(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.e.size(); i++) {
            codedOutputStream.a(1, (fko) this.e.get(i));
        }
        boolean z = this.f;
        if (z) {
            codedOutputStream.a(2, z);
        }
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            i2 += CodedOutputStream.b(1, (fko) this.e.get(i3));
        }
        boolean z = this.f;
        if (z) {
            i2 += CodedOutputStream.b(2, z);
        }
        this.c = i2;
        return i2;
    }

    public static a k() {
        return (a) g.h();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new PublishEventsRequest();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                this.e.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                PublishEventsRequest publishEventsRequest = (PublishEventsRequest) obj2;
                this.e = fVar.a(this.e, publishEventsRequest.e);
                boolean z2 = this.f;
                boolean z3 = publishEventsRequest.f;
                this.f = fVar.a(z2, z2, z3, z3);
                if (fVar == e.a) {
                    this.d |= publishEventsRequest.d;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                fke fke = (fke) obj2;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                if (!this.e.a()) {
                                    this.e = GeneratedMessageLite.a(this.e);
                                }
                                this.e.add(fkc.a(EventEnvelope.parser(), fke));
                            } else if (a2 == 16) {
                                this.f = fkc.b();
                            } else if (!fkc.b(a2)) {
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
                    synchronized (PublishEventsRequest.class) {
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
        PublishEventsRequest publishEventsRequest = new PublishEventsRequest();
        g = publishEventsRequest;
        publishEventsRequest.e();
    }

    public static fkr<PublishEventsRequest> parser() {
        return g.c();
    }

    static /* synthetic */ void a(PublishEventsRequest publishEventsRequest, Iterable iterable) {
        if (!publishEventsRequest.e.a()) {
            publishEventsRequest.e = GeneratedMessageLite.a(publishEventsRequest.e);
        }
        fjx.a(iterable, publishEventsRequest.e);
    }
}
