package defpackage;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@cey
/* renamed from: dss reason: default package */
public final class dss {
    BlockingQueue<dtc> a = new ArrayBlockingQueue(100);
    public LinkedHashMap<String, String> b = new LinkedHashMap<>();
    String c;
    Context d;
    String e;
    AtomicBoolean f;
    File g;
    private ExecutorService h;
    private Map<String, dsw> i = new HashMap();

    public final dsw a(String str) {
        dsw dsw = (dsw) this.i.get(str);
        return dsw != null ? dsw : dsw.a;
    }

    /* access modifiers changed from: 0000 */
    public final Map<String, String> a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, a(str).a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final void a(Context context, String str, String str2, Map<String, String> map) {
        this.d = context;
        this.e = str;
        this.c = str2;
        this.f = new AtomicBoolean(false);
        this.f.set(((Boolean) dpn.f().a(dsp.P)).booleanValue());
        if (this.f.get()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                this.g = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.b.put((String) entry.getKey(), (String) entry.getValue());
        }
        this.h = Executors.newSingleThreadExecutor();
        this.h.execute(new dst(this));
        this.i.put("action", dsw.b);
        this.i.put("ad_format", dsw.b);
        this.i.put("e", dsw.c);
    }

    public final boolean a(dtc dtc) {
        return this.a.offer(dtc);
    }
}
