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

public final class ClientId extends GeneratedMessageLite<ClientId, a> implements gdu {
    /* access modifiers changed from: private */
    public static final ClientId f;
    private static volatile fll<ClientId> g;
    private int d;
    private ByteString e = ByteString.a;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ClientId, a> implements gdu {
        private a() {
            super(ClientId.f);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(ByteString byteString) {
            b();
            ClientId.a((ClientId) this.a, byteString);
            return this;
        }
    }

    static {
        ClientId clientId = new ClientId();
        f = clientId;
        clientId.e();
    }

    private ClientId() {
    }

    static /* synthetic */ void a(ClientId clientId, ByteString byteString) {
        if (byteString != null) {
            clientId.d |= 1;
            clientId.e = byteString;
            return;
        }
        throw new NullPointerException();
    }

    public static a k() {
        return (a) f.h();
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    public static fll<ClientId> parser() {
        return f.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new ClientId();
            case IS_INITIALIZED:
                return f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                ClientId clientId = (ClientId) obj2;
                this.e = fVar.a(m(), this.e, clientId.m(), clientId.e);
                if (fVar == e.a) {
                    this.d |= clientId.d;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                this.d |= 1;
                                this.e = fkw.e();
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
                if (g == null) {
                    synchronized (ClientId.class) {
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
}
