package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import com.spotify.music.R;

public class AppCompatSpinner extends Spinner implements io {
    private static final int[] d = {16843505};
    e a;
    int b;
    final Rect c;
    private final bo e;
    private final Context f;
    private cd g;
    private SpinnerAdapter h;
    private final boolean i;

    class a implements OnClickListener, e {
        private p a;
        private ListAdapter b;
        private CharSequence c;

        a() {
        }

        public final CharSequence a() {
            return this.c;
        }

        public final void a(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public final void a(int i, int i2) {
            if (this.b != null) {
                defpackage.p.a aVar = new defpackage.p.a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.c;
                if (charSequence != null) {
                    aVar.a(charSequence);
                }
                ListAdapter listAdapter = this.b;
                int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
                aVar.a.m = listAdapter;
                aVar.a.n = this;
                aVar.a.s = selectedItemPosition;
                aVar.a.r = true;
                this.a = aVar.a();
                ListView listView = this.a.a.g;
                if (VERSION.SDK_INT >= 17) {
                    listView.setTextDirection(i);
                    listView.setTextAlignment(i2);
                }
                this.a.show();
            }
        }

        public final void a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public final void a(ListAdapter listAdapter) {
            this.b = listAdapter;
        }

        public final void a(CharSequence charSequence) {
            this.c = charSequence;
        }

        public final Drawable b() {
            return null;
        }

        public final void b(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public final int c() {
            return 0;
        }

        public final void c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public final void d() {
            p pVar = this.a;
            if (pVar != null) {
                pVar.dismiss();
                this.a = null;
            }
        }

        public final boolean e() {
            p pVar = this.a;
            if (pVar != null) {
                return pVar.isShowing();
            }
            return false;
        }

        public final int f() {
            return 0;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.b.getItemId(i));
            }
            d();
        }
    }

    static class b implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter a;
        private ListAdapter b;

        public b(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
        }

        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public final int getItemViewType(int i) {
            return 0;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public final boolean isEmpty() {
            return getCount() == 0;
        }

        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class c extends ListPopupWindow implements e {
        CharSequence a;
        ListAdapter b;
        final Rect c = new Rect();
        private int q;

        public c(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.k = AppCompatSpinner.this;
            a(true);
            this.j = 0;
            this.l = new OnItemClickListener(AppCompatSpinner.this) {
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    AppCompatSpinner.this.setSelection(i);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(view, i, c.this.b.getItemId(i));
                    }
                    c.this.d();
                }
            };
        }

        public final CharSequence a() {
            return this.a;
        }

