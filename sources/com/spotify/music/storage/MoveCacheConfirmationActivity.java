package com.spotify.music.storage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.R;
import com.spotify.paste.widgets.DialogLayout;

public class MoveCacheConfirmationActivity extends kyd {
    public static Intent a(Context context, String str, long j) {
        Intent intent = new Intent(context, MoveCacheConfirmationActivity.class);
        intent.addFlags(1073741824);
        intent.addFlags(65536);
        intent.putExtra("volume", str);
        intent.putExtra("estimated-size", j);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DialogLayout dialogLayout = new DialogLayout(this);
        String stringExtra = getIntent().getStringExtra("volume");
        long longExtra = getIntent().getLongExtra("estimated-size", 0);
        dialogLayout.a((int) R.string.cache_migration_confirmation_title);
        dialogLayout.b((int) R.string.cache_migration_confirmation_body);
        dialogLayout.b((int) R.string.two_button_dialog_button_cancel, (OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                MoveCacheConfirmationActivity.this.a(view);
            }
        });
        dialogLayout.a((int) R.string.two_button_dialog_button_ok, (OnClickListener) new OnClickListener(stringExtra, longExtra) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                MoveCacheConfirmationActivity.this.a(this.f$1, this.f$2, view);
            }
        });
        setContentView((View) dialogLayout);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, long j, View view) {
        CacheMovingIntentService.a(this, str, j);
        finish();
    }
}
