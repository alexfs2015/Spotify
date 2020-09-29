package com.spotify.music.features.connect.dialogs.newdevice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

public class NewDeviceActivity extends kyd {
    public iqw g;
    private gsh h;
    private ImageView i;
    private TextView j;
    private TextView k;
    private Button l;
    private Button m;
    private boolean n;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.h = new gsh(this);
        setContentView((int) R.layout.new_device_dialog);
        this.l = (Button) findViewById(R.id.top_button);
        this.m = (Button) findViewById(R.id.bottom_button);
        this.i = (ImageView) findViewById(R.id.device_icon);
        this.j = (TextView) findViewById(R.id.device_brand);
        this.k = (TextView) findViewById(R.id.device_type);
        this.n = getResources().getBoolean(R.bool.connect_dialog_has_image);
        this.i.setVisibility(this.n ? 0 : 8);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CONNECT_OVERLAY_NEWDEVICE, ViewUris.br.toString());
    }

    /* access modifiers changed from: private */
    public void a(int i2, GaiaDevice gaiaDevice, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("device", gaiaDevice);
        setResult(i2, intent);
        if (z) {
            finish();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r5 = this;
            super.onResume()
            android.content.Intent r0 = r5.getIntent()
            com.spotify.mobile.android.util.Assertion.a(r0)
            java.lang.String r1 = "device"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            com.spotify.mobile.android.connect.model.GaiaDevice r0 = (com.spotify.mobile.android.connect.model.GaiaDevice) r0
            if (r0 == 0) goto L_0x017d
            com.spotify.mobile.android.util.Assertion.a(r0)
            r1 = 0
            r5.a(r1, r0, r1)
            com.spotify.mobile.android.connect.model.DeviceType r2 = r0.getType()
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.GAME_CONSOLE
            java.lang.String r4 = "sony_tv"
            if (r2 != r3) goto L_0x0037
            java.lang.String r2 = r0.getBrandName()
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0037
            r2 = 2131952047(0x7f1301af, float:1.9540526E38)
            java.lang.String r2 = r5.getString(r2)
            goto L_0x0070
        L_0x0037:
            com.spotify.mobile.android.connect.model.DeviceType r2 = r0.getType()
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.CAST_VIDEO
            if (r2 == r3) goto L_0x0069
            com.spotify.mobile.android.connect.model.DeviceType r2 = r0.getType()
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.CAST_AUDIO
            if (r2 != r3) goto L_0x0048
            goto L_0x0069
        L_0x0048:
            com.spotify.mobile.android.connect.model.DeviceType r2 = r0.getType()
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.COMPUTER
            if (r2 == r3) goto L_0x0066
            com.spotify.mobile.android.connect.model.DeviceType r2 = r0.getType()
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.SMARTPHONE
            if (r2 == r3) goto L_0x0066
            com.spotify.mobile.android.connect.model.DeviceType r2 = r0.getType()
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.TABLET
            if (r2 != r3) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            java.lang.String r2 = r0.getBrandName()
            goto L_0x0070
        L_0x0066:
            java.lang.String r2 = ""
            goto L_0x0070
        L_0x0069:
            r2 = 2131952045(0x7f1301ad, float:1.9540522E38)
            java.lang.String r2 = r5.getString(r2)
        L_0x0070:
            boolean r3 = defpackage.fax.a(r2)
            if (r3 == 0) goto L_0x007e
            android.widget.TextView r1 = r5.j
            r2 = 8
            r1.setVisibility(r2)
            goto L_0x0088
        L_0x007e:
            android.widget.TextView r3 = r5.j
            r3.setText(r2)
            android.widget.TextView r2 = r5.j
            r2.setVisibility(r1)
        L_0x0088:
            android.widget.TextView r1 = r5.k
            com.spotify.mobile.android.connect.model.DeviceType r2 = r0.getType()
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.GAME_CONSOLE
            if (r2 != r3) goto L_0x00a1
            java.lang.String r2 = r0.getBrandName()
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00a1
            r2 = 2131952046(0x7f1301ae, float:1.9540524E38)
            goto L_0x013b
        L_0x00a1:
            com.spotify.mobile.android.connect.model.DeviceType r2 = r0.getType()
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.COMPUTER
            if (r2 == r3) goto L_0x0140
            com.spotify.mobile.android.connect.model.DeviceType r2 = r0.getType()
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.SMARTPHONE
            if (r2 == r3) goto L_0x0140
            com.spotify.mobile.android.connect.model.DeviceType r2 = r0.getType()
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.TABLET
            if (r2 != r3) goto L_0x00bb
            goto L_0x0140
        L_0x00bb:
            com.spotify.mobile.android.connect.model.DeviceType r2 = r0.getType()
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.AVR
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00cc
            r2 = 2131952148(0x7f130214, float:1.954073E38)
            goto L_0x013b
        L_0x00cc:
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.UNKNOWN
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00d8
            r2 = 2131952158(0x7f13021e, float:1.954075E38)
            goto L_0x013b
        L_0x00d8:
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.CAST_AUDIO
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00e4
            r2 = 2131952149(0x7f130215, float:1.9540733E38)
            goto L_0x013b
        L_0x00e4:
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.CAST_VIDEO
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00f0
            r2 = 2131952150(0x7f130216, float:1.9540735E38)
            goto L_0x013b
        L_0x00f0:
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.COMPUTER
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00fc
            r2 = 2131952151(0x7f130217, float:1.9540737E38)
            goto L_0x013b
        L_0x00fc:
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.AUDIO_DONGLE
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0108
            r2 = 2131952152(0x7f130218, float:1.9540739E38)
            goto L_0x013b
        L_0x0108:
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.SMARTPHONE
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0114
            r2 = 2131952154(0x7f13021a, float:1.9540743E38)
            goto L_0x013b
        L_0x0114:
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.SPEAKER
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0120
            r2 = 2131952155(0x7f13021b, float:1.9540745E38)
            goto L_0x013b
        L_0x0120:
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.TABLET
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x012c
            r2 = 2131952156(0x7f13021c, float:1.9540747E38)
            goto L_0x013b
        L_0x012c:
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r3 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.TV
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0138
            r2 = 2131952157(0x7f13021d, float:1.9540749E38)
            goto L_0x013b
        L_0x0138:
            r2 = 2131952153(0x7f130219, float:1.954074E38)
        L_0x013b:
            java.lang.String r2 = r5.getString(r2)
            goto L_0x0144
        L_0x0140:
            java.lang.String r2 = r0.getName()
        L_0x0144:
            r1.setText(r2)
            boolean r1 = r5.n
            if (r1 == 0) goto L_0x0169
            r1 = 2131099880(0x7f0600e8, float:1.7812126E38)
            int r1 = defpackage.fr.c(r5, r1)
            android.content.res.Resources r2 = r5.getResources()
            r3 = 2131165487(0x7f07012f, float:1.7945193E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.ImageView r3 = r5.i
            gsh r4 = r5.h
            float r2 = (float) r2
            android.graphics.drawable.Drawable r1 = r4.a(r0, r1, r2)
            r3.setImageDrawable(r1)
        L_0x0169:
            android.widget.Button r1 = r5.m
            com.spotify.music.features.connect.dialogs.newdevice.NewDeviceActivity$1 r2 = new com.spotify.music.features.connect.dialogs.newdevice.NewDeviceActivity$1
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            android.widget.Button r1 = r5.l
            com.spotify.music.features.connect.dialogs.newdevice.NewDeviceActivity$2 r2 = new com.spotify.music.features.connect.dialogs.newdevice.NewDeviceActivity$2
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.connect.dialogs.newdevice.NewDeviceActivity.onResume():void");
    }

    public static Intent a(Context context, GaiaDevice gaiaDevice) {
        fay.a(context);
        fay.a(gaiaDevice);
        Intent intent = new Intent(context, NewDeviceActivity.class);
        intent.putExtra("device", gaiaDevice);
        return intent;
    }
}
