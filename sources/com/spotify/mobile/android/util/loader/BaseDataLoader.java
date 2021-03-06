package com.spotify.mobile.android.util.loader;

import android.os.Bundle;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.SortOption;
import defpackage.uyy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.Map;

@Deprecated
public abstract class BaseDataLoader<S, T extends uyy<S>, Payload extends JacksonModel> implements jue<S, T, Payload> {
    private final ObjectMapper a = ((rnf) ggw.a(rnf.class)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    public String b;
    public SortOption c;
    protected boolean d;
    protected boolean e;
    protected boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    protected Integer j;
    protected Integer k;
    private final ObjectMapper l = ((rnf) ggw.a(rnf.class)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(Include.NON_NULL).a();
    private final RxResolver m;
    private final SerialDisposable n = new SerialDisposable();
    private final CompositeDisposable o = new CompositeDisposable();
    private final ObservableTransformer<Response, T> p = new ObservableTransformer((heg) ggw.a(heg.class)) {
        private final /* synthetic */ heg f$1;

        {
            this.f$1 = r2;
        }

        public final ObservableSource apply(Observable observable) {
            return BaseDataLoader.this.a(this.f$1, observable);
        }
    };
    private T q;

    /* renamed from: com.spotify.mobile.android.util.loader.BaseDataLoader$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.mobile.android.util.loader.BaseDataLoader$Type[] r0 = com.spotify.mobile.android.util.loader.BaseDataLoader.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.loader.BaseDataLoader$Type r1 = com.spotify.mobile.android.util.loader.BaseDataLoader.Type.POST     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.loader.BaseDataLoader$Type r1 = com.spotify.mobile.android.util.loader.BaseDataLoader.Type.DELETE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.util.loader.BaseDataLoader$Type r1 = com.spotify.mobile.android.util.loader.BaseDataLoader.Type.PUT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.util.loader.BaseDataLoader.AnonymousClass1.<clinit>():void");
        }
    }

    enum Type {
        POST,
        DELETE,
        PUT
    }

    /* access modifiers changed from: protected */
    public abstract T a(byte[] bArr);

    /* access modifiers changed from: protected */
    public abstract byte[] a(T t);

    public BaseDataLoader(RxResolver rxResolver) {
        this.m = (RxResolver) fay.a(rxResolver);
        Logger.b("Creating new BaseDataLoader (%s)", this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(heg heg, Observable observable) {
        return observable.b(heg.b()).a(heg.b()).c((Function<? super T, ? extends R>) new Function() {
            public final Object apply(Object obj) {
                return BaseDataLoader.this.b((Response) obj);
            }
        }).a(heg.c());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ uyy b(Response response) {
        try {
            return a(response.getBody());
        } catch (Exception e2) {
            throw Exceptions.a(e2);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, juf<T> juf, Payload payload) {
        a(str, payload, juf, true);
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        a(str, (JacksonModel) null, false);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, JacksonModel jacksonModel, boolean z) {
        a(str, jacksonModel, z, Type.POST);
    }

    /* access modifiers changed from: protected */
    public final Observable<T> a(String str, Payload payload) {
        Single b2 = b(str, payload, false);
        RxResolver rxResolver = this.m;
        rxResolver.getClass();
        return b2.d((Function<? super T, ? extends ObservableSource<? extends R>>) new Function() {
            public final Object apply(Object obj) {
                return RxResolver.this.resolve((Request) obj);
            }
        }).a(this.p).c(1);
    }

    /* access modifiers changed from: protected */
    public final Observable<T> b(String str, Payload payload) {
        Single b2 = b(str, payload, true);
        RxResolver rxResolver = this.m;
        rxResolver.getClass();
        return b2.d((Function<? super T, ? extends ObservableSource<? extends R>>) new Function() {
            public final Object apply(Object obj) {
                return RxResolver.this.resolve((Request) obj);
            }
        }).a(this.p);
    }

    private void a(String str, JacksonModel jacksonModel, boolean z, Type type) {
        Single a2 = a(type, str, jacksonModel, z);
        RxResolver rxResolver = this.m;
        rxResolver.getClass();
        this.o.a(a2.d((Function<? super T, ? extends ObservableSource<? extends R>>) new Function() {
            public final Object apply(Object obj) {
                return RxResolver.this.resolve((Request) obj);
            }
        }).a((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                BaseDataLoader.this.a((Response) obj);
            }
        }, (Consumer<? super Throwable>) new Consumer() {
            public final void accept(Object obj) {
                BaseDataLoader.this.a((Throwable) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Response response) {
        Logger.b("onResolved() %s (%s)", response.getBodyString(), this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.b("onError(): %s (%s)", th.getMessage(), this);
    }

    private static String a(Type type) {
        int i2 = AnonymousClass1.a[type.ordinal()];
        if (i2 == 1) {
            return Request.POST;
        }
        if (i2 == 2) {
            return Request.DELETE;
        }
        if (i2 == 3) {
            return Request.PUT;
        }
        StringBuilder sb = new StringBuilder("type ");
        sb.append(type);
        sb.append(" is unsupported.");
        throw new AssertionError(sb.toString());
    }

    private Single<Request> a(Type type, String str, JacksonModel jacksonModel, boolean z) {
        return Single.a((SingleOnSubscribe<T>) new SingleOnSubscribe(a(type), str, jacksonModel, z ? this.l : this.a) {
            private final /* synthetic */ String f$0;
            private final /* synthetic */ String f$1;
            private final /* synthetic */ JacksonModel f$2;
            private final /* synthetic */ ObjectMapper f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void subscribe(SingleEmitter singleEmitter) {
                BaseDataLoader.a(this.f$0, this.f$1, this.f$2, this.f$3, singleEmitter);
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(String str, String str2, JacksonModel jacksonModel, ObjectMapper objectMapper, SingleEmitter singleEmitter) {
        byte[] bArr;
        try {
            Map emptyMap = Collections.emptyMap();
            if (jacksonModel == null) {
                bArr = new byte[0];
            } else {
                bArr = objectMapper.writeValueAsBytes(jacksonModel);
            }
            singleEmitter.a(new Request(str, str2, emptyMap, bArr));
        } catch (JsonProcessingException e2) {
            singleEmitter.a((Throwable) e2);
        }
    }

    private void a(String str, Payload payload, juf<T> juf, boolean z) {
        Logger.b("Requesting uri %s using %s", str, Request.SUB);
        Single b2 = b(str, payload, true);
        RxResolver rxResolver = this.m;
        rxResolver.getClass();
        this.n.a(b2.d((Function<? super T, ? extends ObservableSource<? extends R>>) new Function() {
            public final Object apply(Object obj) {
                return RxResolver.this.resolve((Request) obj);
            }
        }).a(this.p).a((Consumer<? super T>) new Consumer(juf) {
            private final /* synthetic */ juf f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                BaseDataLoader.this.a(this.f$1, (uyy) obj);
            }
        }, (Consumer<? super Throwable>) new Consumer(juf) {
            private final /* synthetic */ juf f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                BaseDataLoader.this.a(this.f$1, (Throwable) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(juf juf, uyy uyy) {
        this.q = uyy;
        juf.a(uyy);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(juf juf, Throwable th) {
        Logger.b("onError(): %s (%s)", th.getMessage(), this);
        juf.a(th.getMessage());
    }

    private Single<Request> b(String str, Payload payload, boolean z) {
        return Single.a((SingleOnSubscribe<T>) new SingleOnSubscribe(z, str, payload) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ JacksonModel f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void subscribe(SingleEmitter singleEmitter) {
                BaseDataLoader.this.a(this.f$1, this.f$2, this.f$3, singleEmitter);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, String str, JacksonModel jacksonModel, SingleEmitter singleEmitter) {
        byte[] bArr;
        try {
            String str2 = z ? Request.SUB : Request.GET;
            Map emptyMap = Collections.emptyMap();
            if (jacksonModel == null) {
                bArr = new byte[0];
            } else {
                bArr = this.a.writeValueAsBytes(jacksonModel);
            }
            singleEmitter.a(new Request(str2, str, emptyMap, bArr));
        } catch (JsonProcessingException e2) {
            singleEmitter.a((Throwable) e2);
        }
    }

    public final void a(Bundle bundle) {
        Logger.b("onSaveInstanceState(): mModel %s", this.q);
        if (this.q != null) {
            bundle.putByteArray(getClass().getName(), a(this.q));
        }
    }

    public final void a(SortOption sortOption) {
        this.c = sortOption;
    }

    public final void a(vns vns) {
        this.c = jsr.a(vns);
    }

    public final jue<S, T, Payload> a(boolean z, boolean z2, boolean z3) {
        this.d = z;
        this.e = z2;
        this.f = z3;
        return this;
    }

    public final jue<S, T, Payload> a(Integer num, Integer num2) {
        this.j = num;
        this.k = num2;
        return this;
    }

    public SortOption c() {
        return this.c;
    }

    public final void d() {
        this.o.c();
        this.n.a(Disposables.b());
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        a(str, (JacksonModel) null, false, Type.DELETE);
    }
}
