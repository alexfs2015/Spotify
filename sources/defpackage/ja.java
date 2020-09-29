package defpackage;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ja reason: default package */
public final class ja {
    private static int d;
    public final AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

    /* renamed from: ja$a */
    public static class a {
        public static final a a = new a(1, null);
        public static final a b = new a(2, null);
        public static final a c = new a(16, null);
        public static final a d = new a(4096, null);
        public static final a e = new a(8192, null);
        final Object f;
        public final int g;
        public final Class<? extends defpackage.jc.a> h;
        private final CharSequence i;
        private jc j;

        static {
            AccessibilityAction accessibilityAction = null;
            new a(4, null);
            new a(8, null);
            new a(32, null);
            new a(64, null);
            new a(128, null);
            new a(256, null, defpackage.jc.b.class);
            new a(512, null, defpackage.jc.b.class);
            new a(1024, null, defpackage.jc.c.class);
            new a(2048, null, defpackage.jc.c.class);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, null, g.class);
            new a(262144, null);
            new a(524288, null);
            new a(1048576, null);
            new a(2097152, null, h.class);
            new a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, e.class);
            new a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            new a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            new a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            new a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            new a(VERSION.SDK_INT >= 24 ? AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, f.class);
            new a(VERSION.SDK_INT >= 26 ? AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, d.class);
            new a(VERSION.SDK_INT >= 28 ? AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            if (VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new a(accessibilityAction, 16908357, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, null, null, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends defpackage.jc.a> cls) {
            this(null, i2, null, null, cls);
        }

        public a(Object obj, int i2, CharSequence charSequence, jc jcVar, Class<? extends defpackage.jc.a> cls) {
            this.g = i2;
            this.i = charSequence;
            this.j = jcVar;
            if (VERSION.SDK_INT < 21 || obj != null) {
                this.f = obj;
            } else {
                this.f = new AccessibilityAction(i2, charSequence);
            }
            this.h = cls;
        }

        public final int a() {
            if (VERSION.SDK_INT >= 21) {
                return ((AccessibilityAction) this.f).getId();
            }
            return 0;
        }

        public final boolean a(View view, Bundle bundle) {
            if (this.j == null) {
                return false;
            }
            Class<? extends defpackage.jc.a> cls = this.h;
            if (cls != null) {
                try {
                    ((defpackage.jc.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).a = bundle;
                } catch (Exception e2) {
                    Class<? extends defpackage.jc.a> cls2 = this.h;
                    String name = cls2 == null ? "null" : cls2.getName();
                    StringBuilder sb = new StringBuilder("Failed to execute command with argument class ViewCommandArgument: ");
                    sb.append(name);
                    Log.e("A11yActionCompat", sb.toString(), e2);
                }
            }
            return this.j.a(view);
        }
    }

    /* renamed from: ja$b */
    public static class b {
        final Object a;

        private b(Object obj) {
            this.a = obj;
        }

        public static b a(int i, int i2, boolean z, int i3) {
            return VERSION.SDK_INT >= 21 ? new b(CollectionInfo.obtain(i, i2, z, i3)) : VERSION.SDK_INT >= 19 ? new b(CollectionInfo.obtain(i, i2, z)) : new b(null);
        }
    }

    /* renamed from: ja$c */
    public static class c {
        final Object a;

        private c(Object obj) {
            this.a = obj;
        }

        public static c a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return VERSION.SDK_INT >= 21 ? new c(CollectionItemInfo.obtain(i, i2, i3, i4, false, false)) : VERSION.SDK_INT >= 19 ? new c(CollectionItemInfo.obtain(i, i2, i3, i4, false)) : new c(null);
        }
    }

    private ja(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static int a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = d;
        d = i2 + 1;
        return i2;
    }

    public static ja a() {
        return a(AccessibilityNodeInfo.obtain());
    }

    public static ja a(View view) {
        return a(AccessibilityNodeInfo.obtain(view));
    }

    public static ja a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new ja(accessibilityNodeInfo);
    }

    public static ja a(ja jaVar) {
        return a(AccessibilityNodeInfo.obtain(jaVar.a));
    }

