package defpackage;

import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.music.libs.mediabrowserservice.RecentlyUsedComparator;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: sdb reason: default package */
public final class sdb {
    final RecentlyUsedComparator a;
    final scx b;
    private final MediaSessionCompat c;

    public sdb(MediaSessionCompat mediaSessionCompat, scx scx, RecentlyUsedComparator recentlyUsedComparator) {
        this.c = mediaSessionCompat;
        this.b = scx;
        this.a = recentlyUsedComparator;
    }

    private static scw a(List<scw> list, Long l) {
        for (scw scw : list) {
            if (scw.c().contains(l)) {
                return scw;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final String str, String str2, final SingleEmitter singleEmitter) {
        this.b.a(str, this.c, str2);
        this.b.a(str, new a() {
            public final void a() {
                SingleEmitter singleEmitter = singleEmitter;
                StringBuilder sb = new StringBuilder("Couldn't resolve callback handler for package name ");
                sb.append(str);
                singleEmitter.a(new Throwable(sb.toString()));
            }

            public final void a(scw scw) {
                singleEmitter.a(scw.e());
            }
        });
    }

    public final Single<scq> a(Long l) {
        ArrayList a2 = this.b.a();
        if (a2.size() > 1) {
            Collections.sort(this.b.a(), this.a);
        }
        scw a3 = a((List<scw>) a2, l);
        if (a3 != null) {
            return Single.b(a3.e());
        }
        StringBuilder sb = new StringBuilder("No active CallbackHandlers for action: ");
        sb.append(l);
        sb.append(" has been found");
        return Single.a(new Throwable(sb.toString()));
    }

    public final Single<scq> a(String str, String str2) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$sdb$9J6jlghlEtKC7oHytEolz35_dgg<T>(this, str, str2));
    }
}
