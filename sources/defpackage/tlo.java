package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: tlo reason: default package */
public final class tlo implements tum {
    private final Context a;

    /* renamed from: tlo$a */
    public static class a extends tuq {
    }

    /* renamed from: tlo$b */
    public static class b extends defpackage.tum.a {
        public b(fuj fuj) {
            super(fuj.getView());
        }
    }

    public /* synthetic */ void a(tuq tuq) {
        CC.$default$a(this, tuq);
    }

    public final void a(tuq tuq, u uVar) {
    }

    public tlo(Context context) {
        this.a = context;
    }

    public final defpackage.tum.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        fuj a2 = jqj.a(this.a, 0, R.string.placeholder_collection_empty_show_body);
        a2.a(false);
        a2.b().setVisibility(8);
        a2.b((CharSequence) this.a.getString(R.string.placeholder_collection_empty_show_body));
        return new b(a2);
    }
}
