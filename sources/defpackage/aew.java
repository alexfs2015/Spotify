package defpackage;

import android.content.Intent;

/* renamed from: aew reason: default package */
public class aew extends agv implements aes {
    public final void a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#hideWaitingAnimation()");
        a(new Intent(sb.toString()));
    }

    public final void a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#setMultimediaInfoProgress(int arg0)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", i);
        a(intent);
    }

    public final void a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#setStatusBarText(java.lang.String arg0)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        a(intent);
    }

    public final void a(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#setImage(java.lang.String arg0, int arg1)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        intent.putExtra("arg1", i);
        a(intent);
    }

    public final void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#setTarget(java.lang.String arg0, java.lang.String arg1)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        intent.putExtra("arg1", str2);
        a(intent);
    }

    public final void a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#setMultimediaInfo(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        intent.putExtra("arg1", str2);
        intent.putExtra("arg2", str3);
        a(intent);
    }

    public final void a(String str, String str2, String str3, String str4, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#updateItem(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, byte[] arg4)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        intent.putExtra("arg1", str2);
        intent.putExtra("arg2", str3);
        intent.putExtra("arg3", str4);
        intent.putExtra("arg4", bArr);
        a(intent);
    }

    public final void a(String str, String str2, String str3, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#updatePlaylistItem(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, byte[] arg3, byte[] arg4, byte[] arg5, boolean arg6, boolean arg7)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        intent.putExtra("arg1", str2);
        intent.putExtra("arg2", str3);
        intent.putExtra("arg3", bArr);
        intent.putExtra("arg4", bArr2);
        intent.putExtra("arg5", bArr3);
        intent.putExtra("arg6", z);
        intent.putExtra("arg7", z2);
        a(intent);
    }

    public final void a(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#setSelectable(java.lang.String arg0, boolean arg1)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        intent.putExtra("arg1", z);
        a(intent);
    }

    public final void a(String str, String[] strArr, String[] strArr2, int[] iArr, byte[] bArr, int[] iArr2, byte[] bArr2, int[] iArr3, byte[] bArr3, boolean[] zArr, boolean[] zArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#setPlaylistItems(java.lang.String arg0, java.lang.String[] arg1, java.lang.String[] arg2, int[] arg3, byte[] arg4, int[] arg5, byte[] arg6, int[] arg7, byte[] arg8, boolean[] arg9, boolean[] arg10)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        intent.putExtra("arg1", strArr);
        intent.putExtra("arg2", strArr2);
        intent.putExtra("arg3", iArr);
        intent.putExtra("arg4", bArr);
        intent.putExtra("arg5", iArr2);
        intent.putExtra("arg6", bArr2);
        intent.putExtra("arg7", iArr3);
        intent.putExtra("arg8", bArr3);
        intent.putExtra("arg9", zArr);
        intent.putExtra("arg10", zArr2);
        a(intent);
    }

    public final void a(String str, String[] strArr, String[] strArr2, String[] strArr3, int[] iArr, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#setItems(java.lang.String arg0, java.lang.String[] arg1, java.lang.String[] arg2, java.lang.String[] arg3, int[] arg4, byte[] arg5)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        intent.putExtra("arg1", strArr);
        intent.putExtra("arg2", strArr2);
        intent.putExtra("arg3", strArr3);
        intent.putExtra("arg4", iArr);
        intent.putExtra("arg5", bArr);
        a(intent);
    }

    public final void a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#setMultimediaInfoCover(byte[] arg0)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", bArr);
        a(intent);
    }

    public final void b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#showWaitingAnimation(java.lang.String arg0, java.lang.String arg1)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        intent.putExtra("arg1", str2);
        a(intent);
    }

    public final void b(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#setEnabled(java.lang.String arg0, boolean arg1)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        intent.putExtra("arg1", z);
        a(intent);
    }

    public final void c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#setTitle(java.lang.String arg0, java.lang.String arg1)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        intent.putExtra("arg1", str2);
        a(intent);
    }

    public final void c(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#setVisible(java.lang.String arg0, boolean arg1)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        intent.putExtra("arg1", z);
        a(intent);
    }

    public final void d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#setTooltip(java.lang.String arg0, java.lang.String arg1)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        intent.putExtra("arg1", str2);
        a(intent);
    }

    public final void e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("#setText(java.lang.String arg0, java.lang.String arg1)");
        Intent intent = new Intent(sb.toString());
        intent.putExtra("arg0", str);
        intent.putExtra("arg1", str2);
        a(intent);
    }
}
