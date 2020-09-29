package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class MainViewResponse extends GeneratedMessageLite<MainViewResponse, a> implements vwn {
    public static final defpackage.flc.d.a<Integer, EntityType> f = new defpackage.flc.d.a<Integer, EntityType>() {
        public final /* synthetic */ Object a(Object obj) {
            EntityType a = EntityType.a(((Integer) obj).intValue());
            return a == null ? EntityType.UNRECOGNIZED : a;
        }
    };
    /* access modifiers changed from: private */
    public static final MainViewResponse i;
    private static volatile fll<MainViewResponse> j;
    public e<Entity> d = flm.d();
    public c e = flb.d();
    private int g;
    private Recommendations h;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<MainViewResponse, a> implements vwn {
        private a() {
            super(MainViewResponse.i);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        MainViewResponse mainViewResponse = new MainViewResponse();
        i = mainViewResponse;
        mainViewResponse.e();
    }

    private MainViewResponse() {
    }

    public static fll<MainViewResponse> parser() {
        return i.c();
    }

    public final Entity a(int i2) {
        return (Entity) this.d.get(0);
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new MainViewResponse();
            case IS_INITIALIZED:
                return i;
            case MAKE_IMMUTABLE:
                this.d.b();
                this.e.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                MainViewResponse mainViewResponse = (MainViewResponse) obj2;
                this.d = fVar.a(this.d, mainViewResponse.d);
                this.h = (Recommendations) fVar.a(this.h, mainViewResponse.h);
                this.e = fVar.a(this.e, mainViewResponse.e);
                if (fVar == e.a) {
                    this.g |= mainViewResponse.g;
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
                                if (!this.d.a()) {
                                    this.d = GeneratedMessageLite.a(this.d);
                                }
                                this.d.add(fkw.a(Entity.parser(), fky));
                            } else if (a2 == 18) {
                                com.spotify.searchview.proto.Recommendations.a aVar = this.h != null ? (com.spotify.searchview.proto.Recommendations.a) this.h.h() : null;
                                this.h = (Recommendations) fkw.a(Recommendations.parser(), fky);
                                if (aVar != null) {
                                    aVar.a(this.h);
                                    this.h = (Recommendations) aVar.e();
                                }
                            } else if (a2 == 24) {
                                if (!this.e.a()) {
                                    this.e = GeneratedMessageLite.a(this.e);
                                }
                                this.e.d(fkw.g());
                            } else if (a2 == 26) {
                                if (!this.e.a()) {
                                    this.e = GeneratedMessageLite.a(this.e);
                                }
                                int c = fkw.c(fkw.g());
                                while (fkw.k() > 0) {
                                    this.e.d(fkw.g());
                                }
                                fkw.d(c);
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
                    synchronized (MainViewResponse.class) {
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
        j();
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            codedOutputStream.a(1, (fli) this.d.get(i2));
        }
        if (this.h != null) {
            codedOutputStream.a(2, (fli) k());
        }
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            codedOutputStream.b(3, this.e.b(i3));
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.d.size(); i4++) {
            i3 += CodedOutputStream.b(1, (fli) this.d.get(i4));
        }
        if (this.h != null) {
            i3 += CodedOutputStream.b(2, (fli) k());
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.e.size(); i6++) {
            i5 += CodedOutputStream.h(this.e.b(i6));
        }
        int size = i3 + i5 + (this.e.size() * 1);
        this.c = size;
        return size;
    }

    public final Recommendations k() {
        Recommendations recommendations = this.h;
        return recommendations == null ? Recommendations.l() : recommendations;
    }
}
