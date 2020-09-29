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

    public final void a(Picasso picasso, nlg nlg) {
        if (nlg == null) {
            setVisibility(8);
        } else {
            b((Picasso) fay.a(picasso), nlg);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(Picasso picasso, nlg nlg) {
        fay.a(picasso);
        fay.a(nlg);
        String a = nlg.a();
        if (a != null && !a.isEmpty()) {
            vsl a2 = picasso.a(a);
            a2.b((Drawable) nlg.a(getContext()));
            a2.a(uvt.a((ImageView) this));
        } else if (nlg.b().isEmpty()) {
            picasso.a((int) R.drawable.cat_placeholder_user).a(uvt.a((ImageView) this));
        } else {
            setImageDrawable(nlg.a(getContext()));
        }
        setScaleType(ScaleType.CENTER_CROP);
        setVisibility(0);
    }
}
