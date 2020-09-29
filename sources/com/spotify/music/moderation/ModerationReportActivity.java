package com.spotify.music.moderation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.music.R;

public class ModerationReportActivity extends kyd {
    public static Intent a(Context context, soj soj) {
        Intent intent = new Intent(context, ModerationReportActivity.class);
        intent.putExtra("moderation-view-config", soj);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_moderation);
        String str = "moderation_fragment";
        if (!(i().a(str) != null)) {
            i().a().a(R.id.activity_moderation_layout, sof.a((soj) getIntent().getParcelableExtra("moderation-view-config")), str).b();
        }
    }

    public void onBackPressed() {
        sof sof = (sof) i().a("moderation_fragment");
        if (sof != null) {
            sof.b.a();
        } else {
            super.onBackPressed();
        }
    }
}
