package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import java.util.List;

/* renamed from: upq reason: default package */
public final class upq {
    final Context a;
    final a b;
    final jqb c;
    upr d;
    upo e;
    final PopupWindow f;
    private final ListView g;
    private final OnItemClickListener h = new OnItemClickListener() {
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Assertion.a("position is outside adapter length", i < upq.this.c.getCount());
            int a2 = upq.this.c.a(i);
            if (a2 != Integer.MIN_VALUE) {
                int a3 = upq.this.c.a(i, a2);
                if (a2 == 0) {
                    ((upp) upq.this.e.getItem(a3)).a(upq.this.a);
                    upq.this.f.dismiss();
                    upq.this.e.notifyDataSetChanged();
                } else if (a2 != 1) {
                    StringBuilder sb = new StringBuilder("ID ");
                    sb.append(j);
                    sb.append("is unknown.");
                    Assertion.a(sb.toString());
                } else {
                    SortOption sortOption = (SortOption) upq.this.d.getItem(a3);
                    if (upq.this.d.a != a3) {
                        sortOption.a(false, true);
                    } else if (sortOption.mIsReversible) {
                        sortOption.a(!sortOption.b(), true);
                    }
                    if (upq.this.b != null) {
                        upq.this.b.a(sortOption);
                    }
                    upq.this.f.dismiss();
                    upr upr = upq.this.d;
                    if (upr.a != a3) {
                        upr.a = a3;
                        upr.notifyDataSetChanged();
                    }
                }
            }
        }
    };

    /* renamed from: upq$a */
    public interface a {
        void a(SortOption sortOption);
    }

    public upq(Context context, LayoutInflater layoutInflater, a aVar) {
        this.a = context;
        this.b = aVar;
        View inflate = layoutInflater.inflate(R.layout.list_popup, null);
        this.f = new PopupWindow(inflate, context.getResources().getDimensionPixelSize(R.dimen.filter_list_popup_width), -2);
        this.f.setOutsideTouchable(true);
        this.f.setFocusable(true);
        this.f.setBackgroundDrawable(new BitmapDrawable(context.getResources(), null));
        this.g = (ListView) inflate.findViewById(16908298);
        this.g.setOnItemClickListener(this.h);
        this.g.setDivider(null);
        this.c = new jqb(context);
        this.c.a = new jqa();
    }

    public final void a(List<SortOption> list, SortOption sortOption) {
        Assertion.a((Object) list, "We need a non-null sortOptions list");
        Assertion.b("sortOptions must contain at least one item each.", list.isEmpty());
        int indexOf = list.indexOf(sortOption);
        ((SortOption) list.get(indexOf)).a(sortOption.b());
        this.d = new upr(this.a, list, indexOf);
        this.c.a((ListAdapter) this.d, (int) R.string.filter_header_sort, 1);
        this.c.c(1);
        this.g.setAdapter(this.c);
    }

    public final void a(List<upp> list) {
        Assertion.a((Object) list, "We need a non-null filterOptions list");
        if (!list.isEmpty()) {
            this.e = new upo(this.a, list);
            this.c.a((ListAdapter) this.e, (int) R.string.filter_header_filter, 0);
            this.c.c(0);
            this.g.setAdapter(this.c);
        }
    }

    public final void a(View view) {
        this.f.showAsDropDown(view);
    }

    public final void a() {
        if (this.f.isShowing()) {
            this.f.dismiss();
        }
    }
}
