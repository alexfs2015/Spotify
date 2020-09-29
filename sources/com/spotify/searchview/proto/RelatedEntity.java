package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class RelatedEntity extends GeneratedMessageLite<RelatedEntity, a> implements vjl {
    /* access modifiers changed from: private */
    public static final RelatedEntity f;
    private static volatile fkr<RelatedEntity> g;
    public String d;
    private String e;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<RelatedEntity, a> implements vjl {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(RelatedEntity.f);
        }
    }

    private RelatedEntity() {
        String str = "";
        this.d = str;
        this.e = str;
    }

    public final String k() {
        return this.e;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        if (!this.e.isEmpty()) {
            codedOutputStream.a(2, k());
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
            i2 += CodedOutputStream.b(2, k());
        }
        this.c = i2;
        return i2;
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new RelatedEntity();
            case IS_INITIALIZED:
                return f;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                RelatedEntity relatedEntity = (RelatedEntity) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !relatedEntity.d.isEmpty(), relatedEntity.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, true ^ relatedEntity.e.isEmpty(), relatedEntity.e);
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                this.d = fkc.d();
                            } else if (a2 == 18) {
                                this.e = fkc.d();
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
                if (g == null) {
                    synchronized (RelatedEntity.class) {
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

    static {
        RelatedEntity relatedEntity = new RelatedEntity();
        f = relatedEntity;
        relatedEntity.e();
    }

    public static RelatedEntity l() {
        return f;
    }

    public static fkr<RelatedEntity> parser() {
        return f.c();
    }
}
