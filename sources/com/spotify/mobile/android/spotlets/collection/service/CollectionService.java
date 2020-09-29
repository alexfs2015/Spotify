package com.spotify.mobile.android.spotlets.collection.service;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause;
import com.spotify.mobile.android.spotlets.collection.model.ModificationModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.Assertion.RecoverableAssertionError;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

@Deprecated
public class CollectionService extends whu {
    public isk a;
    public rll b;
    public lap c;
    public rwl d;
    public ToastieManager e;
    public FireAndForgetResolver f;
    private ObjectMapper g;

    static class Items implements JacksonModel {
        public String contextSource;
        public String[] items;
        public String source;

        Items() {
        }
    }

    public enum Messaging {
        NONE,
        ONLY_ERROR_DIALOG,
        ALL;
        
        public static final Messaging[] c = null;

        static {
            c = values();
        }
    }

    enum Result {
        SUCCESS_ADDED,
        SUCCESS_REMOVED,
        SUCCESS_BANNED,
        SUCCESS_UNBANNED,
        ERROR_INSUFFICIENT_STORAGE,
        UNKNOWN;

        static {
            values();
        }
    }

    public static final class a {
        public boolean a;
        public String b;
    }

    public CollectionService() {
        super("CollectionService");
    }

    static /* synthetic */ Result a(CollectionService collectionService, String str) {
        String str2 = "i.spniel.oo.locDsimm.ptsvseoDleosoarslac..oooc.inccbeto.y.dttienmdifAtrc";
        if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.ADD".equals(str)) {
            return Result.SUCCESS_ADDED;
        }
        String str3 = ".iOmtl.o.vyoicpnonttisblcclmmi.st.adEd.o.eaofMprtms.ceoRVoslercio.nseooceEs";
        if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.REMOVE".equals(str)) {
            return Result.SUCCESS_REMOVED;
        }
        String str4 = "tipto.BlmoeobotNtipdnsvascno.lisoiete.locr.molna.romsysdAice.ccecfos..io";
        if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.BAN".equals(str)) {
            return Result.SUCCESS_BANNED;
        }
        String str5 = "rt.albcs.Aseeesrato.isU..o.dNlBme.ooclifipobcomn.oocdtcNm.eviotpolyssicinn";
        return "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.UNBAN".equals(str) ? Result.SUCCESS_UNBANNED : Result.UNKNOWN;
    }

    private static a a(String[] strArr) {
        return a(strArr, LinkType.TRACK, LinkType.ALBUM, LinkType.SHOW_SHOW, LinkType.SHOW_EPISODE);
    }

    private static a a(String[] strArr, LinkType... linkTypeArr) {
        a aVar = new a();
        aVar.a = false;
        for (String str : strArr) {
            if (!jva.a(str, linkTypeArr)) {
                String str2 = "eir nlb ypnoea lltcncitkI:folvo d";
                StringBuilder sb = new StringBuilder("Invalid linktype for collection: ");
                sb.append(jva.a(str).b);
                aVar.b = sb.toString();
                return aVar;
            }
        }
        if (strArr.length > 0) {
            aVar.a = true;
        } else {
            String str3 = "Cayl  ttntv noridipuemate";
            aVar.b = "Cannot validate empty uri";
        }
        return aVar;
    }

    public static void a(Context context, String str, String str2, fqn fqn, Messaging messaging) {
        a(context, new String[]{str}, str2, fqn, messaging);
    }

    public static void a(Context context, String str, String str2, String str3, fqn fqn, Messaging messaging) {
        Context context2 = context;
        String str4 = str3;
        a(context, new String[]{str}, str2, str3, fqn, messaging);
    }

    private static void a(Context context, String str, String[] strArr, String str2, String str3, fqn fqn, Messaging messaging) {
        Class<CollectionService> cls = CollectionService.class;
        Intent intent = new Intent(context, CollectionService.class);
        intent.putExtra("uris", strArr);
        intent.putExtra("source", str2);
        String str4 = "utotcrcopenSe";
        intent.putExtra("contextSource", str3);
        intent.putExtra("messaging", messaging.ordinal());
        intent.setAction(str);
        if (fqn == null) {
            String str5 = "nlnt o ydtahugs.uotnfy  sc nseowo:nouyw fjuacibe  p uUla/Yso lic oyas lsetgrtpe    n/moa la";
            StringBuilder sb = new StringBuilder("You can only supply a null flags object if you don't want to show any message. sourceUri: ");
            sb.append(str2);
            String str6 = "oSsr,Uxtecuric :e ot";
            sb.append(", contextSourceUri: ");
            sb.append(str3);
            Assertion.a(sb.toString(), messaging == Messaging.NONE);
        } else {
            fqo.a(intent, fqn);
        }
        context.startService(intent);
    }

    public static void a(Context context, String[] strArr, String str, fqn fqn, Messaging messaging) {
        a a2 = a(strArr);
        if (!a2.a) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2.b);
            String str2 = "e:rmo Ur sic";
            sb.append(" sourceUri: ");
            sb.append(str);
            Assertion.b(sb.toString());
            return;
        }
        String str3 = "llocorelERiblttcdtdm.fic.smsocnneccoVMotomtsaEea.seo.o.n.sopepiOio..yoir.vi";
        String[] strArr2 = strArr;
        String str4 = str;
        fqn fqn2 = fqn;
        a(context, "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.REMOVE", strArr, str, "", fqn, messaging);
    }

    public static void a(Context context, String[] strArr, String str, String str2, fqn fqn, Messaging messaging) {
        a a2 = a(strArr);
        if (a2.a) {
            String[] strArr2 = strArr;
            String str3 = str;
            Messaging messaging2 = messaging;
            a(context, "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.ADD", strArr, str, str2, fqn, messaging);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a2.b);
        String str4 = " ouU:b  irerc";
        sb.append("  sourceUri: ");
        sb.append(str);
        String str5 = "rinet,btr:eUc Suoco ";
        sb.append(", contextSourceUri: ");
        sb.append(str2);
        throw new RecoverableAssertionError(sb.toString());
    }

    public static void b(Context context, String str, String str2, String str3, fqn fqn, Messaging messaging) {
        String[] strArr = {str};
        a a2 = a(strArr, LinkType.TRACK);
        if (a2.a) {
            String str4 = ".t..cdlt.it.s.ttt.cAcoorseelmsnncdcsm.pceeysinroNiplooveoBoofa.sooilibia";
            Context context2 = context;
            String str5 = str2;
            fqn fqn2 = fqn;
            Messaging messaging2 = messaging;
            a(context, "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.BAN", strArr, str2, str3, fqn, messaging);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a2.b);
        sb.append(" sourceUri: ");
        sb.append(str2);
        throw new RecoverableAssertionError(sb.toString());
    }

    public static void b(Context context, String[] strArr, String str, String str2, fqn fqn, Messaging messaging) {
        a a2 = a(strArr, LinkType.TRACK);
        if (a2.a) {
            String str3 = "nv.dsyBsppi.eaefs.mrcocldonetNb.mNlUrctimlo.etocAp.osi.aiscooti.eniocoslo.";
            Context context2 = context;
            String str4 = str;
            String str5 = str2;
            fqn fqn2 = fqn;
            Messaging messaging2 = messaging;
            a(context, "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.UNBAN", strArr, str, str2, fqn, messaging);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a2.b);
        sb.append(" sourceUri: ");
        sb.append(str);
        throw new RecoverableAssertionError(sb.toString());
    }

    public static void c(Context context, String str, String str2, String str3, fqn fqn, Messaging messaging) {
        Context context2 = context;
        String str4 = str2;
        fqn fqn2 = fqn;
        Messaging messaging2 = messaging;
        b(context, new String[]{str}, str2, str3, fqn, messaging);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Messaging messaging, Result result, fqn fqn, LinkType linkType, Items items) {
        if (result == Result.ERROR_INSUFFICIENT_STORAGE) {
            Intent intent = new Intent();
            String str = "RCIOfOsiLtoE.roomtPCRt_ce.OoorlpIy.cmeEni_.sicRTlL.NCcEr";
            intent.setAction("com.spotify.music.collection.error.EPIC_COLLECTION_ERROR");
            if (fqn != null) {
                fqo.a(intent, fqn);
            }
            sendBroadcast(intent);
        }
        if (messaging != Messaging.NONE) {
            if (result == Result.SUCCESS_ADDED && messaging == Messaging.ALL) {
                if (linkType == LinkType.SHOW_SHOW) {
                    this.b.a(R.string.toast_liked_show_your_library);
                } else {
                    this.e.a(uzy.a(getString(R.string.toast_saved_to_collection_your_library), 3000).c(R.color.cat_white).b(R.color.cat_black).a());
                }
            }
            if (result == Result.SUCCESS_REMOVED && messaging == Messaging.ALL && (linkType == LinkType.SHOW_SHOW || linkType == LinkType.TRACK)) {
                this.b.a(R.string.toast_removed_from_collection_your_library);
            }
            String str2 = "oesurc U,:etto rcnSi";
            String str3 = ", contextSourceUri: ";
            if (result == Result.SUCCESS_BANNED && messaging == Messaging.ALL) {
                if (linkType == LinkType.TRACK) {
                    String str4 = items.items[0];
                    if (!this.c.a(fqn) || str4.equals(items.contextSource)) {
                        this.a.a(R.string.toast_banned_track);
                    } else {
                        this.a.a(R.string.toast_banned_track_hide);
                    }
                } else {
                    String str5 = "sesmoaeansp sls oU  cfpMdybrgueaogo:soitcn.n  i krr frtru r";
                    StringBuilder sb = new StringBuilder("Messaging for ban is only supported for tracks. sourceUri: ");
                    sb.append(items.source);
                    sb.append(str3);
                    sb.append(items.contextSource);
                    throw new RecoverableAssertionError(sb.toString());
                }
            }
            if (result == Result.SUCCESS_UNBANNED && messaging == Messaging.ALL) {
                if (linkType != LinkType.TRACK) {
                    StringBuilder sb2 = new StringBuilder("Messaging for unban is only supported for tracks. sourceUri: ");
                    sb2.append(items.source);
                    sb2.append(str3);
                    sb2.append(items.contextSource);
                    throw new RecoverableAssertionError(sb2.toString());
                }
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        this.g = this.d.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String str;
        String str2;
        setTheme(2132017713);
        Assertion.a((Object) intent);
        final String action = intent.getAction();
        final Items items = new Items();
        items.items = intent.getStringArrayExtra("uris");
        Assertion.a((Object) items.items);
        String str3 = "n oeoui o/Ymsa tt aso.dve l euedmeattm";
        Assertion.a("You must add/remove at least one item.", items.items.length > 0);
        items.source = intent.getStringExtra("source");
        items.contextSource = intent.getStringExtra("contextSource");
        String str4 = "nsH.pbulalggmaesgelrtAreF";
        fqn a2 = intent.hasExtra("FlagsArgumentHelper.Flags") ? fqo.a(intent) : null;
        fqn fqn = a2;
        final fqn fqn2 = a2;
        String str5 = "e.t.inbcpomnmoistya.slDiitbcsvsdooeAtaf..molneicsco.Ddlooe.cosreioc.rlt.";
        String str6 = "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.ADD";
        String str7 = "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.REMOVE";
        if (!str6.equals(action)) {
            String str8 = "mtloe..tsoN.ecctArcitnmcoo.eao.oimriobioods.lyactBvli.spoipnlen..estcfds";
            if (!"com.spotify.mobile.android.spotlets.collection.cosmos.service.action.BAN".equals(action)) {
                if (str7.equals(action) || "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.UNBAN".equals(action)) {
                    str = Request.DELETE;
                    if (!str6.equals(action) || str7.equals(action)) {
                        String str9 = "iv-meolpcn/oesott//:rcliscm/e";
                        str2 = "sp://core-collection/v1/items";
                    } else {
                        String str10 = "sasntcuo/s:p/li/-aont/llorccneesbb";
                        str2 = "sp://core-collection/unstable/bans";
                    }
                    Semaphore semaphore = new Semaphore(0);
                    Handler handler = new Handler(getMainLooper());
                    final LinkType linkType = jva.a(items.items[0]).b;
                    String str11 = "smagoisne";
                    final Messaging messaging = Messaging.c[intent.getIntExtra("messaging", Messaging.NONE.ordinal())];
                    Request request = new Request(str, str2, new HashMap(), this.g.writeValueAsString(items).getBytes(fbi.c));
                    FireAndForgetResolver fireAndForgetResolver = this.f;
                    AnonymousClass1 r1 = r1;
                    Semaphore semaphore2 = semaphore;
                    final Semaphore semaphore3 = semaphore;
                    AnonymousClass1 r12 = new JsonCallbackReceiver<ModificationModel>(handler, ModificationModel.class, this.g) {
                        public final void onError(Throwable th, ErrorCause errorCause) {
                            CollectionService.this.a(messaging, Result.UNKNOWN, fqn2, linkType, items);
                            semaphore3.release();
                        }

                        public final /* synthetic */ void onResolved(Response response, Object obj) {
                            Result result;
                            Messaging messaging;
                            CollectionService collectionService;
                            int status = response.getStatus();
                            if (status < 200 || status > 299) {
                                CollectionService collectionService2 = CollectionService.this;
                                result = status == 507 ? Result.ERROR_INSUFFICIENT_STORAGE : Result.UNKNOWN;
                                collectionService = collectionService2;
                                messaging = messaging;
                            } else {
                                CollectionService collectionService3 = CollectionService.this;
                                Messaging messaging2 = messaging;
                                CollectionService collectionService4 = collectionService3;
                                collectionService = collectionService3;
                                Messaging messaging3 = messaging2;
                                messaging = messaging2;
                                result = CollectionService.a(collectionService3, action);
                            }
                            collectionService.a(messaging, result, fqn2, linkType, items);
                            semaphore3.release();
                        }
                    };
                    fireAndForgetResolver.resolve(request, r12);
                    semaphore.acquire();
                }
                String str12 = "dsouoprnpnUt e tpac";
                StringBuilder sb = new StringBuilder("Unsupported action ");
                sb.append(action);
                String str13 = " tSelnlontiC. recivico";
                sb.append(" in CollectionService.");
                Assertion.a(sb.toString());
                return;
            }
        }
        String str14 = "STPO";
        str = Request.POST;
        if (!str6.equals(action)) {
        }
        String str92 = "iv-meolpcn/oesott//:rcliscm/e";
        str2 = "sp://core-collection/v1/items";
        try {
            Semaphore semaphore4 = new Semaphore(0);
            Handler handler2 = new Handler(getMainLooper());
            final LinkType linkType2 = jva.a(items.items[0]).b;
            String str112 = "smagoisne";
            final Messaging messaging2 = Messaging.c[intent.getIntExtra("messaging", Messaging.NONE.ordinal())];
            Request request2 = new Request(str, str2, new HashMap(), this.g.writeValueAsString(items).getBytes(fbi.c));
            FireAndForgetResolver fireAndForgetResolver2 = this.f;
            AnonymousClass1 r13 = r12;
            Semaphore semaphore22 = semaphore4;
            final Semaphore semaphore32 = semaphore4;
            AnonymousClass1 r122 = new JsonCallbackReceiver<ModificationModel>(handler2, ModificationModel.class, this.g) {
                public final void onError(Throwable th, ErrorCause errorCause) {
                    CollectionService.this.a(messaging2, Result.UNKNOWN, fqn2, linkType2, items);
                    semaphore32.release();
                }

                public final /* synthetic */ void onResolved(Response response, Object obj) {
                    Result result;
                    Messaging messaging;
                    CollectionService collectionService;
                    int status = response.getStatus();
                    if (status < 200 || status > 299) {
                        CollectionService collectionService2 = CollectionService.this;
                        result = status == 507 ? Result.ERROR_INSUFFICIENT_STORAGE : Result.UNKNOWN;
                        collectionService = collectionService2;
                        messaging = messaging2;
                    } else {
                        CollectionService collectionService3 = CollectionService.this;
                        Messaging messaging2 = messaging2;
                        CollectionService collectionService4 = collectionService3;
                        collectionService = collectionService3;
                        Messaging messaging3 = messaging2;
                        messaging = messaging2;
                        result = CollectionService.a(collectionService3, action);
                    }
                    collectionService.a(messaging, result, fqn2, linkType2, items);
                    semaphore32.release();
                }
            };
            fireAndForgetResolver2.resolve(request2, r122);
            semaphore4.acquire();
        } catch (JsonProcessingException unused) {
            Assertion.a("Failed to serialize item request.");
        } catch (InterruptedException unused2) {
            String str15 = "uni abirpt. Wadterset";
            Assertion.a("Wait was interrupted.");
        }
    }
}
