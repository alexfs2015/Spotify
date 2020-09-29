package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.music.R;

public class NotificationWebViewActivity extends kyd {
    public static Intent a(Context context, jst jst) {
        Uri uri;
        Intent intent = new Intent(context, NotificationWebViewActivity.class);
        if (AnonymousClass1.a[jst.b.ordinal()] != 32) {
            uri = null;
        } else {
            uri = Uri.parse(jst.a(2));
        }
        intent.setData(uri);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_notification_webview);
        if (bundle == null) {
            i().a().a(R.id.fragment_notification_webview, joo.c(), "notification_webview").b();
        }
    }

    public void onBackPressed() {
        joo joo = (joo) i().a("notification_webview");
        if (joo == null || !joo.ac_()) {
            super.onBackPressed();
        }
    }
}
