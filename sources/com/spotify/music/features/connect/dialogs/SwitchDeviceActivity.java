package com.spotify.music.features.connect.dialogs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.Scheduler;

public class SwitchDeviceActivity extends kyd implements mfu {
    public hip g;
    public iqw h;
    public Scheduler i;
    private ImageView j;
    private TextView k;
    private Button l;
    private Button m;
    private boolean n;
    private gsh o;
    private mfs p;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = new gsh(this);
        setContentView((int) R.layout.switch_device_dialog);
        this.l = (Button) findViewById(R.id.left_button);
        this.m = (Button) findViewById(R.id.right_button);
        this.j = (ImageView) findViewById(R.id.device_icon);
        this.k = (TextView) findViewById(R.id.device_name);
        this.l.setText(getString(jtc.c(this) ? R.string.connect_listen_on_this_tablet : R.string.connect_listen_on_this_phone));
        new jxa(this.l).a();
        this.l.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                SwitchDeviceActivity.this.b(view);
            }
        });
        this.m.setText(R.string.connect_popup_button_close);
        this.m.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                SwitchDeviceActivity.this.a(view);
            }
        });
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setVisibility(m() ? 0 : 8);
        }
        this.p = new mft(this.g, this, new wlc() {
            public final Object get() {
                return SwitchDeviceActivity.this.n();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Scheduler n() {
        return this.i;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onStart() {
        super.onStart();
        this.p.c();
    }

    public void onResume() {
        super.onResume();
        this.n = true;
        this.p.a((GaiaDevice) getIntent().getParcelableExtra("active_device"));
    }

    public void onPause() {
        super.onPause();
        this.n = false;
        this.p.f();
        setResult(-1);
    }

    public void onStop() {
        super.onStop();
        this.p.d();
    }

    public final void a(String str) {
        this.k.setText(str);
    }

    public final void a(GaiaDevice gaiaDevice) {
        this.j.setImageDrawable(this.o.a(gaiaDevice, fr.c(this, R.color.cat_medium_green), (float) getResources().getDimensionPixelSize(R.dimen.connect_dialog_device_icon_size)));
    }

    public final void k() {
        finish();
    }

    public final boolean l() {
        return this.n;
    }

    public final boolean m() {
        return getResources().getBoolean(R.bool.connect_dialog_has_image);
    }

    public void onBackPressed() {
        this.p.b();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CONNECT_OVERLAY_SWITCHDEVICE, ViewUris.bs.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.h.a("call-to-action", InteractionIntent.LISTEN_ON_THIS_DEVICE, PageIdentifiers.CONNECT_OVERLAY_SWITCHDEVICE, ViewUris.bs);
        this.p.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.h.a("call-to-action", InteractionIntent.CONTINUE, PageIdentifiers.CONNECT_OVERLAY_SWITCHDEVICE, ViewUris.bs);
        this.p.b();
    }

    public static Intent a(Context context, GaiaDevice gaiaDevice) {
        fay.a(context);
        fay.a(gaiaDevice);
        Intent intent = new Intent(context, SwitchDeviceActivity.class);
        intent.putExtra("active_device", gaiaDevice);
        return intent;
    }
}
