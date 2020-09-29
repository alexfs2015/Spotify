package com.spotify.music.libs.fullscreen.story.prefetcher.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.util.List;

public final class GetAllPlaylistsResponse extends GeneratedMessageLite<GetAllPlaylistsResponse, a> implements sby {
    /* access modifiers changed from: private */
    public static final GetAllPlaylistsResponse e;
    private static volatile fll<GetAllPlaylistsResponse> f;
    private e<String> d = flm.d();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<GetAllPlaylistsResponse, a> implements sby {
        private a() {
            super(GetAllPlaylistsResponse.e);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        GetAllPlaylistsResponse getAllPlaylistsResponse = new GetAllPlaylistsResponse();
        e = getAllPlaylistsResponse;
        getAllPlaylistsResponse.e();
    }

    private GetAllPlaylistsResponse() {
    }

    public static fll<GetAllPlaylistsResponse> parser() {
        return e.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new GetAllPlaylistsResponse();
            case IS_INITIALIZED:
                return e;
            case MAKE_IMMUTABLE:
                this.d.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                this.d = ((f) obj).a(this.d, ((GetAllPlaylistsResponse) obj2).d);
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                String d2 = fkw.d();
                                if (!this.d.a()) {
                                    this.d = GeneratedMessageLite.a(this.d);
                                }
                                this.d.add(d2);
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
                    synchronized (GetAllPlaylistsResponse.class) {
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
        int size = i2 + 0 + (k().size() * 1);
        this.c = size;
        return size;
    }

    public final List<String> k() {
        return this.d;
    }
}
