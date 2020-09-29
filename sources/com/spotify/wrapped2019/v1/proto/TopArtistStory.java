package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class TopArtistStory extends GeneratedMessageLite<TopArtistStory, a> implements wfq {
    /* access modifiers changed from: private */
    public static final TopArtistStory i;
    private static volatile fll<TopArtistStory> j;
    public String d;
    public String e;
    private Paragraph f;
    private Paragraph g;
    private Entity h;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<TopArtistStory, a> implements wfq {
        private a() {
            super(TopArtistStory.i);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        TopArtistStory topArtistStory = new TopArtistStory();
        i = topArtistStory;
        topArtistStory.e();
    }

    private TopArtistStory() {
        String str = "";
        this.d = str;
        this.e = str;
    }

    public static TopArtistStory n() {
        return i;
    }

    public static fll<TopArtistStory> parser() {
        return i.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new TopArtistStory();
            case IS_INITIALIZED:
                return i;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                TopArtistStory topArtistStory = (TopArtistStory) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !topArtistStory.d.isEmpty(), topArtistStory.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !topArtistStory.e.isEmpty(), topArtistStory.e);
                this.f = (Paragraph) fVar.a(this.f, topArtistStory.f);
                this.g = (Paragraph) fVar.a(this.g, topArtistStory.g);
                this.h = (Entity) fVar.a(this.h, topArtistStory.h);
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
                                com.spotify.wrapped2019.v1.proto.Paragraph.a aVar2 = this.g != null ? (com.spotify.wrapped2019.v1.proto.Paragraph.a) this.g.h() : null;
                                this.g = (Paragraph) fkw.a(Paragraph.parser(), fky);
                                if (aVar2 != null) {
                                    aVar2.a(this.g);
                                    this.g = (Paragraph) aVar2.e();
                                }
                            } else if (a2 == 42) {
                                com.spotify.wrapped2019.v1.proto.Entity.a aVar3 = this.h != null ? (com.spotify.wrapped2019.v1.proto.Entity.a) this.h.h() : null;
                                this.h = (Entity) fkw.a(Entity.parser(), fky);
                                if (aVar3 != null) {
                                    aVar3.a(this.h);
                                    this.h = (Entity) aVar3.e();
                                }
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
                    synchronized (TopArtistStory.class) {
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
            codedOutputStream.a(3, (fli) k());
        }
        if (this.g != null) {
            codedOutputStream.a(4, (fli) l());
        }
        if (this.h != null) {
            codedOutputStream.a(5, (fli) m());
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
            i3 += CodedOutputStream.b(3, (fli) k());
        }
        if (this.g != null) {
            i3 += CodedOutputStream.b(4, (fli) l());
        }
        if (this.h != null) {
            i3 += CodedOutputStream.b(5, (fli) m());
        }
        this.c = i3;
        return i3;
    }

    public final Paragraph k() {
        Paragraph paragraph = this.f;
        return paragraph == null ? Paragraph.k() : paragraph;
    }

    public final Paragraph l() {
        Paragraph paragraph = this.g;
        return paragraph == null ? Paragraph.k() : paragraph;
    }

    public final Entity m() {
        Entity entity = this.h;
        return entity == null ? Entity.k() : entity;
    }
}
