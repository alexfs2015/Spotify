package com.spotify.stories.v1.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Story extends GeneratedMessageLite<Story, a> implements wbe {
    /* access modifiers changed from: private */
    public static final Story k;
    private static volatile fll<Story> l;
    public String d;
    public String e;
    public String f;
    public e<Chapter> g = flm.d();
    private int h;
    private String i;
    private ContextMenu j;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Story, a> implements wbe {
        private a() {
            super(Story.k);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Story story = new Story();
        k = story;
        story.e();
    }

    private Story() {
        String str = "";
        this.i = str;
        this.d = str;
        this.e = str;
        this.f = str;
    }

    public static Story a(byte[] bArr) {
        return (Story) GeneratedMessageLite.a(k, bArr);
    }

    public static Story l() {
        return k;
    }

    private ContextMenu n() {
        ContextMenu contextMenu = this.j;
        return contextMenu == null ? ContextMenu.k() : contextMenu;
    }

    public static fll<Story> parser() {
        return k.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Story();
            case IS_INITIALIZED:
                return k;
            case MAKE_IMMUTABLE:
                this.g.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Story story = (Story) obj2;
                this.i = fVar.a(!this.i.isEmpty(), this.i, !story.i.isEmpty(), story.i);
                this.d = fVar.a(!this.d.isEmpty(), this.d, !story.d.isEmpty(), story.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !story.e.isEmpty(), story.e);
                this.f = fVar.a(!this.f.isEmpty(), this.f, !story.f.isEmpty(), story.f);
                this.g = fVar.a(this.g, story.g);
                this.j = (ContextMenu) fVar.a(this.j, story.j);
                if (fVar == e.a) {
                    this.h |= story.h;
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
                                this.i = fkw.d();
                            } else if (a2 == 18) {
                                this.d = fkw.d();
                            } else if (a2 == 26) {
                                this.e = fkw.d();
                            } else if (a2 == 34) {
                                this.f = fkw.d();
                            } else if (a2 == 42) {
                                if (!this.g.a()) {
                                    this.g = GeneratedMessageLite.a(this.g);
                                }
                                this.g.add(fkw.a(Chapter.parser(), fky));
                            } else if (a2 == 50) {
                                com.spotify.stories.v1.view.proto.ContextMenu.a aVar = this.j != null ? (com.spotify.stories.v1.view.proto.ContextMenu.a) this.j.h() : null;
                                this.j = (ContextMenu) fkw.a(ContextMenu.parser(), fky);
                                if (aVar != null) {
                                    aVar.a(this.j);
                                    this.j = (ContextMenu) aVar.e();
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
                if (l == null) {
                    synchronized (Story.class) {
                        if (l == null) {
                            l = new b(k);
                        }
                    }
                }
                return l;
            default:
                throw new UnsupportedOperationException();
        }
        return k;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.i.isEmpty()) {
            codedOutputStream.a(1, this.i);
        }
        if (!this.d.isEmpty()) {
            codedOutputStream.a(2, this.d);
        }
        if (!this.e.isEmpty()) {
            codedOutputStream.a(3, this.e);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.a(4, this.f);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            codedOutputStream.a(5, (fli) this.g.get(i2));
        }
        if (this.j != null) {
            codedOutputStream.a(6, (fli) n());
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int b = !this.i.isEmpty() ? CodedOutputStream.b(1, this.i) + 0 : 0;
        if (!this.d.isEmpty()) {
            b += CodedOutputStream.b(2, this.d);
        }
        if (!this.e.isEmpty()) {
            b += CodedOutputStream.b(3, this.e);
        }
        if (!this.f.isEmpty()) {
            b += CodedOutputStream.b(4, this.f);
        }
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            b += CodedOutputStream.b(5, (fli) this.g.get(i3));
        }
        if (this.j != null) {
            b += CodedOutputStream.b(6, (fli) n());
        }
        this.c = b;
        return b;
    }

    public final int k() {
        return this.g.size();
    }
}
