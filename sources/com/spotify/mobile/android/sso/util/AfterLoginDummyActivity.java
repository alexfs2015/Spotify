package com.spotify.mobile.android.sso.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class AfterLoginDummyActivity extends Activity {
    public static Intent a(Context context) {
        Intent intent = new Intent(context, AfterLoginDummyActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1082130432);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        finish();
    }
}
