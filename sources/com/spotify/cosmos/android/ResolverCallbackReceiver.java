package com.spotify.cosmos.android;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ResolverCallbackReceiver {
    private static final AtomicInteger ID_GEN = new AtomicInteger(0);
    protected final Handler mHandler;
    private final int mId = createId();

    public class LocalRunnable implements Runnable {
        private final Response mResponse;

        public LocalRunnable(Response response) {
            this.mResponse = response;
        }

        public void run() {
            ResolverCallbackReceiver.this.onResolved(this.mResponse);
        }
    }

    public ResolverCallbackReceiver(Handler handler) {
        this.mHandler = handler;
    }

    private static int createId() {
        return ID_GEN.getAndIncrement();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResolverCallbackReceiver) && ((ResolverCallbackReceiver) obj).mId == this.mId;
    }

    public final int getId() {
        return this.mId;
    }

    public int hashCode() {
        return this.mId;
    }

    /* access modifiers changed from: protected */
    public abstract void onError(Throwable th);

    /* access modifiers changed from: protected */
    public abstract void onResolved(Response response);

    public final void sendOnError(final Throwable th) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() {
                public void run() {
                    ResolverCallbackReceiver.this.onError(th);
                }
            });
        } else {
            onError(th);
        }
    }

    public void sendOnResolved(Response response) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new LocalRunnable(response));
        } else {
            onResolved(response);
        }
    }
}
