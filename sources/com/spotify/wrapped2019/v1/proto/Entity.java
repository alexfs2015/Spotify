package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Entity extends GeneratedMessageLite<Entity, a> implements wfd {
    /* access modifiers changed from: private */
    public static final Entity j;
    private static volatile fll<Entity> k;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    private String i;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Entity, a> implements wfd {
        private a() {
            super(Entity.j);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Entity entity = new Entity();
        j = entity;
        entity.e();
    }

    private Entity() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.i = str;
    }

    public static Entity k() {
        return j;
    }

    public static fll<Entity> parser() {
        return j.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Entity();
            case IS_INITIALIZED:
                return j;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Entity entity = (Entity) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !entity.d.isEmpty(), entity.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !entity.e.isEmpty(), entity.e);
                this.f = fVar.a(!this.f.isEmpty(), this.f, !entity.f.isEmpty(), entity.f);
                this.g = fVar.a(!this.g.isEmpty(), this.g, !entity.g.isEmpty(), entity.g);
                this.h = fVar.a(!this.h.isEmpty(), this.h, !entity.h.isEmpty(), entity.h);
                this.i = fVar.a(!this.i.isEmpty(), this.i, true ^ entity.i.isEmpty(), entity.i);
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
                            } else if (a2 == 34) {
                                this.g = fkw.d();
                            } else if (a2 == 42) {
                                this.h = fkw.d();
                            } else if (a2 == 50) {
                                this.i = fkw.d();
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
                if (k == null) {
                    synchronized (Entity.class) {
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
        if (!this.g.isEmpty()) {
            codedOutputStream.a(4, this.g);
        }
        if (!this.h.isEmpty()) {
            codedOutputStream.a(5, this.h);
        }
        if (!this.i.isEmpty()) {
            codedOutputStream.a(6, this.i);
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
        if (!this.f.isEmpty()) {
            i3 += CodedOutputStream.b(3, this.f);
        }
        if (!this.g.isEmpty()) {
            i3 += CodedOutputStream.b(4, this.g);
        }
        if (!this.h.isEmpty()) {
            i3 += CodedOutputStream.b(5, this.h);
        }
        if (!this.i.isEmpty()) {
            i3 += CodedOutputStream.b(6, this.i);
        }
        this.c = i3;
        return i3;
    }
}
