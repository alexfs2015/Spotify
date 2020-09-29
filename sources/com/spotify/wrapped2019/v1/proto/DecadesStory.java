package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class DecadesStory extends GeneratedMessageLite<DecadesStory, a> implements wfb {
    /* access modifiers changed from: private */
    public static final DecadesStory g;
    private static volatile fll<DecadesStory> h;
    public String d = "";
    private Paragraph e;
    private Paragraph f;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<DecadesStory, a> implements wfb {
        private a() {
            super(DecadesStory.g);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        DecadesStory decadesStory = new DecadesStory();
        g = decadesStory;
        decadesStory.e();
    }

    private DecadesStory() {
    }

    public static DecadesStory m() {
        return g;
    }

    public static fll<DecadesStory> parser() {
        return g.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new DecadesStory();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                DecadesStory decadesStory = (DecadesStory) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !decadesStory.d.isEmpty(), decadesStory.d);
                this.e = (Paragraph) fVar.a(this.e, decadesStory.e);
                this.f = (Paragraph) fVar.a(this.f, decadesStory.f);
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
                                com.spotify.wrapped2019.v1.proto.Paragraph.a aVar = this.e != null ? (com.spotify.wrapped2019.v1.proto.Paragraph.a) this.e.h() : null;
                                this.e = (Paragraph) fkw.a(Paragraph.parser(), fky);
                                if (aVar != null) {
                                    aVar.a(this.e);
                                    this.e = (Paragraph) aVar.e();
                                }
                            } else if (a2 == 26) {
                                com.spotify.wrapped2019.v1.proto.Paragraph.a aVar2 = this.f != null ? (com.spotify.wrapped2019.v1.proto.Paragraph.a) this.f.h() : null;
                                this.f = (Paragraph) fkw.a(Paragraph.parser(), fky);
                                if (aVar2 != null) {
                                    aVar2.a(this.f);
                                    this.f = (Paragraph) aVar2.e();
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
                if (h == null) {
                    synchronized (DecadesStory.class) {
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
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        if (this.e != null) {
            codedOutputStream.a(2, (fli) k());
        }
        if (this.f != null) {
            codedOutputStream.a(3, (fli) l());
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
        if (this.e != null) {
            i2 += CodedOutputStream.b(2, (fli) k());
        }
        if (this.f != null) {
            i2 += CodedOutputStream.b(3, (fli) l());
        }
        this.c = i2;
        return i2;
    }

    public final Paragraph k() {
        Paragraph paragraph = this.e;
        return paragraph == null ? Paragraph.k() : paragraph;
    }

    public final Paragraph l() {
        Paragraph paragraph = this.f;
        return paragraph == null ? Paragraph.k() : paragraph;
    }
}
