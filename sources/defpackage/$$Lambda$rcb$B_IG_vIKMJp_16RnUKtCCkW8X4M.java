package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: -$$Lambda$rcb$B_IG_vIKMJp_16RnUKtCCkW8X4M reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rcb$B_IG_vIKMJp_16RnUKtCCkW8X4M implements OnClickListener {
    private final /* synthetic */ rcb f$0;
    private final /* synthetic */ MusicItem f$1;
    private final /* synthetic */ int f$2;

    public /* synthetic */ $$Lambda$rcb$B_IG_vIKMJp_16RnUKtCCkW8X4M(rcb rcb, MusicItem musicItem, int i) {
        this.f$0 = rcb;
        this.f$1 = musicItem;
        this.f$2 = i;
    }

    public final void onClick(View view) {
        this.f$0.a(this.f$1, this.f$2, view);
    }
}
