package com.comscore.android.vce;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;

class u {
    static final String a = "Refs";
    static final short b = 1;
    static final short c = 2;
    final ReferenceQueue d = new ReferenceQueue();
    Application e;
    Context f;
    ah<Activity> g;
    ah<Activity> h;
    final HashMap<String, ah<Activity>> i = new HashMap<>();
    final HashMap<String, ah<View>> j = new HashMap<>();

    u() {
    }

    /* access modifiers changed from: 0000 */
    public Context a() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public ah<Activity> a(Activity activity) {
        if (activity == null) {
            return null;
        }
        String num = Integer.toString(activity.hashCode());
        ah<Activity> ahVar = (ah) this.i.get(num);
        if (ahVar == null) {
            ahVar = new ah<>(activity, this.d);
            ahVar.a(b, num);
            ahVar.a(activity.getLocalClassName());
            this.i.put(num, ahVar);
        }
        return ahVar;
    }

    /* access modifiers changed from: 0000 */
    public ah<View> a(View view) {
        if (view == null) {
            return null;
        }
        String num = Integer.toString(view.hashCode());
        ah<View> ahVar = (ah) this.j.get(num);
        if (ahVar == null) {
            ahVar = new ah<>(view, this.d);
            ahVar.a(c, num);
            ahVar.a(view.getClass().getCanonicalName());
            this.j.put(num, ahVar);
        }
        return ahVar;
    }

    /* access modifiers changed from: 0000 */
    public ah<Activity> a(String str) {
        return (ah) this.i.remove(str);
    }

    /* access modifiers changed from: 0000 */
    public void a(Application application) {
        this.e = application;
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context) {
        this.f = context;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(ah ahVar) {
        return ahVar.a() == 1;
    }

    /* access modifiers changed from: 0000 */
    public Application b() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public ah<View> b(String str) {
        return (ah) this.j.remove(str);
    }

    /* access modifiers changed from: 0000 */
    public void b(Activity activity) {
        ah<Activity> ahVar = this.h;
        if (ahVar != null) {
            this.g = ahVar;
        }
        this.h = a(activity);
    }

    /* access modifiers changed from: 0000 */
    public Activity c() {
        ah<Activity> ahVar = this.h;
        if (ahVar != null) {
            return (Activity) ahVar.get();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public Activity d() {
        ah<Activity> ahVar = this.g;
        if (ahVar != null) {
            return (Activity) ahVar.get();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public ReferenceQueue e() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public int f() {
        return this.i.size();
    }

    /* access modifiers changed from: 0000 */
    public int g() {
        return this.i.size();
    }
}
