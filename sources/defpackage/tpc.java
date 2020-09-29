package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.R;

/* renamed from: tpc reason: default package */
public final class tpc extends ith<PlayerTrack> implements tio {
    private final AppCompatTextView a = ((AppCompatTextView) this.o.findViewById(R.id.driving_track_title));
    private final AppCompatTextView b = ((AppCompatTextView) this.o.findViewById(R.id.driving_track_subtitle));
    private final View c = this.o.findViewById(R.id.driving_track_info_container);
    private final View d = this.o.findViewById(R.id.driving_peek_placeholder);

    public tpc(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        super(layoutInflater.inflate(i, viewGroup, false));
        vgl.a(this.o.getContext(), this.a, 2132017620);
        vgl.a(this.o.getContext(), this.b, 2132017619);
    }

    private void a(AppCompatTextView appCompatTextView) {
        if (TextUtils.isEmpty(appCompatTextView.getText())) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setVisibility(0);
        }
        gaw.a(this.o, new $$Lambda$tpc$AXoD1v1QeerVnAhDAI0w1J_Tw(appCompatTextView), false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(AppCompatTextView appCompatTextView, View view) {
        appCompatTextView.invalidate();
        appCompatTextView.requestLayout();
    }

    public final void A() {
        if (this.c.getVisibility() == 0) {
            this.d.setVisibility(8);
        } else {
            gaw.a(this.d, this.c);
        }
    }

    public final /* synthetic */ void a(Object obj, int i) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        this.a.setText(PlayerTrackUtil.getTitle(playerTrack));
        this.b.setText(PlayerTrackUtil.getArtists(playerTrack));
        a(this.a);
        a(this.b);
        A();
    }

    public final void aQ_() {
        this.c.setVisibility(4);
        this.d.setVisibility(0);
    }
}
