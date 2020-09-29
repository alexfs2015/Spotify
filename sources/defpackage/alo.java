package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.internal.FetchedAppSettingsManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: alo reason: default package */
public class alo {
    /* access modifiers changed from: private */
    public static final String e = alo.class.getCanonicalName();
    public final Handler a = new Handler(Looper.getMainLooper());
    public Set<Activity> b = new HashSet();
    public Set<b> c = new HashSet();
    public HashMap<String, String> d = new HashMap<>();

    /* renamed from: alo$a */
    public static class a {
        String a;
        private WeakReference<View> b;

        public a(View view, String str) {
            this.b = new WeakReference<>(view);
            this.a = str;
        }

        public final View a() {
            WeakReference<View> weakReference = this.b;
            if (weakReference == null) {
                return null;
            }
            return (View) weakReference.get();
        }
    }

    /* renamed from: alo$b */
    public static class b implements OnGlobalLayoutListener, OnScrollChangedListener, Runnable {
        private WeakReference<View> a;
        private List<EventBinding> b;
        private final Handler c;
        private HashMap<String, String> d;
        private final String e;

        public b(View view, Handler handler, HashMap<String, String> hashMap, String str) {
            this.a = new WeakReference<>(view);
            this.c = handler;
            this.d = hashMap;
            this.e = str;
            this.c.postDelayed(this, 200);
        }

