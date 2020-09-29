package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.spotify.music.R;

/* renamed from: gnq reason: default package */
public final class gnq {
    public final Context a;
    public final a b;
    private final ftm c;

    /* renamed from: gnq$a */
    public interface a {

        /* renamed from: gnq$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static String $default$a(a aVar, Context context) {
                return context.getString(R.string.error_dialog_body_generic_error);
            }

            public static String $default$a(a aVar, Context context, int i) {
                return context.getResources().getQuantityString(R.plurals.error_dialog_body_resend_limit, i, new Object[]{Integer.valueOf(i)});
            }

            public static String $default$b(a aVar, Context context) {
                return context.getString(R.string.error_dialog_title_invalid_phone_number);
            }

            public static String $default$c(a aVar, Context context) {
                return context.getString(R.string.error_dialog_body_invalid_phone_number);
            }

            public static String $default$d(a aVar, Context context) {
                return context.getString(R.string.error_dialog_title_timeout);
            }

            public static String $default$e(a aVar, Context context) {
                return context.getString(R.string.error_dialog_body_timeout);
            }

            public static String $default$f(a aVar, Context context) {
                return context.getString(R.string.error_dialog_title_too_many_tries);
            }

            public static String $default$g(a aVar, Context context) {
                return context.getString(R.string.error_dialog_body_too_many_tries);
            }

            public static String $default$h(a aVar, Context context) {
                return context.getString(R.string.error_dialog_body_try_again_later);
            }

            public static String $default$i(a aVar, Context context) {
                return context.getString(R.string.error_dialog_button_try_again);
            }

            public static String $default$j(a aVar, Context context) {
                return context.getString(R.string.error_dialog_button_ok);
            }
        }

        String a(Context context);

        String a(Context context, int i);

        String b(Context context);

        String c(Context context);

        String d(Context context);

        String e(Context context);

        String f(Context context);

        String g(Context context);

        String h(Context context);

        String i(Context context);

        String j(Context context);
    }

    public gnq(ftm ftm, Context context, a aVar) {
        this.c = (ftm) fbp.a(ftm);
        this.a = (Context) fbp.a(context);
        this.b = (a) fbp.a(aVar);
    }

    private ftj a(String str, String str2, String str3, String str4, OnClickListener onClickListener) {
        ftl a2 = (str != null ? this.c.a(str, str2) : this.c.a(str2)).a(str3, onClickListener);
        a2.e = false;
        ftj a3 = a2.a();
        a3.a();
        return a3;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, Runnable runnable2, DialogInterface dialogInterface, int i) {
        if (i == -2) {
            fbp.a(runnable2);
            runnable2.run();
        } else if (i == -1) {
            runnable.run();
        } else {
            throw new AssertionError("unsupported button");
        }
    }

    public final ftj a(Runnable runnable) {
        return a((String) null, this.b.a(this.a), this.b.i(this.a), runnable);
    }

    public ftj a(String str, String str2, String str3, Runnable runnable) {
        return a(str, str2, str3, null, new $$Lambda$gnq$_ggi1APgFwBiU8LkKnb6RWkrc(runnable, null));
    }
}
