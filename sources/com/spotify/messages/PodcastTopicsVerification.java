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

public final class PodcastTopicsVerification extends GeneratedMessageLite<PodcastTopicsVerification, a> implements gpn {
    /* access modifiers changed from: private */
    public static final PodcastTopicsVerification g;
    private static volatile fkr<PodcastTopicsVerification> h;
    private int d;
    private MapFieldLite<String, Boolean> e = MapFieldLite.a();
    private boolean f;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<PodcastTopicsVerification, a> implements gpn {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(PodcastTopicsVerification.g);
        }

        public final a a(String str, boolean z) {
            if (str != null) {
                b();
                PodcastTopicsVerification.a((PodcastTopicsVerification) this.a).put(str, Boolean.valueOf(z));
                return this;
            }
            throw new NullPointerException();
        }

        public final a a(boolean z) {
            b();
            PodcastTopicsVerification.a((PodcastTopicsVerification) this.a, true);
            return this;
        }
    }

    static final class b {
        static final fkn<String, Boolean> a = fkn.a(FieldType.STRING, "", FieldType.BOOL, Boolean.FALSE);
    }

    private PodcastTopicsVerification() {
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (Entry entry : this.e.entrySet()) {
            i2 += b.a.a(1, entry.getKey(), entry.getValue());
        }
        if ((this.d & 1) == 1) {
            i2 += CodedOutputStream.b(2, this.f);
        }
        int d2 = i2 + this.b.d();
        this.c = d2;
        return d2;
    }

    public static a k() {
        return (a) g.h();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new PodcastTopicsVerification();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                this.e.isMutable = false;
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                PodcastTopicsVerification podcastTopicsVerification = (PodcastTopicsVerification) obj2;
                this.e = fVar.a(this.e, podcastTopicsVerification.e);
                this.f = fVar.a(m(), this.f, podcastTopicsVerification.m(), podcastTopicsVerification.f);
                if (fVar == e.a) {
                    this.d |= podcastTopicsVerification.d;
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
                                if (!this.e.isMutable) {
                                    this.e = this.e.b();
                                }
                                b.a.a(this.e, fkc, fke);
                            } else if (a2 == 16) {
                                this.d |= 1;
                                this.f = fkc.b();
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
                    synchronized (PodcastTopicsVerification.class) {
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

    static {
        PodcastTopicsVerification podcastTopicsVerification = new PodcastTopicsVerification();
        g = podcastTopicsVerification;
        podcastTopicsVerification.e();
    }

    public static fkr<PodcastTopicsVerification> parser() {
        return g.c();
    }

    public final void a(CodedOutputStream codedOutputStream) {
        for (Entry entry : this.e.entrySet()) {
            b.a.a(codedOutputStream, 1, entry.getKey(), entry.getValue());
        }
        if ((this.d & 1) == 1) {
            codedOutputStream.a(2, this.f);
        }
        this.b.a(codedOutputStream);
    }

    static /* synthetic */ Map a(PodcastTopicsVerification podcastTopicsVerification) {
        if (!podcastTopicsVerification.e.isMutable) {
            podcastTopicsVerification.e = podcastTopicsVerification.e.b();
        }
        return podcastTopicsVerification.e;
    }

    static /* synthetic */ void a(PodcastTopicsVerification podcastTopicsVerification, boolean z) {
        podcastTopicsVerification.d |= 1;
        podcastTopicsVerification.f = z;
    }
}
