package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat.FieldType;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public final class EventSenderStats extends GeneratedMessageLite<EventSenderStats, a> implements grd {
    /* access modifiers changed from: private */
    public static final EventSenderStats g;
    private static volatile fll<EventSenderStats> h;
    private MapFieldLite<String, Long> d = MapFieldLite.a();
    private MapFieldLite<String, Long> e = MapFieldLite.a();
    private MapFieldLite<String, Long> f = MapFieldLite.a();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<EventSenderStats, a> implements grd {
        private a() {
            super(EventSenderStats.g);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(String str, long j) {
            if (str != null) {
                b();
                EventSenderStats.a((EventSenderStats) this.a).put(str, Long.valueOf(j));
                return this;
            }
            throw new NullPointerException();
        }

        public final a b(String str, long j) {
            if (str != null) {
                b();
                EventSenderStats.b((EventSenderStats) this.a).put(str, Long.valueOf(j));
                return this;
            }
            throw new NullPointerException();
        }

        public final a c(String str, long j) {
            if (str != null) {
                b();
                EventSenderStats.c((EventSenderStats) this.a).put(str, Long.valueOf(j));
                return this;
            }
            throw new NullPointerException();
        }
    }

    static final class b {
        static final flh<String, Long> a = flh.a(FieldType.STRING, "", FieldType.INT64, Long.valueOf(0));
    }

    static final class c {
        static final flh<String, Long> a = flh.a(FieldType.STRING, "", FieldType.INT64, Long.valueOf(0));
    }

    static final class d {
        static final flh<String, Long> a = flh.a(FieldType.STRING, "", FieldType.INT64, Long.valueOf(0));
    }

    static {
        EventSenderStats eventSenderStats = new EventSenderStats();
        g = eventSenderStats;
        eventSenderStats.e();
    }

    private EventSenderStats() {
    }

    static /* synthetic */ Map a(EventSenderStats eventSenderStats) {
        if (!eventSenderStats.d.isMutable) {
            eventSenderStats.d = eventSenderStats.d.b();
        }
        return eventSenderStats.d;
    }

    static /* synthetic */ Map b(EventSenderStats eventSenderStats) {
        if (!eventSenderStats.e.isMutable) {
            eventSenderStats.e = eventSenderStats.e.b();
        }
        return eventSenderStats.e;
    }

    static /* synthetic */ Map c(EventSenderStats eventSenderStats) {
        if (!eventSenderStats.f.isMutable) {
            eventSenderStats.f = eventSenderStats.f.b();
        }
        return eventSenderStats.f;
    }

    public static a k() {
        return (a) g.h();
    }

    public static fll<EventSenderStats> parser() {
        return g.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new EventSenderStats();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                this.d.isMutable = false;
                this.e.isMutable = false;
                this.f.isMutable = false;
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                EventSenderStats eventSenderStats = (EventSenderStats) obj2;
                this.d = fVar.a(this.d, eventSenderStats.d);
                this.e = fVar.a(this.e, eventSenderStats.e);
                this.f = fVar.a(this.f, eventSenderStats.f);
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                fky fky = (fky) obj2;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                if (!this.d.isMutable) {
                                    this.d = this.d.b();
                                }
                                d.a.a(this.d, fkw, fky);
                            } else if (a2 == 18) {
                                if (!this.e.isMutable) {
                                    this.e = this.e.b();
                                }
                                b.a.a(this.e, fkw, fky);
                            } else if (a2 == 26) {
                                if (!this.f.isMutable) {
                                    this.f = this.f.b();
                                }
                                c.a.a(this.f, fkw, fky);
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
                if (h == null) {
                    synchronized (EventSenderStats.class) {
                        if (h == null) {
                            h = new com.google.protobuf.GeneratedMessageLite.b(g);
                        }
                    }
                }
                return h;
            default:
                throw new UnsupportedOperationException();
        }
        return g;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        for (Entry entry : this.d.entrySet()) {
            d.a.a(codedOutputStream, 1, entry.getKey(), entry.getValue());
        }
        for (Entry entry2 : this.e.entrySet()) {
            b.a.a(codedOutputStream, 2, entry2.getKey(), entry2.getValue());
        }
        for (Entry entry3 : this.f.entrySet()) {
            c.a.a(codedOutputStream, 3, entry3.getKey(), entry3.getValue());
        }
        this.b.a(codedOutputStream);
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (Entry entry : this.d.entrySet()) {
            i2 += d.a.a(1, entry.getKey(), entry.getValue());
        }
        for (Entry entry2 : this.e.entrySet()) {
            i2 += b.a.a(2, entry2.getKey(), entry2.getValue());
        }
        for (Entry entry3 : this.f.entrySet()) {
            i2 += c.a.a(3, entry3.getKey(), entry3.getValue());
        }
        int d2 = i2 + this.b.d();
        this.c = d2;
        return d2;
    }
}
