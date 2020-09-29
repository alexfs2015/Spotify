package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: -$$Lambda$qts$6S_r1ElRqgwrbXEfFiuG9b0yG9w reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qts$6S_r1ElRqgwrbXEfFiuG9b0yG9w implements OnClickListener {
    private final /* synthetic */ qts f$0;
    private final /* synthetic */ MusicItem f$1;
    private final /* synthetic */ int f$2;

    public /* synthetic */ $$Lambda$qts$6S_r1ElRqgwrbXEfFiuG9b0yG9w(qts qts, MusicItem musicItem, int i) {
        this.f$0 = qts;
        this.f$1 = musicItem;
        this.f$2 = i;
    }

    public final void onClick(View view) {
        this.f$0.c(this.f$1, this.f$2, view);
    }
}
