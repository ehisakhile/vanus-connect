// Copyright 2022 Linkall Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.linkall.connector.mongodb;

import com.linkall.vance.core.Adapter2;
import io.cloudevents.CloudEvent;

public class MongoDBAdapter implements Adapter2 {
    @Override
    public CloudEvent adapt(Object key, Object val) {
        return MongoChangeEvent.parse((String) key, (String) val).getCloudEvent();
    }
}

