package com.spotify.contexts;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class InstallationId extends GeneratedMessageLite<InstallationId, a> implements gcl {
    /* access modifiers changed from: private */
    public static final InstallationId f;
    private static volatile fkr<InstallationId> g;
    private int d;
    private ByteString e = ByteString.a;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<InstallationId, a> implements gcl {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(InstallationId.f);
        }

        public final a a(ByteString byteString) {
            b();
            InstallationId.a((InstallationId) this.a, byteString);
            return this;
        }
    }

    private InstallationId() {
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if ((this.d & 1) == 1) {
            codedOutputStream.a(1, this.e);
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
        int d2 = i2 + this.b.d();
        this.c = d2;
        return d2;
    }

    public static a k() {
        return (a) f.h();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new InstallationId();
            case IS_INITIALIZED:
                return f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                InstallationId installationId = (InstallationId) obj2;
                this.e = fVar.a(m(), this.e, installationId.m(), installationId.e);
                if (fVar == e.a) {
                    this.d |= installationId.d;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                this.d |= 1;
                                this.e = fkc.e();
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
                if (g == null) {
                    synchronized (InstallationId.class) {
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
        InstallationId installationId = new InstallationId();
        f = installationId;
        installationId.e();
    }

    public static fkr<InstallationId> parser() {
        return f.c();
    }

    static /* synthetic */ void a(InstallationId installationId, ByteString byteString) {
        if (byteString != null) {
            installationId.d |= 1;
            installationId.e = byteString;
            return;
        }
        throw new NullPointerException();
    }
}
