package defpackage;

import com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qls$mtUaUPi2aKJEgSWiwFa7JAghxVo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qls$mtUaUPi2aKJEgSWiwFa7JAghxVo implements Consumer {
    private final /* synthetic */ qls f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$qls$mtUaUPi2aKJEgSWiwFa7JAghxVo(qls qls, String str) {
        this.f$0 = qls;
        this.f$1 = str;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (ArtistSearchResponse) obj);
    }
}
