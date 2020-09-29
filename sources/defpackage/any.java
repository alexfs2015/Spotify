package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.music.R;

@Deprecated
/* renamed from: any reason: default package */
public final class any extends ajz {
    public final int a() {
        return 0;
    }

    public final int d() {
        return R.style.com_facebook_button_like;
    }

    @Deprecated
    public any(Context context, boolean z) {
        super(context, null, 0, 0, "fb_like_button_create", "fb_like_button_did_tap");
        setSelected(z);
    }

    @Deprecated
    public final void setSelected(boolean z) {
        super.setSelected(z);
        e();
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.a(context, attributeSet, i, i2);
        e();
    }

    private void e() {
        if (isSelected()) {
            setCompoundDrawablesWithIntrinsicBounds(R.drawable.com_facebook_button_like_icon_selected, 0, 0, 0);
            setText(getResources().getString(R.string.com_facebook_like_button_liked));
            return;
        }
        setCompoundDrawablesWithIntrinsicBounds(R.drawable.com_facebook_button_icon, 0, 0, 0);
        setText(getResources().getString(R.string.com_facebook_like_button_not_liked));
    }
}
