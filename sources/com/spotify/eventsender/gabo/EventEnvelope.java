package com.spotify.eventsender.gabo;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class EventEnvelope extends GeneratedMessageLite<EventEnvelope, a> implements gfv {
    /* access modifiers changed from: private */
    public static final EventEnvelope i;
    private static volatile fkr<EventEnvelope> j;
    private int d;
    private String e = "";
    private e<EventFragment> f = fks.d();
    private ByteString g = ByteString.a;
    /* access modifiers changed from: private */
    public long h;

    public static final class EventFragment extends GeneratedMessageLite<EventFragment, a> implements gfu {
        /* access modifiers changed from: private */
        public static final EventFragment f;
        private static volatile fkr<EventFragment> g;
        private String d = "";
        private ByteString e = ByteString.a;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<EventFragment, a> implements gfu {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(EventFragment.f);
            }

            public final a a(String str) {
                b();
                EventFragment.a((EventFragment) this.a, str);
                return this;
            }

            public final a a(ByteString byteString) {
                b();
                EventFragment.a((EventFragment) this.a, byteString);
                return this;
            }
        }

        private EventFragment() {
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if (!this.d.isEmpty()) {
                codedOutputStream.a(1, this.d);
            }
            if (!this.e.c()) {
                codedOutputStream.a(2, this.e);
            }
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.d.isEmpty()) {
                i2 = 0 + CodedOutputStream.b(1, this.d);
            }
            if (!this.e.c()) {
                i2 += CodedOutputStream.b(2, this.e);
            }
            this.c = i2;
            return i2;
        }

        public static a k() {
            return (a) f.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new EventFragment();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    EventFragment eventFragment = (EventFragment) obj2;
                    this.d = fVar.a(!this.d.isEmpty(), this.d, !eventFragment.d.isEmpty(), eventFragment.d);
                    boolean z2 = this.e != ByteString.a;
                    ByteString byteString = this.e;
                    if (eventFragment.e != ByteString.a) {
                        z = true;
                    }
                    this.e = fVar.a(z2, byteString, z, eventFragment.e);
                    e eVar = e.a;
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    this.d = fkc.d();
                                } else if (a2 == 18) {
                                    this.e = fkc.e();
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
                    if (g == null) {
                        synchronized (EventFragment.class) {
                            if (g == null) {
                                g = new b(f);
                            }
                        }
                    }
                    return g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        static {
            EventFragment eventFragment = new EventFragment();
            f = eventFragment;
            eventFragment.e();
        }

        public static fkr<EventFragment> parser() {
            return f.c();
        }

        static /* synthetic */ void a(EventFragment eventFragment, String str) {
            if (str != null) {
                eventFragment.d = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(EventFragment eventFragment, ByteString byteString) {
            if (byteString != null) {
                eventFragment.e = byteString;
                return;
            }
            throw new NullPointerException();
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<EventEnvelope, a> implements gfv {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(EventEnvelope.i);
        }

        public final a a(String str) {
            b();
            EventEnvelope.a((EventEnvelope) this.a, str);
            return this;
        }

        public final a a(Iterable<? extends EventFragment> iterable) {
            b();
            EventEnvelope.a((EventEnvelope) this.a, (Iterable) iterable);
            return this;
        }

        public final a a(ByteString byteString) {
            b();
            EventEnvelope.a((EventEnvelope) this.a, byteString);
            return this;
        }

        public final a a(long j) {
            b();
            ((EventEnvelope) this.a).h = j;
            return this;
        }
    }

    private EventEnvelope() {
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.e.isEmpty()) {
            codedOutputStream.a(2, this.e);
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            codedOutputStream.a(3, (fko) this.f.get(i2));
        }
        if (!this.g.c()) {
            codedOutputStream.a(4, this.g);
        }
        long j2 = this.h;
        if (j2 != 0) {
            codedOutputStream.a(5, j2);
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int b = !this.e.isEmpty() ? CodedOutputStream.b(2, this.e) + 0 : 0;
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            b += CodedOutputStream.b(3, (fko) this.f.get(i3));
        }
        if (!this.g.c()) {
            b += CodedOutputStream.b(4, this.g);
        }
        long j2 = this.h;
        if (j2 != 0) {
            b += CodedOutputStream.c(5, j2);
        }
        this.c = b;
        return b;
    }

    public static a k() {
        return (a) i.h();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new EventEnvelope();
            case IS_INITIALIZED:
                return i;
            case MAKE_IMMUTABLE:
                this.f.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                EventEnvelope eventEnvelope = (EventEnvelope) obj2;
                this.e = fVar.a(!this.e.isEmpty(), this.e, !eventEnvelope.e.isEmpty(), eventEnvelope.e);
                this.f = fVar.a(this.f, eventEnvelope.f);
                this.g = fVar.a(this.g != ByteString.a, this.g, eventEnvelope.g != ByteString.a, eventEnvelope.g);
                this.h = fVar.a(this.h != 0, this.h, eventEnvelope.h != 0, eventEnvelope.h);
                if (fVar == e.a) {
                    this.d |= eventEnvelope.d;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                fke fke = (fke) obj2;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 18) {
                                this.e = fkc.d();
                            } else if (a2 == 26) {
                                if (!this.f.a()) {
                                    this.f = GeneratedMessageLite.a(this.f);
                                }
                                this.f.add(fkc.a(EventFragment.parser(), fke));
                            } else if (a2 == 34) {
                                this.g = fkc.e();
                            } else if (a2 == 40) {
                                this.h = fkc.h();
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
                if (j == null) {
                    synchronized (EventEnvelope.class) {
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

    static {
        EventEnvelope eventEnvelope = new EventEnvelope();
        i = eventEnvelope;
        eventEnvelope.e();
    }

    public static fkr<EventEnvelope> parser() {
        return i.c();
    }

    static /* synthetic */ void a(EventEnvelope eventEnvelope, String str) {
        if (str != null) {
            eventEnvelope.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void a(EventEnvelope eventEnvelope, Iterable iterable) {
        if (!eventEnvelope.f.a()) {
            eventEnvelope.f = GeneratedMessageLite.a(eventEnvelope.f);
        }
        fjx.a(iterable, eventEnvelope.f);
    }

    static /* synthetic */ void a(EventEnvelope eventEnvelope, ByteString byteString) {
        if (byteString != null) {
            eventEnvelope.g = byteString;
            return;
        }
        throw new NullPointerException();
    }
}
