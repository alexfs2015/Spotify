package com.comscore.android.vce;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class ah<T> extends WeakReference<T> {
    private String a;
    private short b;
    private String c;

    ah(T t) {
        super(t);
    }

    ah(T t, ReferenceQueue referenceQueue) {
        super(t, referenceQueue);
    }

    /* access modifiers changed from: 0000 */
    public short a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.a = str;
    }

    /* access modifiers changed from: 0000 */
    public void a(short s, String str) {
        this.b = s;
        this.c = str;
    }

    /* access modifiers changed from: 0000 */
    public String b() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public String c() {
        return this.a;
    }
}
