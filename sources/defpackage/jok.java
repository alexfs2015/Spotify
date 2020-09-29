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
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.squareup.picasso.Picasso;
import io.reactivex.Flowable;
import java.util.concurrent.TimeoutException;

/* renamed from: jok reason: default package */
public class jok extends wia {
    public jlr T;
    public RxResolver U;
    public hhc V;
    public Picasso W;
    public Flowable<fqn> X;
    public Flowable<SessionState> Y;
    public a Z;
    private xip ab;
    private jpe ac;
    private ContextMenuViewModel ad;
    /* access modifiers changed from: private */
    public fuj ae;
    /* access modifiers changed from: private */
    public final Handler af = new Handler();
    private String ag;
    private boolean ah;

    /* renamed from: jok$a */
    public interface a {
        void onDismiss();
    }

    public static <T> jok a(Context context, jor<T> jor, T t, sso sso) {
        return a(jor.onCreateContextMenu(t), (kf) context, sso);
    }

    public static jok a(jpe jpe, kf kfVar, sso sso) {
        fbp.a(kfVar);
        fbp.a(jpe);
        String str = null;
        if (jpe == jpe.a) {
            return null;
        }
        rlx rlx = (rlx) kfVar;
        if (!rlx.p()) {
            return null;
        }
        jok jok = new jok();
        jok.ac = jpe;
        jok.a(kfVar.i(), "ContextMenuFragment");
        if (sso != null) {
            str = sso.toString();
        }
        rlx.a(jpe.c.a.b.a(), str);
        jok.ag = str;
        return jok;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ContextMenuViewModel contextMenuViewModel) {
        this.ad = contextMenuViewModel;
    }

    static /* synthetic */ void a(jok jok, ContextMenuViewModel contextMenuViewModel) {
        try {
            String c = jok.ac.c.a.c();
            if (ae()) {
                LinkType linkType = jva.a(c).b;
                if ((linkType == LinkType.TRACK || linkType == LinkType.ALBUM || linkType == LinkType.ARTIST || linkType == LinkType.PROFILE_PLAYLIST || linkType == LinkType.PLAYLIST_V2 || linkType == LinkType.SHOW_EPISODE || linkType == LinkType.SHOW_SHOW) && contextMenuViewModel.h) {
                    String a2 = gck.a(c, fbi.c);
                    StringBuilder sb = new StringBuilder("https://scannables.scdn.co/uri/800/");
                    sb.append(a2);
                    Uri parse = Uri.parse(sb.toString());
                    if (jva.a(c).b == LinkType.ARTIST) {
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

    private static boolean ae() {
        return VERSION.SDK_INT >= 23;
    }

    public final void A() {
        super.A();
        c();
    }

    public final Dialog a(Bundle bundle) {
        jpe jpe = this.ac;
        if (jpe == null) {
            this.ah = true;
            return super.a(bundle);
        }
        jqo<T> jqo = jpe.c.a;
        String str = this.ag;
        jlr jlr = this.T;
        if (ae()) {
            if (!jqo.a()) {
                str = jqo.c();
            }
            bd bdVar = new bd(null, uqo.aM.a(), str, 0, 0, ViewUris.ca.toString(), "scannable", null, (double) jtp.a.a());
            jlr.a(bdVar);
        }
        this.ae = new fun(p(), new fui() {
            public final void a() {
                jok.this.c();
            }
        }, this.W);
        xip xip = this.ab;
        if (xip != null) {
            xip.unsubscribe();
        }
        jpi<?> jpi = this.ac.c;
        ContextMenuViewModel a2 = jpi.b.a(jpi.a);
        a2.f = true;
        this.ad = a2;
        this.ae.a(this.ad);
        jpe jpe2 = this.ac;
        this.ab = jpe2.c.a(this.U, this.X, this.Y).b((xis<? super T>) new $$Lambda$jok$BanDE6sU3enrtSg1F2Sdti1sbY<Object>(this)).b().a(wit.a(this.V.c())).a((xij<? super T>) new xij<ContextMenuViewModel>() {
            public final void onCompleted() {
            }

            public final void onError(Throwable th) {
                Logger.b(th, "Failed to load context menu", new Object[0]);
                if ((th instanceof TimeoutException) || (th instanceof NullPointerException)) {
                    Toast.makeText(jok.this.p(), R.string.failed_to_load_context_menu, 0).show();
                    jok.this.af.post(new Runnable() {
                        public final void run() {
                            jok.this.c();
                        }
                    });
                    return;
                }
                throw new RuntimeException(th);
            }

            public final /* synthetic */ void onNext(Object obj) {
                ContextMenuViewModel contextMenuViewModel = (ContextMenuViewModel) obj;
                jok.a(jok.this, contextMenuViewModel);
                jok.this.ae.a(contextMenuViewModel);
            }
        });
        Dialog a3 = this.ae.a();
        a3.setOnKeyListener(new OnKeyListener() {
            private boolean a;

            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4 || this.a) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    this.a = true;
                    jok.this.ae.b();
                }
                return true;
            }
        });
        return a3;
    }

    public final void aI_() {
        super.aI_();
        ((rlw) fbp.a(p())).Z_();
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (this.ah) {
            c();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        xip xip = this.ab;
        if (xip != null) {
            xip.unsubscribe();
        }
        a aVar = this.Z;
        if (aVar != null) {
            aVar.onDismiss();
        }
    }
}
