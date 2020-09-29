package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.concurrent.CountDownLatch;

/* renamed from: ail reason: default package */
final class ail {
    final b a;
    final Builder b;

    /* renamed from: ail$a */
    interface a {
        void a(boolean z);
    }

    /* renamed from: ail$b */
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

    private ail(Builder builder, b bVar) {
        this.a = bVar;
        this.b = builder;
    }

    public static ail a(Activity activity, wmd wmd, final a aVar) {
        final b bVar = new b(0);
        ajb ajb = new ajb(activity, wmd);
        Builder builder = new Builder(activity);
        String a2 = ajb.a("com.crashlytics.CrashSubmissionPromptMessage", ajb.a.b);
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
        builder.setView(scrollView).setTitle(ajb.a("com.crashlytics.CrashSubmissionPromptTitle", ajb.a.a)).setCancelable(false).setNeutralButton(ajb.a("com.crashlytics.CrashSubmissionSendTitle", ajb.a.c), new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                bVar.a(true);
                dialogInterface.dismiss();
            }
        });
        if (wmd.d) {
            builder.setNegativeButton(ajb.a("com.crashlytics.CrashSubmissionCancelTitle", ajb.a.e), new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    bVar.a(false);
                    dialogInterface.dismiss();
                }
            });
        }
        if (wmd.f) {
            builder.setPositiveButton(ajb.a("com.crashlytics.CrashSubmissionAlwaysSendTitle", ajb.a.g), new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    aVar.a(true);
                    bVar.a(true);
                    dialogInterface.dismiss();
                }
            });
        }
        return new ail(builder, bVar);
    }
}
