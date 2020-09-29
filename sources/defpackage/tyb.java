package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: tyb reason: default package */
public final class tyb implements ugp {
    private final Context a;

    /* renamed from: tyb$a */
    public static class a extends ugt {
    }

    /* renamed from: tyb$b */
    public static class b extends defpackage.ugp.a {
        private final fvd a;

        public b(fvd fvd) {
            super(fvd.getView());
            this.a = fvd;
        }
    }

    public tyb(Context context) {
        this.a = context;
    }

    public final defpackage.ugp.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        fvd a2 = jsu.a(this.a, 0, R.string.placeholder_collection_empty_show_body);
        a2.a(false);
        a2.b().setVisibility(8);
        a2.b((CharSequence) this.a.getString(R.string.placeholder_collection_empty_show_body));
        return new b(a2);
    }

    public /* synthetic */ void a(ugt ugt) {
        CC.$default$a(this, ugt);
    }

    public final void a(ugt ugt, u uVar) {
    }
}
