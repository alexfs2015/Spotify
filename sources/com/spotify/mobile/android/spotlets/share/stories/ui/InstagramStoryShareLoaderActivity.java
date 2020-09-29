package com.spotify.mobile.android.spotlets.share.stories.ui;

import android.content.Context;
import android.content.Intent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

public class InstagramStoryShareLoaderActivity extends jbh {
    public static Intent a(Context context, String str, String str2) {
        Intent intent = new Intent(context, InstagramStoryShareLoaderActivity.class);
        intent.putExtra("spotify_link", str);
        intent.putExtra("complete_share_uri", str2);
        return intent;
    }

    public final sso ae_() {
        return ViewUris.aY;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SHARE_INSTAGRAM, ViewUris.aY.toString());
    }

    public final int k() {
        return R.string.unable_to_share_to_instagram;
    }
}
