package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PremiumStory extends GeneratedMessageLite<PremiumStory, a> implements wfk {
    /* access modifiers changed from: private */
    public static final PremiumStory i;
    private static volatile fll<PremiumStory> j;
    private String d;
    private String e;
    private Paragraph f;
    private EntityInfo g;
    private String h;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<PremiumStory, a> implements wfk {
        private a() {
            super(PremiumStory.i);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        PremiumStory premiumStory = new PremiumStory();
        i = premiumStory;
        premiumStory.e();
    }

    private PremiumStory() {
        String str = "";
        this.d = str;
        this.e = str;
        this.h = str;
    }

    public static PremiumStory k() {
        return i;
    }

    private Paragraph m() {
        Paragraph paragraph = this.f;
        return paragraph == null ? Paragraph.k() : paragraph;
    }

    private EntityInfo n() {
        EntityInfo entityInfo = this.g;
        return entityInfo == null ? EntityInfo.m() : entityInfo;
    }

    public static fll<PremiumStory> parser() {
        return i.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new PremiumStory();
            case IS_INITIALIZED:
                return i;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                PremiumStory premiumStory = (PremiumStory) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !premiumStory.d.isEmpty(), premiumStory.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !premiumStory.e.isEmpty(), premiumStory.e);
                this.f = (Paragraph) fVar.a(this.f, premiumStory.f);
                this.g = (EntityInfo) fVar.a(this.g, premiumStory.g);
                this.h = fVar.a(!this.h.isEmpty(), this.h, !premiumStory.h.isEmpty(), premiumStory.h);
                e eVar = e.a;
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
                                com.spotify.wrapped2019.v1.proto.Paragraph.a aVar = this.f != null ? (com.spotify.wrapped2019.v1.proto.Paragraph.a) this.f.h() : null;
                                this.f = (Paragraph) fkw.a(Paragraph.parser(), fky);
                                if (aVar != null) {
                                    aVar.a(this.f);
                                    this.f = (Paragraph) aVar.e();
                                }
                            } else if (a2 == 34) {
                                com.spotify.wrapped2019.v1.proto.EntityInfo.a aVar2 = this.g != null ? (com.spotify.wrapped2019.v1.proto.EntityInfo.a) this.g.h() : null;
                                this.g = (EntityInfo) fkw.a(EntityInfo.parser(), fky);
                                if (aVar2 != null) {
                                    aVar2.a(this.g);
                                    this.g = (EntityInfo) aVar2.e();
                                }
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
                    synchronized (PremiumStory.class) {
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
        if (this.f != null) {
            codedOutputStream.a(3, (fli) m());
        }
        if (this.g != null) {
            codedOutputStream.a(4, (fli) n());
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
        if (this.f != null) {
            i3 += CodedOutputStream.b(3, (fli) m());
        }
        if (this.g != null) {
            i3 += CodedOutputStream.b(4, (fli) n());
        }
        if (!this.h.isEmpty()) {
            i3 += CodedOutputStream.b(5, this.h);
        }
        this.c = i3;
        return i3;
    }
}
