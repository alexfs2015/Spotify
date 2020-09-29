package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Track extends GeneratedMessageLite<Track, a> implements vjm {
    /* access modifiers changed from: private */
    public static final Track l;
    private static volatile fkr<Track> m;
    public boolean d;
    public boolean e;
    public e<RelatedEntity> f = fks.d();
    public String g;
    public String h;
    public boolean i;
    private int j;
    private RelatedEntity k;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Track, a> implements vjm {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(Track.l);
        }
    }

    private Track() {
        String str = "";
        this.g = str;
        this.h = str;
    }

    public final RelatedEntity k() {
        RelatedEntity relatedEntity = this.k;
        return relatedEntity == null ? RelatedEntity.l() : relatedEntity;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        boolean z = this.d;
        if (z) {
            codedOutputStream.a(1, z);
        }
        boolean z2 = this.e;
        if (z2) {
            codedOutputStream.a(2, z2);
        }
        if (this.k != null) {
            codedOutputStream.a(3, (fko) k());
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            codedOutputStream.a(4, (fko) this.f.get(i2));
        }
        if (!this.g.isEmpty()) {
            codedOutputStream.a(2045, this.g);
        }
        if (!this.h.isEmpty()) {
            codedOutputStream.a(2046, this.h);
        }
        boolean z3 = this.i;
        if (z3) {
            codedOutputStream.a(2047, z3);
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        boolean z = this.d;
        int b = z ? CodedOutputStream.b(1, z) + 0 : 0;
        boolean z2 = this.e;
        if (z2) {
            b += CodedOutputStream.b(2, z2);
        }
        if (this.k != null) {
            b += CodedOutputStream.b(3, (fko) k());
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            b += CodedOutputStream.b(4, (fko) this.f.get(i3));
        }
        if (!this.g.isEmpty()) {
            b += CodedOutputStream.b(2045, this.g);
        }
        if (!this.h.isEmpty()) {
            b += CodedOutputStream.b(2046, this.h);
        }
        boolean z3 = this.i;
        if (z3) {
            b += CodedOutputStream.b(2047, z3);
        }
        this.c = b;
        return b;
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Track();
            case IS_INITIALIZED:
                return l;
            case MAKE_IMMUTABLE:
                this.f.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Track track = (Track) obj2;
                boolean z2 = this.d;
                boolean z3 = track.d;
                this.d = fVar.a(z2, z2, z3, z3);
                boolean z4 = this.e;
                boolean z5 = track.e;
                this.e = fVar.a(z4, z4, z5, z5);
                this.k = (RelatedEntity) fVar.a(this.k, track.k);
                this.f = fVar.a(this.f, track.f);
                this.g = fVar.a(!this.g.isEmpty(), this.g, !track.g.isEmpty(), track.g);
                this.h = fVar.a(!this.h.isEmpty(), this.h, !track.h.isEmpty(), track.h);
                boolean z6 = this.i;
                boolean z7 = track.i;
                this.i = fVar.a(z6, z6, z7, z7);
                if (fVar == e.a) {
                    this.j |= track.j;
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
                                this.d = fkc.b();
                            } else if (a2 == 16) {
                                this.e = fkc.b();
                            } else if (a2 == 26) {
                                com.spotify.searchview.proto.RelatedEntity.a aVar = this.k != null ? (com.spotify.searchview.proto.RelatedEntity.a) this.k.h() : null;
                                this.k = (RelatedEntity) fkc.a(RelatedEntity.parser(), fke);
                                if (aVar != null) {
                                    aVar.a(this.k);
                                    this.k = (RelatedEntity) aVar.e();
                                }
                            } else if (a2 == 34) {
                                if (!this.f.a()) {
                                    this.f = GeneratedMessageLite.a(this.f);
                                }
                                this.f.add(fkc.a(RelatedEntity.parser(), fke));
                            } else if (a2 == 16362) {
                                this.g = fkc.d();
                            } else if (a2 == 16370) {
                                this.h = fkc.d();
                            } else if (a2 == 16376) {
                                this.i = fkc.b();
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
                if (m == null) {
                    synchronized (Track.class) {
                        if (m == null) {
                            m = new b(l);
                        }
                    }
                }
                return m;
            default:
                throw new UnsupportedOperationException();
        }
        return l;
    }

    static {
        Track track = new Track();
        l = track;
        track.e();
    }

    public static Track l() {
        return l;
    }

    public static fkr<Track> parser() {
        return l.c();
    }
}
