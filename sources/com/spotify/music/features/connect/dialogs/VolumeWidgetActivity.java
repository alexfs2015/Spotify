package com.spotify.music.features.connect.dialogs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.connect.model.ConnectDevice;
import com.spotify.mobile.android.ui.view.DraggableSeekBar;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

public class VolumeWidgetActivity extends jjx {
    private Handler i;
    /* access modifiers changed from: private */
    public DraggableSeekBar j;
    private TextView k;
    private ImageView l;
    /* access modifiers changed from: private */
    public boolean m;
    private gsh n;
    private final Runnable o = new Runnable() {
        public final void run() {
            VolumeWidgetActivity.this.finish();
        }
    };

    public static final class a {
        public static void a(float f, SeekBar seekBar) {
            seekBar.setProgress(Math.round(f * ((float) seekBar.getMax())));
        }

        public static float a(SeekBar seekBar) {
            return ((float) seekBar.getProgress()) / ((float) seekBar.getMax());
        }
    }

    public static Intent a(ConnectDevice connectDevice, float f, Context context) {
        Intent intent = new Intent(context, VolumeWidgetActivity.class);
        intent.putExtra("active_device", connectDevice);
        intent.putExtra("volume_level", f);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.view_volume_widget);
        this.n = new gsh(this);
        this.j = (DraggableSeekBar) findViewById(R.id.volume_slider);
        this.k = (TextView) findViewById(R.id.device_name);
        this.l = (ImageView) findViewById(R.id.device_image);
        this.i = new Handler();
        this.j.setMax(100);
        this.j.a = new com.spotify.mobile.android.ui.view.DraggableSeekBar.a() {
            public final void a() {
                VolumeWidgetActivity.this.m = true;
            }

            public final void a(SeekBar seekBar) {
                VolumeWidgetActivity.this.b(a.a(seekBar));
                VolumeWidgetActivity.this.m = false;
            }

            public final void b(SeekBar seekBar) {
                if (VolumeWidgetActivity.this.b(a.a(seekBar))) {
                    VolumeWidgetActivity.this.k();
                }
            }

            public final void a(int i) {
                VolumeWidgetActivity volumeWidgetActivity = VolumeWidgetActivity.this;
                if (volumeWidgetActivity.b(((float) (i - 6)) / ((float) volumeWidgetActivity.j.getMax()))) {
                    VolumeWidgetActivity.this.k();
                }
            }

            public final void b(int i) {
                VolumeWidgetActivity volumeWidgetActivity = VolumeWidgetActivity.this;
                if (volumeWidgetActivity.b(((float) (i + 6)) / ((float) volumeWidgetActivity.j.getMax()))) {
                    VolumeWidgetActivity.this.k();
                }
            }
        };
    }

    public void onStart() {
        super.onStart();
        Intent intent = getIntent();
        a.a(intent.getFloatExtra("volume_level", 0.0f), this.j);
        ConnectDevice connectDevice = (ConnectDevice) intent.getParcelableExtra("active_device");
        if (connectDevice == null) {
            finish();
            return;
        }
        this.k.setText(connectDevice.b);
        this.l.setImageDrawable(this.n.a(SpotifyIconV2.a(connectDevice.e), fr.c(this, R.color.cat_white), (float) getResources().getDimensionPixelSize(R.dimen.connect_dialog_device_icon_size)));
    }

    public void onStop() {
        super.onStop();
        this.i.removeCallbacks(this.o);
        this.j.setProgress(0);
    }

    public void onResume() {
        super.onResume();
        this.i.postDelayed(this.o, 2000);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 25 || i2 == 24) {
            k();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    /* access modifiers changed from: private */
    public void k() {
        this.i.removeCallbacks(this.o);
        this.i.postDelayed(this.o, 2000);
    }

    public final void a(float f) {
        if (!this.m) {
            a.a(f, this.j);
        }
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CONNECT_OVERLAY_VOLUME, ViewUris.bt.toString());
    }
}
