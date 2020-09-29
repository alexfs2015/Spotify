package com.spotify.hubs.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class UIComponent extends GeneratedMessageLite<UIComponent, a> implements gki {
    /* access modifiers changed from: private */
    public static final UIComponent f;
    private static volatile fll<UIComponent> g;
    public String d;
    public String e;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<UIComponent, a> implements gki {
        private a() {
            super(UIComponent.f);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        UIComponent uIComponent = new UIComponent();
        f = uIComponent;
        uIComponent.e();
    }

    private UIComponent() {
        String str = "";
        this.d = str;
        this.e = str;
    }

    public static UIComponent k() {
        return f;
    }

    public static fll<UIComponent> parser() {
        return f.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new UIComponent();
            case IS_INITIALIZED:
                return f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                UIComponent uIComponent = (UIComponent) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !uIComponent.d.isEmpty(), uIComponent.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, true ^ uIComponent.e.isEmpty(), uIComponent.e);
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
                if (g == null) {
                    synchronized (UIComponent.class) {
                        if (g == null) {
                            g = new b(f);
                        }
                    }
                }
                return g;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        if (!this.e.isEmpty()) {
            codedOutputStream.a(2, this.e);
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
        this.c = i2;
        return i2;
    }
}
