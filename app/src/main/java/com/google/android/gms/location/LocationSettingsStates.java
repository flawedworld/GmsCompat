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

package com.google.android.gms.location;

import org.microg.safeparcel.AutoSafeParcelable;

// https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates
public class LocationSettingsStates extends AutoSafeParcelable {
    @Field(1) public boolean gpsUsable;
    @Field(2) public boolean networkLocationUsable;
    @Field(3) public boolean bleUsable;
    @Field(4) public boolean gpsPresent;
    @Field(5) public boolean networkLocationPresent;
    @Field(6) public boolean blePresent;

    public static final Creator<LocationSettingsStates> CREATOR = new AutoCreator<>(LocationSettingsStates.class);
}
