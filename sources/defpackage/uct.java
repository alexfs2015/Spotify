package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: uct reason: default package */
public class uct {
    private static String a = uct.class.getSimpleName();
    private final Context b;
    private final Picasso c;

    public uct(Context context, Picasso picasso) {
        this.b = context.getApplicationContext();
        this.c = picasso;
    }

    public final void a(ImageView imageView, String str) {
        int dimensionPixelOffset = this.b.getResources().getDimensionPixelOffset(R.dimen.action_card_image_size);
        float dimension = this.b.getResources().getDimension(R.dimen.action_card_improved_icon_radius);
        Drawable c2 = gaa.c(this.b);
        this.c.d(imageView);
        this.c.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(c2).b(c2).b(dimensionPixelOffset, dimensionPixelOffset).d().a((Object) a).a(vhj.a(imageView, vgt.a(dimension)));
    }
}
