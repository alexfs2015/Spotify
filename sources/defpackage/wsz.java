package defpackage;

import com.google.protobuf.InvalidProtocolBufferException;
import defpackage.fko;

/* renamed from: wsz reason: default package */
final class wsz<T extends fko> implements wry<wmg, T> {
    private final fkr<T> a;
    private final fke b;

    wsz(fkr<T> fkr, fke fke) {
        this.a = fkr;
        this.b = fke;
    }

    /* access modifiers changed from: private */
    public T a(wmg wmg) {
        try {
            T t = (fko) this.a.a(wmg.d(), this.b);
            wmg.close();
            return t;
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            wmg.close();
            throw th;
        }
    }
}
