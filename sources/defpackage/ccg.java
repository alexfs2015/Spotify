package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@cey
/* renamed from: ccg reason: default package */
public final class ccg {
    public static final Object a = new Object();
    public static boolean b = false;
    private static boolean d = false;
    public cvg c;

    private final void c(Context context) {
        synchronized (a) {
            if (((Boolean) dpn.f().a(dsp.de)).booleanValue() && !d) {
                try {
                    d = true;
                    this.c = cvh.a(DynamiteModule.a(context, DynamiteModule.a, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.ads.omid.DynamiteOmid"));
                } catch (LoadingException e) {
                    cow.b("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final car a(String str, WebView webView, String str2, String str3, String str4) {
        synchronized (a) {
            if (((Boolean) dpn.f().a(dsp.de)).booleanValue()) {
                if (b) {
                    try {
                        return this.c.a(str, cas.a(webView), str2, str3, str4);
                    } catch (RemoteException | NullPointerException e) {
                        cow.b("#007 Could not call remote method.", e);
                        return null;
                    }
                }
            }
            return null;
        }
    }

    public final void a(car car) {
        synchronized (a) {
            if (((Boolean) dpn.f().a(dsp.de)).booleanValue()) {
                if (b) {
                    try {
                        this.c.b(car);
                    } catch (RemoteException | NullPointerException e) {
                        cow.b("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final void a(car car, View view) {
        synchronized (a) {
            if (((Boolean) dpn.f().a(dsp.de)).booleanValue()) {
                if (b) {
                    try {
                        this.c.a(car, cas.a(view));
                    } catch (RemoteException | NullPointerException e) {
                        cow.b("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final boolean a(Context context) {
        synchronized (a) {
            if (!((Boolean) dpn.f().a(dsp.de)).booleanValue()) {
                return false;
            }
            if (b) {
                return true;
            }
            try {
                c(context);
                boolean a2 = this.c.a(cas.a(context));
                b = a2;
                return a2;
            } catch (RemoteException e) {
                e = e;
                cow.b("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e2) {
                e = e2;
                cow.b("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    public final String b(Context context) {
        if (!((Boolean) dpn.f().a(dsp.de)).booleanValue()) {
            return null;
        }
        try {
            c(context);
            String str = "a.";
            String valueOf = String.valueOf(this.c.a());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } catch (RemoteException | NullPointerException e) {
            cow.b("#007 Could not call remote method.", e);
            return null;
        }
    }
}
