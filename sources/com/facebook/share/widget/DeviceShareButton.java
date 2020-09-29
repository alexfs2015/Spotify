package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.spotify.music.R;

public final class DeviceShareButton extends akn {
    private int b;
    private boolean c;
    private aog d;

    public DeviceShareButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private DeviceShareButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0, 0, "fb_device_share_button_create", "fb_device_share_button_did_tap");
        this.b = 0;
        this.c = false;
        this.d = null;
        this.b = isInEditMode() ? 0 : RequestCodeOffset.Share.a();
        setEnabled(false);
        this.c = false;
    }

    static /* synthetic */ aog a(DeviceShareButton deviceShareButton) {
        if (deviceShareButton.d == null) {
            deviceShareButton.d = new aog(deviceShareButton.c());
        }
        return deviceShareButton.d;
    }

    public final int a() {
        return RequestCodeOffset.Share.a();
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.a(context, attributeSet, i, i2);
        this.a = new OnClickListener() {
            public final void onClick(View view) {
                DeviceShareButton.this.a(view);
                aog a2 = DeviceShareButton.a(DeviceShareButton.this);
                DeviceShareButton deviceShareButton = DeviceShareButton.this;
                a2.a(null);
            }
        };
    }

    public final int b() {
        return this.b;
    }

    public final int d() {
        return R.style.com_facebook_button_share;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c = true;
    }
}
