package com.spotify.mobile.android.spotlets.share.stories.ui;

import android.content.Context;
import android.content.Intent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

public class FacebookStoryShareLoaderActivity extends jbh {
    public static Intent a(Context context, String str, String str2) {
        Intent intent = new Intent(context, FacebookStoryShareLoaderActivity.class);
        String str3 = "o_sfysnitlip";
        intent.putExtra("spotify_link", str);
        String str4 = "eepm_ulctamo_hirre";
        intent.putExtra("complete_share_uri", str2);
        return intent;
    }

    public final sso ae_() {
        return ViewUris.aX;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SHARE_FACEBOOK, ViewUris.aX.toString());
    }

    public final int k() {
        return R.string.unable_to_share_to_facebook;
    }
}
