package defpackage;

import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;

/* renamed from: jex reason: default package */
public abstract class jex implements jew {

    /* renamed from: jex$a */
    public interface a {
        a a(Bitmap bitmap);

        a a(Map<String, String> map);

        jex a();

        a b(String str);
    }

    public static a a(String str) {
        return new a().a(str);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract Map<String, String> d();

    public abstract Bitmap e();

    public abstract Bitmap f();

    public abstract List<String> g();
}
