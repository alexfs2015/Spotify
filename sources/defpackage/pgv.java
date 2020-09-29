package defpackage;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.music.features.premiumdestination.legacy.ui.RoundedConstraintLayout;
import java.util.Arrays;
import java.util.List;

/* renamed from: pgv reason: default package */
final class pgv extends sa {
    private final List<pgy> a;

    public final boolean a(View view, Object obj) {
        return view == obj;
    }

    public pgv(List<pgy> list) {
        this.a = list;
    }

    public final int b() {
        return this.a.size();
    }

    public final Object a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.free_vs_premium_item, viewGroup, false);
        pgy pgy = (pgy) this.a.get(i);
        Arrays.fill(((RoundedConstraintLayout) inflate).b, 0, 8, (float) ((int) TypedValue.applyDimension(1, 8.0f, inflate.getResources().getDisplayMetrics())));
        TextView textView = (TextView) inflate.findViewById(R.id.premium_description);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.free_icon);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.premium_icon);
        ((TextView) inflate.findViewById(R.id.free_description)).setText(pgy.a);
        textView.setText(pgy.b);
        imageView.setImageResource(pgy.c);
        imageView2.setImageResource(pgy.d);
        viewGroup.addView(inflate);
        return inflate;
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
