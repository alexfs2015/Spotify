package defpackage;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;

/* renamed from: ptn reason: default package */
public final class ptn<T extends ListAdapter> extends BaseAdapter {
    public final T a;
    private final Context b;
    private final int c;

    /* renamed from: ptn$a */
    static class a extends View {
        public a(Context context) {
            super(context);
            setVisibility(4);
        }
    }

    /* renamed from: ptn$b */
    public class b extends LinearLayout {
        public b(Context context) {
            super(context);
            setEnabled(false);
            setOnClickListener(null);
            setOrientation(0);
        }
    }

    public ptn(Context context, T t, int i) {
        this.b = (Context) fay.a(context);
        this.a = (ListAdapter) fay.a(t);
        fay.a(i > 0, (Object) "What do you mean '%d' cells per row?! cellsPerRow must be greater than zero.");
        this.c = i;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.registerDataSetObserver(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.unregisterDataSetObserver(dataSetObserver);
    }

    public final int getCount() {
        if (this.c == 1) {
            return this.a.getCount();
        }
        double count = (double) this.a.getCount();
        double d = (double) this.c;
        Double.isNaN(count);
        Double.isNaN(d);
        return (int) Math.ceil(count / d);
    }

    public final Object getItem(int i) {
        return this.a.getItem(a(i, 0));
    }

    public final long getItemId(int i) {
        return this.a.getItemId(a(i, 0));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            int r0 = r8.c
            r1 = 1
            if (r0 != r1) goto L_0x000c
            T r0 = r8.a
            android.view.View r9 = r0.getView(r9, r10, r11)
            return r9
        L_0x000c:
            if (r10 != 0) goto L_0x0016
            ptn$b r10 = new ptn$b
            android.content.Context r11 = r8.b
            r10.<init>(r11)
            goto L_0x0018
        L_0x0016:
            ptn$b r10 = (defpackage.ptn.b) r10
        L_0x0018:
            r11 = 0
            r0 = 0
        L_0x001a:
            ptn r2 = defpackage.ptn.this
            int r2 = r2.c
            if (r0 >= r2) goto L_0x0076
            ptn r2 = defpackage.ptn.this
            int r2 = r2.a(r9, r0)
            android.view.View r3 = r10.getChildAt(r0)
            ptn r4 = defpackage.ptn.this
            T r4 = r4.a
            int r4 = r4.getCount()
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = -1
            if (r2 >= r4) goto L_0x005b
            boolean r4 = r3 instanceof defpackage.ptn.a
            if (r4 == 0) goto L_0x0041
            r10.removeView(r3)
            r3 = 0
        L_0x003f:
            r4 = 1
            goto L_0x0045
        L_0x0041:
            if (r3 != 0) goto L_0x0044
            goto L_0x003f
        L_0x0044:
            r4 = 0
        L_0x0045:
            ptn r7 = defpackage.ptn.this
            T r7 = r7.a
            android.view.View r2 = r7.getView(r2, r3, r10)
            if (r4 == 0) goto L_0x0057
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r6, r6, r5)
            r10.addView(r2, r0, r3)
        L_0x0057:
            r2.setVisibility(r11)
            goto L_0x0073
        L_0x005b:
            if (r3 == 0) goto L_0x0062
            r2 = 4
            r3.setVisibility(r2)
            goto L_0x0073
        L_0x0062:
            ptn$a r2 = new ptn$a
            ptn r3 = defpackage.ptn.this
            android.content.Context r3 = r3.b
            r2.<init>(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r6, r6, r5)
            r10.addView(r2, r0, r3)
        L_0x0073:
            int r0 = r0 + 1
            goto L_0x001a
        L_0x0076:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptn.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    private int a(int i, int i2) {
        return i2 + (this.c * i);
    }
}
