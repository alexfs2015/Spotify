package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.widget.ListPopupWindow;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ftb reason: default package */
public final class ftb implements OnKeyListener, OnGlobalLayoutListener, OnItemClickListener, OnDismissListener {
    public final Context a;
    /* access modifiers changed from: 0000 */
    public final List<MenuItem> b = new ArrayList();
    public View c;
    public ListPopupWindow d;
    public ViewTreeObserver e;
    public final a f = new a(this, 0);

    /* renamed from: ftb$a */
    class a extends BaseAdapter {
        private a() {
        }

        /* synthetic */ a(ftb ftb, byte b) {
            this();
        }

        public final int getCount() {
            return ftb.this.b.size();
        }

        public final /* synthetic */ Object getItem(int i) {
            return (MenuItem) ftb.this.b.get(i);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            frx frx = (frx) fqz.b(view, frx.class);
            if (frx == null) {
                fqv.b();
                frx = fsk.a(viewGroup.getContext(), viewGroup);
            }
            MenuItem menuItem = (MenuItem) ftb.this.b.get(i);
            frx.a(menuItem.getTitle());
            frx.getView().setEnabled(menuItem.isEnabled());
            return frx.getView();
        }
    }

    public ftb(Context context) {
        this.a = context;
    }

    private boolean b() {
        ListPopupWindow listPopupWindow = this.d;
        return listPopupWindow != null && listPopupWindow.p.isShowing();
    }

    public final void a() {
        if (b()) {
            this.d.d();
        }
    }

    public final void onDismiss() {
        this.d = null;
        ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.e = this.c.getViewTreeObserver();
            }
            this.e.removeOnGlobalLayoutListener(this);
            this.e = null;
        }
    }

    public final void onGlobalLayout() {
        if (b()) {
            View view = this.c;
            if (view == null || !view.isShown()) {
                a();
            } else if (b()) {
                this.d.d_();
            }
        }
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        MenuItem menuItem = (MenuItem) adapterView.getAdapter().getItem(i);
        ListPopupWindow listPopupWindow = this.d;
        if (listPopupWindow != null && listPopupWindow.p.isShowing() && menuItem.isEnabled()) {
            this.d.d();
        }
        if (menuItem.isEnabled()) {
            ((az) menuItem).b();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        this.d.d();
        return true;
    }
}
