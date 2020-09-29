package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.spotify.music.R;
import java.lang.reflect.Field;

/* renamed from: cb reason: default package */
public class cb extends ListView {
    public boolean a;
    b b;
    private final Rect c = new Rect();
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h;
    private Field i;
    private a j;
    private boolean k;
    private boolean l;
    private jk m;

    /* renamed from: cb$a */
    static class a extends ae {
        boolean b = true;

        a(Drawable drawable) {
            super(drawable);
        }

        public final void draw(Canvas canvas) {
            if (this.b) {
                super.draw(canvas);
            }
        }

        public final void setHotspot(float f, float f2) {
            if (this.b) {
                super.setHotspot(f, f2);
            }
        }

        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public final boolean setState(int[] iArr) {
            if (this.b) {
                return super.setState(iArr);
            }
            return false;
        }

        public final boolean setVisible(boolean z, boolean z2) {
            if (this.b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: cb$b */
    class b implements Runnable {
        b() {
        }

        public final void run() {
            cb cbVar = cb.this;
            cbVar.b = null;
            cbVar.drawableStateChanged();
        }
    }

    public cb(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.k = z;
        setCacheColorHint(0);
        try {
            this.i = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.i.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void a() {
        Drawable selector = getSelector();
        if (selector != null && this.l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void a(int i2, View view) {
        Rect rect = this.c;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.d;
        rect.top -= this.e;
        rect.right += this.f;
        rect.bottom += this.g;
        try {
            boolean z = this.i.getBoolean(this);
            if (view.isEnabled() != z) {
                this.i.set(this, Boolean.valueOf(!z));
                if (i2 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void a(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.b = z;
        }
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = i7;
        View view = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            view.measure(i2, layoutParams.height > 0 ? MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i9 > 0) {
                i8 += dividerHeight;
            }
            i8 += view.getMeasuredHeight();
            if (i8 >= i5) {
                return (i6 < 0 || i9 <= i6 || i11 <= 0 || i8 == i5) ? i5 : i11;
            }
            if (i6 >= 0 && i9 >= i6) {
                i11 = i8;
            }
            i9++;
        }
        return i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.MotionEvent r12, int r13) {
        /*
            r11 = this;
            int r0 = r12.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0018
            r3 = 2
            if (r0 == r3) goto L_0x0016
            r13 = 3
            if (r0 == r13) goto L_0x0012
        L_0x000e:
            r13 = 0
            r3 = 1
            goto L_0x00db
        L_0x0012:
            r13 = 0
            r3 = 0
            goto L_0x00db
        L_0x0016:
            r3 = 1
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            int r13 = r12.findPointerIndex(r13)
            if (r13 >= 0) goto L_0x0020
            goto L_0x0012
        L_0x0020:
            float r4 = r12.getX(r13)
            int r4 = (int) r4
            float r13 = r12.getY(r13)
            int r13 = (int) r13
            int r5 = r11.pointToPosition(r4, r13)
            r6 = -1
            if (r5 != r6) goto L_0x0034
            r13 = 1
            goto L_0x00db
        L_0x0034:
            int r3 = r11.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r11.getChildAt(r3)
            float r4 = (float) r4
            float r13 = (float) r13
            r11.l = r1
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r7 < r8) goto L_0x004b
            r11.drawableHotspotChanged(r4, r13)
        L_0x004b:
            boolean r7 = r11.isPressed()
            if (r7 != 0) goto L_0x0054
            r11.setPressed(r1)
        L_0x0054:
            r11.layoutChildren()
            int r7 = r11.h
            if (r7 == r6) goto L_0x0071
            int r9 = r11.getFirstVisiblePosition()
            int r7 = r7 - r9
            android.view.View r7 = r11.getChildAt(r7)
            if (r7 == 0) goto L_0x0071
            if (r7 == r3) goto L_0x0071
            boolean r9 = r7.isPressed()
            if (r9 == 0) goto L_0x0071
            r7.setPressed(r2)
        L_0x0071:
            r11.h = r5
            int r7 = r3.getLeft()
            float r7 = (float) r7
            float r7 = r4 - r7
            int r9 = r3.getTop()
            float r9 = (float) r9
            float r9 = r13 - r9
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r8) goto L_0x0088
            r3.drawableHotspotChanged(r7, r9)
        L_0x0088:
            boolean r7 = r3.isPressed()
            if (r7 != 0) goto L_0x0091
            r3.setPressed(r1)
        L_0x0091:
            android.graphics.drawable.Drawable r7 = r11.getSelector()
            if (r7 == 0) goto L_0x009b
            if (r5 == r6) goto L_0x009b
            r8 = 1
            goto L_0x009c
        L_0x009b:
            r8 = 0
        L_0x009c:
            if (r8 == 0) goto L_0x00a1
            r7.setVisible(r2, r2)
        L_0x00a1:
            r11.a(r5, r3)
            if (r8 == 0) goto L_0x00bf
            android.graphics.Rect r8 = r11.c
            float r9 = r8.exactCenterX()
            float r8 = r8.exactCenterY()
            int r10 = r11.getVisibility()
            if (r10 != 0) goto L_0x00b8
            r10 = 1
            goto L_0x00b9
        L_0x00b8:
            r10 = 0
        L_0x00b9:
            r7.setVisible(r10, r2)
            defpackage.gm.a(r7, r9, r8)
        L_0x00bf:
            android.graphics.drawable.Drawable r7 = r11.getSelector()
            if (r7 == 0) goto L_0x00ca
            if (r5 == r6) goto L_0x00ca
            defpackage.gm.a(r7, r4, r13)
        L_0x00ca:
            r11.a(r2)
            r11.refreshDrawableState()
            if (r0 != r1) goto L_0x000e
            long r6 = r11.getItemIdAtPosition(r5)
            r11.performItemClick(r3, r5, r6)
            goto L_0x000e
        L_0x00db:
            if (r3 == 0) goto L_0x00df
            if (r13 == 0) goto L_0x00f7
        L_0x00df:
            r11.l = r2
            r11.setPressed(r2)
            r11.drawableStateChanged()
            int r13 = r11.h
            int r0 = r11.getFirstVisiblePosition()
            int r13 = r13 - r0
            android.view.View r13 = r11.getChildAt(r13)
            if (r13 == 0) goto L_0x00f7
            r13.setPressed(r2)
        L_0x00f7:
            if (r3 == 0) goto L_0x010f
            jk r13 = r11.m
            if (r13 != 0) goto L_0x0104
            jk r13 = new jk
            r13.<init>(r11)
            r11.m = r13
        L_0x0104:
            jk r13 = r11.m
            r13.a(r1)
            jk r13 = r11.m
            r13.onTouch(r11, r12)
            goto L_0x0116
        L_0x010f:
            jk r12 = r11.m
            if (r12 == 0) goto L_0x0116
            r12.a(r2)
        L_0x0116:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb.a(android.view.MotionEvent, int):boolean");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!this.c.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.c);
                selector.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.b == null) {
            super.drawableStateChanged();
            a(true);
            a();
        }
    }

    public boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.k || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.k && this.a) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.b == null) {
            this.b = new b();
            b bVar = this.b;
            cb.this.post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.b;
        if (bVar != null) {
            cb.this.b = null;
            cb.this.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setSelector(Drawable drawable) {
        this.j = drawable != null ? new a(drawable) : null;
        super.setSelector(this.j);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }
}
