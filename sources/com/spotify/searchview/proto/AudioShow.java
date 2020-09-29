package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class AudioShow extends GeneratedMessageLite<AudioShow, a> implements vwi {
    /* access modifiers changed from: private */
    public static final AudioShow f;
    private static volatile fll<AudioShow> g;
    public String d = "";
    public boolean e;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<AudioShow, a> implements vwi {
        private a() {
            super(AudioShow.f);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        AudioShow audioShow = new AudioShow();
        f = audioShow;
        audioShow.e();
    }

    private AudioShow() {
    }

    public static AudioShow k() {
        return f;
    }

    public static fll<AudioShow> parser() {
        return f.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new AudioShow();
            case IS_INITIALIZED:
                return f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                AudioShow audioShow = (AudioShow) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, true ^ audioShow.d.isEmpty(), audioShow.d);
                boolean z2 = this.e;
                boolean z3 = audioShow.e;
                this.e = fVar.a(z2, z2, z3, z3);
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
                                this.e = fkw.b();
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
                if (g == null) {
                    synchronized (AudioShow.class) {
                        if (g == null) {
                            g = new b(f);
                        }
                    }
                }
                return g;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        boolean z = this.e;
        if (z) {
            codedOutputStream.a(2, z);
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
        boolean z = this.e;
        if (z) {
            i2 += CodedOutputStream.b(2, z);
        }
        this.c = i2;
        return i2;
    }
}
