package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Year extends GeneratedMessageLite<Year, a> implements wfu {
    /* access modifiers changed from: private */
    public static final Year h;
    private static volatile fll<Year> i;
    public String d;
    public String e;
    private Entity f;
    private Entity g;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Year, a> implements wfu {
        private a() {
            super(Year.h);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Year year = new Year();
        h = year;
        year.e();
    }

    private Year() {
        String str = "";
        this.d = str;
        this.e = str;
    }

    public static fll<Year> parser() {
        return h.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Year();
            case IS_INITIALIZED:
                return h;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Year year = (Year) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !year.d.isEmpty(), year.d);
                this.f = (Entity) fVar.a(this.f, year.f);
                this.g = (Entity) fVar.a(this.g, year.g);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !year.e.isEmpty(), year.e);
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
                                com.spotify.wrapped2019.v1.proto.Entity.a aVar = this.f != null ? (com.spotify.wrapped2019.v1.proto.Entity.a) this.f.h() : null;
                                this.f = (Entity) fkw.a(Entity.parser(), fky);
                                if (aVar != null) {
                                    aVar.a(this.f);
                                    this.f = (Entity) aVar.e();
                                }
                            } else if (a2 == 26) {
                                com.spotify.wrapped2019.v1.proto.Entity.a aVar2 = this.g != null ? (com.spotify.wrapped2019.v1.proto.Entity.a) this.g.h() : null;
                                this.g = (Entity) fkw.a(Entity.parser(), fky);
                                if (aVar2 != null) {
                                    aVar2.a(this.g);
                                    this.g = (Entity) aVar2.e();
                                }
                            } else if (a2 == 34) {
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
                if (i == null) {
                    synchronized (Year.class) {
                        if (i == null) {
                            i = new b(h);
                        }
                    }
                }
                return i;
            default:
                throw new UnsupportedOperationException();
        }
        return h;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        if (this.f != null) {
            codedOutputStream.a(2, (fli) k());
        }
        if (this.g != null) {
            codedOutputStream.a(3, (fli) l());
        }
        if (!this.e.isEmpty()) {
            codedOutputStream.a(4, this.e);
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
        if (this.f != null) {
            i3 += CodedOutputStream.b(2, (fli) k());
        }
        if (this.g != null) {
            i3 += CodedOutputStream.b(3, (fli) l());
        }
        if (!this.e.isEmpty()) {
            i3 += CodedOutputStream.b(4, this.e);
        }
        this.c = i3;
        return i3;
    }

    public final Entity k() {
        Entity entity = this.f;
        return entity == null ? Entity.k() : entity;
    }

    public final Entity l() {
        Entity entity = this.g;
        return entity == null ? Entity.k() : entity;
    }
}
