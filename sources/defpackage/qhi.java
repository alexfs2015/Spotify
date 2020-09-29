package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: qhi reason: default package */
public final class qhi extends u {
    final View a;

    public qhi(View view) {
        super(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.entity_page_header_container);
        fqb.b();
        this.a = frq.b(view.getContext(), linearLayout, false).getView();
        linearLayout.addView(this.a);
    }
}
