package com.spotify.mobile.android.spotlets.waze;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.slate.container.view.SlateView;
import com.spotify.music.slate.container.view.card.CardInteractionHandler.SwipeDirection;
import com.spotify.music.slate.container.view.card.CardInteractionHandler.a;

public class WazeSlateActivity extends kyd implements tyk {
    public kda g;
    public kdl h;
    private View i;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SlateView slateView = new SlateView(this);
        setContentView((View) slateView);
        slateView.b(new tyl() {
            public final View getView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return WazeSlateActivity.this.a(layoutInflater, viewGroup);
            }
        });
        slateView.a((tyk) this);
        slateView.a = new a() {
            public final void a(double d, float f, SwipeDirection swipeDirection) {
            }

            public final void aE_() {
            }

            public final void b() {
            }

            public final void a(SwipeDirection swipeDirection) {
                WazeSlateActivity.this.k();
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.i = layoutInflater.inflate(R.layout.activity_waze_dismiss, viewGroup, false);
        this.i.findViewById(R.id.not_now_button).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                WazeSlateActivity.this.b(view);
            }
        });
        return this.i;
    }

    /* access modifiers changed from: private */
    public void k() {
        this.h.c(false);
        finish();
    }

    public View getSlateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.activity_waze_onboarding, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.header)).setText(R.string.waze_onboarding_title);
        ((TextView) inflate.findViewById(R.id.connected_text)).setText(R.string.waze_onboarding_body);
        Button button = (Button) inflate.findViewById(R.id.bluetooth_button);
        button.setText(R.string.waze_onboarding_start_driving_mode_label);
        button.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                WazeSlateActivity.this.a(view);
            }
        });
        return inflate;
    }

    public void onBackPressed() {
        this.h.c(false);
        super.onBackPressed();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CARS_WAZE, ViewUris.A.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.h.c(true);
        this.h.b(true);
        if (!this.h.f()) {
            this.g.a(false, "com.spotify.music.internal.service.waze.WAKE_BY_ONBOARDING");
        }
        finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        k();
    }
}
