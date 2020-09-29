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

/* renamed from: iim reason: default package */
public final class iim implements ihy, defpackage.ihz.a {
    final Scheduler a;
    public iig b;
    public iib c;
    final CompositeDisposable d = new CompositeDisposable();
    private final iin e;
    private final ihz f;
    private final Executor g;
    private final a h = new a() {
        public final void a(ijb ijb) {
            if (iim.this.b != null) {
                iim.this.b.a(ijb.a(1), (HelloDetails) ijb.a(2, HelloDetails.class));
            }
        }
    };
    private final a i = new a() {
        public final void a(ijb ijb) {
            if (iim.this.b != null) {
                iim.this.b.b(ijb.a(1));
            }
        }
    };
    private final a j = new a() {
        public final void a(ijb ijb) {
            if (iim.this.b != null) {
                if (ijb == null) {
                    throw new IllegalArgumentException("Source message must not be null");
                } else if (ijb.c() == 32) {
                    ija ija = new ija(ijb);
                    Logger.a("WAMP subscribe with id: %d, topic: %s.", Integer.valueOf(ija.a()), ija.b());
                    try {
                        iim.this.b.a(ija);
                    } catch (NotAuthorizedException unused) {
                        iim.this.a(32, ija.a(), AppProtocol.a, "wamp.error.not_authorized");
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Message must be of type SUBSCRIBE(32), but was %s", new Object[]{Integer.valueOf(ijb.c())}));
                }
            }
        }
    };
    private final a k = new a() {
        public final void a(ijb ijb) {
            if (iim.this.b != null) {
                int b = ijb.b(1);
                int b2 = ijb.b(2);
                Logger.a("WAMP unsubscribe with id: %d, subscriptionId: %d.", Integer.valueOf(b), Integer.valueOf(b2));
                try {
                    iim.this.b.a(b, b2);
                } catch (NotAuthorizedException unused) {
                    iim.this.a(34, b, AppProtocol.a, "wamp.error.not_authorized");
                }
            }
        }
    };
    private final a l = new a() {
        /* access modifiers changed from: private */
        public /* synthetic */ void a(iiz iiz, JacksonModel jacksonModel) {
            Logger.a("WAMP served request with id: %d, proc: %s, data: %s", Integer.valueOf(iiz.a()), iiz.b(), jacksonModel);
            iim.this.a(iiz.a(), (Object) jacksonModel);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(iiz iiz, Throwable th) {
            Object obj;
            if (th instanceof TimeoutException) {
                Assertion.b(String.format(Locale.ENGLISH, "WAMP request timed out for id: %d, proc: %s", new Object[]{Integer.valueOf(iiz.a()), iiz.b()}), th);
                iim.this.a(48, iiz.a(), String.format(Locale.ENGLISH, "Timeout running %s", new Object[]{iiz.b()}), null);
                return;
            }
            Logger.d("WAMP failed request with id: %d, proc: %s, error: %s", Integer.valueOf(iiz.a()), iiz.b(), th);
            if (th instanceof IapException) {
                obj = ((IapException) th).reason;
            } else {
                obj = th.getClass();
            }
            iim.this.a(48, iiz.a(), obj, th.getMessage());
        }

        public final void a(ijb ijb) {
            if (ijb == null) {
                throw new IllegalArgumentException("Source message must not be null");
            } else if (ijb.c() == 48) {
                iiz iiz = new iiz(ijb);
                iim.this.d.a(iim.this.c.a(iiz).b(iim.this.a).a(iim.this.a).c(30, TimeUnit.SECONDS).a((Consumer<? super T>) new $$Lambda$iim$5$k9m8BpDH2AehMvchR_40lvAOZWU<Object>(this, iiz), (Consumer<? super Throwable>) new $$Lambda$iim$5$VYIJtZqsb7vIBKwZJD35sR7SRY<Object>(this, iiz)));
            } else {
                throw new IllegalArgumentException(String.format("Message must be of type CALL(48), but was %s", new Object[]{Integer.valueOf(ijb.c())}));
            }
        }
    };
    private final a m = new a() {
        public final void a(ijb ijb) {
            iim.this.b.a(ijb.d() >= 3 && !TextUtils.isEmpty(ijb.a(2)) ? ijb.a(2) : "wamp.error.system_shutdown");
        }
    };

    /* renamed from: iim$a */
    interface a {
        void a(ijb ijb);
    }

    public iim(iin iin, ihz ihz, Executor executor, Scheduler scheduler) {
        this.e = (iin) fay.a(iin);
        this.f = (ihz) fay.a(ihz);
        this.g = (Executor) fay.a(executor);
        ihz.a(this);
        this.a = scheduler;
    }

    public final void a(byte[] bArr) {
        this.g.execute(new $$Lambda$iim$RePT6fu6Yxv8g_4k_rp7SGA9o(this, bArr));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(byte[] bArr) {
        a aVar;
        try {
            ijb a2 = this.e.a(bArr);
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

    public final void a(String str, ChallengeDetails challengeDetails) {
        a(new Object[]{Integer.valueOf(4), str, challengeDetails});
    }

    public final void a(int i2, WelcomeDetails welcomeDetails) {
        a(new Object[]{Integer.valueOf(2), Integer.valueOf(i2), welcomeDetails});
    }

    public final void a(Message message, String str) {
        a(new Object[]{Integer.valueOf(3), message, str});
    }

    public final void b(Message message, String str) {
        a(new Object[]{Integer.valueOf(6), message, str});
    }

    public final void a(int i2, int i3) {
        a(new Object[]{Integer.valueOf(33), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void a(int i2) {
        a(new Object[]{Integer.valueOf(35), Integer.valueOf(i2)});
    }

    public final void a(int i2, int i3, Object obj) {
        a(new Object[]{Integer.valueOf(36), Integer.valueOf(i2), Integer.valueOf(i3), AppProtocol.a, AppProtocol.b, obj});
    }

    public final void a(int i2, int i3, Object obj, String str) {
        a(new Object[]{Integer.valueOf(8), Integer.valueOf(i2), Integer.valueOf(i3), obj, str});
    }

    public final void a() {
        this.d.c();
        this.f.a(null);
        this.f.close();
    }

    public final void a(int i2, Object obj) {
        a(new Object[]{Integer.valueOf(50), Integer.valueOf(i2), AppProtocol.a, obj});
    }

    private void a(Object[] objArr) {
        this.g.execute(new $$Lambda$iim$BToAqzNIcmMXZo0dyzv5dXd0s4k(this, objArr));
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

    private static void a(Exception exc) {
        Logger.b(exc, exc.getMessage(), new Object[0]);
        Assertion.a(exc.getMessage(), (Throwable) exc);
    }
}
