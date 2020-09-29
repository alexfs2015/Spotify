package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: ugl reason: default package */
public final class ugl {
    final Context a;
    private final Picasso b;

    public ugl(Context context, Picasso picasso) {
        this.a = context;
        this.b = picasso;
    }

    public final fqy a(ViewGroup viewGroup) {
        return ucw.a(viewGroup.getContext(), viewGroup, this.b);
    }

    public final fqy b(ViewGroup viewGroup) {
        fqv.e();
        fsm f = a.f(this.a, viewGroup);
        ((MarginLayoutParams) f.getView().getLayoutParams()).topMargin = this.a.getResources().getDimensionPixelSize(R.dimen.quickactions_episode_entity_row_margin);
        return f;
    }

    public final fqy c(ViewGroup viewGroup) {
        return ucu.a(viewGroup.getContext(), viewGroup, this.b);
    }
}
