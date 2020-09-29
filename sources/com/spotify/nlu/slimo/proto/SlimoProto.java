package com.spotify.nlu.slimo.proto;

import com.comscore.streaming.AdType;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class SlimoProto {

    public static final class ParsedQuery extends GeneratedMessageLite<ParsedQuery, a> implements ure {
        /* access modifiers changed from: private */
        public static final ParsedQuery j;
        private static volatile fkr<ParsedQuery> k;
        private int d;
        private int e;
        private Slots f;
        private String g;
        private String h;
        private float i;

        public enum Intent implements b {
            WTF(0),
            PLAY(1),
            UNSUPPORTED(31),
            NO_INTENT(32),
            SEARCH(2),
            SHOW(3),
            RESUME(4),
            STOP(5),
            NEXT(6),
            PREVIOUS(7),
            MORE_LIKE_THIS(8),
            RECOMMEND_SOMETHING(9),
            SHUFFLE_ON(10),
            SHUFFLE_OFF(11),
            REPEAT_ON(12),
            REPEAT_OFF(13),
            REPEAT_ONE(14),
            VOLUME_UP(15),
            VOLUME_DOWN(16),
            VOLUME_ABSOLUTE(17),
            THUMBS_UP(18),
            THUMBS_DOWN(19),
            SLEEP_TIMER_SET(20),
            SLEEP_TIMER_CANCEL(21),
            SET_ALARM(22),
            ADD_TO_PLAYLIST(23),
            ADD_TO_COLLECTION(24),
            ADD_TO_QUEUE(25),
            HELP(26),
            WHATS_PLAYING(27),
            GENERAL_MUSIC_INFO(28),
            FOLLOW(29),
            SHARE(30),
            CHAT(33),
            NAVIGATE(34),
            PLAY_AGAIN(35),
            BAN(36),
            MORE_OF(37),
            PULL_CONTEXT(38);
            
            private final int value;

            static {
                new Object() {
                };
            }

            public final int a() {
                return this.value;
            }

            public static Intent a(int i) {
                switch (i) {
                    case 0:
                        return WTF;
                    case 1:
                        return PLAY;
                    case 2:
                        return SEARCH;
                    case 3:
                        return SHOW;
                    case 4:
                        return RESUME;
                    case 5:
                        return STOP;
                    case 6:
                        return NEXT;
                    case 7:
                        return PREVIOUS;
                    case 8:
                        return MORE_LIKE_THIS;
                    case 9:
                        return RECOMMEND_SOMETHING;
                    case 10:
                        return SHUFFLE_ON;
                    case 11:
                        return SHUFFLE_OFF;
                    case 12:
                        return REPEAT_ON;
                    case 13:
                        return REPEAT_OFF;
                    case 14:
                        return REPEAT_ONE;
                    case 15:
                        return VOLUME_UP;
                    case 16:
                        return VOLUME_DOWN;
                    case 17:
                        return VOLUME_ABSOLUTE;
                    case 18:
                        return THUMBS_UP;
                    case 19:
                        return THUMBS_DOWN;
                    case 20:
                        return SLEEP_TIMER_SET;
                    case 21:
                        return SLEEP_TIMER_CANCEL;
                    case 22:
                        return SET_ALARM;
                    case 23:
                        return ADD_TO_PLAYLIST;
                    case 24:
                        return ADD_TO_COLLECTION;
                    case 25:
                        return ADD_TO_QUEUE;
                    case 26:
                        return HELP;
                    case 27:
                        return WHATS_PLAYING;
                    case 28:
                        return GENERAL_MUSIC_INFO;
                    case 29:
                        return FOLLOW;
                    case 30:
                        return SHARE;
                    case 31:
                        return UNSUPPORTED;
                    case 32:
                        return NO_INTENT;
                    case 33:
                        return CHAT;
                    case 34:
                        return NAVIGATE;
                    case 35:
                        return PLAY_AGAIN;
                    case 36:
                        return BAN;
                    case 37:
                        return MORE_OF;
                    case 38:
                        return PULL_CONTEXT;
                    default:
                        return null;
                }
            }

            private Intent(int i) {
                this.value = i;
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ParsedQuery, a> implements ure {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(ParsedQuery.j);
            }
        }

        private ParsedQuery() {
            String str = "";
            this.g = str;
            this.h = str;
        }

        private boolean l() {
            return (this.d & 1) == 1;
        }

        private Slots m() {
            Slots slots = this.f;
            return slots == null ? Slots.k() : slots;
        }

        private boolean n() {
            return (this.d & 4) == 4;
        }

        private boolean o() {
            return (this.d & 8) == 8;
        }

        private boolean p() {
            return (this.d & 16) == 16;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.d & 1) == 1) {
                codedOutputStream.b(1, this.e);
            }
            if ((this.d & 2) == 2) {
                codedOutputStream.a(2, (fko) m());
            }
            if ((this.d & 4) == 4) {
                codedOutputStream.a(3, this.g);
            }
            if ((this.d & 8) == 8) {
                codedOutputStream.a(4, this.h);
            }
            if ((this.d & 16) == 16) {
                codedOutputStream.e(5, Float.floatToRawIntBits(this.i));
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
                i3 = 0 + CodedOutputStream.j(1, this.e);
            }
            if ((this.d & 2) == 2) {
                i3 += CodedOutputStream.b(2, (fko) m());
            }
            if ((this.d & 4) == 4) {
                i3 += CodedOutputStream.b(3, this.g);
            }
            if ((this.d & 8) == 8) {
                i3 += CodedOutputStream.b(4, this.h);
            }
            if ((this.d & 16) == 16) {
                i3 += CodedOutputStream.a(5, this.i);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ParsedQuery();
                case IS_INITIALIZED:
                    return j;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    ParsedQuery parsedQuery = (ParsedQuery) obj2;
                    this.e = fVar.a(l(), this.e, parsedQuery.l(), parsedQuery.e);
                    this.f = (Slots) fVar.a(this.f, parsedQuery.f);
                    this.g = fVar.a(n(), this.g, parsedQuery.n(), parsedQuery.g);
                    this.h = fVar.a(o(), this.h, parsedQuery.o(), parsedQuery.h);
                    this.i = fVar.a(p(), this.i, parsedQuery.p(), parsedQuery.i);
                    if (fVar == e.a) {
                        this.d |= parsedQuery.d;
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
                                    int g2 = fkc.g();
                                    if (Intent.a(g2) == null) {
                                        super.a(1, g2);
                                    } else {
                                        this.d |= 1;
                                        this.e = g2;
                                    }
                                } else if (a2 == 18) {
                                    a aVar = (this.d & 2) == 2 ? (a) this.f.h() : null;
                                    this.f = (Slots) fkc.a(Slots.parser(), fke);
                                    if (aVar != null) {
                                        aVar.a(this.f);
                                        this.f = (Slots) aVar.e();
                                    }
                                    this.d |= 2;
                                } else if (a2 == 26) {
                                    String c = fkc.c();
                                    this.d |= 4;
                                    this.g = c;
                                } else if (a2 == 34) {
                                    String c2 = fkc.c();
                                    this.d = 8 | this.d;
                                    this.h = c2;
                                } else if (a2 == 45) {
                                    this.d |= 16;
                                    this.i = Float.intBitsToFloat(fkc.i());
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
                        synchronized (ParsedQuery.class) {
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
            ParsedQuery parsedQuery = new ParsedQuery();
            j = parsedQuery;
            parsedQuery.e();
        }

        public static fkr<ParsedQuery> parser() {
            return j.c();
        }
    }

    public static final class Slots extends GeneratedMessageLite<Slots, a> implements urf {
        /* access modifiers changed from: private */
        public static final Slots O;
        private static volatile fkr<Slots> P;
        private e<String> A = fks.d();
        private e<String> B = fks.d();
        private e<String> C = fks.d();
        private e<String> D = fks.d();
        private e<String> E = fks.d();
        private e<String> F = fks.d();
        private e<String> G = fks.d();
        private e<String> H = fks.d();
        private e<String> I = fks.d();
        private e<String> J = fks.d();
        private e<String> K = fks.d();
        private e<String> L = fks.d();
        private e<String> M = fks.d();
        private e<String> N = fks.d();
        private e<String> d = fks.d();
        private e<String> e = fks.d();
        private e<String> f = fks.d();
        private e<String> g = fks.d();
        private e<String> h = fks.d();
        private e<String> i = fks.d();
        private e<String> j = fks.d();
        private e<String> k = fks.d();
        private e<String> l = fks.d();
        private e<String> m = fks.d();
        private e<String> n = fks.d();
        private e<String> o = fks.d();
        private e<String> p = fks.d();
        private e<String> q = fks.d();
        private e<String> r = fks.d();
        private e<String> s = fks.d();
        private e<String> t = fks.d();
        private e<String> u = fks.d();
        private e<String> v = fks.d();
        private e<String> w = fks.d();
        private e<String> x = fks.d();
        private e<String> y = fks.d();
        private e<String> z = fks.d();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Slots, a> implements urf {
            /* synthetic */ a(byte b) {
                this();
            }

            private a() {
                super(Slots.O);
            }
        }

        private Slots() {
        }

        public final void a(CodedOutputStream codedOutputStream) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                codedOutputStream.a(1, (String) this.d.get(i2));
            }
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                codedOutputStream.a(2, (String) this.e.get(i3));
            }
            for (int i4 = 0; i4 < this.f.size(); i4++) {
                codedOutputStream.a(3, (String) this.f.get(i4));
            }
            for (int i5 = 0; i5 < this.g.size(); i5++) {
                codedOutputStream.a(4, (String) this.g.get(i5));
            }
            for (int i6 = 0; i6 < this.h.size(); i6++) {
                codedOutputStream.a(5, (String) this.h.get(i6));
            }
            for (int i7 = 0; i7 < this.i.size(); i7++) {
                codedOutputStream.a(6, (String) this.i.get(i7));
            }
            for (int i8 = 0; i8 < this.j.size(); i8++) {
                codedOutputStream.a(7, (String) this.j.get(i8));
            }
            for (int i9 = 0; i9 < this.k.size(); i9++) {
                codedOutputStream.a(8, (String) this.k.get(i9));
            }
            for (int i10 = 0; i10 < this.l.size(); i10++) {
                codedOutputStream.a(9, (String) this.l.get(i10));
            }
            for (int i11 = 0; i11 < this.m.size(); i11++) {
                codedOutputStream.a(10, (String) this.m.get(i11));
            }
            for (int i12 = 0; i12 < this.n.size(); i12++) {
                codedOutputStream.a(11, (String) this.n.get(i12));
            }
            for (int i13 = 0; i13 < this.o.size(); i13++) {
                codedOutputStream.a(12, (String) this.o.get(i13));
            }
            for (int i14 = 0; i14 < this.p.size(); i14++) {
                codedOutputStream.a(13, (String) this.p.get(i14));
            }
            for (int i15 = 0; i15 < this.q.size(); i15++) {
                codedOutputStream.a(14, (String) this.q.get(i15));
            }
            for (int i16 = 0; i16 < this.r.size(); i16++) {
                codedOutputStream.a(15, (String) this.r.get(i16));
            }
            for (int i17 = 0; i17 < this.s.size(); i17++) {
                codedOutputStream.a(16, (String) this.s.get(i17));
            }
            for (int i18 = 0; i18 < this.t.size(); i18++) {
                codedOutputStream.a(17, (String) this.t.get(i18));
            }
            for (int i19 = 0; i19 < this.u.size(); i19++) {
                codedOutputStream.a(18, (String) this.u.get(i19));
            }
            for (int i20 = 0; i20 < this.v.size(); i20++) {
                codedOutputStream.a(19, (String) this.v.get(i20));
            }
            for (int i21 = 0; i21 < this.w.size(); i21++) {
                codedOutputStream.a(20, (String) this.w.get(i21));
            }
            for (int i22 = 0; i22 < this.x.size(); i22++) {
                codedOutputStream.a(21, (String) this.x.get(i22));
            }
            for (int i23 = 0; i23 < this.y.size(); i23++) {
                codedOutputStream.a(22, (String) this.y.get(i23));
            }
            for (int i24 = 0; i24 < this.z.size(); i24++) {
                codedOutputStream.a(23, (String) this.z.get(i24));
            }
            for (int i25 = 0; i25 < this.A.size(); i25++) {
                codedOutputStream.a(24, (String) this.A.get(i25));
            }
            for (int i26 = 0; i26 < this.B.size(); i26++) {
                codedOutputStream.a(25, (String) this.B.get(i26));
            }
            for (int i27 = 0; i27 < this.C.size(); i27++) {
                codedOutputStream.a(26, (String) this.C.get(i27));
            }
            for (int i28 = 0; i28 < this.D.size(); i28++) {
                codedOutputStream.a(27, (String) this.D.get(i28));
            }
            for (int i29 = 0; i29 < this.E.size(); i29++) {
                codedOutputStream.a(28, (String) this.E.get(i29));
            }
            for (int i30 = 0; i30 < this.F.size(); i30++) {
                codedOutputStream.a(29, (String) this.F.get(i30));
            }
            for (int i31 = 0; i31 < this.G.size(); i31++) {
                codedOutputStream.a(30, (String) this.G.get(i31));
            }
            for (int i32 = 0; i32 < this.H.size(); i32++) {
                codedOutputStream.a(31, (String) this.H.get(i32));
            }
            for (int i33 = 0; i33 < this.I.size(); i33++) {
                codedOutputStream.a(32, (String) this.I.get(i33));
            }
            for (int i34 = 0; i34 < this.J.size(); i34++) {
                codedOutputStream.a(33, (String) this.J.get(i34));
            }
            for (int i35 = 0; i35 < this.K.size(); i35++) {
                codedOutputStream.a(34, (String) this.K.get(i35));
            }
            for (int i36 = 0; i36 < this.L.size(); i36++) {
                codedOutputStream.a(35, (String) this.L.get(i36));
            }
            for (int i37 = 0; i37 < this.M.size(); i37++) {
                codedOutputStream.a(36, (String) this.M.get(i37));
            }
            for (int i38 = 0; i38 < this.N.size(); i38++) {
                codedOutputStream.a(37, (String) this.N.get(i38));
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.d.size(); i4++) {
                i3 += CodedOutputStream.b((String) this.d.get(i4));
            }
            int size = i3 + 0 + (this.d.size() * 1);
            int i5 = 0;
            for (int i6 = 0; i6 < this.e.size(); i6++) {
                i5 += CodedOutputStream.b((String) this.e.get(i6));
            }
            int size2 = size + i5 + (this.e.size() * 1);
            int i7 = 0;
            for (int i8 = 0; i8 < this.f.size(); i8++) {
                i7 += CodedOutputStream.b((String) this.f.get(i8));
            }
            int size3 = size2 + i7 + (this.f.size() * 1);
            int i9 = 0;
            for (int i10 = 0; i10 < this.g.size(); i10++) {
                i9 += CodedOutputStream.b((String) this.g.get(i10));
            }
            int size4 = size3 + i9 + (this.g.size() * 1);
            int i11 = 0;
            for (int i12 = 0; i12 < this.h.size(); i12++) {
                i11 += CodedOutputStream.b((String) this.h.get(i12));
            }
            int size5 = size4 + i11 + (this.h.size() * 1);
            int i13 = 0;
            for (int i14 = 0; i14 < this.i.size(); i14++) {
                i13 += CodedOutputStream.b((String) this.i.get(i14));
            }
            int size6 = size5 + i13 + (this.i.size() * 1);
            int i15 = 0;
            for (int i16 = 0; i16 < this.j.size(); i16++) {
                i15 += CodedOutputStream.b((String) this.j.get(i16));
            }
            int size7 = size6 + i15 + (this.j.size() * 1);
            int i17 = 0;
            for (int i18 = 0; i18 < this.k.size(); i18++) {
                i17 += CodedOutputStream.b((String) this.k.get(i18));
            }
            int size8 = size7 + i17 + (this.k.size() * 1);
            int i19 = 0;
            for (int i20 = 0; i20 < this.l.size(); i20++) {
                i19 += CodedOutputStream.b((String) this.l.get(i20));
            }
            int size9 = size8 + i19 + (this.l.size() * 1);
            int i21 = 0;
            for (int i22 = 0; i22 < this.m.size(); i22++) {
                i21 += CodedOutputStream.b((String) this.m.get(i22));
            }
            int size10 = size9 + i21 + (this.m.size() * 1);
            int i23 = 0;
            for (int i24 = 0; i24 < this.n.size(); i24++) {
                i23 += CodedOutputStream.b((String) this.n.get(i24));
            }
            int size11 = size10 + i23 + (this.n.size() * 1);
            int i25 = 0;
            for (int i26 = 0; i26 < this.o.size(); i26++) {
                i25 += CodedOutputStream.b((String) this.o.get(i26));
            }
            int size12 = size11 + i25 + (this.o.size() * 1);
            int i27 = 0;
            for (int i28 = 0; i28 < this.p.size(); i28++) {
                i27 += CodedOutputStream.b((String) this.p.get(i28));
            }
            int size13 = size12 + i27 + (this.p.size() * 1);
            int i29 = 0;
            for (int i30 = 0; i30 < this.q.size(); i30++) {
                i29 += CodedOutputStream.b((String) this.q.get(i30));
            }
            int size14 = size13 + i29 + (this.q.size() * 1);
            int i31 = 0;
            for (int i32 = 0; i32 < this.r.size(); i32++) {
                i31 += CodedOutputStream.b((String) this.r.get(i32));
            }
            int size15 = size14 + i31 + (this.r.size() * 1);
            int i33 = 0;
            for (int i34 = 0; i34 < this.s.size(); i34++) {
                i33 += CodedOutputStream.b((String) this.s.get(i34));
            }
            int size16 = size15 + i33 + (this.s.size() * 2);
            int i35 = 0;
            for (int i36 = 0; i36 < this.t.size(); i36++) {
                i35 += CodedOutputStream.b((String) this.t.get(i36));
            }
            int size17 = size16 + i35 + (this.t.size() * 2);
            int i37 = 0;
            for (int i38 = 0; i38 < this.u.size(); i38++) {
                i37 += CodedOutputStream.b((String) this.u.get(i38));
            }
            int size18 = size17 + i37 + (this.u.size() * 2);
            int i39 = 0;
            for (int i40 = 0; i40 < this.v.size(); i40++) {
                i39 += CodedOutputStream.b((String) this.v.get(i40));
            }
            int size19 = size18 + i39 + (this.v.size() * 2);
            int i41 = 0;
            for (int i42 = 0; i42 < this.w.size(); i42++) {
                i41 += CodedOutputStream.b((String) this.w.get(i42));
            }
            int size20 = size19 + i41 + (this.w.size() * 2);
            int i43 = 0;
            for (int i44 = 0; i44 < this.x.size(); i44++) {
                i43 += CodedOutputStream.b((String) this.x.get(i44));
            }
            int size21 = size20 + i43 + (this.x.size() * 2);
            int i45 = 0;
            for (int i46 = 0; i46 < this.y.size(); i46++) {
                i45 += CodedOutputStream.b((String) this.y.get(i46));
            }
            int size22 = size21 + i45 + (this.y.size() * 2);
            int i47 = 0;
            for (int i48 = 0; i48 < this.z.size(); i48++) {
                i47 += CodedOutputStream.b((String) this.z.get(i48));
            }
            int size23 = size22 + i47 + (this.z.size() * 2);
            int i49 = 0;
            for (int i50 = 0; i50 < this.A.size(); i50++) {
                i49 += CodedOutputStream.b((String) this.A.get(i50));
            }
            int size24 = size23 + i49 + (this.A.size() * 2);
            int i51 = 0;
            for (int i52 = 0; i52 < this.B.size(); i52++) {
                i51 += CodedOutputStream.b((String) this.B.get(i52));
            }
            int size25 = size24 + i51 + (this.B.size() * 2);
            int i53 = 0;
            for (int i54 = 0; i54 < this.C.size(); i54++) {
                i53 += CodedOutputStream.b((String) this.C.get(i54));
            }
            int size26 = size25 + i53 + (this.C.size() * 2);
            int i55 = 0;
            for (int i56 = 0; i56 < this.D.size(); i56++) {
                i55 += CodedOutputStream.b((String) this.D.get(i56));
            }
            int size27 = size26 + i55 + (this.D.size() * 2);
            int i57 = 0;
            for (int i58 = 0; i58 < this.E.size(); i58++) {
                i57 += CodedOutputStream.b((String) this.E.get(i58));
            }
            int size28 = size27 + i57 + (this.E.size() * 2);
            int i59 = 0;
            for (int i60 = 0; i60 < this.F.size(); i60++) {
                i59 += CodedOutputStream.b((String) this.F.get(i60));
            }
            int size29 = size28 + i59 + (this.F.size() * 2);
            int i61 = 0;
            for (int i62 = 0; i62 < this.G.size(); i62++) {
                i61 += CodedOutputStream.b((String) this.G.get(i62));
            }
            int size30 = size29 + i61 + (this.G.size() * 2);
            int i63 = 0;
            for (int i64 = 0; i64 < this.H.size(); i64++) {
                i63 += CodedOutputStream.b((String) this.H.get(i64));
            }
            int size31 = size30 + i63 + (this.H.size() * 2);
            int i65 = 0;
            for (int i66 = 0; i66 < this.I.size(); i66++) {
                i65 += CodedOutputStream.b((String) this.I.get(i66));
            }
            int size32 = size31 + i65 + (this.I.size() * 2);
            int i67 = 0;
            for (int i68 = 0; i68 < this.J.size(); i68++) {
                i67 += CodedOutputStream.b((String) this.J.get(i68));
            }
            int size33 = size32 + i67 + (this.J.size() * 2);
            int i69 = 0;
            for (int i70 = 0; i70 < this.K.size(); i70++) {
                i69 += CodedOutputStream.b((String) this.K.get(i70));
            }
            int size34 = size33 + i69 + (this.K.size() * 2);
            int i71 = 0;
            for (int i72 = 0; i72 < this.L.size(); i72++) {
                i71 += CodedOutputStream.b((String) this.L.get(i72));
            }
            int size35 = size34 + i71 + (this.L.size() * 2);
            int i73 = 0;
            for (int i74 = 0; i74 < this.M.size(); i74++) {
                i73 += CodedOutputStream.b((String) this.M.get(i74));
            }
            int size36 = size35 + i73 + (this.M.size() * 2);
            int i75 = 0;
            for (int i76 = 0; i76 < this.N.size(); i76++) {
                i75 += CodedOutputStream.b((String) this.N.get(i76));
            }
            int size37 = size36 + i75 + (this.N.size() * 2) + this.b.d();
            this.c = size37;
            return size37;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z2 = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Slots();
                case IS_INITIALIZED:
                    return O;
                case MAKE_IMMUTABLE:
                    this.d.b();
                    this.e.b();
                    this.f.b();
                    this.g.b();
                    this.h.b();
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
                    this.t.b();
                    this.u.b();
                    this.v.b();
                    this.w.b();
                    this.x.b();
                    this.y.b();
                    this.z.b();
                    this.A.b();
                    this.B.b();
                    this.C.b();
                    this.D.b();
                    this.E.b();
                    this.F.b();
                    this.G.b();
                    this.H.b();
                    this.I.b();
                    this.J.b();
                    this.K.b();
                    this.L.b();
                    this.M.b();
                    this.N.b();
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    Slots slots = (Slots) obj2;
                    this.d = fVar.a(this.d, slots.d);
                    this.e = fVar.a(this.e, slots.e);
                    this.f = fVar.a(this.f, slots.f);
                    this.g = fVar.a(this.g, slots.g);
                    this.h = fVar.a(this.h, slots.h);
                    this.i = fVar.a(this.i, slots.i);
                    this.j = fVar.a(this.j, slots.j);
                    this.k = fVar.a(this.k, slots.k);
                    this.l = fVar.a(this.l, slots.l);
                    this.m = fVar.a(this.m, slots.m);
                    this.n = fVar.a(this.n, slots.n);
                    this.o = fVar.a(this.o, slots.o);
                    this.p = fVar.a(this.p, slots.p);
                    this.q = fVar.a(this.q, slots.q);
                    this.r = fVar.a(this.r, slots.r);
                    this.s = fVar.a(this.s, slots.s);
                    this.t = fVar.a(this.t, slots.t);
                    this.u = fVar.a(this.u, slots.u);
                    this.v = fVar.a(this.v, slots.v);
                    this.w = fVar.a(this.w, slots.w);
                    this.x = fVar.a(this.x, slots.x);
                    this.y = fVar.a(this.y, slots.y);
                    this.z = fVar.a(this.z, slots.z);
                    this.A = fVar.a(this.A, slots.A);
                    this.B = fVar.a(this.B, slots.B);
                    this.C = fVar.a(this.C, slots.C);
                    this.D = fVar.a(this.D, slots.D);
                    this.E = fVar.a(this.E, slots.E);
                    this.F = fVar.a(this.F, slots.F);
                    this.G = fVar.a(this.G, slots.G);
                    this.H = fVar.a(this.H, slots.H);
                    this.I = fVar.a(this.I, slots.I);
                    this.J = fVar.a(this.J, slots.J);
                    this.K = fVar.a(this.K, slots.K);
                    this.L = fVar.a(this.L, slots.L);
                    this.M = fVar.a(this.M, slots.M);
                    this.N = fVar.a(this.N, slots.N);
                    e eVar = e.a;
                    return this;
                case MERGE_FROM_STREAM:
                    fkc fkc = (fkc) obj;
                    while (!z2) {
                        try {
                            int a2 = fkc.a();
                            switch (a2) {
                                case 0:
                                    z2 = true;
                                    break;
                                case 10:
                                    String c = fkc.c();
                                    if (!this.d.a()) {
                                        this.d = GeneratedMessageLite.a(this.d);
                                    }
                                    this.d.add(c);
                                    break;
                                case 18:
                                    String c2 = fkc.c();
                                    if (!this.e.a()) {
                                        this.e = GeneratedMessageLite.a(this.e);
                                    }
                                    this.e.add(c2);
                                    break;
                                case 26:
                                    String c3 = fkc.c();
                                    if (!this.f.a()) {
                                        this.f = GeneratedMessageLite.a(this.f);
                                    }
                                    this.f.add(c3);
                                    break;
                                case 34:
                                    String c4 = fkc.c();
                                    if (!this.g.a()) {
                                        this.g = GeneratedMessageLite.a(this.g);
                                    }
                                    this.g.add(c4);
                                    break;
                                case 42:
                                    String c5 = fkc.c();
                                    if (!this.h.a()) {
                                        this.h = GeneratedMessageLite.a(this.h);
                                    }
                                    this.h.add(c5);
                                    break;
                                case 50:
                                    String c6 = fkc.c();
                                    if (!this.i.a()) {
                                        this.i = GeneratedMessageLite.a(this.i);
                                    }
                                    this.i.add(c6);
                                    break;
                                case 58:
                                    String c7 = fkc.c();
                                    if (!this.j.a()) {
                                        this.j = GeneratedMessageLite.a(this.j);
                                    }
                                    this.j.add(c7);
                                    break;
                                case b.bu /*66*/:
                                    String c8 = fkc.c();
                                    if (!this.k.a()) {
                                        this.k = GeneratedMessageLite.a(this.k);
                                    }
                                    this.k.add(c8);
                                    break;
                                case b.bC /*74*/:
                                    String c9 = fkc.c();
                                    if (!this.l.a()) {
                                        this.l = GeneratedMessageLite.a(this.l);
                                    }
                                    this.l.add(c9);
                                    break;
                                case 82:
                                    String c10 = fkc.c();
                                    if (!this.m.a()) {
                                        this.m = GeneratedMessageLite.a(this.m);
                                    }
                                    this.m.add(c10);
                                    break;
                                case 90:
                                    String c11 = fkc.c();
                                    if (!this.n.a()) {
                                        this.n = GeneratedMessageLite.a(this.n);
                                    }
                                    this.n.add(c11);
                                    break;
                                case 98:
                                    String c12 = fkc.c();
                                    if (!this.o.a()) {
                                        this.o = GeneratedMessageLite.a(this.o);
                                    }
                                    this.o.add(c12);
                                    break;
                                case 106:
                                    String c13 = fkc.c();
                                    if (!this.p.a()) {
                                        this.p = GeneratedMessageLite.a(this.p);
                                    }
                                    this.p.add(c13);
                                    break;
                                case defpackage.o.a.aB /*114*/:
                                    String c14 = fkc.c();
                                    if (!this.q.a()) {
                                        this.q = GeneratedMessageLite.a(this.q);
                                    }
                                    this.q.add(c14);
                                    break;
                                case 122:
                                    String c15 = fkc.c();
                                    if (!this.r.a()) {
                                        this.r = GeneratedMessageLite.a(this.r);
                                    }
                                    this.r.add(c15);
                                    break;
                                case 130:
                                    String c16 = fkc.c();
                                    if (!this.s.a()) {
                                        this.s = GeneratedMessageLite.a(this.s);
                                    }
                                    this.s.add(c16);
                                    break;
                                case 138:
                                    String c17 = fkc.c();
                                    if (!this.t.a()) {
                                        this.t = GeneratedMessageLite.a(this.t);
                                    }
                                    this.t.add(c17);
                                    break;
                                case 146:
                                    String c18 = fkc.c();
                                    if (!this.u.a()) {
                                        this.u = GeneratedMessageLite.a(this.u);
                                    }
                                    this.u.add(c18);
                                    break;
                                case 154:
                                    String c19 = fkc.c();
                                    if (!this.v.a()) {
                                        this.v = GeneratedMessageLite.a(this.v);
                                    }
                                    this.v.add(c19);
                                    break;
                                case 162:
                                    String c20 = fkc.c();
                                    if (!this.w.a()) {
                                        this.w = GeneratedMessageLite.a(this.w);
                                    }
                                    this.w.add(c20);
                                    break;
                                case 170:
                                    String c21 = fkc.c();
                                    if (!this.x.a()) {
                                        this.x = GeneratedMessageLite.a(this.x);
                                    }
                                    this.x.add(c21);
                                    break;
                                case 178:
                                    String c22 = fkc.c();
                                    if (!this.y.a()) {
                                        this.y = GeneratedMessageLite.a(this.y);
                                    }
                                    this.y.add(c22);
                                    break;
                                case 186:
                                    String c23 = fkc.c();
                                    if (!this.z.a()) {
                                        this.z = GeneratedMessageLite.a(this.z);
                                    }
                                    this.z.add(c23);
                                    break;
                                case 194:
                                    String c24 = fkc.c();
                                    if (!this.A.a()) {
                                        this.A = GeneratedMessageLite.a(this.A);
                                    }
                                    this.A.add(c24);
                                    break;
                                case 202:
                                    String c25 = fkc.c();
                                    if (!this.B.a()) {
                                        this.B = GeneratedMessageLite.a(this.B);
                                    }
                                    this.B.add(c25);
                                    break;
                                case 210:
                                    String c26 = fkc.c();
                                    if (!this.C.a()) {
                                        this.C = GeneratedMessageLite.a(this.C);
                                    }
                                    this.C.add(c26);
                                    break;
                                case 218:
                                    String c27 = fkc.c();
                                    if (!this.D.a()) {
                                        this.D = GeneratedMessageLite.a(this.D);
                                    }
                                    this.D.add(c27);
                                    break;
                                case 226:
                                    String c28 = fkc.c();
                                    if (!this.E.a()) {
                                        this.E = GeneratedMessageLite.a(this.E);
                                    }
                                    this.E.add(c28);
                                    break;
                                case AdType.BRANDED_ON_DEMAND_CONTENT /*234*/:
                                    String c29 = fkc.c();
                                    if (!this.F.a()) {
                                        this.F = GeneratedMessageLite.a(this.F);
                                    }
                                    this.F.add(c29);
                                    break;
                                case 242:
                                    String c30 = fkc.c();
                                    if (!this.G.a()) {
                                        this.G = GeneratedMessageLite.a(this.G);
                                    }
                                    this.G.add(c30);
                                    break;
                                case 250:
                                    String c31 = fkc.c();
                                    if (!this.H.a()) {
                                        this.H = GeneratedMessageLite.a(this.H);
                                    }
                                    this.H.add(c31);
                                    break;
                                case 258:
                                    String c32 = fkc.c();
                                    if (!this.I.a()) {
                                        this.I = GeneratedMessageLite.a(this.I);
                                    }
                                    this.I.add(c32);
                                    break;
                                case 266:
                                    String c33 = fkc.c();
                                    if (!this.J.a()) {
                                        this.J = GeneratedMessageLite.a(this.J);
                                    }
                                    this.J.add(c33);
                                    break;
                                case 274:
                                    String c34 = fkc.c();
                                    if (!this.K.a()) {
                                        this.K = GeneratedMessageLite.a(this.K);
                                    }
                                    this.K.add(c34);
                                    break;
                                case 282:
                                    String c35 = fkc.c();
                                    if (!this.L.a()) {
                                        this.L = GeneratedMessageLite.a(this.L);
                                    }
                                    this.L.add(c35);
                                    break;
                                case 290:
                                    String c36 = fkc.c();
                                    if (!this.M.a()) {
                                        this.M = GeneratedMessageLite.a(this.M);
                                    }
                                    this.M.add(c36);
                                    break;
                                case 298:
                                    String c37 = fkc.c();
                                    if (!this.N.a()) {
                                        this.N = GeneratedMessageLite.a(this.N);
                                    }
                                    this.N.add(c37);
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
                    if (P == null) {
                        synchronized (Slots.class) {
                            if (P == null) {
                                P = new b(O);
                            }
                        }
                    }
                    return P;
                default:
                    throw new UnsupportedOperationException();
            }
            return O;
        }

        static {
            Slots slots = new Slots();
            O = slots;
            slots.e();
        }

        public static Slots k() {
            return O;
        }

        public static fkr<Slots> parser() {
            return O.c();
        }
    }
}
