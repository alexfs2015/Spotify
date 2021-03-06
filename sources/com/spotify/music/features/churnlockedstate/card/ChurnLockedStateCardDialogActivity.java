package com.spotify.music.features.churnlockedstate.card;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.features.checkout.web.PremiumSignupActivity;
import com.spotify.music.slate.container.view.SlateView;
import com.spotify.music.slate.container.view.SlateView.DisplayMode;
import com.spotify.music.slate.container.view.SlateView.a;

public class ChurnLockedStateCardDialogActivity extends kyd implements b {
    public a g;
    public jsz h;
    public jro i;
    private Button j;
    private Button k;

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(DisplayMode displayMode) {
        return false;
    }

    public final void b(String str) {
    }

    public static Intent a(Context context) {
        return new Intent(context, ChurnLockedStateCardDialogActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g.a((b) this);
        SlateView slateView = new SlateView(this);
        setContentView((View) slateView);
        slateView.a((tyk) new tyk() {
            public final View getSlateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return ChurnLockedStateCardDialogActivity.this.a(layoutInflater, viewGroup);
            }
        });
        slateView.a((a) $$Lambda$ChurnLockedStateCardDialogActivity$AT5HxhJ9Dts5lg9LOkA4ZRmglq8.INSTANCE);
        this.g.a(bundle == null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.g.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.g.d();
    }

    public void onStart() {
        super.onStart();
        this.g.a();
    }

    public void onStop() {
        super.onStop();
        this.g.b();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CHURNLOCK, null);
    }

    public void onBackPressed() {
        this.g.e();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 0) {
            super.onActivityResult(i2, i3, intent);
        } else {
            this.g.a(i3, intent);
        }
    }

    public final void k() {
        a(true);
    }

    public final void l() {
        a(false);
    }

    private void a(boolean z) {
        this.k.setLinksClickable(z);
        this.j.setClickable(z);
    }

    public final void a(String str) {
        startActivityForResult(PremiumSignupActivity.a(this, mbt.g().a(Uri.parse(str)).a(this.i).a()), 0);
    }

    public final void m() {
        finish();
    }

    public final void n() {
        ez.b(this);
    }

    public final void q() {
        this.h.a((int) R.string.error_general_title, 0, new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        rv a = rv.a(layoutInflater.getContext().getResources(), R.drawable.ic_burst_red, layoutInflater.getContext().getTheme());
        View inflate = layoutInflater.inflate(R.layout.activity_churn_locked_card_dialog_content, viewGroup, false);
        inflate.setBackground(a);
        this.j = (Button) inflate.findViewById(R.id.btn_update);
        this.j.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ChurnLockedStateCardDialogActivity.this.b(view);
            }
        });
        this.k = (Button) inflate.findViewById(R.id.btn_downgrade);
        this.k.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ChurnLockedStateCardDialogActivity.this.a(view);
            }
        });
        return inflate;
    }
}
