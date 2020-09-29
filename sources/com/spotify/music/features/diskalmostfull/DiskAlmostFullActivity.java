package com.spotify.music.features.diskalmostfull;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.paste.widgets.DialogLayout;

public class DiskAlmostFullActivity extends kyd {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DialogLayout dialogLayout = new DialogLayout(this);
        setContentView((View) dialogLayout);
        dialogLayout.a((int) R.string.disk_almost_full_title);
        dialogLayout.b((int) R.string.disk_almost_full_message);
        dialogLayout.a((int) R.string.disk_almost_full_ok, (OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                DiskAlmostFullActivity.this.a(view);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        finish();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.DIALOG_DISKALMOSTFULL, ViewUris.aN.toString());
    }
}
