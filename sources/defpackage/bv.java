package defpackage;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: bv reason: default package */
public final class bv {
    public TextClassifier a;
    private TextView b;

    public bv(TextView textView) {
        this.b = (TextView) hr.a(textView);
    }

    public final TextClassifier a() {
        TextClassifier textClassifier = this.a;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.b.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            textClassifier = TextClassifier.NO_OP;
        }
        return textClassifier;
    }
}
