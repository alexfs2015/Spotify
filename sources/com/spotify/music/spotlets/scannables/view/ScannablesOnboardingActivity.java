package com.spotify.music.spotlets.scannables.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

public class ScannablesOnboardingActivity extends kyd implements uik {
    public uic g;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_scannables_onboarding);
        this.g.a((uik) this);
        ((Button) findViewById(R.id.btn_cancel)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ScannablesOnboardingActivity.this.g.a();
            }
        });
        ((Button) findViewById(R.id.btn_scan_a_code)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ScannablesOnboardingActivity.this.g.a((Activity) ScannablesOnboardingActivity.this);
            }
        });
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.g.a(i, intent);
    }

    public void onStop() {
        super.onStop();
    }

    public static Intent a(Context context) {
        return new Intent(context, ScannablesOnboardingActivity.class);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SCANNABLES_SCANNER, null);
    }

    public final void c(int i) {
        this.g.a(i);
        setResult(i);
        finish();
    }
}
