package com.spotify.music.libs.mediabrowserservice;

import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.mobile.android.service.media.browser.RootListType;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class MediaSessionCallbackResolver {
    public final RecentlyUsedComparator a = new RecentlyUsedComparator(0);
    public final rtn b;
    private final MediaSessionCompat c;

    static class RecentlyUsedComparator implements Serializable, Comparator<rtm> {
        private static final long serialVersionUID = -3812157713554950887L;

        private RecentlyUsedComparator() {
        }

        /* synthetic */ RecentlyUsedComparator(byte b) {
            this();
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            rtm rtm = (rtm) obj;
            rtm rtm2 = (rtm) obj2;
            fay.a(rtm);
            fay.a(rtm2);
            long j = rtm.e().e;
            long j2 = rtm2.e().e;
            if (j2 < j) {
                return -1;
            }
            return j2 == j ? 0 : 1;
        }
    }

    public MediaSessionCallbackResolver(MediaSessionCompat mediaSessionCompat, rtn rtn) {
        this.c = mediaSessionCompat;
        this.b = rtn;
    }

    public final Single<rtj> a(Long l) {
        ArrayList a2 = this.b.a();
        if (a2.size() > 1) {
            Collections.sort(this.b.a(), this.a);
        }
        rtm a3 = a((List<rtm>) a2, l);
        if (a3 != null) {
            return Single.b(a3.e());
        }
        StringBuilder sb = new StringBuilder("No active CallbackHandlers for action: ");
        sb.append(l);
        sb.append(" has been found");
        return Single.a(new Throwable(sb.toString()));
    }

    private static rtm a(List<rtm> list, Long l) {
        for (rtm rtm : list) {
            if (rtm.c().contains(l)) {
                return rtm;
            }
        }
        return null;
    }

    public final Single<rtj> a(String str, RootListType rootListType) {
        return Single.a((SingleOnSubscribe<T>) new SingleOnSubscribe(str, rootListType) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ RootListType f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void subscribe(SingleEmitter singleEmitter) {
                MediaSessionCallbackResolver.this.a(this.f$1, this.f$2, singleEmitter);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final String str, RootListType rootListType, final SingleEmitter singleEmitter) {
        this.b.a(str, this.c, rootListType);
        this.b.a(str, new a() {
            public final void a(rtm rtm) {
                singleEmitter.a(rtm.e());
            }

            public final void a() {
                SingleEmitter singleEmitter = singleEmitter;
                StringBuilder sb = new StringBuilder("Couldn't resolve callback handler for package name ");
                sb.append(str);
                singleEmitter.a(new Throwable(sb.toString()));
            }
        });
    }
}
