package defpackage;

import com.google.protobuf.InvalidProtocolBufferException;
import defpackage.fli;

/* renamed from: xhe reason: default package */
final class xhe<T extends fli> implements xgd<xam, T> {
    private final fll<T> a;
    private final fky b;

    xhe(fll<T> fll, fky fky) {
        this.a = fll;
        this.b = fky;
    }

    /* access modifiers changed from: private */
    public T a(xam xam) {
        try {
            T t = (fli) this.a.a(xam.d(), this.b);
            xam.close();
            return t;
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            xam.close();
            throw th;
        }
    }
}