        public final void a(int i, int i2) {
            boolean isShowing = this.p.isShowing();
            h();
            e(2);
            super.d_();
            cb cbVar = this.e;
            cbVar.setChoiceMode(1);
            if (VERSION.SDK_INT >= 17) {
                cbVar.setTextDirection(i);
                cbVar.setTextAlignment(i2);
            }
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            cb cbVar2 = this.e;
            if (this.p.isShowing() && cbVar2 != null) {
                cbVar2.a = false;
                cbVar2.setSelection(selectedItemPosition);
                if (cbVar2.getChoiceMode() != 0) {
                    cbVar2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!isShowing) {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    final AnonymousClass2 r7 = new OnGlobalLayoutListener() {
                        public final void onGlobalLayout() {
                            c cVar = c.this;
                            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                            if (!(ip.E(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(cVar.c))) {
                                c.this.d();
                                return;
                            }
                            c.this.h();
                            c.super.d_();
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(r7);
                    a((OnDismissListener) new OnDismissListener() {
                        public final void onDismiss() {
                            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.removeGlobalOnLayoutListener(r7);
                            }
                        }
                    });
                }
            }
        }

        public final void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.b = listAdapter;
        }

        public final void a(CharSequence charSequence) {
            this.a = charSequence;
        }

        public final void c(int i) {
            this.q = i;
        }

        /* access modifiers changed from: 0000 */
        public final void h() {
            Drawable background = this.p.getBackground();
            int i = 0;
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.c);
                i = cv.a(AppCompatSpinner.this) ? AppCompatSpinner.this.c.right : -AppCompatSpinner.this.c.left;
            } else {
                Rect rect = AppCompatSpinner.this.c;
                AppCompatSpinner.this.c.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            if (AppCompatSpinner.this.b == -2) {
                int a2 = AppCompatSpinner.this.a((SpinnerAdapter) this.b, this.p.getBackground());
                int i2 = (AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.c.left) - AppCompatSpinner.this.c.right;
                if (a2 > i2) {
                    a2 = i2;
                }
                d(Math.max(a2, (width - paddingLeft) - paddingRight));
            } else if (AppCompatSpinner.this.b == -1) {
                d((width - paddingLeft) - paddingRight);
            } else {
                d(AppCompatSpinner.this.b);
            }
            this.g = cv.a(AppCompatSpinner.this) ? i + (((width - paddingRight) - this.f) - this.q) : i + paddingLeft + this.q;
        }
    }

    static class d extends BaseSavedState {
        public static final Creator<d> CREATOR = new Creator<d>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new d[i];
            }
        };
        boolean a;

        d(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : 0);
        }
    }

    interface e {
        CharSequence a();

        void a(int i);

        void a(int i, int i2);

        void a(Drawable drawable);

        void a(ListAdapter listAdapter);

        void a(CharSequence charSequence);

        Drawable b();

        void b(int i);

        int c();

        void c(int i);

        void d();

        boolean e();

        int f();
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    private AppCompatSpinner(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, -1, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r1 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r1 != null) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AppCompatSpinner(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            r5.c = r10
            int[] r10 = defpackage.o.a.cr
            r0 = 0
            cp r10 = defpackage.cp.a(r6, r7, r10, r8, r0)
            bo r1 = new bo
            r1.<init>(r5)
            r5.e = r1
            int r1 = defpackage.o.a.cw
            int r1 = r10.g(r1, r0)
            if (r1 == 0) goto L_0x0028
            al r2 = new al
            r2.<init>(r6, r1)
            r5.f = r2
            goto L_0x002a
        L_0x0028:
            r5.f = r6
        L_0x002a:
            r1 = -1
            r2 = 0
            if (r9 != r1) goto L_0x0054
            int[] r1 = d     // Catch:{ Exception -> 0x0050, all -> 0x0048 }
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r1, r8, r0)     // Catch:{ Exception -> 0x0050, all -> 0x0048 }
            boolean r3 = r1.hasValue(r0)     // Catch:{ Exception -> 0x0046, all -> 0x0044 }
            if (r3 == 0) goto L_0x003e
            int r9 = r1.getInt(r0, r0)     // Catch:{ Exception -> 0x0046, all -> 0x0044 }
        L_0x003e:
            if (r1 == 0) goto L_0x0054
        L_0x0040:
            r1.recycle()
            goto L_0x0054
        L_0x0044:
            r6 = move-exception
            goto L_0x004a
        L_0x0046:
            goto L_0x0051
        L_0x0048:
            r6 = move-exception
            r1 = r2
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r1.recycle()
        L_0x004f:
            throw r6
        L_0x0050:
            r1 = r2
        L_0x0051:
            if (r1 == 0) goto L_0x0054
            goto L_0x0040
        L_0x0054:
            r1 = 1
            if (r9 == 0) goto L_0x0092
            if (r9 == r1) goto L_0x005a
            goto L_0x00a4
        L_0x005a:
            androidx.appcompat.widget.AppCompatSpinner$c r9 = new androidx.appcompat.widget.AppCompatSpinner$c
            android.content.Context r3 = r5.f
            r9.<init>(r3, r7, r8)
            android.content.Context r3 = r5.f
            int[] r4 = defpackage.o.a.cr
            cp r0 = defpackage.cp.a(r3, r7, r4, r8, r0)
            int r3 = defpackage.o.a.cv
            r4 = -2
            int r3 = r0.f(r3, r4)
            r5.b = r3
            int r3 = defpackage.o.a.ct
            android.graphics.drawable.Drawable r3 = r0.a(r3)
            r9.a(r3)
            int r3 = defpackage.o.a.cu
            java.lang.String r3 = r10.d(r3)
            r9.a = r3
            android.content.res.TypedArray r0 = r0.a
            r0.recycle()
            r5.a = r9
            androidx.appcompat.widget.AppCompatSpinner$1 r0 = new androidx.appcompat.widget.AppCompatSpinner$1
            r0.<init>(r5, r9)
            r5.g = r0
            goto L_0x00a4
        L_0x0092:
            androidx.appcompat.widget.AppCompatSpinner$a r9 = new androidx.appcompat.widget.AppCompatSpinner$a
            r9.<init>()
            r5.a = r9
            androidx.appcompat.widget.AppCompatSpinner$e r9 = r5.a
            int r0 = defpackage.o.a.cu
            java.lang.String r0 = r10.d(r0)
            r9.a(r0)
        L_0x00a4:
            int r9 = defpackage.o.a.cs
            android.content.res.TypedArray r0 = r10.a
            java.lang.CharSequence[] r9 = r0.getTextArray(r9)
            if (r9 == 0) goto L_0x00bf
            android.widget.ArrayAdapter r0 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r0.<init>(r6, r3, r9)
            r6 = 2131624699(0x7f0e02fb, float:1.8876585E38)
            r0.setDropDownViewResource(r6)
            r5.setAdapter(r0)
        L_0x00bf:
            android.content.res.TypedArray r6 = r10.a
            r6.recycle()
            r5.i = r1
            android.widget.SpinnerAdapter r6 = r5.h
            if (r6 == 0) goto L_0x00cf
            r5.setAdapter(r6)
            r5.h = r2
        L_0x00cf:
            bo r6 = r5.e
            r6.a(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: 0000 */
    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.c);
            i3 += this.c.left + this.c.right;
        }
        return i3;
    }

    public final void a(ColorStateList colorStateList) {
        bo boVar = this.e;
        if (boVar != null) {
            boVar.a(colorStateList);
        }
    }

    public final void a(Mode mode) {
        bo boVar = this.e;
        if (boVar != null) {
            boVar.a(mode);
        }
    }

    public final Mode b() {
        bo boVar = this.e;
        if (boVar != null) {
            return boVar.c();
        }
        return null;
    }

    public final ColorStateList b_() {
        bo boVar = this.e;
        if (boVar != null) {
            return boVar.b();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        if (VERSION.SDK_INT >= 17) {
            this.a.a(getTextDirection(), getTextAlignment());
        } else {
            this.a.a(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        bo boVar = this.e;
        if (boVar != null) {
            boVar.d();
        }
    }

    public int getDropDownHorizontalOffset() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.f();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.c();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.a != null) {
            return this.b;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.b();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f;
    }

    public CharSequence getPrompt() {
        e eVar = this.a;
        return eVar != null ? eVar.a() : super.getPrompt();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.a;
        if (eVar != null && eVar.e()) {
            this.a.d();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.a != null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        if (dVar.a) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                    public final void onGlobalLayout() {
                        if (!AppCompatSpinner.this.a.e()) {
                            AppCompatSpinner.this.c();
                        }
                        ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            if (VERSION.SDK_INT >= 16) {
                                viewTreeObserver.removeOnGlobalLayoutListener(this);
                                return;
                            }
                            viewTreeObserver.removeGlobalOnLayoutListener(this);
                        }
                    }
                });
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        e eVar = this.a;
        dVar.a = eVar != null && eVar.e();
        return dVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        cd cdVar = this.g;
        if (cdVar == null || !cdVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        e eVar = this.a;
        if (eVar == null) {
            return super.performClick();
        }
        if (!eVar.e()) {
            c();
        }
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        super.setAdapter(spinnerAdapter);
        if (this.a != null) {
            Context context = this.f;
            if (context == null) {
                context = getContext();
            }
            this.a.a((ListAdapter) new b(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        bo boVar = this.e;
        if (boVar != null) {
            boVar.a();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        bo boVar = this.e;
        if (boVar != null) {
            boVar.a(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.c(i2);
            this.a.b(i2);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    public void setDropDownVerticalOffset(int i2) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.a(i2);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.a != null) {
            this.b = i2;
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.a(drawable);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(ab.b(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }
}
