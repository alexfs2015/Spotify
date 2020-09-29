package com.moat.analytics.mobile;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

class bb {
    final /* synthetic */ ay a;
    /* access modifiers changed from: private */
    public final WeakReference[] b;
    /* access modifiers changed from: private */
    public final Method c;

    private bb(ay ayVar, Method method, Object... objArr) {
        this.a = ayVar;
        if (objArr == null) {
            objArr = ay.a;
        }
        WeakReference[] weakReferenceArr = new WeakReference[objArr.length];
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            weakReferenceArr[i2] = new WeakReference(objArr[i]);
            i++;
            i2 = i3;
        }
        this.b = weakReferenceArr;
        this.c = method;
    }

    /* synthetic */ bb(ay ayVar, Method method, Object[] objArr, az azVar) {
        this(ayVar, method, objArr);
    }
}
