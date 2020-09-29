package com.spotify.music.features.trackcredits;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;

public class TrackCreditsActivity extends kyd {
    public qnf g;

    public static Intent a(Context context, fpt fpt, String str) {
        Intent intent = new Intent(context, TrackCreditsActivity.class);
        fpu.a(intent, fpt);
        intent.putExtra("trackUri", str);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qnh qnh = new qnh(getLayoutInflater(), this.g);
        setContentView(qnh.a());
        qnf qnf = this.g;
        qnf.a = qnh;
        qnf.c();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.TRACK_CREDITS_CREDITS, null);
    }
}
