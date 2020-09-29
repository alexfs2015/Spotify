package com.spotify.cosmos.router.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.CosmosServiceIntentBuilder;
import com.spotify.cosmos.android.RemoteNativeRouter;
import com.spotify.cosmos.router.RxRouter;

public class CosmosServiceRxRouterClient {
    private final Context mContext;
    private final CosmosServiceIntentBuilder mCosmosServiceIntentBuilder;
    /* access modifiers changed from: private */
    public Listener mListener;
    private final ServiceConnection mServiceConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (CosmosServiceRxRouterClient.this.mListener != null) {
                CosmosServiceRxRouterClient.this.mListener.onConnected(new RemoteNativeRxRouter((RemoteNativeRouter) iBinder));
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (CosmosServiceRxRouterClient.this.mListener != null) {
                CosmosServiceRxRouterClient.this.mListener.onDisconnected();
            }
        }
    };
    private boolean mStarted;

    public interface Listener {
        void onConnected(RxRouter rxRouter);

        void onDisconnected();
    }

    CosmosServiceRxRouterClient(Context context, CosmosServiceIntentBuilder cosmosServiceIntentBuilder) {
        this.mContext = context;
        this.mCosmosServiceIntentBuilder = cosmosServiceIntentBuilder;
    }

    public void connect() {
        fay.b(!this.mStarted);
        this.mStarted = true;
        this.mContext.getApplicationContext().bindService(this.mCosmosServiceIntentBuilder.createCosmosServiceIntent(this.mContext).setAction(Cosmos.ACTION_COSMOS_PROXY), this.mServiceConnection, 1);
    }

    public void disconnect() {
        fay.b(this.mStarted);
        this.mStarted = false;
        this.mContext.getApplicationContext().unbindService(this.mServiceConnection);
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onDisconnected();
        }
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }
}
