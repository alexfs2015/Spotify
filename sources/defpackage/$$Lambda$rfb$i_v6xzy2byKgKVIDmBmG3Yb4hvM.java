package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering.a;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$rfb$i_v6xzy2byKgKVIDmBmG3Yb4hvM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rfb$i_v6xzy2byKgKVIDmBmG3Yb4hvM implements Consumer {
    private final /* synthetic */ MusicPagesFiltering f$0;

    public /* synthetic */ $$Lambda$rfb$i_v6xzy2byKgKVIDmBmG3Yb4hvM(MusicPagesFiltering musicPagesFiltering) {
        this.f$0 = musicPagesFiltering;
    }

    public final void accept(Object obj) {
        this.f$0.a.onNext(a.a(((au) obj).a, ((au) obj).b, ((au) obj).c));
    }
}
