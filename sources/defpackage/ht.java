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
        final ht a;

        a(ht htVar) {
            this.a = htVar;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            jb a2 = this.a.a(view);
            if (a2 != null) {
                return (AccessibilityNodeProvider) a2.a;
            }
            return null;
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

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.a.a(view, i, bundle);
        }

        public final void sendAccessibilityEvent(View view, int i) {
            this.a.a(view, i);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public ht() {
        this(c);
    }

    public ht(AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.b = new a(this);
    }

    static List<defpackage.ja.a> b(View view) {
        List<defpackage.ja.a> list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
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

    public final void a(View view, int i) {
        this.a.sendAccessibilityEvent(view, i);
    }

    public void a(View view, ja jaVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, jaVar.a);
    }

    public boolean a(View view, int i, Bundle bundle) {
        boolean z;
        boolean z2;
        List b2 = b(view);
        int i2 = 0;
        while (true) {
            if (i2 >= b2.size()) {
                z = false;
                break;
            }
            defpackage.ja.a aVar = (defpackage.ja.a) b2.get(i2);
            if (aVar.a() == i) {
                z = aVar.a(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && VERSION.SDK_INT >= 16) {
            z = this.a.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null) {
            WeakReference weakReference = (WeakReference) sparseArray.get(i3);
            if (weakReference != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    ClickableSpan[] d = ja.d(view.createAccessibilityNodeInfo().getText());
                    int i4 = 0;
                    while (true) {
                        if (d == null || i4 >= d.length) {
                            break;
                        } else if (clickableSpan.equals(d[i4])) {
                            z2 = true;
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
