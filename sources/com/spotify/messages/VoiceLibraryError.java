package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class VoiceLibraryError extends GeneratedMessageLite<VoiceLibraryError, a> implements grt {
    /* access modifiers changed from: private */
    public static final VoiceLibraryError j;
    private static volatile fll<VoiceLibraryError> k;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<VoiceLibraryError, a> implements grt {
        private a() {
            super(VoiceLibraryError.j);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(String str) {
            b();
            VoiceLibraryError.a((VoiceLibraryError) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            VoiceLibraryError.b((VoiceLibraryError) this.a, str);
            return this;
        }

        public final a c(String str) {
            b();
            VoiceLibraryError.c((VoiceLibraryError) this.a, str);
            return this;
        }

        public final a d(String str) {
            b();
            VoiceLibraryError.d((VoiceLibraryError) this.a, str);
            return this;
        }

        public final a e(String str) {
            b();
            VoiceLibraryError.e((VoiceLibraryError) this.a, str);
            return this;
        }
    }

    static {
        VoiceLibraryError voiceLibraryError = new VoiceLibraryError();
        j = voiceLibraryError;
        voiceLibraryError.e();
    }

    private VoiceLibraryError() {
        String str = "";
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.i = str;
    }

    static /* synthetic */ void a(VoiceLibraryError voiceLibraryError, String str) {
        if (str != null) {
            voiceLibraryError.d |= 1;
            voiceLibraryError.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(VoiceLibraryError voiceLibraryError, String str) {
        if (str != null) {
            voiceLibraryError.d |= 2;
            voiceLibraryError.f = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void c(VoiceLibraryError voiceLibraryError, String str) {
        if (str != null) {
            voiceLibraryError.d |= 4;
            voiceLibraryError.g = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void d(VoiceLibraryError voiceLibraryError, String str) {
        if (str != null) {
            voiceLibraryError.d |= 8;
            voiceLibraryError.h = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void e(VoiceLibraryError voiceLibraryError, String str) {
        if (str != null) {
            voiceLibraryError.d |= 16;
            voiceLibraryError.i = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a k() {
        return (a) j.h();
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    private boolean n() {
        return (this.d & 2) == 2;
    }

    private boolean o() {
        return (this.d & 4) == 4;
    }

    private boolean p() {
        return (this.d & 8) == 8;
    }

    public static fll<VoiceLibraryError> parser() {
        return j.c();
    }

    private boolean q() {
        return (this.d & 16) == 16;
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new VoiceLibraryError();
            case IS_INITIALIZED:
                return j;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                VoiceLibraryError voiceLibraryError = (VoiceLibraryError) obj2;
                this.e = fVar.a(m(), this.e, voiceLibraryError.m(), voiceLibraryError.e);
                this.f = fVar.a(n(), this.f, voiceLibraryError.n(), voiceLibraryError.f);
                this.g = fVar.a(o(), this.g, voiceLibraryError.o(), voiceLibraryError.g);
                this.h = fVar.a(p(), this.h, voiceLibraryError.p(), voiceLibraryError.h);
                this.i = fVar.a(q(), this.i, voiceLibraryError.q(), voiceLibraryError.i);
                if (fVar == e.a) {
                    this.d |= voiceLibraryError.d;
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
                            } else if (a2 == 26) {
                                String c3 = fkw.c();
                                this.d |= 4;
                                this.g = c3;
                            } else if (a2 == 34) {
                                String c4 = fkw.c();
                                this.d |= 8;
                                this.h = c4;
                            } else if (a2 == 42) {
                                String c5 = fkw.c();
                                this.d |= 16;
                                this.i = c5;
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
                if (k == null) {
                    synchronized (VoiceLibraryError.class) {
                        if (k == null) {
                            k = new b(j);
                        }
                    }
                }
                return k;
            default:
                throw new UnsupportedOperationException();
        }
        return j;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if ((this.d & 1) == 1) {
            codedOutputStream.a(1, this.e);
        }
        if ((this.d & 2) == 2) {
            codedOutputStream.a(2, this.f);
        }
        if ((this.d & 4) == 4) {
            codedOutputStream.a(3, this.g);
        }
        if ((this.d & 8) == 8) {
            codedOutputStream.a(4, this.h);
        }
        if ((this.d & 16) == 16) {
            codedOutputStream.a(5, this.i);
        }
        this.b.a(codedOutputStream);
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.d & 1) == 1) {
            i3 = 0 + CodedOutputStream.b(1, this.e);
        }
        if ((this.d & 2) == 2) {
            i3 += CodedOutputStream.b(2, this.f);
        }
        if ((this.d & 4) == 4) {
            i3 += CodedOutputStream.b(3, this.g);
        }
        if ((this.d & 8) == 8) {
            i3 += CodedOutputStream.b(4, this.h);
        }
        if ((this.d & 16) == 16) {
            i3 += CodedOutputStream.b(5, this.i);
        }
        int d2 = i3 + this.b.d();
        this.c = d2;
        return d2;
    }
}
