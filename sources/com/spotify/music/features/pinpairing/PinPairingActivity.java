package com.spotify.music.features.pinpairing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.music.R;

public class PinPairingActivity extends kyd {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_pin_pairing);
        if (k() == null) {
            i().a().a(R.id.container_pin_pairing, ocl.c(getIntent().getStringExtra("url")), "fragment").b();
        }
    }

    public void onBackPressed() {
        ocl k = k();
        super.onBackPressed();
    }

    private ocl k() {
        return (ocl) i().a("fragment");
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, PinPairingActivity.class);
        intent.putExtra("url", str);
        return intent;
    }
}
