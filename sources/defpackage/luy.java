package defpackage;

import android.os.Bundle;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

/* renamed from: luy reason: default package */
public abstract class luy {

    /* renamed from: luy$a */
    public interface a {
        a a(int i);

        a a(String str);

        a a(List<byte[]> list);

        luy a();
    }

    public static luy a(Bundle bundle) {
        int i = bundle.getInt("cards_state_length", 0);
        ArrayList a2 = Lists.a();
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder sb = new StringBuilder("cards_state_item");
            sb.append(i2);
            a2.add(bundle.getByteArray(sb.toString()));
        }
        return new defpackage.luw.a().a((List<byte[]>) a2).a(bundle.getInt("cards_count", 0)).a(bundle.getString("current_card_id")).a();
    }

    public abstract String a();

    public abstract int b();

    public abstract List<byte[]> c();
}
