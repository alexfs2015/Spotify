package defpackage;

import defpackage.wic;

/* renamed from: wio reason: default package */
public class wio<V, F extends wic<V>> implements wie<F> {
    private static final wjw a = wjx.a(wio.class);
    private final wim<? super V>[] b;
    private final boolean c;

    @SafeVarargs
    public wio(boolean z, wim<? super V>... wimArr) {
        wjk.a(wimArr, "promises");
        int length = wimArr.length;
        int i = 0;
        while (i < length) {
            if (wimArr[i] != null) {
                i++;
            } else {
                throw new IllegalArgumentException("promises contains null Promise");
            }
        }
        this.b = (wim[]) wimArr.clone();
        this.c = z;
    }

    public void operationComplete(F f) {
        wim<? super V>[] wimArr;
        wjw wjw = this.c ? a : null;
        int i = 0;
        if (f.g()) {
            Object obj = f.get();
            wim<? super V>[] wimArr2 = this.b;
            int length = wimArr2.length;
            while (i < length) {
                wjm.a(wimArr2[i], obj, wjw);
                i++;
            }
        } else if (f.isCancelled()) {
            for (wim<? super V> wim : this.b) {
                if (!wim.cancel(false) && wjw != null) {
                    Throwable f2 = wim.f();
                    if (f2 == null) {
                        wjw.c("Failed to cancel promise because it has succeeded already: {}", (Object) wim);
                    } else {
                        wjw.c("Failed to cancel promise because it has failed already: {}, unnotified cause:", wim, f2);
                    }
                }
            }
        } else {
            Throwable f3 = f.f();
            wim<? super V>[] wimArr3 = this.b;
            int length2 = wimArr3.length;
            while (i < length2) {
                wjm.a(wimArr3[i], f3, wjw);
                i++;
            }
        }
    }
}
