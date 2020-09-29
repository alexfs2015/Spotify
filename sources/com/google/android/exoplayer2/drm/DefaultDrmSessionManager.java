package com.google.android.exoplayer2.drm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException;
import com.google.android.exoplayer2.drm.DrmSession.DrmSessionException;
import defpackage.asw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class DefaultDrmSessionManager<T extends asw> implements c<T>, asu<T> {
    final List<asq<T>> a;
    volatile b b;
    private final UUID c;
    private final asx<T> d;
    private final ata e;
    private final HashMap<String, String> f;
    private final bdr<asr> g;
    private final boolean h;
    private final int i;
    private final List<asq<T>> j;
    private Looper k;
    private int l;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            StringBuilder sb = new StringBuilder("Media does not support uuid: ");
            sb.append(uuid);
            super(sb.toString());
        }

        /* synthetic */ MissingSchemeDataException(UUID uuid, byte b) {
            this(uuid);
        }
    }

    class a implements defpackage.asx.b<T> {
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
            for (asq asq : DefaultDrmSessionManager.this.a) {
                if (Arrays.equals(asq.i, bArr)) {
                    asq.a(message.what);
                    return;
                }
            }
        }
    }

    private DefaultDrmSessionManager(UUID uuid, asx<T> asx, ata ata, HashMap<String, String> hashMap) {
        this(uuid, asx, ata, hashMap, false, 3);
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, asx<T> asx, ata ata, HashMap<String, String> hashMap, Handler handler, asr asr) {
        this(uuid, asx, ata, hashMap);
        if (handler != null && asr != null) {
            a(handler, asr);
        }
    }

    private DefaultDrmSessionManager(UUID uuid, asx<T> asx, ata ata, HashMap<String, String> hashMap, boolean z, int i2) {
        bdl.a(uuid);
        bdl.a(asx);
        bdl.a(!aqm.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.c = uuid;
        this.d = asx;
        this.e = ata;
        this.f = hashMap;
        this.g = new bdr<>();
        this.h = false;
        this.i = 3;
        this.l = 0;
        this.a = new ArrayList();
        this.j = new ArrayList();
        asx.a((defpackage.asx.b<? super T>) new a<Object>(this, 0));
    }

    private static List<defpackage.ast.a> a(ast ast, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(ast.c);
        for (int i2 = 0; i2 < ast.c; i2++) {
            defpackage.ast.a aVar = ast.a[i2];
            if ((aVar.a(uuid) || (aqm.c.equals(uuid) && aVar.a(aqm.b))) && (aVar.c != null || z)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public DrmSession<T> a(Looper looper, ast ast) {
        asq asq;
        Looper looper2 = looper;
        Looper looper3 = this.k;
        bdl.b(looper3 == null || looper3 == looper2);
        if (this.a.isEmpty()) {
            this.k = looper2;
            if (this.b == null) {
                this.b = new b<>(looper);
            }
        }
        List a2 = a(ast, this.c, false);
        if (a2.isEmpty()) {
            MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.c, 0);
            this.g.a((defpackage.bdr.a<T>) new defpackage.bdr.a() {
                public final void sendTo(Object obj) {
                    ((asr) obj).a(MissingSchemeDataException.this);
                }
            });
            return new asv(new DrmSessionException(missingSchemeDataException));
        }
        asq asq2 = null;
        if (this.h) {
            Iterator it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                asq asq3 = (asq) it.next();
                if (ben.a((Object) asq3.a, (Object) a2)) {
                    asq2 = asq3;
                    break;
                }
            }
        } else if (!this.a.isEmpty()) {
            asq2 = (asq) this.a.get(0);
        }
        if (asq2 == null) {
            asq = new asq(this.c, this.d, this, a2, 0, null, this.f, this.e, looper, this.g, this.i);
            this.a.add(asq);
        } else {
            asq = asq2;
        }
        asq.a();
        return asq;
    }

    public final String a(String str) {
        return this.d.a(str);
    }

    public final void a() {
        for (asq d2 : this.j) {
            d2.d();
        }
        this.j.clear();
    }

    public final void a(Handler handler, asr asr) {
        this.g.a(handler, asr);
    }

    public final void a(asq<T> asq) {
        this.j.add(asq);
        if (this.j.size() == 1) {
            asq.c();
        }
    }

    public final void a(DrmSession<T> drmSession) {
        if (!(drmSession instanceof asv)) {
            asq asq = (asq) drmSession;
            if (asq.b()) {
                this.a.remove(asq);
                if (this.j.size() > 1 && this.j.get(0) == asq) {
                    ((asq) this.j.get(1)).c();
                }
                this.j.remove(asq);
            }
        }
    }

    public final void a(Exception exc) {
        for (asq a2 : this.j) {
            a2.a(exc);
        }
        this.j.clear();
    }

    public final void a(String str, String str2) {
        this.d.a(str, str2);
    }

    public final boolean a(ast ast) {
        if (a(ast, this.c, true).isEmpty()) {
            if (ast.c != 1 || !ast.a[0].a(aqm.b)) {
                return false;
            }
            StringBuilder sb = new StringBuilder("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(this.c);
            bdu.c("DefaultDrmSessionMgr", sb.toString());
        }
        String str = ast.b;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return (!"cbc1".equals(str) && !"cbcs".equals(str) && !"cens".equals(str)) || ben.a >= 25;
    }
}
