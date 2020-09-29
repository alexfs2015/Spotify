package com.spotify.music.features.pinpairing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.music.R;

public class PinPairingActivity extends lbm {
    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, PinPairingActivity.class);
        intent.putExtra("url", str);
        return intent;
    }

    private ojr k() {
        return (ojr) i().a("fragment");
    }

    public void onBackPressed() {
        ojr k = k();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_pin_pairing);
        if (k() == null) {
            i().a().a(R.id.container_pin_pairing, ojr.c(getIntent().getStringExtra("url")), "fragment").b();
        }
    }
}
