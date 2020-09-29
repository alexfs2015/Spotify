package com.moat.analytics.mobile;

class g implements Runnable {
    final /* synthetic */ f a;

    g(f fVar) {
        this.a = fVar;
    }

    public void run() {
        this.a.a("Shutting down.");
        this.a.l.b();
        this.a.l = null;
    }
}
