package com.squareup.wire;

import android.os.Parcelable;
import com.squareup.wire.Message;
import com.squareup.wire.Message.a;

public abstract class AndroidMessage<M extends Message<M, B>, B extends a<M, B>> extends Message<M, B> implements Parcelable {
}
