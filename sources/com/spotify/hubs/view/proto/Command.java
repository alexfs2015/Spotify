package com.spotify.hubs.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import java.io.IOException;

public final class Command extends GeneratedMessageLite<Command, a> implements gir {
    /* access modifiers changed from: private */
    public static final Command f;
    private static volatile fkr<Command> g;
    public String d = "";
    private Struct e;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Command, a> implements gir {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(Command.f);
        }
    }

    private Command() {
    }

    public final Struct k() {
        Struct struct = this.e;
        return struct == null ? Struct.l() : struct;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        if (this.e != null) {
            codedOutputStream.a(2, (fko) k());
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
        if (this.e != null) {
            i2 += CodedOutputStream.b(2, (fko) k());
        }
        this.c = i2;
        return i2;
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Command();
            case IS_INITIALIZED:
                return f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Command command = (Command) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !command.d.isEmpty(), command.d);
                this.e = (Struct) fVar.a(this.e, command.e);
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                fke fke = (fke) obj2;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                this.d = fkc.d();
                            } else if (a2 == 18) {
                                com.google.protobuf.Struct.a aVar = this.e != null ? (com.google.protobuf.Struct.a) this.e.h() : null;
                                this.e = (Struct) fkc.a(Struct.parser(), fke);
                                if (aVar != null) {
                                    aVar.a(this.e);
                                    this.e = (Struct) aVar.e();
                                }
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
                    synchronized (Command.class) {
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
        Command command = new Command();
        f = command;
        command.e();
    }

    public static Command l() {
        return f;
    }

    public static fkr<Command> parser() {
        return f.c();
    }
}
