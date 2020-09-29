package com.spotify.mobile.android.spotlets.waze;

import android.content.Intent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.MainActivity;
import com.spotify.music.libs.viewuri.ViewUris;

public class WazeReturnActivity extends kyd {
    public rvq g;

    public void onResume() {
        super.onResume();
        this.g.a(ViewUris.B.toString());
        if (!(!isTaskRoot())) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(268435456);
            startActivity(intent);
        }
        finish();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CARS_WAZE, ViewUris.B.toString());
    }
}
