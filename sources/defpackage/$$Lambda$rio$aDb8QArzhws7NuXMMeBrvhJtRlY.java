package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: -$$Lambda$rio$aDb8QArzhws7NuXMMeBrvhJtRlY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rio$aDb8QArzhws7NuXMMeBrvhJtRlY implements OnClickListener {
    private final /* synthetic */ rio f$0;
    private final /* synthetic */ MusicItem f$1;
    private final /* synthetic */ int f$2;

    public /* synthetic */ $$Lambda$rio$aDb8QArzhws7NuXMMeBrvhJtRlY(rio rio, MusicItem musicItem, int i) {
        this.f$0 = rio;
        this.f$1 = musicItem;
        this.f$2 = i;
    }

    public final void onClick(View view) {
        this.f$0.d(this.f$1, this.f$2, view);
    }
}
