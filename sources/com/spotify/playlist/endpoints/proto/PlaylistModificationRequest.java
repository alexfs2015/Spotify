package com.spotify.playlist.endpoints.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class PlaylistModificationRequest {

    public static final class ModificationRequest extends GeneratedMessageLite<ModificationRequest, a> implements uyk {
        /* access modifiers changed from: private */
        public static final ModificationRequest n;
        private static volatile fkr<ModificationRequest> o;
        private int d;
        private String e;
        private String f;
        private String g;
        private String h;
        private boolean i;
        private Attributes j;
        private e<String> k = fks.d();
        private e<String> l = fks.d();
        private boolean m;

        public static final class Attributes extends GeneratedMessageLite<Attributes, a> implements uyj {
            /* access modifiers changed from: private */
            public static final Attributes j;
            private static volatile fkr<Attributes> k;
            private int d;
            private boolean e;
            private boolean f;
            private String g;
            private String h;
            private String i;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Attributes, a> implements uyj {
                /* synthetic */ a(byte b) {
                    this();
                }

                private a() {
                    super(Attributes.j);
                }

                public final a a(boolean z) {
                    b();
                    Attributes.a((Attributes) this.a, z);
                    return this;
                }

                public final a b(boolean z) {
                    b();
                    Attributes.b((Attributes) this.a, z);
                    return this;
                }

                public final a a(String str) {
                    b();
                    Attributes.a((Attributes) this.a, str);
                    return this;
                }

                public final a b(String str) {
                    b();
                    Attributes.b((Attributes) this.a, str);
                    return this;
                }

                public final a c(String str) {
                    b();
                    Attributes.c((Attributes) this.a, str);
                    return this;
                }
            }

            private Attributes() {
                String str = "";
                this.g = str;
                this.h = str;
                this.i = str;
            }

            private boolean n() {
                return (this.d & 1) == 1;
            }

            private boolean o() {
                return (this.d & 2) == 2;
            }

            private boolean p() {
                return (this.d & 4) == 4;
            }

            private boolean q() {
                return (this.d & 8) == 8;
            }

            private boolean r() {
                return (this.d & 16) == 16;
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
                if ((this.d & 16) == 16) {
                    codedOutputStream.a(5, this.i);
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
                    i3 = 0 + CodedOutputStream.b(1, this.e);
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
                if ((this.d & 16) == 16) {
                    i3 += CodedOutputStream.b(5, this.i);
                }
                int d2 = i3 + this.b.d();
                this.c = d2;
                return d2;
            }

            public static a k() {
                return (a) j.h();
            }

            public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (methodToInvoke) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Attributes();
                    case IS_INITIALIZED:
                        return j;
                    case MAKE_IMMUTABLE:
                        return null;
                    case NEW_BUILDER:
                        return new a(0);
                    case VISIT:
                        f fVar = (f) obj;
                        Attributes attributes = (Attributes) obj2;
                        this.e = fVar.a(n(), this.e, attributes.n(), attributes.e);
                        this.f = fVar.a(o(), this.f, attributes.o(), attributes.f);
                        this.g = fVar.a(p(), this.g, attributes.p(), attributes.g);
                        this.h = fVar.a(q(), this.h, attributes.q(), attributes.h);
                        this.i = fVar.a(r(), this.i, attributes.r(), attributes.i);
                        if (fVar == e.a) {
                            this.d |= attributes.d;
                        }
                        return this;
                    case MERGE_FROM_STREAM:
                        fkc fkc = (fkc) obj;
                        while (!z) {
                            try {
                                int a2 = fkc.a();
                                if (a2 != 0) {
                                    if (a2 == 8) {
                                        this.d |= 1;
                                        this.e = fkc.b();
                                    } else if (a2 == 16) {
                                        this.d |= 2;
                                        this.f = fkc.b();
                                    } else if (a2 == 26) {
                                        String c = fkc.c();
                                        this.d |= 4;
                                        this.g = c;
                                    } else if (a2 == 34) {
                                        String c2 = fkc.c();
                                        this.d = 8 | this.d;
                                        this.h = c2;
                                    } else if (a2 == 42) {
                                        String c3 = fkc.c();
                                        this.d |= 16;
                                        this.i = c3;
                                    } else if (!a(a2, fkc)) {
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
                            synchronized (Attributes.class) {
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

            static {
                Attributes attributes = new Attributes();
                j = attributes;
                attributes.e();
            }

            public static Attributes l() {
                return j;
            }

            public static fkr<Attributes> parser() {
                return j.c();
            }

            static /* synthetic */ void a(Attributes attributes, boolean z) {
                attributes.d |= 1;
                attributes.e = z;
            }

            static /* synthetic */ void b(Attributes attributes, boolean z) {
                attributes.d |= 2;
                attributes.f = z;
            }

            static /* synthetic */ void a(Attributes attributes, String str) {
                if (str != null) {
                    attributes.d |= 4;
                    attributes.g = str;
                    return;
                }
                throw new NullPointerException();
            }

            static /* synthetic */ void b(Attributes attributes, String str) {
                if (str != null) {
                    attributes.d |= 8;
                    attributes.h = str;
                    return;
                }
                throw new NullPointerException();
            }

            static /* synthetic */ void c(Attributes attributes, String str) {
                if (str != null) {
                    attributes.d |= 16;
                    attributes.i = str;
                    return;
                }
                throw new NullPointerException();
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ModificationRequest, a> implements uyk {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ModificationRequest.n);
            }

            public final a a(String str) {
                b();
                ModificationRequest.a((ModificationRequest) this.a, str);
                return this;
            }

            public final a b(String str) {
                b();
                ModificationRequest.b((ModificationRequest) this.a, str);
                return this;
            }

            public final a c(String str) {
                b();
                ModificationRequest.c((ModificationRequest) this.a, str);
                return this;
            }

            public final a d(String str) {
                b();
                ModificationRequest.d((ModificationRequest) this.a, str);
                return this;
            }

            public final a a(boolean z) {
                b();
                ModificationRequest.a((ModificationRequest) this.a, z);
                return this;
            }

            public final a a(a aVar) {
                b();
                ModificationRequest.a((ModificationRequest) this.a, aVar);
                return this;
            }

            public final a e(String str) {
                b();
                ModificationRequest.e((ModificationRequest) this.a, str);
                return this;
            }

            public final a a(Iterable<String> iterable) {
                b();
                ModificationRequest.a((ModificationRequest) this.a, (Iterable) iterable);
                return this;
            }

            public final a f(String str) {
                b();
                ModificationRequest.f((ModificationRequest) this.a, str);
                return this;
            }

            public final a b(Iterable<String> iterable) {
                b();
                ModificationRequest.b((ModificationRequest) this.a, (Iterable) iterable);
                return this;
            }

            public final a b(boolean z) {
                b();
                ModificationRequest.b((ModificationRequest) this.a, z);
                return this;
            }
        }

        private ModificationRequest() {
            String str = "";
            this.e = str;
            this.f = str;
            this.g = str;
            this.h = str;
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

        private Attributes r() {
            Attributes attributes = this.j;
            return attributes == null ? Attributes.l() : attributes;
        }

        private void s() {
            if (!this.k.a()) {
                this.k = GeneratedMessageLite.a(this.k);
            }
        }

        private void t() {
            if (!this.l.a()) {
                this.l = GeneratedMessageLite.a(this.l);
            }
        }

        private boolean u() {
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
            if ((this.d & 8) == 8) {
                codedOutputStream.a(4, this.h);
            }
            if ((this.d & 16) == 16) {
                codedOutputStream.a(5, this.i);
            }
            if ((this.d & 32) == 32) {
                codedOutputStream.a(6, (fko) r());
            }
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                codedOutputStream.a(7, (String) this.k.get(i2));
            }
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                codedOutputStream.a(8, (String) this.l.get(i3));
            }
            if ((this.d & 64) == 64) {
                codedOutputStream.a(9, this.m);
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
            if ((this.d & 16) == 16) {
                b += CodedOutputStream.b(5, this.i);
            }
            if ((this.d & 32) == 32) {
                b += CodedOutputStream.b(6, (fko) r());
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.k.size(); i4++) {
                i3 += CodedOutputStream.b((String) this.k.get(i4));
            }
            int size = b + i3 + (this.k.size() * 1);
            int i5 = 0;
            for (int i6 = 0; i6 < this.l.size(); i6++) {
                i5 += CodedOutputStream.b((String) this.l.get(i6));
            }
            int size2 = size + i5 + (this.l.size() * 1);
            if ((this.d & 64) == 64) {
                size2 += CodedOutputStream.b(9, this.m);
            }
            int d2 = size2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public static a k() {
            return (a) n.h();
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ModificationRequest();
                case IS_INITIALIZED:
                    return n;
                case MAKE_IMMUTABLE:
                    this.k.b();
                    this.l.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ModificationRequest modificationRequest = (ModificationRequest) obj2;
                    this.e = fVar.a(m(), this.e, modificationRequest.m(), modificationRequest.e);
                    this.f = fVar.a(n(), this.f, modificationRequest.n(), modificationRequest.f);
                    this.g = fVar.a(o(), this.g, modificationRequest.o(), modificationRequest.g);
                    this.h = fVar.a(p(), this.h, modificationRequest.p(), modificationRequest.h);
                    this.i = fVar.a(q(), this.i, modificationRequest.q(), modificationRequest.i);
                    this.j = (Attributes) fVar.a(this.j, modificationRequest.j);
                    this.k = fVar.a(this.k, modificationRequest.k);
                    this.l = fVar.a(this.l, modificationRequest.l);
                    this.m = fVar.a(u(), this.m, modificationRequest.u(), modificationRequest.m);
                    if (fVar == e.a) {
                        this.d |= modificationRequest.d;
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
                                    String c = fkc.c();
                                    this.d |= 1;
                                    this.e = c;
                                } else if (a2 == 18) {
                                    String c2 = fkc.c();
                                    this.d |= 2;
                                    this.f = c2;
                                } else if (a2 == 26) {
                                    String c3 = fkc.c();
                                    this.d |= 4;
                                    this.g = c3;
                                } else if (a2 == 34) {
                                    String c4 = fkc.c();
                                    this.d |= 8;
                                    this.h = c4;
                                } else if (a2 == 40) {
                                    this.d |= 16;
                                    this.i = fkc.b();
                                } else if (a2 == 50) {
                                    a aVar = (this.d & 32) == 32 ? (a) this.j.h() : null;
                                    this.j = (Attributes) fkc.a(Attributes.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.j);
                                        this.j = (Attributes) aVar.e();
                                    }
                                    this.d |= 32;
                                } else if (a2 == 58) {
                                    String c5 = fkc.c();
                                    if (!this.k.a()) {
                                        this.k = GeneratedMessageLite.a(this.k);
                                    }
                                    this.k.add(c5);
                                } else if (a2 == 66) {
                                    String c6 = fkc.c();
                                    if (!this.l.a()) {
                                        this.l = GeneratedMessageLite.a(this.l);
                                    }
                                    this.l.add(c6);
                                } else if (a2 == 72) {
                                    this.d |= 64;
                                    this.m = fkc.b();
                                } else if (!a(a2, fkc)) {
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
                    if (o == null) {
                        synchronized (ModificationRequest.class) {
                            if (o == null) {
                                o = new b(n);
                            }
                        }
                    }
                    return o;
                default:
                    throw new UnsupportedOperationException();
            }
            return n;
        }

        static {
            ModificationRequest modificationRequest = new ModificationRequest();
            n = modificationRequest;
            modificationRequest.e();
        }

        public static fkr<ModificationRequest> parser() {
            return n.c();
        }

        static /* synthetic */ void a(ModificationRequest modificationRequest, String str) {
            if (str != null) {
                modificationRequest.d |= 1;
                modificationRequest.e = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ModificationRequest modificationRequest, String str) {
            if (str != null) {
                modificationRequest.d |= 2;
                modificationRequest.f = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void c(ModificationRequest modificationRequest, String str) {
            if (str != null) {
                modificationRequest.d |= 4;
                modificationRequest.g = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void d(ModificationRequest modificationRequest, String str) {
            if (str != null) {
                modificationRequest.d |= 8;
                modificationRequest.h = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ModificationRequest modificationRequest, boolean z) {
            modificationRequest.d |= 16;
            modificationRequest.i = z;
        }

        static /* synthetic */ void a(ModificationRequest modificationRequest, a aVar) {
            modificationRequest.j = (Attributes) aVar.g();
            modificationRequest.d |= 32;
        }

        static /* synthetic */ void e(ModificationRequest modificationRequest, String str) {
            if (str != null) {
                modificationRequest.s();
                modificationRequest.k.add(str);
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(ModificationRequest modificationRequest, Iterable iterable) {
            modificationRequest.s();
            fjx.a(iterable, modificationRequest.k);
        }

        static /* synthetic */ void f(ModificationRequest modificationRequest, String str) {
            if (str != null) {
                modificationRequest.t();
                modificationRequest.l.add(str);
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void b(ModificationRequest modificationRequest, Iterable iterable) {
            modificationRequest.t();
            fjx.a(iterable, modificationRequest.l);
        }

        static /* synthetic */ void b(ModificationRequest modificationRequest, boolean z) {
            modificationRequest.d |= 64;
            modificationRequest.m = z;
        }
    }

    public static final class ModificationResponse extends GeneratedMessageLite<ModificationResponse, a> implements uyl {
        /* access modifiers changed from: private */
        public static final ModificationResponse g;
        private static volatile fkr<ModificationResponse> h;
        private int d;
        private boolean e;
        private String f = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ModificationResponse, a> implements uyl {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ModificationResponse.g);
            }
        }

        private ModificationResponse() {
        }

        private boolean m() {
            return (this.d & 1) == 1;
        }

        private boolean n() {
            return (this.d & 2) == 2;
        }

        public final String k() {
            return this.f;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, this.e);
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, k());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.d & 1) == 1) {
                i2 = 0 + CodedOutputStream.b(1, this.e);
            }
            if ((this.d & 2) == 2) {
                i2 += CodedOutputStream.b(2, k());
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ModificationResponse();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ModificationResponse modificationResponse = (ModificationResponse) obj2;
                    this.e = fVar.a(m(), this.e, modificationResponse.m(), modificationResponse.e);
                    this.f = fVar.a(n(), this.f, modificationResponse.n(), modificationResponse.f);
                    if (fVar == e.a) {
                        this.d |= modificationResponse.d;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.d |= 1;
                                    this.e = fkc.b();
                                } else if (a2 == 18) {
                                    String c = fkc.c();
                                    this.d |= 2;
                                    this.f = c;
                                } else if (!a(a2, fkc)) {
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
                        synchronized (ModificationResponse.class) {
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

        static {
            ModificationResponse modificationResponse = new ModificationResponse();
            g = modificationResponse;
            modificationResponse.e();
        }

        public static fkr<ModificationResponse> parser() {
            return g.c();
        }
    }
}
