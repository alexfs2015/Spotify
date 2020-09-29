package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.util.List;

/* renamed from: icx reason: default package */
public final class icx extends androidx.recyclerview.widget.RecyclerView.a<b> implements gkw {
    private final List<ida> a;
    private final LayoutInflater d;
    private final a e;

    /* renamed from: icx$a */
    public interface a {
        void a(ida ida);
    }

    /* renamed from: icx$b */
    static class b extends u {
        private final TextView a;
        private final a b;

        b(View view, a aVar) {
            super(view);
            this.a = (TextView) view;
            this.b = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(ida ida, View view) {
            this.b.a(ida);
        }

        /* access modifiers changed from: 0000 */
        public final void a(ida ida) {
            this.a.setText(ida.b());
            this.a.setOnClickListener(new $$Lambda$icx$b$CgEeWo14levX_wxTUXoqwydxKZA(this, ida));
        }
    }

    public icx(List<ida> list, LayoutInflater layoutInflater, a aVar) {
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

    public final int a(int i) {
        return "opt_out_confirm".equals(((ida) this.a.get(i)).a()) ? 0 : 1;
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

    public final /* synthetic */ void a(u uVar, int i) {
        ((b) uVar).a((ida) this.a.get(i));
    }

    public final int b() {
        return this.a.size();
    }
}
