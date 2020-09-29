package defpackage;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;

/* renamed from: qxw reason: default package */
public final class qxw {
    private final ImmutableMap<MusicPageId, fbd<qul>> a;
    private final fbd<qul> b;
    private final qvk c;
    private final qvl d;

    public qxw(quu quu, qvk qvk, qvl qvl) {
        this.c = qvk;
        this.d = qvl;
        MusicPageId musicPageId = MusicPageId.PLAYLISTS;
        quu.getClass();
        fbd a2 = Suppliers.a((fbd<T>) new $$Lambda$WKvIl0gfPNKxeuOzLs3iPspLV5M<T>(quu));
        MusicPageId musicPageId2 = MusicPageId.ALBUMS;
        quu.getClass();
        fbd a3 = Suppliers.a((fbd<T>) new $$Lambda$VkB9Z8XnPYFuaKS7xajqxpO2ab0<T>(quu));
        MusicPageId musicPageId3 = MusicPageId.ARTISTS;
        quu.getClass();
        fbd a4 = Suppliers.a((fbd<T>) new $$Lambda$SY8uR6TDqS1nfc42r5zgwijKxMQ<T>(quu));
        MusicPageId musicPageId4 = MusicPageId.DOWNLOADS;
        quu.getClass();
        fbd a5 = Suppliers.a((fbd<T>) new $$Lambda$c34ekv5psl3dhXowJ7Ueg5zfpvE<T>(quu));
        MusicPageId musicPageId5 = MusicPageId.SONGS;
        quu.getClass();
        this.a = ImmutableMap.a(musicPageId, a2, musicPageId2, a3, musicPageId3, a4, musicPageId4, a5, musicPageId5, Suppliers.a((fbd<T>) new $$Lambda$LBI6ONGhCnNpVhe0FpVHkyGLvo<T>(quu)));
        this.b = Suppliers.a((fbd<T>) new $$Lambda$qxw$P6lZH23zen2fSnrqfnjGOjvy8nQ<T>(this, quu));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qul a(quu quu) {
        String ai = this.d.ai();
        a g = ImmutableList.g();
        quy a2 = quu.a.a(jst.a(ai).k());
        g.c(a2);
        return qup.a(qup.a(qup.b(qup.a(a2.a(), qup.a(quu.b.a(ai)))), qup.a(g.a())));
    }

    public final qul a() {
        MusicPageId ah = this.c.ah();
        fbd fbd = (fbd) this.a.get(ah);
        if (fbd != null) {
            return (qul) fbd.get();
        }
        if (ah == MusicPageId.FOLDER) {
            return (qul) this.b.get();
        }
        StringBuilder sb = new StringBuilder("No data source for page id ");
        sb.append(ah);
        throw new AssertionError(sb.toString());
    }
}
