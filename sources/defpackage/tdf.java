package defpackage;

import android.content.res.Resources;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* renamed from: tdf reason: default package */
public final class tdf {
    private final Flowable<ImmutableList<NowPlayingWidget>> a;
    private final vcm b = vcm.a(0, 0);
    private final vcm c;

    public tdf(Flowable<ImmutableList<NowPlayingWidget>> flowable, Resources resources) {
        this.a = flowable;
        this.c = vcm.a(0, resources.getDimensionPixelSize(R.dimen.peek_height));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ vcm a(ImmutableList immutableList) {
        return immutableList.isEmpty() ? this.b : this.c;
    }

    public final Flowable<vcm> a() {
        return this.a.c((Function<? super T, ? extends R>) new $$Lambda$tdf$6AVk0yPj19pHPyi_td6CJVFme4<Object,Object>(this));
    }
}
