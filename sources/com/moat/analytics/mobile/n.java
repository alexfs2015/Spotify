package com.moat.analytics.mobile;

import com.moat.analytics.mobile.base.exception.a;

class n implements Runnable {
    final /* synthetic */ m a;

    n(m mVar) {
        this.a = mVar;
    }

    public void run() {
        try {
            if (this.a.f.get() == null || this.a.e()) {
                this.a.c();
            } else if (Boolean.valueOf(this.a.f()).booleanValue()) {
                this.a.d.postDelayed(this, 200);
            } else {
                this.a.c();
            }
        } catch (Exception e) {
            this.a.c();
            a.a(e);
        }
    }
}
