package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class TopGenreStory extends GeneratedMessageLite<TopGenreStory, a> implements wfr {
    /* access modifiers changed from: private */
    public static final TopGenreStory i;
    private static volatile fll<TopGenreStory> j;
    public String d;
    public String e;
    public String f;
    public e<Genre> g = flm.d();
    private int h;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<TopGenreStory, a> implements wfr {
        private a() {
            super(TopGenreStory.i);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        TopGenreStory topGenreStory = new TopGenreStory();
        i = topGenreStory;
        topGenreStory.e();
    }

    private TopGenreStory() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = str;
    }

    public static TopGenreStory k() {
        return i;
    }

    public static fll<TopGenreStory> parser() {
        return i.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new TopGenreStory();
            case IS_INITIALIZED:
                return i;
            case MAKE_IMMUTABLE:
                this.g.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                TopGenreStory topGenreStory = (TopGenreStory) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !topGenreStory.d.isEmpty(), topGenreStory.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !topGenreStory.e.isEmpty(), topGenreStory.e);
                this.f = fVar.a(!this.f.isEmpty(), this.f, true ^ topGenreStory.f.isEmpty(), topGenreStory.f);
                this.g = fVar.a(this.g, topGenreStory.g);
                if (fVar == e.a) {
                    this.h |= topGenreStory.h;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                fky fky = (fky) obj2;
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
                                if (!this.g.a()) {
                                    this.g = GeneratedMessageLite.a(this.g);
                                }
                                this.g.add(fkw.a(Genre.parser(), fky));
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
                    synchronized (TopGenreStory.class) {
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
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            codedOutputStream.a(4, (fli) this.g.get(i2));
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int b = !this.d.isEmpty() ? CodedOutputStream.b(1, this.d) + 0 : 0;
        if (!this.e.isEmpty()) {
            b += CodedOutputStream.b(2, this.e);
        }
        if (!this.f.isEmpty()) {
            b += CodedOutputStream.b(3, this.f);
        }
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            b += CodedOutputStream.b(4, (fli) this.g.get(i3));
        }
        this.c = b;
        return b;
    }
}
