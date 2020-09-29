package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.util.List;

/* renamed from: ial reason: default package */
public final class ial extends androidx.recyclerview.widget.RecyclerView.a<b> implements gjl {
    private final List<iao> a;
    private final LayoutInflater d;
    private final a e;

    /* renamed from: ial$a */
    public interface a {
        void a(iao iao);
    }

    /* renamed from: ial$b */
    static class b extends u {
        private final TextView a;
        private final a b;

        b(View view, a aVar) {
            super(view);
            this.a = (TextView) view;
            this.b = aVar;
        }

        /* access modifiers changed from: 0000 */
        public final void a(iao iao) {
            this.a.setText(iao.b());
            this.a.setOnClickListener(new $$Lambda$ial$b$J2dCij4NQ0AoiGVFlAbFHPXTnlc(this, iao));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(iao iao, View view) {
            this.b.a(iao);
        }
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((b) uVar).a((iao) this.a.get(i));
    }

    public ial(List<iao> list, LayoutInflater layoutInflater, a aVar) {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (aVar != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Logger.b("[Feedback] adapter interaction handler reference is null? %s", objArr);
        this.a = list;
        this.d = layoutInflater;
        this.e = aVar;
    }

    public final int b() {
        return this.a.size();
    }

    public final int a(int i) {
        return "opt_out_confirm".equals(((iao) this.a.get(i)).a()) ? 0 : 1;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        TextView textView;
        if (i == 1) {
            textView = (TextView) this.d.inflate(R.layout.left_aligned_menu_item, viewGroup, false);
        } else if (i == 0) {
            textView = (TextView) this.d.inflate(R.layout.left_aligned_menu_item_bold, viewGroup, false);
        } else {
            throw new IllegalArgumentException("Unknown view type");
        }
        return new b(textView, this.e);
    }
}
