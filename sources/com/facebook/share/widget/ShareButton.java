package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.spotify.music.R;

public final class ShareButton extends apt {
    public ShareButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, "fb_share_button_create", "fb_share_button_did_tap");
    }

    public ShareButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, "fb_share_button_create", "fb_share_button_did_tap");
    }

    public final int a() {
        return RequestCodeOffset.Share.a();
    }

    public final int d() {
        return R.style.com_facebook_button_share;
    }

    public final amo<apb, a> e() {
        return new ShareDialog(c(), b());
    }
}
