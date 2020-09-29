package defpackage;

import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* renamed from: tdp reason: default package */
public final class tdp {
    public static Flowable<Boolean> a(PeekScrollView peekScrollView) {
        return peekScrollView.b.c((Function<? super T, ? extends R>) $$Lambda$tdp$fVXiu1L_MDlS6HWyLT1YDNsCDiI.INSTANCE).c((xfk<? extends T>) Flowable.a((Callable<? extends xfk<? extends T>>) new $$Lambda$tdp$ixw06cSImXaT3feQhWv1Wfqu4jk<Object>(peekScrollView))).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(tds tds) {
        return Boolean.valueOf(tds.a() > 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xfk b(PeekScrollView peekScrollView) {
        return Flowable.b(Boolean.valueOf(peekScrollView.getScrollY() > 0));
    }
}
