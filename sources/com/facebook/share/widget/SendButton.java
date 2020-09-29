package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.spotify.music.R;

public final class SendButton extends apt {
    public SendButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    public SendButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, "fb_send_button_create", "fb_send_button_did_tap");
    }

    public final int a() {
        return RequestCodeOffset.Message.a();
    }

    public final int d() {
        return R.style.com_facebook_button_send;
    }

    public final amo<apb, a> e() {
        return new aps(c(), b());
    }
}
