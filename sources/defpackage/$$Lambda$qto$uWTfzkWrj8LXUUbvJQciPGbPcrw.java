package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: -$$Lambda$qto$uWTfzkWrj8LXUUbvJQciPGbPcrw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qto$uWTfzkWrj8LXUUbvJQciPGbPcrw implements OnClickListener {
    private final /* synthetic */ qto f$0;
    private final /* synthetic */ MusicItem f$1;
    private final /* synthetic */ int f$2;

    public /* synthetic */ $$Lambda$qto$uWTfzkWrj8LXUUbvJQciPGbPcrw(qto qto, MusicItem musicItem, int i) {
        this.f$0 = qto;
        this.f$1 = musicItem;
        this.f$2 = i;
    }

    public final void onClick(View view) {
        this.f$0.b(this.f$1, this.f$2, view);
    }
}
