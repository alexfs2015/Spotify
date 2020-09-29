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
public class CollectionService extends vto {
    public ipx a;
    public rcn b;
    public kxg c;
    public rnf d;
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

    public void onCreate() {
        super.onCreate();
        this.g = this.d.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String str;
        setTheme(2132017710);
        Assertion.a((Object) intent);
        final String action = intent.getAction();
        final Items items = new Items();
        items.items = intent.getStringArrayExtra("uris");
        Assertion.a((Object) items.items);
        Assertion.a("You must add/remove at least one item.", items.items.length > 0);
        items.source = intent.getStringExtra("source");
        items.contextSource = intent.getStringExtra("contextSource");
        final fpt a2 = intent.hasExtra("FlagsArgumentHelper.Flags") ? fpu.a(intent) : null;
        String str2 = "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.ADD";
        String str3 = "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.REMOVE";
        if (str2.equals(action) || "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.BAN".equals(action)) {
            str = Request.POST;
        } else if (str3.equals(action) || "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.UNBAN".equals(action)) {
            str = Request.DELETE;
        } else {
            StringBuilder sb = new StringBuilder("Unsupported action ");
            sb.append(action);
            sb.append(" in CollectionService.");
            Assertion.a(sb.toString());
            return;
        }
        String str4 = (str2.equals(action) || str3.equals(action)) ? "sp://core-collection/v1/items" : "sp://core-collection/unstable/bans";
        try {
            Semaphore semaphore = new Semaphore(0);
            Handler handler = new Handler(getMainLooper());
            final LinkType linkType = jst.a(items.items[0]).b;
            final Messaging messaging = Messaging.c[intent.getIntExtra("messaging", Messaging.NONE.ordinal())];
            Request request = new Request(str, str4, new HashMap(), this.g.writeValueAsString(items).getBytes(far.c));
            FireAndForgetResolver fireAndForgetResolver = this.f;
            final Semaphore semaphore2 = semaphore;
            AnonymousClass1 r1 = new JsonCallbackReceiver<ModificationModel>(handler, ModificationModel.class, this.g) {
                public final void onError(Throwable th, ErrorCause errorCause) {
                    CollectionService.this.a(messaging, Result.UNKNOWN, a2, linkType, items);
                    semaphore2.release();
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
                        collectionService = collectionService3;
                        messaging = messaging;
                        result = CollectionService.a(collectionService3, action);
                    }
                    collectionService.a(messaging, result, a2, linkType, items);
                    semaphore2.release();
                }
            };
            fireAndForgetResolver.resolve(request, r1);
            semaphore.acquire();
        } catch (JsonProcessingException unused) {
            Assertion.a("Failed to serialize item request.");
        } catch (InterruptedException unused2) {
            Assertion.a("Wait was interrupted.");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Messaging messaging, Result result, fpt fpt, LinkType linkType, Items items) {
        if (result == Result.ERROR_INSUFFICIENT_STORAGE) {
            Intent intent = new Intent();
            intent.setAction("com.spotify.music.collection.error.EPIC_COLLECTION_ERROR");
            if (fpt != null) {
                fpu.a(intent, fpt);
            }
            sendBroadcast(intent);
        }
        if (messaging != Messaging.NONE) {
            if (result == Result.SUCCESS_ADDED && messaging == Messaging.ALL) {
                if (linkType == LinkType.SHOW_SHOW) {
                    this.b.a(R.string.toast_liked_show_your_library);
                } else {
                    this.e.a(uos.a(getString(R.string.toast_saved_to_collection_your_library), 3000).c(R.color.cat_white).b(R.color.cat_black).a());
                }
            }
            if (result == Result.SUCCESS_REMOVED && messaging == Messaging.ALL && (linkType == LinkType.SHOW_SHOW || linkType == LinkType.TRACK)) {
                this.b.a(R.string.toast_removed_from_collection_your_library);
            }
            String str = ", contextSourceUri: ";
            if (result == Result.SUCCESS_BANNED && messaging == Messaging.ALL) {
                if (linkType == LinkType.TRACK) {
                    String str2 = items.items[0];
                    if (!this.c.a(fpt) || str2.equals(items.contextSource)) {
                        this.a.a(R.string.toast_banned_track);
                    } else {
                        this.a.a(R.string.toast_banned_track_hide);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Messaging for ban is only supported for tracks. sourceUri: ");
                    sb.append(items.source);
                    sb.append(str);
                    sb.append(items.contextSource);
                    throw new RecoverableAssertionError(sb.toString());
                }
            }
            if (result == Result.SUCCESS_UNBANNED && messaging == Messaging.ALL && linkType != LinkType.TRACK) {
                StringBuilder sb2 = new StringBuilder("Messaging for unban is only supported for tracks. sourceUri: ");
                sb2.append(items.source);
                sb2.append(str);
                sb2.append(items.contextSource);
                throw new RecoverableAssertionError(sb2.toString());
            }
        }
    }

    public static void a(Context context, String str, String str2, String str3, fpt fpt, Messaging messaging) {
        a(context, new String[]{str}, str2, str3, fpt, messaging);
    }

    public static void a(Context context, String[] strArr, String str, String str2, fpt fpt, Messaging messaging) {
        a a2 = a(strArr);
        if (a2.a) {
            a(context, "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.ADD", strArr, str, str2, fpt, messaging);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a2.b);
        sb.append("  sourceUri: ");
        sb.append(str);
        sb.append(", contextSourceUri: ");
        sb.append(str2);
        throw new RecoverableAssertionError(sb.toString());
    }

    public static void a(Context context, String str, String str2, fpt fpt, Messaging messaging) {
        a(context, new String[]{str}, str2, fpt, messaging);
    }

    public static void a(Context context, String[] strArr, String str, fpt fpt, Messaging messaging) {
        a a2 = a(strArr);
        if (!a2.a) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2.b);
            sb.append(" sourceUri: ");
            sb.append(str);
            Assertion.b(sb.toString());
            return;
        }
        a(context, "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.REMOVE", strArr, str, "", fpt, messaging);
    }

    public static void c(Context context, String str, String str2, String str3, fpt fpt, Messaging messaging) {
        b(context, new String[]{str}, str2, str3, fpt, messaging);
    }

    public static void b(Context context, String[] strArr, String str, String str2, fpt fpt, Messaging messaging) {
        a a2 = a(strArr, LinkType.TRACK);
        if (a2.a) {
            a(context, "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.UNBAN", strArr, str, str2, fpt, messaging);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a2.b);
        sb.append(" sourceUri: ");
        sb.append(str);
        throw new RecoverableAssertionError(sb.toString());
    }

    private static a a(String[] strArr) {
        return a(strArr, LinkType.TRACK, LinkType.ALBUM, LinkType.SHOW_SHOW, LinkType.SHOW_EPISODE);
    }

    private static a a(String[] strArr, LinkType... linkTypeArr) {
        a aVar = new a();
        aVar.a = false;
        for (String str : strArr) {
            if (!jst.a(str, linkTypeArr)) {
                StringBuilder sb = new StringBuilder("Invalid linktype for collection: ");
                sb.append(jst.a(str).b);
                aVar.b = sb.toString();
                return aVar;
            }
        }
        if (strArr.length > 0) {
            aVar.a = true;
        } else {
            aVar.b = "Cannot validate empty uri";
        }
        return aVar;
    }

    private static void a(Context context, String str, String[] strArr, String str2, String str3, fpt fpt, Messaging messaging) {
        Intent intent = new Intent(context, CollectionService.class);
        intent.putExtra("uris", strArr);
        intent.putExtra("source", str2);
        intent.putExtra("contextSource", str3);
        intent.putExtra("messaging", messaging.ordinal());
        intent.setAction(str);
        if (fpt == null) {
            StringBuilder sb = new StringBuilder("You can only supply a null flags object if you don't want to show any message. sourceUri: ");
            sb.append(str2);
            sb.append(", contextSourceUri: ");
            sb.append(str3);
            Assertion.a(sb.toString(), messaging == Messaging.NONE);
        } else {
            fpu.a(intent, fpt);
        }
        context.startService(intent);
    }

    public static void b(Context context, String str, String str2, String str3, fpt fpt, Messaging messaging) {
        String[] strArr = {str};
        a a2 = a(strArr, LinkType.TRACK);
        if (a2.a) {
            a(context, "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.BAN", strArr, str2, str3, fpt, messaging);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a2.b);
        sb.append(" sourceUri: ");
        sb.append(str2);
        throw new RecoverableAssertionError(sb.toString());
    }

    static /* synthetic */ Result a(CollectionService collectionService, String str) {
        if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.ADD".equals(str)) {
            return Result.SUCCESS_ADDED;
        }
        if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.REMOVE".equals(str)) {
            return Result.SUCCESS_REMOVED;
        }
        if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.BAN".equals(str)) {
            return Result.SUCCESS_BANNED;
        }
        if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.UNBAN".equals(str)) {
            return Result.SUCCESS_UNBANNED;
        }
        return Result.UNKNOWN;
    }
}
