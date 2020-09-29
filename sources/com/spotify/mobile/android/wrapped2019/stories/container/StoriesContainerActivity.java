package com.spotify.mobile.android.wrapped2019.stories.container;

import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

public class StoriesContainerActivity extends kyd implements kdt {
    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.stories_container_activity);
        if (bundle == null) {
            i().a().b(R.id.stories_container_fragment, new kdu(), "stories_hub_fragment").b();
        }
    }

    public final void k() {
        finish();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.WRAPPED_DATASTORIES, null);
    }
}
