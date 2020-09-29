package defpackage;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Collections;

/* renamed from: krn reason: default package */
public final class krn {
    public final hzr a;

    public krn(hzr hzr) {
        this.a = hzr;
    }

    public final Disposable a(String str, String str2) {
        return this.a.a(str, str2, 0, Collections.emptyMap()).a((Action) new $$Lambda$krn$w6I8gDYjuiI3vGwMWbXO2PDzt3o(str), (Consumer<? super Throwable>) new $$Lambda$krn$poNiPuVeXbfE4hfhFhiB5DaNZU<Object>(str));
    }
}
