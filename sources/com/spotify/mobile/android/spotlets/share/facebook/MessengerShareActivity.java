package com.spotify.mobile.android.spotlets.share.facebook;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

public class MessengerShareActivity extends kyd {
    public ixi g;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.story_share_loader_layout);
        ixi.a(R.string.play_on_spotify, Uri.parse(((ixe) getIntent().getParcelableExtra("share.extra.UNIQUE_SHARE")).a()), this);
        finish();
    }

    public static Intent a(Context context, ixe ixe) {
        Intent intent = new Intent(context, MessengerShareActivity.class);
        intent.putExtra("share.extra.UNIQUE_SHARE", ixe);
        return intent;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SHARE_MESSENGER, null);
    }
}
