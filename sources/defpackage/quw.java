package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: quw reason: default package */
public final class quw implements qus {
    private final hcw a;
    private int b;
    private int c;
    private final TreeMap<Integer, String> d = new TreeMap<>();

    public quw(hcw hcw) {
        this.a = hcw;
    }

    public final MusicItem a(MusicItem musicItem, int i) {
        int i2 = this.b;
        boolean z = false;
        if (i < i2) {
            this.b = i;
            this.c = Math.max(0, Math.min(this.c, this.b + 16));
            a();
        } else if (i >= this.c) {
            this.c = i + 1;
            this.b = Math.max(i2, this.c - 16);
            a();
        }
        if (musicItem.a() == Type.PLAYLIST) {
            z = true;
        }
        if (z) {
            String j = musicItem.j();
            String str = (String) this.d.get(Integer.valueOf(i));
            if (str != null && !str.equals(j)) {
                this.a.b(str);
            }
            if (str == null || !str.equals(j)) {
                this.d.put(Integer.valueOf(i), musicItem.j());
                this.a.a(j);
            }
        }
        return musicItem;
    }

    private void a() {
        fcl.a((Iterable<T>) this.d.entrySet(), (faz<? super T>) new $$Lambda$quw$0yCyccqLpOOSzlceTOa1DoSueck<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(Entry entry) {
        if (((Integer) entry.getKey()).intValue() >= this.b && ((Integer) entry.getKey()).intValue() <= this.c) {
            return false;
        }
        this.a.b((String) entry.getValue());
        return true;
    }
}
