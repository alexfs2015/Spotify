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

public final class VoiceAdLog extends GeneratedMessageLite<VoiceAdLog, b> implements gps {
    /* access modifiers changed from: private */
    public static final VoiceAdLog k;
    private static volatile fkr<VoiceAdLog> l;
    private int d;
    private String e;
    private long f;
    private String g;
    private MapFieldLite<String, String> h = MapFieldLite.a();
    private MapFieldLite<String, String> i = MapFieldLite.a();
    private double j;

    static final class a {
        static final fkn<String, String> a;

        static {
            String str = "";
            a = fkn.a(FieldType.STRING, str, FieldType.STRING, str);
        }
    }

    public static final class b extends com.google.protobuf.GeneratedMessageLite.a<VoiceAdLog, b> implements gps {
        /* synthetic */ b(byte b) {
            this();
        }

        private b() {
            super(VoiceAdLog.k);
        }

        public final b a(String str) {
            b();
            VoiceAdLog.a((VoiceAdLog) this.a, str);
            return this;
        }

        public final b a(long j) {
            b();
            VoiceAdLog.a((VoiceAdLog) this.a, j);
            return this;
        }

        public final b b(String str) {
            b();
            VoiceAdLog.b((VoiceAdLog) this.a, str);
            return this;
        }

        public final b a(String str, String str2) {
            if (str2 != null) {
                b();
                VoiceAdLog.a((VoiceAdLog) this.a).put(str, str2);
                return this;
            }
            throw new NullPointerException();
        }

        public final b b(String str, String str2) {
            if (str2 != null) {
                b();
                VoiceAdLog.b((VoiceAdLog) this.a).put(str, str2);
                return this;
            }
            throw new NullPointerException();
        }

        public final b a(double d) {
            b();
            VoiceAdLog.a((VoiceAdLog) this.a, d);
            return this;
        }
    }

    static final class c {
        static final fkn<String, String> a;

        static {
            String str = "";
            a = fkn.a(FieldType.STRING, str, FieldType.STRING, str);
        }
    }

    private VoiceAdLog() {
        String str = "";
        this.e = str;
        this.g = str;
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
        for (Entry entry : this.h.entrySet()) {
            c.a.a(codedOutputStream, 4, entry.getKey(), entry.getValue());
        }
        for (Entry entry2 : this.i.entrySet()) {
            a.a.a(codedOutputStream, 5, entry2.getKey(), entry2.getValue());
        }
        if ((this.d & 8) == 8) {
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
            i3 += CodedOutputStream.c(2, this.f);
        }
        if ((this.d & 4) == 4) {
            i3 += CodedOutputStream.b(3, this.g);
        }
        for (Entry entry : this.h.entrySet()) {
            i3 += c.a.a(4, entry.getKey(), entry.getValue());
        }
        for (Entry entry2 : this.i.entrySet()) {
            i3 += a.a.a(5, entry2.getKey(), entry2.getValue());
        }
        if ((this.d & 8) == 8) {
            i3 += CodedOutputStream.b(6, this.j);
        }
        int d2 = i3 + this.b.d();
        this.c = d2;
        return d2;
    }

    public static b k() {
        return (b) k.h();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new VoiceAdLog();
            case IS_INITIALIZED:
                return k;
            case MAKE_IMMUTABLE:
                this.h.isMutable = false;
                this.i.isMutable = false;
                return null;
            case NEW_BUILDER:
                return new b(0);
            case VISIT:
                f fVar = (f) obj;
                VoiceAdLog voiceAdLog = (VoiceAdLog) obj2;
                this.e = fVar.a(m(), this.e, voiceAdLog.m(), voiceAdLog.e);
                this.f = fVar.a(n(), this.f, voiceAdLog.n(), voiceAdLog.f);
                this.g = fVar.a(o(), this.g, voiceAdLog.o(), voiceAdLog.g);
                this.h = fVar.a(this.h, voiceAdLog.h);
                this.i = fVar.a(this.i, voiceAdLog.i);
                this.j = fVar.a(p(), this.j, voiceAdLog.p(), voiceAdLog.j);
                if (fVar == e.a) {
                    this.d |= voiceAdLog.d;
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
                                String c2 = fkc.c();
                                this.d |= 1;
                                this.e = c2;
                            } else if (a2 == 16) {
                                this.d |= 2;
                                this.f = fkc.h();
                            } else if (a2 == 26) {
                                String c3 = fkc.c();
                                this.d |= 4;
                                this.g = c3;
                            } else if (a2 == 34) {
                                if (!this.h.isMutable) {
                                    this.h = this.h.b();
                                }
                                c.a.a(this.h, fkc, fke);
                            } else if (a2 == 42) {
                                if (!this.i.isMutable) {
                                    this.i = this.i.b();
                                }
                                a.a.a(this.i, fkc, fke);
                            } else if (a2 == 49) {
                                this.d |= 8;
                                this.j = Double.longBitsToDouble(fkc.j());
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
                if (l == null) {
                    synchronized (VoiceAdLog.class) {
                        if (l == null) {
                            l = new com.google.protobuf.GeneratedMessageLite.b(k);
                        }
                    }
                }
                return l;
            default:
                throw new UnsupportedOperationException();
        }
        return k;
    }

    static {
        VoiceAdLog voiceAdLog = new VoiceAdLog();
        k = voiceAdLog;
        voiceAdLog.e();
    }

    public static fkr<VoiceAdLog> parser() {
        return k.c();
    }

    static /* synthetic */ void a(VoiceAdLog voiceAdLog, String str) {
        if (str != null) {
            voiceAdLog.d |= 1;
            voiceAdLog.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void a(VoiceAdLog voiceAdLog, long j2) {
        voiceAdLog.d |= 2;
        voiceAdLog.f = j2;
    }

    static /* synthetic */ void b(VoiceAdLog voiceAdLog, String str) {
        if (str != null) {
            voiceAdLog.d |= 4;
            voiceAdLog.g = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ Map a(VoiceAdLog voiceAdLog) {
        if (!voiceAdLog.h.isMutable) {
            voiceAdLog.h = voiceAdLog.h.b();
        }
        return voiceAdLog.h;
    }

    static /* synthetic */ Map b(VoiceAdLog voiceAdLog) {
        if (!voiceAdLog.i.isMutable) {
            voiceAdLog.i = voiceAdLog.i.b();
        }
        return voiceAdLog.i;
    }

    static /* synthetic */ void a(VoiceAdLog voiceAdLog, double d2) {
        voiceAdLog.d |= 8;
        voiceAdLog.j = d2;
    }
}
