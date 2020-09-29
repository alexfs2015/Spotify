package com.spotify.music.spotlets.apprater;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

public class AppRaterActivity extends lbm {
    public jty g;

    public static Intent a(Context context) {
        return new Intent(context, AppRaterActivity.class);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent, View view) {
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        finish();
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.APPRATER, ViewUris.bN.toString());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.app_rater_dialog);
        setResult(-1);
        findViewById(R.id.app_rater_dialog_button_accept).setOnClickListener(new OnClickListener(new Intent("android.intent.action.VIEW", this.g.h())) {
            private final /* synthetic */ Intent f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                AppRaterActivity.this.a(this.f$1, view);
            }
        });
        findViewById(R.id.app_rater_dialog_button_dismiss).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                AppRaterActivity.this.a(view);
            }
        });
    }
}
