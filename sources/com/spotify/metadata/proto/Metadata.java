package com.spotify.metadata.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Metadata {

    public static final class ActivityPeriod extends GeneratedMessageLite<ActivityPeriod, a> implements gqa {
        /* access modifiers changed from: private */
        public static final ActivityPeriod h;
        private static volatile fkr<ActivityPeriod> i;
        private int d;
        private int e;
        private int f;
        private int g;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ActivityPeriod, a> implements gqa {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ActivityPeriod.h);
            }
        }

        private ActivityPeriod() {
        }

        private boolean l() {
            return (this.d & 1) == 1;
        }

        private boolean m() {
            return (this.d & 2) == 2;
        }

        private boolean n() {
            return (this.d & 4) == 4;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.d(1, this.e);
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.d(2, this.f);
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.d(3, this.g);
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
                i3 = 0 + CodedOutputStream.h(1, this.e);
            }
            if ((this.d & 2) == 2) {
                i3 += CodedOutputStream.h(2, this.f);
            }
            if ((this.d & 4) == 4) {
                i3 += CodedOutputStream.h(3, this.g);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ActivityPeriod();
                case IS_INITIALIZED:
                    return h;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ActivityPeriod activityPeriod = (ActivityPeriod) obj2;
                    this.e = fVar.a(l(), this.e, activityPeriod.l(), activityPeriod.e);
                    this.f = fVar.a(m(), this.f, activityPeriod.m(), activityPeriod.f);
                    this.g = fVar.a(n(), this.g, activityPeriod.n(), activityPeriod.g);
                    if (fVar == e.a) {
                        this.d |= activityPeriod.d;
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
                                    this.e = fkc.f();
                                } else if (a2 == 16) {
                                    this.d |= 2;
                                    this.f = fkc.f();
                                } else if (a2 == 24) {
                                    this.d |= 4;
                                    this.g = fkc.f();
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
                    if (i == null) {
                        synchronized (ActivityPeriod.class) {
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

        static {
            ActivityPeriod activityPeriod = new ActivityPeriod();
            h = activityPeriod;
            activityPeriod.e();
        }

        public static fkr<ActivityPeriod> parser() {
            return h.c();
        }
    }

    public static final class Album extends GeneratedMessageLite<Album, a> implements gqc {
        /* access modifiers changed from: private */
        public static final Album D;
        private static volatile fkr<Album> E;
        private e<Availability> A;
        private e<Track> B;
        private Licensor C;
        public ByteString d = ByteString.a;
        public String e;
        public e<Disc> f;
        private int g;
        private e<Artist> h;
        private int i;
        private String j;
        private Date k;
        private int l;
        private e<String> m;
        private e<Image> n;
        private e<ExternalId> o;
        private e<String> p;
        private e<Copyright> q;
        private e<Restriction> r;
        private e<Album> s;
        private e<SalePeriod> t;
        private ImageGroup u;
        private String v;
        private String w;
        private String x;
        private e<Block> y;
        private long z;

        public enum Type implements b {
            ALBUM(1),
            SINGLE(2),
            COMPILATION(3),
            EP(4),
            AUDIOBOOK(5),
            PODCAST(6);
            
            private final int value;

            static {
                new Object() {
                };
            }

            public final int a() {
                return this.value;
            }

            public static Type a(int i) {
                switch (i) {
                    case 1:
                        return ALBUM;
                    case 2:
                        return SINGLE;
                    case 3:
                        return COMPILATION;
                    case 4:
                        return EP;
                    case 5:
                        return AUDIOBOOK;
                    case 6:
                        return PODCAST;
                    default:
                        return null;
                }
            }

            private Type(int i) {
                this.value = i;
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Album, a> implements gqc {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(Album.D);
            }
        }

        private Album() {
            String str = "";
            this.e = str;
            this.h = fks.d();
            this.i = 1;
            this.j = str;
            this.m = fks.d();
            this.n = fks.d();
            this.o = fks.d();
            this.f = fks.d();
            this.p = fks.d();
            this.q = fks.d();
            this.r = fks.d();
            this.s = fks.d();
            this.t = fks.d();
            this.v = str;
            this.w = str;
            this.x = str;
            this.y = fks.d();
            this.A = fks.d();
            this.B = fks.d();
        }

        private boolean m() {
            return (this.g & 1) == 1;
        }

        private boolean n() {
            return (this.g & 2) == 2;
        }

        private boolean o() {
            return (this.g & 4) == 4;
        }

        private boolean p() {
            return (this.g & 8) == 8;
        }

        private Date q() {
            Date date = this.k;
            return date == null ? Date.k() : date;
        }

        private boolean r() {
            return (this.g & 32) == 32;
        }

        private ImageGroup s() {
            ImageGroup imageGroup = this.u;
            return imageGroup == null ? ImageGroup.k() : imageGroup;
        }

        private boolean t() {
            return (this.g & 128) == 128;
        }

        private boolean u() {
            return (this.g & 256) == 256;
        }

        private boolean v() {
            return (this.g & 512) == 512;
        }

        private boolean w() {
            return (this.g & 1024) == 1024;
        }

        private Licensor x() {
            Licensor licensor = this.C;
            return licensor == null ? Licensor.k() : licensor;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.g & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.g & 2) == 2) {
                codedOutputStream.a(2, this.e);
            }
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                codedOutputStream.a(3, (fko) this.h.get(i2));
            }
            if ((this.g & 4) == 4) {
                codedOutputStream.b(4, this.i);
            }
            if ((this.g & 8) == 8) {
                codedOutputStream.a(5, this.j);
            }
            if ((this.g & 16) == 16) {
                codedOutputStream.a(6, (fko) q());
            }
            if ((this.g & 32) == 32) {
                codedOutputStream.d(7, this.l);
            }
            for (int i3 = 0; i3 < this.m.size(); i3++) {
                codedOutputStream.a(8, (String) this.m.get(i3));
            }
            for (int i4 = 0; i4 < this.n.size(); i4++) {
                codedOutputStream.a(9, (fko) this.n.get(i4));
            }
            for (int i5 = 0; i5 < this.o.size(); i5++) {
                codedOutputStream.a(10, (fko) this.o.get(i5));
            }
            for (int i6 = 0; i6 < this.f.size(); i6++) {
                codedOutputStream.a(11, (fko) this.f.get(i6));
            }
            for (int i7 = 0; i7 < this.p.size(); i7++) {
                codedOutputStream.a(12, (String) this.p.get(i7));
            }
            for (int i8 = 0; i8 < this.q.size(); i8++) {
                codedOutputStream.a(13, (fko) this.q.get(i8));
            }
            for (int i9 = 0; i9 < this.r.size(); i9++) {
                codedOutputStream.a(14, (fko) this.r.get(i9));
            }
            for (int i10 = 0; i10 < this.s.size(); i10++) {
                codedOutputStream.a(15, (fko) this.s.get(i10));
            }
            for (int i11 = 0; i11 < this.t.size(); i11++) {
                codedOutputStream.a(16, (fko) this.t.get(i11));
            }
            if ((this.g & 64) == 64) {
                codedOutputStream.a(17, (fko) s());
            }
            if ((this.g & 128) == 128) {
                codedOutputStream.a(18, this.v);
            }
            if ((this.g & 256) == 256) {
                codedOutputStream.a(19, this.w);
            }
            if ((this.g & 512) == 512) {
                codedOutputStream.a(20, this.x);
            }
            for (int i12 = 0; i12 < this.y.size(); i12++) {
                codedOutputStream.a(21, (fko) this.y.get(i12));
            }
            if ((this.g & 1024) == 1024) {
                codedOutputStream.a(22, this.z);
            }
            for (int i13 = 0; i13 < this.A.size(); i13++) {
                codedOutputStream.a(23, (fko) this.A.get(i13));
            }
            for (int i14 = 0; i14 < this.B.size(); i14++) {
                codedOutputStream.a(24, (fko) this.B.get(i14));
            }
            if ((this.g & 2048) == 2048) {
                codedOutputStream.a(25, (fko) x());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int b = (this.g & 1) == 1 ? CodedOutputStream.b(1, this.d) + 0 : 0;
            if ((this.g & 2) == 2) {
                b += CodedOutputStream.b(2, this.e);
            }
            int i3 = b;
            for (int i4 = 0; i4 < this.h.size(); i4++) {
                i3 += CodedOutputStream.b(3, (fko) this.h.get(i4));
            }
            if ((this.g & 4) == 4) {
                i3 += CodedOutputStream.j(4, this.i);
            }
            if ((this.g & 8) == 8) {
                i3 += CodedOutputStream.b(5, this.j);
            }
            if ((this.g & 16) == 16) {
                i3 += CodedOutputStream.b(6, (fko) q());
            }
            if ((this.g & 32) == 32) {
                i3 += CodedOutputStream.h(7, this.l);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.m.size(); i6++) {
                i5 += CodedOutputStream.b((String) this.m.get(i6));
            }
            int size = i3 + i5 + (this.m.size() * 1);
            for (int i7 = 0; i7 < this.n.size(); i7++) {
                size += CodedOutputStream.b(9, (fko) this.n.get(i7));
            }
            for (int i8 = 0; i8 < this.o.size(); i8++) {
                size += CodedOutputStream.b(10, (fko) this.o.get(i8));
            }
            for (int i9 = 0; i9 < this.f.size(); i9++) {
                size += CodedOutputStream.b(11, (fko) this.f.get(i9));
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.p.size(); i11++) {
                i10 += CodedOutputStream.b((String) this.p.get(i11));
            }
            int size2 = size + i10 + (this.p.size() * 1);
            for (int i12 = 0; i12 < this.q.size(); i12++) {
                size2 += CodedOutputStream.b(13, (fko) this.q.get(i12));
            }
            for (int i13 = 0; i13 < this.r.size(); i13++) {
                size2 += CodedOutputStream.b(14, (fko) this.r.get(i13));
            }
            for (int i14 = 0; i14 < this.s.size(); i14++) {
                size2 += CodedOutputStream.b(15, (fko) this.s.get(i14));
            }
            for (int i15 = 0; i15 < this.t.size(); i15++) {
                size2 += CodedOutputStream.b(16, (fko) this.t.get(i15));
            }
            if ((this.g & 64) == 64) {
                size2 += CodedOutputStream.b(17, (fko) s());
            }
            if ((this.g & 128) == 128) {
                size2 += CodedOutputStream.b(18, this.v);
            }
            if ((this.g & 256) == 256) {
                size2 += CodedOutputStream.b(19, this.w);
            }
            if ((this.g & 512) == 512) {
                size2 += CodedOutputStream.b(20, this.x);
            }
            for (int i16 = 0; i16 < this.y.size(); i16++) {
                size2 += CodedOutputStream.b(21, (fko) this.y.get(i16));
            }
            if ((this.g & 1024) == 1024) {
                size2 += CodedOutputStream.c(22, this.z);
            }
            for (int i17 = 0; i17 < this.A.size(); i17++) {
                size2 += CodedOutputStream.b(23, (fko) this.A.get(i17));
            }
            for (int i18 = 0; i18 < this.B.size(); i18++) {
                size2 += CodedOutputStream.b(24, (fko) this.B.get(i18));
            }
            if ((this.g & 2048) == 2048) {
                size2 += CodedOutputStream.b(25, (fko) x());
            }
            int d2 = size2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z2 = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Album();
                case IS_INITIALIZED:
                    return D;
                case MAKE_IMMUTABLE:
                    this.h.b();
                    this.m.b();
                    this.n.b();
                    this.o.b();
                    this.f.b();
                    this.p.b();
                    this.q.b();
                    this.r.b();
                    this.s.b();
                    this.t.b();
                    this.y.b();
                    this.A.b();
                    this.B.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Album album = (Album) obj2;
                    this.d = fVar.a(m(), this.d, album.m(), album.d);
                    this.e = fVar.a(n(), this.e, album.n(), album.e);
                    this.h = fVar.a(this.h, album.h);
                    this.i = fVar.a(o(), this.i, album.o(), album.i);
                    this.j = fVar.a(p(), this.j, album.p(), album.j);
                    this.k = (Date) fVar.a(this.k, album.k);
                    this.l = fVar.a(r(), this.l, album.r(), album.l);
                    this.m = fVar.a(this.m, album.m);
                    this.n = fVar.a(this.n, album.n);
                    this.o = fVar.a(this.o, album.o);
                    this.f = fVar.a(this.f, album.f);
                    this.p = fVar.a(this.p, album.p);
                    this.q = fVar.a(this.q, album.q);
                    this.r = fVar.a(this.r, album.r);
                    this.s = fVar.a(this.s, album.s);
                    this.t = fVar.a(this.t, album.t);
                    this.u = (ImageGroup) fVar.a(this.u, album.u);
                    this.v = fVar.a(t(), this.v, album.t(), album.v);
                    this.w = fVar.a(u(), this.w, album.u(), album.w);
                    this.x = fVar.a(v(), this.x, album.v(), album.x);
                    this.y = fVar.a(this.y, album.y);
                    this.z = fVar.a(w(), this.z, album.w(), album.z);
                    this.A = fVar.a(this.A, album.A);
                    this.B = fVar.a(this.B, album.B);
                    this.C = (Licensor) fVar.a(this.C, album.C);
                    if (fVar == e.a) {
                        this.g |= album.g;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    fke fke = (fke) obj2;
                    while (!z2) {
                        try {
                            int a2 = fkc.a();
                            switch (a2) {
                                case 0:
                                    z2 = true;
                                    break;
                                case 10:
                                    this.g |= 1;
                                    this.d = fkc.e();
                                    break;
                                case 18:
                                    String c = fkc.c();
                                    this.g |= 2;
                                    this.e = c;
                                    break;
                                case 26:
                                    if (!this.h.a()) {
                                        this.h = GeneratedMessageLite.a(this.h);
                                    }
                                    this.h.add(fkc.a(Artist.parser(), fke));
                                    break;
                                case 32:
                                    int g2 = fkc.g();
                                    if (Type.a(g2) != null) {
                                        this.g |= 4;
                                        this.i = g2;
                                        break;
                                    } else {
                                        super.a(4, g2);
                                        break;
                                    }
                                case 42:
                                    String c2 = fkc.c();
                                    this.g |= 8;
                                    this.j = c2;
                                    break;
                                case 50:
                                    a aVar = (this.g & 16) == 16 ? (a) this.k.h() : null;
                                    this.k = (Date) fkc.a(Date.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.k);
                                        this.k = (Date) aVar.e();
                                    }
                                    this.g |= 16;
                                    break;
                                case 56:
                                    this.g |= 32;
                                    this.l = fkc.f();
                                    break;
                                case b.bu /*66*/:
                                    String c3 = fkc.c();
                                    if (!this.m.a()) {
                                        this.m = GeneratedMessageLite.a(this.m);
                                    }
                                    this.m.add(c3);
                                    break;
                                case b.bC /*74*/:
                                    if (!this.n.a()) {
                                        this.n = GeneratedMessageLite.a(this.n);
                                    }
                                    this.n.add(fkc.a(Image.parser(), fke));
                                    break;
                                case 82:
                                    if (!this.o.a()) {
                                        this.o = GeneratedMessageLite.a(this.o);
                                    }
                                    this.o.add(fkc.a(ExternalId.parser(), fke));
                                    break;
                                case 90:
                                    if (!this.f.a()) {
                                        this.f = GeneratedMessageLite.a(this.f);
                                    }
                                    this.f.add(fkc.a(Disc.parser(), fke));
                                    break;
                                case 98:
                                    String c4 = fkc.c();
                                    if (!this.p.a()) {
                                        this.p = GeneratedMessageLite.a(this.p);
                                    }
                                    this.p.add(c4);
                                    break;
                                case 106:
                                    if (!this.q.a()) {
                                        this.q = GeneratedMessageLite.a(this.q);
                                    }
                                    this.q.add(fkc.a(Copyright.parser(), fke));
                                    break;
                                case defpackage.o.a.aB /*114*/:
                                    if (!this.r.a()) {
                                        this.r = GeneratedMessageLite.a(this.r);
                                    }
                                    this.r.add(fkc.a(Restriction.parser(), fke));
                                    break;
                                case 122:
                                    if (!this.s.a()) {
                                        this.s = GeneratedMessageLite.a(this.s);
                                    }
                                    this.s.add(fkc.a(parser(), fke));
                                    break;
                                case 130:
                                    if (!this.t.a()) {
                                        this.t = GeneratedMessageLite.a(this.t);
                                    }
                                    this.t.add(fkc.a(SalePeriod.parser(), fke));
                                    break;
                                case 138:
                                    a aVar2 = (this.g & 64) == 64 ? (a) this.u.h() : null;
                                    this.u = (ImageGroup) fkc.a(ImageGroup.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.u);
                                        this.u = (ImageGroup) aVar2.e();
                                    }
                                    this.g |= 64;
                                    break;
                                case 146:
                                    String c5 = fkc.c();
                                    this.g |= 128;
                                    this.v = c5;
                                    break;
                                case 154:
                                    String c6 = fkc.c();
                                    this.g |= 256;
                                    this.w = c6;
                                    break;
                                case 162:
                                    String c7 = fkc.c();
                                    this.g |= 512;
                                    this.x = c7;
                                    break;
                                case 170:
                                    if (!this.y.a()) {
                                        this.y = GeneratedMessageLite.a(this.y);
                                    }
                                    this.y.add(fkc.a(Block.parser(), fke));
                                    break;
                                case 176:
                                    this.g |= 1024;
                                    this.z = fkc.h();
                                    break;
                                case 186:
                                    if (!this.A.a()) {
                                        this.A = GeneratedMessageLite.a(this.A);
                                    }
                                    this.A.add(fkc.a(Availability.parser(), fke));
                                    break;
                                case 194:
                                    if (!this.B.a()) {
                                        this.B = GeneratedMessageLite.a(this.B);
                                    }
                                    this.B.add(fkc.a(Track.parser(), fke));
                                    break;
                                case 202:
                                    a aVar3 = (this.g & 2048) == 2048 ? (a) this.C.h() : null;
                                    this.C = (Licensor) fkc.a(Licensor.parser(), fke);
                                    if (aVar3 != null) {
                                        aVar3.a(this.C);
                                        this.C = (Licensor) aVar3.e();
                                    }
                                    this.g |= 2048;
                                    break;
                                default:
                                    if (a(a2, fkc)) {
                                        break;
                                    }
                                    z2 = true;
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
                    if (E == null) {
                        synchronized (Album.class) {
                            if (E == null) {
                                E = new b(D);
                            }
                        }
                    }
                    return E;
                default:
                    throw new UnsupportedOperationException();
            }
            return D;
        }

        static {
            Album album = new Album();
            D = album;
            album.e();
        }

        public static Album k() {
            return D;
        }

        public static fkr<Album> parser() {
            return D.c();
        }
    }

    public static final class AlbumGroup extends GeneratedMessageLite<AlbumGroup, a> implements gqb {
        /* access modifiers changed from: private */
        public static final AlbumGroup e;
        private static volatile fkr<AlbumGroup> f;
        private e<Album> d = fks.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<AlbumGroup, a> implements gqb {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(AlbumGroup.e);
            }
        }

        private AlbumGroup() {
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.a(1, (fko) this.d.get(i));
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                i2 += CodedOutputStream.b(1, (fko) this.d.get(i3));
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new AlbumGroup();
                case IS_INITIALIZED:
                    return e;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    this.d = ((f) obj).a(this.d, ((AlbumGroup) obj2).d);
                    e eVar = e.a;
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
                                    this.d.add(fkc.a(Album.parser(), fke));
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
                    if (f == null) {
                        synchronized (AlbumGroup.class) {
                            if (f == null) {
                                f = new b(e);
                            }
                        }
                    }
                    return f;
                default:
                    throw new UnsupportedOperationException();
            }
            return e;
        }

        static {
            AlbumGroup albumGroup = new AlbumGroup();
            e = albumGroup;
            albumGroup.e();
        }

        public static fkr<AlbumGroup> parser() {
            return e.c();
        }
    }

    public static final class Artist extends GeneratedMessageLite<Artist, a> implements gqd {
        /* access modifiers changed from: private */
        public static final Artist y;
        private static volatile fkr<Artist> z;
        public ByteString d = ByteString.a;
        public String e = "";
        public e<TopTracks> f = fks.d();
        private int g;
        private int h;
        private e<AlbumGroup> i = fks.d();
        private e<AlbumGroup> j = fks.d();
        private e<AlbumGroup> k = fks.d();
        private e<AlbumGroup> l = fks.d();
        private e<String> m = fks.d();
        private e<ExternalId> n = fks.d();
        private e<Image> o = fks.d();
        private e<Biography> p = fks.d();
        private e<ActivityPeriod> q = fks.d();
        private e<Restriction> r = fks.d();
        private e<Artist> s = fks.d();
        private boolean t;
        private ImageGroup u;
        private e<SalePeriod> v = fks.d();
        private e<LocalizedString> w = fks.d();
        private e<Availability> x = fks.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Artist, a> implements gqd {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(Artist.y);
            }
        }

        private Artist() {
        }

        private boolean l() {
            return (this.g & 1) == 1;
        }

        private boolean m() {
            return (this.g & 2) == 2;
        }

        private boolean n() {
            return (this.g & 4) == 4;
        }

        private boolean o() {
            return (this.g & 8) == 8;
        }

        private ImageGroup p() {
            ImageGroup imageGroup = this.u;
            return imageGroup == null ? ImageGroup.k() : imageGroup;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.g & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.g & 2) == 2) {
                codedOutputStream.a(2, this.e);
            }
            if ((this.g & 4) == 4) {
                codedOutputStream.d(3, this.h);
            }
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                codedOutputStream.a(4, (fko) this.f.get(i2));
            }
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                codedOutputStream.a(5, (fko) this.i.get(i3));
            }
            for (int i4 = 0; i4 < this.j.size(); i4++) {
                codedOutputStream.a(6, (fko) this.j.get(i4));
            }
            for (int i5 = 0; i5 < this.k.size(); i5++) {
                codedOutputStream.a(7, (fko) this.k.get(i5));
            }
            for (int i6 = 0; i6 < this.l.size(); i6++) {
                codedOutputStream.a(8, (fko) this.l.get(i6));
            }
            for (int i7 = 0; i7 < this.m.size(); i7++) {
                codedOutputStream.a(9, (String) this.m.get(i7));
            }
            for (int i8 = 0; i8 < this.n.size(); i8++) {
                codedOutputStream.a(10, (fko) this.n.get(i8));
            }
            for (int i9 = 0; i9 < this.o.size(); i9++) {
                codedOutputStream.a(11, (fko) this.o.get(i9));
            }
            for (int i10 = 0; i10 < this.p.size(); i10++) {
                codedOutputStream.a(12, (fko) this.p.get(i10));
            }
            for (int i11 = 0; i11 < this.q.size(); i11++) {
                codedOutputStream.a(13, (fko) this.q.get(i11));
            }
            for (int i12 = 0; i12 < this.r.size(); i12++) {
                codedOutputStream.a(14, (fko) this.r.get(i12));
            }
            for (int i13 = 0; i13 < this.s.size(); i13++) {
                codedOutputStream.a(15, (fko) this.s.get(i13));
            }
            if ((this.g & 8) == 8) {
                codedOutputStream.a(16, this.t);
            }
            if ((this.g & 16) == 16) {
                codedOutputStream.a(17, (fko) p());
            }
            for (int i14 = 0; i14 < this.v.size(); i14++) {
                codedOutputStream.a(18, (fko) this.v.get(i14));
            }
            for (int i15 = 0; i15 < this.w.size(); i15++) {
                codedOutputStream.a(19, (fko) this.w.get(i15));
            }
            for (int i16 = 0; i16 < this.x.size(); i16++) {
                codedOutputStream.a(20, (fko) this.x.get(i16));
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int b = (this.g & 1) == 1 ? CodedOutputStream.b(1, this.d) + 0 : 0;
            if ((this.g & 2) == 2) {
                b += CodedOutputStream.b(2, this.e);
            }
            if ((this.g & 4) == 4) {
                b += CodedOutputStream.h(3, this.h);
            }
            int i3 = b;
            for (int i4 = 0; i4 < this.f.size(); i4++) {
                i3 += CodedOutputStream.b(4, (fko) this.f.get(i4));
            }
            for (int i5 = 0; i5 < this.i.size(); i5++) {
                i3 += CodedOutputStream.b(5, (fko) this.i.get(i5));
            }
            for (int i6 = 0; i6 < this.j.size(); i6++) {
                i3 += CodedOutputStream.b(6, (fko) this.j.get(i6));
            }
            for (int i7 = 0; i7 < this.k.size(); i7++) {
                i3 += CodedOutputStream.b(7, (fko) this.k.get(i7));
            }
            for (int i8 = 0; i8 < this.l.size(); i8++) {
                i3 += CodedOutputStream.b(8, (fko) this.l.get(i8));
            }
            int i9 = 0;
            for (int i10 = 0; i10 < this.m.size(); i10++) {
                i9 += CodedOutputStream.b((String) this.m.get(i10));
            }
            int size = i3 + i9 + (this.m.size() * 1);
            for (int i11 = 0; i11 < this.n.size(); i11++) {
                size += CodedOutputStream.b(10, (fko) this.n.get(i11));
            }
            for (int i12 = 0; i12 < this.o.size(); i12++) {
                size += CodedOutputStream.b(11, (fko) this.o.get(i12));
            }
            for (int i13 = 0; i13 < this.p.size(); i13++) {
                size += CodedOutputStream.b(12, (fko) this.p.get(i13));
            }
            for (int i14 = 0; i14 < this.q.size(); i14++) {
                size += CodedOutputStream.b(13, (fko) this.q.get(i14));
            }
            for (int i15 = 0; i15 < this.r.size(); i15++) {
                size += CodedOutputStream.b(14, (fko) this.r.get(i15));
            }
            for (int i16 = 0; i16 < this.s.size(); i16++) {
                size += CodedOutputStream.b(15, (fko) this.s.get(i16));
            }
            if ((this.g & 8) == 8) {
                size += CodedOutputStream.b(16, this.t);
            }
            if ((this.g & 16) == 16) {
                size += CodedOutputStream.b(17, (fko) p());
            }
            for (int i17 = 0; i17 < this.v.size(); i17++) {
                size += CodedOutputStream.b(18, (fko) this.v.get(i17));
            }
            for (int i18 = 0; i18 < this.w.size(); i18++) {
                size += CodedOutputStream.b(19, (fko) this.w.get(i18));
            }
            for (int i19 = 0; i19 < this.x.size(); i19++) {
                size += CodedOutputStream.b(20, (fko) this.x.get(i19));
            }
            int d2 = size + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z2 = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Artist();
                case IS_INITIALIZED:
                    return y;
                case MAKE_IMMUTABLE:
                    this.f.b();
                    this.i.b();
                    this.j.b();
                    this.k.b();
                    this.l.b();
                    this.m.b();
                    this.n.b();
                    this.o.b();
                    this.p.b();
                    this.q.b();
                    this.r.b();
                    this.s.b();
                    this.v.b();
                    this.w.b();
                    this.x.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Artist artist = (Artist) obj2;
                    this.d = fVar.a(l(), this.d, artist.l(), artist.d);
                    this.e = fVar.a(m(), this.e, artist.m(), artist.e);
                    this.h = fVar.a(n(), this.h, artist.n(), artist.h);
                    this.f = fVar.a(this.f, artist.f);
                    this.i = fVar.a(this.i, artist.i);
                    this.j = fVar.a(this.j, artist.j);
                    this.k = fVar.a(this.k, artist.k);
                    this.l = fVar.a(this.l, artist.l);
                    this.m = fVar.a(this.m, artist.m);
                    this.n = fVar.a(this.n, artist.n);
                    this.o = fVar.a(this.o, artist.o);
                    this.p = fVar.a(this.p, artist.p);
                    this.q = fVar.a(this.q, artist.q);
                    this.r = fVar.a(this.r, artist.r);
                    this.s = fVar.a(this.s, artist.s);
                    this.t = fVar.a(o(), this.t, artist.o(), artist.t);
                    this.u = (ImageGroup) fVar.a(this.u, artist.u);
                    this.v = fVar.a(this.v, artist.v);
                    this.w = fVar.a(this.w, artist.w);
                    this.x = fVar.a(this.x, artist.x);
                    if (fVar == e.a) {
                        this.g |= artist.g;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    fke fke = (fke) obj2;
                    while (!z2) {
                        try {
                            int a2 = fkc.a();
                            switch (a2) {
                                case 0:
                                    z2 = true;
                                    break;
                                case 10:
                                    this.g |= 1;
                                    this.d = fkc.e();
                                    break;
                                case 18:
                                    String c = fkc.c();
                                    this.g |= 2;
                                    this.e = c;
                                    break;
                                case 24:
                                    this.g |= 4;
                                    this.h = fkc.f();
                                    break;
                                case 34:
                                    if (!this.f.a()) {
                                        this.f = GeneratedMessageLite.a(this.f);
                                    }
                                    this.f.add(fkc.a(TopTracks.parser(), fke));
                                    break;
                                case 42:
                                    if (!this.i.a()) {
                                        this.i = GeneratedMessageLite.a(this.i);
                                    }
                                    this.i.add(fkc.a(AlbumGroup.parser(), fke));
                                    break;
                                case 50:
                                    if (!this.j.a()) {
                                        this.j = GeneratedMessageLite.a(this.j);
                                    }
                                    this.j.add(fkc.a(AlbumGroup.parser(), fke));
                                    break;
                                case 58:
                                    if (!this.k.a()) {
                                        this.k = GeneratedMessageLite.a(this.k);
                                    }
                                    this.k.add(fkc.a(AlbumGroup.parser(), fke));
                                    break;
                                case b.bu /*66*/:
                                    if (!this.l.a()) {
                                        this.l = GeneratedMessageLite.a(this.l);
                                    }
                                    this.l.add(fkc.a(AlbumGroup.parser(), fke));
                                    break;
                                case b.bC /*74*/:
                                    String c2 = fkc.c();
                                    if (!this.m.a()) {
                                        this.m = GeneratedMessageLite.a(this.m);
                                    }
                                    this.m.add(c2);
                                    break;
                                case 82:
                                    if (!this.n.a()) {
                                        this.n = GeneratedMessageLite.a(this.n);
                                    }
                                    this.n.add(fkc.a(ExternalId.parser(), fke));
                                    break;
                                case 90:
                                    if (!this.o.a()) {
                                        this.o = GeneratedMessageLite.a(this.o);
                                    }
                                    this.o.add(fkc.a(Image.parser(), fke));
                                    break;
                                case 98:
                                    if (!this.p.a()) {
                                        this.p = GeneratedMessageLite.a(this.p);
                                    }
                                    this.p.add(fkc.a(Biography.parser(), fke));
                                    break;
                                case 106:
                                    if (!this.q.a()) {
                                        this.q = GeneratedMessageLite.a(this.q);
                                    }
                                    this.q.add(fkc.a(ActivityPeriod.parser(), fke));
                                    break;
                                case defpackage.o.a.aB /*114*/:
                                    if (!this.r.a()) {
                                        this.r = GeneratedMessageLite.a(this.r);
                                    }
                                    this.r.add(fkc.a(Restriction.parser(), fke));
                                    break;
                                case 122:
                                    if (!this.s.a()) {
                                        this.s = GeneratedMessageLite.a(this.s);
                                    }
                                    this.s.add(fkc.a(parser(), fke));
                                    break;
                                case 128:
                                    this.g |= 8;
                                    this.t = fkc.b();
                                    break;
                                case 138:
                                    a aVar = (this.g & 16) == 16 ? (a) this.u.h() : null;
                                    this.u = (ImageGroup) fkc.a(ImageGroup.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.u);
                                        this.u = (ImageGroup) aVar.e();
                                    }
                                    this.g |= 16;
                                    break;
                                case 146:
                                    if (!this.v.a()) {
                                        this.v = GeneratedMessageLite.a(this.v);
                                    }
                                    this.v.add(fkc.a(SalePeriod.parser(), fke));
                                    break;
                                case 154:
                                    if (!this.w.a()) {
                                        this.w = GeneratedMessageLite.a(this.w);
                                    }
                                    this.w.add(fkc.a(LocalizedString.parser(), fke));
                                    break;
                                case 162:
                                    if (!this.x.a()) {
                                        this.x = GeneratedMessageLite.a(this.x);
                                    }
                                    this.x.add(fkc.a(Availability.parser(), fke));
                                    break;
                                default:
                                    if (a(a2, fkc)) {
                                        break;
                                    }
                                    z2 = true;
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
                    if (z == null) {
                        synchronized (Artist.class) {
                            if (z == null) {
                                z = new b(y);
                            }
                        }
                    }
                    return z;
                default:
                    throw new UnsupportedOperationException();
            }
            return y;
        }

        static {
            Artist artist = new Artist();
            y = artist;
            artist.e();
        }

        public static fkr<Artist> parser() {
            return y.c();
        }
    }

    public static final class AudioFile extends GeneratedMessageLite<AudioFile, a> implements gqe {
        /* access modifiers changed from: private */
        public static final AudioFile g;
        private static volatile fkr<AudioFile> h;
        private int d;
        private ByteString e = ByteString.a;
        private int f;

        public enum Format implements b {
            OGG_VORBIS_96(0),
            OGG_VORBIS_160(1),
            OGG_VORBIS_320(2),
            MP3_256(3),
            MP3_320(4),
            MP3_160(5),
            MP3_96(6),
            MP3_160_ENC(7),
            AAC_24(8),
            AAC_48(9),
            MP4_128(10),
            MP4_256(11);
            
            private final int value;

            static {
                new Object() {
                };
            }

            public final int a() {
                return this.value;
            }

            public static Format a(int i) {
                switch (i) {
                    case 0:
                        return OGG_VORBIS_96;
                    case 1:
                        return OGG_VORBIS_160;
                    case 2:
                        return OGG_VORBIS_320;
                    case 3:
                        return MP3_256;
                    case 4:
                        return MP3_320;
                    case 5:
                        return MP3_160;
                    case 6:
                        return MP3_96;
                    case 7:
                        return MP3_160_ENC;
                    case 8:
                        return AAC_24;
                    case 9:
                        return AAC_48;
                    case 10:
                        return MP4_128;
                    case 11:
                        return MP4_256;
                    default:
                        return null;
                }
            }

            private Format(int i) {
                this.value = i;
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<AudioFile, a> implements gqe {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(AudioFile.g);
            }
        }

        private AudioFile() {
        }

        private boolean l() {
            return (this.d & 1) == 1;
        }

        private boolean m() {
            return (this.d & 2) == 2;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, this.e);
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.b(2, this.f);
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
                i2 += CodedOutputStream.j(2, this.f);
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new AudioFile();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    AudioFile audioFile = (AudioFile) obj2;
                    this.e = fVar.a(l(), this.e, audioFile.l(), audioFile.e);
                    this.f = fVar.a(m(), this.f, audioFile.m(), audioFile.f);
                    if (fVar == e.a) {
                        this.d |= audioFile.d;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    this.d |= 1;
                                    this.e = fkc.e();
                                } else if (a2 == 16) {
                                    int g2 = fkc.g();
                                    if (Format.a(g2) == null) {
                                        super.a(2, g2);
                                    } else {
                                        this.d |= 2;
                                        this.f = g2;
                                    }
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
                        synchronized (AudioFile.class) {
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
            AudioFile audioFile = new AudioFile();
            g = audioFile;
            audioFile.e();
        }

        public static fkr<AudioFile> parser() {
            return g.c();
        }
    }

    public static final class Availability extends GeneratedMessageLite<Availability, a> implements gqf {
        /* access modifiers changed from: private */
        public static final Availability g;
        private static volatile fkr<Availability> h;
        private int d;
        private e<String> e = fks.d();
        private Date f;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Availability, a> implements gqf {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(Availability.g);
            }
        }

        private Availability() {
        }

        private Date l() {
            Date date = this.f;
            return date == null ? Date.k() : date;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.e.size(); i++) {
                codedOutputStream.a(1, (String) this.e.get(i));
            }
            if ((this.d & 1) == 1) {
                codedOutputStream.a(2, (fko) l());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                i2 += CodedOutputStream.b((String) this.e.get(i3));
            }
            int size = i2 + 0 + (this.e.size() * 1);
            if ((this.d & 1) == 1) {
                size += CodedOutputStream.b(2, (fko) l());
            }
            int d2 = size + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Availability();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    this.e.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Availability availability = (Availability) obj2;
                    this.e = fVar.a(this.e, availability.e);
                    this.f = (Date) fVar.a(this.f, availability.f);
                    if (fVar == e.a) {
                        this.d |= availability.d;
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
                                    if (!this.e.a()) {
                                        this.e = GeneratedMessageLite.a(this.e);
                                    }
                                    this.e.add(c);
                                } else if (a2 == 18) {
                                    a aVar = (this.d & 1) == 1 ? (a) this.f.h() : null;
                                    this.f = (Date) fkc.a(Date.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (Date) aVar.e();
                                    }
                                    this.d |= 1;
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
                        synchronized (Availability.class) {
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
            Availability availability = new Availability();
            g = availability;
            availability.e();
        }

        public static fkr<Availability> parser() {
            return g.c();
        }
    }

    public static final class Biography extends GeneratedMessageLite<Biography, a> implements gqg {
        /* access modifiers changed from: private */
        public static final Biography i;
        private static volatile fkr<Biography> j;
        private int d;
        private String e = "";
        private e<Image> f = fks.d();
        private e<ImageGroup> g = fks.d();
        private e<LocalizedString> h = fks.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Biography, a> implements gqg {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(Biography.i);
            }
        }

        private Biography() {
        }

        private boolean l() {
            return (this.d & 1) == 1;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, this.e);
            }
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                codedOutputStream.a(2, (fko) this.f.get(i2));
            }
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                codedOutputStream.a(3, (fko) this.g.get(i3));
            }
            for (int i4 = 0; i4 < this.h.size(); i4++) {
                codedOutputStream.a(4, (fko) this.h.get(i4));
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int b = (this.d & 1) == 1 ? CodedOutputStream.b(1, this.e) + 0 : 0;
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                b += CodedOutputStream.b(2, (fko) this.f.get(i3));
            }
            for (int i4 = 0; i4 < this.g.size(); i4++) {
                b += CodedOutputStream.b(3, (fko) this.g.get(i4));
            }
            for (int i5 = 0; i5 < this.h.size(); i5++) {
                b += CodedOutputStream.b(4, (fko) this.h.get(i5));
            }
            int d2 = b + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Biography();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    this.f.b();
                    this.g.b();
                    this.h.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Biography biography = (Biography) obj2;
                    this.e = fVar.a(l(), this.e, biography.l(), biography.e);
                    this.f = fVar.a(this.f, biography.f);
                    this.g = fVar.a(this.g, biography.g);
                    this.h = fVar.a(this.h, biography.h);
                    if (fVar == e.a) {
                        this.d |= biography.d;
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
                                    if (!this.f.a()) {
                                        this.f = GeneratedMessageLite.a(this.f);
                                    }
                                    this.f.add(fkc.a(Image.parser(), fke));
                                } else if (a2 == 26) {
                                    if (!this.g.a()) {
                                        this.g = GeneratedMessageLite.a(this.g);
                                    }
                                    this.g.add(fkc.a(ImageGroup.parser(), fke));
                                } else if (a2 == 34) {
                                    if (!this.h.a()) {
                                        this.h = GeneratedMessageLite.a(this.h);
                                    }
                                    this.h.add(fkc.a(LocalizedString.parser(), fke));
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
                    if (j == null) {
                        synchronized (Biography.class) {
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

        static {
            Biography biography = new Biography();
            i = biography;
            biography.e();
        }

        public static fkr<Biography> parser() {
            return i.c();
        }
    }

    public static final class Block extends GeneratedMessageLite<Block, a> implements gqh {
        /* access modifiers changed from: private */
        public static final Block g;
        private static volatile fkr<Block> h;
        private int d;
        private String e = "";
        private int f;

        public enum Type implements b {
            TOTAL(0),
            COVERARTCP(1);
            
            private final int value;

            static {
                new Object() {
                };
            }

            public final int a() {
                return this.value;
            }

            public static Type a(int i) {
                if (i == 0) {
                    return TOTAL;
                }
                if (i != 1) {
                    return null;
                }
                return COVERARTCP;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Block, a> implements gqh {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(Block.g);
            }
        }

        private Block() {
        }

        private boolean l() {
            return (this.d & 1) == 1;
        }

        private boolean m() {
            return (this.d & 2) == 2;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, this.e);
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.b(2, this.f);
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
                i2 += CodedOutputStream.j(2, this.f);
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Block();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Block block = (Block) obj2;
                    this.e = fVar.a(l(), this.e, block.l(), block.e);
                    this.f = fVar.a(m(), this.f, block.m(), block.f);
                    if (fVar == e.a) {
                        this.d |= block.d;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    String c = fkc.c();
                                    this.d |= 1;
                                    this.e = c;
                                } else if (a2 == 16) {
                                    int g2 = fkc.g();
                                    if (Type.a(g2) == null) {
                                        super.a(2, g2);
                                    } else {
                                        this.d |= 2;
                                        this.f = g2;
                                    }
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
                        synchronized (Block.class) {
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
            Block block = new Block();
            g = block;
            block.e();
        }

        public static fkr<Block> parser() {
            return g.c();
        }
    }

    public static final class Copyright extends GeneratedMessageLite<Copyright, a> implements gqi {
        /* access modifiers changed from: private */
        public static final Copyright g;
        private static volatile fkr<Copyright> h;
        private int d;
        private int e;
        private String f = "";

        public enum Type implements b {
            P(0),
            C(1);
            
            private final int value;

            static {
                new Object() {
                };
            }

            public final int a() {
                return this.value;
            }

            public static Type a(int i) {
                if (i == 0) {
                    return P;
                }
                if (i != 1) {
                    return null;
                }
                return C;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Copyright, a> implements gqi {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(Copyright.g);
            }
        }

        private Copyright() {
        }

        private boolean l() {
            return (this.d & 1) == 1;
        }

        private boolean m() {
            return (this.d & 2) == 2;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.b(1, this.e);
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, this.f);
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
                i2 = 0 + CodedOutputStream.j(1, this.e);
            }
            if ((this.d & 2) == 2) {
                i2 += CodedOutputStream.b(2, this.f);
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Copyright();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Copyright copyright = (Copyright) obj2;
                    this.e = fVar.a(l(), this.e, copyright.l(), copyright.e);
                    this.f = fVar.a(m(), this.f, copyright.m(), copyright.f);
                    if (fVar == e.a) {
                        this.d |= copyright.d;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    int g2 = fkc.g();
                                    if (Type.a(g2) == null) {
                                        super.a(1, g2);
                                    } else {
                                        this.d |= 1;
                                        this.e = g2;
                                    }
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
                        synchronized (Copyright.class) {
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
            Copyright copyright = new Copyright();
            g = copyright;
            copyright.e();
        }

        public static fkr<Copyright> parser() {
            return g.c();
        }
    }

    public static final class Date extends GeneratedMessageLite<Date, a> implements gqj {
        /* access modifiers changed from: private */
        public static final Date j;
        private static volatile fkr<Date> k;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Date, a> implements gqj {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(Date.j);
            }
        }

        private Date() {
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

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.d(1, this.e);
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.d(2, this.f);
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.d(3, this.g);
            }
            if ((this.d & 8) == 8) {
                codedOutputStream.d(4, this.h);
            }
            if ((this.d & 16) == 16) {
                codedOutputStream.d(5, this.i);
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
                i3 = 0 + CodedOutputStream.h(1, this.e);
            }
            if ((this.d & 2) == 2) {
                i3 += CodedOutputStream.h(2, this.f);
            }
            if ((this.d & 4) == 4) {
                i3 += CodedOutputStream.h(3, this.g);
            }
            if ((this.d & 8) == 8) {
                i3 += CodedOutputStream.h(4, this.h);
            }
            if ((this.d & 16) == 16) {
                i3 += CodedOutputStream.h(5, this.i);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Date();
                case IS_INITIALIZED:
                    return j;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Date date = (Date) obj2;
                    this.e = fVar.a(m(), this.e, date.m(), date.e);
                    this.f = fVar.a(n(), this.f, date.n(), date.f);
                    this.g = fVar.a(o(), this.g, date.o(), date.g);
                    this.h = fVar.a(p(), this.h, date.p(), date.h);
                    this.i = fVar.a(q(), this.i, date.q(), date.i);
                    if (fVar == e.a) {
                        this.d |= date.d;
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
                                    this.e = fkc.f();
                                } else if (a2 == 16) {
                                    this.d |= 2;
                                    this.f = fkc.f();
                                } else if (a2 == 24) {
                                    this.d |= 4;
                                    this.g = fkc.f();
                                } else if (a2 == 32) {
                                    this.d |= 8;
                                    this.h = fkc.f();
                                } else if (a2 == 40) {
                                    this.d |= 16;
                                    this.i = fkc.f();
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
                        synchronized (Date.class) {
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
            Date date = new Date();
            j = date;
            date.e();
        }

        public static Date k() {
            return j;
        }

        public static fkr<Date> parser() {
            return j.c();
        }
    }

    public static final class Disc extends GeneratedMessageLite<Disc, a> implements gqk {
        /* access modifiers changed from: private */
        public static final Disc h;
        private static volatile fkr<Disc> i;
        public e<Track> d = fks.d();
        private int e;
        private int f;
        private String g = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Disc, a> implements gqk {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(Disc.h);
            }
        }

        private Disc() {
        }

        private boolean l() {
            return (this.e & 1) == 1;
        }

        private boolean m() {
            return (this.e & 2) == 2;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.e & 1) == 1) {
                codedOutputStream.d(1, this.f);
            }
            if ((this.e & 2) == 2) {
                codedOutputStream.a(2, this.g);
            }
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                codedOutputStream.a(3, (fko) this.d.get(i2));
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int h2 = (this.e & 1) == 1 ? CodedOutputStream.h(1, this.f) + 0 : 0;
            if ((this.e & 2) == 2) {
                h2 += CodedOutputStream.b(2, this.g);
            }
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                h2 += CodedOutputStream.b(3, (fko) this.d.get(i3));
            }
            int d2 = h2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Disc();
                case IS_INITIALIZED:
                    return h;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Disc disc = (Disc) obj2;
                    this.f = fVar.a(l(), this.f, disc.l(), disc.f);
                    this.g = fVar.a(m(), this.g, disc.m(), disc.g);
                    this.d = fVar.a(this.d, disc.d);
                    if (fVar == e.a) {
                        this.e |= disc.e;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    fke fke = (fke) obj2;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.e |= 1;
                                    this.f = fkc.f();
                                } else if (a2 == 18) {
                                    String c = fkc.c();
                                    this.e |= 2;
                                    this.g = c;
                                } else if (a2 == 26) {
                                    if (!this.d.a()) {
                                        this.d = GeneratedMessageLite.a(this.d);
                                    }
                                    this.d.add(fkc.a(Track.parser(), fke));
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
                    if (i == null) {
                        synchronized (Disc.class) {
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

        static {
            Disc disc = new Disc();
            h = disc;
            disc.e();
        }

        public static fkr<Disc> parser() {
            return h.c();
        }
    }

    public static final class ExternalId extends GeneratedMessageLite<ExternalId, a> implements gql {
        /* access modifiers changed from: private */
        public static final ExternalId g;
        private static volatile fkr<ExternalId> h;
        private int d;
        private String e;
        private String f;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ExternalId, a> implements gql {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ExternalId.g);
            }
        }

        private ExternalId() {
            String str = "";
            this.e = str;
            this.f = str;
        }

        private boolean l() {
            return (this.d & 1) == 1;
        }

        private boolean m() {
            return (this.d & 2) == 2;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, this.e);
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, this.f);
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
                i2 += CodedOutputStream.b(2, this.f);
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ExternalId();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ExternalId externalId = (ExternalId) obj2;
                    this.e = fVar.a(l(), this.e, externalId.l(), externalId.e);
                    this.f = fVar.a(m(), this.f, externalId.m(), externalId.f);
                    if (fVar == e.a) {
                        this.d |= externalId.d;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
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
                        synchronized (ExternalId.class) {
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
            ExternalId externalId = new ExternalId();
            g = externalId;
            externalId.e();
        }

        public static fkr<ExternalId> parser() {
            return g.c();
        }
    }

    public static final class Image extends GeneratedMessageLite<Image, a> implements gqn {
        /* access modifiers changed from: private */
        public static final Image i;
        private static volatile fkr<Image> j;
        private int d;
        private ByteString e = ByteString.a;
        private int f;
        private int g;
        private int h;

        public enum Size implements b {
            DEFAULT(0),
            SMALL(1),
            LARGE(2),
            XLARGE(3);
            
            private final int value;

            static {
                new Object() {
                };
            }

            public final int a() {
                return this.value;
            }

            public static Size a(int i) {
                if (i == 0) {
                    return DEFAULT;
                }
                if (i == 1) {
                    return SMALL;
                }
                if (i == 2) {
                    return LARGE;
                }
                if (i != 3) {
                    return null;
                }
                return XLARGE;
            }

            private Size(int i) {
                this.value = i;
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Image, a> implements gqn {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(Image.i);
            }
        }

        private Image() {
        }

        private boolean l() {
            return (this.d & 1) == 1;
        }

        private boolean m() {
            return (this.d & 2) == 2;
        }

        private boolean n() {
            return (this.d & 4) == 4;
        }

        private boolean o() {
            return (this.d & 8) == 8;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, this.e);
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.b(2, this.f);
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.d(3, this.g);
            }
            if ((this.d & 8) == 8) {
                codedOutputStream.d(4, this.h);
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
                i3 += CodedOutputStream.j(2, this.f);
            }
            if ((this.d & 4) == 4) {
                i3 += CodedOutputStream.h(3, this.g);
            }
            if ((this.d & 8) == 8) {
                i3 += CodedOutputStream.h(4, this.h);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Image();
                case IS_INITIALIZED:
                    return i;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Image image = (Image) obj2;
                    this.e = fVar.a(l(), this.e, image.l(), image.e);
                    this.f = fVar.a(m(), this.f, image.m(), image.f);
                    this.g = fVar.a(n(), this.g, image.n(), image.g);
                    this.h = fVar.a(o(), this.h, image.o(), image.h);
                    if (fVar == e.a) {
                        this.d |= image.d;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    this.d |= 1;
                                    this.e = fkc.e();
                                } else if (a2 == 16) {
                                    int g2 = fkc.g();
                                    if (Size.a(g2) == null) {
                                        super.a(2, g2);
                                    } else {
                                        this.d |= 2;
                                        this.f = g2;
                                    }
                                } else if (a2 == 24) {
                                    this.d |= 4;
                                    this.g = fkc.f();
                                } else if (a2 == 32) {
                                    this.d |= 8;
                                    this.h = fkc.f();
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
                    if (j == null) {
                        synchronized (Image.class) {
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

        static {
            Image image = new Image();
            i = image;
            image.e();
        }

        public static fkr<Image> parser() {
            return i.c();
        }
    }

    public static final class ImageGroup extends GeneratedMessageLite<ImageGroup, a> implements gqm {
        /* access modifiers changed from: private */
        public static final ImageGroup e;
        private static volatile fkr<ImageGroup> f;
        private e<Image> d = fks.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ImageGroup, a> implements gqm {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ImageGroup.e);
            }
        }

        private ImageGroup() {
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.a(1, (fko) this.d.get(i));
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                i2 += CodedOutputStream.b(1, (fko) this.d.get(i3));
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ImageGroup();
                case IS_INITIALIZED:
                    return e;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    this.d = ((f) obj).a(this.d, ((ImageGroup) obj2).d);
                    e eVar = e.a;
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
                                    this.d.add(fkc.a(Image.parser(), fke));
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
                    if (f == null) {
                        synchronized (ImageGroup.class) {
                            if (f == null) {
                                f = new b(e);
                            }
                        }
                    }
                    return f;
                default:
                    throw new UnsupportedOperationException();
            }
            return e;
        }

        static {
            ImageGroup imageGroup = new ImageGroup();
            e = imageGroup;
            imageGroup.e();
        }

        public static ImageGroup k() {
            return e;
        }

        public static fkr<ImageGroup> parser() {
            return e.c();
        }
    }

    public static final class Licensor extends GeneratedMessageLite<Licensor, a> implements gqo {
        /* access modifiers changed from: private */
        public static final Licensor f;
        private static volatile fkr<Licensor> g;
        private int d;
        private ByteString e = ByteString.a;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Licensor, a> implements gqo {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(Licensor.f);
            }
        }

        private Licensor() {
        }

        private boolean m() {
            return (this.d & 1) == 1;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, this.e);
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
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Licensor();
                case IS_INITIALIZED:
                    return f;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Licensor licensor = (Licensor) obj2;
                    this.e = fVar.a(m(), this.e, licensor.m(), licensor.e);
                    if (fVar == e.a) {
                        this.d |= licensor.d;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    this.d |= 1;
                                    this.e = fkc.e();
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
                    if (g == null) {
                        synchronized (Licensor.class) {
                            if (g == null) {
                                g = new b(f);
                            }
                        }
                    }
                    return g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        static {
            Licensor licensor = new Licensor();
            f = licensor;
            licensor.e();
        }

        public static Licensor k() {
            return f;
        }

        public static fkr<Licensor> parser() {
            return f.c();
        }
    }

    public static final class LocalizedString extends GeneratedMessageLite<LocalizedString, a> implements gqp {
        /* access modifiers changed from: private */
        public static final LocalizedString g;
        private static volatile fkr<LocalizedString> h;
        private int d;
        private String e;
        private String f;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<LocalizedString, a> implements gqp {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(LocalizedString.g);
            }
        }

        private LocalizedString() {
            String str = "";
            this.e = str;
            this.f = str;
        }

        private boolean l() {
            return (this.d & 1) == 1;
        }

        private boolean m() {
            return (this.d & 2) == 2;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.a(1, this.e);
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, this.f);
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
                i2 += CodedOutputStream.b(2, this.f);
            }
            int d2 = i2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new LocalizedString();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    LocalizedString localizedString = (LocalizedString) obj2;
                    this.e = fVar.a(l(), this.e, localizedString.l(), localizedString.e);
                    this.f = fVar.a(m(), this.f, localizedString.m(), localizedString.f);
                    if (fVar == e.a) {
                        this.d |= localizedString.d;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
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
                        synchronized (LocalizedString.class) {
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
            LocalizedString localizedString = new LocalizedString();
            g = localizedString;
            localizedString.e();
        }

        public static fkr<LocalizedString> parser() {
            return g.c();
        }
    }

    public static final class Restriction extends GeneratedMessageLite<Restriction, a> implements gqq {
        /* access modifiers changed from: private */
        public static final Restriction j;
        private static volatile fkr<Restriction> k;
        private int d;
        private c e = fkh.d();
        private String f;
        private String g;
        private int h;
        private e<String> i;

        public enum Catalogue implements b {
            AD(0),
            SUBSCRIPTION(1),
            CATALOGUE_ALL(2),
            SHUFFLE(3),
            COMMERCIAL(4);
            
            private final int value;

            static {
                new Object() {
                };
            }

            public final int a() {
                return this.value;
            }

            public static Catalogue a(int i) {
                if (i == 0) {
                    return AD;
                }
                if (i == 1) {
                    return SUBSCRIPTION;
                }
                if (i == 2) {
                    return CATALOGUE_ALL;
                }
                if (i == 3) {
                    return SHUFFLE;
                }
                if (i != 4) {
                    return null;
                }
                return COMMERCIAL;
            }

            private Catalogue(int i) {
                this.value = i;
            }
        }

        public enum Type implements b {
            STREAMING(0);
            
            private final int value;

            static {
                new Object() {
                };
            }

            public final int a() {
                return this.value;
            }

            public static Type a(int i) {
                if (i != 0) {
                    return null;
                }
                return STREAMING;
            }

            private Type(int i) {
                this.value = 0;
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Restriction, a> implements gqq {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(Restriction.j);
            }
        }

        private Restriction() {
            String str = "";
            this.f = str;
            this.g = str;
            this.i = fks.d();
        }

        static {
            new defpackage.fki.d.a<Integer, Catalogue>() {
                public final /* synthetic */ Object a(Object obj) {
                    Catalogue a = Catalogue.a(((Integer) obj).intValue());
                    return a == null ? Catalogue.AD : a;
                }
            };
            Restriction restriction = new Restriction();
            j = restriction;
            restriction.e();
        }

        private boolean l() {
            return (this.d & 1) == 1;
        }

        private boolean m() {
            return (this.d & 2) == 2;
        }

        private boolean n() {
            return (this.d & 4) == 4;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                codedOutputStream.b(1, this.e.b(i2));
            }
            if ((this.d & 1) == 1) {
                codedOutputStream.a(2, this.f);
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(3, this.g);
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.b(4, this.h);
            }
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                codedOutputStream.a(5, (String) this.i.get(i3));
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                i3 += CodedOutputStream.h(this.e.b(i4));
            }
            int size = i3 + 0 + (this.e.size() * 1);
            if ((this.d & 1) == 1) {
                size += CodedOutputStream.b(2, this.f);
            }
            if ((this.d & 2) == 2) {
                size += CodedOutputStream.b(3, this.g);
            }
            if ((this.d & 4) == 4) {
                size += CodedOutputStream.j(4, this.h);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.i.size(); i6++) {
                i5 += CodedOutputStream.b((String) this.i.get(i6));
            }
            int size2 = size + i5 + (this.i.size() * 1) + this.b.d();
            this.c = size2;
            return size2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Restriction();
                case IS_INITIALIZED:
                    return j;
                case MAKE_IMMUTABLE:
                    this.e.b();
                    this.i.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Restriction restriction = (Restriction) obj2;
                    this.e = fVar.a(this.e, restriction.e);
                    this.f = fVar.a(l(), this.f, restriction.l(), restriction.f);
                    this.g = fVar.a(m(), this.g, restriction.m(), restriction.g);
                    this.h = fVar.a(n(), this.h, restriction.n(), restriction.h);
                    this.i = fVar.a(this.i, restriction.i);
                    if (fVar == e.a) {
                        this.d |= restriction.d;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z) {
                        try {
                            int a2 = fkc.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    if (!this.e.a()) {
                                        this.e = GeneratedMessageLite.a(this.e);
                                    }
                                    int g2 = fkc.g();
                                    if (Catalogue.a(g2) == null) {
                                        super.a(1, g2);
                                    } else {
                                        this.e.d(g2);
                                    }
                                } else if (a2 == 10) {
                                    if (!this.e.a()) {
                                        this.e = GeneratedMessageLite.a(this.e);
                                    }
                                    int c = fkc.c(fkc.g());
                                    while (fkc.k() > 0) {
                                        int g3 = fkc.g();
                                        if (Catalogue.a(g3) == null) {
                                            super.a(1, g3);
                                        } else {
                                            this.e.d(g3);
                                        }
                                    }
                                    fkc.d(c);
                                } else if (a2 == 18) {
                                    String c2 = fkc.c();
                                    this.d |= 1;
                                    this.f = c2;
                                } else if (a2 == 26) {
                                    String c3 = fkc.c();
                                    this.d |= 2;
                                    this.g = c3;
                                } else if (a2 == 32) {
                                    int g4 = fkc.g();
                                    if (Type.a(g4) == null) {
                                        super.a(4, g4);
                                    } else {
                                        this.d |= 4;
                                        this.h = g4;
                                    }
                                } else if (a2 == 42) {
                                    String c4 = fkc.c();
                                    if (!this.i.a()) {
                                        this.i = GeneratedMessageLite.a(this.i);
                                    }
                                    this.i.add(c4);
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
                        synchronized (Restriction.class) {
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

        public static fkr<Restriction> parser() {
            return j.c();
        }
    }

    public static final class SalePeriod extends GeneratedMessageLite<SalePeriod, a> implements gqr {
        /* access modifiers changed from: private */
        public static final SalePeriod h;
        private static volatile fkr<SalePeriod> i;
        private int d;
        private e<Restriction> e = fks.d();
        private Date f;
        private Date g;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<SalePeriod, a> implements gqr {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(SalePeriod.h);
            }
        }

        private SalePeriod() {
        }

        private Date l() {
            Date date = this.f;
            return date == null ? Date.k() : date;
        }

        private Date m() {
            Date date = this.g;
            return date == null ? Date.k() : date;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                codedOutputStream.a(1, (fko) this.e.get(i2));
            }
            if ((this.d & 1) == 1) {
                codedOutputStream.a(2, (fko) l());
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(3, (fko) m());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                i3 += CodedOutputStream.b(1, (fko) this.e.get(i4));
            }
            if ((this.d & 1) == 1) {
                i3 += CodedOutputStream.b(2, (fko) l());
            }
            if ((this.d & 2) == 2) {
                i3 += CodedOutputStream.b(3, (fko) m());
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new SalePeriod();
                case IS_INITIALIZED:
                    return h;
                case MAKE_IMMUTABLE:
                    this.e.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    SalePeriod salePeriod = (SalePeriod) obj2;
                    this.e = fVar.a(this.e, salePeriod.e);
                    this.f = (Date) fVar.a(this.f, salePeriod.f);
                    this.g = (Date) fVar.a(this.g, salePeriod.g);
                    if (fVar == e.a) {
                        this.d |= salePeriod.d;
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
                                    if (!this.e.a()) {
                                        this.e = GeneratedMessageLite.a(this.e);
                                    }
                                    this.e.add(fkc.a(Restriction.parser(), fke));
                                } else if (a2 == 18) {
                                    a aVar = (this.d & 1) == 1 ? (a) this.f.h() : null;
                                    this.f = (Date) fkc.a(Date.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (Date) aVar.e();
                                    }
                                    this.d |= 1;
                                } else if (a2 == 26) {
                                    a aVar2 = (this.d & 2) == 2 ? (a) this.g.h() : null;
                                    this.g = (Date) fkc.a(Date.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.g);
                                        this.g = (Date) aVar2.e();
                                    }
                                    this.d |= 2;
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
                    if (i == null) {
                        synchronized (SalePeriod.class) {
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

        static {
            SalePeriod salePeriod = new SalePeriod();
            h = salePeriod;
            salePeriod.e();
        }

        public static fkr<SalePeriod> parser() {
            return h.c();
        }
    }

    public static final class TopTracks extends GeneratedMessageLite<TopTracks, a> implements gqs {
        /* access modifiers changed from: private */
        public static final TopTracks g;
        private static volatile fkr<TopTracks> h;
        public e<Track> d = fks.d();
        private int e;
        private String f = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<TopTracks, a> implements gqs {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(TopTracks.g);
            }
        }

        private TopTracks() {
        }

        private boolean l() {
            return (this.e & 1) == 1;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.e & 1) == 1) {
                codedOutputStream.a(1, this.f);
            }
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.a(2, (fko) this.d.get(i));
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int b = (this.e & 1) == 1 ? CodedOutputStream.b(1, this.f) + 0 : 0;
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                b += CodedOutputStream.b(2, (fko) this.d.get(i2));
            }
            int d2 = b + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new TopTracks();
                case IS_INITIALIZED:
                    return g;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    TopTracks topTracks = (TopTracks) obj2;
                    this.f = fVar.a(l(), this.f, topTracks.l(), topTracks.f);
                    this.d = fVar.a(this.d, topTracks.d);
                    if (fVar == e.a) {
                        this.e |= topTracks.e;
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
                                    this.e |= 1;
                                    this.f = c;
                                } else if (a2 == 18) {
                                    if (!this.d.a()) {
                                        this.d = GeneratedMessageLite.a(this.d);
                                    }
                                    this.d.add(fkc.a(Track.parser(), fke));
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
                        synchronized (TopTracks.class) {
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
            TopTracks topTracks = new TopTracks();
            g = topTracks;
            topTracks.e();
        }

        public static fkr<TopTracks> parser() {
            return g.c();
        }
    }

    public static final class Track extends GeneratedMessageLite<Track, a> implements gqt {
        private static volatile fkr<Track> A;
        /* access modifiers changed from: private */
        public static final Track z;
        public ByteString d = ByteString.a;
        public e<Artist> e = fks.d();
        private int f;
        private String g = "";
        private Album h;
        private int i;
        private int j;
        private int k;
        private int l;
        private boolean m;
        private e<ExternalId> n = fks.d();
        private e<Restriction> o = fks.d();
        private e<AudioFile> p = fks.d();
        private e<Track> q = fks.d();
        private e<SalePeriod> r = fks.d();
        private e<AudioFile> s = fks.d();
        private e<String> t = fks.d();
        private long u;
        private boolean v;
        private e<Availability> w = fks.d();
        private e<String> x = fks.d();
        private Licensor y;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Track, a> implements gqt {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(Track.z);
            }
        }

        private Track() {
        }

        private boolean m() {
            return (this.f & 1) == 1;
        }

        private boolean n() {
            return (this.f & 2) == 2;
        }

        public final Album k() {
            Album album = this.h;
            return album == null ? Album.k() : album;
        }

        private boolean o() {
            return (this.f & 8) == 8;
        }

        private boolean p() {
            return (this.f & 16) == 16;
        }

        private boolean q() {
            return (this.f & 32) == 32;
        }

        private boolean r() {
            return (this.f & 64) == 64;
        }

        private boolean s() {
            return (this.f & 128) == 128;
        }

        private boolean t() {
            return (this.f & 256) == 256;
        }

        private boolean u() {
            return (this.f & 512) == 512;
        }

        private Licensor v() {
            Licensor licensor = this.y;
            return licensor == null ? Licensor.k() : licensor;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.f & 1) == 1) {
                codedOutputStream.a(1, this.d);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.a(2, this.g);
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.a(3, (fko) k());
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                codedOutputStream.a(4, (fko) this.e.get(i2));
            }
            if ((this.f & 8) == 8) {
                codedOutputStream.d(5, this.i);
            }
            if ((this.f & 16) == 16) {
                codedOutputStream.d(6, this.j);
            }
            if ((this.f & 32) == 32) {
                codedOutputStream.d(7, this.k);
            }
            if ((this.f & 64) == 64) {
                codedOutputStream.d(8, this.l);
            }
            if ((this.f & 128) == 128) {
                codedOutputStream.a(9, this.m);
            }
            for (int i3 = 0; i3 < this.n.size(); i3++) {
                codedOutputStream.a(10, (fko) this.n.get(i3));
            }
            for (int i4 = 0; i4 < this.o.size(); i4++) {
                codedOutputStream.a(11, (fko) this.o.get(i4));
            }
            for (int i5 = 0; i5 < this.p.size(); i5++) {
                codedOutputStream.a(12, (fko) this.p.get(i5));
            }
            for (int i6 = 0; i6 < this.q.size(); i6++) {
                codedOutputStream.a(13, (fko) this.q.get(i6));
            }
            for (int i7 = 0; i7 < this.r.size(); i7++) {
                codedOutputStream.a(14, (fko) this.r.get(i7));
            }
            for (int i8 = 0; i8 < this.s.size(); i8++) {
                codedOutputStream.a(15, (fko) this.s.get(i8));
            }
            for (int i9 = 0; i9 < this.t.size(); i9++) {
                codedOutputStream.a(16, (String) this.t.get(i9));
            }
            if ((this.f & 256) == 256) {
                codedOutputStream.a(17, this.u);
            }
            if ((this.f & 512) == 512) {
                codedOutputStream.a(18, this.v);
            }
            for (int i10 = 0; i10 < this.w.size(); i10++) {
                codedOutputStream.a(19, (fko) this.w.get(i10));
            }
            for (int i11 = 0; i11 < this.x.size(); i11++) {
                codedOutputStream.a(20, (String) this.x.get(i11));
            }
            if ((this.f & 1024) == 1024) {
                codedOutputStream.a(21, (fko) v());
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int b = (this.f & 1) == 1 ? CodedOutputStream.b(1, this.d) + 0 : 0;
            if ((this.f & 2) == 2) {
                b += CodedOutputStream.b(2, this.g);
            }
            if ((this.f & 4) == 4) {
                b += CodedOutputStream.b(3, (fko) k());
            }
            int i3 = b;
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                i3 += CodedOutputStream.b(4, (fko) this.e.get(i4));
            }
            if ((this.f & 8) == 8) {
                i3 += CodedOutputStream.h(5, this.i);
            }
            if ((this.f & 16) == 16) {
                i3 += CodedOutputStream.h(6, this.j);
            }
            if ((this.f & 32) == 32) {
                i3 += CodedOutputStream.h(7, this.k);
            }
            if ((this.f & 64) == 64) {
                i3 += CodedOutputStream.h(8, this.l);
            }
            if ((this.f & 128) == 128) {
                i3 += CodedOutputStream.b(9, this.m);
            }
            for (int i5 = 0; i5 < this.n.size(); i5++) {
                i3 += CodedOutputStream.b(10, (fko) this.n.get(i5));
            }
            for (int i6 = 0; i6 < this.o.size(); i6++) {
                i3 += CodedOutputStream.b(11, (fko) this.o.get(i6));
            }
            for (int i7 = 0; i7 < this.p.size(); i7++) {
                i3 += CodedOutputStream.b(12, (fko) this.p.get(i7));
            }
            for (int i8 = 0; i8 < this.q.size(); i8++) {
                i3 += CodedOutputStream.b(13, (fko) this.q.get(i8));
            }
            for (int i9 = 0; i9 < this.r.size(); i9++) {
                i3 += CodedOutputStream.b(14, (fko) this.r.get(i9));
            }
            for (int i10 = 0; i10 < this.s.size(); i10++) {
                i3 += CodedOutputStream.b(15, (fko) this.s.get(i10));
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.t.size(); i12++) {
                i11 += CodedOutputStream.b((String) this.t.get(i12));
            }
            int size = i3 + i11 + (this.t.size() * 2);
            if ((this.f & 256) == 256) {
                size += CodedOutputStream.c(17, this.u);
            }
            if ((this.f & 512) == 512) {
                size += CodedOutputStream.b(18, this.v);
            }
            for (int i13 = 0; i13 < this.w.size(); i13++) {
                size += CodedOutputStream.b(19, (fko) this.w.get(i13));
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.x.size(); i15++) {
                i14 += CodedOutputStream.b((String) this.x.get(i15));
            }
            int size2 = size + i14 + (this.x.size() * 2);
            if ((this.f & 1024) == 1024) {
                size2 += CodedOutputStream.b(21, (fko) v());
            }
            int d2 = size2 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z2 = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Track();
                case IS_INITIALIZED:
                    return z;
                case MAKE_IMMUTABLE:
                    this.e.b();
                    this.n.b();
                    this.o.b();
                    this.p.b();
                    this.q.b();
                    this.r.b();
                    this.s.b();
                    this.t.b();
                    this.w.b();
                    this.x.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Track track = (Track) obj2;
                    this.d = fVar.a(m(), this.d, track.m(), track.d);
                    this.g = fVar.a(n(), this.g, track.n(), track.g);
                    this.h = (Album) fVar.a(this.h, track.h);
                    this.e = fVar.a(this.e, track.e);
                    this.i = fVar.a(o(), this.i, track.o(), track.i);
                    this.j = fVar.a(p(), this.j, track.p(), track.j);
                    this.k = fVar.a(q(), this.k, track.q(), track.k);
                    this.l = fVar.a(r(), this.l, track.r(), track.l);
                    this.m = fVar.a(s(), this.m, track.s(), track.m);
                    this.n = fVar.a(this.n, track.n);
                    this.o = fVar.a(this.o, track.o);
                    this.p = fVar.a(this.p, track.p);
                    this.q = fVar.a(this.q, track.q);
                    this.r = fVar.a(this.r, track.r);
                    this.s = fVar.a(this.s, track.s);
                    this.t = fVar.a(this.t, track.t);
                    this.u = fVar.a(t(), this.u, track.t(), track.u);
                    this.v = fVar.a(u(), this.v, track.u(), track.v);
                    this.w = fVar.a(this.w, track.w);
                    this.x = fVar.a(this.x, track.x);
                    this.y = (Licensor) fVar.a(this.y, track.y);
                    if (fVar == e.a) {
                        this.f |= track.f;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    fke fke = (fke) obj2;
                    while (!z2) {
                        try {
                            int a2 = fkc.a();
                            switch (a2) {
                                case 0:
                                    z2 = true;
                                    break;
                                case 10:
                                    this.f |= 1;
                                    this.d = fkc.e();
                                    break;
                                case 18:
                                    String c = fkc.c();
                                    this.f |= 2;
                                    this.g = c;
                                    break;
                                case 26:
                                    a aVar = (this.f & 4) == 4 ? (a) this.h.h() : null;
                                    this.h = (Album) fkc.a(Album.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.h);
                                        this.h = (Album) aVar.e();
                                    }
                                    this.f |= 4;
                                    break;
                                case 34:
                                    if (!this.e.a()) {
                                        this.e = GeneratedMessageLite.a(this.e);
                                    }
                                    this.e.add(fkc.a(Artist.parser(), fke));
                                    break;
                                case 40:
                                    this.f |= 8;
                                    this.i = fkc.f();
                                    break;
                                case 48:
                                    this.f |= 16;
                                    this.j = fkc.f();
                                    break;
                                case 56:
                                    this.f |= 32;
                                    this.k = fkc.f();
                                    break;
                                case b.bs /*64*/:
                                    this.f |= 64;
                                    this.l = fkc.f();
                                    break;
                                case b.bA /*72*/:
                                    this.f |= 128;
                                    this.m = fkc.b();
                                    break;
                                case 82:
                                    if (!this.n.a()) {
                                        this.n = GeneratedMessageLite.a(this.n);
                                    }
                                    this.n.add(fkc.a(ExternalId.parser(), fke));
                                    break;
                                case 90:
                                    if (!this.o.a()) {
                                        this.o = GeneratedMessageLite.a(this.o);
                                    }
                                    this.o.add(fkc.a(Restriction.parser(), fke));
                                    break;
                                case 98:
                                    if (!this.p.a()) {
                                        this.p = GeneratedMessageLite.a(this.p);
                                    }
                                    this.p.add(fkc.a(AudioFile.parser(), fke));
                                    break;
                                case 106:
                                    if (!this.q.a()) {
                                        this.q = GeneratedMessageLite.a(this.q);
                                    }
                                    this.q.add(fkc.a(parser(), fke));
                                    break;
                                case defpackage.o.a.aB /*114*/:
                                    if (!this.r.a()) {
                                        this.r = GeneratedMessageLite.a(this.r);
                                    }
                                    this.r.add(fkc.a(SalePeriod.parser(), fke));
                                    break;
                                case 122:
                                    if (!this.s.a()) {
                                        this.s = GeneratedMessageLite.a(this.s);
                                    }
                                    this.s.add(fkc.a(AudioFile.parser(), fke));
                                    break;
                                case 130:
                                    String c2 = fkc.c();
                                    if (!this.t.a()) {
                                        this.t = GeneratedMessageLite.a(this.t);
                                    }
                                    this.t.add(c2);
                                    break;
                                case 136:
                                    this.f |= 256;
                                    this.u = fkc.h();
                                    break;
                                case 144:
                                    this.f |= 512;
                                    this.v = fkc.b();
                                    break;
                                case 154:
                                    if (!this.w.a()) {
                                        this.w = GeneratedMessageLite.a(this.w);
                                    }
                                    this.w.add(fkc.a(Availability.parser(), fke));
                                    break;
                                case 162:
                                    String c3 = fkc.c();
                                    if (!this.x.a()) {
                                        this.x = GeneratedMessageLite.a(this.x);
                                    }
                                    this.x.add(c3);
                                    break;
                                case 170:
                                    a aVar2 = (this.f & 1024) == 1024 ? (a) this.y.h() : null;
                                    this.y = (Licensor) fkc.a(Licensor.parser(), fke);
                                    if (aVar2 != null) {
                                        aVar2.a(this.y);
                                        this.y = (Licensor) aVar2.e();
                                    }
                                    this.f |= 1024;
                                    break;
                                default:
                                    if (a(a2, fkc)) {
                                        break;
                                    }
                                    z2 = true;
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
                    if (A == null) {
                        synchronized (Track.class) {
                            if (A == null) {
                                A = new b(z);
                            }
                        }
                    }
                    return A;
                default:
                    throw new UnsupportedOperationException();
            }
            return z;
        }

        static {
            Track track = new Track();
            z = track;
            track.e();
        }

        public static fkr<Track> parser() {
            return z.c();
        }
    }
}
