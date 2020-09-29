package com.moat.analytics.mobile;

import android.view.View;
import java.util.Iterator;

class bt implements Iterator<View> {
    final /* synthetic */ bs a;
    private int b;

    private bt(bs bsVar) {
        this.a = bsVar;
        this.b = -1;
    }

    /* renamed from: a */
    public View next() {
        this.b++;
        return this.a.a.getChildAt(this.b);
    }

    public boolean hasNext() {
        return this.b + 1 < this.a.a.getChildCount();
    }

    public void remove() {
        throw new UnsupportedOperationException("Not implemented. Under development.");
    }
}
