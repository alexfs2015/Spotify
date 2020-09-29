package com.moat.analytics.mobile;

import java.util.Iterator;

class au implements ax {
    final /* synthetic */ as a;

    au(as asVar) {
        this.a = asVar;
    }

    public void a(ar arVar) {
        if (as.c != arVar) {
            synchronized (as.b) {
                Iterator it = as.b.iterator();
                while (it.hasNext()) {
                    aq aqVar = (aq) it.next();
                    if (arVar == ar.ON) {
                        aqVar.a();
                    } else {
                        aqVar.b();
                    }
                    it.remove();
                }
            }
            as.c = arVar;
        }
        this.a.e();
    }
}
