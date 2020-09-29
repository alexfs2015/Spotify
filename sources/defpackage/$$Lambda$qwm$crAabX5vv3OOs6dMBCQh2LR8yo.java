package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering.a;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qwm$crAabX5-vv3OOs6dMBCQh2LR8yo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qwm$crAabX5vv3OOs6dMBCQh2LR8yo implements Consumer {
    private final /* synthetic */ MusicPagesFiltering f$0;

    public /* synthetic */ $$Lambda$qwm$crAabX5vv3OOs6dMBCQh2LR8yo(MusicPagesFiltering musicPagesFiltering) {
        this.f$0 = musicPagesFiltering;
    }

    public final void accept(Object obj) {
        this.f$0.a.onNext(a.a(((au) obj).a, ((au) obj).b, ((au) obj).c));
    }
}
