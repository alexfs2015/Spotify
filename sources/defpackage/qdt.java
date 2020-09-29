package defpackage;

import com.spotify.music.features.settings.adapter.Item;
import com.spotify.music.features.settings.adapter.Item.For;

/* renamed from: qdt reason: default package */
public final class qdt implements faz<Item> {
    public final /* synthetic */ boolean apply(Object obj) {
        For a = ((Item) obj).a();
        boolean z = true;
        boolean z2 = a == For.b;
        if (a != For.a) {
            z = false;
        }
        return z2 | z;
    }
}
