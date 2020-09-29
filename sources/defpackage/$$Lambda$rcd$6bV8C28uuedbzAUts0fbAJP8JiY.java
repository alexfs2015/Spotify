package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: -$$Lambda$rcd$6bV8C28uuedbzAUts0fbAJP8JiY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rcd$6bV8C28uuedbzAUts0fbAJP8JiY implements OnClickListener {
    private final /* synthetic */ rcd f$0;
    private final /* synthetic */ MusicItem f$1;
    private final /* synthetic */ int f$2;

    public /* synthetic */ $$Lambda$rcd$6bV8C28uuedbzAUts0fbAJP8JiY(rcd rcd, MusicItem musicItem, int i) {
        this.f$0 = rcd;
        this.f$1 = musicItem;
        this.f$2 = i;
    }

    public final void onClick(View view) {
        this.f$0.b(this.f$1, this.f$2, view);
    }
}
