package com.spotify.stories.v1.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class VideoChapter extends GeneratedMessageLite<VideoChapter, a> implements wbh {
    /* access modifiers changed from: private */
    public static final VideoChapter e;
    private static volatile fll<VideoChapter> f;
    public String d = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<VideoChapter, a> implements wbh {
        private a() {
            super(VideoChapter.e);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        VideoChapter videoChapter = new VideoChapter();
        e = videoChapter;
        videoChapter.e();
    }

    private VideoChapter() {
    }

    public static VideoChapter k() {
        return e;
    }

    public static fll<VideoChapter> parser() {
        return e.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new VideoChapter();
            case IS_INITIALIZED:
                return e;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                VideoChapter videoChapter = (VideoChapter) obj2;
                this.d = ((f) obj).a(!this.d.isEmpty(), this.d, true ^ videoChapter.d.isEmpty(), videoChapter.d);
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
                    synchronized (VideoChapter.class) {
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
