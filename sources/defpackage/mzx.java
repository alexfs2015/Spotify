package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: mzx reason: default package */
public final class mzx {
    private final mzo a;
    private final wzi<iqn> b;

    public mzx(mzo mzo, wzi<iqn> wzi) {
        this.a = mzo;
        this.b = wzi;
    }

    public final xii<hcs> a(String str) {
        xii a2 = wit.a((ObservableSource<T>) ((iqn) this.b.get()).a(str).a(), BackpressureStrategy.BUFFER);
        mzo mzo = this.a;
        mzo.getClass();
        return a2.e((xiy<? super T, ? extends R>) new $$Lambda$LAVqt3HM3oQ4KHfU5j1R2JxWb4<Object,Object>(mzo));
    }
}
