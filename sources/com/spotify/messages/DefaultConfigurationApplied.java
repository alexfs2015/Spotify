package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class DefaultConfigurationApplied extends GeneratedMessageLite<DefaultConfigurationApplied, a> implements grc {
    /* access modifiers changed from: private */
    public static final DefaultConfigurationApplied k;
    private static volatile fll<DefaultConfigurationApplied> l;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<DefaultConfigurationApplied, a> implements grc {
        private a() {
            super(DefaultConfigurationApplied.k);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(String str) {
            b();
            DefaultConfigurationApplied.a((DefaultConfigurationApplied) this.a, str);
            return this;
        }

        public final a b(String str) {
            b();
            DefaultConfigurationApplied.b((DefaultConfigurationApplied) this.a, str);
            return this;
        }

        public final a c(String str) {
            b();
            DefaultConfigurationApplied.c((DefaultConfigurationApplied) this.a, str);
            return this;
        }

        public final a d(String str) {
            b();
            DefaultConfigurationApplied.d((DefaultConfigurationApplied) this.a, str);
            return this;
        }

        public final a e(String str) {
            b();
            DefaultConfigurationApplied.e((DefaultConfigurationApplied) this.a, str);
            return this;
        }
    }

    static {
        DefaultConfigurationApplied defaultConfigurationApplied = new DefaultConfigurationApplied();
        k = defaultConfigurationApplied;
        defaultConfigurationApplied.e();
    }

    private DefaultConfigurationApplied() {
        String str = "";
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.i = str;
        this.j = str;
    }

    static /* synthetic */ void a(DefaultConfigurationApplied defaultConfigurationApplied, String str) {
        if (str != null) {
            defaultConfigurationApplied.d |= 1;
            defaultConfigurationApplied.e = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(DefaultConfigurationApplied defaultConfigurationApplied, String str) {
        if (str != null) {
            defaultConfigurationApplied.d |= 2;
            defaultConfigurationApplied.f = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void c(DefaultConfigurationApplied defaultConfigurationApplied, String str) {
        if (str != null) {
            defaultConfigurationApplied.d |= 4;
            defaultConfigurationApplied.g = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void d(DefaultConfigurationApplied defaultConfigurationApplied, String str) {
        if (str != null) {
            defaultConfigurationApplied.d |= 8;
            defaultConfigurationApplied.h = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void e(DefaultConfigurationApplied defaultConfigurationApplied, String str) {
        if (str != null) {
            defaultConfigurationApplied.d |= 16;
            defaultConfigurationApplied.i = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a k() {
        return (a) k.h();
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

    public static fll<DefaultConfigurationApplied> parser() {
        return k.c();
    }

    private boolean q() {
        return (this.d & 16) == 16;
    }

    private boolean r() {
        return (this.d & 32) == 32;
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new DefaultConfigurationApplied();
            case IS_INITIALIZED:
                return k;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                DefaultConfigurationApplied defaultConfigurationApplied = (DefaultConfigurationApplied) obj2;
                this.e = fVar.a(m(), this.e, defaultConfigurationApplied.m(), defaultConfigurationApplied.e);
                this.f = fVar.a(n(), this.f, defaultConfigurationApplied.n(), defaultConfigurationApplied.f);
                this.g = fVar.a(o(), this.g, defaultConfigurationApplied.o(), defaultConfigurationApplied.g);
                this.h = fVar.a(p(), this.h, defaultConfigurationApplied.p(), defaultConfigurationApplied.h);
                this.i = fVar.a(q(), this.i, defaultConfigurationApplied.q(), defaultConfigurationApplied.i);
                this.j = fVar.a(r(), this.j, defaultConfigurationApplied.r(), defaultConfigurationApplied.j);
                if (fVar == e.a) {
                    this.d |= defaultConfigurationApplied.d;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                String c = fkw.c();
                                this.d |= 1;
                                this.e = c;
                            } else if (a2 == 18) {
                                String c2 = fkw.c();
                                this.d |= 2;
                                this.f = c2;
                            } else if (a2 == 26) {
                                String c3 = fkw.c();
                                this.d |= 4;
                                this.g = c3;
                            } else if (a2 == 34) {
                                String c4 = fkw.c();
                                this.d |= 8;
                                this.h = c4;
                            } else if (a2 == 42) {
                                String c5 = fkw.c();
                                this.d |= 16;
                                this.i = c5;
                            } else if (a2 == 50) {
                                String c6 = fkw.c();
                                this.d |= 32;
                                this.j = c6;
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
                if (l == null) {
                    synchronized (DefaultConfigurationApplied.class) {
                        if (l == null) {
                            l = new b(k);
                        }
                    }
                }
                return l;
            default:
                throw new UnsupportedOperationException();
        }
        return k;
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
            codedOutputStream.a(6, this.j);
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
        if ((this.d & 32) == 32) {
            i3 += CodedOutputStream.b(6, this.j);
        }
        int d2 = i3 + this.b.d();
        this.c = d2;
        return d2;
    }
}
