package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Artist extends GeneratedMessageLite<Artist, a> implements vwg {
    /* access modifiers changed from: private */
    public static final Artist d;
    private static volatile fll<Artist> e;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Artist, a> implements vwg {
        private a() {
            super(Artist.d);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Artist artist = new Artist();
        d = artist;
        artist.e();
    }

    private Artist() {
    }

    public static fll<Artist> parser() {
        return d.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Artist();
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
                fkw fkw = (fkw) obj;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        if (a2 == 0 || !fkw.b(a2)) {
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
                    synchronized (Artist.class) {
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

    public final void a(CodedOutputStream codedOutputStream) {
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        this.c = 0;
        return 0;
    }
}
