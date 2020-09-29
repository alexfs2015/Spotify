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

public class SlateModalActivity extends kyd {
    public tzd g;
    public tyk h;
    private SlateView i;
    /* access modifiers changed from: private */
    public View j;
    /* access modifiers changed from: private */
    public View k;

    public static Intent a(Context context, tzd tzd) {
        Intent intent = new Intent(context, SlateModalActivity.class);
        intent.putExtra("VIEW_MODEL", tzd);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = new SlateView(this);
        setContentView((View) this.i);
        this.i.b(new tyl() {
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
        this.i.a((tyl) new tyl() {
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

            public final void aE_() {
                super.aE_();
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

    public void onBackPressed() {
        c(103);
    }

    public final rdh af() {
        return rdh.a((a) $$Lambda$a_JKwbN_LaW_B044fpPSmnsTc3s.INSTANCE);
    }

    /* access modifiers changed from: private */
    public void c(int i2) {
        setResult(i2);
        finish();
    }
}
