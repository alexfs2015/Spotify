package com.spotify.stories.v1.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Story extends GeneratedMessageLite<Story, a> implements vnw {
    /* access modifiers changed from: private */
    public static final Story j;
    private static volatile fkr<Story> k;
    public String d;
    public String e;
    public String f;
    public e<Chapter> g = fks.d();
    private int h;
    private String i;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Story, a> implements vnw {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(Story.j);
        }
    }

    private Story() {
        String str = "";
        this.i = str;
        this.d = str;
        this.e = str;
        this.f = str;
    }

    public final int k() {
        return this.g.size();
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
            codedOutputStream.a(5, (fko) this.g.get(i2));
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
            b += CodedOutputStream.b(5, (fko) this.g.get(i3));
        }
        this.c = b;
        return b;
    }

    public static Story a(byte[] bArr) {
        return (Story) GeneratedMessageLite.a(j, bArr);
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Story();
            case IS_INITIALIZED:
                return j;
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
                this.f = fVar.a(!this.f.isEmpty(), this.f, true ^ story.f.isEmpty(), story.f);
                this.g = fVar.a(this.g, story.g);
                if (fVar == e.a) {
                    this.h |= story.h;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                fke fke = (fke) obj2;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                this.i = fkc.d();
                            } else if (a2 == 18) {
                                this.d = fkc.d();
                            } else if (a2 == 26) {
                                this.e = fkc.d();
                            } else if (a2 == 34) {
                                this.f = fkc.d();
                            } else if (a2 == 42) {
                                if (!this.g.a()) {
                                    this.g = GeneratedMessageLite.a(this.g);
                                }
                                this.g.add(fkc.a(Chapter.parser(), fke));
                            } else if (!fkc.b(a2)) {
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
                if (k == null) {
                    synchronized (Story.class) {
                        if (k == null) {
                            k = new b(j);
                        }
                    }
                }
                return k;
            default:
                throw new UnsupportedOperationException();
        }
        return j;
    }

    static {
        Story story = new Story();
        j = story;
        story.e();
    }

    public static Story l() {
        return j;
    }

    public static fkr<Story> parser() {
        return j.c();
    }
}
