package com.moat.analytics.mobile;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

class bs implements Iterable<View> {
    /* access modifiers changed from: private */
    public final ViewGroup a;

    private bs(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public Iterator<View> iterator() {
        return new bt(this);
    }
}
