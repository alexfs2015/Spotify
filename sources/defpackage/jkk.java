package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.s;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: jkk reason: default package */
public final class jkk extends androidx.recyclerview.widget.RecyclerView.a<u> {
    CharSequence a;
    String d;
    jkj[] e;

    /* renamed from: jkk$a */
    public static class a extends h {
        public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
            super.a(rect, view, recyclerView, sVar);
            if (RecyclerView.e(view) == 0) {
                rect.bottom = view.getResources().getDimensionPixelSize(R.dimen.std_16dp);
            } else {
                rect.bottom = (int) TypedValue.applyDimension(1, 32.0f, view.getResources().getDisplayMetrics());
            }
        }
    }

    /* renamed from: jkk$b */
    public static class b extends iqu<jkj> {
        private final TextView a = ((TextView) this.o.findViewById(R.id.feature_title));
        private final TextView b = ((TextView) this.o.findViewById(R.id.feature_description));

        public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
            a((jkj) obj);
        }

        public b(ViewGroup viewGroup) {
            super(a((int) R.layout.item_premium_destination_feature, viewGroup));
        }

        public final void a(jkj jkj) {
            this.a.setCompoundDrawablesWithIntrinsicBounds(0, jkj.a(), 0, 0);
            this.a.setText(jkj.b());
            this.b.setText(jkj.c());
        }
    }

    public final u a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new u(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_premium_destination_header, viewGroup, false)) {
            };
        }
        if (i == 1) {
            return new u(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_premium_destination_legal_text, viewGroup, false)) {
            };
        }
        if (i == 2) {
            return new b(viewGroup);
        }
        StringBuilder sb = new StringBuilder("No viewType: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(u uVar, int i) {
        int a2 = a(i);
        if (a2 == 0) {
            ((TextView) uVar.o).setText(this.d);
        } else if (a2 == 1) {
            ((TextView) uVar.o).setText(this.a);
            ((TextView) uVar.o).setMovementMethod(new LinkMovementMethod());
        } else if (a2 == 2) {
            ((b) uVar).a(this.e[(i - 1) - (a() ? 1 : 0)]);
        } else {
            throw new IllegalArgumentException(String.format("Invalid view type: %s for position: %s", new Object[]{Integer.valueOf(a2), Integer.valueOf(i)}));
        }
    }

    public final int a(int i) {
        if (!a()) {
            return i == 0 ? 0 : 2;
        }
        if (i == 0) {
            return 1;
        }
        return i == 1 ? 0 : 2;
    }

    public final int b() {
        if (this.e == null) {
            return 0;
        }
        return this.e.length + 1 + (a() ? 1 : 0);
    }

    private boolean a() {
        return !TextUtils.isEmpty(this.a);
    }
}
