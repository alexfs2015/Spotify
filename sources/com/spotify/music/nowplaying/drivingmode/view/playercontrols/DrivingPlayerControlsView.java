package com.spotify.music.nowplaying.drivingmode.view.playercontrols;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.spotify.music.R;

public class DrivingPlayerControlsView extends RelativeLayout implements tfm {
    private View a;
    private View b;
    private View c;

    public DrivingPlayerControlsView(Context context) {
        super(context);
        d();
    }

    public DrivingPlayerControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public DrivingPlayerControlsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
    }

    private void d() {
        View inflate = inflate(getContext(), R.layout.driving_player_controls, this);
        this.a = inflate.findViewById(R.id.player_controls_music);
        this.b = inflate.findViewById(R.id.player_controls_podcast);
        this.c = inflate.findViewById(R.id.player_controls_ads);
    }

    public final void a() {
        this.a.setVisibility(4);
        this.b.setVisibility(0);
        this.c.setVisibility(4);
    }

    public final void b() {
        this.a.setVisibility(0);
        this.b.setVisibility(4);
        this.c.setVisibility(4);
    }

    public final void c() {
        this.a.setVisibility(4);
        this.b.setVisibility(4);
        this.c.setVisibility(0);
    }
}
