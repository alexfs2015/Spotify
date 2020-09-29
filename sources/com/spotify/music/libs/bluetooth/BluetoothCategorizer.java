package com.spotify.music.libs.bluetooth;

import android.content.Context;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.libs.bluetooth.BluetoothCategorizer.CategorizerResponse;
import io.reactivex.Scheduler;
import io.reactivex.SingleSource;
import java.util.HashSet;
import java.util.Set;
import rx.Emitter;
import rx.Emitter.BackpressureMode;

public final class BluetoothCategorizer {
    public static final xiy<CategorizerResponse, String> b = $$Lambda$BluetoothCategorizer$WcSw3PYLzGhDqb3RLbYCxsHk.INSTANCE;
    private static b<Object, Set<String>> c = b.a("bluetooth_category_car");
    private static b<Object, Set<String>> d = b.a("bluetooth_device_with_interapp");
    public final xok a = new xok();
    private final rxf e;
    private final Scheduler f;
    private final SpSharedPreferences<Object> g;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CategorizerResponse implements JacksonModel {
        @JsonProperty("category")
        private final String mCategory;
        @JsonProperty("company")
        private final String mCompany;
        @JsonProperty("interapp")
        private final boolean mInterapp;
        @JsonProperty("model")
        private final String mModel;
        @JsonProperty("version")
        private final String mVersion;

        public CategorizerResponse(@JsonProperty("category") String str, @JsonProperty("company") String str2, @JsonProperty("model") String str3, @JsonProperty("version") String str4, @JsonProperty("interapp") boolean z) {
            this.mCategory = str;
            this.mCompany = str2;
            this.mModel = str3;
            this.mVersion = str4;
            this.mInterapp = z;
        }

        public static CategorizerResponse create(String str, boolean z) {
            CategorizerResponse categorizerResponse = new CategorizerResponse(str, "", "", "", z);
            return categorizerResponse;
        }

        public String getCategory() {
            return this.mCategory;
        }

        public String getCompany() {
            return this.mCompany;
        }

        public String getModel() {
            return this.mModel;
        }

        public String getVersion() {
            return this.mVersion;
        }

        public boolean isInterapp() {
            return this.mInterapp;
        }
    }

    public BluetoothCategorizer(Context context, rxf rxf, jyg jyg, Scheduler scheduler) {
        this.e = rxf;
        this.g = jyg.a(context);
        this.f = scheduler;
    }

    private Set<String> a(b<Object, Set<String>> bVar) {
        Set<String> a2 = this.g.a(bVar, (Set<String>) new HashSet<String>(0));
        return a2 == null ? new HashSet(0) : a2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, CategorizerResponse categorizerResponse) {
        Set a2 = a(c);
        Set a3 = a(d);
        if (categorizerResponse.isInterapp()) {
            if (!a3.contains(str)) {
                HashSet hashSet = new HashSet(a3);
                hashSet.add(str);
                this.g.a().a(d, (Set<String>) hashSet).b();
            }
        } else if (a3.contains(str)) {
            HashSet hashSet2 = new HashSet(a3);
            hashSet2.remove(str);
            this.g.a().a(d, (Set<String>) hashSet2).b();
        }
        if ("car".equals(categorizerResponse.getCategory())) {
            if (!a2.contains(str)) {
                HashSet hashSet3 = new HashSet(a2);
                hashSet3.add(str);
                this.g.a().a(c, (Set<String>) hashSet3).b();
            }
        } else if (a2.contains(str)) {
            HashSet hashSet4 = new HashSet(a2);
            hashSet4.remove(str);
            this.g.a().a(c, (Set<String>) hashSet4).b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Emitter emitter) {
        CategorizerResponse categorizerResponse;
        Set a2 = a(c);
        boolean contains = a(d).contains(str);
        xim a3 = wit.a((SingleSource<T>) this.e.a(str).a(this.f));
        if (a2.contains(str) || contains) {
            categorizerResponse = CategorizerResponse.create(a2.contains(str) ? "car" : "unknown", contains);
        } else {
            categorizerResponse = null;
        }
        if (categorizerResponse != null) {
            emitter.onNext(categorizerResponse);
            emitter.onCompleted();
            this.a.a(a3.a((xis<? super T>) new xis(str) {
                private final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void call(Object obj) {
                    BluetoothCategorizer.this.a(this.f$1, (CategorizerResponse) obj);
                }
            }, (xis<Throwable>) new xis(str) {
                private final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void call(Object obj) {
                    Logger.e((Throwable) obj, "Categorization of device %s failed", this.f$0);
                }
            }));
            return;
        }
        $$Lambda$BluetoothCategorizer$USG3XgjXBKlihNXYbxw_Ng016gk r0 = new xis(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void call(Object obj) {
                BluetoothCategorizer.this.a(this.f$1, (CategorizerResponse) obj);
            }
        };
        if (r0 != null) {
            xim a4 = xim.a((a<T>) new xkw<T>(a3, r0, xiv.a()));
            if (emitter != null) {
                emitter.a(a4.a((xin<? super T>) new xin<T>(emitter) {
                    private /* synthetic */ xij a;

                    {
                        this.a = r2;
                    }

                    public final void a(T t) {
                        this.a.onNext(t);
                        this.a.onCompleted();
                    }

                    public final void a(Throwable th) {
                        this.a.onError(th);
                    }
                }));
                return;
            }
            throw new NullPointerException("observer is null");
        }
        throw new IllegalArgumentException("onSuccess is null");
    }

    public final xii<CategorizerResponse> a(String str) {
        return fbo.a(str) ? xii.a((Throwable) new IllegalArgumentException("Can't categorize. Name in ExternalAccessoryDescription not set.")) : xii.a((xis<Emitter<T>>) new xis(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void call(Object obj) {
                BluetoothCategorizer.this.a(this.f$1, (Emitter) obj);
            }
        }, BackpressureMode.BUFFER);
    }
}
