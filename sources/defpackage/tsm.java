package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: tsm reason: default package */
public final class tsm implements fqe {
    public static final String a = tsm.class.getSimpleName();
    public final ViewGroup b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final Picasso f;
    public final int g;
    public final Drawable h;
    public final tsi i;

    /* renamed from: tsm$a */
    public static class a {
        public final Picasso a;
        public final Context b;
        public final tsi c;

        public a(Picasso picasso, Context context, tsi tsi) {
            this.a = picasso;
            this.b = context;
            this.c = tsi;
        }
    }

    public /* synthetic */ tsm(Picasso picasso, Context context, tsi tsi, ViewGroup viewGroup, byte b2) {
        this(picasso, context, tsi, viewGroup);
    }

    public final View getView() {
        return this.b;
    }

    private tsm(Picasso picasso, Context context, tsi tsi, ViewGroup viewGroup) {
        this.f = picasso;
        this.b = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.podcast_trailer_section, viewGroup, false);
        this.c = (ImageView) this.b.findViewById(16908294);
        this.d = (TextView) this.b.findViewById(16908308);
        this.e = (TextView) this.b.findViewById(16908309);
        this.e.setAllCaps(false);
        this.g = context.getResources().getDimensionPixelOffset(R.dimen.action_card_image_size);
        this.h = fzg.c(context);
        uui.b(this.b).b(this.b).a();
        this.i = tsi;
    }
}
