package com.spotify.music.storylines.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.mobile.android.storylines.model.Storylines;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.SingleSource;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import rx.internal.util.ScalarSynchronousObservable;

public class StorylinesFetcher extends fn {
    public unx b;
    public uoj c;
    public hec d;
    public sst e;
    public uoe f;

    public static void a(Context context) {
        a(context, StorylinesFetcher.class, 4431, new Intent());
    }

    public void onCreate() {
        vtj.a((Service) this);
        super.onCreate();
    }

    public final void a(Intent intent) {
        try {
            wzi.a(vun.a((wrf<T>) this.d.a()).c((wut<? super T, Boolean>) $$Lambda$ePtv_adNAMcR3MMVxmbatAr9CM4.INSTANCE).f(new wut() {
                public final Object call(Object obj) {
                    return Boolean.valueOf(StorylinesFetcher.this.a((fpt) obj));
                }
            }).b().i(new wut() {
                public final Object call(Object obj) {
                    return StorylinesFetcher.this.c((Boolean) obj);
                }
            }).a(30, TimeUnit.SECONDS, (wud<? extends T>) ScalarSynchronousObservable.d(Boolean.FALSE)).h($$Lambda$StorylinesFetcher$KOh3Xxy0Rf80WI4E0gpXo6nWO3A.INSTANCE)).a(Boolean.FALSE);
        } catch (Exception e2) {
            Assertion.a("A crash happened while fetching for Storylines resources", (Throwable) e2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud c(Boolean bool) {
        if (!bool.booleanValue()) {
            return ScalarSynchronousObservable.d(Boolean.FALSE);
        }
        wuh a = this.c.a();
        wuh a2 = wuh.a((a<T>) new wws<T>(a.a, new wum() {
            public final void call() {
                StorylinesFetcher.this.d();
            }
        }));
        $$Lambda$StorylinesFetcher$sQtnguRzNkBOtKM5UP6XPdzC0Y r0 = new wun() {
            public final void call(Object obj) {
                StorylinesFetcher.this.b((Throwable) obj);
            }
        };
        if (r0 != null) {
            return wuh.a((a<T>) new wwr<T>(a2, wuq.a(), new wun<Throwable>(r0) {
                private /* synthetic */ wun a;

                {
                    this.a = r2;
                }

                public final /* bridge */ /* synthetic */ void call(Object obj) {
                    this.a.call((Throwable) obj);
                }
            })).b((wut<? super T, ? extends wud<? extends R>>) new wut() {
                public final Object call(Object obj) {
                    return StorylinesFetcher.this.a((Optional) obj);
                }
            });
        }
        throw new IllegalArgumentException("onError is null");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f.a("", "", "", "entities", "loading", "", "", "");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        this.f.a("", "", "", "entities", LogMessage.SEVERITY_ERROR, "disk_cache", th.getMessage(), "");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Optional optional) {
        if (optional.b()) {
            return ScalarSynchronousObservable.d(Boolean.FALSE).b((wun<? super T>) new wun() {
                public final void call(Object obj) {
                    StorylinesFetcher.this.b((Boolean) obj);
                }
            });
        }
        return wuh.a(vun.a((SingleSource<T>) this.b.a())).i(new wut() {
            public final Object call(Object obj) {
                return StorylinesFetcher.this.a((Storylines) obj);
            }
        }).b((wun<? super T>) new wun() {
            public final void call(Object obj) {
                StorylinesFetcher.this.a((Boolean) obj);
            }
        }).h(new wut() {
            public final Object call(Object obj) {
                return StorylinesFetcher.this.a((Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Boolean bool) {
        this.f.a("", "", "", "entities", "success", "disk_cache", "", "");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Storylines storylines) {
        return this.c.a(storylines).b((wud<T>) ScalarSynchronousObservable.d(Boolean.TRUE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.f.a("", "", "", "entities", "success", "network", "", "");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean a(Throwable th) {
        this.c.a(new Storylines(Collections.singleton("")));
        this.f.a("", "", "", "entities", LogMessage.SEVERITY_ERROR, "network", th.getMessage(), "");
        Logger.b("Error saving storylines cache: %s", th.toString());
        return Boolean.FALSE;
    }

    /* access modifiers changed from: private */
    public boolean a(fpt fpt) {
        return !sst.a(fpt);
    }
}
