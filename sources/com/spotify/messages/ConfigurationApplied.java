package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class ConfigurationApplied extends GeneratedMessageLite<ConfigurationApplied, a> implements gpj {
    /* access modifiers changed from: private */
    public static final ConfigurationApplied m;
    private static volatile fkr<ConfigurationApplied> n;
    private int d;
    private long e;
    private String f;
    private c g = fkh.d();
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<ConfigurationApplied, a> implements gpj {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            super(ConfigurationApplied.m);
        }

        public final a a(long j) {
            b();
            ConfigurationApplied.a((ConfigurationApplied) this.a, j);
            return this;
        }

        public final a a(String str) {
            b();
            ConfigurationApplied.a((ConfigurationApplied) this.a, str);
            return this;
        }

        public final a a(Iterable<? extends Integer> iterable) {
            b();
            ConfigurationApplied.a((ConfigurationApplied) this.a, (Iterable) iterable);
            return this;
        }

        public final a b(String str) {
            b();
            ConfigurationApplied.b((ConfigurationApplied) this.a, str);
            return this;
        }

        public final a c(String str) {
            b();
            ConfigurationApplied.c((ConfigurationApplied) this.a, str);
            return this;
        }

        public final a d(String str) {
            b();
            ConfigurationApplied.d((ConfigurationApplied) this.a, str);
            return this;
        }

        public final a e(String str) {
            b();
            ConfigurationApplied.e((ConfigurationApplied) this.a, str);
            return this;
        }
    }

    private ConfigurationApplied() {
        String str = "";
        this.f = str;
        this.h = str;
        this.i = str;
        this.j = str;
        this.k = str;
        this.l = str;
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
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            codedOutputStream.b(3, this.g.b(i2));
        }
        if ((this.d & 4) == 4) {
            codedOutputStream.a(4, this.h);
        }
        if ((this.d & 8) == 8) {
            codedOutputStream.a(5, this.i);
        }
        if ((this.d & 16) == 16) {
            codedOutputStream.a(6, this.j);
        }
        if ((this.d & 32) == 32) {
            codedOutputStream.a(7, this.k);
        }
        if ((this.d & 64) == 64) {
            codedOutputStream.a(8, this.l);
        }
        this.b.a(codedOutputStream);
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int c = (this.d & 1) == 1 ? CodedOutputStream.c(1, this.e) + 0 : 0;
        if ((this.d & 2) == 2) {
            c += CodedOutputStream.b(2, this.f);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.g.size(); i4++) {
            i3 += CodedOutputStream.e(this.g.b(i4));
        }
        int size = c + i3 + (this.g.size() * 1);
        if ((this.d & 4) == 4) {
            size += CodedOutputStream.b(4, this.h);
        }
        if ((this.d & 8) == 8) {
            size += CodedOutputStream.b(5, this.i);
        }
        if ((this.d & 16) == 16) {
            size += CodedOutputStream.b(6, this.j);
        }
        if ((this.d & 32) == 32) {
            size += CodedOutputStream.b(7, this.k);
        }
        if ((this.d & 64) == 64) {
            size += CodedOutputStream.b(8, this.l);
        }
        int d2 = size + this.b.d();
        this.c = d2;
        return d2;
    }

    public static a k() {
        return (a) m.h();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new ConfigurationApplied();
            case IS_INITIALIZED:
                return m;
            case MAKE_IMMUTABLE:
                this.g.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                ConfigurationApplied configurationApplied = (ConfigurationApplied) obj2;
                this.e = fVar.a(m(), this.e, configurationApplied.m(), configurationApplied.e);
                this.f = fVar.a(n(), this.f, configurationApplied.n(), configurationApplied.f);
                this.g = fVar.a(this.g, configurationApplied.g);
                this.h = fVar.a(o(), this.h, configurationApplied.o(), configurationApplied.h);
                this.i = fVar.a(p(), this.i, configurationApplied.p(), configurationApplied.i);
                this.j = fVar.a(q(), this.j, configurationApplied.q(), configurationApplied.j);
                this.k = fVar.a(r(), this.k, configurationApplied.r(), configurationApplied.k);
                this.l = fVar.a(s(), this.l, configurationApplied.s(), configurationApplied.l);
                if (fVar == e.a) {
                    this.d |= configurationApplied.d;
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
                                this.e = fkc.h();
                            } else if (a2 == 18) {
                                String c = fkc.c();
                                this.d |= 2;
                                this.f = c;
                            } else if (a2 == 24) {
                                if (!this.g.a()) {
                                    this.g = GeneratedMessageLite.a(this.g);
                                }
                                this.g.d(fkc.g());
                            } else if (a2 == 26) {
                                int c2 = fkc.c(fkc.g());
                                if (!this.g.a() && fkc.k() > 0) {
                                    this.g = GeneratedMessageLite.a(this.g);
                                }
                                while (fkc.k() > 0) {
                                    this.g.d(fkc.g());
                                }
                                fkc.d(c2);
                            } else if (a2 == 34) {
                                String c3 = fkc.c();
                                this.d |= 4;
                                this.h = c3;
                            } else if (a2 == 42) {
                                String c4 = fkc.c();
                                this.d = 8 | this.d;
                                this.i = c4;
                            } else if (a2 == 50) {
                                String c5 = fkc.c();
                                this.d |= 16;
                                this.j = c5;
                            } else if (a2 == 58) {
                                String c6 = fkc.c();
                                this.d |= 32;
                                this.k = c6;
                            } else if (a2 == 66) {
                                String c7 = fkc.c();
                                this.d |= 64;
                                this.l = c7;
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
                if (n == null) {
                    synchronized (ConfigurationApplied.class) {
                        if (n == null) {
                            n = new b(m);
                        }
                    }
                }
                return n;
            default:
                throw new UnsupportedOperationException();
        }
        return m;
    }

    static {
        ConfigurationApplied configurationApplied = new ConfigurationApplied();
        m = configurationApplied;
        configurationApplied.e();
    }

    public static fkr<ConfigurationApplied> parser() {
        return m.c();
    }

    static /* synthetic */ void a(ConfigurationApplied configurationApplied, long j2) {
        configurationApplied.d |= 1;
        configurationApplied.e = j2;
    }

    static /* synthetic */ void a(ConfigurationApplied configurationApplied, String str) {
        if (str != null) {
            configurationApplied.d |= 2;
            configurationApplied.f = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void a(ConfigurationApplied configurationApplied, Iterable iterable) {
        if (!configurationApplied.g.a()) {
            configurationApplied.g = GeneratedMessageLite.a(configurationApplied.g);
        }
        fjx.a(iterable, configurationApplied.g);
    }

    static /* synthetic */ void b(ConfigurationApplied configurationApplied, String str) {
        if (str != null) {
            configurationApplied.d |= 4;
            configurationApplied.h = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void c(ConfigurationApplied configurationApplied, String str) {
        if (str != null) {
            configurationApplied.d |= 8;
            configurationApplied.i = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void d(ConfigurationApplied configurationApplied, String str) {
        if (str != null) {
            configurationApplied.d |= 16;
            configurationApplied.j = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void e(ConfigurationApplied configurationApplied, String str) {
        if (str != null) {
            configurationApplied.d |= 32;
            configurationApplied.k = str;
            return;
        }
        throw new NullPointerException();
    }
}
