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

/* renamed from: jcb reason: default package */
public final class jcb implements jca {
    private final List<jdz> a;
    private final jcl b;
    private final jdy c;
    private final jdj d;
    private final Flowable<PlayerState> e;
    private final jbw f;
    private final kf g;
    private final jac h;

    public jcb(kf kfVar, List<jdz> list, jcl jcl, jdy jdy, jdj jdj, Flowable<PlayerState> flowable, jbw jbw, jac jac) {
        this.a = (List) fbp.a(list);
        this.b = (jcl) fbp.a(jcl);
        this.c = (jdy) fbp.a(jdy);
        this.d = (jdj) fbp.a(jdj);
        this.e = (Flowable) fbp.a(flowable);
        this.f = (jbw) fbp.a(jbw);
        this.g = kfVar;
        this.h = jac;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(jew jew, jdz jdz, Optional optional) {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        String a2 = BaseEncoding.d().a().a(wrap.array());
        jva a3 = jva.a(jew.a());
        String b2 = jew.b();
        Map d2 = jew.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("si", a2);
        boolean z = false;
        if (optional.b() && ((PlayerState) optional.c()).track() != null && !((Map) fbp.a(((PlayerState) optional.c()).track().metadata())).containsKey("is_queued")) {
            z = true;
        }
        if (z && !fbo.a(b2)) {
            linkedHashMap.put("context", b2);
        }
        if (d2 != null) {
            for (Entry entry : d2.entrySet()) {
                if (!fbo.a((String) entry.getKey()) && !fbo.a((String) entry.getValue()) && !linkedHashMap.containsKey(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        Builder buildUpon = Uri.parse((String) fbp.a(a3.j())).buildUpon();
        for (Entry entry2 : linkedHashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        jew jew2 = jew;
        jbz jbz = new jbz(jew, a2, buildUpon.build().toString(), a3);
        jac jac = this.h;
        PlayerState playerState = (PlayerState) optional.d();
        String sso = jac.b.toString();
        if (jew.c() != null) {
            sso = jew.c();
        }
        ShareEventLogger shareEventLogger = new ShareEventLogger((String) fbp.a(sso), jew.a(), jew.b(), playerState, jac.a);
        jdj jdj = this.d;
        kf kfVar = this.g;
        jcu jcu = (jcu) jdj.a.get(Integer.valueOf(jdz.a()));
        if (jcu != null) {
            return jcu.a(kfVar, jdz, jbz, shareEventLogger, 0);
        }
        StringBuilder sb = new StringBuilder("Perform share to destination not yet implemented for ");
        sb.append(jdj.b.getString(jdz.b()));
        return Completable.a((Throwable) new UnsupportedOperationException(sb.toString()));
    }

    public final Completable a(jdz jdz, jew jew) {
        return this.e.a(0).f($$Lambda$a9WrEozlR4ymmIt25PNEK9Owe3M.INSTANCE).a(1, TimeUnit.SECONDS).a(Single.b(Optional.e())).e(new $$Lambda$jcb$pzztoETkIeHnEXdQMtnMPm1YTk(this, jew, jdz));
    }

    public final List<jdz> a() {
        ArrayList arrayList = new ArrayList();
        for (jdz jdz : this.a) {
            jcl jcl = this.b;
            jcd jcd = (jcd) jcl.a.get(Integer.valueOf(jdz.a()));
            if (jcd != null ? jcd.a(jdz) : jcl.b.a(jdz)) {
                jdu jdu = (jdu) this.c.a.get(Integer.valueOf(jdz.a()));
                if (jdu != null ? jdu.a() : true) {
                    arrayList.add(jdz);
                }
            }
        }
        return arrayList;
    }
}
