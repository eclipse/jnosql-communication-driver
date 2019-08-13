/*
 *  Copyright (c) 2017 Otávio Santana and others
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   and Apache License v2.0 which accompanies this distribution.
 *   The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *   and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 *   You may elect to redistribute this code under either of these licenses.
 *
 *   Contributors:
 *
 *   Otavio Santana
 */
package org.jnosql.diana.riak.kv;


import com.basho.riak.client.core.RiakNode;
import jakarta.nosql.kv.BucketManagerFactory;

public final class RiakTestUtils {


    public static BucketManagerFactory get() {

        RiakKeyValueConfiguration riakKeyValueConfiguration = new RiakKeyValueConfiguration();
        RiakNode node = new RiakNode.Builder()
                .withRemoteAddress("localhost").build();
        riakKeyValueConfiguration.add(node);
        return riakKeyValueConfiguration.get();
    }
}