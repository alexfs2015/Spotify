package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class GlobalCitizenStory extends GeneratedMessageLite<GlobalCitizenStory, a> implements wff {
    /* access modifiers changed from: private */
    public static final GlobalCitizenStory i;
    private static volatile fll<GlobalCitizenStory> j;
    public String d;
    public String e;
    public e<Entity> f = flm.d();
    private int g;
    private Paragraph h;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<GlobalCitizenStory, a> implements wff {
        private a() {
            super(GlobalCitizenStory.i);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        GlobalCitizenStory globalCitizenStory = new GlobalCitizenStory();
        i = globalCitizenStory;
        globalCitizenStory.e();
    }

    private GlobalCitizenStory() {
        String str = "";
        this.d = str;
        this.e = str;
    }

    public static GlobalCitizenStory l() {
        return i;
    }

    public static fll<GlobalCitizenStory> parser() {
        return i.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new GlobalCitizenStory();
            case IS_INITIALIZED:
                return i;
            case MAKE_IMMUTABLE:
                this.f.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                GlobalCitizenStory globalCitizenStory = (GlobalCitizenStory) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !globalCitizenStory.d.isEmpty(), globalCitizenStory.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !globalCitizenStory.e.isEmpty(), globalCitizenStory.e);
                this.h = (Paragraph) fVar.a(this.h, globalCitizenStory.h);
                this.f = fVar.a(this.f, globalCitizenStory.f);
                if (fVar == e.a) {
                    this.g |= globalCitizenStory.g;
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
                                com.spotify.wrapped2019.v1.proto.Paragraph.a aVar = this.h != null ? (com.spotify.wrapped2019.v1.proto.Paragraph.a) this.h.h() : null;
                                this.h = (Paragraph) fkw.a(Paragraph.parser(), fky);
                                if (aVar != null) {
                                    aVar.a(this.h);
                                    this.h = (Paragraph) aVar.e();
                                }
                            } else if (a2 == 34) {
                                if (!this.f.a()) {
                                    this.f = GeneratedMessageLite.a(this.f);
                                }
                                this.f.add(fkw.a(Entity.parser(), fky));
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
                    synchronized (GlobalCitizenStory.class) {
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
        if (this.h != null) {
            codedOutputStream.a(3, (fli) k());
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            codedOutputStream.a(4, (fli) this.f.get(i2));
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
        if (this.h != null) {
            b += CodedOutputStream.b(3, (fli) k());
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            b += CodedOutputStream.b(4, (fli) this.f.get(i3));
        }
        this.c = b;
        return b;
    }

    public final Paragraph k() {
        Paragraph paragraph = this.h;
        return paragraph == null ? Paragraph.k() : paragraph;
    }
}
