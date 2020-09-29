package com.spotify.mobile.android.spotlets.share.stories.ui;

import android.content.Context;
import android.content.Intent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

public class SnapchatStoryShareLoaderActivity extends iyw {
    public final int k() {
        return R.string.unable_to_share_to_snapchat_stories;
    }

    public static Intent a(Context context, String str, String str2) {
        Intent intent = new Intent(context, SnapchatStoryShareLoaderActivity.class);
        intent.putExtra("spotify_link", str);
        intent.putExtra("complete_share_uri", str2);
        return intent;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SHARE_SNAPCHAT, ViewUris.ba.toString());
    }

    public final sih ae_() {
        return ViewUris.ba;
    }
}
