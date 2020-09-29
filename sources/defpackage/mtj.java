package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.features.feed.view.custom.FeedPlayButton;

/* renamed from: mtj reason: default package */
final class mtj extends u {
    final Drawable a = gaa.b(this.o.getContext());
    final FeedPlayButton b;

    mtj(View view) {
        fqv.b();
        super(fsk.b(view.getContext(), (ViewGroup) view, false).getView());
        Resources resources = view.getResources();
        this.o.setPadding(resources.getDimensionPixelSize(R.dimen.item_start_space), this.o.getTop(), this.o.getRight(), this.o.getBottom());
        this.b = new FeedPlayButton(view.getContext());
        fsc fsc = (fsc) fqz.a(this.o, fsc.class);
        fsc.a(this.b);
        LayoutParams layoutParams = fsc.c().getLayoutParams();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.album_size);
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
    }
}
