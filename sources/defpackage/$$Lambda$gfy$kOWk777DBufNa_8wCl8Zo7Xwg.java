package defpackage;

import io.reactivex.Completable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: -$$Lambda$gfy$kOWk7-77-DBufNa_8wCl8Zo7Xwg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$gfy$kOWk777DBufNa_8wCl8Zo7Xwg implements Function {
    private final /* synthetic */ Runnable f$0;

    public /* synthetic */ $$Lambda$gfy$kOWk777DBufNa_8wCl8Zo7Xwg(Runnable runnable) {
        this.f$0 = runnable;
    }

    public final Object apply(Object obj) {
        return Completable.a(this.f$0).a(Functions.c());
    }
}
