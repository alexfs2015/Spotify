package defpackage;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Collections;

/* renamed from: koe reason: default package */
public final class koe {
    public final hxf a;

    public koe(hxf hxf) {
        this.a = hxf;
    }

    public final Disposable a(String str, String str2) {
        return this.a.a(str, str2, 0, Collections.emptyMap()).a((Action) new $$Lambda$koe$5ILXwNMzAY_2wJ_1wXFLYsMmAFU(str), (Consumer<? super Throwable>) new $$Lambda$koe$dTqRL_NGiLu4VrGii4CtdtZSA<Object>(str));
    }
}
