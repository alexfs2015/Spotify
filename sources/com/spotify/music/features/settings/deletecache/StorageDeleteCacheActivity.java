package com.spotify.music.features.settings.deletecache;

import android.os.Bundle;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import io.reactivex.functions.Consumer;

public class StorageDeleteCacheActivity extends lbm {
    public RxResolver g;
    private qnj h;
    private a i = new a() {
        public final void a() {
            StorageDeleteCacheActivity.this.g.resolve(RequestBuilder.delete("sp://storage/v1/unlocked-items").build()).a((Consumer<? super T>) new Consumer() {
                public final void accept(Object obj) {
                    StorageDeleteCacheActivity.this.a((Response) obj);
                }
            }, (Consumer<? super Throwable>) new Consumer() {
                public final void accept(Object obj) {
                    StorageDeleteCacheActivity.this.a((Throwable) obj);
                }
            });
        }

        public final void b() {
            StorageDeleteCacheActivity.this.finish();
        }
    };

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Response response) {
        finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.h = new qnj(this);
        this.h.a(this.i);
    }
}
