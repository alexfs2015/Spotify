package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: jq reason: default package */
public abstract class jq extends BaseAdapter implements Filterable, a {
    protected Cursor a;
    private boolean b;
    private int c;
    private jr d;

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void a(View view, Cursor cursor);

    public boolean hasStableIds() {
        return true;
    }

    public final Cursor a() {
        return this.a;
    }

    public int getCount() {
        if (this.b) {
            Cursor cursor = this.a;
            if (cursor != null) {
                return cursor.getCount();
            }
        }
        return 0;
    }

    public Object getItem(int i) {
        if (this.b) {
            Cursor cursor = this.a;
            if (cursor != null) {
                cursor.moveToPosition(i);
                return this.a;
            }
        }
        return null;
    }

    public long getItemId(int i) {
        if (this.b) {
            Cursor cursor = this.a;
            if (cursor != null && cursor.moveToPosition(i)) {
                return this.a.getLong(this.c);
            }
        }
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.a.moveToPosition(i)) {
            if (view == null) {
                view = a(null, this.a, viewGroup);
            }
            a(view, this.a);
            return view;
        } else {
            StringBuilder sb = new StringBuilder("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.b) {
            return null;
        }
        this.a.moveToPosition(i);
        if (view == null) {
            view = b(null, this.a, viewGroup);
        }
        a(view, this.a);
        return view;
    }

    public View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return a(context, cursor, viewGroup);
    }

    public CharSequence b(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public Cursor a(CharSequence charSequence) {
        return this.a;
    }

    public Filter getFilter() {
        if (this.d == null) {
            this.d = new jr(this);
        }
        return this.d;
    }

    public void a(Cursor cursor) {
        Cursor cursor2 = this.a;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            this.a = cursor;
            if (cursor != null) {
                this.c = cursor.getColumnIndexOrThrow("_id");
                this.b = true;
                notifyDataSetChanged();
            } else {
                this.c = -1;
                this.b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }
}
