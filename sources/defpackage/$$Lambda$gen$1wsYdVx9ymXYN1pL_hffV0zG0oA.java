package defpackage;

import io.reactivex.Completable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: -$$Lambda$gen$1wsYdVx9ymXYN1pL_hffV0zG0oA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$gen$1wsYdVx9ymXYN1pL_hffV0zG0oA implements Function {
    private final /* synthetic */ Runnable f$0;

    public /* synthetic */ $$Lambda$gen$1wsYdVx9ymXYN1pL_hffV0zG0oA(Runnable runnable) {
        this.f$0 = runnable;
    }

    public final Object apply(Object obj) {
        return Completable.a(this.f$0).a(Functions.c());
    }
}
