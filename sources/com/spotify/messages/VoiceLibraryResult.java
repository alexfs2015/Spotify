package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class VoiceLibraryResult extends GeneratedMessageLite<VoiceLibraryResult, a> implements gru {
    /* access modifiers changed from: private */
    public static final VoiceLibraryResult g;
    private static volatile fll<VoiceLibraryResult> h;
    private int d;
    private String e;
    private String f;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<VoiceLibraryResult, a> implements gru {
        private a() {
            super(VoiceLibraryResult.g);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(String str) {
            b();
            VoiceLibraryResult.a((VoiceLibraryResult) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            VoiceLibraryResult.b((VoiceLibraryResult) this.a, str);
            return this;
        }
    }

    static {
        VoiceLibraryResult voiceLibraryResult = new VoiceLibraryResult();
        g = voiceLibraryResult;
        voiceLibraryResult.e();
    }

    private VoiceLibraryResult() {
        String str = "";
        this.e = str;
        this.f = str;
    }

    static /* synthetic */ void a(VoiceLibraryResult voiceLibraryResult, String str) {
        if (str != null) {
            voiceLibraryResult.d |= 1;
            voiceLibraryResult.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(VoiceLibraryResult voiceLibraryResult, String str) {
        if (str != null) {
            voiceLibraryResult.d |= 2;
            voiceLibraryResult.f = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a k() {
        return (a) g.h();
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    private boolean n() {
        return (this.d & 2) == 2;
    }

    public static fll<VoiceLibraryResult> parser() {
        return g.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new VoiceLibraryResult();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                VoiceLibraryResult voiceLibraryResult = (VoiceLibraryResult) obj2;
                this.e = fVar.a(m(), this.e, voiceLibraryResult.m(), voiceLibraryResult.e);
                this.f = fVar.a(n(), this.f, voiceLibraryResult.n(), voiceLibraryResult.f);
                if (fVar == e.a) {
                    this.d |= voiceLibraryResult.d;
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
                                this.d |= 2;
                                this.f = c2;
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
                if (h == null) {
                    synchronized (VoiceLibraryResult.class) {
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
        if ((this.d & 1) == 1) {
            codedOutputStream.a(1, this.e);
        }
        if ((this.d & 2) == 2) {
            codedOutputStream.a(2, this.f);
        }
        this.b.a(codedOutputStream);
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.d & 1) == 1) {
            i2 = 0 + CodedOutputStream.b(1, this.e);
        }
        if ((this.d & 2) == 2) {
            i2 += CodedOutputStream.b(2, this.f);
        }
        int d2 = i2 + this.b.d();
        this.c = d2;
        return d2;
    }
}
