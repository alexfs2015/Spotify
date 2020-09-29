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
    public uzb b;
    public uzn c;
    public hgy d;
    public tda e;
    public uzi f;

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean a(Throwable th) {
        this.c.a(new Storylines(Collections.singleton("")));
        this.f.a("", "", "", "entities", LogMessage.SEVERITY_ERROR, "network", th.getMessage(), "");
        Logger.b("Error saving storylines cache: %s", th.toString());
        return Boolean.FALSE;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Optional optional) {
        return optional.b() ? ScalarSynchronousObservable.d(Boolean.FALSE).b((xis<? super T>) new xis() {
            public final void call(Object obj) {
                StorylinesFetcher.this.b((Boolean) obj);
            }
        }) : xim.a(wit.a((SingleSource<T>) this.b.a())).h(new xiy() {
            public final Object call(Object obj) {
                return StorylinesFetcher.this.a((Storylines) obj);
            }
        }).b((xis<? super T>) new xis() {
            public final void call(Object obj) {
                StorylinesFetcher.this.a((Boolean) obj);
            }
        }).g(new xiy() {
            public final Object call(Object obj) {
                return StorylinesFetcher.this.a((Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Storylines storylines) {
        return this.c.a(storylines).b((xii<T>) ScalarSynchronousObservable.d(Boolean.TRUE));
    }

    public static void a(Context context) {
        a(context, StorylinesFetcher.class, 4431, new Intent());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.f.a("", "", "", "entities", "success", "network", "", "");
    }

    /* access modifiers changed from: private */
    public boolean a(fqn fqn) {
        return !tda.a(fqn);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Boolean bool) {
        this.f.a("", "", "", "entities", "success", "disk_cache", "", "");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        this.f.a("", "", "", "entities", LogMessage.SEVERITY_ERROR, "disk_cache", th.getMessage(), "");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii c(Boolean bool) {
        if (!bool.booleanValue()) {
            return ScalarSynchronousObservable.d(Boolean.FALSE);
        }
        xim a = this.c.a();
        xim a2 = xim.a((a<T>) new xkx<T>(a.a, new xir() {
            public final void call() {
                StorylinesFetcher.this.d();
            }
        }));
        $$Lambda$StorylinesFetcher$FXG4S5QE464E199TsEL5dnjNKY r0 = new xis() {
            public final void call(Object obj) {
                StorylinesFetcher.this.b((Throwable) obj);
            }
        };
        if (r0 != null) {
            return xim.a((a<T>) new xkw<T>(a2, xiv.a(), new xis<Throwable>(r0) {
                private /* synthetic */ xis a;

                {
                    this.a = r2;
                }

                public final /* bridge */ /* synthetic */ void call(Object obj) {
                    this.a.call((Throwable) obj);
                }
            })).b((xiy<? super T, ? extends xii<? extends R>>) new xiy() {
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

    public final void a(Intent intent) {
        try {
            xnn.a(wit.a((xfk<T>) this.d.a()).c((xiy<? super T, Boolean>) $$Lambda$94wd4FkYC1H9eM36vjo8Ri6PAiE.INSTANCE).e((xiy<? super T, ? extends R>) new xiy() {
                public final Object call(Object obj) {
                    return Boolean.valueOf(StorylinesFetcher.this.a((fqn) obj));
                }
            }).b().h(new xiy() {
                public final Object call(Object obj) {
                    return StorylinesFetcher.this.c((Boolean) obj);
                }
            }).a(30, TimeUnit.SECONDS, (xii<? extends T>) ScalarSynchronousObservable.d(Boolean.FALSE)).g($$Lambda$StorylinesFetcher$WD7awhiQuM9lha8CBEWU3ektHY.INSTANCE)).a(Boolean.FALSE);
        } catch (Exception e2) {
            Assertion.a("A crash happened while fetching for Storylines resources", (Throwable) e2);
        }
    }

    public void onCreate() {
        whp.a((Service) this);
        super.onCreate();
    }
}
