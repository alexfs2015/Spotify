package com.spotify.music.features.churnlockedstate;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.features.checkout.web.PremiumSignupActivity;

public class ChurnLockedStateActivity extends lbm implements b {
    public a g;
    public jty h;
    private Button i;
    private TextView j;

    public static Intent a(Context context) {
        return new Intent(context, ChurnLockedStateActivity.class);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.g.c();
    }

    private void a(String str, int i2) {
        startActivityForResult(PremiumSignupActivity.a(this, mfw.g().a(Uri.parse(str)).a(getString(i2)).a(this.h).a()), 0);
    }

    private void a(boolean z) {
        this.j.setLinksClickable(z);
        this.i.setClickable(z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean c(String str) {
        this.g.d();
        return true;
    }

    public final void a(String str) {
        a(str, R.string.churn_locked_state_action);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.CHURNLOCK, null);
    }

    public final void b(String str) {
        a(str, R.string.churn_locked_state_cancel_title);
    }

    public final void k() {
        a(true);
    }

    public final void l() {
        a(false);
    }

    public final void m() {
        super.onBackPressed();
    }

    public final void n() {
        ez.b(this);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 0) {
            super.onActivityResult(i2, i3, intent);
        } else {
            this.g.a(i3, intent);
        }
    }

    public void onBackPressed() {
        this.g.e();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g.a((b) this);
        setContentView((int) R.layout.activity_churn_locked_state);
        this.i = (Button) findViewById(R.id.update_payment_button);
        this.i.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ChurnLockedStateActivity.this.a(view);
            }
        });
        this.j = (TextView) findViewById(R.id.cancel_text);
        TextView textView = this.j;
        boolean z = true;
        Spannable spannable = (Spannable) jug.a(getString(R.string.churn_locked_state_cancel, new Object[]{""}));
        juh.a(spannable, new a() {
            public final boolean onClick(String str) {
                return ChurnLockedStateActivity.this.c(str);
            }
        });
        textView.setText(spannable);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        a aVar = this.g;
        if (bundle != null) {
            z = false;
        }
        aVar.a(z);
    }

    public void onStart() {
        super.onStart();
        this.g.a();
    }

    public void onStop() {
        this.g.b();
        super.onStop();
    }

    public final void q() {
    }
}
