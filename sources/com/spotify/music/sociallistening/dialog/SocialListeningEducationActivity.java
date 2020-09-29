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

public class SocialListeningEducationActivity extends kyd implements tyk {
    private String g;
    private boolean h;

    public static Intent a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SocialListeningEducationActivity.class);
        intent.putExtra("display-name", str);
        intent.putExtra("is-host", z);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = getIntent().getStringExtra("display-name");
        this.h = getIntent().getBooleanExtra("is-host", false);
        SlateView slateView = new SlateView(this);
        setContentView((View) slateView);
        slateView.a((tyk) this);
        slateView.a((tyl) $$Lambda$SocialListeningEducationActivity$yvxg1S_F9VYuEIS1zy7FOPHiKfs.INSTANCE);
        slateView.a = new a() {
            public final void a(double d, float f, SwipeDirection swipeDirection) {
            }

            public final void aE_() {
            }

            public final void b() {
            }

            public final void a(SwipeDirection swipeDirection) {
                SocialListeningEducationActivity.this.finish();
            }
        };
    }

    public final rdh af() {
        return rdh.a((a) $$Lambda$a_JKwbN_LaW_B044fpPSmnsTc3s.INSTANCE);
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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        finish();
    }
}
