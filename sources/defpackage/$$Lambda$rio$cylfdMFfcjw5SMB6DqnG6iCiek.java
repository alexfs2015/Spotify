package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: -$$Lambda$rio$c-ylfdMFfcjw5SMB6DqnG6iCiek reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rio$cylfdMFfcjw5SMB6DqnG6iCiek implements OnClickListener {
    private final /* synthetic */ rio f$0;
    private final /* synthetic */ MusicItem f$1;
    private final /* synthetic */ int f$2;

    public /* synthetic */ $$Lambda$rio$cylfdMFfcjw5SMB6DqnG6iCiek(rio rio, MusicItem musicItem, int i) {
        this.f$0 = rio;
        this.f$1 = musicItem;
        this.f$2 = i;
    }

    public final void onClick(View view) {
        this.f$0.c(this.f$1, this.f$2, view);
    }
}
