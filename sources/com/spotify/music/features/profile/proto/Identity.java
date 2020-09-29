package com.spotify.music.features.profile.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;
import java.io.IOException;

public final class Identity {

    public static final class DecorationData extends GeneratedMessageLite<DecorationData, a> implements psp {
        /* access modifiers changed from: private */
        public static final DecorationData p;
        private static volatile fll<DecorationData> q;
        public String d;
        public String e;
        private int f;
        private String g;
        private String h;
        private int i;
        private String j;
        private String k;
        private String l;
        private boolean m;
        private boolean n;
        private boolean o;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.a<DecorationData, a> implements psp {
            private a() {
                super(DecorationData.p);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            DecorationData decorationData = new DecorationData();
            p = decorationData;
            decorationData.e();
        }

        private DecorationData() {
            String str = "";
            this.g = str;
            this.d = str;
            this.h = str;
            this.e = str;
            this.j = str;
            this.k = str;
            this.l = str;
        }

        private boolean l() {
            return (this.f & 1) == 1;
        }

        private boolean m() {
            return (this.f & 2) == 2;
        }

        private boolean n() {
            return (this.f & 4) == 4;
        }

        private boolean o() {
            return (this.f & 8) == 8;
        }

        private boolean p() {
            return (this.f & 16) == 16;
        }

        public static fll<DecorationData> parser() {
            return p.c();
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

        private boolean v() {
            return (this.f & 1024) == 1024;
        }

        public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new DecorationData();
                case IS_INITIALIZED:
                    return p;
                case MAKE_IMMUTABLE:
                    return null;
                case NEW_BUILDER:
                    return new a(0);
                case VISIT:
                    f fVar = (f) obj;
                    DecorationData decorationData = (DecorationData) obj2;
                    this.g = fVar.a(l(), this.g, decorationData.l(), decorationData.g);
                    this.d = fVar.a(m(), this.d, decorationData.m(), decorationData.d);
                    this.h = fVar.a(n(), this.h, decorationData.n(), decorationData.h);
                    this.i = fVar.a(o(), this.i, decorationData.o(), decorationData.i);
                    this.e = fVar.a(p(), this.e, decorationData.p(), decorationData.e);
                    this.j = fVar.a(q(), this.j, decorationData.q(), decorationData.j);
                    this.k = fVar.a(r(), this.k, decorationData.r(), decorationData.k);
                    this.l = fVar.a(s(), this.l, decorationData.s(), decorationData.l);
                    this.m = fVar.a(t(), this.m, decorationData.t(), decorationData.m);
                    this.n = fVar.a(u(), this.n, decorationData.u(), decorationData.n);
                    this.o = fVar.a(v(), this.o, decorationData.v(), decorationData.o);
                    if (fVar == e.a) {
                        this.f |= decorationData.f;
                    }
                    return this;
                case MERGE_FROM_STREAM:
                    fkw fkw = (fkw) obj;
                    while (!z) {
                        try {
                            int a2 = fkw.a();
                            switch (a2) {
                                case 0:
                                    z = true;
                                    break;
                                case 10:
                                    String c = fkw.c();
                                    this.f |= 1;
                                    this.g = c;
                                    break;
                                case 18:
                                    String c2 = fkw.c();
                                    this.f |= 2;
                                    this.d = c2;
                                    break;
                                case 26:
                                    String c3 = fkw.c();
                                    this.f |= 4;
                                    this.h = c3;
                                    break;
                                case 32:
                                    this.f |= 8;
                                    this.i = fkw.g();
                                    break;
                                case 42:
                                    String c4 = fkw.c();
                                    this.f |= 16;
                                    this.e = c4;
                                    break;
                                case 50:
                                    String c5 = fkw.c();
                                    this.f |= 32;
                                    this.j = c5;
                                    break;
                                case 58:
                                    String c6 = fkw.c();
                                    this.f |= 64;
                                    this.k = c6;
                                    break;
                                case b.bu /*66*/:
                                    String c7 = fkw.c();
                                    this.f |= 128;
                                    this.l = c7;
                                    break;
                                case PlaybackSpeed.PLAYBACK_SPEED_80 /*80*/:
                                    this.f |= 256;
                                    this.m = fkw.b();
                                    break;
                                case 88:
                                    this.f |= 512;
                                    this.n = fkw.b();
                                    break;
                                case 96:
                                    this.f |= 1024;
                                    this.o = fkw.b();
                                    break;
                                default:
                                    if (a(a2, fkw)) {
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
                    if (q == null) {
                        synchronized (DecorationData.class) {
                            if (q == null) {
                                q = new b(p);
                            }
                        }
                    }
                    return q;
                default:
                    throw new UnsupportedOperationException();
            }
            return p;
        }

        public final void a(CodedOutputStream codedOutputStream) {
            if ((this.f & 1) == 1) {
                codedOutputStream.a(1, this.g);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.a(2, this.d);
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.a(3, this.h);
            }
            if ((this.f & 8) == 8) {
                codedOutputStream.b(4, this.i);
            }
            if ((this.f & 16) == 16) {
                codedOutputStream.a(5, this.e);
            }
            if ((this.f & 32) == 32) {
                codedOutputStream.a(6, this.j);
            }
            if ((this.f & 64) == 64) {
                codedOutputStream.a(7, this.k);
            }
            if ((this.f & 128) == 128) {
                codedOutputStream.a(8, this.l);
            }
            if ((this.f & 256) == 256) {
                codedOutputStream.a(10, this.m);
            }
            if ((this.f & 512) == 512) {
                codedOutputStream.a(11, this.n);
            }
            if ((this.f & 1024) == 1024) {
                codedOutputStream.a(12, this.o);
            }
            this.b.a(codedOutputStream);
        }

        public final int j() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.f & 1) == 1) {
                i3 = 0 + CodedOutputStream.b(1, this.g);
            }
            if ((this.f & 2) == 2) {
                i3 += CodedOutputStream.b(2, this.d);
            }
            if ((this.f & 4) == 4) {
                i3 += CodedOutputStream.b(3, this.h);
            }
            if ((this.f & 8) == 8) {
                i3 += CodedOutputStream.f(4, this.i);
            }
            if ((this.f & 16) == 16) {
                i3 += CodedOutputStream.b(5, this.e);
            }
            if ((this.f & 32) == 32) {
                i3 += CodedOutputStream.b(6, this.j);
            }
            if ((this.f & 64) == 64) {
                i3 += CodedOutputStream.b(7, this.k);
            }
            if ((this.f & 128) == 128) {
                i3 += CodedOutputStream.b(8, this.l);
            }
            if ((this.f & 256) == 256) {
                i3 += CodedOutputStream.b(10, this.m);
            }
            if ((this.f & 512) == 512) {
                i3 += CodedOutputStream.b(11, this.n);
            }
            if ((this.f & 1024) == 1024) {
                i3 += CodedOutputStream.b(12, this.o);
            }
            int d2 = i3 + this.b.d();
            this.c = d2;
            return d2;
        }
    }
}
