package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: qpw reason: default package */
public final class qpw extends u {
    final View a;

    public qpw(View view) {
        super(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.entity_page_header_container);
        fqv.b();
        this.a = fsk.b(view.getContext(), linearLayout, false).getView();
        linearLayout.addView(this.a);
    }
}