        private static List<View> a(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        public static List<a> a(EventBinding eventBinding, View view, List<PathComponent> list, int i, int i2, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = ".";
            sb.append(str2);
            sb.append(String.valueOf(i2));
            String sb2 = sb.toString();
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            if (i >= list.size()) {
                arrayList.add(new a(view, sb2));
            } else {
                PathComponent pathComponent = (PathComponent) list.get(i);
                if (pathComponent.a.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        List a2 = a((ViewGroup) parent);
                        int size = a2.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.addAll(a(eventBinding, (View) a2.get(i3), list, i + 1, i3, sb2));
                        }
                    }
                    return arrayList;
                } else if (pathComponent.a.equals(str2)) {
                    arrayList.add(new a(view, sb2));
                    return arrayList;
                } else if (!a(view, pathComponent, i2)) {
                    return arrayList;
                } else {
                    if (i == list.size() - 1) {
                        arrayList.add(new a(view, sb2));
                    }
                }
            }
            if (view instanceof ViewGroup) {
                List a3 = a((ViewGroup) view);
                int size2 = a3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.addAll(a(eventBinding, (View) a3.get(i4), list, i + 1, i4, sb2));
                }
            }
            return arrayList;
        }

        private void a() {
            if (this.b != null && this.a.get() != null) {
                for (int i = 0; i < this.b.size(); i++) {
                    a((EventBinding) this.b.get(i), (View) this.a.get());
                }
            }
        }

        private void a(a aVar, View view, View view2, EventBinding eventBinding) {
            if (eventBinding != null) {
                View a2 = aVar.a();
                if (a2 != null && alt.a(a2, view2)) {
                    String str = aVar.a;
                    OnTouchListener e2 = alt.e(a2);
                    boolean z = true;
                    boolean z2 = e2 != null;
                    boolean z3 = z2 && (e2 instanceof defpackage.alp.a);
                    if (!z3 || !((defpackage.alp.a) e2).a) {
                        z = false;
                    }
                    if (!this.d.containsKey(str) && (!z2 || !z3 || !z)) {
                        a2.setOnTouchListener(alp.a(eventBinding, view, a2));
                        this.d.put(str, eventBinding.a);
                    }
                }
            }
        }

        private void a(a aVar, View view, EventBinding eventBinding) {
            if (eventBinding != null) {
                try {
                    View a2 = aVar.a();
                    if (a2 != null) {
                        View f = alt.f(a2);
                        if (f != null && alt.a(a2, f)) {
                            a(aVar, view, f, eventBinding);
                        } else if (!a2.getClass().getName().startsWith("com.facebook.react")) {
                            String str = aVar.a;
                            AccessibilityDelegate d2 = alt.d(a2);
                            boolean z = true;
                            boolean z2 = d2 != null;
                            boolean z3 = z2 && (d2 instanceof defpackage.aln.a);
                            if (!z3 || !((defpackage.aln.a) d2).a) {
                                z = false;
                            }
                            if (!this.d.containsKey(str) && (!z2 || !z3 || !z)) {
                                a2.setAccessibilityDelegate(aln.a(eventBinding, view, a2));
                                this.d.put(str, eventBinding.a);
                            }
                        }
                    }
                } catch (FacebookException e2) {
                    Log.e(alo.e, "Failed to attach auto logging event listener.", e2);
                }
            }
        }

        private void a(EventBinding eventBinding, View view) {
            if (eventBinding != null && view != null && (TextUtils.isEmpty(eventBinding.e) || eventBinding.e.equals(this.e))) {
                List unmodifiableList = Collections.unmodifiableList(eventBinding.c);
                if (unmodifiableList.size() <= 25) {
                    for (a a2 : a(eventBinding, view, unmodifiableList, 0, -1, this.e)) {
                        a(a2, view, eventBinding);
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
            if (r5.getClass().getSimpleName().equals(r7[r7.length - 1]) == false) goto L_0x0043;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean a(android.view.View r5, com.facebook.appevents.codeless.internal.PathComponent r6, int r7) {
            /*
                int r0 = r6.b
                r1 = 0
                r2 = -1
                if (r0 == r2) goto L_0x000b
                int r0 = r6.b
                if (r7 == r0) goto L_0x000b
                return r1
            L_0x000b:
                java.lang.Class r7 = r5.getClass()
                java.lang.String r7 = r7.getCanonicalName()
                java.lang.String r0 = r6.a
                boolean r7 = r7.equals(r0)
                r0 = 1
                if (r7 != 0) goto L_0x0044
                java.lang.String r7 = r6.a
                java.lang.String r2 = ".*android\\..*"
                boolean r7 = r7.matches(r2)
                if (r7 == 0) goto L_0x0043
                java.lang.String r7 = r6.a
                java.lang.String r2 = "\\."
                java.lang.String[] r7 = r7.split(r2)
                int r2 = r7.length
                if (r2 <= 0) goto L_0x0043
                int r2 = r7.length
                int r2 = r2 - r0
                r7 = r7[r2]
                java.lang.Class r2 = r5.getClass()
                java.lang.String r2 = r2.getSimpleName()
                boolean r7 = r2.equals(r7)
                if (r7 != 0) goto L_0x0044
            L_0x0043:
                return r1
            L_0x0044:
                int r7 = r6.h
                com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r2 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.ID
                int r2 = r2.value
                r7 = r7 & r2
                if (r7 <= 0) goto L_0x0056
                int r7 = r6.c
                int r2 = r5.getId()
                if (r7 == r2) goto L_0x0056
                return r1
            L_0x0056:
                int r7 = r6.h
                com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r2 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TEXT
                int r2 = r2.value
                r7 = r7 & r2
                java.lang.String r2 = ""
                if (r7 <= 0) goto L_0x007c
                java.lang.String r7 = r6.d
                java.lang.String r3 = defpackage.alt.b(r5)
                java.lang.String r4 = defpackage.ank.c(r3)
                java.lang.String r4 = defpackage.ank.a(r4, r2)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x007c
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x007c
                return r1
            L_0x007c:
                int r7 = r6.h
                com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r3 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.DESCRIPTION
                int r3 = r3.value
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x00ac
                java.lang.String r7 = r6.f
                java.lang.CharSequence r3 = r5.getContentDescription()
                if (r3 != 0) goto L_0x008f
                r3 = r2
                goto L_0x0097
            L_0x008f:
                java.lang.CharSequence r3 = r5.getContentDescription()
                java.lang.String r3 = java.lang.String.valueOf(r3)
            L_0x0097:
                java.lang.String r4 = defpackage.ank.c(r3)
                java.lang.String r4 = defpackage.ank.a(r4, r2)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x00ac
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x00ac
                return r1
            L_0x00ac:
                int r7 = r6.h
                com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r3 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.HINT
                int r3 = r3.value
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x00d0
                java.lang.String r7 = r6.g
                java.lang.String r3 = defpackage.alt.c(r5)
                java.lang.String r4 = defpackage.ank.c(r3)
                java.lang.String r4 = defpackage.ank.a(r4, r2)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x00d0
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x00d0
                return r1
            L_0x00d0:
                int r7 = r6.h
                com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r3 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TAG
                int r3 = r3.value
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x0100
                java.lang.String r6 = r6.e
                java.lang.Object r7 = r5.getTag()
                if (r7 != 0) goto L_0x00e3
                r5 = r2
                goto L_0x00eb
            L_0x00e3:
                java.lang.Object r5 = r5.getTag()
                java.lang.String r5 = java.lang.String.valueOf(r5)
            L_0x00eb:
                java.lang.String r7 = defpackage.ank.c(r5)
                java.lang.String r7 = defpackage.ank.a(r7, r2)
                boolean r5 = r6.equals(r5)
                if (r5 != 0) goto L_0x0100
                boolean r5 = r6.equals(r7)
                if (r5 != 0) goto L_0x0100
                return r1
            L_0x0100:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.alo.b.a(android.view.View, com.facebook.appevents.codeless.internal.PathComponent, int):boolean");
        }

        public final void onGlobalLayout() {
            a();
        }

        public final void onScrollChanged() {
            a();
        }

        public final void run() {
            amu a2 = FetchedAppSettingsManager.a(akq.k());
            if (a2 != null && a2.j) {
                this.b = EventBinding.a(a2.l);
                if (this.b != null) {
                    View view = (View) this.a.get();
                    if (view != null) {
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        a();
                    }
                }
            }
        }
    }

    public static Bundle a(EventBinding eventBinding, View view, View view2) {
        List list;
        Bundle bundle = new Bundle();
        if (eventBinding == null) {
            return bundle;
        }
        List<als> unmodifiableList = Collections.unmodifiableList(eventBinding.d);
        if (unmodifiableList != null) {
            for (als als : unmodifiableList) {
                if (als.b == null || als.b.length() <= 0) {
                    if (als.c.size() > 0) {
                        if (als.d.equals("relative")) {
                            list = b.a(eventBinding, view2, als.c, 0, -1, view2.getClass().getSimpleName());
                        } else {
                            list = b.a(eventBinding, view, als.c, 0, -1, view.getClass().getSimpleName());
                        }
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            a aVar = (a) it.next();
                            if (aVar.a() != null) {
                                String b2 = alt.b(aVar.a());
                                if (b2.length() > 0) {
                                    bundle.putString(als.a, b2);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    bundle.putString(als.a, als.b);
                }
            }
        }
        return bundle;
    }

    public void a() {
        for (Activity activity : this.b) {
            this.c.add(new b(activity.getWindow().getDecorView().getRootView(), this.a, this.d, activity.getClass().getSimpleName()));
        }
    }
}
