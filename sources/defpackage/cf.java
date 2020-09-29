package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.widget.ListPopupWindow;
import java.lang.reflect.Method;

/* renamed from: cf reason: default package */
public final class cf extends ListPopupWindow implements ce {
    private static Method b;
    public ce a;

    /* renamed from: cf$a */
    public static class a extends cb {
        ce c;
        private int d;
        private int e;
        private MenuItem f;

        public final /* bridge */ /* synthetic */ int a(int i, int i2, int i3, int i4, int i5) {
            return super.a(i, i2, i3, i4, i5);
        }

        public final /* bridge */ /* synthetic */ boolean a(MotionEvent motionEvent, int i) {
            return super.a(motionEvent, i);
        }

        public final /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public final /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public final /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.d = 22;
                this.e = 21;
                return;
            }
            this.d = 21;
            this.e = 22;
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.d) {
                if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.e) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((aw) getAdapter()).a.a(false);
                return true;
            }
        }

        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            aw awVar;
            if (this.c != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    awVar = (aw) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    awVar = (aw) adapter;
                }
                az azVar = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        int i2 = pointToPosition - i;
                        if (i2 >= 0 && i2 < awVar.getCount()) {
                            azVar = awVar.getItem(i2);
                        }
                    }
                }
                MenuItem menuItem = this.f;
                if (menuItem != azVar) {
                    ax axVar = awVar.a;
                    if (menuItem != null) {
                        this.c.a(axVar, menuItem);
                    }
                    this.f = azVar;
                    if (azVar != null) {
                        this.c.b(axVar, azVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
    }

    static {
        try {
            if (VERSION.SDK_INT <= 28) {
                b = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public cf(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    public final cb a(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.c = this;
        return aVar;
    }

    public final void a(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.p.setEnterTransition(null);
        }
    }

    public final void c(boolean z) {
        if (VERSION.SDK_INT <= 28) {
            Method method = b;
            if (method != null) {
                try {
                    method.invoke(this.p, new Object[]{Boolean.FALSE});
                } catch (Exception unused) {
                }
            }
        } else {
            this.p.setTouchModal(false);
        }
    }

    public final void b(ax axVar, MenuItem menuItem) {
        ce ceVar = this.a;
        if (ceVar != null) {
            ceVar.b(axVar, menuItem);
        }
    }

    public final void a(ax axVar, MenuItem menuItem) {
        ce ceVar = this.a;
        if (ceVar != null) {
            ceVar.a(axVar, menuItem);
        }
    }
}
