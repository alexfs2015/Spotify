package defpackage;

import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.IapException;
import com.spotify.mobile.android.spotlets.appprotocol.NotAuthorizedException;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ChallengeDetails;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.HelloDetails;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Message;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.WelcomeDetails;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ikz reason: default package */
public final class ikz implements ikl, defpackage.ikm.a {
    final Scheduler a;
    public ikt b;
    public iko c;
    final CompositeDisposable d = new CompositeDisposable();
    private final ila e;
    private final ikm f;
    private final Executor g;
    private final a h = new a() {
        public final void a(ilo ilo) {
            if (ikz.this.b != null) {
                ikz.this.b.a(ilo.a(1), (HelloDetails) ilo.a(2, HelloDetails.class));
            }
        }
    };
    private final a i = new a() {
        public final void a(ilo ilo) {
            if (ikz.this.b != null) {
                ikz.this.b.b(ilo.a(1));
            }
        }
    };
    private final a j = new a() {
        public final void a(ilo ilo) {
            if (ikz.this.b != null) {
                if (ilo == null) {
                    throw new IllegalArgumentException("Source message must not be null");
                } else if (ilo.c() == 32) {
                    iln iln = new iln(ilo);
                    Logger.a("WAMP subscribe with id: %d, topic: %s.", Integer.valueOf(iln.a()), iln.b());
                    try {
                        ikz.this.b.a(iln);
                    } catch (NotAuthorizedException unused) {
                        ikz.this.a(32, iln.a(), AppProtocol.a, "wamp.error.not_authorized");
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Message must be of type SUBSCRIBE(32), but was %s", new Object[]{Integer.valueOf(ilo.c())}));
                }
            }
        }
    };
    private final a k = new a() {
        public final void a(ilo ilo) {
            if (ikz.this.b != null) {
                int b = ilo.b(1);
                int b2 = ilo.b(2);
                Logger.a("WAMP unsubscribe with id: %d, subscriptionId: %d.", Integer.valueOf(b), Integer.valueOf(b2));
                try {
                    ikz.this.b.a(b, b2);
                } catch (NotAuthorizedException unused) {
                    ikz.this.a(34, b, AppProtocol.a, "wamp.error.not_authorized");
                }
            }
        }
    };
    private final a l = new a() {
        /* access modifiers changed from: private */
        public /* synthetic */ void a(ilm ilm, JacksonModel jacksonModel) {
            Logger.a("WAMP served request with id: %d, proc: %s, data: %s", Integer.valueOf(ilm.a()), ilm.b(), jacksonModel);
            ikz.this.a(ilm.a(), (Object) jacksonModel);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(ilm ilm, Throwable th) {
            if (th instanceof TimeoutException) {
                Assertion.b(String.format(Locale.ENGLISH, "WAMP request timed out for id: %d, proc: %s", new Object[]{Integer.valueOf(ilm.a()), ilm.b()}), th);
                ikz.this.a(48, ilm.a(), String.format(Locale.ENGLISH, "Timeout running %s", new Object[]{ilm.b()}), null);
                return;
            }
            Logger.d("WAMP failed request with id: %d, proc: %s, error: %s", Integer.valueOf(ilm.a()), ilm.b(), th);
            ikz.this.a(48, ilm.a(), th instanceof IapException ? ((IapException) th).reason : th.getClass(), th.getMessage());
        }

        public final void a(ilo ilo) {
            if (ilo == null) {
                throw new IllegalArgumentException("Source message must not be null");
            } else if (ilo.c() == 48) {
                ilm ilm = new ilm(ilo);
                ikz.this.d.a(ikz.this.c.a(ilm).b(ikz.this.a).a(ikz.this.a).c(30, TimeUnit.SECONDS).a((Consumer<? super T>) new $$Lambda$ikz$5$AYNjBhZhnnagKL_8aWJL5oRYQKU<Object>(this, ilm), (Consumer<? super Throwable>) new $$Lambda$ikz$5$iTCLvGi4TQsEU8Tg9XZEQgVw8CM<Object>(this, ilm)));
            } else {
                throw new IllegalArgumentException(String.format("Message must be of type CALL(48), but was %s", new Object[]{Integer.valueOf(ilo.c())}));
            }
        }
    };
    private final a m = new a() {
        public final void a(ilo ilo) {
            ikz.this.b.a(ilo.d() >= 3 && !TextUtils.isEmpty(ilo.a(2)) ? ilo.a(2) : "wamp.error.system_shutdown");
        }
    };

    /* renamed from: ikz$a */
    interface a {
        void a(ilo ilo);
    }

    public ikz(ila ila, ikm ikm, Executor executor, Scheduler scheduler) {
        this.e = (ila) fbp.a(ila);
        this.f = (ikm) fbp.a(ikm);
        this.g = (Executor) fbp.a(executor);
        ikm.a(this);
        this.a = scheduler;
    }

    private static void a(Exception exc) {
        Logger.b(exc, exc.getMessage(), new Object[0]);
        Assertion.a(exc.getMessage(), (Throwable) exc);
    }

    private void a(Object[] objArr) {
        this.g.execute(new $$Lambda$ikz$8y4FhIVsCe0cnSnJc8cTMxIQL2s(this, objArr));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(byte[] bArr) {
        a aVar;
        try {
            ilo a2 = this.e.a(bArr);
            try {
                int c2 = a2.c();
                if (c2 == 1) {
                    aVar = this.h;
                } else if (c2 == 32) {
                    aVar = this.j;
                } else if (c2 == 34) {
                    aVar = this.k;
                } else if (c2 == 48) {
                    aVar = this.l;
                } else if (c2 == 5) {
                    aVar = this.i;
                } else if (c2 != 6) {
                    Logger.d("No router for WAMP action %d.", Integer.valueOf(c2));
                    aVar = null;
                } else {
                    aVar = this.m;
                }
                if (aVar != null) {
                    aVar.a(a2);
                }
            } catch (Exception e2) {
                a(e2);
            }
        } catch (Exception e3) {
            a(e3);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Object[] objArr) {
        try {
            Logger.a("WAMP sending: %s", Arrays.toString(objArr));
            byte[] a2 = this.e.a(Arrays.asList(objArr));
            this.f.a(a2.length, a2);
        } catch (Exception e2) {
            a(e2);
        }
    }

    public final void a() {
        this.d.c();
        this.f.a(null);
        this.f.close();
    }

    public final void a(int i2) {
        a(new Object[]{Integer.valueOf(35), Integer.valueOf(i2)});
    }

    public final void a(int i2, int i3) {
        a(new Object[]{Integer.valueOf(33), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void a(int i2, int i3, Object obj) {
        a(new Object[]{Integer.valueOf(36), Integer.valueOf(i2), Integer.valueOf(i3), AppProtocol.a, AppProtocol.b, obj});
    }

    public final void a(int i2, int i3, Object obj, String str) {
        a(new Object[]{Integer.valueOf(8), Integer.valueOf(i2), Integer.valueOf(i3), obj, str});
    }

    public final void a(int i2, WelcomeDetails welcomeDetails) {
        a(new Object[]{Integer.valueOf(2), Integer.valueOf(i2), welcomeDetails});
    }

    public final void a(int i2, Object obj) {
        a(new Object[]{Integer.valueOf(50), Integer.valueOf(i2), AppProtocol.a, obj});
    }

    public final void a(Message message, String str) {
        a(new Object[]{Integer.valueOf(3), message, str});
    }

    public final void a(String str, ChallengeDetails challengeDetails) {
        a(new Object[]{Integer.valueOf(4), str, challengeDetails});
    }

    public final void a(byte[] bArr) {
        this.g.execute(new $$Lambda$ikz$OWW614IA3JZ133BKHLqETpnyUQ(this, bArr));
    }

    public final void b(Message message, String str) {
        a(new Object[]{Integer.valueOf(6), message, str});
    }
}
