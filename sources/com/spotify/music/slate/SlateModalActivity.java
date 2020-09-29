package com.spotify.music.slate;

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

public class SlateModalActivity extends lbm {
    public uly g;
    public ulf h;
    private SlateView i;
    /* access modifiers changed from: private */
    public View j;
    /* access modifiers changed from: private */
    public View k;

    public static Intent a(Context context, uly uly) {
        Intent intent = new Intent(context, SlateModalActivity.class);
        intent.putExtra("VIEW_MODEL", uly);
        return intent;
    }

    /* access modifiers changed from: private */
    public void c(int i2) {
        setResult(i2);
        finish();
    }

    public final rmf af() {
        return rmf.a((a) $$Lambda$5JnqsmF88CWdagIIy23hpGYUUs8.INSTANCE);
    }

    public void onBackPressed() {
        c(103);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = new SlateView(this);
        setContentView((View) this.i);
        this.i.b(new ulg() {
            public final View getView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                SlateModalActivity.this.j = layoutInflater.inflate(R.layout.slate_modal_dismiss, viewGroup, false);
                SlateModalActivity.this.g.b().a((TextView) SlateModalActivity.this.j.findViewById(R.id.negative_action));
                SlateModalActivity.this.j.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        SlateModalActivity.this.c(102);
                    }
                });
                return SlateModalActivity.this.j;
            }
        });
        this.i.a((ulg) new ulg() {
            public final View getView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                SlateModalActivity.this.k = layoutInflater.inflate(R.layout.slate_header_spotify_icon, viewGroup, false);
                return SlateModalActivity.this.k;
            }
        });
        this.i.a(this.h);
        this.i.a = new b() {
            public final void a(SwipeDirection swipeDirection) {
                super.a(swipeDirection);
                SlateModalActivity.this.c(103);
            }

            public final void aC_() {
                super.aC_();
                SlateModalActivity.this.k.setVisibility(8);
                SlateModalActivity.this.j.setVisibility(8);
            }

            public final void b() {
                super.b();
                SlateModalActivity.this.k.setVisibility(0);
                SlateModalActivity.this.j.setVisibility(0);
            }
        };
    }
}
