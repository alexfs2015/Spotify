package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class MainViewResponse extends GeneratedMessageLite<MainViewResponse, a> implements vjh {
    public static final defpackage.fki.d.a<Integer, EntityType> f = new defpackage.fki.d.a<Integer, EntityType>() {
        public final /* synthetic */ Object a(Object obj) {
            EntityType a = EntityType.a(((Integer) obj).intValue());
            return a == null ? EntityType.UNRECOGNIZED : a;
        }
    };
    /* access modifiers changed from: private */
    public static final MainViewResponse i;
    private static volatile fkr<MainViewResponse> j;
    public e<Entity> d = fks.d();
    public c e = fkh.d();
    private int g;
    private Recommendations h;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<MainViewResponse, a> implements vjh {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(MainViewResponse.i);
        }
    }

    private MainViewResponse() {
    }

    public final Entity a(int i2) {
        return (Entity) this.d.get(0);
    }

    public final Recommendations k() {
        Recommendations recommendations = this.h;
        return recommendations == null ? Recommendations.l() : recommendations;
    }

    static {
        MainViewResponse mainViewResponse = new MainViewResponse();
        i = mainViewResponse;
        mainViewResponse.e();
    }

    public final void a(CodedOutputStream codedOutputStream) {
        j();
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            codedOutputStream.a(1, (fko) this.d.get(i2));
        }
        if (this.h != null) {
            codedOutputStream.a(2, (fko) k());
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
            i3 += CodedOutputStream.b(1, (fko) this.d.get(i4));
        }
        if (this.h != null) {
            i3 += CodedOutputStream.b(2, (fko) k());
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.e.size(); i6++) {
            i5 += CodedOutputStream.h(this.e.b(i6));
        }
        int size = i3 + i5 + (this.e.size() * 1);
        this.c = size;
        return size;
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
                fkc fkc = (fkc) obj;
                fke fke = (fke) obj2;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                if (!this.d.a()) {
                                    this.d = GeneratedMessageLite.a(this.d);
                                }
                                this.d.add(fkc.a(Entity.parser(), fke));
                            } else if (a2 == 18) {
                                com.spotify.searchview.proto.Recommendations.a aVar = this.h != null ? (com.spotify.searchview.proto.Recommendations.a) this.h.h() : null;
                                this.h = (Recommendations) fkc.a(Recommendations.parser(), fke);
                                if (aVar != null) {
                                    aVar.a(this.h);
                                    this.h = (Recommendations) aVar.e();
                                }
                            } else if (a2 == 24) {
                                if (!this.e.a()) {
                                    this.e = GeneratedMessageLite.a(this.e);
                                }
                                this.e.d(fkc.g());
                            } else if (a2 == 26) {
                                if (!this.e.a()) {
                                    this.e = GeneratedMessageLite.a(this.e);
                                }
                                int c = fkc.c(fkc.g());
                                while (fkc.k() > 0) {
                                    this.e.d(fkc.g());
                                }
                                fkc.d(c);
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

    public static fkr<MainViewResponse> parser() {
        return i.c();
    }
}
