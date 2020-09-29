package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class SeasonStory extends GeneratedMessageLite<SeasonStory, a> implements wfn {
    /* access modifiers changed from: private */
    public static final SeasonStory l;
    private static volatile fll<SeasonStory> m;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<SeasonStory, a> implements wfn {
        private a() {
            super(SeasonStory.l);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        SeasonStory seasonStory = new SeasonStory();
        l = seasonStory;
        seasonStory.e();
    }

    private SeasonStory() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.i = str;
        this.j = str;
        this.k = str;
    }

    public static SeasonStory k() {
        return l;
    }

    public static fll<SeasonStory> parser() {
        return l.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new SeasonStory();
            case IS_INITIALIZED:
                return l;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                SeasonStory seasonStory = (SeasonStory) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !seasonStory.d.isEmpty(), seasonStory.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !seasonStory.e.isEmpty(), seasonStory.e);
                this.f = fVar.a(!this.f.isEmpty(), this.f, !seasonStory.f.isEmpty(), seasonStory.f);
                this.g = fVar.a(!this.g.isEmpty(), this.g, !seasonStory.g.isEmpty(), seasonStory.g);
                this.h = fVar.a(!this.h.isEmpty(), this.h, !seasonStory.h.isEmpty(), seasonStory.h);
                this.i = fVar.a(!this.i.isEmpty(), this.i, !seasonStory.i.isEmpty(), seasonStory.i);
                this.j = fVar.a(!this.j.isEmpty(), this.j, !seasonStory.j.isEmpty(), seasonStory.j);
                this.k = fVar.a(!this.k.isEmpty(), this.k, true ^ seasonStory.k.isEmpty(), seasonStory.k);
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
                            } else if (a2 == 50) {
                                this.i = fkw.d();
                            } else if (a2 == 58) {
                                this.j = fkw.d();
                            } else if (a2 == 66) {
                                this.k = fkw.d();
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
                if (m == null) {
                    synchronized (SeasonStory.class) {
                        if (m == null) {
                            m = new b(l);
                        }
                    }
                }
                return m;
            default:
                throw new UnsupportedOperationException();
        }
        return l;
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
        if (!this.i.isEmpty()) {
            codedOutputStream.a(6, this.i);
        }
        if (!this.j.isEmpty()) {
            codedOutputStream.a(7, this.j);
        }
        if (!this.k.isEmpty()) {
            codedOutputStream.a(8, this.k);
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
        if (!this.i.isEmpty()) {
            i3 += CodedOutputStream.b(6, this.i);
        }
        if (!this.j.isEmpty()) {
            i3 += CodedOutputStream.b(7, this.j);
        }
        if (!this.k.isEmpty()) {
            i3 += CodedOutputStream.b(8, this.k);
        }
        this.c = i3;
        return i3;
    }
}
