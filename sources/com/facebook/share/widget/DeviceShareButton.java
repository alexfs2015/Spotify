package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.spotify.music.R;

public final class DeviceShareButton extends ajz {
    private int b;
    private boolean c;
    private ans d;

    public final int d() {
        return R.style.com_facebook_button_share;
    }

    public DeviceShareButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private DeviceShareButton(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, 0, 0, "fb_device_share_button_create", "fb_device_share_button_did_tap");
        this.b = 0;
        this.c = false;
        this.d = null;
        if (isInEditMode()) {
            i2 = 0;
        } else {
            i2 = RequestCodeOffset.Share.a();
        }
        this.b = i2;
        setEnabled(false);
        this.c = false;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c = true;
    }

    public final int b() {
        return this.b;
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.a(context, attributeSet, i, i2);
        this.a = new OnClickListener() {
            public final void onClick(View view) {
                DeviceShareButton.this.a(view);
                ans a2 = DeviceShareButton.a(DeviceShareButton.this);
                DeviceShareButton deviceShareButton = DeviceShareButton.this;
                a2.a(null);
            }
        };
    }

    public final int a() {
        return RequestCodeOffset.Share.a();
    }

    static /* synthetic */ ans a(DeviceShareButton deviceShareButton) {
        if (deviceShareButton.d == null) {
            deviceShareButton.d = new ans(deviceShareButton.c());
        }
        return deviceShareButton.d;
    }
}
