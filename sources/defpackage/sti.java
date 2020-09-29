package defpackage;

import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* renamed from: sti reason: default package */
public final class sti {
    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(stl stl) {
        return Boolean.valueOf(stl.a() > 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wrf b(PeekScrollView peekScrollView) {
        return Flowable.b(Boolean.valueOf(peekScrollView.getScrollY() > 0));
    }

    public static Flowable<Boolean> a(PeekScrollView peekScrollView) {
        return peekScrollView.b.c((Function<? super T, ? extends R>) $$Lambda$sti$tmxXpLmuafkfVlqLfBX9Lx8qsao.INSTANCE).c((wrf<? extends T>) Flowable.a((Callable<? extends wrf<? extends T>>) new $$Lambda$sti$kTcUqDR0c_Qi6DOHZV9GsSBiK0<Object>(peekScrollView))).a(Functions.a());
    }
}
