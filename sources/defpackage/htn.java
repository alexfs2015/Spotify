package defpackage;

import android.os.Bundle;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Response;
import com.spotify.mobile.android.service.media.search.WebApiSearchResults;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Cancellable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: htn reason: default package */
public final class htn {
    private final hts a;

    public htn(hts hts) {
        this.a = hts;
    }

    public final Single<WebApiSearchResults> a(String str, String str2, int i, int i2, Bundle bundle) {
        $$Lambda$htn$ZNH3keqDbKf2ii7GQY3CHhXcwLQ r0 = new $$Lambda$htn$ZNH3keqDbKf2ii7GQY3CHhXcwLQ(this, str, str2, i, i2, bundle);
        return Single.a((SingleOnSubscribe<T>) r0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, int i, int i2, Bundle bundle, SingleEmitter singleEmitter) {
        Bundle bundle2;
        char c;
        final String str3 = str;
        String str4 = str2;
        final SingleEmitter singleEmitter2 = singleEmitter;
        hts hts = this.a;
        hts.getClass();
        singleEmitter2.a((Cancellable) new $$Lambda$sm_31v3NQWZsD9KEFI06ZpNuJ4(hts));
        hts hts2 = this.a;
        long j = (long) i;
        long j2 = (long) i2;
        AnonymousClass1 r9 = new htt<Response>() {
            public final /* synthetic */ void a(Object obj) {
                Response response = (Response) obj;
                if (!singleEmitter2.b()) {
                    singleEmitter2.a(new WebApiSearchResults(str3, response));
                }
            }

            public final void a(Throwable th) {
                if (!singleEmitter2.b()) {
                    singleEmitter2.a(th);
                }
            }
        };
        HashMap hashMap = new HashMap(5);
        if (bundle != null) {
            bundle2 = bundle;
        } else {
            bundle2 = new Bundle();
        }
        String string = bundle2.getString("android.intent.extra.artist");
        String string2 = bundle2.getString("android.intent.extra.album");
        String string3 = bundle2.getString("android.intent.extra.title");
        String string4 = bundle2.getString("android.intent.extra.genre");
        String string5 = bundle2.getString("android.intent.extra.playlist");
        String string6 = bundle2.getString("android.intent.extra.focus");
        AnonymousClass1 r20 = r9;
        a aVar = new a(0);
        if ("vnd.android.cursor.item/artist".equals(string6) && !fax.a(string)) {
            aVar.e = "track,artist";
            aVar.b = string;
            aVar.c = string4;
        } else if (!"vnd.android.cursor.item/album".equals(string6) || fax.a(string2)) {
            String str5 = "album,artist,playlist,track";
            if ("vnd.android.cursor.item/audio".equals(string6) && !fax.a(string3)) {
                aVar.e = str5;
                aVar.c = string4;
                aVar.b = string;
                aVar.d = string3;
            } else if ("vnd.android.cursor.item/genre".equals(string6) && !fax.a(string4)) {
                aVar.e = TrackData.TYPE_TRACK;
                aVar.c = string4;
            } else if (!"vnd.android.cursor.item/playlist".equals(string6) || fax.a(string5)) {
                aVar.e = str5;
                aVar.d = str3;
            } else {
                aVar.e = "playlist";
                aVar.d = str3;
            }
        } else {
            aVar.e = "album";
            aVar.c = string4;
            aVar.a = string2;
            aVar.b = string;
        }
        StringBuilder sb = new StringBuilder();
        if (!fax.a(aVar.d)) {
            if (aVar.d.contains("*")) {
                sb.append(aVar.d);
            } else {
                sb.append(String.format(Locale.US, "\"%s\"", new Object[]{aVar.d}));
            }
        }
        if (!fax.a(aVar.b)) {
            if (sb.length() != 0) {
                sb.append(' ');
            }
            sb.append(String.format(Locale.US, "artist:\"%s\"", new Object[]{aVar.b}));
        }
        if (!fax.a(aVar.a)) {
            if (sb.length() != 0) {
                sb.append(' ');
            }
            sb.append(String.format(Locale.US, "album:\"%s\"", new Object[]{aVar.a}));
        }
        if (!fax.a(aVar.c)) {
            if (sb.length() != 0) {
                sb.append(' ');
            }
            c = 0;
            sb.append(String.format(Locale.US, "genre:\"%s\"", new Object[]{aVar.c}));
        } else {
            c = 0;
        }
        String sb2 = sb.toString();
        String str6 = aVar.e;
        Object[] objArr = new Object[6];
        objArr[c] = str3;
        objArr[1] = sb2;
        objArr[2] = str6;
        objArr[3] = str4;
        objArr[4] = Long.valueOf(j);
        objArr[5] = Long.valueOf(j2);
        Logger.b("Searching using web API with query = \"%s\", formattedQuery = \"%s\", types = \"%s\", market = \"%s\", offset = %d, limit = %d.", objArr);
        hashMap.put("q", sb2);
        hashMap.put(MoatAdEvent.EVENT_TYPE, str6);
        if (j2 <= 0) {
            j2 = 50;
        }
        hashMap.put("limit", String.valueOf(j2));
        if (!fax.a(str2)) {
            hashMap.put("market", str4);
        }
        if (j > 0) {
            hashMap.put("offset", String.valueOf(j));
        }
        htq htq = hts2.b;
        wmc.a(htq.a, htq.a("/v1/search", hashMap), false).a(new wlk(r20) {
            private /* synthetic */ htt a;

            {
                this.a = r2;
            }

            public final void onFailure(wlj wlj, IOException iOException) {
                Logger.e(iOException, iOException.getMessage(), new Object[0]);
                this.a.a((Throwable) iOException);
            }

            public final void onResponse(wlj wlj, wmf wmf) {
                try {
                    int i = wmf.c;
                    if (i / 100 == 2) {
                        this.a.a((Response) hts.this.a.readValue(wmf.g.d(), Response.class));
                    } else {
                        this.a.a((Throwable) new IOException(String.format(Locale.ENGLISH, "Status code %d from server does not indicate success.", new Object[]{Integer.valueOf(i)})));
                    }
                } catch (IOException e) {
                    Logger.e(e, "Error while deserializing response.", new Object[0]);
                    this.a.a((Throwable) e);
                }
            }
        });
    }
}
