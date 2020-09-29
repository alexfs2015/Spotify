package com.moat.analytics.mobile.spot;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

class ab {

    static class a implements Iterable<View> {
        /* access modifiers changed from: private */
        public final ViewGroup a;

        /* renamed from: com.moat.analytics.mobile.spot.ab$a$a reason: collision with other inner class name */
        class C0011a implements Iterator<View> {
            private int b;

            private C0011a() {
                this.b = -1;
            }

            /* renamed from: a */
            public View next() {
                this.b++;
                return a.this.a.getChildAt(this.b);
            }

            public boolean hasNext() {
                return this.b + 1 < a.this.a.getChildCount();
            }

            public void remove() {
                throw new UnsupportedOperationException("Not implemented. Under development.");
            }
        }

        private a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        public Iterator<View> iterator() {
            return new C0011a();
        }
    }

    ab() {
    }

    static com.moat.analytics.mobile.spot.a.b.a<WebView> a(ViewGroup viewGroup) {
        Object obj;
        View view;
        if (viewGroup instanceof WebView) {
            return com.moat.analytics.mobile.spot.a.b.a.a((WebView) viewGroup);
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(viewGroup);
        HashSet hashSet = new HashSet();
        int i = 0;
        loop0:
        while (true) {
            obj = null;
            while (!linkedList.isEmpty() && i < 100) {
                i++;
                Iterator it = new a((ViewGroup) linkedList.poll()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        view = (View) it.next();
                        if (view instanceof WebView) {
                            if (obj != null) {
                                break;
                            }
                            obj = (WebView) view;
                        }
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) view;
                            if (!hashSet.contains(viewGroup2)) {
                                hashSet.add(viewGroup2);
                                linkedList.add(viewGroup2);
                            }
                        }
                    }
                }
            }
            p.a(3, "WebViewHound", (Object) view, "Ambiguous ad container: multiple WebViews reside within it.");
            p.a("[ERROR] ", "WebAdTracker not created, ambiguous ad container: multiple WebViews reside within it");
        }
        return com.moat.analytics.mobile.spot.a.b.a.b(obj);
    }
}
