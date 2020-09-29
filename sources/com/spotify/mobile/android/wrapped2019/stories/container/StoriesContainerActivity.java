package com.spotify.mobile.android.wrapped2019.stories.container;

import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

public class StoriesContainerActivity extends lbm implements kfv {
    public final rmf af() {
        return rmf.a(PageIdentifiers.WRAPPED_DATASTORIES, null);
    }

    public final void k() {
        finish();
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.stories_container_activity);
        if (bundle == null) {
            String str = "ugsrobfram_tsit_ehne";
            i().a().b(R.id.stories_container_fragment, kfw.a(getIntent().getBooleanExtra("useBackend", false)), "stories_hub_fragment").b();
        }
    }
}
