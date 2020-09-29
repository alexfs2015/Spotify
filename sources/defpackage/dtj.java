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

@cfp
/* renamed from: dtj reason: default package */
public final class dtj {
    BlockingQueue<dtt> a = new ArrayBlockingQueue(100);
    public LinkedHashMap<String, String> b = new LinkedHashMap<>();
    String c;
    Context d;
    String e;
    AtomicBoolean f;
    File g;
    private ExecutorService h;
    private Map<String, dtn> i = new HashMap();

    public final dtn a(String str) {
        dtn dtn = (dtn) this.i.get(str);
        return dtn != null ? dtn : dtn.a;
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
        this.f.set(((Boolean) dqe.f().a(dtg.P)).booleanValue());
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
        this.h.execute(new dtk(this));
        this.i.put("action", dtn.b);
        this.i.put("ad_format", dtn.b);
        this.i.put("e", dtn.c);
    }

    public final boolean a(dtt dtt) {
        return this.a.offer(dtt);
    }
}
