package com.bmwgroup.connected.car.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public enum ApplicationManager {
    INSTANCE;
    
    public String mAppId;
    public act mApplication;
    public final BroadcastReceiver mDisconnectReceiver;
    public String mDisconnectReceiverAction;

    public static byte[] a(Context context, int i) {
        Resources resources = context.getResources();
        if (resources == null) {
            return null;
        }
        InputStream openRawResource = resources.openRawResource(i);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            for (int read = openRawResource.read(); read != -1; read = openRawResource.read()) {
                byteArrayOutputStream.write(read);
            }
            openRawResource.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        if (resources != null) {
            return resources.getString(i);
        }
        return null;
    }
}
