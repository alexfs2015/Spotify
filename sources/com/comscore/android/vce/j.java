package com.comscore.android.vce;

import android.app.Activity;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

class j {
    static final String a = "VceData";
    static final int e = 1;
    static final int f = 2;
    static final int g = 3;
    static final int h = 4;
    static final int i = 5;
    static final int j = 6;
    final p b;
    final s c;
    final k d;
    final HashMap<ah<View>, x> k = new HashMap<>();
    final Map<String, z> l = new HashMap();
    final Map<ah<Activity>, HashSet<ah<View>>> m = new HashMap();

    j(p pVar, s sVar, k kVar) {
        this.b = pVar;
        this.c = sVar;
        this.d = kVar;
    }

    /* access modifiers changed from: 0000 */
    public z a(String str) {
        return (z) this.l.get(str);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.k.clear();
        this.l.clear();
        this.m.clear();
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        for (x a2 : this.k.values()) {
            a(i2, a2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, ah<Activity> ahVar) {
        HashSet hashSet = (HashSet) this.m.get(ahVar);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                x xVar = (x) this.k.get((ah) it.next());
                if (xVar != null) {
                    a(i2, xVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, x xVar) {
        switch (i2) {
            case 1:
                xVar.A();
                break;
            case 2:
                xVar.D();
                return;
            case 3:
                xVar.t();
                return;
            case 4:
                xVar.s();
                return;
            case 5:
                xVar.w();
                return;
            case 6:
                xVar.u();
                break;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Activity activity) {
        a(1, this.c.a(activity));
        a(activity, true);
    }

    /* access modifiers changed from: 0000 */
    public void a(Activity activity, boolean z) {
        if (this.d.a(activity, "MraidVideoPlayerActivity")) {
            ab i2 = i();
            if (i2 != null) {
                i2.c(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(ah<Activity> ahVar, ah<View> ahVar2) {
        HashSet hashSet;
        if (this.m.containsKey(ahVar)) {
            hashSet = (HashSet) this.m.get(ahVar);
        } else {
            HashSet hashSet2 = new HashSet();
            this.m.put(ahVar, hashSet2);
            hashSet = hashSet2;
        }
        hashSet.add(ahVar2);
    }

    /* access modifiers changed from: 0000 */
    public void a(ah<Activity> ahVar, ah<View> ahVar2, x xVar) {
        this.k.put(ahVar2, xVar);
        a(ahVar, ahVar2);
    }

    /* access modifiers changed from: 0000 */
    public void a(ah<Activity> ahVar, ah<View> ahVar2, x xVar, String str) {
        a(ahVar, ahVar2, xVar);
        this.l.put(str, (z) xVar);
    }

    /* access modifiers changed from: 0000 */
    public void a(HashMap<String, String> hashMap) {
        for (x a2 : this.k.values()) {
            a2.a(hashMap);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(View view) {
        return a(this.c.a(view));
    }

    /* access modifiers changed from: 0000 */
    public boolean a(ah<View> ahVar) {
        return this.k.containsKey(ahVar);
    }

    /* access modifiers changed from: 0000 */
    public x b(ah<View> ahVar) {
        return (x) this.k.get(ahVar);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        for (x c2 : this.k.values()) {
            c2.c();
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(Activity activity) {
        a(2, this.c.a(activity));
        a(activity, false);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        a(3);
    }

    /* access modifiers changed from: 0000 */
    public void c(ah<Activity> ahVar) {
        HashSet hashSet = (HashSet) this.m.get(ahVar);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ah ahVar2 = (ah) it.next();
                x xVar = (x) this.k.get(ahVar2);
                if (xVar != null) {
                    this.k.remove(ahVar2);
                    if (xVar instanceof z) {
                        this.l.remove(((z) xVar).T());
                    }
                    xVar.c();
                }
            }
            hashSet.clear();
        }
        this.m.remove(ahVar);
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        a(4);
    }

    /* access modifiers changed from: 0000 */
    public void d(ah<View> ahVar) {
        x xVar = (x) this.k.remove(ahVar);
        if (xVar != null) {
            if (xVar instanceof z) {
                this.l.remove(((z) xVar).T());
            }
            ((HashSet) this.m.get(xVar.g())).remove(ahVar);
            xVar.c();
        }
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        a(5);
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        a(6);
    }

    /* access modifiers changed from: 0000 */
    public boolean g() {
        return this.k.size() > 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean h() {
        for (x e2 : this.k.values()) {
            if (e2.e()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public ab i() {
        for (x xVar : this.k.values()) {
            if ((xVar instanceof ab) && xVar.e()) {
                ab abVar = (ab) xVar;
                if (abVar.ap()) {
                    return abVar;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        for (x xVar : this.k.values()) {
            if (xVar instanceof ab) {
                ab abVar = (ab) xVar;
                if (abVar.ap()) {
                    abVar.b(false);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void k() {
        ReferenceQueue e2 = this.c.f().e();
        while (true) {
            Reference poll = e2.poll();
            if (poll != null) {
                ah ahVar = (ah) poll;
                if (this.c.f().a(ahVar)) {
                    c(this.c.f().a(ahVar.b()));
                } else {
                    d(this.c.f().b(ahVar.b()));
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void l() {
    }

    /* access modifiers changed from: 0000 */
    public Runnable m() {
        return new Runnable() {
            public void run() {
                try {
                    j.this.k();
                } catch (Exception unused) {
                }
            }
        };
    }
}
