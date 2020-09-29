package com.spotify.mobile.android.cosmos.router;

import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.ResolveCallback;
import com.spotify.cosmos.router.Router;
import com.spotify.mobile.android.cosmos.router.CosmosRequestQueue.QueuedRequest;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CosmosRequestQueue {
    protected final ConcurrentLinkedQueue<QueuedRequest> mQueuedRequests = new ConcurrentLinkedQueue<>();

    public static final class QueuedRequest {
        /* access modifiers changed from: private */
        public final ResolveCallback mCallback;
        /* access modifiers changed from: private */
        public final Request mRequest;

        QueuedRequest(Request request, ResolveCallback resolveCallback) {
            this.mRequest = request;
            this.mCallback = resolveCallback;
        }

        public final ResolveCallback getCallback() {
            return this.mCallback;
        }

        public final Request getRequest() {
            return this.mRequest;
        }
    }

    public final void destroy() {
        this.mQueuedRequests.clear();
    }

    public /* synthetic */ void lambda$queue$0$CosmosRequestQueue(QueuedRequest queuedRequest) {
        this.mQueuedRequests.remove(queuedRequest);
    }

    public final Lifetime queue(Request request, ResolveCallback resolveCallback) {
        QueuedRequest queuedRequest = new QueuedRequest(request, resolveCallback);
        this.mQueuedRequests.add(queuedRequest);
        return new Lifetime(queuedRequest) {
            private final /* synthetic */ QueuedRequest f$1;

            {
                this.f$1 = r2;
            }

            public final void destroy() {
                CosmosRequestQueue.this.lambda$queue$0$CosmosRequestQueue(this.f$1);
            }
        };
    }

    public final void replayRequests(Router router) {
        Iterator it = this.mQueuedRequests.iterator();
        while (it.hasNext()) {
            QueuedRequest queuedRequest = (QueuedRequest) it.next();
            router.resolve(queuedRequest.mRequest, queuedRequest.mCallback);
        }
        this.mQueuedRequests.clear();
    }
}
