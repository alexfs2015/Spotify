package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class ArtistOfTheDecadeStory extends GeneratedMessageLite<ArtistOfTheDecadeStory, a> implements wey {
    /* access modifiers changed from: private */
    public static final ArtistOfTheDecadeStory i;
    private static volatile fll<ArtistOfTheDecadeStory> j;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ArtistOfTheDecadeStory, a> implements wey {
        private a() {
            super(ArtistOfTheDecadeStory.i);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        ArtistOfTheDecadeStory artistOfTheDecadeStory = new ArtistOfTheDecadeStory();
        i = artistOfTheDecadeStory;
        artistOfTheDecadeStory.e();
    }

    private ArtistOfTheDecadeStory() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
    }

    public static ArtistOfTheDecadeStory k() {
        return i;
    }

    public static fll<ArtistOfTheDecadeStory> parser() {
        return i.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new ArtistOfTheDecadeStory();
            case IS_INITIALIZED:
                return i;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                ArtistOfTheDecadeStory artistOfTheDecadeStory = (ArtistOfTheDecadeStory) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !artistOfTheDecadeStory.d.isEmpty(), artistOfTheDecadeStory.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !artistOfTheDecadeStory.e.isEmpty(), artistOfTheDecadeStory.e);
                this.f = fVar.a(!this.f.isEmpty(), this.f, !artistOfTheDecadeStory.f.isEmpty(), artistOfTheDecadeStory.f);
                this.g = fVar.a(!this.g.isEmpty(), this.g, !artistOfTheDecadeStory.g.isEmpty(), artistOfTheDecadeStory.g);
                this.h = fVar.a(!this.h.isEmpty(), this.h, true ^ artistOfTheDecadeStory.h.isEmpty(), artistOfTheDecadeStory.h);
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
                            } else if (a2 == 42) {
                                this.h = fkw.d();
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
                if (j == null) {
                    synchronized (ArtistOfTheDecadeStory.class) {
                        if (j == null) {
                            j = new b(i);
                        }
                    }
                }
                return j;
            default:
                throw new UnsupportedOperationException();
        }
        return i;
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
        if (!this.h.isEmpty()) {
            codedOutputStream.a(5, this.h);
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
        if (!this.h.isEmpty()) {
            i3 += CodedOutputStream.b(5, this.h);
        }
        this.c = i3;
        return i3;
    }
}
