package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class VoiceLibraryStatus extends GeneratedMessageLite<VoiceLibraryStatus, a> implements gpw {
    /* access modifiers changed from: private */
    public static final VoiceLibraryStatus j;
    private static volatile fkr<VoiceLibraryStatus> k;
    private int d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private String i;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<VoiceLibraryStatus, a> implements gpw {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(VoiceLibraryStatus.j);
        }

        public final a a(String str) {
            b();
            VoiceLibraryStatus.a((VoiceLibraryStatus) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            VoiceLibraryStatus.b((VoiceLibraryStatus) this.a, str);
            return this;
        }

        public final a a(boolean z) {
            b();
            VoiceLibraryStatus.a((VoiceLibraryStatus) this.a, z);
            return this;
        }

        public final a b(boolean z) {
            b();
            VoiceLibraryStatus.b((VoiceLibraryStatus) this.a, z);
            return this;
        }

        public final a c(String str) {
            b();
            VoiceLibraryStatus.c((VoiceLibraryStatus) this.a, str);
            return this;
        }
    }

    private VoiceLibraryStatus() {
        String str = "";
        this.e = str;
        this.f = str;
        this.i = str;
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

    private boolean q() {
        return (this.d & 16) == 16;
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

    public static a k() {
        return (a) j.h();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new VoiceLibraryStatus();
            case IS_INITIALIZED:
                return j;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                VoiceLibraryStatus voiceLibraryStatus = (VoiceLibraryStatus) obj2;
                this.e = fVar.a(m(), this.e, voiceLibraryStatus.m(), voiceLibraryStatus.e);
                this.f = fVar.a(n(), this.f, voiceLibraryStatus.n(), voiceLibraryStatus.f);
                this.g = fVar.a(o(), this.g, voiceLibraryStatus.o(), voiceLibraryStatus.g);
                this.h = fVar.a(p(), this.h, voiceLibraryStatus.p(), voiceLibraryStatus.h);
                this.i = fVar.a(q(), this.i, voiceLibraryStatus.q(), voiceLibraryStatus.i);
                if (fVar == e.a) {
                    this.d |= voiceLibraryStatus.d;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                String c = fkc.c();
                                this.d |= 1;
                                this.e = c;
                            } else if (a2 == 18) {
                                String c2 = fkc.c();
                                this.d |= 2;
                                this.f = c2;
                            } else if (a2 == 24) {
                                this.d |= 4;
                                this.g = fkc.b();
                            } else if (a2 == 32) {
                                this.d |= 8;
                                this.h = fkc.b();
                            } else if (a2 == 42) {
                                String c3 = fkc.c();
                                this.d |= 16;
                                this.i = c3;
                            } else if (!a(a2, fkc)) {
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
                    synchronized (VoiceLibraryStatus.class) {
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

    static {
        VoiceLibraryStatus voiceLibraryStatus = new VoiceLibraryStatus();
        j = voiceLibraryStatus;
        voiceLibraryStatus.e();
    }

    public static fkr<VoiceLibraryStatus> parser() {
        return j.c();
    }

    static /* synthetic */ void a(VoiceLibraryStatus voiceLibraryStatus, String str) {
        if (str != null) {
            voiceLibraryStatus.d |= 1;
            voiceLibraryStatus.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(VoiceLibraryStatus voiceLibraryStatus, String str) {
        if (str != null) {
            voiceLibraryStatus.d |= 2;
            voiceLibraryStatus.f = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void a(VoiceLibraryStatus voiceLibraryStatus, boolean z) {
        voiceLibraryStatus.d |= 4;
        voiceLibraryStatus.g = z;
    }

    static /* synthetic */ void b(VoiceLibraryStatus voiceLibraryStatus, boolean z) {
        voiceLibraryStatus.d |= 8;
        voiceLibraryStatus.h = z;
    }

    static /* synthetic */ void c(VoiceLibraryStatus voiceLibraryStatus, String str) {
        if (str != null) {
            voiceLibraryStatus.d |= 16;
            voiceLibraryStatus.i = str;
            return;
        }
        throw new NullPointerException();
    }
}
