package defpackage;

import com.google.common.base.Optional;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: -$$Lambda$geq$BVGxwKBtbTq9u_m7nMiXhGXQFow reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$geq$BVGxwKBtbTq9u_m7nMiXhGXQFow implements ObservableOnSubscribe {
    private final /* synthetic */ geq f$0;
    private final /* synthetic */ Optional f$1;

    public /* synthetic */ $$Lambda$geq$BVGxwKBtbTq9u_m7nMiXhGXQFow(geq geq, Optional optional) {
        this.f$0 = geq;
        this.f$1 = optional;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        this.f$0.a(this.f$1, observableEmitter);
    }
}
