package com.spotify.hubs.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import java.io.IOException;

public final class Target extends GeneratedMessageLite<Target, a> implements gkg {
    /* access modifiers changed from: private */
    public static final Target i;
    private static volatile fll<Target> j;
    private int d;
    private String e = "";
    private e<String> f = flm.d();
    private View g;
    private Struct h;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Target, a> implements gkg {
        private a() {
            super(Target.i);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Target target = new Target();
        i = target;
        target.e();
    }

    private Target() {
    }

    public static Target k() {
        return i;
    }

    private View m() {
        View view = this.g;
        return view == null ? View.m() : view;
    }

    private Struct n() {
        Struct struct = this.h;
        return struct == null ? Struct.l() : struct;
    }

    public static fll<Target> parser() {
        return i.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Target();
            case IS_INITIALIZED:
                return i;
            case MAKE_IMMUTABLE:
                this.f.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Target target = (Target) obj2;
                this.e = fVar.a(!this.e.isEmpty(), this.e, !target.e.isEmpty(), target.e);
                this.f = fVar.a(this.f, target.f);
                this.g = (View) fVar.a(this.g, target.g);
                this.h = (Struct) fVar.a(this.h, target.h);
                if (fVar == e.a) {
                    this.d |= target.d;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                fky fky = (fky) obj2;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                this.e = fkw.d();
                            } else if (a2 == 18) {
                                String d2 = fkw.d();
                                if (!this.f.a()) {
                                    this.f = GeneratedMessageLite.a(this.f);
                                }
                                this.f.add(d2);
                            } else if (a2 == 26) {
                                com.spotify.hubs.view.proto.View.a aVar = this.g != null ? (com.spotify.hubs.view.proto.View.a) this.g.h() : null;
                                this.g = (View) fkw.a(View.parser(), fky);
                                if (aVar != null) {
                                    aVar.a(this.g);
                                    this.g = (View) aVar.e();
                                }
                            } else if (a2 == 34) {
                                com.google.protobuf.Struct.a aVar2 = this.h != null ? (com.google.protobuf.Struct.a) this.h.h() : null;
                                this.h = (Struct) fkw.a(Struct.parser(), fky);
                                if (aVar2 != null) {
                                    aVar2.a(this.h);
                                    this.h = (Struct) aVar2.e();
                                }
                            } else if (!fkw.b(a2)) {
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
                    synchronized (Target.class) {
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

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.e.isEmpty()) {
            codedOutputStream.a(1, this.e);
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            codedOutputStream.a(2, (String) this.f.get(i2));
        }
        if (this.g != null) {
            codedOutputStream.a(3, (fli) m());
        }
        if (this.h != null) {
            codedOutputStream.a(4, (fli) n());
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int b = !this.e.isEmpty() ? CodedOutputStream.b(1, this.e) + 0 : 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f.size(); i4++) {
            i3 += CodedOutputStream.b((String) this.f.get(i4));
        }
        int size = b + i3 + (this.f.size() * 1);
        if (this.g != null) {
            size += CodedOutputStream.b(3, (fli) m());
        }
        if (this.h != null) {
            size += CodedOutputStream.b(4, (fli) n());
        }
        this.c = size;
        return size;
    }
}
