package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Recommendations extends GeneratedMessageLite<Recommendations, a> implements vwq {
    /* access modifiers changed from: private */
    public static final Recommendations g;
    private static volatile fll<Recommendations> h;
    public e<Entity> d = flm.d();
    private int e;
    private int f;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Recommendations, a> implements vwq {
        private a() {
            super(Recommendations.g);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Recommendations recommendations = new Recommendations();
        g = recommendations;
        recommendations.e();
    }

    private Recommendations() {
    }

    public static Recommendations l() {
        return g;
    }

    public static fll<Recommendations> parser() {
        return g.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = true;
        boolean z2 = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Recommendations();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                this.d.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Recommendations recommendations = (Recommendations) obj2;
                boolean z3 = this.f != 0;
                int i = this.f;
                if (recommendations.f == 0) {
                    z = false;
                }
                this.f = fVar.a(z3, i, z, recommendations.f);
                this.d = fVar.a(this.d, recommendations.d);
                if (fVar == e.a) {
                    this.e |= recommendations.e;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                fky fky = (fky) obj2;
                while (!z2) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 8) {
                                this.f = fkw.g();
                            } else if (a2 == 18) {
                                if (!this.d.a()) {
                                    this.d = GeneratedMessageLite.a(this.d);
                                }
                                this.d.add(fkw.a(Entity.parser(), fky));
                            } else if (!fkw.b(a2)) {
                            }
                        }
                        z2 = true;
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
                    synchronized (Recommendations.class) {
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
        if (this.f != RecommendationsType.RECOMMENDATIONS_TYPE_UNKNOWN.value) {
            codedOutputStream.b(1, this.f);
        }
        for (int i = 0; i < this.d.size(); i++) {
            codedOutputStream.a(2, (fli) this.d.get(i));
        }
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int j = this.f != RecommendationsType.RECOMMENDATIONS_TYPE_UNKNOWN.value ? CodedOutputStream.j(1, this.f) + 0 : 0;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            j += CodedOutputStream.b(2, (fli) this.d.get(i2));
        }
        this.c = j;
        return j;
    }

    public final RecommendationsType k() {
        RecommendationsType a2 = RecommendationsType.a(this.f);
        return a2 == null ? RecommendationsType.UNRECOGNIZED : a2;
    }
}
