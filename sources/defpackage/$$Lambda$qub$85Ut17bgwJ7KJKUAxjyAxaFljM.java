package defpackage;

import com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qub$85Ut17bgwJ7KJKUAxjyA-xaFljM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qub$85Ut17bgwJ7KJKUAxjyAxaFljM implements Consumer {
    private final /* synthetic */ qub f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$qub$85Ut17bgwJ7KJKUAxjyAxaFljM(qub qub, String str) {
        this.f$0 = qub;
        this.f$1 = str;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (ArtistSearchResponse) obj);
    }
}
