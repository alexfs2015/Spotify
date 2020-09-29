package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: tlk reason: default package */
public final class tlk implements tum {
    private final tmg a;

    /* renamed from: tlk$a */
    public static class a extends tuq {
        public String a;
        public String b;
    }

    /* renamed from: tlk$b */
    public static class b extends defpackage.tum.a {
        final TextView a;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.txt_description);
        }
    }

    public /* synthetic */ void a(tuq tuq) {
        CC.$default$a(this, tuq);
    }

    public tlk(tmg tmg) {
        this.a = tmg;
    }

    public final defpackage.tum.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(layoutInflater.inflate(R.layout.podcast_adapter_delegate_show_description, viewGroup, false));
    }

    public final void a(tuq tuq, u uVar) {
        a aVar = (a) tuq;
        this.a.a(((b) uVar).a);
        this.a.a(aVar.a, aVar.b);
    }
}
