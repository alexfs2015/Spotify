package com.facebook.login.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.login.LoginBehavior;
import com.facebook.login.widget.LoginButton.b;

public class DeviceLoginButton extends LoginButton {

    class a extends b {
        private a() {
            super();
        }

        /* synthetic */ a(DeviceLoginButton deviceLoginButton, byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        public final any a() {
            anr a2 = anr.a();
            a2.c = DeviceLoginButton.this.b.a;
            a2.b = LoginBehavior.DEVICE_AUTH;
            DeviceLoginButton deviceLoginButton = DeviceLoginButton.this;
            a2.a = null;
            return a2;
        }
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final b e() {
        return new a(this, 0);
    }
}
