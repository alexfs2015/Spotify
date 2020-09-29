package defpackage;

import android.content.Intent;
import android.os.AsyncTask;
import java.io.IOException;

/* renamed from: jrm reason: default package */
public final class jrm extends AsyncTask<Void, Integer, Long[]> {
    private final unt a;
    private final mc b;

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Long[] lArr = (Long[]) obj;
        if (lArr[0].longValue() < 2097152) {
            this.b.a(new Intent("check_storage.settings_low.error"));
        } else if (lArr[1].longValue() < 52428800) {
            this.b.a(new Intent("check_storage.cache_low.error"));
        } else {
            this.b.a(new Intent("check_storage.diskspace.ok"));
        }
    }

    public jrm(mc mcVar, unt unt) {
        this.b = mcVar;
        this.a = unt;
    }

    private Long[] a() {
        Long[] lArr = new Long[2];
        try {
            String a2 = this.a.e.a(unt.g, (String) null);
            if (a2 != null) {
                lArr[0] = Long.valueOf(new gai(a2).b());
            } else {
                lArr[0] = Long.valueOf(Long.MAX_VALUE);
            }
        } catch (IOException unused) {
            lArr[0] = Long.valueOf(Long.MAX_VALUE);
        }
        try {
            String b2 = this.a.b();
            if (b2 != null) {
                lArr[1] = Long.valueOf(new gai(b2).b());
            } else {
                lArr[1] = Long.valueOf(Long.MAX_VALUE);
            }
        } catch (IOException unused2) {
            lArr[1] = Long.valueOf(Long.MAX_VALUE);
        }
        return lArr;
    }
}
