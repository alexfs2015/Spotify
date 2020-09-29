package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ht reason: default package */
public class ht {
    private static final AccessibilityDelegate c = new AccessibilityDelegate();
    final AccessibilityDelegate a;
    final AccessibilityDelegate b;

    /* renamed from: ht$a */
    static final class a extends AccessibilityDelegate {
        private ht a;

        a(ht htVar) {
            this.a = htVar;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.c(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            View view2 = view;
            ja a2 = ja.a(accessibilityNodeInfo);
            boolean H = ip.H(view);
            if (VERSION.SDK_INT >= 28) {
                a2.a.setScreenReaderFocusable(H);
            } else {
                a2.a(1, H);
            }
            boolean J = ip.J(view);
            if (VERSION.SDK_INT >= 28) {
                a2.a.setHeading(J);
            } else {
                a2.a(2, J);
            }
            CharSequence I = ip.I(view);
            if (VERSION.SDK_INT >= 28) {
                a2.a.setPaneTitle(I);
            } else if (VERSION.SDK_INT >= 19) {
                a2.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", I);
            }
            this.a.a(view2, a2);
            CharSequence text = accessibilityNodeInfo.getText();
            if (VERSION.SDK_INT >= 19 && VERSION.SDK_INT < 26) {
                String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
                String str2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
                String str3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
                String str4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
                if (VERSION.SDK_INT >= 19) {
                    a2.a.getExtras().remove(str4);
                    a2.a.getExtras().remove(str3);
                    a2.a.getExtras().remove(str2);
                    a2.a.getExtras().remove(str);
                }
                SparseArray e = ja.e(view);
                if (e != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < e.size(); i++) {
                        if (((WeakReference) e.valueAt(i)).get() == null) {
                            arrayList.add(Integer.valueOf(i));
                        }
                    }
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        e.remove(((Integer) arrayList.get(i2)).intValue());
                    }
                }
                ClickableSpan[] d = ja.d(text);
                if (d != null && d.length > 0) {
                    a2.e().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray e2 = ja.e(view);
                    if (e2 == null) {
                        e2 = new SparseArray();
                        view2.setTag(R.id.tag_accessibility_clickable_spans, e2);
                    }
                    int i3 = 0;
                    while (d != null && i3 < d.length) {
                        int a3 = ja.a(d[i3], e2);
                        e2.put(a3, new WeakReference(d[i3]));
                        ClickableSpan clickableSpan = d[i3];
                        Spanned spanned = (Spanned) text;
                        a2.a(str4).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
                        a2.a(str3).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
                        a2.a(str2).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
                        a2.a(str).add(Integer.valueOf(a3));
                        i3++;
                    }
                }
            }
            List b = ht.b(view);
            for (int i4 = 0; i4 < b.size(); i4++) {
                a2.a((defpackage.ja.a) b.get(i4));
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.b(view, accessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(viewGroup, view, accessibilityEvent);
        }

        public final void sendAccessibilityEvent(View view, int i) {
            this.a.a(view, i);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            jb a2 = this.a.a(view);
            if (a2 != null) {
                return (AccessibilityNodeProvider) a2.a;
            }
            return null;
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.a.a(view, i, bundle);
        }
    }

    public ht() {
        this(c);
    }

    private ht(AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.b = new a(this);
    }

    public final void a(View view, int i) {
        this.a.sendAccessibilityEvent(view, i);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, ja jaVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, jaVar.a);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public jb a(View view) {
        if (VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new jb(accessibilityNodeProvider);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.View r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            java.util.List r0 = b(r7)
            r1 = 0
            r2 = 0
        L_0x0006:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x002c
            java.lang.Object r3 = r0.get(r2)
            ja$a r3 = (defpackage.ja.a) r3
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 21
            if (r4 < r5) goto L_0x0021
            java.lang.Object r4 = r3.d
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r4 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r4
            int r4 = r4.getId()
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            if (r4 != r8) goto L_0x0029
            boolean r0 = r3.a(r7, r9)
            goto L_0x002d
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 != 0) goto L_0x003b
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 16
            if (r2 < r3) goto L_0x003b
            android.view.View$AccessibilityDelegate r0 = r6.a
            boolean r0 = r0.performAccessibilityAction(r7, r8, r9)
        L_0x003b:
            if (r0 != 0) goto L_0x008c
            r2 = 2131427341(0x7f0b000d, float:1.8476296E38)
            if (r8 != r2) goto L_0x008c
            r8 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r8 = r9.getInt(r0, r8)
            r9 = 2131430670(0x7f0b0d0e, float:1.8483048E38)
            java.lang.Object r9 = r7.getTag(r9)
            android.util.SparseArray r9 = (android.util.SparseArray) r9
            r0 = 1
            if (r9 == 0) goto L_0x008b
            java.lang.Object r8 = r9.get(r8)
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8
            if (r8 == 0) goto L_0x008b
            java.lang.Object r8 = r8.get()
            android.text.style.ClickableSpan r8 = (android.text.style.ClickableSpan) r8
            if (r8 == 0) goto L_0x0084
            android.view.accessibility.AccessibilityNodeInfo r9 = r7.createAccessibilityNodeInfo()
            java.lang.CharSequence r9 = r9.getText()
            android.text.style.ClickableSpan[] r9 = defpackage.ja.d(r9)
            r2 = 0
        L_0x0072:
            if (r9 == 0) goto L_0x0084
            int r3 = r9.length
            if (r2 >= r3) goto L_0x0084
            r3 = r9[r2]
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0081
            r9 = 1
            goto L_0x0085
        L_0x0081:
            int r2 = r2 + 1
            goto L_0x0072
        L_0x0084:
            r9 = 0
        L_0x0085:
            if (r9 == 0) goto L_0x008b
            r8.onClick(r7)
            goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht.a(android.view.View, int, android.os.Bundle):boolean");
    }

    static List<defpackage.ja.a> b(View view) {
        List<defpackage.ja.a> list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }
}
