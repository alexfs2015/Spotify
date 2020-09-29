package com.spotify.mobile.android.spotlets.waze;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.slate.container.view.SlateView;
import com.spotify.music.slate.container.view.card.CardInteractionHandler.SwipeDirection;
import com.spotify.music.slate.container.view.card.CardInteractionHandler.a;

public class WazeOptOutDialogActivity extends kyd implements tyk {
    public kda g;
    public kdl h;
    private SlateView i;
    private View j;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = new SlateView(this);
        setContentView((View) this.i);
        this.i.b(new tyl() {
            public final View getView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return WazeOptOutDialogActivity.this.a(layoutInflater, viewGroup);
            }
        });
        this.i.a((tyk) this);
        this.i.a = new a() {
            public final void a(double d, float f, SwipeDirection swipeDirection) {
            }

            public final void aE_() {
            }

            public final void b() {
            }

            public final void a(SwipeDirection swipeDirection) {
                WazeOptOutDialogActivity.this.finish();
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.j = layoutInflater.inflate(R.layout.activity_waze_dismiss, viewGroup, false);
        this.j.findViewById(R.id.not_now_button).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                WazeOptOutDialogActivity.this.b(view);
            }
        });
        return this.j;
    }

    public View getSlateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.activity_waze_optout, viewGroup, false);
        inflate.findViewById(R.id.confirm_button).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                WazeOptOutDialogActivity.this.a(view);
            }
        });
        return inflate;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CARS_WAZE, ViewUris.z.toString());
    }

    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.h.b(false);
        this.g.b();
        finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        finish();
    }
}
