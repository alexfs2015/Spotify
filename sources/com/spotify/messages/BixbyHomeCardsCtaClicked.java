package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class BixbyHomeCardsCtaClicked extends GeneratedMessageLite<BixbyHomeCardsCtaClicked, a> implements gqt {
    /* access modifiers changed from: private */
    public static final BixbyHomeCardsCtaClicked i;
    private static volatile fll<BixbyHomeCardsCtaClicked> j;
    private int d;
    private int e;
    private String f;
    private String g;
    private String h;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<BixbyHomeCardsCtaClicked, a> implements gqt {
        private a() {
            super(BixbyHomeCardsCtaClicked.i);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(int i) {
            b();
            BixbyHomeCardsCtaClicked.a((BixbyHomeCardsCtaClicked) this.a, i);
            return this;
        }

        public final a a(String str) {
            b();
            BixbyHomeCardsCtaClicked.a((BixbyHomeCardsCtaClicked) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            BixbyHomeCardsCtaClicked.b((BixbyHomeCardsCtaClicked) this.a, str);
            return this;
        }

        public final a c(String str) {
            b();
            BixbyHomeCardsCtaClicked.c((BixbyHomeCardsCtaClicked) this.a, str);
            return this;
        }
    }

    static {
        BixbyHomeCardsCtaClicked bixbyHomeCardsCtaClicked = new BixbyHomeCardsCtaClicked();
        i = bixbyHomeCardsCtaClicked;
        bixbyHomeCardsCtaClicked.e();
    }

    private BixbyHomeCardsCtaClicked() {
        String str = "";
        this.f = str;
        this.g = str;
        this.h = str;
    }

    static /* synthetic */ void a(BixbyHomeCardsCtaClicked bixbyHomeCardsCtaClicked, int i2) {
        bixbyHomeCardsCtaClicked.d |= 1;
        bixbyHomeCardsCtaClicked.e = i2;
    }

    static /* synthetic */ void a(BixbyHomeCardsCtaClicked bixbyHomeCardsCtaClicked, String str) {
        if (str != null) {
            bixbyHomeCardsCtaClicked.d |= 2;
            bixbyHomeCardsCtaClicked.f = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(BixbyHomeCardsCtaClicked bixbyHomeCardsCtaClicked, String str) {
        if (str != null) {
            bixbyHomeCardsCtaClicked.d |= 4;
            bixbyHomeCardsCtaClicked.g = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void c(BixbyHomeCardsCtaClicked bixbyHomeCardsCtaClicked, String str) {
        if (str != null) {
            bixbyHomeCardsCtaClicked.d |= 8;
            bixbyHomeCardsCtaClicked.h = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a k() {
        return (a) i.h();
    }

    private boolean m() {
        return (this.d & 1) == 1;
    }

    private boolean n() {
        return (this.d & 2) == 2;
    }

    private boolean o() {
        return (this.d & 4) == 4;
    }

    private boolean p() {
        return (this.d & 8) == 8;
    }

    public static fll<BixbyHomeCardsCtaClicked> parser() {
        return i.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new BixbyHomeCardsCtaClicked();
            case IS_INITIALIZED:
                return i;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                BixbyHomeCardsCtaClicked bixbyHomeCardsCtaClicked = (BixbyHomeCardsCtaClicked) obj2;
                this.e = fVar.a(m(), this.e, bixbyHomeCardsCtaClicked.m(), bixbyHomeCardsCtaClicked.e);
                this.f = fVar.a(n(), this.f, bixbyHomeCardsCtaClicked.n(), bixbyHomeCardsCtaClicked.f);
                this.g = fVar.a(o(), this.g, bixbyHomeCardsCtaClicked.o(), bixbyHomeCardsCtaClicked.g);
                this.h = fVar.a(p(), this.h, bixbyHomeCardsCtaClicked.p(), bixbyHomeCardsCtaClicked.h);
                if (fVar == e.a) {
                    this.d |= bixbyHomeCardsCtaClicked.d;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 8) {
                                this.d |= 1;
                                this.e = fkw.g();
                            } else if (a2 == 18) {
                                String c = fkw.c();
                                this.d |= 2;
                                this.f = c;
                            } else if (a2 == 26) {
                                String c2 = fkw.c();
                                this.d |= 4;
                                this.g = c2;
                            } else if (a2 == 34) {
                                String c3 = fkw.c();
                                this.d = 8 | this.d;
                                this.h = c3;
                            } else if (!a(a2, fkw)) {
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
                    synchronized (BixbyHomeCardsCtaClicked.class) {
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
        if ((this.d & 1) == 1) {
            codedOutputStream.b(1, this.e);
        }
        if ((this.d & 2) == 2) {
            codedOutputStream.a(2, this.f);
        }
        if ((this.d & 4) == 4) {
            codedOutputStream.a(3, this.g);
        }
        if ((this.d & 8) == 8) {
            codedOutputStream.a(4, this.h);
        }
        this.b.a(codedOutputStream);
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.d & 1) == 1) {
            i3 = 0 + CodedOutputStream.f(1, this.e);
        }
        if ((this.d & 2) == 2) {
            i3 += CodedOutputStream.b(2, this.f);
        }
        if ((this.d & 4) == 4) {
            i3 += CodedOutputStream.b(3, this.g);
        }
        if ((this.d & 8) == 8) {
            i3 += CodedOutputStream.b(4, this.h);
        }
        int d2 = i3 + this.b.d();
        this.c = d2;
        return d2;
    }
}
