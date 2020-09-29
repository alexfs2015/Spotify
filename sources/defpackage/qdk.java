package defpackage;

import com.spotify.music.features.settings.adapter.Item;
import com.spotify.music.features.settings.adapter.Item.DisableWhen;
import java.util.EnumSet;

/* renamed from: qdk reason: default package */
public final class qdk implements faz<Item> {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public final /* synthetic */ boolean apply(Object obj) {
        Item item = (Item) obj;
        boolean z = false;
        if (item == null) {
            return false;
        }
        EnumSet c2 = item.c();
        boolean contains = c2.contains(DisableWhen.d) | (this.a && c2.contains(DisableWhen.b)) | (this.c && c2.contains(DisableWhen.f)) | ((this.a || !this.b) && c2.contains(DisableWhen.e));
        if (this.d && c2.contains(DisableWhen.g)) {
            z = true;
        }
        return contains | z;
    }

    public qdk(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }
}
