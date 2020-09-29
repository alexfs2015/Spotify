package defpackage;

import defpackage.wwi;

/* renamed from: wwu reason: default package */
public class wwu<V, F extends wwi<V>> implements wwk<F> {
    private static final wyc a = wyd.a(wwu.class);
    private final wws<? super V>[] b;
    private final boolean c;

    @SafeVarargs
    public wwu(boolean z, wws<? super V>... wwsArr) {
        wxq.a(wwsArr, "promises");
        int length = wwsArr.length;
        int i = 0;
        while (i < length) {
            if (wwsArr[i] != null) {
                i++;
            } else {
                throw new IllegalArgumentException("promises contains null Promise");
            }
        }
        this.b = (wws[]) wwsArr.clone();
        this.c = z;
    }

    public void operationComplete(F f) {
        wws<? super V>[] wwsArr;
        wyc wyc = this.c ? a : null;
        int i = 0;
        if (f.g()) {
            Object obj = f.get();
            wws<? super V>[] wwsArr2 = this.b;
            int length = wwsArr2.length;
            while (i < length) {
                wxs.a(wwsArr2[i], obj, wyc);
                i++;
            }
        } else if (f.isCancelled()) {
            for (wws<? super V> wws : this.b) {
                if (!wws.cancel(false) && wyc != null) {
                    Throwable f2 = wws.f();
                    if (f2 == null) {
                        wyc.c("Failed to cancel promise because it has succeeded already: {}", (Object) wws);
                    } else {
                        wyc.c("Failed to cancel promise because it has failed already: {}, unnotified cause:", wws, f2);
                    }
                }
            }
        } else {
            Throwable f3 = f.f();
            wws<? super V>[] wwsArr3 = this.b;
            int length2 = wwsArr3.length;
            while (i < length2) {
                wxs.a(wwsArr3[i], f3, wyc);
                i++;
            }
        }
    }
}
