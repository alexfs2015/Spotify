package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.google.common.base.Optional;
import com.google.common.io.BaseEncoding;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.Single;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: izp reason: default package */
public final class izp implements izo {
    private final List<jbn> a;
    private final izz b;
    private final jbm c;
    private final jax d;
    private final Flowable<PlayerState> e;
    private final izl f;
    private final ka g;
    private final ixr h;

    public izp(ka kaVar, List<jbn> list, izz izz, jbm jbm, jax jax, Flowable<PlayerState> flowable, izl izl, ixr ixr) {
        this.a = (List) fay.a(list);
        this.b = (izz) fay.a(izz);
        this.c = (jbm) fay.a(jbm);
        this.d = (jax) fay.a(jax);
        this.e = (Flowable) fay.a(flowable);
        this.f = (izl) fay.a(izl);
        this.g = kaVar;
        this.h = ixr;
    }

    public final List<jbn> a() {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (jbn jbn : this.a) {
            izz izz = this.b;
            izr izr = (izr) izz.a.get(Integer.valueOf(jbn.a()));
            if (izr != null) {
                z = izr.a(jbn);
            } else {
                z = izz.b.a(jbn);
            }
            if (z) {
                jbi jbi = (jbi) this.c.a.get(Integer.valueOf(jbn.a()));
                if (jbi != null) {
                    z2 = jbi.a();
                } else {
                    z2 = true;
                }
                if (z2) {
                    arrayList.add(jbn);
                }
            }
        }
        return arrayList;
    }

    public final Completable a(jbn jbn, jck jck) {
        return this.e.a(0).f($$Lambda$a9WrEozlR4ymmIt25PNEK9Owe3M.INSTANCE).a(1, TimeUnit.SECONDS).a(Single.b(Optional.e())).e(new $$Lambda$izp$H4WRUD7i7aAoQUsl4zEV9avG49Q(this, jck, jbn));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(jck jck, jbn jbn, Optional optional) {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        String a2 = BaseEncoding.d().a().a(wrap.array());
        jst a3 = jst.a(jck.a());
        String b2 = jck.b();
        Map d2 = jck.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("si", a2);
        boolean z = false;
        if (optional.b() && ((PlayerState) optional.c()).track() != null && !((Map) fay.a(((PlayerState) optional.c()).track().metadata())).containsKey("is_queued")) {
            z = true;
        }
        if (z && !fax.a(b2)) {
            linkedHashMap.put("context", b2);
        }
        if (d2 != null) {
            for (Entry entry : d2.entrySet()) {
                if (!fax.a((String) entry.getKey()) && !fax.a((String) entry.getValue()) && !linkedHashMap.containsKey(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        Builder buildUpon = Uri.parse((String) fay.a(a3.j())).buildUpon();
        for (Entry entry2 : linkedHashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        jck jck2 = jck;
        izq izq = new izq(jck, a2, buildUpon.build().toString(), a3);
        ixr ixr = this.h;
        PlayerState playerState = (PlayerState) optional.d();
        String sih = ixr.b.toString();
        if (jck.c() != null) {
            sih = jck.c();
        }
        ShareEventLogger shareEventLogger = new ShareEventLogger((String) fay.a(sih), jck.a(), jck.b(), playerState, ixr.a);
        jax jax = this.d;
        ka kaVar = this.g;
        jai jai = (jai) jax.a.get(Integer.valueOf(jbn.a()));
        if (jai != null) {
            return jai.a(kaVar, jbn, izq, shareEventLogger, 0);
        }
        StringBuilder sb = new StringBuilder("Perform share to destination not yet implemented for ");
        sb.append(jax.b.getString(jbn.b()));
        return Completable.a((Throwable) new UnsupportedOperationException(sb.toString()));
    }
}
