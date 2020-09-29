package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: aej reason: default package */
public class aej extends agf implements aef {
    private final BroadcastReceiver A = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.a(((Integer) aej.a(intent, "arg0", Integer.TYPE)).intValue(), (byte[]) aej.a(intent, "arg1", byte[].class));
        }
    };
    private final BroadcastReceiver B = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.a((String) aej.a(intent, "arg0", String.class), (int[]) aej.a(intent, "arg1", int[].class));
        }
    };
    private final BroadcastReceiver C = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.c((String) aej.a(intent, "arg0", String.class), (String) aej.a(intent, "arg1", String.class));
        }
    };
    private final BroadcastReceiver D = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.k();
        }
    };
    private final BroadcastReceiver E = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.f();
        }
    };
    private final BroadcastReceiver F = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.e((String) aej.a(intent, "arg0", String.class));
        }
    };
    private final BroadcastReceiver b = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.a(((Integer) aej.a(intent, "arg0", Integer.TYPE)).intValue(), (String[]) aej.a(intent, "arg1", String[].class));
        }
    };
    private final BroadcastReceiver c = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.j();
        }
    };
    private final BroadcastReceiver d = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.a((String) aej.a(intent, "arg0", String.class));
        }
    };
    private final BroadcastReceiver e = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.b((String) aej.a(intent, "arg0", String.class), (String) aej.a(intent, "arg1", String.class));
        }
    };
    private final BroadcastReceiver f = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.a();
        }
    };
    private final BroadcastReceiver g = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.a((String) aej.a(intent, "arg0", String.class), (String) aej.a(intent, "arg1", String.class));
        }
    };
    private final BroadcastReceiver h = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.d();
        }
    };
    private final BroadcastReceiver i = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.b((String) aej.a(intent, "arg0", String.class));
        }
    };
    private final BroadcastReceiver j = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.f((String) aej.a(intent, "arg0", String.class));
        }
    };
    private final BroadcastReceiver k = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.h((String) aej.a(intent, "arg0", String.class));
        }
    };
    private final BroadcastReceiver l = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.a((String[]) aej.a(intent, "arg0", String[].class), (String[]) aej.a(intent, "arg1", String[].class), ((Boolean) aej.a(intent, "arg2", Boolean.TYPE)).booleanValue());
        }
    };
    private final BroadcastReceiver m = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.a((String[]) aej.a(intent, "arg0", String[].class), (String[]) aej.a(intent, "arg1", String[].class));
        }
    };
    private final BroadcastReceiver n = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.d((String) aej.a(intent, "arg0", String.class));
        }
    };
    private final BroadcastReceiver o = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.c((String) aej.a(intent, "arg0", String.class));
        }
    };
    private final BroadcastReceiver p = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.b();
        }
    };
    private final BroadcastReceiver q = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.e();
        }
    };
    private final BroadcastReceiver r = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.c();
        }
    };
    private final BroadcastReceiver s = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.i((String) aej.a(intent, "arg0", String.class));
        }
    };
    private final BroadcastReceiver t = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.h();
        }
    };
    private final BroadcastReceiver u = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.l();
        }
    };
    private final BroadcastReceiver v = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.g();
        }
    };
    private final BroadcastReceiver w = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.a(((Integer) aej.a(intent, "arg0", Integer.TYPE)).intValue());
        }
    };
    private final BroadcastReceiver x = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.i();
        }
    };
    private final BroadcastReceiver y = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.g((String) aej.a(intent, "arg0", String.class));
        }
    };
    private final BroadcastReceiver z = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            intent.getAction();
            aej.this.a((String) aej.a(intent, "arg0", String.class), ((Integer) aej.a(intent, "arg1", Integer.TYPE)).intValue());
        }
    };

    public final void m() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#onCDSUpdate(int arg0, java.lang.String[] arg1)");
        a(sb.toString(), this.b);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.a);
        sb2.append("#onRecording()");
        a(sb2.toString(), this.c);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.a);
        sb3.append("#onCreate(java.lang.String arg0)");
        a(sb3.toString(), this.d);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.a);
        sb4.append("#onInput(java.lang.String arg0, java.lang.String arg1)");
        a(sb4.toString(), this.e);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.a);
        sb5.append("#onPlay()");
        a(sb5.toString(), this.f);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.a);
        sb6.append("#onInputResult(java.lang.String arg0, java.lang.String arg1)");
        a(sb6.toString(), this.g);
        StringBuilder sb7 = new StringBuilder();
        sb7.append(this.a);
        sb7.append("#onPlayerPrev()");
        a(sb7.toString(), this.h);
        StringBuilder sb8 = new StringBuilder();
        sb8.append(this.a);
        sb8.append("#onEnter(java.lang.String arg0)");
        a(sb8.toString(), this.i);
        StringBuilder sb9 = new StringBuilder();
        sb9.append(this.a);
        sb9.append("#onClick(java.lang.String arg0)");
        a(sb9.toString(), this.j);
        StringBuilder sb10 = new StringBuilder();
        sb10.append(this.a);
        sb10.append("#onSelect(java.lang.String arg0)");
        a(sb10.toString(), this.k);
        StringBuilder sb11 = new StringBuilder();
        sb11.append(this.a);
        sb11.append("#onInit(java.lang.String[] arg0, java.lang.String[] arg1, boolean arg2)");
        a(sb11.toString(), this.l);
        StringBuilder sb12 = new StringBuilder();
        sb12.append(this.a);
        sb12.append("#onInit(java.lang.String[] arg0, java.lang.String[] arg1)");
        a(sb12.toString(), this.m);
        StringBuilder sb13 = new StringBuilder();
        sb13.append(this.a);
        sb13.append("#onDestroy(java.lang.String arg0)");
        a(sb13.toString(), this.n);
        StringBuilder sb14 = new StringBuilder();
        sb14.append(this.a);
        sb14.append("#onExit(java.lang.String arg0)");
        a(sb14.toString(), this.o);
        StringBuilder sb15 = new StringBuilder();
        sb15.append(this.a);
        sb15.append("#onPause()");
        a(sb15.toString(), this.p);
        StringBuilder sb16 = new StringBuilder();
        sb16.append(this.a);
        sb16.append("#onFastForward()");
        a(sb16.toString(), this.q);
        StringBuilder sb17 = new StringBuilder();
        sb17.append(this.a);
        sb17.append("#onPlayerNext()");
        a(sb17.toString(), this.r);
        StringBuilder sb18 = new StringBuilder();
        sb18.append(this.a);
        sb18.append("#onVehicleLanguageChanged(java.lang.String arg0)");
        a(sb18.toString(), this.s);
        StringBuilder sb19 = new StringBuilder();
        sb19.append(this.a);
        sb19.append("#onFastBackwardStopped()");
        a(sb19.toString(), this.t);
        StringBuilder sb20 = new StringBuilder();
        sb20.append(this.a);
        sb20.append("#onTransferringError()");
        a(sb20.toString(), this.u);
        StringBuilder sb21 = new StringBuilder();
        sb21.append(this.a);
        sb21.append("#onFastBackward()");
        a(sb21.toString(), this.v);
        StringBuilder sb22 = new StringBuilder();
        sb22.append(this.a);
        sb22.append("#onPlaylistClick(int arg0)");
        a(sb22.toString(), this.w);
        StringBuilder sb23 = new StringBuilder();
        sb23.append(this.a);
        sb23.append("#onRequestPlaylist()");
        a(sb23.toString(), this.x);
        StringBuilder sb24 = new StringBuilder();
        sb24.append(this.a);
        sb24.append("#onPopupActionClick(java.lang.String arg0)");
        a(sb24.toString(), this.y);
        StringBuilder sb25 = new StringBuilder();
        sb25.append(this.a);
        sb25.append("#onSuggestionSelected(java.lang.String arg0, int arg1)");
        a(sb25.toString(), this.z);
        StringBuilder sb26 = new StringBuilder();
        sb26.append(this.a);
        sb26.append("#onTransferring(int arg0, byte[] arg1)");
        a(sb26.toString(), this.A);
        StringBuilder sb27 = new StringBuilder();
        sb27.append(this.a);
        sb27.append("#onOptionsSelected(java.lang.String arg0, int[] arg1)");
        a(sb27.toString(), this.B);
        StringBuilder sb28 = new StringBuilder();
        sb28.append(this.a);
        sb28.append("#onRawCdsUpdate(java.lang.String arg0, java.lang.String arg1)");
        a(sb28.toString(), this.C);
        StringBuilder sb29 = new StringBuilder();
        sb29.append(this.a);
        sb29.append("#onTransferringDone()");
        a(sb29.toString(), this.D);
        StringBuilder sb30 = new StringBuilder();
        sb30.append(this.a);
        sb30.append("#onFastForwardStopped()");
        a(sb30.toString(), this.E);
        StringBuilder sb31 = new StringBuilder();
        sb31.append(this.a);
        sb31.append("#onWaitingAnimationCanceled(java.lang.String arg0)");
        a(sb31.toString(), this.F);
    }

    public final void n() {
        a(this.b);
        a(this.c);
        a(this.d);
        a(this.e);
        a(this.f);
        a(this.g);
        a(this.h);
        a(this.i);
        a(this.j);
        a(this.k);
        a(this.l);
        a(this.m);
        a(this.n);
        a(this.o);
        a(this.p);
        a(this.q);
        a(this.r);
        a(this.s);
        a(this.t);
        a(this.u);
        a(this.v);
        a(this.w);
        a(this.x);
        a(this.y);
        a(this.z);
        a(this.A);
        a(this.B);
        a(this.C);
        a(this.D);
        a(this.E);
        a(this.F);
    }

    public final void a(int i2, String[] strArr) {
        ((aef) agg.a(this.a).b(aef.class)).a(i2, strArr);
    }

    public final void j() {
        ((aef) agg.a(this.a).b(aef.class)).j();
    }

    public final void a(String str) {
        ((aef) agg.a(this.a).b(aef.class)).a(str);
    }

    public final void b(String str, String str2) {
        ((aef) agg.a(this.a).b(aef.class)).b(str, str2);
    }

    public final void a() {
        ((aef) agg.a(this.a).b(aef.class)).a();
    }

    public final void a(String str, String str2) {
        ((aef) agg.a(this.a).b(aef.class)).a(str, str2);
    }

    public final void d() {
        ((aef) agg.a(this.a).b(aef.class)).d();
    }

    public final void b(String str) {
        ((aef) agg.a(this.a).b(aef.class)).b(str);
    }

    public final void f(String str) {
        ((aef) agg.a(this.a).b(aef.class)).f(str);
    }

    public final void h(String str) {
        ((aef) agg.a(this.a).b(aef.class)).h(str);
    }

    public final void a(String[] strArr, String[] strArr2, boolean z2) {
        ((aef) agg.a(this.a).b(aef.class)).a(strArr, strArr2, z2);
    }

    public final void a(String[] strArr, String[] strArr2) {
        ((aef) agg.a(this.a).b(aef.class)).a(strArr, strArr2);
    }

    public final void d(String str) {
        ((aef) agg.a(this.a).b(aef.class)).d(str);
    }

    public final void c(String str) {
        ((aef) agg.a(this.a).b(aef.class)).c(str);
    }

    public final void b() {
        ((aef) agg.a(this.a).b(aef.class)).b();
    }

    public final void e() {
        ((aef) agg.a(this.a).b(aef.class)).e();
    }

    public final void c() {
        ((aef) agg.a(this.a).b(aef.class)).c();
    }

    public final void i(String str) {
        ((aef) agg.a(this.a).b(aef.class)).i(str);
    }

    public final void h() {
        ((aef) agg.a(this.a).b(aef.class)).h();
    }

    public final void l() {
        ((aef) agg.a(this.a).b(aef.class)).l();
    }

    public final void g() {
        ((aef) agg.a(this.a).b(aef.class)).g();
    }

    public final void a(int i2) {
        ((aef) agg.a(this.a).b(aef.class)).a(i2);
    }

    public final void i() {
        ((aef) agg.a(this.a).b(aef.class)).i();
    }

    public final void g(String str) {
        ((aef) agg.a(this.a).b(aef.class)).g(str);
    }

    public final void a(String str, int i2) {
        ((aef) agg.a(this.a).b(aef.class)).a(str, i2);
    }

    public final void a(int i2, byte[] bArr) {
        ((aef) agg.a(this.a).b(aef.class)).a(i2, bArr);
    }

    public final void a(String str, int[] iArr) {
        ((aef) agg.a(this.a).b(aef.class)).a(str, iArr);
    }

    public final void c(String str, String str2) {
        ((aef) agg.a(this.a).b(aef.class)).c(str, str2);
    }

    public final void k() {
        ((aef) agg.a(this.a).b(aef.class)).k();
    }

    public final void f() {
        ((aef) agg.a(this.a).b(aef.class)).f();
    }

    public final void e(String str) {
        ((aef) agg.a(this.a).b(aef.class)).e(str);
    }
}
