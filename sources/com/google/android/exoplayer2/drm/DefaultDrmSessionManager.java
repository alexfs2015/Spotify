package com.google.android.exoplayer2.drm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException;
import com.google.android.exoplayer2.drm.DrmSession.DrmSessionException;
import defpackage.asf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class DefaultDrmSessionManager<T extends asf> implements c<T>, asd<T> {
    final List<arz<T>> a;
    volatile b b;
    private final UUID c;
    private final asg<T> d;
    private final asj e;
    private final HashMap<String, String> f;
    private final bda<asa> g;
    private final boolean h;
    private final int i;
    private final List<arz<T>> j;
    private Looper k;
    private int l;

    public static final class MissingSchemeDataException extends Exception {
        /* synthetic */ MissingSchemeDataException(UUID uuid, byte b) {
            this(uuid);
        }

        private MissingSchemeDataException(UUID uuid) {
            StringBuilder sb = new StringBuilder("Media does not support uuid: ");
            sb.append(uuid);
            super(sb.toString());
        }
    }

    class a implements defpackage.asg.b<T> {
        private a() {
        }

        /* synthetic */ a(DefaultDrmSessionManager defaultDrmSessionManager, byte b) {
            this();
        }

        public final void a(byte[] bArr, int i) {
            DefaultDrmSessionManager.this.b.obtainMessage(i, bArr).sendToTarget();
        }
    }

    class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            for (arz arz : DefaultDrmSessionManager.this.a) {
                if (Arrays.equals(arz.i, bArr)) {
                    arz.a(message.what);
                    return;
                }
            }
        }
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, asg<T> asg, asj asj, HashMap<String, String> hashMap, Handler handler, asa asa) {
        this(uuid, asg, asj, hashMap);
        if (handler != null && asa != null) {
            a(handler, asa);
        }
    }

    private DefaultDrmSessionManager(UUID uuid, asg<T> asg, asj asj, HashMap<String, String> hashMap) {
        this(uuid, asg, asj, hashMap, false, 3);
    }

    private DefaultDrmSessionManager(UUID uuid, asg<T> asg, asj asj, HashMap<String, String> hashMap, boolean z, int i2) {
        bcu.a(uuid);
        bcu.a(asg);
        bcu.a(!apv.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.c = uuid;
        this.d = asg;
        this.e = asj;
        this.f = hashMap;
        this.g = new bda<>();
        this.h = false;
        this.i = 3;
        this.l = 0;
        this.a = new ArrayList();
        this.j = new ArrayList();
        asg.a((defpackage.asg.b<? super T>) new a<Object>(this, 0));
    }

    public final void a(Handler handler, asa asa) {
        this.g.a(handler, asa);
    }

    public final String a(String str) {
        return this.d.a(str);
    }

    public final void a(String str, String str2) {
        this.d.a(str, str2);
    }

    public final boolean a(asc asc) {
        if (a(asc, this.c, true).isEmpty()) {
            if (asc.c != 1 || !asc.a[0].a(apv.b)) {
                return false;
            }
            StringBuilder sb = new StringBuilder("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(this.c);
            bdd.c("DefaultDrmSessionMgr", sb.toString());
        }
        String str = asc.b;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if (("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) && bdw.a < 25) {
            return false;
        }
        return true;
    }

    public DrmSession<T> a(Looper looper, asc asc) {
        arz arz;
        Looper looper2 = looper;
        Looper looper3 = this.k;
        bcu.b(looper3 == null || looper3 == looper2);
        if (this.a.isEmpty()) {
            this.k = looper2;
            if (this.b == null) {
                this.b = new b<>(looper);
            }
        }
        List a2 = a(asc, this.c, false);
        if (a2.isEmpty()) {
            MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.c, 0);
            this.g.a((defpackage.bda.a<T>) new defpackage.bda.a() {
                public final void sendTo(Object obj) {
                    ((asa) obj).a(MissingSchemeDataException.this);
                }
            });
            return new ase(new DrmSessionException(missingSchemeDataException));
        }
        arz arz2 = null;
        if (this.h) {
            Iterator it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                arz arz3 = (arz) it.next();
                if (bdw.a((Object) arz3.a, (Object) a2)) {
                    arz2 = arz3;
                    break;
                }
            }
        } else if (!this.a.isEmpty()) {
            arz2 = (arz) this.a.get(0);
        }
        if (arz2 == null) {
            arz = new arz(this.c, this.d, this, a2, 0, null, this.f, this.e, looper, this.g, this.i);
            this.a.add(arz);
        } else {
            arz = arz2;
        }
        arz.a();
        return arz;
    }

    public final void a(DrmSession<T> drmSession) {
        if (!(drmSession instanceof ase)) {
            arz arz = (arz) drmSession;
            if (arz.b()) {
                this.a.remove(arz);
                if (this.j.size() > 1 && this.j.get(0) == arz) {
                    ((arz) this.j.get(1)).c();
                }
                this.j.remove(arz);
            }
        }
    }

    public final void a(arz<T> arz) {
        this.j.add(arz);
        if (this.j.size() == 1) {
            arz.c();
        }
    }

    public final void a() {
        for (arz d2 : this.j) {
            d2.d();
        }
        this.j.clear();
    }

    public final void a(Exception exc) {
        for (arz a2 : this.j) {
            a2.a(exc);
        }
        this.j.clear();
    }

    private static List<defpackage.asc.a> a(asc asc, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(asc.c);
        for (int i2 = 0; i2 < asc.c; i2++) {
            defpackage.asc.a aVar = asc.a[i2];
            if ((aVar.a(uuid) || (apv.c.equals(uuid) && aVar.a(apv.b))) && (aVar.c != null || z)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
