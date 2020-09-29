package com.spotify.rcs.model;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Fetch extends GeneratedMessageLite<Fetch, a> implements vdj {
    /* access modifiers changed from: private */
    public static final Fetch d;
    private static volatile fkr<Fetch> e;

    public enum Type implements b {
        UNKNOWN(0),
        BACKGROUND_SYNC(1),
        BLOCKING(2),
        DELAYED(3),
        UNRECOGNIZED(-1);
        
        public final int value;

        static {
            new Object() {
            };
        }

        public final int a() {
            return this.value;
        }

        public static Type a(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return BACKGROUND_SYNC;
            }
            if (i == 2) {
                return BLOCKING;
            }
            if (i != 3) {
                return null;
            }
            return DELAYED;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Fetch, a> implements vdj {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(Fetch.d);
        }
    }

    public final void a(CodedOutputStream codedOutputStream) {
    }

    private Fetch() {
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        this.c = 0;
        return 0;
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Fetch();
            case IS_INITIALIZED:
                return d;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 == 0 || !fkc.b(a2)) {
                            z = true;
                        }
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
                if (e == null) {
                    synchronized (Fetch.class) {
                        if (e == null) {
                            e = new b(d);
                        }
                    }
                }
                return e;
            default:
                throw new UnsupportedOperationException();
        }
        return d;
    }

    static {
        Fetch fetch = new Fetch();
        d = fetch;
        fetch.e();
    }

    public static fkr<Fetch> parser() {
        return d.c();
    }
}
