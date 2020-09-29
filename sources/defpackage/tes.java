package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.R;

/* renamed from: tes reason: default package */
public final class tes extends iqu<PlayerTrack> implements syh {
    private final AppCompatTextView a = ((AppCompatTextView) this.o.findViewById(R.id.driving_track_title));
    private final AppCompatTextView b = ((AppCompatTextView) this.o.findViewById(R.id.driving_track_subtitle));
    private final View c = this.o.findViewById(R.id.driving_track_info_container);
    private final View d = this.o.findViewById(R.id.driving_peek_placeholder);

    public final /* synthetic */ void a(Object obj, int i) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        this.a.setText(PlayerTrackUtil.getTitle(playerTrack));
        this.b.setText(PlayerTrackUtil.getArtists(playerTrack));
        a(this.a);
        a(this.b);
        z();
    }

    public tes(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        super(layoutInflater.inflate(i, viewGroup, false));
        uuu.a(this.o.getContext(), this.a, 2132017618);
        uuu.a(this.o.getContext(), this.b, 2132017617);
    }

    private void a(AppCompatTextView appCompatTextView) {
        if (TextUtils.isEmpty(appCompatTextView.getText())) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setVisibility(0);
        }
        gac.a(this.o, new $$Lambda$tes$1tZ0b0855V_Mk1XiH1BfNmCyEs(appCompatTextView), false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(AppCompatTextView appCompatTextView, View view) {
        appCompatTextView.invalidate();
        appCompatTextView.requestLayout();
    }

    public final void aS_() {
        this.c.setVisibility(4);
        this.d.setVisibility(0);
    }

    public final void z() {
        if (this.c.getVisibility() == 0) {
            this.d.setVisibility(8);
        } else {
            gac.a(this.d, this.c);
        }
    }
}
