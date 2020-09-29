package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.music.R;

public class NotificationWebViewActivity extends lbm {
    public static Intent a(Context context, jva jva) {
        Intent intent = new Intent(context, NotificationWebViewActivity.class);
        intent.setData(AnonymousClass1.a[jva.b.ordinal()] != 32 ? null : Uri.parse(jva.a(2)));
        return intent;
    }

    public void onBackPressed() {
        jra jra = (jra) i().a("notification_webview");
        if (jra == null || !jra.ac_()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_notification_webview);
        if (bundle == null) {
            i().a().a(R.id.fragment_notification_webview, jra.c(), "notification_webview").b();
        }
    }
}
