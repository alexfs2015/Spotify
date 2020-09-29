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

/* renamed from: hvz reason: default package */
public final class hvz {
    private final hwe a;

    public hvz(hwe hwe) {
        this.a = hwe;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, int i, int i2, Bundle bundle, SingleEmitter singleEmitter) {
        char c;
        final String str3 = str;
        String str4 = str2;
        final SingleEmitter singleEmitter2 = singleEmitter;
        hwe hwe = this.a;
        hwe.getClass();
        singleEmitter2.a((Cancellable) new $$Lambda$D507fIho3UcOauFSl8SGC_dwMoI(hwe));
        hwe hwe2 = this.a;
        long j = (long) i;
        long j2 = (long) i2;
        AnonymousClass1 r9 = new hwf<Response>() {
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
        Bundle bundle2 = bundle != null ? bundle : new Bundle();
        String string = bundle2.getString("android.intent.extra.artist");
        String string2 = bundle2.getString("android.intent.extra.album");
        String string3 = bundle2.getString("android.intent.extra.title");
        String string4 = bundle2.getString("android.intent.extra.genre");
        String string5 = bundle2.getString("android.intent.extra.playlist");
        String string6 = bundle2.getString("android.intent.extra.focus");
        AnonymousClass1 r20 = r9;
        a aVar = new a(0);
        if ("vnd.android.cursor.item/artist".equals(string6) && !fbo.a(string)) {
            aVar.e = "track,artist";
            aVar.b = string;
            aVar.c = string4;
        } else if (!"vnd.android.cursor.item/album".equals(string6) || fbo.a(string2)) {
            String str5 = "album,artist,playlist,track";
            if ("vnd.android.cursor.item/audio".equals(string6) && !fbo.a(string3)) {
                aVar.e = str5;
                aVar.c = string4;
                aVar.b = string;
                aVar.d = string3;
            } else if ("vnd.android.cursor.item/genre".equals(string6) && !fbo.a(string4)) {
                aVar.e = TrackData.TYPE_TRACK;
                aVar.c = string4;
            } else if (!"vnd.android.cursor.item/playlist".equals(string6) || fbo.a(string5)) {
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
        if (!fbo.a(aVar.d)) {
            if (aVar.d.contains("*")) {
                sb.append(aVar.d);
            } else {
                sb.append(String.format(Locale.US, "\"%s\"", new Object[]{aVar.d}));
            }
        }
        if (!fbo.a(aVar.b)) {
            if (sb.length() != 0) {
                sb.append(' ');
            }
            sb.append(String.format(Locale.US, "artist:\"%s\"", new Object[]{aVar.b}));
        }
        if (!fbo.a(aVar.a)) {
            if (sb.length() != 0) {
                sb.append(' ');
            }
            sb.append(String.format(Locale.US, "album:\"%s\"", new Object[]{aVar.a}));
        }
        if (!fbo.a(aVar.c)) {
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
        if (!fbo.a(str2)) {
            hashMap.put("market", str4);
        }
        if (j > 0) {
            hashMap.put("offset", String.valueOf(j));
        }
        hwc hwc = hwe2.b;
        xai.a(hwc.a, hwc.a("/v1/search", hashMap), false).a(new wzq(r20) {
            private /* synthetic */ hwf a;

            {
                this.a = r2;
            }

            public final void onFailure(wzp wzp, IOException iOException) {
                Logger.e(iOException, iOException.getMessage(), new Object[0]);
                this.a.a((Throwable) iOException);
            }

            public final void onResponse(wzp wzp, xal xal) {
                try {
                    int i = xal.c;
                    if (i / 100 == 2) {
                        this.a.a((Response) hwe.this.a.readValue(xal.g.d(), Response.class));
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

    public final Single<WebApiSearchResults> a(String str, String str2, int i, int i2, Bundle bundle) {
        $$Lambda$hvz$KBbkseB3QNgAfG10ycQPNY8mo r0 = new $$Lambda$hvz$KBbkseB3QNgAfG10ycQPNY8mo(this, str, str2, i, i2, bundle);
        return Single.a((SingleOnSubscribe<T>) r0);
    }
}
