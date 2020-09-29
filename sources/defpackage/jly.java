package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.widget.Toast;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel.HeaderViewType;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.squareup.picasso.Picasso;
import java.util.concurrent.TimeoutException;

/* renamed from: jly reason: default package */
public class jly extends vtu {
    public jjf T;
    public RxResolver U;
    public heg V;
    public Picasso W;
    public a X;
    private wuk Z;
    private jms aa;
    private ContextMenuViewModel ab;
    /* access modifiers changed from: private */
    public ftp ac;
    /* access modifiers changed from: private */
    public final Handler ad = new Handler();
    private String ae;
    private boolean af;

    /* renamed from: jly$a */
    public interface a {
        void onDismiss();
    }

    public final Dialog a(Bundle bundle) {
        jms jms = this.aa;
        if (jms == null) {
            this.af = true;
            return super.a(bundle);
        }
        joc<T> joc = jms.c.a;
        String str = this.ae;
        jjf jjf = this.T;
        if (ae()) {
            if (!joc.a()) {
                str = joc.c();
            }
            be beVar = new be(null, udt.aM.a(), str, 0, 0, ViewUris.cb.toString(), "scannable", null, (double) jrf.a.a());
            jjf.a(beVar);
        }
        this.ac = new ftt(p(), new fto() {
            public final void a() {
                jly.this.c();
            }
        }, this.W);
        wuk wuk = this.Z;
        if (wuk != null) {
            wuk.unsubscribe();
        }
        jmw<?> jmw = this.aa.c;
        ContextMenuViewModel a2 = jmw.b.a(jmw.a);
        a2.f = true;
        this.ab = a2;
        this.ac.a(this.ab);
        jms jms2 = this.aa;
        this.Z = jms2.c.a(this.U).b((wun<? super T>) new $$Lambda$jly$Y_5gL8vlvjiI3fjCmuV0fGYc6g<Object>(this)).b().a(vun.a(this.V.c())).a((wue<? super T>) new wue<ContextMenuViewModel>() {
            public final void onCompleted() {
            }

            public final /* synthetic */ void onNext(Object obj) {
                ContextMenuViewModel contextMenuViewModel = (ContextMenuViewModel) obj;
                jly.a(jly.this, contextMenuViewModel);
                jly.this.ac.a(contextMenuViewModel);
            }

            public final void onError(Throwable th) {
                Logger.b(th, "Failed to load context menu", new Object[0]);
                if ((th instanceof TimeoutException) || (th instanceof NullPointerException)) {
                    Toast.makeText(jly.this.p(), R.string.failed_to_load_context_menu, 0).show();
                    jly.this.ad.post(new Runnable() {
                        public final void run() {
                            jly.this.c();
                        }
                    });
                    return;
                }
                throw new RuntimeException(th);
            }
        });
        Dialog a3 = this.ac.a();
        a3.setOnKeyListener(new OnKeyListener() {
            private boolean a;

            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4 || this.a) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    this.a = true;
                    jly.this.ac.b();
                }
                return true;
            }
        });
        return a3;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ContextMenuViewModel contextMenuViewModel) {
        this.ab = contextMenuViewModel;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (this.af) {
            c();
        }
    }

    public final void A() {
        super.A();
        c();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        wuk wuk = this.Z;
        if (wuk != null) {
            wuk.unsubscribe();
        }
        a aVar = this.X;
        if (aVar != null) {
            aVar.onDismiss();
        }
    }

    public static jly a(jms jms, ka kaVar, sih sih) {
        fay.a(kaVar);
        fay.a(jms);
        String str = null;
        if (jms == jms.a) {
            return null;
        }
        rcz rcz = (rcz) kaVar;
        if (!rcz.p()) {
            return null;
        }
        jly jly = new jly();
        jly.aa = jms;
        jly.a(kaVar.i(), "ContextMenuFragment");
        if (sih != null) {
            str = sih.toString();
        }
        rcz.a(jms.c.a.b.a(), str);
        jly.ae = str;
        return jly;
    }

    public final void aK_() {
        super.aK_();
        ((rcy) fay.a(p())).Z_();
    }

    public static <T> jly a(Context context, jmf<T> jmf, T t, sih sih) {
        return a(jmf.onCreateContextMenu(t), (ka) context, sih);
    }

    private static boolean ae() {
        return VERSION.SDK_INT >= 23;
    }

    static /* synthetic */ void a(jly jly, ContextMenuViewModel contextMenuViewModel) {
        try {
            String c = jly.aa.c.a.c();
            if (ae()) {
                LinkType linkType = jst.a(c).b;
                if ((linkType == LinkType.TRACK || linkType == LinkType.ALBUM || linkType == LinkType.ARTIST || linkType == LinkType.PROFILE_PLAYLIST || linkType == LinkType.PLAYLIST_V2 || linkType == LinkType.SHOW_EPISODE || linkType == LinkType.SHOW_SHOW) && contextMenuViewModel.h) {
                    String a2 = gbm.a(c, far.c);
                    StringBuilder sb = new StringBuilder("https://scannables.scdn.co/uri/800/");
                    sb.append(a2);
                    Uri parse = Uri.parse(sb.toString());
                    if (jst.a(c).b == LinkType.ARTIST) {
                        contextMenuViewModel.a(false);
                    }
                    contextMenuViewModel.a(parse);
                    contextMenuViewModel.e = HeaderViewType.LARGE_IMAGE;
                }
            }
        } catch (UnsupportedOperationException unused) {
            Logger.d("There is no uri in the model", new Object[0]);
        }
    }
}
