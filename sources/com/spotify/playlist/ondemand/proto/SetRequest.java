package com.spotify.playlist.ondemand.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class SetRequest extends GeneratedMessageLite<SetRequest, a> implements vls {
    /* access modifiers changed from: private */
    public static final SetRequest e;
    private static volatile fll<SetRequest> f;
    private e<String> d = flm.d();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<SetRequest, a> implements vls {
        private a() {
            super(SetRequest.e);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(Iterable<String> iterable) {
            b();
            SetRequest.a((SetRequest) this.a, iterable);
            return this;
        }
    }

    static {
        SetRequest setRequest = new SetRequest();
        e = setRequest;
        setRequest.e();
    }

    private SetRequest() {
    }

    static /* synthetic */ void a(SetRequest setRequest, Iterable iterable) {
        if (!setRequest.d.a()) {
            setRequest.d = GeneratedMessageLite.a(setRequest.d);
        }
        fkr.a(iterable, setRequest.d);
    }

    public static a k() {
        return (a) e.h();
    }

    public static fll<SetRequest> parser() {
        return e.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new SetRequest();
            case IS_INITIALIZED:
                return e;
            case MAKE_IMMUTABLE:
                this.d.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                this.d = ((f) obj).a(this.d, ((SetRequest) obj2).d);
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                String c = fkw.c();
                                if (!this.d.a()) {
                                    this.d = GeneratedMessageLite.a(this.d);
                                }
                                this.d.add(c);
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
                if (f == null) {
                    synchronized (SetRequest.class) {
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

    public final void a(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.d.size(); i++) {
            codedOutputStream.a(1, (String) this.d.get(i));
        }
        this.b.a(codedOutputStream);
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.d.size(); i3++) {
            i2 += CodedOutputStream.b((String) this.d.get(i3));
        }
        int size = i2 + 0 + (this.d.size() * 1) + this.b.d();
        this.c = size;
        return size;
    }
}
