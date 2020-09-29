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
    public static final wut<CategorizerResponse, String> b = $$Lambda$BluetoothCategorizer$dQIz5njK5LGoWjPgHWNqP4gom4.INSTANCE;
    private static b<Object, Set<String>> c = b.a("bluetooth_category_car");
    private static b<Object, Set<String>> d = b.a("bluetooth_device_with_interapp");
    public final xag a = new xag();
    private final rnz e;
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

        public static CategorizerResponse create(String str, boolean z) {
            CategorizerResponse categorizerResponse = new CategorizerResponse(str, "", "", "", z);
            return categorizerResponse;
        }

        public CategorizerResponse(@JsonProperty("category") String str, @JsonProperty("company") String str2, @JsonProperty("model") String str3, @JsonProperty("version") String str4, @JsonProperty("interapp") boolean z) {
            this.mCategory = str;
            this.mCompany = str2;
            this.mModel = str3;
            this.mVersion = str4;
            this.mInterapp = z;
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

    public BluetoothCategorizer(Context context, rnz rnz, jvy jvy, Scheduler scheduler) {
        this.e = rnz;
        this.g = jvy.a(context);
        this.f = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Emitter emitter) {
        CategorizerResponse categorizerResponse;
        Set a2 = a(c);
        boolean contains = a(d).contains(str);
        wuh a3 = vun.a((SingleSource<T>) this.e.a(str).a(this.f));
        if (a2.contains(str) || contains) {
            categorizerResponse = CategorizerResponse.create(a2.contains(str) ? "car" : "unknown", contains);
        } else {
            categorizerResponse = null;
        }
        if (categorizerResponse != null) {
            emitter.onNext(categorizerResponse);
            emitter.onCompleted();
            this.a.a(a3.a((wun<? super T>) new wun(str) {
                private final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void call(Object obj) {
                    BluetoothCategorizer.this.a(this.f$1, (CategorizerResponse) obj);
                }
            }, (wun<Throwable>) new wun(str) {
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
        wuh a4 = a3.a((wun<? super T>) new wun(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void call(Object obj) {
                BluetoothCategorizer.this.a(this.f$1, (CategorizerResponse) obj);
            }
        });
        if (emitter != null) {
            emitter.a(a4.a((wui<? super T>) new wui<T>(emitter) {
                private /* synthetic */ wue a;

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

    public final wud<CategorizerResponse> a(String str) {
        if (fax.a(str)) {
            return wud.a((Throwable) new IllegalArgumentException("Can't categorize. Name in ExternalAccessoryDescription not set."));
        }
        return wud.a((wun<Emitter<T>>) new wun(str) {
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
