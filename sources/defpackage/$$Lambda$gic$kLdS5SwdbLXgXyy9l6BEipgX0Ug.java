package defpackage;

import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$gic$kLdS5SwdbLXgXyy9l6BEipgX0Ug reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$gic$kLdS5SwdbLXgXyy9l6BEipgX0Ug implements Function {
    private final /* synthetic */ gif f$0;

    public /* synthetic */ $$Lambda$gic$kLdS5SwdbLXgXyy9l6BEipgX0Ug(gif gif) {
        this.f$0 = gif;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(((c) obj).a).d(10, TimeUnit.SECONDS, Schedulers.a()).c((Function<? super T, ? extends R>) $$Lambda$gic$Eg8VvQmUwX5uYrBzeDLfGnchMYU.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$gic$3xeE0jn8Sd_FjuQnOIJOpgrx0E.INSTANCE);
    }
}
