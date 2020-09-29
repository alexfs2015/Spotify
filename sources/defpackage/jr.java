package defpackage;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: jr reason: default package */
final class jr extends Filter {
    private a a;

    /* renamed from: jr$a */
    interface a {
        Cursor a();

        Cursor a(CharSequence charSequence);

        void a(Cursor cursor);

        CharSequence b(Cursor cursor);
    }

    jr(a aVar) {
        this.a = aVar;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.a.b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public final FilterResults performFiltering(CharSequence charSequence) {
        Cursor a2 = this.a.a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a2 != null) {
            filterResults.count = a2.getCount();
            filterResults.values = a2;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a2 = this.a.a();
        if (filterResults.values != null && filterResults.values != a2) {
            this.a.a((Cursor) filterResults.values);
        }
    }
}
