package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class UbiExpr1Impression extends GeneratedMessageLite<UbiExpr1Impression, a> implements gpp {
    /* access modifiers changed from: private */
    public static final UbiExpr1Impression q;
    private static volatile fkr<UbiExpr1Impression> r;
    private int d;
    private String e;
    private String f;
    private String g;
    private e<String> h = fks.d();
    private e<String> i = fks.d();
    private e<String> j = fks.d();
    private e<String> k = fks.d();
    private String l;
    private String m;
    private e<String> n;
    private String o;
    private String p;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<UbiExpr1Impression, a> implements gpp {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(UbiExpr1Impression.q);
        }

        public final a a(String str) {
            b();
            UbiExpr1Impression.a((UbiExpr1Impression) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            UbiExpr1Impression.b((UbiExpr1Impression) this.a, str);
            return this;
        }

        public final a c(String str) {
            b();
            UbiExpr1Impression.c((UbiExpr1Impression) this.a, str);
            return this;
        }

        public final a d(String str) {
            b();
            UbiExpr1Impression.d((UbiExpr1Impression) this.a, str);
            return this;
        }

        public final a e(String str) {
            b();
            UbiExpr1Impression.e((UbiExpr1Impression) this.a, str);
            return this;
        }

        public final a f(String str) {
            b();
            UbiExpr1Impression.f((UbiExpr1Impression) this.a, str);
            return this;
        }

        public final a g(String str) {
            b();
            UbiExpr1Impression.g((UbiExpr1Impression) this.a, str);
            return this;
        }

        public final a h(String str) {
            b();
            UbiExpr1Impression.h((UbiExpr1Impression) this.a, str);
            return this;
        }

        public final a i(String str) {
            b();
            UbiExpr1Impression.i((UbiExpr1Impression) this.a, str);
            return this;
        }

        public final a j(String str) {
            b();
            UbiExpr1Impression.j((UbiExpr1Impression) this.a, str);
            return this;
        }
    }

    private UbiExpr1Impression() {
        String str = "";
        this.e = str;
        this.f = str;
        this.g = str;
        this.l = str;
        this.m = str;
        this.n = fks.d();
        this.o = str;
        this.p = str;
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

    private boolean q() {
        return (this.d & 16) == 16;
    }

    private boolean r() {
        return (this.d & 32) == 32;
    }

    private boolean s() {
        return (this.d & 64) == 64;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        if ((this.d & 1) == 1) {
            codedOutputStream.a(1, this.e);
        }
        if ((this.d & 2) == 2) {
            codedOutputStream.a(2, this.f);
        }
        if ((this.d & 4) == 4) {
            codedOutputStream.a(3, this.g);
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            codedOutputStream.a(4, (String) this.h.get(i2));
        }
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            codedOutputStream.a(5, (String) this.i.get(i3));
        }
        for (int i4 = 0; i4 < this.j.size(); i4++) {
            codedOutputStream.a(6, (String) this.j.get(i4));
        }
        for (int i5 = 0; i5 < this.k.size(); i5++) {
            codedOutputStream.a(7, (String) this.k.get(i5));
        }
        if ((this.d & 8) == 8) {
            codedOutputStream.a(8, this.l);
        }
        if ((this.d & 16) == 16) {
            codedOutputStream.a(9, this.m);
        }
        for (int i6 = 0; i6 < this.n.size(); i6++) {
            codedOutputStream.a(10, (String) this.n.get(i6));
        }
        if ((this.d & 32) == 32) {
            codedOutputStream.a(11, this.o);
        }
        if ((this.d & 64) == 64) {
            codedOutputStream.a(12, this.p);
        }
        this.b.a(codedOutputStream);
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int b = (this.d & 1) == 1 ? CodedOutputStream.b(1, this.e) + 0 : 0;
        if ((this.d & 2) == 2) {
            b += CodedOutputStream.b(2, this.f);
        }
        if ((this.d & 4) == 4) {
            b += CodedOutputStream.b(3, this.g);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.h.size(); i4++) {
            i3 += CodedOutputStream.b((String) this.h.get(i4));
        }
        int size = b + i3 + (this.h.size() * 1);
        int i5 = 0;
        for (int i6 = 0; i6 < this.i.size(); i6++) {
            i5 += CodedOutputStream.b((String) this.i.get(i6));
        }
        int size2 = size + i5 + (this.i.size() * 1);
        int i7 = 0;
        for (int i8 = 0; i8 < this.j.size(); i8++) {
            i7 += CodedOutputStream.b((String) this.j.get(i8));
        }
        int size3 = size2 + i7 + (this.j.size() * 1);
        int i9 = 0;
        for (int i10 = 0; i10 < this.k.size(); i10++) {
            i9 += CodedOutputStream.b((String) this.k.get(i10));
        }
        int size4 = size3 + i9 + (this.k.size() * 1);
        if ((this.d & 8) == 8) {
            size4 += CodedOutputStream.b(8, this.l);
        }
        if ((this.d & 16) == 16) {
            size4 += CodedOutputStream.b(9, this.m);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.n.size(); i12++) {
            i11 += CodedOutputStream.b((String) this.n.get(i12));
        }
        int size5 = size4 + i11 + (this.n.size() * 1);
        if ((this.d & 32) == 32) {
            size5 += CodedOutputStream.b(11, this.o);
        }
        if ((this.d & 64) == 64) {
            size5 += CodedOutputStream.b(12, this.p);
        }
        int d2 = size5 + this.b.d();
        this.c = d2;
        return d2;
    }

    public static a k() {
        return (a) q.h();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new UbiExpr1Impression();
            case IS_INITIALIZED:
                return q;
            case MAKE_IMMUTABLE:
                this.h.b();
                this.i.b();
                this.j.b();
                this.k.b();
                this.n.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                UbiExpr1Impression ubiExpr1Impression = (UbiExpr1Impression) obj2;
                this.e = fVar.a(m(), this.e, ubiExpr1Impression.m(), ubiExpr1Impression.e);
                this.f = fVar.a(n(), this.f, ubiExpr1Impression.n(), ubiExpr1Impression.f);
                this.g = fVar.a(o(), this.g, ubiExpr1Impression.o(), ubiExpr1Impression.g);
                this.h = fVar.a(this.h, ubiExpr1Impression.h);
                this.i = fVar.a(this.i, ubiExpr1Impression.i);
                this.j = fVar.a(this.j, ubiExpr1Impression.j);
                this.k = fVar.a(this.k, ubiExpr1Impression.k);
                this.l = fVar.a(p(), this.l, ubiExpr1Impression.p(), ubiExpr1Impression.l);
                this.m = fVar.a(q(), this.m, ubiExpr1Impression.q(), ubiExpr1Impression.m);
                this.n = fVar.a(this.n, ubiExpr1Impression.n);
                this.o = fVar.a(r(), this.o, ubiExpr1Impression.r(), ubiExpr1Impression.o);
                this.p = fVar.a(s(), this.p, ubiExpr1Impression.s(), ubiExpr1Impression.p);
                if (fVar == e.a) {
                    this.d |= ubiExpr1Impression.d;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkc fkc = (fkc) obj;
                while (!z) {
                    try {
                        int a2 = fkc.a();
                        switch (a2) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                String c = fkc.c();
                                this.d |= 1;
                                this.e = c;
                                break;
                            case 18:
                                String c2 = fkc.c();
                                this.d |= 2;
                                this.f = c2;
                                break;
                            case 26:
                                String c3 = fkc.c();
                                this.d |= 4;
                                this.g = c3;
                                break;
                            case 34:
                                String c4 = fkc.c();
                                if (!this.h.a()) {
                                    this.h = GeneratedMessageLite.a(this.h);
                                }
                                this.h.add(c4);
                                break;
                            case 42:
                                String c5 = fkc.c();
                                if (!this.i.a()) {
                                    this.i = GeneratedMessageLite.a(this.i);
                                }
                                this.i.add(c5);
                                break;
                            case 50:
                                String c6 = fkc.c();
                                if (!this.j.a()) {
                                    this.j = GeneratedMessageLite.a(this.j);
                                }
                                this.j.add(c6);
                                break;
                            case 58:
                                String c7 = fkc.c();
                                if (!this.k.a()) {
                                    this.k = GeneratedMessageLite.a(this.k);
                                }
                                this.k.add(c7);
                                break;
                            case b.bu /*66*/:
                                String c8 = fkc.c();
                                this.d |= 8;
                                this.l = c8;
                                break;
                            case b.bC /*74*/:
                                String c9 = fkc.c();
                                this.d |= 16;
                                this.m = c9;
                                break;
                            case 82:
                                String c10 = fkc.c();
                                if (!this.n.a()) {
                                    this.n = GeneratedMessageLite.a(this.n);
                                }
                                this.n.add(c10);
                                break;
                            case 90:
                                String c11 = fkc.c();
                                this.d |= 32;
                                this.o = c11;
                                break;
                            case 98:
                                String c12 = fkc.c();
                                this.d |= 64;
                                this.p = c12;
                                break;
                            default:
                                if (a(a2, fkc)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
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
                if (r == null) {
                    synchronized (UbiExpr1Impression.class) {
                        if (r == null) {
                            r = new b(q);
                        }
                    }
                }
                return r;
            default:
                throw new UnsupportedOperationException();
        }
        return q;
    }

    static {
        UbiExpr1Impression ubiExpr1Impression = new UbiExpr1Impression();
        q = ubiExpr1Impression;
        ubiExpr1Impression.e();
    }

    public static fkr<UbiExpr1Impression> parser() {
        return q.c();
    }

    static /* synthetic */ void a(UbiExpr1Impression ubiExpr1Impression, String str) {
        if (str != null) {
            ubiExpr1Impression.d |= 1;
            ubiExpr1Impression.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(UbiExpr1Impression ubiExpr1Impression, String str) {
        if (str != null) {
            ubiExpr1Impression.d |= 2;
            ubiExpr1Impression.f = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void c(UbiExpr1Impression ubiExpr1Impression, String str) {
        if (str != null) {
            if (!ubiExpr1Impression.h.a()) {
                ubiExpr1Impression.h = GeneratedMessageLite.a(ubiExpr1Impression.h);
            }
            ubiExpr1Impression.h.add(str);
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void d(UbiExpr1Impression ubiExpr1Impression, String str) {
        if (str != null) {
            if (!ubiExpr1Impression.i.a()) {
                ubiExpr1Impression.i = GeneratedMessageLite.a(ubiExpr1Impression.i);
            }
            ubiExpr1Impression.i.add(str);
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void e(UbiExpr1Impression ubiExpr1Impression, String str) {
        if (str != null) {
            if (!ubiExpr1Impression.j.a()) {
                ubiExpr1Impression.j = GeneratedMessageLite.a(ubiExpr1Impression.j);
            }
            ubiExpr1Impression.j.add(str);
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void f(UbiExpr1Impression ubiExpr1Impression, String str) {
        if (str != null) {
            if (!ubiExpr1Impression.k.a()) {
                ubiExpr1Impression.k = GeneratedMessageLite.a(ubiExpr1Impression.k);
            }
            ubiExpr1Impression.k.add(str);
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void g(UbiExpr1Impression ubiExpr1Impression, String str) {
        if (str != null) {
            ubiExpr1Impression.d |= 8;
            ubiExpr1Impression.l = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void h(UbiExpr1Impression ubiExpr1Impression, String str) {
        if (str != null) {
            ubiExpr1Impression.d |= 16;
            ubiExpr1Impression.m = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void i(UbiExpr1Impression ubiExpr1Impression, String str) {
        if (str != null) {
            ubiExpr1Impression.d |= 32;
            ubiExpr1Impression.o = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void j(UbiExpr1Impression ubiExpr1Impression, String str) {
        if (str != null) {
            ubiExpr1Impression.d |= 64;
            ubiExpr1Impression.p = str;
            return;
        }
        throw new NullPointerException();
    }
}
