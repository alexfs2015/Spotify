package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Track extends GeneratedMessageLite<Track, a> implements wft {
    /* access modifiers changed from: private */
    public static final Track h;
    private static volatile fll<Track> i;
    public String d;
    public String e;
    public String f;
    public String g;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Track, a> implements wft {
        private a() {
            super(Track.h);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Track track = new Track();
        h = track;
        track.e();
    }

    private Track() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
    }

    public static fll<Track> parser() {
        return h.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Track();
            case IS_INITIALIZED:
                return h;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Track track = (Track) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !track.d.isEmpty(), track.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !track.e.isEmpty(), track.e);
                this.f = fVar.a(!this.f.isEmpty(), this.f, !track.f.isEmpty(), track.f);
                this.g = fVar.a(!this.g.isEmpty(), this.g, true ^ track.g.isEmpty(), track.g);
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
                            } else if (a2 == 18) {
                                this.e = fkw.d();
                            } else if (a2 == 26) {
                                this.f = fkw.d();
                            } else if (a2 == 34) {
                                this.g = fkw.d();
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
                if (i == null) {
                    synchronized (Track.class) {
                        if (i == null) {
                            i = new b(h);
                        }
                    }
                }
                return i;
            default:
                throw new UnsupportedOperationException();
        }
        return h;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        if (!this.e.isEmpty()) {
            codedOutputStream.a(2, this.e);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.a(3, this.f);
        }
        if (!this.g.isEmpty()) {
            codedOutputStream.a(4, this.g);
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (!this.d.isEmpty()) {
            i3 = 0 + CodedOutputStream.b(1, this.d);
        }
        if (!this.e.isEmpty()) {
            i3 += CodedOutputStream.b(2, this.e);
        }
        if (!this.f.isEmpty()) {
            i3 += CodedOutputStream.b(3, this.f);
        }
        if (!this.g.isEmpty()) {
            i3 += CodedOutputStream.b(4, this.g);
        }
        this.c = i3;
        return i3;
    }
}
