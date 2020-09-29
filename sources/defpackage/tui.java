package defpackage;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/* renamed from: tui reason: default package */
public final class tui {
    public static <T> Observable<vez<T>> a(Single<T> single) {
        return single.d().c((Function<? super T, ? extends R>) $$Lambda$eJw7FVahVjQFbcJQe2whla0zDao.INSTANCE).e(vez.a()).e((Function<? super Throwable, ? extends T>) $$Lambda$JUHqC8tMkVs95PRsfo1PcS6UVno.INSTANCE);
    }
}
