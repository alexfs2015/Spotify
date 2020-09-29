package com.spotify.music.spotlets.scannables.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.MediaStore.Images.Media;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class ScannableActivity extends lbm implements utz {
    public utt g;
    private FrameLayout h;
    private ProgressDialog i;

    public static Intent a(Context context) {
        Intent intent = new Intent(context, ScannableActivity.class);
        intent.putExtra("com.spotify.music.spotlets.scannables.EXTRA_SCAN_ONLY", false);
        intent.putExtra("EXTRA_SOCIAL_LISTENING", true);
        return intent;
    }

    public static Intent a(Context context, boolean z) {
        Intent intent = new Intent(context, ScannableActivity.class);
        intent.putExtra("com.spotify.music.spotlets.scannables.EXTRA_SCAN_ONLY", false);
        return intent;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.g.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        setResult(0);
        finish();
    }

    public final void a(int i2, int i3) {
        this.i.setTitle(i2);
        this.i.setMessage(getString(i3));
    }

    public final void a(String str) {
        this.g.a(str);
        Intent intent = new Intent();
        intent.putExtra("com.spotify.music.spotlets.scannables.RESULT", str);
        setResult(-1, intent);
        finish();
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SCANNABLES_SCANNER, null);
    }

    public final void k() {
        this.i.show();
    }

    public final void l() {
        this.i.dismiss();
    }

    public final void m() {
        Toast.makeText(this, R.string.scannables_cant_retrieve_scannable, 1).show();
    }

    public final void n() {
        Intent intent = new Intent("android.intent.action.PICK", Media.INTERNAL_CONTENT_URI);
        if (intent.resolveActivityInfo(getPackageManager(), 0) != null) {
            startActivityForResult(intent, 4567);
        } else {
            Toast.makeText(this, R.string.scannables_no_gallery_app_installed, 0).show();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 4567) {
            if (i2 == 10001) {
                if (i3 == -1) {
                    this.g.b(this);
                    this.g.a(new utx().a(this.h, this));
                    return;
                }
                setResult(0);
                finish();
            }
        } else if (i3 == -1) {
            this.g.d();
            this.g.a(getContentResolver(), intent.getData());
        } else {
            this.g.c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_scannable);
        this.h = (FrameLayout) findViewById(R.id.camera_preview);
        this.g.a((utz) this);
        this.i = new ProgressDialog(this);
        ImageButton imageButton = (ImageButton) findViewById(R.id.scannable_cancel);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable((Context) this, SpotifyIconV2.X, (float) getResources().getDimensionPixelSize(R.dimen.actionbar_search_drawables_size));
        spotifyIconDrawable.a(fr.c(this, R.color.white));
        imageButton.setImageDrawable(spotifyIconDrawable);
        imageButton.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ScannableActivity.this.b(view);
            }
        });
        Button button = (Button) findViewById(R.id.scannable_select_from_photos);
        button.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ScannableActivity.this.a(view);
            }
        });
        if (getIntent().getBooleanExtra("EXTRA_SOCIAL_LISTENING", false)) {
            button.setVisibility(8);
            ((TextView) findViewById(R.id.social_listening_privacy_notice)).setVisibility(0);
            ((TextView) findViewById(R.id.txt_scannable_instructions)).setText(R.string.scannables_social_listening_viewfinder_hint);
        }
    }

    public void onPause() {
        super.onPause();
        this.g.a();
    }

    public void onResume() {
        super.onResume();
        this.g.a((Context) this);
    }

    public final void q() {
        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(100);
        }
    }

    public final void r() {
        Toast.makeText(this, R.string.scannables_error_message_toast, 0).show();
        setResult(0);
        finish();
    }

    public final void s() {
        startActivityForResult(ScannablesOnboardingActivity.a(this), 10001);
    }

    public final void t() {
        this.g.a(new utx().a(this.h, this));
    }
}
