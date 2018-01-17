/*
 * Copyright 2016 OpenMarket Ltd
 * Copyright 2017 Vector Creations Ltd
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
package org.matrix.androidsdk.rest.model;

/**
 * Class representing a room member: a user with membership information.
 */
public class RoomThirdPartyInvite implements java.io.Serializable {

    /**
     * The user display name as provided by the home sever.
     */
    public String display_name;

    /**
     * The token generated by the identity server.
     */
    public String token;

    // the event used to build this class
    private String mOriginalEventId = null;

    /**
     * @return a RoomThirdPartyInvite deep copy.
     */
    public RoomThirdPartyInvite deepCopy() {
        RoomThirdPartyInvite copy = new RoomThirdPartyInvite();
        copy.display_name = display_name;
        copy.token = token;
        copy.mOriginalEventId = mOriginalEventId;
        return copy;
    }

    /**
     * Set the original used to create this class
     *
     * @param eventId the event id
     */
    public void setOriginalEventid(String eventId) {
        mOriginalEventId = eventId;
    }

    /**
     * Provides the even used to create this class
     *
     * @return the event uses to create this class
     */
    public String getOriginalEventId() {
        return mOriginalEventId;
    }
}