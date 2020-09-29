package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.concurrent.CountDownLatch;

/* renamed from: ahx reason: default package */
final class ahx {
    final b a;
    final Builder b;

    /* renamed from: ahx$a */
    interface a {
        void a(boolean z);
    }

    /* renamed from: ahx$b */
    static class b {
        boolean a;
        final CountDownLatch b;

        private b() {
            this.a = false;
            this.b = new CountDownLatch(1);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public final void a(boolean z) {
            this.a = z;
            this.b.countDown();
        }
    }

    public static ahx a(Activity activity, vxx vxx, final a aVar) {
        final b bVar = new b(0);
        ain ain = new ain(activity, vxx);
        Builder builder = new Builder(activity);
        String a2 = ain.a("com.crashlytics.CrashSubmissionPromptMessage", ain.a.b);
        float f = activity.getResources().getDisplayMetrics().density;
        int i = (int) (((float) 5) * f);
        TextView textView = new TextView(activity);
        textView.setAutoLinkMask(15);
        textView.setText(a2);
        textView.setTextAppearance(activity, 16973892);
        textView.setPadding(i, i, i, i);
        textView.setFocusable(false);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setPadding((int) (((float) 14) * f), (int) (((float) 2) * f), (int) (((float) 10) * f), (int) (f * ((float) 12)));
        scrollView.addView(textView);
        builder.setView(scrollView).setTitle(ain.a("com.crashlytics.CrashSubmissionPromptTitle", ain.a.a)).setCancelable(false).setNeutralButton(ain.a("com.crashlytics.CrashSubmissionSendTitle", ain.a.c), new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                bVar.a(true);
                dialogInterface.dismiss();
            }
        });
        if (vxx.d) {
            builder.setNegativeButton(ain.a("com.crashlytics.CrashSubmissionCancelTitle", ain.a.e), new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    bVar.a(false);
                    dialogInterface.dismiss();
                }
            });
        }
        if (vxx.f) {
            builder.setPositiveButton(ain.a("com.crashlytics.CrashSubmissionAlwaysSendTitle", ain.a.g), new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    aVar.a(true);
                    bVar.a(true);
                    dialogInterface.dismiss();
                }
            });
        }
        return new ahx(builder, bVar);
    }

    private ahx(Builder builder, b bVar) {
        this.a = bVar;
        this.b = builder;
    }
}
