package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class AndroidClientReport extends GeneratedMessageLite<AndroidClientReport, a> implements gqo {
    /* access modifiers changed from: private */
    public static final AndroidClientReport h;
    private static volatile fll<AndroidClientReport> i;
    private int d;
    private String e;
    private e<String> f = flm.d();
    private String g;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<AndroidClientReport, a> implements gqo {
        private a() {
            super(AndroidClientReport.h);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(Iterable<String> iterable) {
            b();
            AndroidClientReport.a((AndroidClientReport) this.a, (Iterable) iterable);
            return this;
        }

        public final a a(String str) {
            b();
            AndroidClientReport.a((AndroidClientReport) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            AndroidClientReport.b((AndroidClientReport) this.a, str);
            return this;
        }
    }

    static {
        AndroidClientReport androidClientReport = new AndroidClientReport();
        h = androidClientReport;
        androidClientReport.e();
    }

    private AndroidClientReport() {
        String str = "";
        this.e = str;
        this.g = str;
    }

    static /* synthetic */ void a(AndroidClientReport androidClientReport, Iterable iterable) {
        if (!androidClientReport.f.a()) {
            androidClientReport.f = GeneratedMessageLite.a(androidClientReport.f);
        }
        fkr.a(iterable, androidClientReport.f);
    }

    static /* synthetic */ void a(AndroidClientReport androidClientReport, String str) {
        if (str != null) {
            androidClientReport.d |= 1;
            androidClientReport.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(AndroidClientReport androidClientReport, String str) {
        if (str != null) {
            androidClientReport.d |= 2;
            androidClientReport.g = str;
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

    public static fll<AndroidClientReport> parser() {
        return h.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new AndroidClientReport();
            case IS_INITIALIZED:
                return h;
            case MAKE_IMMUTABLE:
                this.f.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                AndroidClientReport androidClientReport = (AndroidClientReport) obj2;
                this.e = fVar.a(m(), this.e, androidClientReport.m(), androidClientReport.e);
                this.f = fVar.a(this.f, androidClientReport.f);
                this.g = fVar.a(n(), this.g, androidClientReport.n(), androidClientReport.g);
                if (fVar == e.a) {
                    this.d |= androidClientReport.d;
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
                                if (!this.f.a()) {
                                    this.f = GeneratedMessageLite.a(this.f);
                                }
                                this.f.add(c2);
                            } else if (a2 == 26) {
                                String c3 = fkw.c();
                                this.d |= 2;
                                this.g = c3;
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
                    synchronized (AndroidClientReport.class) {
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
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            codedOutputStream.a(2, (String) this.f.get(i2));
        }
        if ((this.d & 2) == 2) {
            codedOutputStream.a(3, this.g);
        }
        this.b.a(codedOutputStream);
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int b = (this.d & 1) == 1 ? CodedOutputStream.b(1, this.e) + 0 : 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f.size(); i4++) {
            i3 += CodedOutputStream.b((String) this.f.get(i4));
        }
        int size = b + i3 + (this.f.size() * 1);
        if ((this.d & 2) == 2) {
            size += CodedOutputStream.b(3, this.g);
        }
        int d2 = size + this.b.d();
        this.c = d2;
        return d2;
    }
}
