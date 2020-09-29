package com.spotify.stories.v1.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class ContextItem extends GeneratedMessageLite<ContextItem, a> implements wbc {
    /* access modifiers changed from: private */
    public static final ContextItem g;
    private static volatile fll<ContextItem> h;
    private String d;
    private String e;
    private String f;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ContextItem, a> implements wbc {
        private a() {
            super(ContextItem.g);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        ContextItem contextItem = new ContextItem();
        g = contextItem;
        contextItem.e();
    }

    private ContextItem() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = str;
    }

    public static fll<ContextItem> parser() {
        return g.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new ContextItem();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                ContextItem contextItem = (ContextItem) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !contextItem.d.isEmpty(), contextItem.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !contextItem.e.isEmpty(), contextItem.e);
                this.f = fVar.a(!this.f.isEmpty(), this.f, true ^ contextItem.f.isEmpty(), contextItem.f);
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
                    synchronized (ContextItem.class) {
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
        if (!this.e.isEmpty()) {
            codedOutputStream.a(2, this.e);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.a(3, this.f);
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
        if (!this.e.isEmpty()) {
            i2 += CodedOutputStream.b(2, this.e);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.b(3, this.f);
        }
        this.c = i2;
        return i2;
    }
}
