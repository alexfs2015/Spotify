package com.spotify.stories.v1.header.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class GetStoryHeaderResponse extends GeneratedMessageLite<GetStoryHeaderResponse, a> implements wba {
    /* access modifiers changed from: private */
    public static final GetStoryHeaderResponse e;
    private static volatile fll<GetStoryHeaderResponse> f;
    public String d = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<GetStoryHeaderResponse, a> implements wba {
        private a() {
            super(GetStoryHeaderResponse.e);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        GetStoryHeaderResponse getStoryHeaderResponse = new GetStoryHeaderResponse();
        e = getStoryHeaderResponse;
        getStoryHeaderResponse.e();
    }

    private GetStoryHeaderResponse() {
    }

    public static fll<GetStoryHeaderResponse> parser() {
        return e.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new GetStoryHeaderResponse();
            case IS_INITIALIZED:
                return e;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                GetStoryHeaderResponse getStoryHeaderResponse = (GetStoryHeaderResponse) obj2;
                this.d = ((f) obj).a(!this.d.isEmpty(), this.d, true ^ getStoryHeaderResponse.d.isEmpty(), getStoryHeaderResponse.d);
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
                if (f == null) {
                    synchronized (GetStoryHeaderResponse.class) {
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
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
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
        this.c = i2;
        return i2;
    }
}
