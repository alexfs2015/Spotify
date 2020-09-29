package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class UbiExprInteractionNonAuth extends GeneratedMessageLite<UbiExprInteractionNonAuth, a> implements gpr {
    /* access modifiers changed from: private */
    public static final UbiExprInteractionNonAuth t;
    private static volatile fkr<UbiExprInteractionNonAuth> u;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private e<String> i = fks.d();
    private e<String> j = fks.d();
    private e<String> k = fks.d();
    private e<String> l = fks.d();
    private e<String> m = fks.d();
    private e<String> n = fks.d();
    private String o;
    private e<String> p;
    private String q;
    private String r;
    private String s;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<UbiExprInteractionNonAuth, a> implements gpr {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(UbiExprInteractionNonAuth.t);
        }

        public final a a(String str) {
            b();
            UbiExprInteractionNonAuth.a((UbiExprInteractionNonAuth) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            UbiExprInteractionNonAuth.b((UbiExprInteractionNonAuth) this.a, str);
            return this;
        }

        public final a c(String str) {
            b();
            UbiExprInteractionNonAuth.c((UbiExprInteractionNonAuth) this.a, str);
            return this;
        }

        public final a d(String str) {
            b();
            UbiExprInteractionNonAuth.d((UbiExprInteractionNonAuth) this.a, str);
            return this;
        }

        public final a e(String str) {
            b();
            UbiExprInteractionNonAuth.e((UbiExprInteractionNonAuth) this.a, str);
            return this;
        }

        public final a f(String str) {
            b();
            UbiExprInteractionNonAuth.f((UbiExprInteractionNonAuth) this.a, str);
            return this;
        }

        public final a g(String str) {
            b();
            UbiExprInteractionNonAuth.g((UbiExprInteractionNonAuth) this.a, str);
            return this;
        }

        public final a h(String str) {
            b();
            UbiExprInteractionNonAuth.h((UbiExprInteractionNonAuth) this.a, str);
            return this;
        }

        public final a i(String str) {
            b();
            UbiExprInteractionNonAuth.i((UbiExprInteractionNonAuth) this.a, str);
            return this;
        }

        public final a j(String str) {
            b();
            UbiExprInteractionNonAuth.j((UbiExprInteractionNonAuth) this.a, str);
            return this;
        }

        public final a k(String str) {
            b();
            UbiExprInteractionNonAuth.k((UbiExprInteractionNonAuth) this.a, str);
            return this;
        }

        public final a l(String str) {
            b();
            UbiExprInteractionNonAuth.l((UbiExprInteractionNonAuth) this.a, str);
            return this;
        }

        public final a m(String str) {
            b();
            UbiExprInteractionNonAuth.m((UbiExprInteractionNonAuth) this.a, str);
            return this;
        }

        public final a n(String str) {
            b();
            UbiExprInteractionNonAuth.n((UbiExprInteractionNonAuth) this.a, str);
            return this;
        }
    }

    private UbiExprInteractionNonAuth() {
        String str = "";
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.o = str;
        this.p = fks.d();
        this.q = str;
        this.r = str;
        this.s = str;
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

    private boolean t() {
        return (this.d & 128) == 128;
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
        if ((this.d & 8) == 8) {
            codedOutputStream.a(4, this.h);
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            codedOutputStream.a(5, (String) this.i.get(i2));
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            codedOutputStream.a(6, (String) this.j.get(i3));
        }
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            codedOutputStream.a(7, (String) this.k.get(i4));
        }
        for (int i5 = 0; i5 < this.l.size(); i5++) {
            codedOutputStream.a(8, (String) this.l.get(i5));
        }
        for (int i6 = 0; i6 < this.m.size(); i6++) {
            codedOutputStream.a(9, (String) this.m.get(i6));
        }
        for (int i7 = 0; i7 < this.n.size(); i7++) {
            codedOutputStream.a(10, (String) this.n.get(i7));
        }
        if ((this.d & 16) == 16) {
            codedOutputStream.a(11, this.o);
        }
        for (int i8 = 0; i8 < this.p.size(); i8++) {
            codedOutputStream.a(12, (String) this.p.get(i8));
        }
        if ((this.d & 32) == 32) {
            codedOutputStream.a(13, this.q);
        }
        if ((this.d & 64) == 64) {
            codedOutputStream.a(14, this.r);
        }
        if ((this.d & 128) == 128) {
            codedOutputStream.a(15, this.s);
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
        if ((this.d & 8) == 8) {
            b += CodedOutputStream.b(4, this.h);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.i.size(); i4++) {
            i3 += CodedOutputStream.b((String) this.i.get(i4));
        }
        int size = b + i3 + (this.i.size() * 1);
        int i5 = 0;
        for (int i6 = 0; i6 < this.j.size(); i6++) {
            i5 += CodedOutputStream.b((String) this.j.get(i6));
        }
        int size2 = size + i5 + (this.j.size() * 1);
        int i7 = 0;
        for (int i8 = 0; i8 < this.k.size(); i8++) {
            i7 += CodedOutputStream.b((String) this.k.get(i8));
        }
        int size3 = size2 + i7 + (this.k.size() * 1);
        int i9 = 0;
        for (int i10 = 0; i10 < this.l.size(); i10++) {
            i9 += CodedOutputStream.b((String) this.l.get(i10));
        }
        int size4 = size3 + i9 + (this.l.size() * 1);
        int i11 = 0;
        for (int i12 = 0; i12 < this.m.size(); i12++) {
            i11 += CodedOutputStream.b((String) this.m.get(i12));
        }
        int size5 = size4 + i11 + (this.m.size() * 1);
        int i13 = 0;
        for (int i14 = 0; i14 < this.n.size(); i14++) {
            i13 += CodedOutputStream.b((String) this.n.get(i14));
        }
        int size6 = size5 + i13 + (this.n.size() * 1);
        if ((this.d & 16) == 16) {
            size6 += CodedOutputStream.b(11, this.o);
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.p.size(); i16++) {
            i15 += CodedOutputStream.b((String) this.p.get(i16));
        }
        int size7 = size6 + i15 + (this.p.size() * 1);
        if ((this.d & 32) == 32) {
            size7 += CodedOutputStream.b(13, this.q);
        }
        if ((this.d & 64) == 64) {
            size7 += CodedOutputStream.b(14, this.r);
        }
        if ((this.d & 128) == 128) {
            size7 += CodedOutputStream.b(15, this.s);
        }
        int d2 = size7 + this.b.d();
        this.c = d2;
        return d2;
    }

    public static a k() {
        return (a) t.h();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new UbiExprInteractionNonAuth();
            case IS_INITIALIZED:
                return t;
            case MAKE_IMMUTABLE:
                this.i.b();
                this.j.b();
                this.k.b();
                this.l.b();
                this.m.b();
                this.n.b();
                this.p.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                UbiExprInteractionNonAuth ubiExprInteractionNonAuth = (UbiExprInteractionNonAuth) obj2;
                this.e = fVar.a(m(), this.e, ubiExprInteractionNonAuth.m(), ubiExprInteractionNonAuth.e);
                this.f = fVar.a(n(), this.f, ubiExprInteractionNonAuth.n(), ubiExprInteractionNonAuth.f);
                this.g = fVar.a(o(), this.g, ubiExprInteractionNonAuth.o(), ubiExprInteractionNonAuth.g);
                this.h = fVar.a(p(), this.h, ubiExprInteractionNonAuth.p(), ubiExprInteractionNonAuth.h);
                this.i = fVar.a(this.i, ubiExprInteractionNonAuth.i);
                this.j = fVar.a(this.j, ubiExprInteractionNonAuth.j);
                this.k = fVar.a(this.k, ubiExprInteractionNonAuth.k);
                this.l = fVar.a(this.l, ubiExprInteractionNonAuth.l);
                this.m = fVar.a(this.m, ubiExprInteractionNonAuth.m);
                this.n = fVar.a(this.n, ubiExprInteractionNonAuth.n);
                this.o = fVar.a(q(), this.o, ubiExprInteractionNonAuth.q(), ubiExprInteractionNonAuth.o);
                this.p = fVar.a(this.p, ubiExprInteractionNonAuth.p);
                this.q = fVar.a(r(), this.q, ubiExprInteractionNonAuth.r(), ubiExprInteractionNonAuth.q);
                this.r = fVar.a(s(), this.r, ubiExprInteractionNonAuth.s(), ubiExprInteractionNonAuth.r);
                this.s = fVar.a(t(), this.s, ubiExprInteractionNonAuth.t(), ubiExprInteractionNonAuth.s);
                if (fVar == e.a) {
                    this.d |= ubiExprInteractionNonAuth.d;
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
                                this.d |= 8;
                                this.h = c4;
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
                                if (!this.l.a()) {
                                    this.l = GeneratedMessageLite.a(this.l);
                                }
                                this.l.add(c8);
                                break;
                            case b.bC /*74*/:
                                String c9 = fkc.c();
                                if (!this.m.a()) {
                                    this.m = GeneratedMessageLite.a(this.m);
                                }
                                this.m.add(c9);
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
                                this.d |= 16;
                                this.o = c11;
                                break;
                            case 98:
                                String c12 = fkc.c();
                                if (!this.p.a()) {
                                    this.p = GeneratedMessageLite.a(this.p);
                                }
                                this.p.add(c12);
                                break;
                            case 106:
                                String c13 = fkc.c();
                                this.d |= 32;
                                this.q = c13;
                                break;
                            case defpackage.o.a.aB /*114*/:
                                String c14 = fkc.c();
                                this.d |= 64;
                                this.r = c14;
                                break;
                            case 122:
                                String c15 = fkc.c();
                                this.d |= 128;
                                this.s = c15;
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
                if (u == null) {
                    synchronized (UbiExprInteractionNonAuth.class) {
                        if (u == null) {
                            u = new b(t);
                        }
                    }
                }
                return u;
            default:
                throw new UnsupportedOperationException();
        }
        return t;
    }

    static {
        UbiExprInteractionNonAuth ubiExprInteractionNonAuth = new UbiExprInteractionNonAuth();
        t = ubiExprInteractionNonAuth;
        ubiExprInteractionNonAuth.e();
    }

    public static fkr<UbiExprInteractionNonAuth> parser() {
        return t.c();
    }

    static /* synthetic */ void a(UbiExprInteractionNonAuth ubiExprInteractionNonAuth, String str) {
        if (str != null) {
            ubiExprInteractionNonAuth.d |= 1;
            ubiExprInteractionNonAuth.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(UbiExprInteractionNonAuth ubiExprInteractionNonAuth, String str) {
        if (str != null) {
            ubiExprInteractionNonAuth.d |= 2;
            ubiExprInteractionNonAuth.f = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void c(UbiExprInteractionNonAuth ubiExprInteractionNonAuth, String str) {
        if (str != null) {
            ubiExprInteractionNonAuth.d |= 4;
            ubiExprInteractionNonAuth.g = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void d(UbiExprInteractionNonAuth ubiExprInteractionNonAuth, String str) {
        if (str != null) {
            ubiExprInteractionNonAuth.d |= 8;
            ubiExprInteractionNonAuth.h = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void e(UbiExprInteractionNonAuth ubiExprInteractionNonAuth, String str) {
        if (str != null) {
            if (!ubiExprInteractionNonAuth.i.a()) {
                ubiExprInteractionNonAuth.i = GeneratedMessageLite.a(ubiExprInteractionNonAuth.i);
            }
            ubiExprInteractionNonAuth.i.add(str);
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void f(UbiExprInteractionNonAuth ubiExprInteractionNonAuth, String str) {
        if (str != null) {
            if (!ubiExprInteractionNonAuth.j.a()) {
                ubiExprInteractionNonAuth.j = GeneratedMessageLite.a(ubiExprInteractionNonAuth.j);
            }
            ubiExprInteractionNonAuth.j.add(str);
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void g(UbiExprInteractionNonAuth ubiExprInteractionNonAuth, String str) {
        if (str != null) {
            if (!ubiExprInteractionNonAuth.k.a()) {
                ubiExprInteractionNonAuth.k = GeneratedMessageLite.a(ubiExprInteractionNonAuth.k);
            }
            ubiExprInteractionNonAuth.k.add(str);
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void h(UbiExprInteractionNonAuth ubiExprInteractionNonAuth, String str) {
        if (str != null) {
            if (!ubiExprInteractionNonAuth.l.a()) {
                ubiExprInteractionNonAuth.l = GeneratedMessageLite.a(ubiExprInteractionNonAuth.l);
            }
            ubiExprInteractionNonAuth.l.add(str);
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void i(UbiExprInteractionNonAuth ubiExprInteractionNonAuth, String str) {
        if (str != null) {
            if (!ubiExprInteractionNonAuth.m.a()) {
                ubiExprInteractionNonAuth.m = GeneratedMessageLite.a(ubiExprInteractionNonAuth.m);
            }
            ubiExprInteractionNonAuth.m.add(str);
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void j(UbiExprInteractionNonAuth ubiExprInteractionNonAuth, String str) {
        if (str != null) {
            if (!ubiExprInteractionNonAuth.n.a()) {
                ubiExprInteractionNonAuth.n = GeneratedMessageLite.a(ubiExprInteractionNonAuth.n);
            }
            ubiExprInteractionNonAuth.n.add(str);
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void k(UbiExprInteractionNonAuth ubiExprInteractionNonAuth, String str) {
        if (str != null) {
            ubiExprInteractionNonAuth.d |= 16;
            ubiExprInteractionNonAuth.o = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void l(UbiExprInteractionNonAuth ubiExprInteractionNonAuth, String str) {
        if (str != null) {
            ubiExprInteractionNonAuth.d |= 32;
            ubiExprInteractionNonAuth.q = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void m(UbiExprInteractionNonAuth ubiExprInteractionNonAuth, String str) {
        if (str != null) {
            ubiExprInteractionNonAuth.d |= 64;
            ubiExprInteractionNonAuth.r = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void n(UbiExprInteractionNonAuth ubiExprInteractionNonAuth, String str) {
        if (str != null) {
            ubiExprInteractionNonAuth.d |= 128;
            ubiExprInteractionNonAuth.s = str;
            return;
        }
        throw new NullPointerException();
    }
}
