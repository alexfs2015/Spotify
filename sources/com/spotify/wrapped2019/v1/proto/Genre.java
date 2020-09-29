package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Genre extends GeneratedMessageLite<Genre, a> implements wfe {
    /* access modifiers changed from: private */
    public static final Genre f;
    private static volatile fll<Genre> g;
    public String d = "";
    public int e;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Genre, a> implements wfe {
        private a() {
            super(Genre.f);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Genre genre = new Genre();
        f = genre;
        genre.e();
    }

    private Genre() {
    }

    public static fll<Genre> parser() {
        return f.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Genre();
            case IS_INITIALIZED:
                return f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Genre genre = (Genre) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !genre.d.isEmpty(), genre.d);
                boolean z2 = this.e != 0;
                int i = this.e;
                if (genre.e != 0) {
                    z = true;
                }
                this.e = fVar.a(z2, i, z, genre.e);
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
                                this.e = fkw.g();
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
                    synchronized (Genre.class) {
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
        int i = this.e;
        if (i != 0) {
            codedOutputStream.b(2, i);
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
        int i3 = this.e;
        if (i3 != 0) {
            i2 += CodedOutputStream.f(2, i3);
        }
        this.c = i2;
        return i2;
    }
}
