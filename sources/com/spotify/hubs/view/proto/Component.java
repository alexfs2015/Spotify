package com.spotify.hubs.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Struct;
import com.google.protobuf.WireFormat.FieldType;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

public final class Component extends GeneratedMessageLite<Component, a> implements gkd {
    /* access modifiers changed from: private */
    public static final Component p;
    private static volatile fll<Component> q;
    public String d;
    public String e;
    public e<Component> f;
    private int g;
    private UIComponent h;
    private Text i;
    private Images j;
    private Target k;
    private Struct l;
    private Struct m;
    private Struct n;
    private MapFieldLite<String, Command> o = MapFieldLite.a();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<Component, a> implements gkd {
        private a() {
            super(Component.p);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b {
        static final flh<String, Command> a = flh.a(FieldType.STRING, "", FieldType.MESSAGE, Command.l());
    }

    static {
        Component component = new Component();
        p = component;
        component.e();
    }

    private Component() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = flm.d();
    }

    public static fll<Component> parser() {
        return p.c();
    }

    public static Component r() {
        return p;
    }

    private Target t() {
        Target target = this.k;
        return target == null ? Target.k() : target;
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new Component();
            case IS_INITIALIZED:
                return p;
            case MAKE_IMMUTABLE:
                this.f.b();
                this.o.isMutable = false;
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                f fVar = (f) obj;
                Component component = (Component) obj2;
                this.d = fVar.a(!this.d.isEmpty(), this.d, !component.d.isEmpty(), component.d);
                this.e = fVar.a(!this.e.isEmpty(), this.e, true ^ component.e.isEmpty(), component.e);
                this.h = (UIComponent) fVar.a(this.h, component.h);
                this.i = (Text) fVar.a(this.i, component.i);
                this.j = (Images) fVar.a(this.j, component.j);
                this.k = (Target) fVar.a(this.k, component.k);
                this.f = fVar.a(this.f, component.f);
                this.l = (Struct) fVar.a(this.l, component.l);
                this.m = (Struct) fVar.a(this.m, component.m);
                this.n = (Struct) fVar.a(this.n, component.n);
                this.o = fVar.a(this.o, component.o);
                if (fVar == e.a) {
                    this.g |= component.g;
                }
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                fky fky = (fky) obj2;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        switch (a2) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.d = fkw.d();
                                break;
                            case 18:
                                this.e = fkw.d();
                                break;
                            case 26:
                                com.spotify.hubs.view.proto.UIComponent.a aVar = this.h != null ? (com.spotify.hubs.view.proto.UIComponent.a) this.h.h() : null;
                                this.h = (UIComponent) fkw.a(UIComponent.parser(), fky);
                                if (aVar == null) {
                                    break;
                                } else {
                                    aVar.a(this.h);
                                    this.h = (UIComponent) aVar.e();
                                    break;
                                }
                            case 34:
                                com.spotify.hubs.view.proto.Text.a aVar2 = this.i != null ? (com.spotify.hubs.view.proto.Text.a) this.i.h() : null;
                                this.i = (Text) fkw.a(Text.parser(), fky);
                                if (aVar2 == null) {
                                    break;
                                } else {
                                    aVar2.a(this.i);
                                    this.i = (Text) aVar2.e();
                                    break;
                                }
                            case 42:
                                com.spotify.hubs.view.proto.Images.a aVar3 = this.j != null ? (com.spotify.hubs.view.proto.Images.a) this.j.h() : null;
                                this.j = (Images) fkw.a(Images.parser(), fky);
                                if (aVar3 == null) {
                                    break;
                                } else {
                                    aVar3.a(this.j);
                                    this.j = (Images) aVar3.e();
                                    break;
                                }
                            case 50:
                                com.spotify.hubs.view.proto.Target.a aVar4 = this.k != null ? (com.spotify.hubs.view.proto.Target.a) this.k.h() : null;
                                this.k = (Target) fkw.a(Target.parser(), fky);
                                if (aVar4 == null) {
                                    break;
                                } else {
                                    aVar4.a(this.k);
                                    this.k = (Target) aVar4.e();
                                    break;
                                }
                            case 58:
                                if (!this.f.a()) {
                                    this.f = GeneratedMessageLite.a(this.f);
                                }
                                this.f.add(fkw.a(parser(), fky));
                                break;
                            case defpackage.eu.b.bu /*66*/:
                                com.google.protobuf.Struct.a aVar5 = this.l != null ? (com.google.protobuf.Struct.a) this.l.h() : null;
                                this.l = (Struct) fkw.a(Struct.parser(), fky);
                                if (aVar5 == null) {
                                    break;
                                } else {
                                    aVar5.a(this.l);
                                    this.l = (Struct) aVar5.e();
                                    break;
                                }
                            case defpackage.eu.b.bC /*74*/:
                                com.google.protobuf.Struct.a aVar6 = this.m != null ? (com.google.protobuf.Struct.a) this.m.h() : null;
                                this.m = (Struct) fkw.a(Struct.parser(), fky);
                                if (aVar6 == null) {
                                    break;
                                } else {
                                    aVar6.a(this.m);
                                    this.m = (Struct) aVar6.e();
                                    break;
                                }
                            case 82:
                                com.google.protobuf.Struct.a aVar7 = this.n != null ? (com.google.protobuf.Struct.a) this.n.h() : null;
                                this.n = (Struct) fkw.a(Struct.parser(), fky);
                                if (aVar7 == null) {
                                    break;
                                } else {
                                    aVar7.a(this.n);
                                    this.n = (Struct) aVar7.e();
                                    break;
                                }
                            case 90:
                                if (!this.o.isMutable) {
                                    this.o = this.o.b();
                                }
                                b.a.a(this.o, fkw, fky);
                                break;
                            default:
                                if (fkw.b(a2)) {
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
                    synchronized (Component.class) {
                        if (q == null) {
                            q = new com.google.protobuf.GeneratedMessageLite.b(p);
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
        if (!this.d.isEmpty()) {
            codedOutputStream.a(1, this.d);
        }
        if (!this.e.isEmpty()) {
            codedOutputStream.a(2, this.e);
        }
        if (this.h != null) {
            codedOutputStream.a(3, (fli) k());
        }
        if (this.i != null) {
            codedOutputStream.a(4, (fli) l());
        }
        if (this.j != null) {
            codedOutputStream.a(5, (fli) m());
        }
        if (this.k != null) {
            codedOutputStream.a(6, (fli) t());
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            codedOutputStream.a(7, (fli) this.f.get(i2));
        }
        if (this.l != null) {
            codedOutputStream.a(8, (fli) n());
        }
        if (this.m != null) {
            codedOutputStream.a(9, (fli) o());
        }
        if (this.n != null) {
            codedOutputStream.a(10, (fli) p());
        }
        for (Entry entry : this.o.entrySet()) {
            b.a.a(codedOutputStream, 11, entry.getKey(), entry.getValue());
        }
    }

    public final int j() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int b2 = !this.d.isEmpty() ? CodedOutputStream.b(1, this.d) + 0 : 0;
        if (!this.e.isEmpty()) {
            b2 += CodedOutputStream.b(2, this.e);
        }
        if (this.h != null) {
            b2 += CodedOutputStream.b(3, (fli) k());
        }
        if (this.i != null) {
            b2 += CodedOutputStream.b(4, (fli) l());
        }
        if (this.j != null) {
            b2 += CodedOutputStream.b(5, (fli) m());
        }
        if (this.k != null) {
            b2 += CodedOutputStream.b(6, (fli) t());
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            b2 += CodedOutputStream.b(7, (fli) this.f.get(i3));
        }
        if (this.l != null) {
            b2 += CodedOutputStream.b(8, (fli) n());
        }
        if (this.m != null) {
            b2 += CodedOutputStream.b(9, (fli) o());
        }
        if (this.n != null) {
            b2 += CodedOutputStream.b(10, (fli) p());
        }
        for (Entry entry : this.o.entrySet()) {
            b2 += b.a.a(11, entry.getKey(), entry.getValue());
        }
        this.c = b2;
        return b2;
    }

    public final UIComponent k() {
        UIComponent uIComponent = this.h;
        return uIComponent == null ? UIComponent.k() : uIComponent;
    }

    public final Text l() {
        Text text = this.i;
        return text == null ? Text.k() : text;
    }

    public final Images m() {
        Images images = this.j;
        return images == null ? Images.n() : images;
    }

    public final Struct n() {
        Struct struct = this.l;
        return struct == null ? Struct.l() : struct;
    }

    public final Struct o() {
        Struct struct = this.m;
        return struct == null ? Struct.l() : struct;
    }

    public final Struct p() {
        Struct struct = this.n;
        return struct == null ? Struct.l() : struct;
    }

    public final Map<String, Command> q() {
        return Collections.unmodifiableMap(this.o);
    }
}
