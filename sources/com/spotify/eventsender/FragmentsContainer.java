package com.spotify.eventsender;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.GeneratedMessageLite.e;
import com.google.protobuf.GeneratedMessageLite.f;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

public final class FragmentsContainer extends GeneratedMessageLite<FragmentsContainer, a> implements gfs {
    /* access modifiers changed from: private */
    public static final FragmentsContainer e;
    private static volatile fll<FragmentsContainer> f;
    public e<Fragment> d = flm.d();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.a<FragmentsContainer, a> implements gfs {
        private a() {
            super(FragmentsContainer.e);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(com.spotify.eventsender.Fragment.a aVar) {
            b();
            FragmentsContainer.a((FragmentsContainer) this.a, aVar);
            return this;
        }

        public final a a(Iterable<? extends Fragment> iterable) {
            b();
            FragmentsContainer.a((FragmentsContainer) this.a, (Iterable) iterable);
            return this;
        }
    }

    static {
        FragmentsContainer fragmentsContainer = new FragmentsContainer();
        e = fragmentsContainer;
        fragmentsContainer.e();
    }

    private FragmentsContainer() {
    }

    public static FragmentsContainer a(byte[] bArr) {
        return (FragmentsContainer) GeneratedMessageLite.a(e, bArr);
    }

    static /* synthetic */ void a(FragmentsContainer fragmentsContainer, com.spotify.eventsender.Fragment.a aVar) {
        fragmentsContainer.n();
        fragmentsContainer.d.add(aVar.g());
    }

    static /* synthetic */ void a(FragmentsContainer fragmentsContainer, Iterable iterable) {
        fragmentsContainer.n();
        fkr.a(iterable, fragmentsContainer.d);
    }

    public static a k() {
        return (a) e.h();
    }

    public static FragmentsContainer l() {
        return e;
    }

    private void n() {
        if (!this.d.a()) {
            this.d = GeneratedMessageLite.a(this.d);
        }
    }

    public static fll<FragmentsContainer> parser() {
        return e.c();
    }

    public final Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke) {
            case NEW_MUTABLE_INSTANCE:
                return new FragmentsContainer();
            case IS_INITIALIZED:
                return e;
            case MAKE_IMMUTABLE:
                this.d.b();
                return null;
            case NEW_BUILDER:
                return new a(0);
            case VISIT:
                this.d = ((f) obj).a(this.d, ((FragmentsContainer) obj2).d);
                e eVar = e.a;
                return this;
            case MERGE_FROM_STREAM:
                fkw fkw = (fkw) obj;
                fky fky = (fky) obj2;
                while (!z) {
                    try {
                        int a2 = fkw.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                if (!this.d.a()) {
                                    this.d = GeneratedMessageLite.a(this.d);
                                }
                                this.d.add(fkw.a(Fragment.parser(), fky));
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
                if (f == null) {
                    synchronized (FragmentsContainer.class) {
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

    public final void a(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.d.size(); i++) {
            codedOutputStream.a(1, (fli) this.d.get(i));
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
            i2 += CodedOutputStream.b(1, (fli) this.d.get(i3));
        }
        int d2 = i2 + this.b.d();
        this.c = d2;
        return d2;
    }
}
