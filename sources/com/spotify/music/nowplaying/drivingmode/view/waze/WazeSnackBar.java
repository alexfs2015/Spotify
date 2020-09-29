package com.spotify.music.nowplaying.drivingmode.view.waze;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.mobile.android.ui.view.snackbar.SnackItem;
import com.spotify.mobile.android.waze.model.WazeBannerModel;

public class WazeSnackBar extends SnackBar implements tgc {
    private kdj e = d();

    public WazeSnackBar(Context context) {
        super(context);
    }

    public WazeSnackBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WazeSnackBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private kdj d() {
        this.e = new kdj(this, "Waze Banner", 0);
        a((SnackItem) this.e);
        return this.e;
    }

    public final void a(WazeBannerModel wazeBannerModel) {
        this.e.a(wazeBannerModel);
    }

    public final void b() {
        setVisibility(0);
    }

    public final void c() {
        setVisibility(8);
    }

    public final void a(kdi kdi) {
        this.e.c = kdi;
    }
}
