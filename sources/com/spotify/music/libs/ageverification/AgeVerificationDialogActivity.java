package com.spotify.music.libs.ageverification;

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
import com.spotify.music.slate.container.view.card.CardInteractionHandler.b;
import com.squareup.picasso.Picasso;

public class AgeVerificationDialogActivity extends kyd {
    public Picasso g;

    public static Intent a(Context context, tzd tzd) {
        Intent intent = new Intent(context, AgeVerificationDialogActivity.class);
        intent.putExtra("VIEW_MODEL", tzd);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() != null) {
            String str = "VIEW_MODEL";
            if (getIntent().getExtras().getParcelable(str) != null) {
                rns rns = new rns((rnt) ((tzd) fay.a(getIntent().getExtras().getParcelable(str))).a(), this.g);
                SlateView slateView = new SlateView(this);
                setContentView((View) slateView);
                slateView.a((tyk) rns);
                slateView.b(new tyl() {
                    public final View getView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        return AgeVerificationDialogActivity.this.a(layoutInflater, viewGroup);
                    }
                });
                slateView.a((tyl) $$Lambda$AgeVerificationDialogActivity$dXfkIFbI55ux_B38EYPqFRanxE.INSTANCE);
                slateView.a = new b() {
                    public final void a(SwipeDirection swipeDirection) {
                        super.a(swipeDirection);
                        AgeVerificationDialogActivity.this.setResult(0);
                        AgeVerificationDialogActivity.this.finish();
                    }
                };
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.slate_modal_dismiss, viewGroup, false);
        tze.a((int) R.string.age_verification_dialog_cancel_button).a((TextView) inflate.findViewById(R.id.negative_action));
        inflate.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                AgeVerificationDialogActivity.this.a(view);
            }
        });
        return inflate;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        setResult(0);
        finish();
    }
}
