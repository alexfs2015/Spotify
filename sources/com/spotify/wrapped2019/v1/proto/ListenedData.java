package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class ListenedData extends GeneratedMessageLite<ListenedData, a> implements wfg {
    /* access modifiers changed from: private */
    public static final ListenedData g;
    private static volatile fll<ListenedData> h;
    public String d;
    public int e;
    public String f;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ListenedData, a> implements wfg {
        private a() {
            super(ListenedData.g);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        ListenedData listenedData = new ListenedData();
        g = listenedData;
        listenedData.e();
    }

    private ListenedData() {
        String str = "";
        this.d = str;
        this.f = str;
    }

    public static fll<ListenedData> parser() {
        return g.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new ListenedData();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                ListenedData listenedData = (ListenedData) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !listenedData.d.isEmpty(), listenedData.d);
                boolean z2 = this.e != 0;
                int i = this.e;
                if (listenedData.e != 0) {
                    z = true;
                }
                this.e = fVar.a(z2, i, z, listenedData.e);
                this.f = fVar.a(!this.f.isEmpty(), this.f, true ^ listenedData.f.isEmpty(), listenedData.f);
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                this.d = fkw.d();
                            } else if (a2 == 16) {
                                this.e = fkw.g();
                            } else if (a2 == 26) {
                                this.f = fkw.d();
                            } else if (!fkw.b(a2)) {
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
                    synchronized (ListenedData.class) {
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

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        int i = this.e;
        if (i != 0) {
            codedOutputStream.b(2, i);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.a(3, this.f);
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
        int i3 = this.e;
        if (i3 != 0) {
            i2 += CodedOutputStream.f(2, i3);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.b(3, this.f);
        }
        this.c = i2;
        return i2;
    }
}
