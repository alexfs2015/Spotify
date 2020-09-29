package com.spotify.mobile.android.spotlets.share.facebook;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

public class FacebookFeedShareActivity extends lbm {
    public izr g;

    public static Intent a(Context context, izp izp) {
        Class<FacebookFeedShareActivity> cls = FacebookFeedShareActivity.class;
        Intent intent = new Intent(context, FacebookFeedShareActivity.class);
        String str = "sxsAU.RIr.eNEtraah_UeHQE";
        intent.putExtra("share.extra.UNIQUE_SHARE", izp);
        return intent;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SHARE_FACEBOOKFEED, null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.story_share_loader_layout);
        izr.a(this, Uri.parse(((izp) getIntent().getParcelableExtra("share.extra.UNIQUE_SHARE")).a()));
        finish();
    }
}
