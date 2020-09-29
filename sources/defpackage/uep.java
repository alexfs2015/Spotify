package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: uep reason: default package */
public class uep implements fqy {
    public static final String a = uep.class.getSimpleName();
    public final Picasso b;
    public final int c;
    public final Drawable d;
    public final uel e;
    public ViewGroup f;
    public ImageView g;
    public TextView h;
    public TextView i;

    public uep(Picasso picasso, Context context, uel uel) {
        this.b = picasso;
        this.e = uel;
        this.c = context.getResources().getDimensionPixelOffset(R.dimen.action_card_image_size);
        this.d = gaa.c(context);
    }

    public View getView() {
        return this.f;
    }
}
