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

/* renamed from: vav reason: default package */
public final class vav {
    final Context a;
    final a b;
    final jsm c;
    vaw d;
    vat e;
    final PopupWindow f;
    private final ListView g;
    private final OnItemClickListener h = new OnItemClickListener() {
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Assertion.a("position is outside adapter length", i < vav.this.c.getCount());
            int a2 = vav.this.c.a(i);
            if (a2 != Integer.MIN_VALUE) {
                int a3 = vav.this.c.a(i, a2);
                if (a2 == 0) {
                    ((vau) vav.this.e.getItem(a3)).a(vav.this.a);
                    vav.this.f.dismiss();
                    vav.this.e.notifyDataSetChanged();
                } else if (a2 != 1) {
                    StringBuilder sb = new StringBuilder("ID ");
                    sb.append(j);
                    sb.append("is unknown.");
                    Assertion.a(sb.toString());
                } else {
                    SortOption sortOption = (SortOption) vav.this.d.getItem(a3);
                    if (vav.this.d.a != a3) {
                        sortOption.a(false, true);
                    } else if (sortOption.mIsReversible) {
                        sortOption.a(!sortOption.b(), true);
                    }
                    if (vav.this.b != null) {
                        vav.this.b.a(sortOption);
                    }
                    vav.this.f.dismiss();
                    vaw vaw = vav.this.d;
                    if (vaw.a != a3) {
                        vaw.a = a3;
                        vaw.notifyDataSetChanged();
                    }
                }
            }
        }
    };

    /* renamed from: vav$a */
    public interface a {
        void a(SortOption sortOption);
    }

    public vav(Context context, LayoutInflater layoutInflater, a aVar) {
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
        this.c = new jsm(context);
        this.c.a = new jsl();
    }

    public final void a() {
        if (this.f.isShowing()) {
            this.f.dismiss();
        }
    }

    public final void a(View view) {
        this.f.showAsDropDown(view);
    }

    public final void a(List<vau> list) {
        Assertion.a((Object) list, "We need a non-null filterOptions list");
        if (!list.isEmpty()) {
            this.e = new vat(this.a, list);
            this.c.a((ListAdapter) this.e, (int) R.string.filter_header_filter, 0);
            this.c.c(0);
            this.g.setAdapter(this.c);
        }
    }

    public final void a(List<SortOption> list, SortOption sortOption) {
        Assertion.a((Object) list, "We need a non-null sortOptions list");
        Assertion.b("sortOptions must contain at least one item each.", list.isEmpty());
        int indexOf = list.indexOf(sortOption);
        ((SortOption) list.get(indexOf)).a(sortOption.b());
        this.d = new vaw(this.a, list, indexOf);
        this.c.a((ListAdapter) this.d, (int) R.string.filter_header_sort, 1);
        this.c.c(1);
        this.g.setAdapter(this.c);
    }
}
