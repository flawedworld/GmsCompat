/*
 * Copyright (C) 2013-2017 microG Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.gms.location.internal;

import android.app.PendingIntent;

import com.google.android.gms.location.ILocationCallback;
import com.google.android.gms.location.ILocationListener;

import org.microg.safeparcel.AutoSafeParcelable;

public class LocationRequestUpdateData extends AutoSafeParcelable {

    public static final int OP_REQUEST_UPDATES = 1;
    public static final int OP_REMOVE_UPDATES = 2;

    @Field(1) public int opCode;
    @Field(2) public LocationRequestInternal request;
    @Field(3) public ILocationListener listener;
    @Field(4) public PendingIntent pendingIntent;
    @Field(5) public ILocationCallback callback;
    @Field(6) public IFusedLocationProviderCallback fusedLocationProviderCallback;
    @Field(8) public String appOpsReasonMessage;

    public static final Creator<LocationRequestUpdateData> CREATOR = new AutoCreator<>(LocationRequestUpdateData.class);
}
