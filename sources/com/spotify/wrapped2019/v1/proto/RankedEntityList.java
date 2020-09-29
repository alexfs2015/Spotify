package com.spotify.wrapped2019.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class RankedEntityList extends GeneratedMessageLite<RankedEntityList, a> implements wfl {
    /* access modifiers changed from: private */
    public static final RankedEntityList g;
    private static volatile fll<RankedEntityList> h;
    public String d = "";
    public e<RankedEntity> e = flm.d();
    private int f;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<RankedEntityList, a> implements wfl {
        private a() {
            super(RankedEntityList.g);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        RankedEntityList rankedEntityList = new RankedEntityList();
        g = rankedEntityList;
        rankedEntityList.e();
    }

    private RankedEntityList() {
    }

    public static RankedEntityList k() {
        return g;
    }

    public static fll<RankedEntityList> parser() {
        return g.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new RankedEntityList();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                this.e.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                RankedEntityList rankedEntityList = (RankedEntityList) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, true ^ rankedEntityList.d.isEmpty(), rankedEntityList.d);
                this.e = fVar.a(this.e, rankedEntityList.e);
                if (fVar == e.a) {
                    this.f |= rankedEntityList.f;
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
                                if (!this.e.a()) {
                                    this.e = GeneratedMessageLite.a(this.e);
                                }
                                this.e.add(fkw.a(RankedEntity.parser(), fky));
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
                    synchronized (RankedEntityList.class) {
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
        for (int i = 0; i < this.e.size(); i++) {
            codedOutputStream.a(2, (fli) this.e.get(i));
        }
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int b = !this.d.isEmpty() ? CodedOutputStream.b(1, this.d) + 0 : 0;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            b += CodedOutputStream.b(2, (fli) this.e.get(i2));
        }
        this.c = b;
        return b;
    }
}