    public static ClickableSpan[] d(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static SparseArray<WeakReference<ClickableSpan>> e(View view) {
        return (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
    }

    public List<Integer> a(String str) {
        if (VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            integerArrayList = new ArrayList();
            this.a.getExtras().putIntegerArrayList(str, integerArrayList);
        }
        return integerArrayList;
    }

    public final void a(int i) {
        this.a.addAction(i);
    }

    public void a(int i, boolean z) {
        Bundle e = e();
        if (e != null) {
            String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
            int i2 = e.getInt(str, 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            e.putInt(str, i | i2);
        }
    }

    public final void a(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public final void a(View view, int i) {
        this.c = i;
        if (VERSION.SDK_INT >= 16) {
            this.a.setSource(view, i);
        }
    }

    public final void a(a aVar) {
        if (VERSION.SDK_INT >= 21) {
            this.a.addAction((AccessibilityAction) aVar.f);
        }
    }

    public final void a(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public final void a(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.a.setCollectionInfo(obj == null ? null : (CollectionInfo) ((b) obj).a);
        }
    }

    public final void a(boolean z) {
        this.a.setCheckable(z);
    }

    public final void b(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public final void b(View view) {
        this.c = -1;
        this.a.setSource(view);
    }

    public final void b(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            this.a.addChild(view, i);
        }
    }

    public final void b(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final void b(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.a.setCollectionItemInfo(obj == null ? null : (CollectionItemInfo) ((c) obj).a);
        }
    }

    public final void b(boolean z) {
        this.a.setFocusable(z);
    }

    public final boolean b() {
        if (VERSION.SDK_INT >= 16) {
            return this.a.isVisibleToUser();
        }
        return false;
    }

    public final boolean b(a aVar) {
        if (VERSION.SDK_INT >= 21) {
            return this.a.removeAction((AccessibilityAction) aVar.f);
        }
        return false;
    }

    public final void c(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public final void c(View view) {
        this.a.addChild(view);
    }

    public final void c(View view, int i) {
        this.b = -1;
        if (VERSION.SDK_INT >= 16) {
            this.a.setParent(view, -1);
        }
    }

    public final void c(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void c(boolean z) {
        this.a.setFocused(z);
    }

    public final boolean c() {
        if (VERSION.SDK_INT >= 16) {
            return this.a.isAccessibilityFocused();
        }
        return false;
    }

    public final CharSequence d() {
        String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
        if (!(!a(str).isEmpty())) {
            return this.a.getText();
        }
        List a2 = a(str);
        List a3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List a4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List a5 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        for (int i = 0; i < a2.size(); i++) {
            spannableString.setSpan(new ix(((Integer) a5.get(i)).intValue(), this, e().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) a2.get(i)).intValue(), ((Integer) a3.get(i)).intValue(), ((Integer) a4.get(i)).intValue());
        }
        return spannableString;
    }

    public final void d(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void d(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public final void d(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.a.setVisibleToUser(z);
        }
    }

    public final Bundle e() {
        return VERSION.SDK_INT >= 19 ? this.a.getExtras() : new Bundle();
    }

    public final void e(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public final void e(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.a.setAccessibilityFocused(z);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ja jaVar = (ja) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (jaVar.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(jaVar.a)) {
            return false;
        }
        return this.c == jaVar.c && this.b == jaVar.b;
    }

    public final void f(boolean z) {
        this.a.setSelected(z);
    }

    public final void g(boolean z) {
        this.a.setClickable(z);
    }

    public final void h(boolean z) {
        this.a.setLongClickable(z);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(boolean z) {
        this.a.setEnabled(z);
    }

    public final void j(boolean z) {
        this.a.setScrollable(z);
    }

    public final void k(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.a.setDismissable(z);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        StringBuilder sb2 = new StringBuilder("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        c(rect);
        StringBuilder sb3 = new StringBuilder("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(this.a.getPackageName());
        sb.append("; className: ");
        sb.append(this.a.getClassName());
        sb.append("; text: ");
        sb.append(d());
        sb.append("; contentDescription: ");
        sb.append(this.a.getContentDescription());
        sb.append("; viewId: ");
        sb.append(VERSION.SDK_INT >= 18 ? this.a.getViewIdResourceName() : null);
        sb.append("; checkable: ");
        sb.append(this.a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.a.isFocused());
        sb.append("; selected: ");
        sb.append(this.a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.a.isEnabled());
        sb.append("; password: ");
        sb.append(this.a.isPassword());
        StringBuilder sb4 = new StringBuilder("; scrollable: ");
        sb4.append(this.a.isScrollable());
        sb.append(sb4.toString());
        sb.append("; [");
        int actions = this.a.getActions();
        while (actions != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            actions &= numberOfTrailingZeros ^ -1;
            if (numberOfTrailingZeros == 1) {
                str = "ACTION_FOCUS";
            } else if (numberOfTrailingZeros != 2) {
                switch (numberOfTrailingZeros) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case 32:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case defpackage.eu.b.bs /*64*/:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case 65536:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    default:
                        str = "ACTION_UNKNOWN";
                        break;
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            sb.append(str);
            if (actions != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
