package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class AudioEpisode extends GeneratedMessageLite<AudioEpisode, a> implements vjc {
    /* access modifiers changed from: private */
    public static final AudioEpisode f;
    private static volatile fkr<AudioEpisode> g;
    public String d = "";
    public boolean e;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<AudioEpisode, a> implements vjc {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(AudioEpisode.f);
        }
    }

    private AudioEpisode() {
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

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new AudioEpisode();
            case IS_INITIALIZED:
                return f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                AudioEpisode audioEpisode = (AudioEpisode) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, true ^ audioEpisode.d.isEmpty(), audioEpisode.d);
                boolean z2 = this.e;
                boolean z3 = audioEpisode.e;
                this.e = fVar.a(z2, z2, z3, z3);
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                this.d = fkc.d();
                            } else if (a2 == 16) {
                                this.e = fkc.b();
                            } else if (!fkc.b(a2)) {
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
                    synchronized (AudioEpisode.class) {
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

    static {
        AudioEpisode audioEpisode = new AudioEpisode();
        f = audioEpisode;
        audioEpisode.e();
    }

    public static AudioEpisode k() {
        return f;
    }

    public static fkr<AudioEpisode> parser() {
        return f.c();
    }
}
