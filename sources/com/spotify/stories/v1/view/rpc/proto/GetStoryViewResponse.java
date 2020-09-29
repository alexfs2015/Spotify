package com.spotify.stories.v1.view.rpc.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.stories.v1.view.proto.Story;
import java.io.IOException;

public final class GetStoryViewResponse extends GeneratedMessageLite<GetStoryViewResponse, a> implements wbi {
    /* access modifiers changed from: private */
    public static final GetStoryViewResponse e;
    private static volatile fll<GetStoryViewResponse> f;
    private Story d;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<GetStoryViewResponse, a> implements wbi {
        private a() {
            super(GetStoryViewResponse.e);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        GetStoryViewResponse getStoryViewResponse = new GetStoryViewResponse();
        e = getStoryViewResponse;
        getStoryViewResponse.e();
    }

    private GetStoryViewResponse() {
    }

    public static fll<GetStoryViewResponse> parser() {
        return e.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new GetStoryViewResponse();
            case IS_INITIALIZED:
                return e;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                this.d = (Story) ((f) obj).a(this.d, ((GetStoryViewResponse) obj2).d);
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
                                com.spotify.stories.v1.view.proto.Story.a aVar = this.d != null ? (com.spotify.stories.v1.view.proto.Story.a) this.d.h() : null;
                                this.d = (Story) fkw.a(Story.parser(), fky);
                                if (aVar != null) {
                                    aVar.a(this.d);
                                    this.d = (Story) aVar.e();
                                }
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
                    synchronized (GetStoryViewResponse.class) {
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
        if (this.d != null) {
            codedOutputStream.a(1, (fli) k());
        }
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.d != null) {
            i2 = 0 + CodedOutputStream.b(1, (fli) k());
        }
        this.c = i2;
        return i2;
    }

    public final Story k() {
        Story story = this.d;
        return story == null ? Story.l() : story;
    }
}
