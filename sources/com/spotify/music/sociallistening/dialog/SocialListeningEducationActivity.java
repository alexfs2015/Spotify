package com.spotify.music.sociallistening.dialog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.music.slate.container.view.SlateView;
import com.spotify.music.slate.container.view.card.CardInteractionHandler.SwipeDirection;
import com.spotify.music.slate.container.view.card.CardInteractionHandler.a;

public class SocialListeningEducationActivity extends lbm implements ulf {
    private String g;
    private boolean h;

    public static Intent a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SocialListeningEducationActivity.class);
        intent.putExtra("display-name", str);
        intent.putExtra("is-host", z);
        return intent;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        finish();
    }

    public final rmf af() {
        return rmf.a((a) $$Lambda$5JnqsmF88CWdagIIy23hpGYUUs8.INSTANCE);
    }

    public View getSlateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.education_dialog, viewGroup, false);
        if (this.h) {
            str = getResources().getString(R.string.social_listening_education_dialog_title_host, new Object[]{this.g});
        } else {
            str = getResources().getString(R.string.social_listening_education_dialog_title_participant, new Object[]{this.g});
        }
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        inflate.findViewById(R.id.confirm_button).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                SocialListeningEducationActivity.this.a(view);
            }
        });
        return inflate;
    }

    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = getIntent().getStringExtra("display-name");
        this.h = getIntent().getBooleanExtra("is-host", false);
        SlateView slateView = new SlateView(this);
        setContentView((View) slateView);
        slateView.a((ulf) this);
        slateView.a((ulg) $$Lambda$SocialListeningEducationActivity$qDNThROCyhaDshBBmqqdOgIEI1Y.INSTANCE);
        slateView.a = new a() {
            public final void a(double d, float f, SwipeDirection swipeDirection) {
            }

            public final void a(SwipeDirection swipeDirection) {
                SocialListeningEducationActivity.this.finish();
            }

            public final void aC_() {
            }

            public final void b() {
            }
        };
    }
}
