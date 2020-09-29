package defpackage;

import android.content.res.Resources;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* renamed from: ssy reason: default package */
public final class ssy {
    private final Flowable<ImmutableList<NowPlayingWidget>> a;
    private final urh b = urh.a(0, 0);
    private final urh c;

    public ssy(Flowable<ImmutableList<NowPlayingWidget>> flowable, Resources resources) {
        this.a = flowable;
        this.c = urh.a(0, resources.getDimensionPixelSize(R.dimen.peek_height));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ urh a(ImmutableList immutableList) {
        return immutableList.isEmpty() ? this.b : this.c;
    }

    public final Flowable<urh> a() {
        return this.a.c((Function<? super T, ? extends R>) new $$Lambda$ssy$3nRciN8czio2efXu22lOYou962U<Object,Object>(this));
    }
}
