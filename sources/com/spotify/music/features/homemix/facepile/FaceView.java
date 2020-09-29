package com.spotify.music.features.homemix.facepile;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

public class FaceView extends AppCompatImageView {
    public FaceView(Context context) {
        this(context, null);
    }

    public FaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
    }

    public final void a(Picasso picasso, nqw nqw) {
        if (nqw == null) {
            setVisibility(8);
        } else {
            b((Picasso) fbp.a(picasso), nqw);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(Picasso picasso, nqw nqw) {
        fbp.a(picasso);
        fbp.a(nqw);
        String a = nqw.a();
        if (a != null && !a.isEmpty()) {
            wgr a2 = picasso.a(a);
            a2.b((Drawable) nqw.a(getContext()));
            a2.a(vhj.a((ImageView) this));
        } else if (nqw.b().isEmpty()) {
            picasso.a((int) R.drawable.cat_placeholder_user).a(vhj.a((ImageView) this));
        } else {
            setImageDrawable(nqw.a(getContext()));
        }
        setScaleType(ScaleType.CENTER_CROP);
        setVisibility(0);
    }
}
