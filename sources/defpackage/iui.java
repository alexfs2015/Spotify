package defpackage;

import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item;
import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: iui reason: default package */
public final class iui {
    private final List<ho<Item, b>> a = new ArrayList();
    private int b = -1;

    public iui(List<ho<Item, b>> list) {
        for (ho hoVar : list) {
            this.a.add(ho.a(hoVar.a, new b((b) fay.a(hoVar.b))));
        }
    }

    public final boolean a() {
        while (!this.a.isEmpty()) {
            this.b = (this.b + 1) % this.a.size();
            ho hoVar = (ho) this.a.get(this.b);
            if (((b) fay.a(hoVar.b)).a == -1 || ((b) hoVar.b).a > 0) {
                if (((b) hoVar.b).a > 0) {
                    b bVar = (b) hoVar.b;
                    bVar.a--;
                }
                return true;
            } else if (((b) hoVar.b).a == 0) {
                this.a.remove(this.b);
                if (this.b > this.a.size() - 1) {
                    this.b--;
                }
            } else if (!this.a.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final Item b() {
        fay.a(this.b >= 0, (Object) "Invalid index. Did you call hasNextItemToDisplay?");
        return (Item) ((ho) this.a.get(this.b)).a;
    }
}
