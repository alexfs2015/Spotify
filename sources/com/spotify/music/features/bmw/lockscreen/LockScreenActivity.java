package com.spotify.music.features.bmw.lockscreen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

public class LockScreenActivity extends kf implements b {
    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        LockScreenController.a((Context) this, "lockscreen dismiss button");
    }

    private void f() {
        setContentView(R.layout.activity_lockscreen);
        ImageView imageView = (ImageView) findViewById(R.id.lockscreen_logo);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.lockscreen_dismissible);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.lockscreen_divider);
        View findViewById = findViewById(R.id.lockscreen_dismiss_btn);
        int intExtra = getIntent().getIntExtra("logo_resource_id", -1);
        boolean booleanExtra = getIntent().getBooleanExtra("dismissible_lockscreen", false);
        if (intExtra == -1) {
            imageView.setVisibility(8);
            viewGroup2.setVisibility(8);
        } else {
            Logger.b("Logo resource id: %x", Integer.valueOf(intExtra));
            imageView.setImageResource(intExtra);
            imageView.setVisibility(0);
            viewGroup2.setVisibility(0);
        }
        if (booleanExtra) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
        findViewById.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                LockScreenActivity.this.a(view);
            }
        });
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.CARS_LOCKSCREEN, ViewUris.x.toString());
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        gar.a(this);
        super.onCreate(bundle);
        f();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        f();
    }
}
