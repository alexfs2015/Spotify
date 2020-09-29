package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.spotify.music.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements ak {
    static final a n = new a();
    private final Intent A;
    private final CharSequence B;
    private boolean C;
    private CharSequence D;
    private boolean E;
    private int F;
    private CharSequence G;
    private CharSequence H;
    private boolean I;
    private int J;
    private final Runnable K;
    private Runnable L;
    private final WeakHashMap<String, ConstantState> M;
    private final OnClickListener N;
    private OnKeyListener O;
    private final OnEditorActionListener P;
    private final OnItemClickListener Q;
    private final OnItemSelectedListener R;
    private TextWatcher S;
    final SearchAutoComplete a;
    final View b;
    final ImageView c;
    final ImageView d;
    final ImageView e;
    final ImageView j;
    final View k;
    public b l;
    boolean m;
    private final View o;
    private final View p;
    private d q;
    private Rect r;
    private Rect s;
    private int[] t;
    private int[] u;
    private final ImageView v;
    private final Drawable w;
    private final int x;
    private final int y;
    private final Intent z;

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        SearchView a;
        boolean b;
        private int c;
        private Runnable d;

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.d = new Runnable() {
                public final void run() {
                    SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                    if (searchAutoComplete.b) {
                        ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                        searchAutoComplete.b = false;
                    }
                }
            };
            this.c = getThreshold();
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            int i3 = (i < 960 || i2 < 720 || configuration.orientation != 2) ? (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160 : 256;
            setMinWidth((int) TypedValue.applyDimension(1, (float) i3, displayMetrics));
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.c = i;
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.a.hasFocus() && getVisibility() == 0) {
                this.b = true;
                if (SearchView.a(getContext())) {
                    a aVar = SearchView.n;
                    if (aVar.a != null) {
                        try {
                            aVar.a.invoke(this, new Object[]{Boolean.TRUE});
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.a.h();
        }

        public boolean enoughToFilter() {
            return this.c <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.a.clearFocus();
                        a(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.b) {
                removeCallbacks(this.d);
                post(this.d);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: 0000 */
        public final void a(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.b = false;
                removeCallbacks(this.d);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.b = false;
                removeCallbacks(this.d);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.b = true;
            }
        }
    }

    static class a {
        Method a;
        private Method b;
        private Method c;

        a() {
            try {
                this.b = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.b.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.c = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.c.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.a = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.a.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }
    }

    public interface b {
        boolean a(String str);
    }

    static class c extends jt {
        public static final Creator<c> CREATOR = new ClassLoaderCreator<c>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }
        };
        boolean a;

        c(Parcelable parcelable) {
            super(parcelable);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.a));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.a);
            sb.append("}");
            return sb.toString();
        }
    }

    static class d extends TouchDelegate {
        private final View a;
        private final Rect b = new Rect();
        private final Rect c = new Rect();
        private final Rect d = new Rect();
        private final int e;
        private boolean f;

        public d(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.a = view;
        }

        public final void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x002e
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003a
            L_0x001b:
                boolean r2 = r7.f
                r7.f = r5
                goto L_0x003b
            L_0x0020:
                boolean r2 = r7.f
                if (r2 == 0) goto L_0x003b
                android.graphics.Rect r6 = r7.d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x003b
                r4 = 0
                goto L_0x003b
            L_0x002e:
                android.graphics.Rect r2 = r7.b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003a
                r7.f = r4
                r2 = 1
                goto L_0x003b
            L_0x003a:
                r2 = 0
            L_0x003b:
                if (r2 == 0) goto L_0x0070
                if (r4 == 0) goto L_0x005b
                android.graphics.Rect r2 = r7.c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                android.view.View r0 = r7.a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006a
            L_0x005b:
                android.graphics.Rect r2 = r7.c
                int r2 = r2.left
                int r0 = r0 - r2
                float r0 = (float) r0
                android.graphics.Rect r2 = r7.c
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006a:
                android.view.View r0 = r7.a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0070:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.d.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = new Rect();
        this.s = new Rect();
        this.t = new int[2];
        this.u = new int[2];
        this.K = new Runnable() {
            public final void run() {
                SearchView.this.c();
            }
        };
        this.L = new Runnable() {
            public final void run() {
            }
        };
        this.M = new WeakHashMap<>();
        this.N = new OnClickListener() {
            public final void onClick(View view) {
                if (view == SearchView.this.c) {
                    SearchView.this.g();
                } else if (view == SearchView.this.e) {
                    SearchView.this.f();
                } else if (view == SearchView.this.d) {
                    SearchView.this.e();
                } else if (view == SearchView.this.j) {
                    SearchView searchView = SearchView.this;
                } else {
                    if (view == SearchView.this.a) {
                        SearchView.this.i();
                    }
                }
            }
        };
        this.O = new OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return false;
            }
        };
        this.P = new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchView.this.e();
                return true;
            }
        };
        this.Q = new OnItemClickListener() {
            /* JADX WARNING: type inference failed for: r2v1, types: [jq, java.lang.String] */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v1, types: [jq, java.lang.String]
              assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
              uses: [jq, java.lang.String]
              mth insns count: 13
            	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    androidx.appcompat.widget.SearchView r1 = androidx.appcompat.widget.SearchView.this
                    r2 = 0
                    android.database.Cursor r4 = r2.a()
                    r5 = 0
                    if (r4 == 0) goto L_0x0017
                    boolean r3 = r4.moveToPosition(r3)
                    if (r3 == 0) goto L_0x0017
                    android.content.Intent r2 = r1.a(r4, r5, r2)
                    r1.a(r2)
                L_0x0017:
                    androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.a
                    r2.a(r5)
                    androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r1.a
                    r1.dismissDropDown()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.AnonymousClass9.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        };
        this.R = new OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView searchView = SearchView.this;
                Editable text = searchView.a.getText();
                jq jqVar = null;
                Cursor a2 = jqVar.a();
                if (a2 == null) {
                    return;
                }
                if (a2.moveToPosition(i)) {
                    CharSequence b = jqVar.b(a2);
                    if (b != null) {
                        searchView.b(b);
                    } else {
                        searchView.b((CharSequence) text);
                    }
                } else {
                    searchView.b((CharSequence) text);
                }
            }
        };
        this.S = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.a(charSequence);
            }
        };
        cp a2 = cp.a(context, attributeSet, defpackage.o.a.bZ, i, 0);
        LayoutInflater.from(context).inflate(a2.g(defpackage.o.a.cj, R.layout.abc_search_view), this, true);
        this.a = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.a.a = this;
        this.o = findViewById(R.id.search_edit_frame);
        this.b = findViewById(R.id.search_plate);
        this.p = findViewById(R.id.submit_area);
        this.c = (ImageView) findViewById(R.id.search_button);
        this.d = (ImageView) findViewById(R.id.search_go_btn);
        this.e = (ImageView) findViewById(R.id.search_close_btn);
        this.j = (ImageView) findViewById(R.id.search_voice_btn);
        this.v = (ImageView) findViewById(R.id.search_mag_icon);
        ip.a(this.b, a2.a(defpackage.o.a.ck));
        ip.a(this.p, a2.a(defpackage.o.a.co));
        this.c.setImageDrawable(a2.a(defpackage.o.a.cn));
        this.d.setImageDrawable(a2.a(defpackage.o.a.ch));
        this.e.setImageDrawable(a2.a(defpackage.o.a.ce));
        this.j.setImageDrawable(a2.a(defpackage.o.a.cq));
        this.v.setImageDrawable(a2.a(defpackage.o.a.cn));
        this.w = a2.a(defpackage.o.a.cm);
        cr.a(this.c, getResources().getString(R.string.abc_searchview_description_search));
        this.x = a2.g(defpackage.o.a.cp, R.layout.abc_search_dropdown_item_icons_2line);
        this.y = a2.g(defpackage.o.a.cf, 0);
        this.c.setOnClickListener(this.N);
        this.e.setOnClickListener(this.N);
        this.d.setOnClickListener(this.N);
        this.j.setOnClickListener(this.N);
        this.a.setOnClickListener(this.N);
        this.a.addTextChangedListener(this.S);
        this.a.setOnEditorActionListener(this.P);
        this.a.setOnItemClickListener(this.Q);
        this.a.setOnItemSelectedListener(this.R);
        this.a.setOnKeyListener(this.O);
        this.a.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
            }
        });
        boolean a3 = a2.a(defpackage.o.a.ci, true);
        if (this.m != a3) {
            this.m = a3;
            a(a3);
            p();
        }
        int e2 = a2.e(defpackage.o.a.cb, -1);
        if (e2 != -1) {
            this.F = e2;
            requestLayout();
        }
        this.B = a2.c(defpackage.o.a.cg);
        this.D = a2.c(defpackage.o.a.cl);
        int a4 = a2.a(defpackage.o.a.cd, -1);
        if (a4 != -1) {
            this.a.setImeOptions(a4);
        }
        int a5 = a2.a(defpackage.o.a.cc, -1);
        if (a5 != -1) {
            this.a.setInputType(a5);
        }
        setFocusable(a2.a(defpackage.o.a.ca, true));
        a2.a.recycle();
        this.z = new Intent("android.speech.action.WEB_SEARCH");
        this.z.addFlags(268435456);
        this.z.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.A = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.A.addFlags(268435456);
        this.k = findViewById(this.a.getDropDownAnchor());
        View view = this.k;
        if (view != null) {
            view.addOnLayoutChangeListener(new OnLayoutChangeListener() {
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int i9;
                    SearchView searchView = SearchView.this;
                    if (searchView.k.getWidth() > 1) {
                        Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.b.getPaddingLeft();
                        Rect rect = new Rect();
                        boolean a2 = cv.a(searchView);
                        int dimensionPixelSize = searchView.m ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                        searchView.a.getDropDownBackground().getPadding(rect);
                        if (a2) {
                            i9 = -rect.left;
                        } else {
                            i9 = paddingLeft - (rect.left + dimensionPixelSize);
                        }
                        searchView.a.setDropDownHorizontalOffset(i9);
                        searchView.a.setDropDownWidth((((searchView.k.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    }
                }
            });
        }
        a(this.m);
        p();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.E || !isFocusable()) {
            return false;
        }
        if (this.C) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.a.requestFocus(i, rect);
        if (requestFocus) {
            a(false);
        }
        return requestFocus;
    }

    public void clearFocus() {
        this.E = true;
        super.clearFocus();
        this.a.clearFocus();
        this.a.a(false);
        this.E = false;
    }

    private CharSequence j() {
        CharSequence charSequence = this.D;
        return charSequence != null ? charSequence : this.B;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.a;
            Rect rect = this.r;
            searchAutoComplete.getLocationInWindow(this.t);
            getLocationInWindow(this.u);
            int[] iArr = this.t;
            int i5 = iArr[1];
            int[] iArr2 = this.u;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            this.s.set(this.r.left, 0, this.r.right, i4 - i2);
            d dVar = this.q;
            if (dVar == null) {
                this.q = new d(this.s, this.r, this.a);
                setTouchDelegate(this.q);
                return;
            }
            dVar.a(this.s, this.r);
        }
    }

    private int k() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private int l() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private void a(boolean z2) {
        this.C = z2;
        int i = 0;
        boolean z3 = !TextUtils.isEmpty(this.a.getText());
        this.c.setVisibility(z2 ? 0 : 8);
        b(z3);
        this.o.setVisibility(z2 ? 8 : 0);
        if (this.v.getDrawable() == null || this.m) {
            i = 8;
        }
        this.v.setVisibility(i);
        n();
        c(!z3);
        m();
    }

    private void b(boolean z2) {
        this.d.setVisibility(8);
    }

    private void m() {
        this.p.setVisibility(8);
    }

    private void n() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.a.getText());
        int i = 0;
        if (!z3 && (!this.m || this.I)) {
            z2 = false;
        }
        ImageView imageView = this.e;
        if (!z2) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.e.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    private void o() {
        post(this.K);
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        int[] iArr = this.a.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.b.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.p.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.K);
        post(this.L);
        super.onDetachedFromWindow();
    }

    private CharSequence c(CharSequence charSequence) {
        if (!this.m || this.w == null) {
            return charSequence;
        }
        double textSize = (double) this.a.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.w.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.w), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void p() {
        CharSequence j2 = j();
        SearchAutoComplete searchAutoComplete = this.a;
        if (j2 == null) {
            j2 = "";
        }
        searchAutoComplete.setHint(c(j2));
    }

    private void c(boolean z2) {
        this.j.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    public final void a(CharSequence charSequence) {
        Editable text = this.a.getText();
        this.H = text;
        boolean z2 = !TextUtils.isEmpty(text);
        b(z2);
        c(!z2);
        n();
        m();
        if (this.l != null && !TextUtils.equals(charSequence, this.G)) {
            this.l.a(charSequence.toString());
        }
        this.G = charSequence.toString();
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        Editable text = this.a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.l != null) {
                text.toString();
            }
            this.a.a(false);
            this.a.dismissDropDown();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void f() {
        if (!TextUtils.isEmpty(this.a.getText())) {
            this.a.setText("");
            this.a.requestFocus();
            this.a.a(true);
        } else if (this.m) {
            clearFocus();
            a(true);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void g() {
        a(false);
        this.a.requestFocus();
        this.a.a(true);
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        o();
    }

    public final void a() {
        if (!this.I) {
            this.I = true;
            this.J = this.a.getImeOptions();
            this.a.setImeOptions(this.J | 33554432);
            this.a.setText("");
            g();
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.a = this.C;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.d);
        a(cVar.a);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e2) {
                StringBuilder sb = new StringBuilder("Failed launch activity: ");
                sb.append(intent);
                Log.e("SearchView", sb.toString(), e2);
            }
        }
    }

    public void b(CharSequence charSequence) {
        this.a.setText(charSequence);
        this.a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.H);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        SearchableInfo searchableInfo = null;
        intent.setComponent(searchableInfo.getSearchActivity());
        return intent;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.content.Intent, android.app.SearchableInfo] */
    /* JADX WARNING: type inference failed for: r4v0, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r1v10, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r10 = r10.getPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        r11 = new java.lang.StringBuilder("Search suggestions cursor at row ");
        r11.append(r10);
        r11.append(" returned exception.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005d */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [android.content.Intent, android.app.SearchableInfo]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [android.content.Intent, ?[OBJECT, ARRAY], android.app.SearchableInfo]
      mth insns count: 47
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent a(android.database.Cursor r10, int r11, java.lang.String r12) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = "suggest_intent_action"
            java.lang.String r1 = defpackage.ck.a(r10, r1)     // Catch:{ RuntimeException -> 0x005d }
            if (r1 != 0) goto L_0x000d
            java.lang.String r1 = r0.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x005d }
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            java.lang.String r1 = "android.intent.action.SEARCH"
        L_0x0011:
            r3 = r1
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = defpackage.ck.a(r10, r1)     // Catch:{ RuntimeException -> 0x005d }
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r0.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x005d }
        L_0x001e:
            if (r1 == 0) goto L_0x0040
            java.lang.String r2 = "suggest_intent_data_id"
            java.lang.String r2 = defpackage.ck.a(r10, r2)     // Catch:{ RuntimeException -> 0x005d }
            if (r2 == 0) goto L_0x0040
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x005d }
            r4.<init>()     // Catch:{ RuntimeException -> 0x005d }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x005d }
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch:{ RuntimeException -> 0x005d }
            java.lang.String r1 = android.net.Uri.encode(r2)     // Catch:{ RuntimeException -> 0x005d }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x005d }
            java.lang.String r1 = r4.toString()     // Catch:{ RuntimeException -> 0x005d }
        L_0x0040:
            if (r1 != 0) goto L_0x0044
            r4 = r0
            goto L_0x0049
        L_0x0044:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x005d }
            r4 = r1
        L_0x0049:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r6 = defpackage.ck.a(r10, r1)     // Catch:{ RuntimeException -> 0x005d }
            java.lang.String r1 = "suggest_intent_extra_data"
            java.lang.String r5 = defpackage.ck.a(r10, r1)     // Catch:{ RuntimeException -> 0x005d }
            r2 = r9
            r7 = r11
            r8 = r12
            android.content.Intent r10 = r2.a(r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x005d }
            return r10
        L_0x005d:
            int r10 = r10.getPosition()     // Catch:{ RuntimeException -> 0x0062 }
            goto L_0x0063
        L_0x0062:
            r10 = -1
        L_0x0063:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Search suggestions cursor at row "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = " returned exception."
            r11.append(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.a(android.database.Cursor, int, java.lang.String):android.content.Intent");
    }

    /* access modifiers changed from: 0000 */
    public final void i() {
        if (VERSION.SDK_INT >= 29) {
            this.a.refreshAutoCompleteResults();
            return;
        }
        n.a(this.a);
        n.b(this.a);
    }

    static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.C) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i3 = this.F;
            size = i3 > 0 ? Math.min(i3, size) : Math.min(k(), size);
        } else if (mode == 0) {
            size = this.F;
            if (size <= 0) {
                size = k();
            }
        } else if (mode == 1073741824) {
            int i4 = this.F;
            if (i4 > 0) {
                size = Math.min(i4, size);
            }
        }
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(l(), size2);
        } else if (mode2 == 0) {
            size2 = l();
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        a(this.C);
        o();
        if (this.a.hasFocus()) {
            i();
        }
    }

    public final void b() {
        String str = "";
        this.a.setText(str);
        SearchAutoComplete searchAutoComplete = this.a;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.H = str;
        clearFocus();
        a(true);
        this.a.setImeOptions(this.J);
        this.I = false;
    }
}
