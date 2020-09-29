package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.spotify.music.R;

/* renamed from: gmb reason: default package */
public final class gmb {
    public final Context a;
    public final a b;
    private final fss c;

    /* renamed from: gmb$a */
    public interface a {

        /* renamed from: gmb$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static String $default$a(a _this, Context context) {
                return context.getString(R.string.error_dialog_body_generic_error);
            }

            public static String $default$b(a _this, Context context) {
                return context.getString(R.string.error_dialog_title_invalid_phone_number);
            }

            public static String $default$c(a _this, Context context) {
                return context.getString(R.string.error_dialog_body_invalid_phone_number);
            }

            public static String $default$a(a _this, Context context, int i) {
                return context.getResources().getQuantityString(R.plurals.error_dialog_body_resend_limit, i, new Object[]{Integer.valueOf(i)});
            }

            public static String $default$d(a _this, Context context) {
                return context.getString(R.string.error_dialog_title_timeout);
            }

            public static String $default$e(a _this, Context context) {
                return context.getString(R.string.error_dialog_body_timeout);
            }

            public static String $default$f(a _this, Context context) {
                return context.getString(R.string.error_dialog_title_too_many_tries);
            }

            public static String $default$g(a _this, Context context) {
                return context.getString(R.string.error_dialog_body_too_many_tries);
            }

            public static String $default$h(a _this, Context context) {
                return context.getString(R.string.error_dialog_body_try_again_later);
            }

            public static String $default$i(a _this, Context context) {
                return context.getString(R.string.error_dialog_button_try_again);
            }

            public static String $default$j(a _this, Context context) {
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

    public gmb(fss fss, Context context, a aVar) {
        this.c = (fss) fay.a(fss);
        this.a = (Context) fay.a(context);
        this.b = (a) fay.a(aVar);
    }

    public final fsp a(Runnable runnable) {
        return a((String) null, this.b.a(this.a), this.b.i(this.a), runnable);
    }

    private fsp a(String str, String str2, String str3, String str4, OnClickListener onClickListener) {
        fsr fsr;
        if (str != null) {
            fsr = this.c.a(str, str2);
        } else {
            fsr = this.c.a(str2);
        }
        fsr a2 = fsr.a(str3, onClickListener);
        a2.e = false;
        fsp a3 = a2.a();
        a3.a();
        return a3;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, Runnable runnable2, DialogInterface dialogInterface, int i) {
        if (i == -2) {
            fay.a(runnable2);
            runnable2.run();
        } else if (i == -1) {
            runnable.run();
        } else {
            throw new AssertionError("unsupported button");
        }
    }

    public fsp a(String str, String str2, String str3, Runnable runnable) {
        return a(str, str2, str3, null, new $$Lambda$gmb$xUJjKU1HO8PCU65BYwcjwaTocOE(runnable, null));
    }
}
