package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: mgk reason: default package */
public final class mgk implements gru {
    public final int a() {
        return 61;
    }

    public final long a(int i) {
        return 61;
    }

    public final int b() {
        return 1;
    }

    public final int[] c() {
        return new int[]{61};
    }

    public final void a(u uVar, int i) {
        ((frs) fqb.a(uVar.o, frs.class)).a((CharSequence) uVar.o.getResources().getString(R.string.connect_education_header));
    }

    public final u a(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        Resources resources = context.getResources();
        frs a = fqb.e().a(context, viewGroup);
        TextView a2 = a.a();
        float dimension = resources.getDimension(R.dimen.device_picker_header_title_size);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.connect_education_card_header_padding);
        a2.setTextSize(0, dimension);
        a2.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        return fqg.a(a);
    }
}
