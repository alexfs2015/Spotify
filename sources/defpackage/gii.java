package defpackage;

import android.text.TextUtils;
import com.google.common.collect.Lists;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gii reason: default package */
public final class gii {
    public static List<gih> a(URI uri, Charset charset) {
        ArrayList a = Lists.a();
        String query = uri.getQuery();
        if (!TextUtils.isEmpty(query)) {
            for (String split : query.split("&")) {
                String[] split2 = split.split("=");
                String str = "";
                String trim = split2.length > 0 ? split2[0].trim() : str;
                if (split2.length > 1) {
                    str = split2[1].trim();
                }
                if (!TextUtils.isEmpty(trim)) {
                    a.add(new gih(gbm.b(trim, charset), gbm.b(str, charset)));
                }
            }
        }
        return a;
    }
}
