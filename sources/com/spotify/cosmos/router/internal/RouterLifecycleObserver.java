package com.spotify.cosmos.router.internal;

import androidx.lifecycle.Lifecycle.Event;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;

class RouterLifecycleObserver implements ll {
    private boolean mEntered;
    private final CosmosServiceRxRouter mServiceRxRouter;

    RouterLifecycleObserver(CosmosServiceRxRouter cosmosServiceRxRouter) {
        this.mServiceRxRouter = cosmosServiceRxRouter;
    }

    private void unsubscribeAndReportLeaks() {
        for (vvj vvj : this.mServiceRxRouter.unsubscribeAndReturnLeaks()) {
            Assertion.a(vvj.a(String.format("Leaked subscription detected during lifecycle stop: %s. Subscription was originally created here:", new Object[]{vvj.a}), "The observable of the leaked subscription was originally created here:"));
        }
    }

    @lu(a = Event.ON_START)
    public void enterScope() {
        jtr.b("Not called on main looper");
        if (!this.mEntered) {
            Logger.c("Starting CosmosServiceRxRouter", new Object[0]);
            this.mServiceRxRouter.start();
            this.mEntered = true;
        }
    }

    @lu(a = Event.ON_STOP)
    public void leaveScope() {
        jtr.b("Not called on main looper");
        if (this.mEntered) {
            this.mServiceRxRouter.stop();
            this.mEntered = false;
            unsubscribeAndReportLeaks();
        }
    }
}
