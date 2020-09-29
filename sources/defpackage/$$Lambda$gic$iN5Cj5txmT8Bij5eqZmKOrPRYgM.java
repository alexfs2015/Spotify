package defpackage;

import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$gic$iN5Cj5txmT8Bij5eqZmKOrPRYgM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$gic$iN5Cj5txmT8Bij5eqZmKOrPRYgM implements Function {
    private final /* synthetic */ gif f$0;
    private final /* synthetic */ gie f$1;

    public /* synthetic */ $$Lambda$gic$iN5Cj5txmT8Bij5eqZmKOrPRYgM(gif gif, gie gie) {
        this.f$0 = gif;
        this.f$1 = gie;
    }

    public final Object apply(Object obj) {
        return this.f$0.b(((a) obj).a).d(10, TimeUnit.SECONDS, Schedulers.a()).c((Function<? super T, ? extends R>) new $$Lambda$gic$683rgGCxqozBY6s_ufcwf5OexZY<Object,Object>(this.f$1)).e((Function<? super Throwable, ? extends T>) $$Lambda$gic$jnk0TSRpGNAWRhO1m3fvFeCkVaw.INSTANCE);
    }
}
