package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vbi$2L3TiqS0gqlSs4FCTkecJkbMPr8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vbi$2L3TiqS0gqlSs4FCTkecJkbMPr8 implements ObservableTransformer {
    private final /* synthetic */ vav f$0;

    public /* synthetic */ $$Lambda$vbi$2L3TiqS0gqlSs4FCTkecJkbMPr8(vav vav) {
        this.f$0 = vav;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$va8xx3hjeq9EAYDIa8E5JU7bbA.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vbi$REsHJGoGgWQEWhjbTobqXIjjZLU<Object,Object>(this.f$0), false);
    }
}
