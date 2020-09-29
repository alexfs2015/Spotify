package com.moat.analytics.mobile;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.base.functional.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

class bq implements bp {
    bq() {
    }

    public a<WebView> a(ViewGroup viewGroup) {
        Object obj;
        if (viewGroup instanceof WebView) {
            return a.a((WebView) viewGroup);
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
                Iterator it = new bs((ViewGroup) linkedList.poll()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        View view = (View) it.next();
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
            Log.e("MoatWebViewHound", "Ambiguous ad container: multiple WebViews reside within it.");
        }
        return a.b(obj);
    }
}
