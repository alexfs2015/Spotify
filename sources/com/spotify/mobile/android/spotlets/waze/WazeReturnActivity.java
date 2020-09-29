package com.spotify.mobile.android.spotlets.waze;

import android.content.Intent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.MainActivity;
import com.spotify.music.libs.viewuri.ViewUris;

public class WazeReturnActivity extends lbm {
    public sfa g;

    public final rmf af() {
        return rmf.a(PageIdentifiers.CARS_WAZE, ViewUris.A.toString());
    }

    public void onResume() {
        super.onResume();
        this.g.a(ViewUris.A.toString());
        if (!(!isTaskRoot())) {
            Class<MainActivity> cls = MainActivity.class;
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(268435456);
            startActivity(intent);
        }
        finish();
    }
}
