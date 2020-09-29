package com.spotify.music.sociallistening.dialog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

public class SocialListeningSessionEndedActivity extends kyd {
    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, SocialListeningSessionEndedActivity.class);
        if (str != null) {
            intent.putExtra("host-display-name", str);
        }
        return intent;
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.session_ended_dialog);
        String stringExtra = getIntent().getStringExtra("host-display-name");
        if (stringExtra != null) {
            str = getResources().getString(R.string.social_listening_session_ended_dialog_title_containing_host_name, new Object[]{stringExtra});
        } else {
            str = getResources().getString(R.string.social_listening_session_ended_dialog_title);
        }
        ((TextView) findViewById(R.id.title)).setText(str);
        ((Button) findViewById(R.id.confirm_button)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                SocialListeningSessionEndedActivity.this.a(view);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        finish();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SOCIAL_LISTENING_ENDSESSIONDIALOG, null);
    }
}
