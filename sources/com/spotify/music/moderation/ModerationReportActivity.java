package com.spotify.music.moderation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.music.R;

public class ModerationReportActivity extends lbm {
    public static Intent a(Context context, syq syq) {
        Intent intent = new Intent(context, ModerationReportActivity.class);
        intent.putExtra("moderation-view-config", syq);
        return intent;
    }

    public void onBackPressed() {
        sym sym = (sym) i().a("moderation_fragment");
        if (sym != null) {
            sym.b.a();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_moderation);
        String str = "moderation_fragment";
        if (!(i().a(str) != null)) {
            i().a().a(R.id.activity_moderation_layout, sym.a((syq) getIntent().getParcelableExtra("moderation-view-config")), str).b();
        }
    }
}
