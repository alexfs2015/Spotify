package com.spotify.music.features.trackcredits;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;

public class TrackCreditsActivity extends lbm {
    public qvo g;

    public static Intent a(Context context, fqn fqn, String str) {
        Intent intent = new Intent(context, TrackCreditsActivity.class);
        fqo.a(intent, fqn);
        intent.putExtra("trackUri", str);
        return intent;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.TRACK_CREDITS_CREDITS, null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qvq qvq = new qvq(getLayoutInflater(), this.g);
        setContentView(qvq.a());
        qvo qvo = this.g;
        qvo.a = qvq;
        qvo.c();
    }
}
