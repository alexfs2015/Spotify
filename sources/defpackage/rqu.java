package defpackage;

import android.content.Intent;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: rqu reason: default package */
public final class rqu {
    public static final ImmutableList<String> a;
    public static final ImmutableList<String> b;
    public static final ImmutableList<String> c = ImmutableList.a("publish_actions");
    public final a d;
    private final CountDownLatch e = new CountDownLatch(1);

    static {
        String str = "public_profile";
        a = ImmutableList.a(str);
        b = ImmutableList.a(str, "email", "user_birthday", "user_friends");
    }

    rqu() {
        CountDownLatch countDownLatch = this.e;
        countDownLatch.getClass();
        this.d = new $$Lambda$E0ybQatnyTnVU20kGFZdjkyxBMg(countDownLatch);
    }

    public final ank a() {
        try {
            if (!this.e.await(10, TimeUnit.SECONDS)) {
                Assertion.b("Facebook SDK failed to initialize after 10s.");
            }
        } catch (InterruptedException unused) {
        }
        return ank.b();
    }

    public static boolean a(List<String> list) {
        Logger.b("Checking if active session contains permissions:%s", list.toString());
        aju a2 = aju.a();
        return a2 != null && a2.b.containsAll(list);
    }

    public static boolean a(Intent intent) {
        return alo.a(intent) != null;
    }

    public static String b() {
        return aju.a().e;
    }
}
