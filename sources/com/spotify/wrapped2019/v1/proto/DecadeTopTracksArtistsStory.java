package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class DecadeTopTracksArtistsStory extends GeneratedMessageLite<DecadeTopTracksArtistsStory, a> implements wfa {
    /* access modifiers changed from: private */
    public static final DecadeTopTracksArtistsStory g;
    private static volatile fll<DecadeTopTracksArtistsStory> h;
    public e<Year> d = flm.d();
    private int e;
    private Paragraph f;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<DecadeTopTracksArtistsStory, a> implements wfa {
        private a() {
            super(DecadeTopTracksArtistsStory.g);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        DecadeTopTracksArtistsStory decadeTopTracksArtistsStory = new DecadeTopTracksArtistsStory();
        g = decadeTopTracksArtistsStory;
        decadeTopTracksArtistsStory.e();
    }

    private DecadeTopTracksArtistsStory() {
    }

    public static DecadeTopTracksArtistsStory l() {
        return g;
    }

    public static fll<DecadeTopTracksArtistsStory> parser() {
        return g.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new DecadeTopTracksArtistsStory();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                this.d.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                DecadeTopTracksArtistsStory decadeTopTracksArtistsStory = (DecadeTopTracksArtistsStory) obj2;
                this.f = (Paragraph) fVar.a(this.f, decadeTopTracksArtistsStory.f);
                this.d = fVar.a(this.d, decadeTopTracksArtistsStory.d);
                if (fVar == e.a) {
                    this.e |= decadeTopTracksArtistsStory.e;
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
                                com.spotify.wrapped2019.v1.proto.Paragraph.a aVar = this.f != null ? (com.spotify.wrapped2019.v1.proto.Paragraph.a) this.f.h() : null;
                                this.f = (Paragraph) fkw.a(Paragraph.parser(), fky);
                                if (aVar != null) {
                                    aVar.a(this.f);
                                    this.f = (Paragraph) aVar.e();
                                }
                            } else if (a2 == 18) {
                                if (!this.d.a()) {
                                    this.d = GeneratedMessageLite.a(this.d);
                                }
                                this.d.add(fkw.a(Year.parser(), fky));
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
                if (h == null) {
                    synchronized (DecadeTopTracksArtistsStory.class) {
                        if (h == null) {
                            h = new b(g);
                        }
                    }
                }
                return h;
            default:
                throw new UnsupportedOperationException();
        }
        return g;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (this.f != null) {
            codedOutputStream.a(1, (fli) k());
        }
        for (int i = 0; i < this.d.size(); i++) {
            codedOutputStream.a(2, (fli) this.d.get(i));
        }
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int b = this.f != null ? CodedOutputStream.b(1, (fli) k()) + 0 : 0;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            b += CodedOutputStream.b(2, (fli) this.d.get(i2));
        }
        this.c = b;
        return b;
    }

    public final Paragraph k() {
        Paragraph paragraph = this.f;
        return paragraph == null ? Paragraph.k() : paragraph;
    }
}
