package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager.b;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.features.languagepicker.view.RoundedRelativeLayout;
import com.squareup.picasso.Picasso;
import java.util.Arrays;

/* renamed from: nut reason: default package */
public final class nut extends nur {
    private final Picasso a;
    private final b b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final TextView g = ((TextView) this.o.findViewById(R.id.language));
    private final ImageView h = ((ImageView) this.o.findViewById(R.id.image));
    private final View i = this.o.findViewById(R.id.overlay);
    private final ImageView j = ((ImageView) this.o.findViewById(R.id.icon));

    public nut(ViewGroup viewGroup, a aVar, Picasso picasso, b bVar, int i2, int i3, int i4) {
        super(a((int) R.layout.language_picker_item, viewGroup), aVar);
        LayoutParams layoutParams = (LayoutParams) fbp.a(this.o.getLayoutParams());
        layoutParams.height = i4;
        this.o.setLayoutParams(layoutParams);
        this.f = viewGroup.getResources().getDimensionPixelSize(R.dimen.grid_item_spacing_half);
        Arrays.fill(((RoundedRelativeLayout) this.o.findViewById(R.id.root)).a, 0, 8, (float) vfj.a(8.0f, this.o.getResources()));
        this.a = picasso;
        this.b = bVar;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        ImageView imageView = this.j;
        Context context = this.o.getContext();
        vgr vgr = new vgr(jyz.b(context, SpotifyIconV2.HEART_ACTIVE, vgl.d(context, R.attr.pasteColorAccessoryGreen)), 0.6f);
        vgr.a(fr.c(this.o.getContext(), R.color.white));
        imageView.setImageDrawable(vgr);
    }

    public final void a(nvr nvr, int i2) {
        super.a(nvr, i2);
        this.g.setText(nvr.a());
        ImageView imageView = this.h;
        String b2 = nvr.b();
        int a2 = this.b.a(i2);
        int i3 = this.c;
        int i4 = this.d;
        int i5 = (a2 * (i3 - ((((i4 - (a2 - 1)) + 1) * this.f) << 1))) / i4;
        int i6 = this.e;
        Drawable a3 = fr.a(imageView.getContext(), (int) R.drawable.language_placeholder);
        this.a.a(b2).a(a3).b(a3).b(i5, i6).d().a(imageView);
        boolean d2 = nvr.d();
        int i7 = 0;
        this.i.setVisibility(d2 ? 0 : 8);
        ImageView imageView2 = this.j;
        if (!d2) {
            i7 = 4;
        }
        imageView2.setVisibility(i7);
    }
}
