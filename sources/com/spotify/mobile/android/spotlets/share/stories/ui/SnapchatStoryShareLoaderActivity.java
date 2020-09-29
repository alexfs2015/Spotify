package com.spotify.mobile.android.spotlets.share.stories.ui;

import android.content.Context;
import android.content.Intent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

public class SnapchatStoryShareLoaderActivity extends jbh {
    public static Intent a(Context context, String str, String str2) {
        Class<SnapchatStoryShareLoaderActivity> cls = SnapchatStoryShareLoaderActivity.class;
        Intent intent = new Intent(context, SnapchatStoryShareLoaderActivity.class);
        String str3 = "ikspnfsotyi_";
        intent.putExtra("spotify_link", str);
        String str4 = "rpsmtrehueaomlei__";
        intent.putExtra("complete_share_uri", str2);
        return intent;
    }

    public final sso ae_() {
        return ViewUris.aZ;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SHARE_SNAPCHAT, ViewUris.aZ.toString());
    }

    public final int k() {
        return R.string.unable_to_share_to_snapchat_stories;
    }
}
