package com.spotify.eventsender;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class Fragment extends GeneratedMessageLite<Fragment, a> implements gfr {
    /* access modifiers changed from: private */
    public static final Fragment g;
    private static volatile fll<Fragment> h;
    public String d = "";
    public ByteString e = ByteString.a;
    private int f;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Fragment, a> implements gfr {
        private a() {
            super(Fragment.g);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(ByteString byteString) {
            b();
            Fragment.a((Fragment) this.a, byteString);
            return this;
        }

        public final a a(String str) {
            b();
            Fragment.a((Fragment) this.a, str);
            return this;
        }
    }

    static {
        Fragment fragment = new Fragment();
        g = fragment;
        fragment.e();
    }

    private Fragment() {
    }

    static /* synthetic */ void a(Fragment fragment, ByteString byteString) {
        if (byteString != null) {
            fragment.f |= 2;
            fragment.e = byteString;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void a(Fragment fragment, String str) {
        if (str != null) {
            fragment.f |= 1;
            fragment.d = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a k() {
        return (a) g.h();
    }

    private boolean m() {
        return (this.f & 1) == 1;
    }

    private boolean n() {
        return (this.f & 2) == 2;
    }

    public static fll<Fragment> parser() {
        return g.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Fragment();
            case IS_INITIALIZED:
                return g;
            case MAKE_IMMUTABLE:
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Fragment fragment = (Fragment) obj2;
                this.d = fVar.a(m(), this.d, fragment.m(), fragment.d);
                this.e = fVar.a(n(), this.e, fragment.n(), fragment.e);
                if (fVar == e.a) {
                    this.f |= fragment.f;
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
                                this.f |= 1;
                                this.d = c;
                            } else if (a2 == 18) {
                                this.f |= 2;
                                this.e = fkw.e();
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
                if (h == null) {
                    synchronized (Fragment.class) {
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

    public final void a(CodedOutputStream codedOutputStream) {
        if ((this.f & 1) == 1) {
            codedOutputStream.a(1, this.d);
        }
        if ((this.f & 2) == 2) {
            codedOutputStream.a(2, this.e);
        }
        this.b.a(codedOutputStream);
    }

    public final int j() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f & 1) == 1) {
            i2 = 0 + CodedOutputStream.b(1, this.d);
        }
        if ((this.f & 2) == 2) {
            i2 += CodedOutputStream.b(2, this.e);
        }
        int d2 = i2 + this.b.d();
        this.c = d2;
        return d2;
    }
}
