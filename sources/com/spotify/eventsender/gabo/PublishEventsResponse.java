package com.spotify.eventsender.gabo;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PublishEventsResponse extends GeneratedMessageLite<PublishEventsResponse, a> implements ggb {
    /* access modifiers changed from: private */
    public static final PublishEventsResponse e;
    private static volatile fkr<PublishEventsResponse> f;
    public e<EventError> d = fks.d();

    public static final class EventError extends GeneratedMessageLite<EventError, a> implements gga {
        /* access modifiers changed from: private */
        public static final EventError g;
        private static volatile fkr<EventError> h;
        public int d;
        public boolean e;
        private int f;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<EventError, a> implements gga {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(EventError.g);
            }
        }

        private EventError() {
        }

        public final void a(CodedOutputStream codedOutputStream) {
            int i = this.d;
            if (i != 0) {
                codedOutputStream.b(1, i);
            }
            boolean z = this.e;
            if (z) {
                codedOutputStream.a(2, z);
            }
            int i2 = this.f;
            if (i2 != 0) {
                codedOutputStream.b(3, i2);
            }
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = this.d;
            int i3 = 0;
            if (i2 != 0) {
                i3 = 0 + CodedOutputStream.f(1, i2);
            }
            boolean z = this.e;
            if (z) {
                i3 += CodedOutputStream.b(2, z);
            }
            int i4 = this.f;
            if (i4 != 0) {
                i3 += CodedOutputStream.f(3, i4);
            }
            this.c = i3;
            return i3;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = true;
            boolean z2 = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new EventError();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    EventError eventError = (EventError) obj2;
                    this.d = fVar.a(this.d != 0, this.d, eventError.d != 0, eventError.d);
                    boolean z3 = this.e;
                    boolean z4 = eventError.e;
                    this.e = fVar.a(z3, z3, z4, z4);
                    boolean z5 = this.f != 0;
                    int i = this.f;
                    if (eventError.f == 0) {
                        z = false;
                    }
                    this.f = fVar.a(z5, i, z, eventError.f);
                    e eVar = e.a;
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z2) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.d = fkc.g();
                                } else if (a2 == 16) {
                                    this.e = fkc.b();
                                } else if (a2 == 24) {
                                    this.f = fkc.g();
                                } else if (!fkc.b(a2)) {
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
                        }
                    }
                    break;
                case GET_DEFAULT_INSTANCE:
                    break;
                case GET_PARSER:
                    if (h == null) {
                        synchronized (EventError.class) {
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
            EventError eventError = new EventError();
            g = eventError;
            eventError.e();
        }

        public static fkr<EventError> parser() {
            return g.c();
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<PublishEventsResponse, a> implements ggb {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(PublishEventsResponse.e);
        }
    }

    private PublishEventsResponse() {
    }

    public final void a(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.d.size(); i++) {
            codedOutputStream.a(1, (fko) this.d.get(i));
        }
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.d.size(); i3++) {
            i2 += CodedOutputStream.b(1, (fko) this.d.get(i3));
        }
        this.c = i2;
        return i2;
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new PublishEventsResponse();
            case IS_INITIALIZED:
                return e;
            case MAKE_IMMUTABLE:
                this.d.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                this.d = ((f) obj).a(this.d, ((PublishEventsResponse) obj2).d);
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                fke fke = (fke) obj2;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                if (!this.d.a()) {
                                    this.d = GeneratedMessageLite.a(this.d);
                                }
                                this.d.add(fkc.a(EventError.parser(), fke));
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
                if (f == null) {
                    synchronized (PublishEventsResponse.class) {
                        if (f == null) {
                            f = new b(e);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return e;
    }

    static {
        PublishEventsResponse publishEventsResponse = new PublishEventsResponse();
        e = publishEventsResponse;
        publishEventsResponse.e();
    }

    public static fkr<PublishEventsResponse> parser() {
        return e.c();
    }
}
