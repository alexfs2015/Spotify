package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Genre extends GeneratedMessageLite<Genre, a> implements vjg {
    /* access modifiers changed from: private */
    public static final Genre d;
    private static volatile fkr<Genre> e;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Genre, a> implements vjg {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(Genre.d);
        }
    }

    public final void a(CodedOutputStream codedOutputStream) {
    }

    private Genre() {
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
                return new Genre();
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
                    synchronized (Genre.class) {
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
        Genre genre = new Genre();
        d = genre;
        genre.e();
    }

    public static fkr<Genre> parser() {
        return d.c();
    }
}
