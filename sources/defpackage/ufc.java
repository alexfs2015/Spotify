package defpackage;

import android.app.Activity;
import android.content.Intent;

/* renamed from: ufc reason: default package */
public interface ufc {

    /* renamed from: ufc$a */
    public interface a {

        /* renamed from: ufc$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static gnr a(gni gni) {
                return new gnr(gni) {
                    private /* synthetic */ gni a;

                    {
                        this.a = r1;
                    }

                    public final void a(Activity activity) {
                        Intent a2 = this.a.a(activity);
                        a2.addFlags(268468224);
                        activity.startActivity(a2);
                    }

                    public final void a(Activity activity, String str, boolean z) {
                        Intent a2 = this.a.a(activity, str, true);
                        a2.setFlags(268435456);
                        activity.startActivity(a2);
                    }
                };
            }
        }
    }
}
