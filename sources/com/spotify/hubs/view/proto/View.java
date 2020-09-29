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

public final class View extends GeneratedMessageLite<View, a> implements gkj {
    /* access modifiers changed from: private */
    public static final View l;
    private static volatile fll<View> m;
    public String d;
    public String e;
    public e<Component> f = flm.d();
    public String g;
    private int h;
    private Component i;
    private e<Component> j = flm.d();
    private Struct k;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<View, a> implements gkj {
        private a() {
            super(View.l);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        View view = new View();
        l = view;
        view.e();
    }

    private View() {
        String str = "";
        this.d = str;
        this.e = str;
        this.g = str;
    }

    public static View a(byte[] bArr) {
        return (View) GeneratedMessageLite.a(l, bArr);
    }

    public static View m() {
        return l;
    }

    public static fll<View> parser() {
        return l.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new View();
            case IS_INITIALIZED:
                return l;
            case MAKE_IMMUTABLE:
                this.f.b();
                this.j.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                View view = (View) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !view.d.isEmpty(), view.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, !view.e.isEmpty(), view.e);
                this.i = (Component) fVar.a(this.i, view.i);
                this.f = fVar.a(this.f, view.f);
                this.j = fVar.a(this.j, view.j);
                this.g = fVar.a(!this.g.isEmpty(), this.g, !view.g.isEmpty(), view.g);
                this.k = (Struct) fVar.a(this.k, view.k);
                if (fVar == e.a) {
                    this.h |= view.h;
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
                                this.d = fkw.d();
                            } else if (a2 == 18) {
                                this.e = fkw.d();
                            } else if (a2 == 26) {
                                com.spotify.hubs.view.proto.Component.a aVar = this.i != null ? (com.spotify.hubs.view.proto.Component.a) this.i.h() : null;
                                this.i = (Component) fkw.a(Component.parser(), fky);
                                if (aVar != null) {
                                    aVar.a(this.i);
                                    this.i = (Component) aVar.e();
                                }
                            } else if (a2 == 34) {
                                if (!this.f.a()) {
                                    this.f = GeneratedMessageLite.a(this.f);
                                }
                                this.f.add(fkw.a(Component.parser(), fky));
                            } else if (a2 == 42) {
                                if (!this.j.a()) {
                                    this.j = GeneratedMessageLite.a(this.j);
                                }
                                this.j.add(fkw.a(Component.parser(), fky));
                            } else if (a2 == 50) {
                                this.g = fkw.d();
                            } else if (a2 == 58) {
                                com.google.protobuf.Struct.a aVar2 = this.k != null ? (com.google.protobuf.Struct.a) this.k.h() : null;
                                this.k = (Struct) fkw.a(Struct.parser(), fky);
                                if (aVar2 != null) {
                                    aVar2.a(this.k);
                                    this.k = (Struct) aVar2.e();
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
                if (m == null) {
                    synchronized (View.class) {
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

    public final void a(CodedOutputStream codedOutputStream) {
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        if (!this.e.isEmpty()) {
            codedOutputStream.a(2, this.e);
        }
        if (this.i != null) {
            codedOutputStream.a(3, (fli) k());
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            codedOutputStream.a(4, (fli) this.f.get(i2));
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            codedOutputStream.a(5, (fli) this.j.get(i3));
        }
        if (!this.g.isEmpty()) {
            codedOutputStream.a(6, this.g);
        }
        if (this.k != null) {
            codedOutputStream.a(7, (fli) l());
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int b = !this.d.isEmpty() ? CodedOutputStream.b(1, this.d) + 0 : 0;
        if (!this.e.isEmpty()) {
            b += CodedOutputStream.b(2, this.e);
        }
        if (this.i != null) {
            b += CodedOutputStream.b(3, (fli) k());
        }
        int i3 = b;
        for (int i4 = 0; i4 < this.f.size(); i4++) {
            i3 += CodedOutputStream.b(4, (fli) this.f.get(i4));
        }
        for (int i5 = 0; i5 < this.j.size(); i5++) {
            i3 += CodedOutputStream.b(5, (fli) this.j.get(i5));
        }
        if (!this.g.isEmpty()) {
            i3 += CodedOutputStream.b(6, this.g);
        }
        if (this.k != null) {
            i3 += CodedOutputStream.b(7, (fli) l());
        }
        this.c = i3;
        return i3;
    }

    public final Component k() {
        Component component = this.i;
        return component == null ? Component.r() : component;
    }

    public final Struct l() {
        Struct struct = this.k;
        return struct == null ? Struct.l() : struct;
    }
}
