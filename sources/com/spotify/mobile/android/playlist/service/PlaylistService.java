package com.spotify.mobile.android.playlist.service;

import android.app.IntentService;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import java.util.Collections;
import java.util.concurrent.Callable;

@Deprecated
public class PlaylistService extends IntentService {
    public vjv a;
    public vjj b;

    public PlaylistService() {
        super("PlaylistService");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(boolean z, String str) {
        return z ? this.a.a(str, false) : Completable.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource a(boolean z, vjj vjj, String str) {
        return !z ? Completable.a() : vjj.a(str, Optional.e(), true);
    }

    @Deprecated
    public static void a(Context context, String str) {
        String str2 = "sostRle.tmlyocveadco.psi.ia.atiTir.o.feoImyonblsspiS.tidEesNtprl.n";
        a(context, "com.spotify.mobile.android.spotlets.playlist.service.action.INSERT", str, null);
    }

    @Deprecated
    public static void a(Context context, String str, String str2) {
        Class<PlaylistService> cls = PlaylistService.class;
        Intent intent = new Intent(context, PlaylistService.class);
        intent.setAction("com.spotify.mobile.android.spotlets.playlist.service.action.REMOVE_ITEM");
        String str3 = "aslmlirpuiy_";
        intent.putExtra("playlist_uri", (String) fbp.a(str));
        intent.putExtra("row_id", (String) fbp.a(str2));
        context.startService(intent);
    }

    private static void a(Context context, String str, String str2, Boolean bool) {
        Intent intent = new Intent(context, PlaylistService.class);
        intent.setAction((String) fbp.a(str));
        String str3 = "_pitoilysual";
        intent.putExtra("playlist_uri", (String) fbp.a(str2));
        if (bool != null) {
            intent.putExtra("new_state", bool);
        }
        context.startService(intent);
    }

    @Deprecated
    public static void a(Context context, String str, boolean z) {
        String str2 = "fatmobiR.nst.dEee..ytTellttr.pao.nmiNiiscslidSoeioIa.poscc.pboyvsr";
        a(context, "com.spotify.mobile.android.spotlets.playlist.service.action.INSERT", str, Boolean.TRUE);
    }

    @Deprecated
    public static void b(Context context, String str) {
        String str2 = ".ctoo.bnci.or.tmoidpste.oyciVrEiO.aba.esiil.pemlldlsnoptevRassMtfE";
        a(context, "com.spotify.mobile.android.spotlets.playlist.service.action.REMOVE", str, null);
    }

    @Deprecated
    public static void b(Context context, String str, boolean z) {
        String str2 = "vtiAntataslsdILossVApr.Raclmi..ooptetLyr.oBoiOelT.lpm.icdt.sEifboineceCyO";
        a(context, "com.spotify.mobile.android.spotlets.playlist.service.action.COLLABORATIVE", str, Boolean.valueOf(z));
    }

    @Deprecated
    public static void c(Context context, String str, boolean z) {
        String str2 = "Sps.idivpoaaitlm.e..ee.sciHbf.npoItocpPsoUlyainyt.rltsoesmL.itcrldo";
        a(context, "com.spotify.mobile.android.spotlets.playlist.service.action.PUBLISH", str, Boolean.valueOf(z));
    }

    public void onCreate() {
        whp.a((Service) this);
        super.onCreate();
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        Completable completable;
        Assertion.a((Object) intent);
        String str = (String) fbp.a(intent.getAction());
        String str2 = (String) fbp.a(intent.getStringExtra("playlist_uri"));
        String str3 = "t_snetwte";
        boolean booleanExtra = intent.getBooleanExtra("new_state", false);
        String str4 = ".eslTt.iiReimtsrlsoaaooodppSp..IiyveloaN.r.dilbtsscEnctos..ymfitnc";
        if ("com.spotify.mobile.android.spotlets.playlist.service.action.INSERT".equals(str)) {
            completable = this.a.a(str2).a((CompletableSource) Completable.a((Callable<? extends CompletableSource>) new Callable(booleanExtra, this.b, str2) {
                private final /* synthetic */ boolean f$0;
                private final /* synthetic */ vjj f$1;
                private final /* synthetic */ String f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final Object call() {
                    return PlaylistService.a(this.f$0, this.f$1, this.f$2);
                }
            }));
        } else if ("com.spotify.mobile.android.spotlets.playlist.service.action.REMOVE".equals(str)) {
            completable = this.a.b(str2);
        } else {
            String str5 = "teTmCsopoE.Lrllo.emiaVOcidossd.i.pnee.tfbttivAAyosBlai.OriIps.Rtan.loLmcc";
            if ("com.spotify.mobile.android.spotlets.playlist.service.action.COLLABORATIVE".equals(str)) {
                completable = this.b.a(str2, booleanExtra).a((CompletableSource) Completable.a((Callable<? extends CompletableSource>) new Callable(booleanExtra, str2) {
                    private final /* synthetic */ boolean f$1;
                    private final /* synthetic */ String f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final Object call() {
                        return PlaylistService.this.a(this.f$1, this.f$2);
                    }
                }));
            } else if ("com.spotify.mobile.android.spotlets.playlist.service.action.PUBLISH".equals(str)) {
                completable = this.a.a(str2, booleanExtra);
            } else {
                String str6 = "OylooctetiolI.stof_lnlrspaMaEMEtyioE.isp.ier.vcbiadot.cVemdos.imeR..nsT";
                if ("com.spotify.mobile.android.spotlets.playlist.service.action.REMOVE_ITEM".equals(str)) {
                    completable = this.b.b(str2, Collections.singletonList(intent.getStringExtra("row_id")));
                } else {
                    StringBuilder sb = new StringBuilder("Unsupported action ");
                    sb.append(str);
                    String str7 = " P.eivberlnalySsci i";
                    sb.append(" in PlaylistService.");
                    Assertion.a(sb.toString());
                    return;
                }
            }
        }
        try {
            completable.c();
        } catch (Throwable th) {
            Object[] objArr = {str, str2};
            String str8 = "%detFbpo/l lpi s/lasr/ n/  oitisaaf/%/a /rpytle/ ooy";
            Logger.e(th, "Failed to apply operation '%s' for playlist '%s'", objArr);
        }
    }
}
