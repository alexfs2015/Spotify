package com.spotify.mobile.android.spotlets.share.facebook;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

public class MessengerShareActivity extends lbm {
    public izt g;

    public static Intent a(Context context, izp izp) {
        Class<MessengerShareActivity> cls = MessengerShareActivity.class;
        Intent intent = new Intent(context, MessengerShareActivity.class);
        String str = "E_sErQeUht.sRxreUIS.aNaA";
        intent.putExtra("share.extra.UNIQUE_SHARE", izp);
        return intent;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SHARE_MESSENGER, null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.story_share_loader_layout);
        String str = "exemr.UERaUAsrHE.NhIa_tS";
        izt.a(R.string.play_on_spotify, Uri.parse(((izp) getIntent().getParcelableExtra("share.extra.UNIQUE_SHARE")).a()), this);
        finish();
    }
}
